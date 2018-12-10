package com.example.fahri.luke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.support.v7.widget.Toolbar;

public class LimasSegiEmpat extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limas_segi_empat);

        toolbar = (Toolbar) findViewById(R.id.toolbar_limas_segi_empat);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void bt_limas_segi_empat1 (View view){

        Intent intent = new Intent(this,VLimasSegiEmpat.class);
        startActivity(intent);
    }

    public void bt_limas_segi_empat2 (View view){

        Intent intent =  new Intent(this,LPLimasSegiEmpat.class);
        startActivity(intent);
    }
}
