package com.bytedance.sdk.component.adexpress.dynamic.gm;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.material.MenuKt;
import com.bytedance.sdk.component.adexpress.wh.lu;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh extends nac<com.bytedance.sdk.component.adexpress.wh.wh> {
    @Override // com.bytedance.sdk.component.adexpress.dynamic.gm.nac
    protected void oo() {
    }

    public wh(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj vjVar, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, vjVar, qfVar);
        this.sf = context;
        this.oo = qfVar;
        this.gm = vjVar;
        pcc(i, i2, i3, jSONObject, qfVar);
    }

    private void pcc(int i, int i2, int i3, JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        int i4;
        this.pcc = new com.bytedance.sdk.component.adexpress.wh.wh(this.sf, i, i2, i3, jSONObject);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.sf, 300.0f));
        layoutParams.gravity = 81;
        Context context = this.sf;
        if (qfVar.hpk() > 0) {
            i4 = qfVar.hpk();
        } else {
            i4 = com.bytedance.sdk.component.adexpress.oo.sf() ? 0 : MenuKt.InTransitionDuration;
        }
        layoutParams.bottomMargin = (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, i4);
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setClipChildren(false);
        this.pcc.setSlideText(this.oo.erj());
        if (this.pcc instanceof com.bytedance.sdk.component.adexpress.wh.wh) {
            ((com.bytedance.sdk.component.adexpress.wh.wh) this.pcc).setShakeText(this.oo.ptr());
            final com.bytedance.sdk.component.adexpress.wh.gpj shakeView = ((com.bytedance.sdk.component.adexpress.wh.wh) this.pcc).getShakeView();
            if (shakeView != null) {
                shakeView.setOnShakeViewListener(new lu.pcc() { // from class: com.bytedance.sdk.component.adexpress.dynamic.gm.wh.1
                });
                shakeView.setOnClickListener((View.OnClickListener) this.gm.getDynamicClickListener());
            }
        }
    }
}
