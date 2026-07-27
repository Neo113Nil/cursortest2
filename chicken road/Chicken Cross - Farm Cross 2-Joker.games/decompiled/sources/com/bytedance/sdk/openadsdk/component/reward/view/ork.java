package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class ork extends vh {
    @Override // com.bytedance.sdk.openadsdk.component.reward.view.vh
    protected boolean pcc() {
        return false;
    }

    public ork(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.vh
    public void pcc(int i, int i2) {
        super.pcc(i, i2);
        if (of.vj(this.oo) && this.oo.bbd() == 3 && this.oo.pv() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.gm.nn.findViewById(nac.tmg);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.oo.ial() == 1) {
                    int sf = rj.sf(lu.pcc(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = sf;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
