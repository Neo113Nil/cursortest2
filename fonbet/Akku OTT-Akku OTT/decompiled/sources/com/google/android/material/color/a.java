package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.resources.b;

/* loaded from: classes4.dex */
public final class a {
    @ColorInt
    public static int a(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        Integer num;
        TypedValue a = b.a(context, i);
        if (a != null) {
            int i3 = a.resourceId;
            num = Integer.valueOf(i3 != 0 ? ContextCompat.getColor(context, i3) : a.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    @ColorInt
    public static int b(@NonNull View view, @AttrRes int i) {
        Context context = view.getContext();
        TypedValue c = b.c(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = c.resourceId;
        return i2 != 0 ? ContextCompat.getColor(context, i2) : c.data;
    }

    @ColorInt
    public static int c(@FloatRange(from = 0.0d, to = 1.0d) float f, @ColorInt int i, @ColorInt int i2) {
        return ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i2, Math.round(Color.alpha(i2) * f)), i);
    }
}
