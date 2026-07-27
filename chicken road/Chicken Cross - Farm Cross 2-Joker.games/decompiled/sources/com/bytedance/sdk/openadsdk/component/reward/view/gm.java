package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardFullExpressAdListenerProxy;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.ork.dax;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.lu;
import com.bytedance.sdk.openadsdk.core.ork.tsz;
import com.bytedance.sdk.openadsdk.oo.gpj;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm extends fum {
    public static float pcc = 100.0f;
    lu gm;
    public int oo;
    private com.bytedance.sdk.openadsdk.tz.pcc.pcc qf;
    dax sf;
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf vj;
    private float wh;

    public gm(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, AdSlot adSlot, String str) {
        super(sfVar.rnn, sfVar.sf, adSlot, str, sfVar.xb, !sfVar.gdh);
        this.oo = 1;
        this.wh = -1.0f;
        this.vj = sfVar;
        setVideoBusiness(sfVar.tsx);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected void qf() {
        this.jr = true;
        this.hc = new FrameLayout(this.vy);
        if (!com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tmg) && !com.bytedance.sdk.openadsdk.core.hc.vj.sf(this.tmg)) {
            addView(this.hc, new FrameLayout.LayoutParams(-1, -1));
        }
        super.qf();
        com.bytedance.sdk.component.vy.qf webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
        gbb();
        setVideoFrameChangeListener(new com.bytedance.sdk.openadsdk.hc.kj() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gm.1
            @Override // com.bytedance.sdk.openadsdk.hc.kj
            public void pcc(gbb gbbVar) {
                gm.this.pcc(gbbVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected void kj() {
        if ((this.vy instanceof TTBaseVideoActivity) && ((TTBaseVideoActivity) this.vy).rnn()) {
            this.nac = new gpj(19, this.ork, this.tmg);
        } else {
            super.kj();
        }
    }

    private void gbb() {
        setBackupListener(new com.bytedance.sdk.component.adexpress.sf.gm() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gm.2
            @Override // com.bytedance.sdk.component.adexpress.sf.gm
            public boolean pcc(ViewGroup viewGroup, int i) {
                try {
                    ((fum) viewGroup).tz();
                    gm.this.gm = new lu(viewGroup.getContext());
                    gm.this.gm.pcc(gm.this.tmg, (fum) viewGroup, gm.this.vj.nn);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.jr
    public void pcc(com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar, gbb gbbVar) {
        this.atb = ooVar;
        if (this.tmg != null && this.tmg.nmd()) {
            super.pcc(ooVar, gbbVar);
            return;
        }
        if (ooVar instanceof tsz) {
            tsz tszVar = (tsz) ooVar;
            if (tszVar.yt() != null) {
                tszVar.yt().pcc((dax) this);
            }
        }
        if (gbbVar != null && gbbVar.sf()) {
            pcc(gbbVar);
            this.oo = ooVar.gm();
            if ((this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) && atb.gm(this.tmg)) {
                gm(gbbVar);
            }
            if (ooVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh) {
                this.vj.fum.vj(true);
            }
        }
        super.pcc(ooVar, gbbVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected boolean vy() {
        if (this.vj.ywp == null || !this.vj.ywp.rj().jsj()) {
            return true;
        }
        return this.vj.ri;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected boolean ork() {
        return this.vj.ywp == null || !this.vj.ywp.rj().jsj();
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setSoundMute(boolean z) {
        super.setSoundMute(z);
        com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.qf;
        if (pccVar != null) {
            pccVar.pcc(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void vh() {
        super.vh();
        if (this.qf != null) {
            if (this.vj.ywp != null && this.vj.ywp.rj() != null) {
                this.qf.pcc(this.vj.ywp.rj().of());
            }
            this.qf.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void tmg() {
        super.tmg();
        if (this.qf != null) {
            if (this.vj.ywp != null && this.vj.ywp.rj() != null) {
                this.qf.pcc(true);
            }
            this.qf.gm();
        }
    }

    private void gm(gbb gbbVar) {
        FrameLayout nac;
        boolean z;
        boolean z2;
        try {
            if (!(gbbVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.sf) || (nac = ((com.bytedance.sdk.openadsdk.core.hc.wh.sf) gbbVar).nac()) == null) {
                return;
            }
            boolean z3 = true;
            if (this.vj.ywp == null || this.vj.ywp.rj() == null) {
                z = true;
                z2 = false;
            } else {
                z2 = this.vj.ywp.rj().vh() == this.vj.ywp;
                if (!this.vj.ywp.rj().of() && z2) {
                    z3 = false;
                }
                z = z3;
            }
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = new com.bytedance.sdk.openadsdk.tz.pcc.pcc(this.vy, this.tmg, this.vj.zsj, z, nac);
            this.qf = pccVar;
            pccVar.pcc(this.vj.tsx);
            this.qf.pcc(false, (com.bytedance.sdk.openadsdk.hc.qf) null);
            this.qf.pcc();
            lo.pcc("TTAD.FRExpressView", "initPlayable success mute = " + this.vj.xb + ",isCurrentScene->" + z2 + ",isMute = " + z);
        } catch (Throwable th) {
            new Object[]{th};
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    public void hc() {
        try {
            com.bytedance.sdk.openadsdk.tz.pcc.pcc pccVar = this.qf;
            if (pccVar != null) {
                pccVar.oo();
            }
        } catch (Throwable th) {
            new Object[]{th};
        }
        if (!qy() && (getExpressInteractionListener() instanceof PAGRewardFullExpressAdListenerProxy)) {
            ((PAGRewardFullExpressAdListenerProxy) getExpressInteractionListener()).triggerUnfinishedFail(this);
        }
        super.hc();
    }

    public void setExpressVideoListenerProxy(dax daxVar) {
        this.sf = daxVar;
    }

    public void pcc(final gbb gbbVar) {
        if (gbbVar == null) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.gm.3
            @Override // java.lang.Runnable
            public void run() {
                gm.this.oo(gbbVar);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(String str, JSONObject jSONObject) {
        super.pcc(str, jSONObject);
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.pcc(str, jSONObject);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r1 != 1) goto L17;
     */
    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vh vhVar = this.vj.mu;
        if (vhVar != null && vhVar.dax != null) {
            com.bytedance.sdk.openadsdk.core.model.lo loVar = vhVar.dax;
            if (loVar.vy()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.wh = motionEvent.getY();
                }
                if (rj.pcc(this.wh, motionEvent.getY(), this.vy)) {
                    loVar.sf(5);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo(gbb gbbVar) {
        if (gbbVar == null) {
            return;
        }
        double vj = gbbVar.vj();
        double wh = gbbVar.wh();
        double qf = gbbVar.qf();
        double kj = gbbVar.kj();
        int sf = rj.sf(this.vy, (float) vj);
        int sf2 = rj.sf(this.vy, (float) wh);
        int sf3 = rj.sf(this.vy, (float) qf);
        int sf4 = rj.sf(this.vy, (float) kj);
        if ((kj != 0.0d && qf != 0.0d) || this.atb.gm() == 7 || this.atb.gm() == 10 || (this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo)) {
            if ((this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) && (gbbVar instanceof com.bytedance.sdk.openadsdk.core.hc.wh.sf)) {
                FrameLayout dax = ((com.bytedance.sdk.openadsdk.core.hc.wh.sf) gbbVar).dax();
                if (dax != null) {
                    if (this.hc.getParent() != null) {
                        ((ViewGroup) this.hc.getParent()).removeView(this.hc);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    dax.addView(this.hc, layoutParams);
                    return;
                }
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.hc.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new FrameLayout.LayoutParams(sf3, sf4);
            }
            layoutParams2.width = sf3;
            layoutParams2.height = sf4;
            layoutParams2.topMargin = sf2;
            layoutParams2.leftMargin = sf;
            layoutParams2.setMarginStart(layoutParams2.leftMargin);
            layoutParams2.setMarginEnd(layoutParams2.rightMargin);
            this.hc.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(boolean z, String str) {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.pcc(z, str);
        }
        setSoundMute(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public boolean pcc(JSONObject jSONObject) {
        new StringBuilder("setPlaybackSpeed,params:").append(jSONObject);
        dax daxVar = this.sf;
        if (daxVar != null) {
            return daxVar.pcc(jSONObject);
        }
        return super.pcc(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public boolean sf(JSONObject jSONObject) {
        return com.bytedance.sdk.openadsdk.component.reward.sf.pcc(this.vj);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc() {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void sf() {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i) {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.pcc(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public long gm() {
        dax daxVar = this.sf;
        if (daxVar != null) {
            return daxVar.gm();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public long oo() {
        dax daxVar = this.sf;
        if (daxVar != null) {
            return daxVar.oo();
        }
        return 0L;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public int vj() {
        dax daxVar = this.sf;
        if (daxVar == null) {
            return 0;
        }
        int vj = daxVar.vj();
        qf(vj);
        return vj;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void wh() {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.wh();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i, gbb gbbVar) {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.pcc(i, gbbVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.kj
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        if (i != -1 && gmVar != null && i == 3) {
            wh();
        } else {
            super.pcc(view, i, gmVar);
        }
    }

    public FrameLayout getVideoFrameLayout() {
        if (of()) {
            return this.gm.getVideoContainer();
        }
        return this.hc;
    }

    public View getBackupContainerBackgroundView() {
        if (of()) {
            return this.gm.getBackupContainerBackgroundView();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void sf(int i) {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.sf(i);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void pcc(int i, String str) {
        dax daxVar = this.sf;
        if (daxVar != null) {
            daxVar.pcc(i, str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected vj.pcc gm(int i) {
        vj.pcc gm = super.gm(i);
        if (this.vj.gdh && this.vj.ywp != null) {
            gm.sf = this.vj.ywp.vh;
        }
        return gm;
    }

    public void pcc(long j, long j2) {
        if (this.atb instanceof com.bytedance.sdk.openadsdk.core.hc.wh.oo) {
            ((com.bytedance.sdk.openadsdk.core.hc.wh.oo) this.atb).pcc(j, j2);
        }
    }
}
