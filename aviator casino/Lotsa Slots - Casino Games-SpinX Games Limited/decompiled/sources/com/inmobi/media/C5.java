package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class C5 {
    public static final int a() {
        int i = android.content.res.Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i && i <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 <= i && i < 640) {
            return 720;
        }
        if (320 > i || i >= 480) {
            return (240 > i || i >= 320) ? 240 : 360;
        }
        return 480;
    }

    public static final boolean a(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "<this>");
        java.lang.Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityManager, "<this>");
        com.inmobi.media.B5.f4614a.getClass();
        if (!com.inmobi.media.B5.w() || activityManager.isLowRamDevice()) {
            return true;
        }
        android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / ((long) 1048576) < 100;
    }
}
