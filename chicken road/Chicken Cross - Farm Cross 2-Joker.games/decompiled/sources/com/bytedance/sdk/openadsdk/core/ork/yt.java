package com.bytedance.sdk.openadsdk.core.ork;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.sf.hc;
import com.bytedance.sdk.openadsdk.AdSlot;

/* loaded from: classes4.dex */
public class yt extends fum {
    private String gm;
    private boolean oo;
    public int pcc;
    private vj sf;

    public yt(Activity activity, Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot, String str) {
        super(activity, context, ofVar, adSlot, str);
        this.pcc = 1;
        this.oo = true;
    }

    public void setRewardControlListener(com.bytedance.sdk.openadsdk.component.reward.gm.wh whVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(whVar);
        }
    }

    public void setAdInteractionListener(com.bytedance.sdk.openadsdk.component.reward.gm.pcc pccVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(pccVar);
        }
    }

    public void setVideoTrackListener(com.bytedance.sdk.openadsdk.component.reward.gm.vy vyVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(vyVar);
        }
    }

    public void setHeartBeatListener(com.bytedance.sdk.openadsdk.component.reward.gm.oo ooVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(ooVar);
        }
    }

    public void setLandingPageListener(com.bytedance.sdk.openadsdk.component.reward.gm.pcc.gm gmVar) {
        if (getJsObject() != null) {
            getJsObject().pcc(gmVar);
        }
    }

    public void gbb() {
        if (getJsObject() != null) {
            getJsObject().lo();
        }
    }

    public void pcc(String str, int i, int i2) {
        if (getJsObject() != null) {
            getJsObject().pcc(str, i, i2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected void qf() {
        this.jr = true;
        super.qf();
        com.bytedance.sdk.component.vy.qf webView = getWebView();
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected void kj() {
        this.nac = new com.bytedance.sdk.openadsdk.oo.gpj(11, this.ork, this.tmg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.jr
    public void pcc(com.bytedance.sdk.component.adexpress.sf.oo<? extends View> ooVar, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        this.atb = ooVar;
        super.pcc(ooVar, gbbVar);
    }

    public void setDislikeClickListener(vj vjVar) {
        this.sf = vjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.openadsdk.core.ork.dax
    public void wh() {
        vj vjVar = this.sf;
        if (vjVar != null) {
            vjVar.pcc(this.gm);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum, com.bytedance.sdk.component.adexpress.sf.kj
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        if (i != -1 && gmVar != null && i == 3) {
            if (gmVar instanceof com.bytedance.sdk.openadsdk.core.model.dax) {
                this.gm = ((com.bytedance.sdk.openadsdk.core.model.dax) gmVar).dax;
            }
            wh();
            return;
        }
        super.pcc(view, i, gmVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected boolean lo() {
        return this.oo;
    }

    public void setShouldNotifyAdVisibility(boolean z) {
        this.oo = z;
    }

    public void setWebTouchProxy(com.bytedance.sdk.component.vy.vj vjVar) {
        if (getWebView() != null) {
            getWebView().setWebTouchProxy(vjVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.fum
    protected void pcc(hc.pcc pccVar) {
        super.pcc(pccVar);
        pccVar.wh(com.bytedance.sdk.openadsdk.core.model.lo.vj(this.tmg));
    }
}
