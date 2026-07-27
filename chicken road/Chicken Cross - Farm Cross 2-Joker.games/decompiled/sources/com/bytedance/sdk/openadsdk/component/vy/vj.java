package com.bytedance.sdk.openadsdk.component.vy;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.wh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class vj extends gm {
    pcc hc;

    public interface pcc {
        void pcc(View view, int i);
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.oo getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public com.bytedance.sdk.openadsdk.core.wh.kj getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public dax getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.vy.gm
    public View getUserInfo() {
        return null;
    }

    public vj(Context context, of ofVar) {
        super(context);
        pcc(context, ofVar);
    }

    private void pcc(Context context, of ofVar) {
        com.bytedance.sdk.openadsdk.core.ork.wh whVar = new com.bytedance.sdk.openadsdk.core.ork.wh(context);
        com.bytedance.sdk.openadsdk.core.ork.oo.pcc().gm(whVar);
        whVar.pcc(ofVar, new wh.sf() { // from class: com.bytedance.sdk.openadsdk.component.vy.vj.1
            @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
            public void pcc(int i, int i2) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
            public void sf() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
            public View pcc() {
                return vj.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.wh.sf
            public void pcc(View view, int i) {
                if (vj.this.hc != null) {
                    vj.this.hc.pcc(view, i);
                }
            }
        }, "open_ad");
        addView(whVar, new ViewGroup.LayoutParams(-1, -1));
        whVar.gpj();
        int sf = rj.sf(context, 9.0f);
        int sf2 = rj.sf(context, 10.0f);
        this.oo = PAGLogoView.createPAGLogoViewByMaterial(context, ofVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, rj.sf(context, 14.0f));
        layoutParams.leftMargin = sf2;
        layoutParams.bottomMargin = sf2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.oo, layoutParams);
        this.tmg = new com.bytedance.sdk.openadsdk.core.widget.gm(context);
        this.tmg.setPadding(sf, 0, sf, 0);
        this.tmg.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(rj.sf(context, 32.0f), rj.sf(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, sf2, sf2);
        addView(this.tmg, layoutParams2);
        if (this.kj != null) {
            addView(this.kj);
        }
    }

    public void setRenderListener(pcc pccVar) {
        this.hc = pccVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hc = null;
    }
}
