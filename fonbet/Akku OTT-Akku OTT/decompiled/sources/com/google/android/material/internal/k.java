package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.m;

/* loaded from: classes4.dex */
public final class k implements OnApplyWindowInsetsListener {
    public final /* synthetic */ com.google.android.material.bottomsheet.b a;
    public final /* synthetic */ m.a b;

    public k(com.google.android.material.bottomsheet.b bVar, m.a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[ADDED_TO_REGION] */
    @Override // androidx.core.view.OnApplyWindowInsetsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        boolean z2;
        m.a aVar = this.b;
        int i = aVar.a;
        int i2 = aVar.b;
        int i3 = aVar.c;
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.mandatorySystemGestures());
        com.google.android.material.bottomsheet.b bVar = this.a;
        BottomSheetBehavior bottomSheetBehavior = bVar.b;
        bottomSheetBehavior.w = insets.top;
        boolean a = m.a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.o;
        if (z3) {
            int systemWindowInsetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
            bottomSheetBehavior.v = systemWindowInsetBottom;
            paddingBottom = systemWindowInsetBottom + i3;
        }
        if (bottomSheetBehavior.p) {
            paddingLeft = insets.left + (a ? i2 : i);
        }
        if (bottomSheetBehavior.q) {
            if (!a) {
                i = i2;
            }
            paddingRight = i + insets.right;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z4 = true;
        if (bottomSheetBehavior.s) {
            int i4 = marginLayoutParams.leftMargin;
            int i5 = insets.left;
            if (i4 != i5) {
                marginLayoutParams.leftMargin = i5;
                z = true;
                if (bottomSheetBehavior.t) {
                    int i6 = marginLayoutParams.rightMargin;
                    int i7 = insets.right;
                    if (i6 != i7) {
                        marginLayoutParams.rightMargin = i7;
                        z = true;
                    }
                }
                if (bottomSheetBehavior.u) {
                    int i8 = marginLayoutParams.topMargin;
                    int i9 = insets.top;
                    if (i8 != i9) {
                        marginLayoutParams.topMargin = i9;
                        if (z4) {
                            view.setLayoutParams(marginLayoutParams);
                        }
                        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                        z2 = bVar.a;
                        if (z2) {
                            bottomSheetBehavior.m = insets2.bottom;
                        }
                        if (z3 && !z2) {
                            return windowInsetsCompat;
                        }
                        bottomSheetBehavior.r();
                        return windowInsetsCompat;
                    }
                }
                z4 = z;
                if (z4) {
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z2 = bVar.a;
                if (z2) {
                }
                if (z3) {
                }
                bottomSheetBehavior.r();
                return windowInsetsCompat;
            }
        }
        z = false;
        if (bottomSheetBehavior.t) {
        }
        if (bottomSheetBehavior.u) {
        }
        z4 = z;
        if (z4) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z2 = bVar.a;
        if (z2) {
        }
        if (z3) {
        }
        bottomSheetBehavior.r();
        return windowInsetsCompat;
    }
}
