package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class hc implements qf {
    private com.bytedance.sdk.component.adexpress.wh.gbb pcc;

    public hc(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.gbb(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(vjVar.getDynamicHeight(), vjVar.getDynamicHeight());
        layoutParams.gravity = 8388629;
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
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.wh.gbb gm() {
        return this.pcc;
    }
}
