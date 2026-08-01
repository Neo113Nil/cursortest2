package com.bytedance.adsdk.ugeno.wh.sf;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.adsdk.ugeno.kj.gm;

/* loaded from: classes4.dex */
public class oo implements gm.vj {
    private String pcc;

    public void pcc(String str) {
        this.pcc = str;
    }

    @Override // com.bytedance.adsdk.ugeno.kj.gm.vj
    public void pcc(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f));
            view.setTranslationY(view.getHeight() * f);
        } else {
            view.setAlpha(0.0f);
        }
        if (TextUtils.equals(this.pcc, "cube")) {
            float height = f < 0.0f ? view.getHeight() : 0.0f;
            view.setPivotX(view.getWidth() * 0.5f);
            view.setPivotY(height);
            view.setRotationX(f * (-90.0f));
        }
    }
}
