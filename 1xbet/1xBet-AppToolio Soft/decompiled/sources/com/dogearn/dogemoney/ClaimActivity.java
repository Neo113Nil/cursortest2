package com.dogearn.dogemoney;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ClaimActivity extends AppCompatActivity {
    private Button claim;
    private TextView textView;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_claim);
        this.textView = (TextView) findViewById(R.id.countDownclaim);
        this.claim = (Button) findViewById(R.id.claimId);
        this.claim.setOnClickListener(new View.OnClickListener() { // from class: com.dogearn.dogemoney.ClaimActivity.1
            /* JADX WARN: Type inference failed for: r11v13, types: [com.dogearn.dogemoney.ClaimActivity$1$2] */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ClaimActivity.this.claim.isClickable()) {
                    ClaimActivity claimActivity = ClaimActivity.this;
                    claimActivity.startActivity(new Intent(claimActivity, (Class<?>) FInalClaimActivity.class));
                    ClaimActivity.this.claim.setVisibility(4);
                    ClaimActivity.this.claim.postDelayed(new Runnable() { // from class: com.dogearn.dogemoney.ClaimActivity.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ClaimActivity.this.claim.setVisibility(0);
                        }
                    }, 300000L);
                    new CountDownTimer(300000L, 1000L) { // from class: com.dogearn.dogemoney.ClaimActivity.1.2
                        @Override // android.os.CountDownTimer
                        public void onTick(long j) {
                        }

                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            ((Vibrator) ClaimActivity.this.getSystemService("vibrator")).vibrate(200L);
                        }
                    }.start();
                }
                ClaimActivity.this.textView.setVisibility(4);
                ClaimActivity.this.textView.postDelayed(new Runnable() { // from class: com.dogearn.dogemoney.ClaimActivity.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ClaimActivity.this.textView.setVisibility(0);
                    }
                }, 300000L);
            }
        });
    }
}
