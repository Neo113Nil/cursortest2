package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class vj extends nac<com.bytedance.sdk.component.adexpress.wh.qf> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac
    protected void oo() {
    }

    public vj(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        super(context, vjVar, qfVar);
        pcc(qfVar);
    }

    private void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.kj(this.sf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 81;
        this.pcc.setLayoutParams(layoutParams);
        if (this.pcc instanceof com.bytedance.sdk.component.adexpress.wh.kj) {
            ((com.bytedance.sdk.component.adexpress.wh.kj) this.pcc).setButtonText(this.oo.erj());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac, com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        this.pcc.pcc();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac, com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        this.pcc.sf();
    }
}
