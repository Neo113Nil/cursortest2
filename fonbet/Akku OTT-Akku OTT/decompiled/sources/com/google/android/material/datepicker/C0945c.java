package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.haryanvi.netstream.R;

/* renamed from: com.google.android.material.datepicker.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0945c {

    @NonNull
    public final C0944b a;

    @NonNull
    public final C0944b b;

    @NonNull
    public final C0944b c;

    @NonNull
    public final C0944b d;

    @NonNull
    public final C0944b e;

    @NonNull
    public final C0944b f;

    @NonNull
    public final C0944b g;

    @NonNull
    public final Paint h;

    public C0945c(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.google.android.material.resources.b.c(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()).data, com.google.android.material.a.m);
        this.a = C0944b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        this.g = C0944b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.b = C0944b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.c = C0944b.a(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList a = com.google.android.material.resources.c.a(context, obtainStyledAttributes, 7);
        this.d = C0944b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        this.e = C0944b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f = C0944b.a(context, obtainStyledAttributes.getResourceId(10, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
