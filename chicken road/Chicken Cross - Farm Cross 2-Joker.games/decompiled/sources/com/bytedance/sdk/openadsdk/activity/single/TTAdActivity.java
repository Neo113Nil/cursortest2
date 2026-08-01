package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.tsx;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.utils.dax;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class TTAdActivity extends TTBaseActivity {
    private int gm = -1;
    private final AtomicBoolean oo = new AtomicBoolean(false);
    private sf pcc;
    private boolean sf;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean oo() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(Bundle bundle) {
        long longExtra;
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pcc;
        of pcc2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (bundle != null) {
            this.mu = bundle.getString("single_process_listener_key");
            this.sf = bundle.getBoolean("enable_new_arch", false);
            String str = this.mu;
        } else {
            if (intent != null) {
                this.mu = intent.getStringExtra("single_process_listener_key");
                this.sf = intent.getBooleanExtra("enable_new_arch", false);
                longExtra = intent.getLongExtra("start_show_time", SystemClock.elapsedRealtime());
                String str2 = this.mu;
                pcc = pcc(this.mu);
                com.bytedance.sdk.openadsdk.pcc.gm.sf sf = sf(this.mu);
                if (pcc == null && sf == null) {
                    String str3 = this.mu;
                }
                pcc2 = com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.jr.oo.sf) null);
                if (pcc2 != null) {
                    String str4 = this.mu;
                    finish();
                    return;
                }
                try {
                    pcc2.pcc(longExtra);
                    this.pcc = new sf(this, pcc2, this.sf);
                    if (bundle != null && pcc2.rj()) {
                        this.pcc.lu();
                    }
                    this.pcc.pcc(this, bundle, pcc, sf);
                    if (bundle != null) {
                        ork.pcc(pcc2, "activity_recreate", pcc2.vj(), "activity_recreate", null);
                    }
                    com.bytedance.sdk.openadsdk.utils.sf.pcc(pcc2);
                    return;
                } catch (Throwable th) {
                    lo.pcc("BVA", "onCreate: ", th);
                    ork.pcc(pcc2, "show_ad_fail", pcc2.vj(), "init_view_crash");
                    finish();
                    return;
                }
            }
            String str5 = this.mu;
        }
        longExtra = 0;
        pcc = pcc(this.mu);
        com.bytedance.sdk.openadsdk.pcc.gm.sf sf2 = sf(this.mu);
        if (pcc == null) {
            String str32 = this.mu;
        }
        pcc2 = com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(getIntent(), bundle, (com.bytedance.sdk.openadsdk.core.jr.oo.sf) null);
        if (pcc2 != null) {
        }
    }

    public com.bytedance.sdk.openadsdk.pcc.vj.pcc pcc(String str) {
        if (this.sf) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (com.bytedance.sdk.openadsdk.pcc.vj.pcc) atb.pcc().pcc(str, com.bytedance.sdk.openadsdk.pcc.vj.pcc.class);
        }
        return atb.pcc().sf();
    }

    public com.bytedance.sdk.openadsdk.pcc.gm.sf sf(String str) {
        if (this.sf) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (com.bytedance.sdk.openadsdk.pcc.gm.sf) atb.pcc().pcc(str, com.bytedance.sdk.openadsdk.pcc.gm.sf.class);
        }
        return atb.pcc().gm();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.gm >= 0) {
            atb.pcc().gm(this.gm);
            this.gm = -1;
        }
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc((Activity) this);
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.oo(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.gm(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.sf(this);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        sf sfVar = this.pcc;
        if (sfVar != null) {
            sfVar.pcc(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        pcc();
    }

    private void pcc() {
        if (this.oo.compareAndSet(false, true)) {
            sf sfVar = this.pcc;
            if (sfVar != null) {
                sfVar.vj(this);
            }
            sf();
        }
    }

    private void sf() {
        if (this.sf) {
            if (!TextUtils.isEmpty(this.mu)) {
                atb.pcc().pcc(this.mu, isFinishing(), isChangingConfigurations());
            }
        } else {
            atb.pcc().pcc((com.bytedance.sdk.openadsdk.pcc.vj.pcc) null);
            atb.pcc().pcc((com.bytedance.sdk.openadsdk.pcc.gm.sf) null);
        }
        dax.pcc();
        tsx.pcc().pcc(String.valueOf(hashCode()));
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        String str = this.mu;
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(this.mu)) {
            bundle.putString("single_process_listener_key", this.mu);
        }
        bundle.putBoolean("enable_new_arch", this.sf);
        sf sfVar = this.pcc;
        if (sfVar != null) {
            int pcc = atb.pcc().pcc(sfVar.pcc());
            this.gm = pcc;
            this.pcc.pcc(this, bundle, pcc);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        gm();
    }

    private void gm() {
        sf sfVar = this.pcc;
        if (sfVar == null) {
            super.onBackPressed();
        } else {
            sfVar.vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void gbb() {
        gm();
    }
}
