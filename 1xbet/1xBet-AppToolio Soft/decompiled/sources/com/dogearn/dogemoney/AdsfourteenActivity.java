package com.dogearn.dogemoney;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/* loaded from: classes.dex */
public class AdsfourteenActivity extends AppCompatActivity {
    private Button button;
    private TextView countdown;
    DatabaseReference databaseReference;
    private PublisherInterstitialAd mPublisherInterstitialAd;
    private int myIntValue;
    String user_id;
    DatabaseReference user_id_child;

    /* JADX WARN: Type inference failed for: r8v19, types: [com.dogearn.dogemoney.AdsfourteenActivity$1] */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_adsfourteen);
        this.button = (Button) findViewById(R.id.nextTaskThirteen);
        this.countdown = (TextView) findViewById(R.id.countDownFourteen);
        this.databaseReference = FirebaseDatabase.getInstance().getReference().child("users");
        this.user_id = FirebaseAuth.getInstance().getCurrentUser().getUid();
        this.user_id_child = this.databaseReference.child(this.user_id);
        this.mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        this.mPublisherInterstitialAd.setAdUnitId("ca-app-pub-9062980565707854/1492985196");
        this.mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        new CountDownTimer(10000L, 1000L) { // from class: com.dogearn.dogemoney.AdsfourteenActivity.1
            @Override // android.os.CountDownTimer
            public void onTick(long j) {
                AdsfourteenActivity.this.countdown.setText(" " + (j / 1000));
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                AdsfourteenActivity.this.countdown.setText("done!");
                ((Vibrator) AdsfourteenActivity.this.getSystemService("vibrator")).vibrate(200L);
            }
        }.start();
        this.button.setVisibility(4);
        this.button.postDelayed(new Runnable() { // from class: com.dogearn.dogemoney.AdsfourteenActivity.2
            @Override // java.lang.Runnable
            public void run() {
                AdsfourteenActivity.this.button.setVisibility(0);
            }
        }, 10000L);
        this.mPublisherInterstitialAd.setAdListener(new AdListener() { // from class: com.dogearn.dogemoney.AdsfourteenActivity.3
            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                AdsfourteenActivity.this.mPublisherInterstitialAd.show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(int i) {
                Toast.makeText(AdsfourteenActivity.this, "Ad failed to load", 0).show();
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLeftApplication() {
                Toast.makeText(AdsfourteenActivity.this, "You did invalid click", 0).show();
                AdsfourteenActivity.this.user_id_child.child("Invadil").setValue(Integer.valueOf(AdsfourteenActivity.this.myIntValue + 1));
            }
        });
        this.button.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.AdsfourteenActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdsfourteenActivity adsfourteenActivity = AdsfourteenActivity.this;
                adsfourteenActivity.startActivity(new Intent(adsfourteenActivity, (Class<?>) AdssixteenActivity.class));
            }
        });
    }
}
