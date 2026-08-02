package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes4.dex */
public final class a extends d {
    public final SideSheetBehavior<? extends View> a;

    public a(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int a(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.d
    public final float b(int i) {
        float d = d();
        return (i - d) / (c() - d);
    }

    @Override // com.google.android.material.sidesheet.d
    public final int c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
    }

    @Override // com.google.android.material.sidesheet.d
    public final int d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        return (-sideSheetBehavior.l) - sideSheetBehavior.o;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int e() {
        return this.a.o;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int f() {
        return -this.a.l;
    }

    @Override // com.google.android.material.sidesheet.d
    public final <V extends View> int g(@NonNull V v) {
        return v.getRight() + this.a.o;
    }

    @Override // com.google.android.material.sidesheet.d
    public final int h(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.d
    public final int i() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean j(float f) {
        return f > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean k(@NonNull View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean l(float f, float f2) {
        return Math.abs(f) > Math.abs(f2) && Math.abs(f) > ((float) 500);
    }

    @Override // com.google.android.material.sidesheet.d
    public final boolean m(@NonNull View view, float f) {
        float left = view.getLeft();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.a;
        float abs = Math.abs((f * sideSheetBehavior.k) + left);
        sideSheetBehavior.getClass();
        return abs > 0.5f;
    }

    @Override // com.google.android.material.sidesheet.d
    public final void n(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.m) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
