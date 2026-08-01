package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.dax;
import com.bytedance.sdk.openadsdk.common.pcc;
import com.bytedance.sdk.openadsdk.component.reward.tmg;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.widget.sf;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TTRewardVideoActivity extends TTBaseVideoActivity {
    private static String fum;
    private static String gpj;
    private static String lo;
    private static String lu;
    private static String nac;
    private static com.bytedance.sdk.openadsdk.pcc.vj.pcc yt;
    protected com.bytedance.sdk.openadsdk.pcc.vj.pcc dax;
    protected int gbb;
    protected int jr;
    private String of;
    private String tz;
    private final AtomicBoolean qy = new AtomicBoolean(false);
    private int jsj = -1;

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean jsj() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean qy() {
        return true;
    }

    public void vj(boolean z) {
        if (this.sf == null || this.sf.sf == null) {
            return;
        }
        this.sf.sf.gm(z);
        tmg.pcc(this.sf.sf, false, 3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.ork) {
            yt = this.dax;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (nac == null) {
                nac = tz.pcc(this, "tt_reward_msg");
                lu = tz.pcc(this, "tt_msgPlayable");
                gpj = tz.pcc(this, "tt_negtiveBtnBtnText");
                lo = tz.pcc(this, "tt_postiveBtnText");
                fum = tz.pcc(this, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            lo.gm("TTAD.RVA", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pcc() {
        super.pcc();
        if (this.sf == null || this.sf.sf == null) {
            return;
        }
        final of ofVar = this.sf.sf;
        if (ofVar.rj()) {
            return;
        }
        this.sf.ra = new tmg(new tmg.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.component.reward.tmg.pcc
            public void pcc(int i, boolean z) {
                if (ofVar.rj()) {
                    return;
                }
                if (z || !ofVar.dax()) {
                    TTRewardVideoActivity.this.pcc(i);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected dax kj() {
        return new dax(this.sf) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.dax
            protected boolean pcc() {
                return (this.qf == null || this.qf.sf == null || !this.qf.sf.dax()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            protected void pcc(boolean z) {
                TTRewardVideoActivity.this.vj(z);
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            protected boolean sf() {
                return (this.qf == null || this.qf.sf == null || !this.qf.sf.rj()) ? false : true;
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            protected void gm() {
                TTRewardVideoActivity.this.finish();
            }

            @Override // com.bytedance.sdk.openadsdk.common.dax
            protected void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
                com.bytedance.sdk.openadsdk.common.pcc.pcc(sfVar, new pcc.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.2.1
                    @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                    public void pcc(boolean z, int i) {
                        TTRewardVideoActivity.this.pcc(z, i);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.pcc.sf
                    public void pcc() {
                        TTRewardVideoActivity.this.finish();
                    }
                });
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.sf == null || this.sf.ra == null) {
            return;
        }
        this.sf.ra.sf();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void fum() {
        com.bytedance.sdk.openadsdk.component.reward.view.gm pcc;
        super.fum();
        if (this.sf == null || (pcc = this.sf.yt.pcc()) == null) {
            return;
        }
        pcc.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                TTRewardVideoActivity.this.lrr();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.sf == null || this.sf.ra == null) {
            return;
        }
        this.sf.ra.pcc();
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.ork) {
            return;
        }
        yt = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(Bundle bundle) {
        if (this.ork) {
            super.pcc(bundle);
            this.dax = (com.bytedance.sdk.openadsdk.pcc.vj.pcc) atb.pcc().pcc(this.mu, com.bytedance.sdk.openadsdk.pcc.vj.pcc.class);
        } else {
            com.bytedance.sdk.openadsdk.pcc.vj.pcc sf = atb.pcc().sf();
            this.dax = sf;
            if (sf == null && bundle != null) {
                this.dax = yt;
                yt = null;
            }
        }
        Log.e("TTAD.RVA", "initListener: listenerKey = " + this.mu + ",mRewardAdInteractionListener = " + this.dax + ",savedInstanceState = " + bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void vy() {
        this.sf.zti.pcc(null, TTAdDislikeToast.getSkipText());
        this.sf.zti.vj(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void yt() {
        final View ork = this.sf.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTRewardVideoActivity.this.sf.ye.lo() && TTRewardVideoActivity.this.sf.vy.get()) {
                        boolean hc = TTRewardVideoActivity.this.sf.lq.hc();
                        TTRewardVideoActivity.this.sf.ye.wh(hc);
                        TTRewardVideoActivity.this.sf.mu.wh(8);
                        View view2 = ork;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                            ((com.bytedance.sdk.openadsdk.core.wh.oo) view2).setImageResource(tz.oo(TTRewardVideoActivity.this.sf.kun, "tt_close_btn"));
                        }
                        TTRewardVideoActivity.this.sf.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!of.gm(TTRewardVideoActivity.this.sf.sf)) {
                            return;
                        }
                        if (of.gm(TTRewardVideoActivity.this.sf.sf) && hc) {
                            return;
                        }
                    }
                    TTRewardVideoActivity.this.sf.ye.fum();
                    TTRewardVideoActivity.this.sf.lq.vh();
                    TTRewardVideoActivity.this.sf.jsj.wh();
                    if (com.bytedance.sdk.openadsdk.core.model.atb.oo(TTRewardVideoActivity.this.sf.sf)) {
                        TTRewardVideoActivity.this.gm(true, true);
                    } else {
                        TTRewardVideoActivity.this.finish();
                    }
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.sf.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                TTRewardVideoActivity tTRewardVideoActivity = TTRewardVideoActivity.this;
                tTRewardVideoActivity.gm(com.bytedance.sdk.openadsdk.core.model.atb.gm(tTRewardVideoActivity.sf.sf), false);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.oo gto;
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
                TTRewardVideoActivity.this.sf.xb = !TTRewardVideoActivity.this.sf.xb;
                new Object[]{"rewarded_video", "will set is Mute " + TTRewardVideoActivity.this.sf.xb + " mLastVolume=" + TTRewardVideoActivity.this.sf.atb.pcc()};
                TTRewardVideoActivity.this.sf.fum.pcc(TTRewardVideoActivity.this.sf.xb, str);
                if (!com.bytedance.sdk.openadsdk.core.model.atb.dax(TTRewardVideoActivity.this.sf.sf) || TTRewardVideoActivity.this.sf.vy.get()) {
                    TTRewardVideoActivity.this.sf.ye.vj(TTRewardVideoActivity.this.sf.xb);
                    TTRewardVideoActivity.this.sf.of.sf(TTRewardVideoActivity.this.sf.xb);
                    if (TTRewardVideoActivity.this.sf.sf == null || (gto = TTRewardVideoActivity.this.sf.sf.gto()) == null || (pcc = gto.pcc()) == null) {
                        return;
                    }
                    if (TTRewardVideoActivity.this.sf.xb) {
                        pcc.kj(TTRewardVideoActivity.this.sf.fum.hc());
                    } else {
                        pcc.vy(TTRewardVideoActivity.this.sf.fum.hc());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                TTRewardVideoActivity.this.sf.mk.pcc(TTRewardVideoActivity.this.gm);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View view2 = ork;
                if (view2 != null) {
                    view2.performClick();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(final boolean z, boolean z2) {
        if (this.sf == null || this.sf.sf == null) {
            return;
        }
        if (!z2 && this.sf.sf.dax() && this.sf.vy.get() && com.bytedance.sdk.openadsdk.core.model.atb.kj(this.sf.sf)) {
            this.sf.of.vy();
            return;
        }
        if (!lu.oo().kj(String.valueOf(this.sf.wh))) {
            if (!z2 && this.sf.vy.get() && com.bytedance.sdk.openadsdk.core.model.atb.kj(this.sf.sf)) {
                this.sf.of.vy();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                rj();
                return;
            }
        }
        if (this.sf != null && this.sf.sf != null && this.sf.sf.rj()) {
            if (this.sf.vy.get() && com.bytedance.sdk.openadsdk.core.model.atb.kj(this.sf.sf)) {
                this.sf.of.vy();
                return;
            } else if (z) {
                finish();
                return;
            } else {
                rj();
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.atb.kj(this.sf.sf) && this.sf.ye.kj().getVisibility() == 0) {
            this.sf.of.vy();
            return;
        }
        this.sf.nac.set(true);
        this.sf.fum.tz();
        if (z) {
            this.sf.of.wh();
        }
        final com.bytedance.sdk.openadsdk.core.widget.sf sfVar = new com.bytedance.sdk.openadsdk.core.widget.sf(this);
        this.gm.tmg = sfVar;
        if (z) {
            this.gm.tmg.pcc(lu).gm(fum).oo(gpj);
        } else {
            this.gm.tmg.pcc(nac).gm(lo).oo(gpj);
        }
        this.gm.tmg.pcc(new sf.InterfaceC0181sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void pcc() {
                TTRewardVideoActivity.this.sf.fum.fum();
                if (z) {
                    TTRewardVideoActivity.this.sf.of.pcc(1000);
                }
                sfVar.dismiss();
                TTRewardVideoActivity.this.sf.nac.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void sf() {
                sfVar.dismiss();
                TTRewardVideoActivity.this.vj(true);
                TTRewardVideoActivity.this.sf.nac.set(false);
                TTRewardVideoActivity.this.sf.of.sf(Integer.MAX_VALUE);
                if (!z || !com.bytedance.sdk.openadsdk.core.model.atb.wh(TTRewardVideoActivity.this.sf.sf)) {
                    TTRewardVideoActivity.this.rj();
                } else if (com.bytedance.sdk.openadsdk.core.model.atb.kj(TTRewardVideoActivity.this.sf.sf)) {
                    TTRewardVideoActivity.this.sf.of.vy();
                } else {
                    TTRewardVideoActivity.this.sf.jsj.wh();
                    TTRewardVideoActivity.this.finish();
                }
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a1, code lost:
    
        if (r3.sf.hc.get() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void rj() {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(this.sf.fum.hc());
        pccVar.oo(this.sf.fum.jsj());
        pccVar.gm(this.sf.fum.nac());
        pccVar.gm(3);
        pccVar.oo(this.sf.fum.qy());
        pccVar.pcc(this.sf.fum.sf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.sf.fum.kj(), pccVar, this.sf.fum.vj());
        mk.gm(this.sf.wh);
        this.sf.fum.pcc("skip", false);
        if (this.sf.gm) {
            if (com.bytedance.sdk.openadsdk.core.model.lo.gm(this.sf.sf)) {
                com.bytedance.sdk.openadsdk.component.reward.view.gm pcc2 = this.sf.yt.pcc();
                if (pcc2 != null && pcc2.oo == 0) {
                    finish();
                } else {
                    pcc(true, 4);
                }
            } else {
                pcc(true, 4);
            }
            if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(this.sf.sf)) {
            }
            gto = this.sf.sf.gto();
            if (gto != null && (pcc = gto.pcc()) != null) {
                long hc = this.sf.fum.hc();
                pcc.wh(hc);
                pcc.vj(hc);
            }
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.sf.sf, 5);
        }
        finish();
        gto = this.sf.sf.gto();
        if (gto != null) {
            long hc2 = this.sf.fum.hc();
            pcc.wh(hc2);
            pcc.vj(hc2);
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.sf.sf, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pcc(Intent intent) {
        super.pcc(intent);
        this.tz = intent.getStringExtra("media_extra");
        this.of = intent.getStringExtra("user_id");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout zti() {
        return this.sf.mu.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void pcc(long j, long j2) {
        int i = (int) (j / 1000);
        int quq = this.sf.sf.quq();
        boolean z = quq >= 0;
        gm(j, j2);
        if (this.vj > 0) {
            this.sf.zti.oo(true);
            if (z && i >= quq) {
                this.sf.pcc(true);
                this.sf.zti.pcc(String.valueOf(this.vj), TTAdDislikeToast.getSkipText());
                this.sf.zti.vj(true);
                return;
            }
            this.sf.zti.pcc(String.valueOf(this.vj), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void sf(boolean z, boolean z2) {
        this.gbb = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void lq() {
        this.jr = (int) (System.currentTimeMillis() / 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pq() {
        lrr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lrr() {
        new StringBuilder("invoke callback onAdClicked, ").append(this);
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.dax;
        if (pccVar != null) {
            pccVar.onAdClicked();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        new StringBuilder("invoke callback onRewardVerify: ").append(z).append(", ").append(i).append(", ").append(str).append(", ").append(i2).append(", ").append(str2).append("; ").append(this);
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.7
            @Override // java.lang.Runnable
            public void run() {
                if (TTRewardVideoActivity.this.dax != null) {
                    TTRewardVideoActivity.this.dax.pcc(z, i, str, i2, str2);
                    tmg.pcc(TTRewardVideoActivity.this.sf.sf, z, i3);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void gpj() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.dax;
        if (pccVar != null) {
            pccVar.pcc();
        } else {
            ork.pcc(this.sf != null ? this.sf.sf : null, "show", 0);
        }
        if (tsz()) {
            this.sf.yt.hc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
        kun();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void atb() {
        kun();
    }

    protected void kun() {
        pcc(0);
    }

    protected void pcc(final int i) {
        if (this.sf == null || this.sf.sf == null || this.sf.sf.rj() || this.sf.sf.dax()) {
            return;
        }
        this.sf.sf.vy(true);
        if (this.sf.ra != null) {
            this.sf.ra.gm();
        }
        if (lu.oo().nac(String.valueOf(this.sf.wh))) {
            pcc(true, this.sf.sf.otd(), this.sf.sf.gdh(), 0, "", i);
        } else {
            lu.gm().pcc(iv(), new of.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity.8
                @Override // com.bytedance.sdk.openadsdk.core.of.sf
                public void pcc(int i2, String str) {
                    TTRewardVideoActivity.this.pcc(false, 0, "", i2, str, i);
                }

                @Override // com.bytedance.sdk.openadsdk.core.of.sf
                public void pcc(yt.sf sfVar) {
                    boolean z = sfVar.sf;
                    TTRewardVideoActivity.this.pcc(sfVar.sf, sfVar.gm.pcc(), sfVar.gm.sf(), 0, "", i);
                }
            });
        }
    }

    private JSONObject iv() {
        JSONObject jSONObject = new JSONObject();
        int tsz = (int) this.sf.fum.tsz();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.sf.sf.gdh());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.sf.sf.otd());
            jSONObject.put("network", com.bytedance.sdk.component.utils.lu.gm(getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int bxz = this.sf.sf.bxz();
            String str = "unKnow";
            if (bxz == 2) {
                str = kun.sf();
            } else if (bxz == 1) {
                str = kun.oo();
            }
            jSONObject.put("user_agent", str);
            JSONObject zvx = this.sf.sf.zvx();
            zvx.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            jSONObject.put("extra", zvx);
            jSONObject.put("media_extra", this.tz);
            jSONObject.put("video_duration", this.sf.sf.kez().wh());
            jSONObject.put("play_start_ts", this.gbb);
            jSONObject.put("play_end_ts", this.jr);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, tsz);
            jSONObject.put("user_id", this.of);
            jSONObject.put("trans_id", tsz.pcc().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            lo.pcc("TTAD.RVA", "", th);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void qcw() {
        lrr();
        this.sf.sf.hu();
        this.sf.sf.oo(true);
        if (this.sf.vy.get() || !com.bytedance.sdk.openadsdk.core.model.of.vj(this.sf.sf)) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.sf.sf, this.sf.vj, this.sf.sf.zex());
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(int i) {
        if (i == 10000) {
            kun();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        wh();
        pcc(isFinishing(), isChangingConfigurations());
        if (this.ork) {
            return;
        }
        this.dax = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.sf != null) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoForceBreak", this.sf.sf);
        }
        wh();
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void sf() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.dax;
        if (pccVar != null) {
            pccVar.sf();
        } else {
            ork.pcc(this.sf != null ? this.sf.sf : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    protected void gm() {
        if (this.sf == null || this.sf.ra == null) {
            return;
        }
        this.sf.ra.oo();
    }

    protected void sf(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        if (this.jsj == -1) {
            this.jsj = Math.min(100, this.sf.sf.vgx());
        }
        if (((j / 1000.0f) / j2) * 100.0f >= this.jsj) {
            kun();
        }
    }

    public void gm(long j, long j2) {
        boolean z = false;
        if (this.sf != null) {
            if (this.sf.sf.vgx() >= 0 && this.sf.sf.ibq() >= 0) {
                z = true;
            }
            if (z) {
                j2 = this.sf.sf.ibq();
            }
        }
        long j3 = j + (this.sf.hpk * 1000);
        if (z) {
            sf(j3, j2);
            return;
        }
        if (this.jsj == -1) {
            this.jsj = lu.oo().tsz(String.valueOf(this.sf.wh)).wh;
        }
        if (j2 <= 0) {
            return;
        }
        if (j2 >= 30000 && j3 >= 27000) {
            kun();
        } else if ((j3 * 100) / j2 >= this.jsj) {
            kun();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
        if (z) {
            kun();
            return;
        }
        if ((1.0d - (this.vj / this.sf.fum.tsx())) * 100.0d >= lu.oo().tsz(String.valueOf(this.sf.wh)).wh) {
            kun();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void mu() {
        pcc(2);
    }
}
