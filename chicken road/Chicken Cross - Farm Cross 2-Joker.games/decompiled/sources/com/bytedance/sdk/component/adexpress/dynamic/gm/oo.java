package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class oo extends nac<com.bytedance.sdk.component.adexpress.wh.qf> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac
    protected void oo() {
    }

    public oo(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        super(context, vjVar, qfVar);
        pcc(qfVar);
    }

    private void pcc(com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.qf(this.sf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, qfVar.hpk());
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setSlideText(this.oo.erj());
        if (this.pcc instanceof com.bytedance.sdk.component.adexpress.wh.qf) {
            ((com.bytedance.sdk.component.adexpress.wh.qf) this.pcc).setButtonText(this.oo.ork());
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
