package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class pcc implements qf {
    private com.bytedance.sdk.component.adexpress.wh.sf pcc;

    public pcc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        double ew = qfVar.ew();
        ew = ew == 0.0d ? 1.0d : ew;
        double tmh = qfVar.tmh();
        int dynamicWidth = (int) (vjVar.getDynamicWidth() * 0.32d * ew);
        int dynamicWidth2 = (int) (vjVar.getDynamicWidth() * 0.32d * (tmh != 0.0d ? tmh : 1.0d));
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.sf(context, dynamicWidth, dynamicWidth2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dynamicWidth, dynamicWidth2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, qfVar.bg() - 7);
        layoutParams.leftMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, qfVar.kz() - 3);
        this.pcc.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.sf();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public ViewGroup gm() {
        return this.pcc;
    }
}
