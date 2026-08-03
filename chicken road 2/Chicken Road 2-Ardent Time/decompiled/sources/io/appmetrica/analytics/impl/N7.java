package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class N7 {

    /* renamed from: a, reason: collision with root package name */
    public static final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f4710a = new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager();

    public static boolean a(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("uimode");
        java.lang.Integer num = (java.lang.Integer) io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils.accessSystemServiceSafelyOrDefault(systemService instanceof android.app.UiModeManager ? (android.app.UiModeManager) systemService : null, "getting current mode type", "UiModeManager", null, new H0.b(14));
        boolean z2 = num != null && num.intValue() == 4;
        io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager = f4710a;
        return z2 || safePackageManager.hasSystemFeature(context, "android.software.leanback") || (io.appmetrica.analytics.coreutils.internal.AndroidUtils.isApiAchieved(26) ? safePackageManager.hasSystemFeature(context, "android.software.leanback_only") : false);
    }

    public static final java.lang.Integer a(android.app.UiModeManager uiModeManager) {
        return java.lang.Integer.valueOf(uiModeManager.getCurrentModeType());
    }
}
