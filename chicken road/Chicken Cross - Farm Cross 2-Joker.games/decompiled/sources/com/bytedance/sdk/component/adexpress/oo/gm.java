package com.bytedance.sdk.component.adexpress.oo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes4.dex */
public class gm {
    public static Drawable pcc(Context context, com.bytedance.sdk.component.adexpress.dynamic.oo.qf qfVar) {
        if (context == null || qfVar == null) {
            return null;
        }
        return pcc(context, (int) qf.pcc(context, qfVar.nac()), qfVar.dax(), qfVar.mk());
    }

    public static Drawable pcc(Context context, int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i, i2);
        }
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }
}
