package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public final class b extends d {
    public final SideSheetBehavior<? extends View> a;

    public b(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    public final float b(int i) {
        float f = this.a.m;
        return (f - i) / (f - c());
    }

    @Override // com.google.android.material.sidesheet.d
    public final int c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
    }

    @Override // com.google.android.material.sidesheet.d
    public final int d() {
        return this.a.m;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int e() {
        return this.a.m;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int f() {
        return c();
    }

    @Override // com.google.android.material.sidesheet.d
    public final <V extends View> int g(@NonNull V v) {
        return v.getLeft() - this.a.o;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int h(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.d
    public final int i() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean j(float f) {
        return f < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean k(@NonNull View view) {
        return view.getLeft() > (c() + this.a.m) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean l(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean m(@NonNull View view, float f) {
        float right = view.getRight();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        float abs = Math.abs((f * sideSheetBehavior.k) + right);
        sideSheetBehavior.getClass();
        return abs > 0.5f;
    }

    @Override // com.google.android.material.sidesheet.d
    public final void n(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a.m;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }
}
