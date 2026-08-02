package com.dogearn.dogemoney;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
public class FInalClaimActivity extends AppCompatActivity {
    private EditText captca;
    private Button claim;
    private Button cut;
    DatabaseReference databaseReference;
    private Button eight;
    private Button five;
    private Button four;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    int myIntValue;
    private Button nine;
    private Button one;
    private Button seven;
    private Button six;
    private Button three;
    private Button two;
    String user_id;
    DatabaseReference user_id_child;
    private Button zero;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_final_claim);
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.user_id_child = this.databaseReference.child(this.user_id);
        this.captca = (EditText) findViewById(R.id.typehereID);
        this.claim = (Button) findViewById(R.id.finalClaimID);
        this.zero = (Button) findViewById(R.id.zero);
        this.one = (Button) findViewById(R.id.one);
        this.two = (Button) findViewById(R.id.two);
        this.three = (Button) findViewById(R.id.three);
        this.four = (Button) findViewById(R.id.four);
        this.five = (Button) findViewById(R.id.five);
        this.six = (Button) findViewById(R.id.six);
        this.seven = (Button) findViewById(R.id.seven);
        this.eight = (Button) findViewById(R.id.eight);
        this.nine = (Button) findViewById(R.id.nine);
        this.cut = (Button) findViewById(R.id.clearAll);
        this.myIntValue = getSharedPreferences("your_prefs", 0).getInt("your_int_key", 0);
        MobileAds.initialize(this, "ca-app-pub-7300440519666493~6502219975");
        this.mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        this.mPublisherInterstitialAd.setAdUnitId("ca-app-pub-7300440519666493/3522378008");
        this.mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        this.zero.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "0");
            }
        });
        this.one.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "1");
            }
        });
        this.two.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "2");
            }
        });
        this.three.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "3");
            }
        });
        this.four.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "4");
            }
        });
        this.five.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "5");
            }
        });
        this.six.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "6");
            }
        });
        this.seven.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "7");
            }
        });
        this.eight.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "8");
            }
        });
        this.nine.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText(((Object) FInalClaimActivity.this.captca.getText()) + "9");
            }
        });
        this.cut.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FInalClaimActivity.this.captca.setText("");
            }
        });
        this.claim.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.FInalClaimActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (FInalClaimActivity.this.captca.equals("")) {
                    FInalClaimActivity.this.claim.setVisibility(4);
                    return;
                }
                FInalClaimActivity.this.claim.setVisibility(0);
                if (FInalClaimActivity.this.mPublisherInterstitialAd.isLoaded()) {
                    Utilies.showAlertDialogue("Rewarded", "Congratulation You earn 1 points", FInalClaimActivity.this);
                    Toast.makeText(FInalClaimActivity.this, "Congratulations, you earn 1 points", 0).show();
                    SharedPreferences.Editor edit = FInalClaimActivity.this.getSharedPreferences("your_prefs", 0).edit();
                    int i = FInalClaimActivity.this.myIntValue + 2;
                    edit.putInt("your_int_key", i);
                    edit.commit();
                    FInalClaimActivity.this.user_id_child.child("scores").setValue(Integer.valueOf(i));
                    FInalClaimActivity.this.mPublisherInterstitialAd.show();
                    return;
                }
                Toast.makeText(FInalClaimActivity.this, "Please try again after few minutes", 0).show();
            }
        });
    }
}
