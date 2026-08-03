package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Gi {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f4728a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.Gi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.Gi.a();
        }
    });

    public static final org.json.JSONObject a(java.lang.String str, int i) {
        org.json.JSONObject a2 = com.inmobi.media.AbstractC2516jj.a(str, "targetViewId", "id", str);
        a2.put("errorCode", i);
        return a2;
    }

    public static final com.inmobi.media.Mo b(android.view.WindowInsets windowInsets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        com.inmobi.media.Mo e = e(windowInsets);
        com.inmobi.media.Mo c = c(windowInsets);
        com.inmobi.media.Mo d = d(windowInsets);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        android.graphics.Insets insets = windowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.navigationBars());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return a(e, c, d, new com.inmobi.media.Mo(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final com.inmobi.media.Mo c(android.view.WindowInsets windowInsets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.t()) {
            android.graphics.Insets insets = windowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.displayCutout());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
            return new com.inmobi.media.Mo(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!com.inmobi.media.B5.r()) {
            return (com.inmobi.media.Mo) f4728a.getValue();
        }
        android.view.DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        android.view.DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        android.view.DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        android.view.DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new com.inmobi.media.Mo(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final com.inmobi.media.Mo d(android.view.WindowInsets windowInsets) {
        int i;
        int i2;
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.u()) {
            return (com.inmobi.media.Mo) f4728a.getValue();
        }
        android.view.RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int i4 = 0;
        android.view.RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        android.view.RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        android.view.RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            i = (int) (java.lang.Math.sin(java.lang.Math.toRadians(45.0d)) * roundedCorner.getRadius());
        } else {
            i = 0;
        }
        if (roundedCorner2 != null) {
            i2 = (int) (java.lang.Math.sin(java.lang.Math.toRadians(45.0d)) * roundedCorner2.getRadius());
        } else {
            i2 = 0;
        }
        if (roundedCorner3 != null) {
            i3 = (int) (java.lang.Math.sin(java.lang.Math.toRadians(45.0d)) * roundedCorner3.getRadius());
        } else {
            i3 = 0;
        }
        if (roundedCorner4 != null) {
            i4 = (int) (java.lang.Math.sin(java.lang.Math.toRadians(45.0d)) * roundedCorner4.getRadius());
        }
        return new com.inmobi.media.Mo(java.lang.Math.max(i, i2), java.lang.Math.max(i2, i3), java.lang.Math.max(i4, i3), java.lang.Math.max(i, i4));
    }

    public static final com.inmobi.media.Mo e(android.view.WindowInsets windowInsets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.t()) {
            return com.inmobi.media.B5.s() ? new com.inmobi.media.Mo(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (com.inmobi.media.Mo) f4728a.getValue();
        }
        android.graphics.Insets insets = windowInsets.getInsets(androidx.core.view.WindowInsetsCompat.Type.systemGestures());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return new com.inmobi.media.Mo(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final void c(android.view.Window window) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.t()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
            androidx.core.view.WindowInsetsControllerCompat insetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            insetsController.show(androidx.core.view.WindowInsetsCompat.Type.systemBars());
            insetsController.show(androidx.core.view.WindowInsetsCompat.Type.displayCutout());
            return;
        }
        if (com.inmobi.media.B5.w()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
            window.getDecorView().setSystemUiVisibility(0);
        }
    }

    public static final void b(android.view.Window window) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.r()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 0;
            window.setAttributes(attributes);
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, true);
        }
    }

    public static final com.inmobi.media.Mo a() {
        return new com.inmobi.media.Mo(0, 0, 0, 0);
    }

    public static final com.inmobi.media.Mo a(android.view.WindowInsets windowInsets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (com.inmobi.media.Mo) f4728a.getValue());
    }

    public static final com.inmobi.media.Mo a(com.inmobi.media.Mo area, com.inmobi.media.Mo display, com.inmobi.media.Mo roundedCorner, com.inmobi.media.Mo navigationBar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(area, "area");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(display, "display");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(roundedCorner, "roundedCorner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationBar, "navigationBar");
        return new com.inmobi.media.Mo(kotlin.comparisons.ComparisonsKt.maxOf(area.f4843a, display.f4843a, roundedCorner.f4843a, navigationBar.f4843a), kotlin.comparisons.ComparisonsKt.maxOf(area.b, display.b, roundedCorner.b, navigationBar.b), kotlin.comparisons.ComparisonsKt.maxOf(area.c, display.c, roundedCorner.c, navigationBar.c), kotlin.comparisons.ComparisonsKt.maxOf(area.d, display.d, roundedCorner.d, navigationBar.d));
    }

    public static final void a(android.view.Window window) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.t()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
            androidx.core.view.WindowInsetsControllerCompat insetsController = androidx.core.view.WindowCompat.getInsetsController(window, window.getDecorView());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
            insetsController.setSystemBarsBehavior(2);
            insetsController.hide(androidx.core.view.WindowInsetsCompat.Type.systemBars());
            insetsController.hide(androidx.core.view.WindowInsetsCompat.Type.displayCutout());
            return;
        }
        if (com.inmobi.media.B5.w()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
            window.getDecorView().setSystemUiVisibility(5638);
        }
    }

    public static final void a(android.view.Window window, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(window, "<this>");
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.layoutInDisplayCutoutMode = i;
        window.setAttributes(attributes);
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(window, false);
    }
}
