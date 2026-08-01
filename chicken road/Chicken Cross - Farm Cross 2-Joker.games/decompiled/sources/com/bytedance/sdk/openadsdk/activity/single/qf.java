package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.mk;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.sf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf extends pcc {
    private static String fum;
    private static String lo;
    private static String of;
    private static String tz;
    private static String yt;
    private int qy;

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected boolean c_() {
        return true;
    }

    public qf(sf sfVar, of ofVar, int i, int i2, boolean z) {
        super(sfVar, ofVar, i, i2, z);
        this.qy = -1;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc, com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Activity activity, sf.vj vjVar) {
        super.pcc(activity, vjVar);
        if (com.bytedance.sdk.component.utils.sf.pcc(activity)) {
            return;
        }
        Intent intent = activity.getIntent();
        this.jr = intent.getStringExtra("media_extra");
        this.gbb = intent.getStringExtra("user_id");
        try {
            if (of == null) {
                of = tz.pcc(this.vy.kun, "tt_reward_msg");
                lo = tz.pcc(this.vy.kun, "tt_msgPlayable");
                tz = tz.pcc(this.vy.kun, "tt_negtiveBtnBtnText");
                yt = tz.pcc(this.vy.kun, "tt_postiveBtnText");
                fum = tz.pcc(this.vy.kun, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            lo.gm("TTAD.RewardAdScene", th.getMessage());
        }
        if (this.vy == null || this.qf == null) {
            return;
        }
        this.vy.ra = this.qf.pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public String d_() {
        return "rewarded_video";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected void a_() {
        if (this.qf != null && this.qf.gm()) {
            super.a_();
            return;
        }
        final View ork = this.vy.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.qf.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qf.this.vy.ye.lo() && qf.this.vy.vy.get()) {
                        boolean hc = qf.this.vy.lq.hc();
                        qf.this.vy.ye.wh(hc);
                        qf.this.vy.mu.wh(8);
                        qf.this.vy.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!of.gm(qf.this.vy.sf)) {
                            return;
                        }
                        if (of.gm(qf.this.vy.sf) && hc) {
                            return;
                        }
                    }
                    qf.this.vy.ye.fum();
                    qf.this.vy.lq.vh();
                    qf.this.vy.jsj.wh();
                    if (atb.oo(qf.this.vy.sf)) {
                        qf.this.pcc(true, true, (Runnable) null);
                    } else {
                        qf.this.iv();
                    }
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.vy.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.qf.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                qf qfVar = qf.this;
                qfVar.pcc(atb.gm(qfVar.vy.sf), false, (Runnable) null);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                qf.this.pcc(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                qf.this.e_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void gm(View view) {
                View view2 = ork;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void oo(View view) {
                qf qfVar = qf.this;
                qfVar.sf(qfVar.vy);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc
    protected void sf() {
        this.vy.zti.pcc(null, TTAdDislikeToast.getSkipText());
        this.vy.zti.vj(true);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void e_() {
        this.vy.mk.pcc(this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        this.vy.xb = !this.vy.xb;
        if (this.vy.yt != null && this.vy.yt.pcc() != null) {
            this.vy.yt.pcc().setSoundMute(this.vy.xb);
        }
        new Object[]{"rewarded_video", "will set is Mute " + this.vy.xb + " mLastVolume=" + this.vy.atb.pcc()};
        this.vy.fum.pcc(this.vy.xb, str);
        this.vy.ye.vj(this.vy.xb);
        if (this.vy.sf == null || (gto = this.vy.sf.gto()) == null || (pcc = gto.pcc()) == null) {
            return;
        }
        if (this.vy.xb) {
            pcc.kj(this.vy.fum.hc());
        } else {
            pcc.vy(this.vy.fum.hc());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean f_() {
        return this.vy.xb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(int i) {
        if (i == 10000) {
            zsj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc
    public FrameLayout qf() {
        if (this.wh.wh()) {
            if (this.vy == null || this.vy.yt == null) {
                return null;
            }
            return this.vy.yt.sf();
        }
        if (this.vy == null || this.vy.mu == null) {
            return null;
        }
        return this.vy.mu.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
        zsj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(final boolean z, boolean z2, final Runnable runnable) {
        if (!z2 && this.qf.hc() && runnable != null) {
            return false;
        }
        if (!lu.oo().kj(String.valueOf(this.vy.wh))) {
            if (runnable == null) {
                if (z) {
                    iv();
                    return false;
                }
                ew();
            }
            return false;
        }
        if (this.qf.nac()) {
            if (runnable == null) {
                if (z) {
                    iv();
                    return false;
                }
                ew();
            }
            return false;
        }
        this.vy.nac.set(true);
        this.vy.fum.tz();
        if (z) {
            this.vy.of.wh();
        }
        final com.bytedance.sdk.openadsdk.core.widget.sf sfVar = new com.bytedance.sdk.openadsdk.core.widget.sf(lrr());
        this.sf.tmg = sfVar;
        if (z) {
            this.sf.tmg.pcc(lo).gm(fum).oo(tz);
        } else {
            this.sf.tmg.pcc(of).gm(yt).oo(tz);
        }
        this.sf.tmg.pcc(new sf.InterfaceC0181sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.qf.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void pcc() {
                qf.this.vy.fum.fum();
                if (z) {
                    qf.this.vy.of.pcc(1000);
                }
                sfVar.dismiss();
                qf.this.vy.nac.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void sf() {
                sfVar.dismiss();
                qf.this.qf.sf(true);
                qf.this.vy.nac.set(false);
                qf.this.vy.of.sf(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z) {
                    qf.this.ew();
                } else {
                    qf.this.vy.jsj.wh();
                    qf.this.iv();
                }
            }
        }).show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0088, code lost:
    
        if (r3.vy.hc.get() == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ew() {
        com.bytedance.sdk.openadsdk.core.model.oo gto;
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        this.vy.fum.zti();
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(this.vy.fum.hc());
        pccVar.oo(this.vy.fum.jsj());
        pccVar.gm(this.vy.fum.nac());
        pccVar.gm(3);
        pccVar.oo(this.vy.fum.qy());
        pccVar.pcc(this.vy.fum.sf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.vy.fum.kj(), pccVar, this.vy.fum.vj());
        mk.gm(this.vy.wh);
        this.vy.fum.pcc("skip", false);
        if (this.vy.gm) {
            pcc(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(this.vy.sf)) {
            }
            gto = this.vy.sf.gto();
            if (gto != null && (pcc = gto.pcc()) != null) {
                long hc = this.vy.fum.hc();
                pcc.wh(hc);
                pcc.vj(hc);
            }
            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.vy.sf, 5);
        }
        iv();
        gto = this.vy.sf.gto();
        if (gto != null) {
            long hc2 = this.vy.fum.hc();
            pcc.wh(hc2);
            pcc.vj(hc2);
        }
        com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.vy.sf, 5);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.pcc, com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(final String str, final JSONObject jSONObject) {
        if ("skipToNextAd".equals(str) && this.vy.ywp != null && this.qf.qy() == null) {
            if (this.qf != null && this.qf.gm()) {
                if (this.gpj != null && this.gpj.pcc(atb.gm(this.vy.sf), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.qf.4
                    @Override // java.lang.Runnable
                    public void run() {
                        qf.super.pcc(str, jSONObject);
                    }
                })) {
                    return;
                }
            } else if (pcc(atb.gm(this.vy.sf), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.qf.5
                @Override // java.lang.Runnable
                public void run() {
                    qf.super.pcc(str, jSONObject);
                }
            })) {
                return;
            }
        }
        super.pcc(str, jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void nn() {
        super.nn();
        this.vj = false;
        this.vy.yt.sf(false);
        this.vy.fum.xb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r3.hc.get() == false) goto L8;
     */
    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (sfVar.gm) {
            pcc(true, 4);
            if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(sfVar.sf)) {
            }
            com.bytedance.sdk.openadsdk.common.pcc.sf(sfVar);
        }
        iv();
        com.bytedance.sdk.openadsdk.common.pcc.sf(sfVar);
    }
}
