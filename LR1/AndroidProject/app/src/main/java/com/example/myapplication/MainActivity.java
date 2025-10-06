package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button inf;
    private TextView name;
    private TextView group;
    private ImageView invis;
    private ImageView but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inf = findViewById(R.id.info);
        name = findViewById(R.id.My_Name);
        group = findViewById(R.id.Group_Num);
        invis = findViewById(R.id.visible);
        but = findViewById(R.id.butterfly);
        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getVisibility() == View.VISIBLE){
                    name.setVisibility(View.INVISIBLE);
                    group.setVisibility(View.INVISIBLE);
                } else {
                    name.setVisibility(View.VISIBLE);
                    group.setVisibility(View.VISIBLE);
                }
            }
        });
        invis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but.getVisibility() == View.VISIBLE){
                    but.setVisibility(View.INVISIBLE);
                } else {
                    but.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}



