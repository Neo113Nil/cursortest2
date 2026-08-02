package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/DisplayMetricsUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "(Landroid/content/Context;)Landroid/util/DisplayMetrics;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DisplayMetricsUtil {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.util.DisplayMetricsUtil INSTANCE = new com.paypal.oslo.feature.verificationcapture.util.DisplayMetricsUtil();

    private DisplayMetricsUtil() {
    }

    public final android.util.DisplayMetrics getDisplayMetrics(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            android.view.WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "");
            android.graphics.Rect bounds = currentWindowMetrics.getBounds();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bounds, "");
            displayMetrics.widthPixels = bounds.width();
            displayMetrics.heightPixels = bounds.height();
            displayMetrics.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
            return displayMetrics;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }
}
