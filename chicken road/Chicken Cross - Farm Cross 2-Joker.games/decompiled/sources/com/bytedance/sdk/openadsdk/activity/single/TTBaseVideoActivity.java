package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.dax;
import com.bytedance.sdk.openadsdk.common.gbb;
import com.bytedance.sdk.openadsdk.common.pcc;
import com.bytedance.sdk.openadsdk.component.reward.pcc.tmg;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.ye;
import com.bytedance.sdk.openadsdk.core.tsx;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.mk;
import com.bytedance.sdk.openadsdk.utils.pq;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements tsz.pcc, com.bytedance.sdk.openadsdk.core.jr.oo.sf {
    private int dax;
    private final AtomicBoolean gbb;
    protected com.bytedance.sdk.openadsdk.component.reward.sf.sf gm;
    protected boolean hc;
    private boolean jr;
    int kj;
    private int lu;
    private final tmg.sf nac;
    final tsz oo;
    protected boolean ork;
    public final String pcc;
    protected pq qf;
    com.bytedance.sdk.openadsdk.component.reward.pcc.sf sf;
    protected long tmg;
    protected boolean vh;
    int vj;
    protected boolean vy;
    boolean wh;

    protected void atb() {
    }

    protected void fum() {
    }

    protected abstract void gm();

    protected abstract void gpj();

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void hoh() {
    }

    public abstract boolean jsj();

    protected abstract dax kj();

    protected void lq() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void oo(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean oo() {
        return true;
    }

    protected abstract void pcc(long j, long j2);

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(boolean z) {
    }

    public abstract boolean qy();

    protected abstract void sf();

    protected void sf(boolean z, boolean z2) {
    }

    public Map<String, Object> tsx() {
        return null;
    }

    public boolean tsz() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vj() {
    }

    protected abstract void vy();

    protected abstract void yt();

    public abstract FrameLayout zti();

    public TTBaseVideoActivity() {
        this.pcc = qy() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.gbb = new AtomicBoolean(false);
        this.oo = new tsz(Looper.getMainLooper(), this);
        this.jr = false;
        this.dax = 0;
        this.kj = 1;
        this.nac = new tmg.sf();
        this.vy = false;
        this.lu = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z = true;
        }
        this.ork = z;
        this.tmg = SystemClock.elapsedRealtime();
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
        this.hc = com.bytedance.sdk.openadsdk.yt.vj.vh();
        com.bytedance.sdk.openadsdk.utils.sf.pcc(pcc);
        this.vh = com.bytedance.sdk.openadsdk.utils.sf.pcc();
        pcc.rnn(String.valueOf(hashCode()));
        this.kj = pcc.ial();
        pcc(pcc, bundle);
        if (bundle != null) {
            ork.pcc(pcc, "activity_recreate", pcc.vj(), "activity_recreate", null);
        }
        try {
            lu();
            pcc();
            kun();
        } catch (Throwable th) {
            lo.pcc("TTAD.BVA", "onCreate: ", th);
            ork.pcc(pcc, "show_ad_fail", this.pcc, "init_view_crash");
            finish();
        }
    }

    private void pcc(of ofVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = new com.bytedance.sdk.openadsdk.component.reward.pcc.sf(this, this.oo, ofVar, this, 0, this.vh);
        this.sf = sfVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(sfVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            pcc(intent);
            ofVar.pcc(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.sf.hoh) {
            vy();
        }
        com.bytedance.sdk.openadsdk.component.reward.sf.sf pcc = com.bytedance.sdk.openadsdk.component.reward.sf.wh.pcc(this.sf);
        this.gm = pcc;
        this.sf.ew = pcc;
        com.bytedance.sdk.openadsdk.utils.dax.pcc(ofVar, this.sf.kun, this.sf.vj, this.sf.tsx);
        new StringBuilder("init: mAdType = ").append(this.gm);
    }

    protected void pcc() {
        setContentView(this.sf.nn);
        this.sf.nn.pcc(this.gm);
        this.gm.pcc(this, this.oo);
        this.gm.ork();
        com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(this, this.sf.nn, com.bytedance.sdk.openadsdk.of.pcc.pcc.pcc(this.sf.sf.qxv()));
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || sfVar.sf == null) {
            return;
        }
        of ofVar = this.sf.sf;
        if (this.pq && !ofVar.evs() && !TextUtils.isEmpty(of.pcc(this, ofVar))) {
            finish();
        }
        if (ofVar.evs()) {
            ofVar.jr(false);
        }
    }

    private void kun() {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        this.gm.yt();
        this.vj = (int) this.sf.fum.tsx();
        if (this.hc) {
            com.bytedance.sdk.openadsdk.common.pcc.sf(new gbb.pcc(this.sf, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new pcc.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                public void pcc(boolean z, int i) {
                    TTBaseVideoActivity.this.pcc(z, i);
                }

                @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                public void pcc() {
                    TTBaseVideoActivity.this.finish();
                }
            }).pcc(qf()).pcc(kj()).pcc());
        } else {
            yt();
        }
        hc();
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.sf.sf.gto();
        if (gto == null || (pcc = gto.pcc()) == null) {
            return;
        }
        pcc.pcc(0L);
    }

    protected void wh() {
        if (com.bytedance.sdk.openadsdk.yt.vj.vy() && isChangingConfigurations()) {
            lo.pcc("BVA", "callback close is invoke by config change.");
            return;
        }
        if (!this.wh) {
            this.wh = true;
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
            of ofVar = sfVar != null ? sfVar.sf : null;
            if (ofVar != null && !ofVar.iv()) {
                long vy = ofVar.vy();
                if (vy > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - vy;
                    if (elapsedRealtime > 0) {
                        ofVar.sf(elapsedRealtime);
                    }
                }
                this.sf.pcc(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1003);
                this.sf.jsj.pcc();
            }
            gm();
            sf();
            return;
        }
        lo.pcc("BVA", "invoke callback onAdClose has already been called ");
    }

    protected boolean qf() {
        return !qy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
        if (this.ork) {
            if (bundle != null) {
                this.mu = bundle.getString("single_process_listener_key");
            } else if (getIntent() != null) {
                this.mu = getIntent().getStringExtra("single_process_listener_key");
            } else {
                this.mu = "";
            }
        }
    }

    protected void pcc(Intent intent) {
        this.sf.vr = intent.getBooleanExtra("back_up", false);
        this.sf.bg = intent.getIntExtra("extra_conversion_link", 0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || sfVar.jsj == null) {
            return;
        }
        this.sf.jsj.sf(z);
        this.sf.jsj.gm(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void kz() {
        this.sf.jsj.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vh() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.vh();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void tmg() {
        this.sf.gbb.set(true);
        vh();
    }

    public void pcc(boolean z, int i) {
        pcc(z, false, i);
    }

    public void pcc(boolean z, boolean z2, int i) {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(z, z2, false, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void jr() {
        this.sf.fum.kun();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public View dax() {
        return this.sf.fum.rj();
    }

    protected void hc() {
        if (atb.gm(this.sf.sf)) {
            pcc(false, sf.C0198sf.gm);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar != null) {
            sfVar.pcc(this.sf.mu.wh());
            this.gm.of();
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        new StringBuilder("onStart mMetaIndex =").append(this.lu).append(" this =").append(this);
        if (this.lu >= 0) {
            com.bytedance.sdk.openadsdk.core.atb.pcc().gm(this.lu);
            this.lu = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.ye.qy();
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.sf.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        super.onResume();
        new StringBuilder("onResume ").append(this);
        if (this.sf == null || (sfVar = this.gm) == null) {
            return;
        }
        sfVar.jr();
        this.sf.ri = true;
        this.nac.pcc(this, this.sf.zsj, this.sf.gd, this.vh);
        if (lrr()) {
            this.sf.zti.pcc(this.sf.sf.dk());
        }
        this.sf.mu.dax();
        this.sf.ye.nac();
        this.sf.of.vj();
        if (this.gm.sf()) {
            this.sf.fum.pcc(this.gm);
            this.sf.fum.pcc(false, this, this.dax != 0);
        }
        this.dax++;
        lo();
        if (this.sf.yt != null) {
            this.sf.yt.qf();
        }
        this.sf.qy.pcc(this.oo);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        new StringBuilder("onPause ").append(this);
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.nac();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        new StringBuilder("onStop ").append(this);
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.lu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        new StringBuilder("onDestroy ").append(this);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || this.gm == null) {
            return;
        }
        if (sfVar.qcw > 0 && this.sf.sf != null && this.sf.sf.iv()) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(String.valueOf(SystemClock.elapsedRealtime() - this.sf.qcw), this.sf.sf, this.pcc, this.sf.fum.vj());
            this.sf.qcw = 0L;
        }
        this.sf.mk.sf();
        this.oo.removeCallbacksAndMessages(null);
        this.gm.gpj();
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.sf.sf);
        com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(this.sf.sf);
        AdSlot gqd = this.sf.sf.gqd();
        if (!this.sf.fum.pq() && gqd != null && TextUtils.isEmpty(gqd.getBidAdm()) && !this.sf.sf.duh() && !of.wh(this.sf.sf)) {
            jr.sf().post(new com.bytedance.sdk.openadsdk.component.reward.gbb(qy(), gqd));
        }
        com.bytedance.sdk.openadsdk.utils.dax.pcc();
        pq pqVar = this.qf;
        if (pqVar != null) {
            pqVar.vj();
            this.qf = null;
        }
        this.nac.pcc(this);
        tsx.pcc().pcc(String.valueOf(hashCode()));
        com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(this.sf.sf);
    }

    public void pcc(boolean z, boolean z2) {
        if (!this.ork || TextUtils.isEmpty(this.mu)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(this.mu, z, z2);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (this.sf == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.mu)) {
            bundle.putString("single_process_listener_key", this.mu);
        }
        bundle.putBoolean("enable_new_arch", this.ork);
        of ofVar = this.sf.sf;
        int pcc = ofVar != null ? com.bytedance.sdk.openadsdk.core.atb.pcc().pcc(ofVar) : -1;
        this.lu = pcc;
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.sf, bundle, pcc);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        rj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void gbb() {
        rj();
    }

    private void rj() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        if (this.sf == null || (sfVar = this.gm) == null) {
            super.onBackPressed();
        } else {
            sfVar.lo();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null) {
            return;
        }
        sfVar.qy.pcc();
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void ork() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || sfVar.sf == null || this.sf.sf.kun()) {
            return;
        }
        new StringBuilder("invoke callback onShow, ").append(this);
        this.sf.sf.kj(true);
        gpj();
        if (this.sf.yt != null) {
            com.bytedance.sdk.openadsdk.component.oo.pcc.sf(this.sf.sf, this.sf.yt.vh());
        }
    }

    protected void lo() {
        if (tsz() && !this.jr) {
            this.jr = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.sf.tsz.pcc(TTBaseVideoActivity.this.sf.qy.pcc(TTBaseVideoActivity.this.kj));
                    TTBaseVideoActivity.this.fum();
                }
            });
        }
    }

    protected void tz() {
        Message message = new Message();
        message.what = 400;
        if (qy()) {
            sf(10000);
        }
        this.oo.sendMessageDelayed(message, 2000L);
    }

    protected void of() {
        this.oo.removeMessages(400);
    }

    private boolean lrr() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.sf.vy.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.sf == null) {
            return;
        }
        if (mk.wh()) {
            rj.sf((Activity) this);
        }
        if (!atb.vj(this.sf.sf) || this.sf.of.oo(com.bytedance.sdk.openadsdk.component.reward.pcc.vy.sf)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    protected void mk() {
        ye uk;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar == null || sfVar.sf == null || (uk = this.sf.sf.uk()) == null) {
            return;
        }
        if (uk.sf() == 1 || uk.sf() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.sf;
            this.qf = new pq(sfVar2, sfVar2.sf);
            if (this.sf.fum != null) {
                this.sf.fum.pcc(this.qf);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public List<of> ptr() {
        return this.sf.sf.ky();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ye() {
        this.vy = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public boolean pcc(long j, boolean z) {
        if (this.sf == null) {
            return false;
        }
        this.gbb.set(false);
        com.bytedance.sdk.openadsdk.oo.qf kj = this.sf.kj();
        FrameLayout zti = zti();
        if (zti == null) {
            return false;
        }
        this.sf.fum.pcc(zti, kj);
        Map<String, Object> tsx = tsx();
        gm.pcc pccVar = new gm.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.4
            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void pcc(long j2, int i) {
                TTBaseVideoActivity.this.gbb.get();
                if (TTBaseVideoActivity.this.gbb.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.gbb.set(true);
                TTBaseVideoActivity.this.of();
                TTBaseVideoActivity.this.atb();
                TTBaseVideoActivity.this.sf.fum.pcc(j2, j2);
                if (TTBaseVideoActivity.this.tsz()) {
                    TTBaseVideoActivity.this.sf.yt.sf(true);
                } else {
                    TTBaseVideoActivity.this.sf.dax.set(true);
                }
                TTBaseVideoActivity.this.lq();
                if (TTBaseVideoActivity.this.sf.sf.bg() == 36 && TTBaseVideoActivity.this.sf.gm) {
                    TTBaseVideoActivity.this.sf.tz.gm().pcc(TTBaseVideoActivity.this.sf.sf);
                    com.bytedance.sdk.openadsdk.utils.dax.sf();
                }
                if (!TTBaseVideoActivity.this.tsz() && TTBaseVideoActivity.this.sf.sf.giw()) {
                    TTBaseVideoActivity.this.sf.sf.zsj(1);
                    TTBaseVideoActivity.this.sf.mu.lu();
                }
                if (TTBaseVideoActivity.this.sf.sf.bg() == 21 && !TTBaseVideoActivity.this.sf.sf.gpj()) {
                    TTBaseVideoActivity.this.sf.sf.vj(true);
                    TTBaseVideoActivity.this.sf.mu.lu();
                }
                if (TTBaseVideoActivity.this.vy && TTBaseVideoActivity.this.sf.yt.tmg()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.tsz()) {
                    if (com.bytedance.sdk.openadsdk.core.model.lo.oo(TTBaseVideoActivity.this.sf.sf) || com.bytedance.sdk.openadsdk.core.model.lo.sf(TTBaseVideoActivity.this.sf.sf) || com.bytedance.sdk.openadsdk.core.model.lo.kj(TTBaseVideoActivity.this.sf.sf)) {
                        TTBaseVideoActivity.this.pcc(false, 5);
                        if (TTBaseVideoActivity.this.sf.gh != null) {
                            TTBaseVideoActivity.this.sf.gh.pcc(TTBaseVideoActivity.this.sf, 0L);
                            return;
                        }
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(TTBaseVideoActivity.this.sf.sf) && !TTBaseVideoActivity.this.sf.hc.get()) {
                        TTBaseVideoActivity.this.sf.pcc(true);
                        TTBaseVideoActivity.this.sf.zti.vj(true);
                        return;
                    }
                }
                if (TTBaseVideoActivity.this.sf.gm) {
                    if (TTBaseVideoActivity.this.sf.sf.gd()) {
                        if (TTBaseVideoActivity.this.tsz()) {
                            if (TTBaseVideoActivity.this.sf.yt.vh() == 1) {
                                TTBaseVideoActivity.this.sf.zti.gm();
                                return;
                            }
                            return;
                        }
                        TTBaseVideoActivity.this.sf.zti.gm();
                        return;
                    }
                    TTBaseVideoActivity.this.pcc(false, 5);
                    if (!TTBaseVideoActivity.this.tsz() && com.bytedance.sdk.openadsdk.core.model.lo.sf(TTBaseVideoActivity.this.sf.sf) && TTBaseVideoActivity.this.sf.gh != null) {
                        TTBaseVideoActivity.this.sf.gh.pcc(TTBaseVideoActivity.this.sf, 0L);
                    }
                    if (of.vj(TTBaseVideoActivity.this.sf.sf)) {
                        return;
                    }
                    TTBaseVideoActivity.this.sf.fum.pcc("skip", true);
                    return;
                }
                TTBaseVideoActivity.this.nn();
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void sf(long j2, int i) {
                TTBaseVideoActivity.this.sf.fum.vh();
                if (TTBaseVideoActivity.this.sf.mu != null && TTBaseVideoActivity.this.sf.mu.dax != null) {
                    TTBaseVideoActivity.this.sf.mu.dax.ork();
                }
                if (TTBaseVideoActivity.this.sf.fum.wh()) {
                    TTBaseVideoActivity.this.tz();
                    return;
                }
                TTBaseVideoActivity.this.sf.fum.lo();
                TTBaseVideoActivity.this.atb();
                if (TTBaseVideoActivity.this.sf.sf.wh()) {
                    TTBaseVideoActivity.this.sf.yt.pcc(true);
                }
                if (TTBaseVideoActivity.this.sf.gm) {
                    TTBaseVideoActivity.this.pcc(false, true, 3);
                    TTBaseVideoActivity.this.sf.fum.pcc(1 ^ (TTBaseVideoActivity.this.sf.fum.rnn() ? 1 : 0), 2);
                } else {
                    TTBaseVideoActivity.this.finish();
                }
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void pcc() {
                TTBaseVideoActivity.this.sf.fum.vh();
                TTBaseVideoActivity.this.of();
                TTBaseVideoActivity.this.atb();
                new Object[]{"fullscreen_interstitial_ad", "onTimeOut、、、、、、、、"};
                if (TTBaseVideoActivity.this.sf.gm) {
                    TTBaseVideoActivity.this.pcc(false, true, 6);
                } else {
                    TTBaseVideoActivity.this.finish();
                }
                TTBaseVideoActivity.this.sf.fum.pcc(!TTBaseVideoActivity.this.sf.fum.rnn() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.sf.fum.rnn() ? 1 : 0));
                TTBaseVideoActivity.this.sf.fum.lo();
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.pcc
            public void pcc(long j2, long j3) {
                if (!TTBaseVideoActivity.this.sf.ri && TTBaseVideoActivity.this.sf.fum.wh()) {
                    TTBaseVideoActivity.this.sf.fum.tz();
                }
                if (TTBaseVideoActivity.this.sf.vy.get()) {
                    return;
                }
                if (j2 != TTBaseVideoActivity.this.sf.fum.gbb()) {
                    TTBaseVideoActivity.this.of();
                }
                if (TTBaseVideoActivity.this.tsz() && !TTBaseVideoActivity.this.sf.fum.wh()) {
                    TTBaseVideoActivity.this.oo.removeMessages(300);
                    return;
                }
                TTBaseVideoActivity.this.sf.fum.pcc(j2, j3);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                long j4 = j2 / 1000;
                tTBaseVideoActivity.vj = (int) (tTBaseVideoActivity.sf.fum.tsx() - j4);
                int i = (int) j4;
                if ((TTBaseVideoActivity.this.sf.nac.get() || TTBaseVideoActivity.this.sf.ork.get()) && TTBaseVideoActivity.this.sf.fum.wh()) {
                    TTBaseVideoActivity.this.sf.fum.tz();
                }
                if (TTBaseVideoActivity.this.qy()) {
                    TTBaseVideoActivity.this.sf.mu.vj(i);
                }
                if (TTBaseVideoActivity.this.jsj()) {
                    if (TTBaseVideoActivity.this.sf.fum.oo()) {
                        if (TTBaseVideoActivity.this.qf != null) {
                            TTBaseVideoActivity.this.qf.pcc(j2);
                            return;
                        }
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.qf == null || !TTBaseVideoActivity.this.qf.pcc()) {
                            TTBaseVideoActivity.this.pcc(j2, j3);
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.pcc(j2, j3);
            }
        };
        this.sf.fum.pcc(pccVar);
        if (!this.sf.sf.wh() && this.sf.mu != null && this.sf.mu.dax != null) {
            this.sf.mu.dax.pcc(pccVar);
        }
        boolean pcc = this.sf.fum.pcc(j, z, tsx, this.gm);
        sf(pcc, z);
        return pcc;
    }

    public void nn() {
        if (this.sf.sf.gd()) {
            if (this.sf.sf.wh()) {
                if (this.sf.yt.vh() == 1) {
                    this.sf.zti.gm();
                    return;
                }
                return;
            }
            this.sf.zti.gm();
            return;
        }
        if (!of.vj(this.sf.sf)) {
            this.sf.fum.pcc("skip", true);
        }
        finish();
    }

    public boolean rnn() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.sf;
        if (sfVar != null) {
            return sfVar.vr;
        }
        return false;
    }
}
