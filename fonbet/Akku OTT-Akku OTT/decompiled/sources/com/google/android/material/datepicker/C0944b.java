package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.shape.g;

/* renamed from: com.google.android.material.datepicker.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0944b {

    @NonNull
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final com.google.android.material.shape.k f;

    public C0944b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, com.google.android.material.shape.k kVar, @NonNull Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.a = rect;
        this.b = colorStateList2;
        this.c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = kVar;
    }

    @NonNull
    public static C0944b a(@NonNull Context context, @StyleRes int i) {
        Preconditions.checkArgument(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, com.google.android.material.a.n);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a = com.google.android.material.resources.c.a(context, obtainStyledAttributes, 4);
        ColorStateList a2 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, 9);
        ColorStateList a3 = com.google.android.material.resources.c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        com.google.android.material.shape.k a4 = com.google.android.material.shape.k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new com.google.android.material.shape.a(0)).a();
        obtainStyledAttributes.recycle();
        return new C0944b(a, a2, a3, dimensionPixelSize, a4, rect);
    }

    public final void b(@NonNull TextView textView) {
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        com.google.android.material.shape.g gVar2 = new com.google.android.material.shape.g();
        com.google.android.material.shape.k kVar = this.f;
        gVar.b(kVar);
        gVar2.b(kVar);
        gVar.l(this.c);
        gVar.a.j = this.e;
        gVar.invalidateSelf();
        g.b bVar = gVar.a;
        ColorStateList colorStateList = bVar.d;
        ColorStateList colorStateList2 = this.d;
        if (colorStateList != colorStateList2) {
            bVar.d = colorStateList2;
            gVar.onStateChange(gVar.getState());
        }
        ColorStateList colorStateList3 = this.b;
        textView.setTextColor(colorStateList3);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList3.withAlpha(30), gVar, gVar2);
        Rect rect = this.a;
        ViewCompat.setBackground(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
