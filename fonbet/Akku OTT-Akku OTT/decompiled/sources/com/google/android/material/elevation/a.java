package com.google.android.material.elevation;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.material.resources.b;
import com.haryanvi.netstream.R;

/* loaded from: classes4.dex */
public final class a {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public a(@NonNull Context context) {
        boolean b = b.b(context, R.attr.elevationOverlayEnabled, false);
        int a = com.google.android.material.color.a.a(context, R.attr.elevationOverlayColor, 0);
        int a2 = com.google.android.material.color.a.a(context, R.attr.elevationOverlayAccentColor, 0);
        int a3 = com.google.android.material.color.a.a(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = b;
        this.b = a;
        this.c = a2;
        this.d = a3;
        this.e = f2;
    }
}
