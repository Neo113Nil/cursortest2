package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class sf implements qf {
    private com.bytedance.sdk.component.adexpress.wh.gm pcc;

    public sf(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.gm(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 180.0f), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, 180.0f));
        layoutParams.gravity = 17;
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setGuideText(qfVar.erj());
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
    public com.bytedance.sdk.component.adexpress.wh.gm gm() {
        return this.pcc;
    }
}
