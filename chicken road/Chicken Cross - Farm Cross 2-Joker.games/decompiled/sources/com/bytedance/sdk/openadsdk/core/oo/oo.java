package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class oo extends com.bytedance.sdk.openadsdk.core.wh.gm {
    protected of gm;
    private int kj;
    protected AdSlot oo;
    protected final Context pcc;
    protected boolean qf;
    protected fum sf;
    protected PAGBannerAdWrapperListener vj;
    private boolean vy;
    protected String wh;

    public oo(Context context, of ofVar, AdSlot adSlot, boolean z) {
        super(context);
        this.wh = "banner_ad";
        this.qf = false;
        this.kj = -1;
        this.vy = false;
        if (ofVar != null && ofVar.ei() != 2) {
            ofVar.lo(1);
        }
        this.qf = z;
        this.pcc = context;
        this.gm = ofVar;
        this.oo = adSlot;
        gm();
        AdSlot adSlot2 = this.oo;
        if (adSlot2 != null) {
            pcc(adSlot2.getExpressViewAcceptedWidth(), this.oo.getExpressViewAcceptedHeight());
        }
    }

    public void setCurrentIndex(int i) {
        this.kj = i;
    }

    protected void gm() {
        fum fumVar = new fum(this.pcc, this.gm, this.oo, this.wh) { // from class: com.bytedance.sdk.openadsdk.core.oo.oo.1
            @Override // com.bytedance.sdk.openadsdk.core.ork.fum
            protected vj.pcc gm(int i) {
                return oo.this.pcc(super.gm(i));
            }
        };
        this.sf = fumVar;
        addView(fumVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.vj;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    protected vj.pcc pcc(vj.pcc pccVar) {
        int i;
        if (this.qf && (i = this.kj) >= 0) {
            pccVar.sf = i;
        }
        return pccVar;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.vj = pAGBannerAdWrapperListener;
        fum fumVar = this.sf;
        if (fumVar != null) {
            fumVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.core.oo.oo.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.vj
                public void pcc() {
                    oo.this.vj.onAdClicked();
                }
            });
            this.sf.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.oo.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    if (oo.this.gm == null || !oo.this.gm.uxz() || oo.this.vj == null) {
                        return;
                    }
                    oo.this.vj.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                    if (oo.this.vj != null) {
                        oo.this.vj.onRenderFail(oo.this, str, i);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    if (oo.this.sf != null) {
                        oo.this.sf.setSoundMute(true);
                        if (!com.bytedance.sdk.openadsdk.core.hc.vj.pcc(oo.this.sf.getDynamicShowType())) {
                            oo.this.pcc(f, f2);
                        } else if (oo.this.oo != null) {
                            oo ooVar = oo.this;
                            ooVar.pcc(ooVar.oo.getExpressViewAcceptedWidth(), oo.this.oo.getExpressViewAcceptedHeight());
                        }
                    }
                    if (oo.this.vy) {
                        oo.this.sf.gpj();
                    }
                    if (oo.this.vj != null) {
                        oo.this.vj.onRenderSuccess(oo.this, f, f2);
                    }
                }
            });
        }
    }

    protected void pcc(float f, float f2) {
        int sf = rj.sf(this.pcc, f);
        int sf2 = rj.sf(this.pcc, f2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(sf, sf2);
        }
        layoutParams.width = sf;
        layoutParams.height = sf2;
        setLayoutParams(layoutParams);
    }

    public void vj() {
        fum fumVar = this.sf;
        if (fumVar != null) {
            fumVar.fum();
        }
    }

    public void oo() {
        if (this.sf != null) {
            ork.sf().wh(this.sf.getClosedListenerKey());
            removeView(this.sf);
            this.sf.hc();
            this.sf = null;
        }
        ork.sf().gpj();
    }

    public fum getCurView() {
        return this.sf;
    }

    public void setIsShow(boolean z) {
        this.vy = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.sf == null) {
            gm();
        }
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.gm);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }
}
