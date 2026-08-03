package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3444a {
    public static final void a(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "<this>");
        android.view.View decorView = activity.getWindow().getDecorView();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            b(activity);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(decorView);
            a(decorView);
        }
    }

    public static final void b(android.app.Activity activity) {
        androidx.core.view.WindowCompat.setDecorFitsSystemWindows(activity.getWindow(), false);
        androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat = new androidx.core.view.WindowInsetsControllerCompat(activity.getWindow(), activity.getWindow().getDecorView());
        windowInsetsControllerCompat.hide(androidx.core.view.WindowInsetsCompat.Type.systemBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }

    public static final void a(android.view.View view) {
        view.setSystemUiVisibility(4102);
    }
}
