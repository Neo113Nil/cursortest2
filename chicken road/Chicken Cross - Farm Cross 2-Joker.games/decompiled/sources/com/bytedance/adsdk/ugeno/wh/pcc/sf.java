package com.bytedance.adsdk.ugeno.wh.pcc;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes4.dex */
public class sf extends pcc {
    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.wh.pcc.pcc
    public Drawable sf(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
