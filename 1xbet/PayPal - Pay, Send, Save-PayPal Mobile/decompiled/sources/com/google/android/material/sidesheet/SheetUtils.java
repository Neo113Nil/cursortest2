package com.google.android.material.sidesheet;

/* loaded from: classes8.dex */
final class SheetUtils {
    private SheetUtils() {
    }

    static boolean isSwipeMostlyHorizontal(float f, float f2) {
        return java.lang.Math.abs(f) > java.lang.Math.abs(f2);
    }
}
