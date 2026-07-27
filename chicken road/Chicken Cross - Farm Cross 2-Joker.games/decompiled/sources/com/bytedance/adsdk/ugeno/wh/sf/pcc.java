package com.bytedance.adsdk.ugeno.wh.sf;

import android.view.View;
import com.bytedance.adsdk.ugeno.kj.gm;

/* loaded from: classes4.dex */
public class pcc implements gm.vj {
    @Override // com.bytedance.adsdk.ugeno.kj.gm.vj
    public void pcc(View view, float f) {
        view.setPivotX(f < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
