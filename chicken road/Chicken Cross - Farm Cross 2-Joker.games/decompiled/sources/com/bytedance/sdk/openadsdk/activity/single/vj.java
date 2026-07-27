package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.sf;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vj extends kj implements tsz.pcc {
    private static String fum;
    private static String lo;
    private static String oo;
    private static String tz;
    private static String vj;
    private JSONObject atb;
    protected com.bytedance.sdk.openadsdk.component.reward.sf.sf gm;
    private boolean jsj;
    private boolean lq;
    private long mk;
    private Bundle of;
    public boolean pcc;
    private sf.vj qy;
    protected final tsz sf;
    private boolean tsz;
    private int ye;
    private int yt;

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected boolean b_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final View dax() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void jr() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void oo(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public boolean pcc(long j, boolean z) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void tmg() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void ye() {
    }

    public vj(sf sfVar, of ofVar, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(sfVar, ofVar, i, i2, z2);
        this.sf = new tsz(Looper.getMainLooper(), this);
        this.yt = 0;
        this.lq = true;
        this.dax = z;
        this.hc = sfVar.vj();
        this.pcc = z3;
        pcc(ofVar, this.of);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void pcc(Activity activity, Bundle bundle) {
        this.of = bundle;
        super.pcc(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final com.bytedance.sdk.openadsdk.component.reward.view.kj pcc() {
        return this.vy.nn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Activity activity, sf.vj vjVar) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar;
        this.qy = vjVar;
        Intent intent = activity.getIntent();
        this.jr = intent.getStringExtra("media_extra");
        this.gbb = intent.getStringExtra("user_id");
        try {
            if (fum == null) {
                fum = tz.pcc(this.vy.kun, "tt_reward_msg");
                oo = tz.pcc(this.vy.kun, "tt_msgPlayable");
                lo = tz.pcc(this.vy.kun, "tt_negtiveBtnBtnText");
                tz = tz.pcc(this.vy.kun, "tt_postiveBtnText");
                vj = tz.pcc(this.vy.kun, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            lo.gm("TTAD.EndCardScene", th.getMessage());
        }
        if (vjVar != null && (sfVar = vjVar.gm) != null) {
            this.vy.qcw = sfVar.qcw;
            this.vy.xb = sfVar.xb;
            if ((this.hc || this.dax) && !rnn()) {
                this.vy.vh.set(sfVar.vh.get());
            }
            this.vy.fum.pcc(sfVar.fum.vj());
            pcc(this.vy, sfVar);
        }
        if (this.hc || this.dax) {
            try {
                mk();
            } catch (Throwable unused) {
                iv();
            }
        }
        if (this.vy != null && this.qf != null) {
            this.vy.ra = this.qf.pcc;
        }
        atb();
        a_();
        vh();
        if (!this.pcc || this.qf == null || this.qf.pcc() == null) {
            return;
        }
        this.qf.pcc().vj(this.vy != null ? this.vy.vy.get() : -1);
    }

    private void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2) {
        if (!this.hc || rnn() || sfVar == null || sfVar2 == null) {
            return;
        }
        try {
            this.mk = sfVar2.fum.gbb();
            if (this.wh.gd()) {
                this.mk = sfVar2.wh();
            }
            this.ye = sfVar2.fum.yt();
            this.atb = kun.pcc(this.wh, sfVar2.fum.nac(), sfVar2.fum.lu());
        } catch (Throwable unused) {
        }
    }

    private void pcc(of ofVar, Bundle bundle) {
        Activity lrr = lrr();
        this.vy = new com.bytedance.sdk.openadsdk.component.reward.pcc.sf(lrr, this.sf, ofVar, this, 2, this.qf.sf());
        this.vy.rt = this.dax;
        this.vy.wax = this.pcc;
        this.vy.bbd = this.vy.gdh && !this.pcc;
        this.vy.gdh = this.qf.wh();
        this.vy.otd = this.hc;
        this.vy.ei = this.qf.oo();
        if (!this.pcc) {
            this.vy.vgx = this.qf.yt();
        }
        this.vy.ywp = this;
        this.vy.atb = this.qf.tz();
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(this.vy, lrr.getIntent(), bundle);
        this.gm = com.bytedance.sdk.openadsdk.component.reward.sf.wh.pcc(this.vy);
        this.vy.ew = this.gm;
        new StringBuilder("init: mAdType = ").append(this.gm);
    }

    private void mk() {
        if (this.tsz) {
            return;
        }
        this.tsz = true;
        if (!this.pcc) {
            this.vy.vgx = this.qf.yt();
        }
        this.vy.nn.pcc(this.gm);
        this.gm.pcc(this, this.sf);
        this.gm.ork();
    }

    private void atb() {
        if (this.jsj) {
            return;
        }
        this.jsj = true;
        if (this.hc) {
            this.qf.pcc(pcc(), rnn());
        } else {
            this.qf.pcc(pcc());
        }
        this.gm.yt();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected void a_() {
        if (this.qf != null && this.qf.gm()) {
            super.a_();
            return;
        }
        final View ork = this.vy.mu.ork();
        if (ork != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.vj.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (vj.this.vy.ye.lo()) {
                        boolean hc = vj.this.vy.lq.hc();
                        vj.this.vy.ye.wh(hc);
                        vj.this.vy.mu.wh(8);
                        View view2 = ork;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                            ((com.bytedance.sdk.openadsdk.core.wh.oo) view2).setImageResource(tz.oo(vj.this.vy.kun, "tt_close_btn"));
                        }
                        vj.this.vy.rj.sendEmptyMessageDelayed(600, 5000L);
                        if (!of.gm(vj.this.vy.sf)) {
                            return;
                        }
                        if (of.gm(vj.this.vy.sf) && hc) {
                            return;
                        }
                    }
                    vj.this.vy.ye.fum();
                    vj.this.vy.lq.vh();
                    vj.this.vy.jsj.wh();
                    if (atb.oo(vj.this.vy.sf) && vj.this.pcc(true, true, (Runnable) null)) {
                        return;
                    }
                    vj.this.iv();
                }
            };
            ork.setOnClickListener(onClickListener);
            ork.setTag(ork.getId(), onClickListener);
        }
        this.vy.zti.pcc(new com.bytedance.sdk.openadsdk.component.reward.top.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.vj.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view) {
                vj vjVar = vj.this;
                if (vjVar.pcc(atb.gm(vjVar.vy.sf), false, (Runnable) null) || vj.this.kj()) {
                    return;
                }
                if (atb.vj(vj.this.vy.sf)) {
                    if (atb.kj(vj.this.vy.sf)) {
                        vj.this.vy.of.vy();
                        return;
                    }
                    View view2 = ork;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        vj.this.iv();
                        return;
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.lo.pcc(vj.this.vy.sf) && !vj.this.vy.hc.get()) {
                    vj.this.iv();
                } else {
                    vj.this.iv();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void pcc(View view, String str) {
                vj.this.pcc(str);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.sf
            public void sf(View view) {
                vj.this.e_();
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
                vj vjVar = vj.this;
                vjVar.sf(vjVar.vy);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void e_() {
        this.vy.mk.pcc(this.gm);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean f_() {
        return this.vy.xb;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(String str) {
        this.vy.xb = !this.vy.xb;
        new Object[]{"rewarded_video", "will set is Mute " + this.vy.xb + " mLastVolume=" + this.vy.atb.pcc()};
        this.vy.fum.pcc(this.vy.xb, str);
        this.vy.ye.vj(this.vy.xb);
        this.vy.of.sf(this.vy.xb);
    }

    public boolean kj() {
        if (this.pcc || this.qf == null || !this.qf.lo()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), this.wh, this.vy.vj, "skip", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.vj.3
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject sf() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(IronSourceConstants.EVENTS_DURATION, vj.this.mk);
                        jSONObject.put("percent", vj.this.ye);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject pcc() {
                    if (vj.this.atb != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", vj.this.vy.pcc);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
        }
        this.qf.pcc(this, true, false, false, 4);
        return true;
    }

    private boolean ew() {
        if (this.wh.wh()) {
            return this.vy.vy.get();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(Activity activity) {
        super.pcc(activity);
        if (this.vy == null) {
            return;
        }
        this.vy.qy.pcc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void gm() {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar;
        super.gm();
        if (this.vy == null || (sfVar = this.gm) == null) {
            return;
        }
        sfVar.jr();
        this.vy.ri = true;
        if (ew()) {
            this.vy.zti.pcc(this.vy.sf.dk());
        }
        this.vy.mu.dax();
        this.vy.ye.nac();
        this.vy.of.vj();
        if (this.gm.sf()) {
            this.vy.fum.pcc(this.gm);
            this.vy.fum.pcc(false, this, this.yt != 0);
        }
        this.yt++;
        if (this.vy.yt != null) {
            this.vy.yt.qf();
        }
        this.vy.qy.pcc(this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void oo() {
        super.oo();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.lu();
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public final void pcc(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.pcc(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.qf == null || rnn()) {
            return;
        }
        if (this.qf != null && this.qf.qy() == null) {
            if (this.qf.gm()) {
                if (this.gpj != null && this.gpj.pcc(atb.gm(this.vy.sf), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.vj.4
                    @Override // java.lang.Runnable
                    public void run() {
                        vj.this.tmh();
                    }
                })) {
                    return;
                }
            } else if (pcc(atb.gm(this.vy.sf), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.vj.5
                @Override // java.lang.Runnable
                public void run() {
                    vj.this.tmh();
                }
            })) {
                return;
            }
        }
        tmh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tmh() {
        sf.vj vjVar = new sf.vj(7, this.vy);
        vjVar.oo = this.vy.xb;
        this.qf.sf(this, vjVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public final void vh() {
        if (this.qf == null) {
            return;
        }
        this.vy.pq.pcc(this.qy.pcc.getBoolean("isSkip", false), this.qy.pcc.getBoolean("force", false), this.qy.pcc.getBoolean("isFromLandingPage", false), this.gm, this.qy.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void hc() {
        super.hc();
        if (this.vy == null || com.bytedance.sdk.component.utils.sf.pcc(lrr())) {
            return;
        }
        this.vy.ye.qy();
        com.bytedance.sdk.openadsdk.utils.oo.pcc(lrr(), this.vy.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public final void gbb() {
        super.gbb();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.nac();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void nac() {
        zsj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void sf(boolean z) {
        if (!z || this.vy.gdh) {
            return;
        }
        zsj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void vj() {
        lo.pcc("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.ork + ",scene = " + this);
        if (this.qf != null) {
            this.qf.pcc(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.sf
    public void pcc(boolean z) {
        if (this.qf != null) {
            this.qf.pcc(this, z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void lo() {
        super.lo();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar != null) {
            sfVar.lo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public boolean tz() {
        return this.vy != null && this.vy.fum.pq();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    protected boolean c_() {
        return this.vy.oo;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public String d_() {
        return this.vy.vj;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void pcc(kj kjVar, kj kjVar2, sf.vj vjVar) {
        super.pcc(kjVar, kjVar2, vjVar);
        lo.pcc("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.ork + ",scene = " + this + ",newScene = " + kjVar2 + ",oldScene = " + kjVar + ",isPlayable = " + this.dax);
        boolean z = this.ork == kjVar2.ork + 1;
        if (kjVar != null && this.vy != null) {
            this.vy.xb = vjVar.oo;
        }
        if (z) {
            lo.pcc("TTAD.EndCardScene", "preload index =" + this.ork + ",new index =" + kjVar2.ork + ",isPlayableProxy = " + this.dax);
            gh();
        }
        if (kjVar == null && this.pcc) {
            lo.pcc("TTAD.EndCardScene", "preload agg-endcard =" + this.ork + ",new index =" + kjVar2.ork + ",isPlayableProxy = " + this.dax);
            gh();
        }
    }

    private void gh() {
        try {
            mk();
        } catch (Throwable unused) {
            iv();
        }
        atb();
        if (!com.bytedance.sdk.openadsdk.core.model.lo.qf(this.wh) || this.pcc) {
            return;
        }
        bg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(final boolean z, boolean z2, final Runnable runnable) {
        if (!this.vy.oo || this.qf.nac()) {
            return false;
        }
        if (!z2 && this.qf.hc()) {
            return false;
        }
        if (!lu.oo().kj(String.valueOf(this.vy.wh))) {
            if (!z2) {
                return false;
            }
            if (runnable == null && z) {
                iv();
                return true;
            }
        }
        this.vy.nac.set(true);
        if (z) {
            this.vy.of.wh();
        }
        final com.bytedance.sdk.openadsdk.core.widget.sf sfVar = new com.bytedance.sdk.openadsdk.core.widget.sf(this.vy.rnn);
        this.gm.tmg = sfVar;
        if (z) {
            this.gm.tmg.pcc(oo).gm(vj).oo(lo);
        } else {
            this.gm.tmg.pcc(fum).gm(tz).oo(lo);
        }
        this.gm.tmg.pcc(new sf.InterfaceC0181sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.vj.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void pcc() {
                if (z) {
                    vj.this.vy.of.pcc(1000);
                }
                sfVar.dismiss();
                vj.this.vy.nac.set(false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sf.InterfaceC0181sf
            public void sf() {
                sfVar.dismiss();
                vj.this.qf.sf(true);
                vj.this.vy.nac.set(false);
                vj.this.vy.of.sf(Integer.MAX_VALUE);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (z) {
                    vj.this.vy.jsj.wh();
                    vj.this.iv();
                } else {
                    vj.this.kj();
                }
            }
        }).show();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gpj() {
        super.gpj();
        com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar = this.gm;
        if (sfVar == null) {
            return;
        }
        sfVar.gpj();
    }

    public void fum() {
        if (rnn()) {
            return;
        }
        sf.vj vjVar = new sf.vj(8, this.vy);
        vjVar.oo = this.vy.xb;
        if (this.qf != null) {
            this.qf.pcc(this, vjVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public void gm(boolean z) {
        long j = this.lq ? this.vy.qcw : 0L;
        if (this.vy != null && this.vy.jsj != null) {
            this.vy.jsj.sf(z);
            this.vy.jsj.gm(z);
            if (z && j > 0) {
                this.vy.qcw = j;
            }
        }
        if (z) {
            this.lq = false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.kj
    public com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt() {
        return this.vy;
    }

    public boolean of() {
        return this.vy.ye.tsz();
    }
}
