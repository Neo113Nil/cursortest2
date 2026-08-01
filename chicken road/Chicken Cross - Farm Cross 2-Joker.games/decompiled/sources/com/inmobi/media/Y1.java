package com.inmobi.media;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Y1 {

    /* renamed from: a, reason: collision with root package name */
    public static LinkedHashSet f6962a;

    public static void a(Context context, C3718fn listener, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (f6962a == null) {
            f6962a = new LinkedHashSet();
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new X1(context, z));
                } catch (Throwable unused) {
                }
            }
        }
        LinkedHashSet linkedHashSet = f6962a;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }

    public static void a(boolean z) {
        LinkedHashSet linkedHashSet;
        if (AbstractC3914mk.f7252a == null || (linkedHashSet = f6962a) == null) {
            return;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((C3718fn) it.next()).getClass();
                C3718fn.a(z);
            } catch (Exception e) {
                Intrinsics.checkNotNullExpressionValue("Y1", "TAG");
                String str = "SDK encountered an unexpected error in handling focus change event; " + e.getMessage();
            }
        }
    }

    public static boolean a(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                String packageName = context.getPackageName();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("Y1", "TAG");
            String str = "exception in checkIfAppInBackgroundAndTriggerFocusChange: " + e.getMessage();
            return false;
        }
    }
}
