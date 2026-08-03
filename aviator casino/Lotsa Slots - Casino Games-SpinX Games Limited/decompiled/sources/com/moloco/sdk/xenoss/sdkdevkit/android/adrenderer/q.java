package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* loaded from: classes5.dex */
public final class q implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7978a;

    public q(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7978a = context;
    }

    public final android.util.DisplayMetrics a(android.view.WindowManager windowManager) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public final android.util.DisplayMetrics b(android.view.WindowManager windowManager) {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        displayMetrics.density = this.f7978a.getResources().getDisplayMetrics().density;
        displayMetrics.densityDpi = this.f7978a.getResources().getDisplayMetrics().densityDpi;
        displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
        displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        return displayMetrics;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public com.moloco.sdk.common_adapter_internal.ScreenData invoke() {
        android.view.WindowManager windowManager = (android.view.WindowManager) androidx.core.content.ContextCompat.getSystemService(this.f7978a, android.view.WindowManager.class);
        if (windowManager == null) {
            return new com.moloco.sdk.common_adapter_internal.ScreenData(0, 0, 0.0f, 0.0f, 0, 0.0f);
        }
        android.util.DisplayMetrics b = android.os.Build.VERSION.SDK_INT >= 30 ? b(windowManager) : a(windowManager);
        int i = b.widthPixels;
        return new com.moloco.sdk.common_adapter_internal.ScreenData(i, b.heightPixels, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C.b(i, b.density), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C.b(b.heightPixels, b.density), b.densityDpi, b.density);
    }
}
