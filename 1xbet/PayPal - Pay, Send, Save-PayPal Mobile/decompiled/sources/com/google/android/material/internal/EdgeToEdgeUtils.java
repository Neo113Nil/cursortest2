package com.google.android.material.internal;

/* loaded from: classes8.dex */
public class EdgeToEdgeUtils {
    private static final int EDGE_TO_EDGE_BAR_ALPHA = 128;

    private EdgeToEdgeUtils() {
    }

    public static void applyEdgeToEdge(android.view.Window window, boolean z) {
        applyEdgeToEdge(window, z, null, null);
    }

    public static void applyEdgeToEdge(android.view.Window window, boolean z, java.lang.Integer num, java.lang.Integer num2) {
        boolean z2 = true;
        boolean z3 = num == null || num.intValue() == 0;
        if (num2 != null && num2.intValue() != 0) {
            z2 = false;
        }
        if (z3 || z2) {
            int color = com.google.android.material.color.MaterialColors.getColor(window.getContext(), android.R.attr.colorBackground, -16777216);
            if (z3) {
                num = java.lang.Integer.valueOf(color);
            }
            if (z2) {
                num2 = java.lang.Integer.valueOf(color);
            }
        }
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, !z);
        int statusBarColor = getStatusBarColor(window.getContext(), z);
        int navigationBarColor = getNavigationBarColor(window.getContext(), z);
        window.setStatusBarColor(statusBarColor);
        window.setNavigationBarColor(navigationBarColor);
        setLightStatusBar(window, isUsingLightSystemBar(statusBarColor, com.google.android.material.color.MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, isUsingLightSystemBar(navigationBarColor, com.google.android.material.color.MaterialColors.isColorLight(num2.intValue())));
    }

    public static void setLightStatusBar(android.view.Window window, boolean z) {
        androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z);
    }

    public static void setLightNavigationBar(android.view.Window window, boolean z) {
        androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z);
    }

    private static int getStatusBarColor(android.content.Context context, boolean z) {
        if (z) {
            return 0;
        }
        return com.google.android.material.color.MaterialColors.getColor(context, android.R.attr.statusBarColor, -16777216);
    }

    private static int getNavigationBarColor(android.content.Context context, boolean z) {
        if (z && android.os.Build.VERSION.SDK_INT < 27) {
            return androidx.core.graphics.ColorUtils.setAlphaComponent(com.google.android.material.color.MaterialColors.getColor(context, android.R.attr.navigationBarColor, -16777216), 128);
        }
        if (z) {
            return 0;
        }
        return com.google.android.material.color.MaterialColors.getColor(context, android.R.attr.navigationBarColor, -16777216);
    }

    private static boolean isUsingLightSystemBar(int i, boolean z) {
        if (com.google.android.material.color.MaterialColors.isColorLight(i)) {
            return true;
        }
        return i == 0 && z;
    }
}
