package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import com.bytedance.sdk.openadsdk.component.reward.gbb;
import com.bytedance.sdk.openadsdk.component.reward.gm.sf;
import com.bytedance.sdk.openadsdk.component.reward.gm.vj;
import com.bytedance.sdk.openadsdk.component.reward.pcc.tmg;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.tsx;
import com.bytedance.sdk.openadsdk.core.wh.gm;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.utils.mk;
import com.bytedance.sdk.openadsdk.utils.oo;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class TTUnifyWebActivity extends TTBaseActivity implements vj {
    int gm;
    private gm kj;
    protected sf oo;
    private Context ork;
    public final String pcc;
    private final AtomicBoolean qf;
    protected boolean sf;
    protected of vj;
    private int vy;
    private final tmg.sf wh;

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean oo() {
        return true;
    }

    protected abstract sf pcc(Activity activity, Context context, of ofVar, String str, gm gmVar, String str2);

    protected abstract boolean pcc();

    public TTUnifyWebActivity() {
        this.pcc = pcc() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.gm = 1;
        this.wh = new tmg.sf();
        this.qf = new AtomicBoolean(false);
        this.vy = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lu.sf(getApplicationContext());
        if (!jr.vj()) {
            finish();
            return;
        }
        of pcc = com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(getIntent(), bundle, this);
        if (pcc == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.utils.sf.pcc(pcc);
        this.sf = com.bytedance.sdk.openadsdk.yt.vj.pcc("adapt_decor_size", 0) == 1;
        lo.pcc("BVA", "activity onCreate isAdaptDecorSize =" + this.sf);
        pcc.rnn(String.valueOf(hashCode()));
        this.gm = pcc.ial();
        this.vj = pcc;
        pcc(pcc, bundle);
        if (bundle != null) {
            if (pcc.kun()) {
                this.qf.set(true);
            }
            ork.pcc(pcc, "activity_recreate", pcc.vj(), "activity_recreate", null);
        }
        try {
            gm();
        } catch (Throwable th) {
            lo.pcc("TTUnifyWebActivity", "onCreate: ", th);
            ork.pcc(pcc, "show_ad_fail", this.pcc, "init_view_crash");
            finish();
        }
    }

    private void pcc(of ofVar, Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            r1 = intent.getIntExtra("orientation_angle", 0) == 3;
            ofVar.pcc(intent.getLongExtra("start_show_time", 0L));
        }
        this.ork = lu.pcc();
        gm gmVar = new gm(this);
        this.kj = gmVar;
        sf pcc = pcc(this, this.ork, ofVar, this.pcc, gmVar, this.mu);
        this.oo = pcc;
        pcc.gm(bundle);
        atb.pcc().vj();
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.oo, intent, bundle);
        this.oo.sf = r1;
        this.oo.pcc(bundle);
    }

    protected void gm() {
        setContentView(this.kj);
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        if (this.vj != null) {
            if (this.pq && !this.vj.evs() && !TextUtils.isEmpty(of.pcc(this, this.vj))) {
                finish();
            }
            if (this.vj.evs()) {
                this.vj.jr(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.vj
    public void pcc(Bundle bundle) {
        if (bundle != null) {
            this.mu = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.mu = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.mu = "";
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.pcc(z);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        lo.pcc("BVA", "onStart mMetaIndex =" + this.vy + " this =" + this);
        if (this.vy >= 0) {
            atb.pcc().gm(this.vy);
            this.vy = -1;
        }
        if (this.oo != null) {
            oo.pcc(this, this.vj);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        lo.pcc("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.oo == null) {
            return;
        }
        this.wh.pcc(this, this.gm, this.vj.zx(), this.sf);
        this.oo.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        lo.pcc("BVA", "onPause ".concat(String.valueOf(this)));
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.wh();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.qf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        lo.pcc("BVA", "onDestroy ".concat(String.valueOf(this)));
        sf sfVar = this.oo;
        if (sfVar == null) {
            return;
        }
        sfVar.kj();
        AdSlot gqd = this.vj.gqd();
        if (!this.oo.jr() && gqd != null && TextUtils.isEmpty(gqd.getBidAdm()) && !this.vj.duh()) {
            jr.sf().post(new gbb(pcc(), gqd));
        }
        this.wh.pcc(this);
        tsx.pcc().pcc(String.valueOf(hashCode()));
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        sf sfVar = this.oo;
        if (sfVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        sfVar.sf(bundle);
        if (!TextUtils.isEmpty(this.mu)) {
            bundle.putString("single_process_listener_key", this.mu);
        }
        int pcc = this.vj != null ? atb.pcc().pcc(this.vj) : -1;
        this.vy = pcc;
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.oo, bundle, pcc);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (mk.wh()) {
            rj.sf((Activity) this);
        }
    }

    public void sf() {
        finish();
    }
}
