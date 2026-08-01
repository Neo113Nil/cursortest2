package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Z5 {
    public static final int a() {
        int i = Resources.getSystem().getDisplayMetrics().densityDpi;
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

    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        Intrinsics.checkNotNullParameter(activityManager, "<this>");
        Y5.f6965a.getClass();
        if (!(Y5.w() ? activityManager.isLowRamDevice() : true)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / 1048576 >= 100) {
                return false;
            }
        }
        return true;
    }
}
