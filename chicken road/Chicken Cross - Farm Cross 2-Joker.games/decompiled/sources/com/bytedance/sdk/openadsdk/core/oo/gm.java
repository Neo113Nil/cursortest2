package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.lo;
import com.bytedance.sdk.openadsdk.qy.sf.vj;

/* loaded from: classes4.dex */
public class gm extends oo {
    private com.bytedance.sdk.openadsdk.pcc.pcc.sf kj;
    private int ork;
    private int vy;

    public gm(Context context, of ofVar, AdSlot adSlot, boolean z) {
        super(context, ofVar, adSlot, z);
        this.vy = 1;
        this.ork = -1;
    }

    public void pcc(com.bytedance.sdk.openadsdk.pcc.pcc.sf sfVar) {
        if (this.sf != null) {
            ((lo) this.sf).nac();
            this.kj = sfVar;
            this.ork = 3;
        }
    }

    public void pcc() {
        if (this.sf != null) {
            ((lo) this.sf).dax();
            this.ork = 2;
        }
    }

    public void sf() {
        if (this.sf != null) {
            ((lo) this.sf).lu();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oo.oo
    protected void gm() {
        this.sf = new lo(this.pcc, this.gm, this.oo, this.wh, this.qf) { // from class: com.bytedance.sdk.openadsdk.core.oo.gm.1
            @Override // com.bytedance.sdk.openadsdk.core.ork.fum
            protected vj.pcc gm(int i) {
                return gm.this.pcc(super.gm(i));
            }
        };
        com.bytedance.sdk.openadsdk.core.jr.sf.gm videoController = ((lo) this.sf).getVideoController();
        if (videoController != null) {
            videoController.oo(this.vy);
        }
        addView(this.sf, new ViewGroup.LayoutParams(-1, -1));
        if (this.vj != null) {
            setExpressInteractionListener(this.vj);
        }
        if (this.sf != null) {
            ((lo) this.sf).setVideoAdListener(new com.bytedance.sdk.openadsdk.pcc.sf.gm() { // from class: com.bytedance.sdk.openadsdk.core.oo.gm.2
                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void pcc(int i, int i2) {
                }

                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void sf(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void pcc(PAGNativeAd pAGNativeAd) {
                    if (gm.this.ork != 3) {
                        if (gm.this.ork == 2) {
                            gm.this.pcc();
                        }
                    } else {
                        gm gmVar = gm.this;
                        gmVar.pcc(gmVar.kj);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void gm(PAGNativeAd pAGNativeAd) {
                    if (gm.this.kj != null) {
                        gm.this.kj.pcc();
                    }
                }
            });
        }
    }

    public com.bytedance.sdk.openadsdk.gpj.gm.pcc getVideoModel() {
        if (this.sf != null) {
            return ((lo) this.sf).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.oo.oo
    public void oo() {
        com.bytedance.sdk.openadsdk.core.jr.sf.gm videoController;
        if ((this.sf instanceof lo) && (videoController = ((lo) this.sf).getVideoController()) != null) {
            this.vy = videoController.tsx();
        }
        super.oo();
    }
}
