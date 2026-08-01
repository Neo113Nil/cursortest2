package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.material.MenuKt;

/* loaded from: classes4.dex */
public class lu implements qf<com.bytedance.sdk.component.adexpress.wh.vh> {
    private final com.bytedance.sdk.component.adexpress.wh.vh pcc;

    public lu(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        int i;
        com.bytedance.sdk.component.adexpress.wh.vh vhVar = new com.bytedance.sdk.component.adexpress.wh.vh(context);
        this.pcc = vhVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        if (qfVar.hpk() > 0) {
            i = qfVar.hpk();
        } else {
            i = com.bytedance.sdk.component.adexpress.oo.sf() ? 0 : MenuKt.InTransitionDuration;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, i);
        vhVar.setLayoutParams(layoutParams);
        vhVar.setClipChildren(false);
        vhVar.setText(qfVar.erj());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void pcc() {
        com.bytedance.sdk.component.adexpress.wh.vh vhVar = this.pcc;
        if (vhVar != null) {
            vhVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    public void sf() {
        com.bytedance.sdk.component.adexpress.wh.vh vhVar = this.pcc;
        if (vhVar != null) {
            vhVar.sf();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.qf
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.adexpress.wh.vh gm() {
        return this.pcc;
    }
}
