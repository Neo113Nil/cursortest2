package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class E1 {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.LinkedHashSet f4673a;

    public static void a(boolean z) {
        java.util.LinkedHashSet linkedHashSet;
        if (com.inmobi.media.Xi.f5051a == null || (linkedHashSet = f4673a) == null) {
            return;
        }
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            try {
                ((com.inmobi.media.C2518jl) it.next()).getClass();
                com.inmobi.media.C2518jl.a(z);
            } catch (java.lang.Exception e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("E1", "TAG");
                e.getMessage();
            }
        }
    }

    public static void b(android.content.Context context) {
        com.inmobi.media.C2518jl listener = com.inmobi.media.C2678pl.c;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        if (f4673a == null) {
            f4673a = new java.util.LinkedHashSet();
            android.content.Context applicationContext = context.getApplicationContext();
            android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
            if (application != null) {
                try {
                    application.registerActivityLifecycleCallbacks(new com.inmobi.media.D1(context));
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        java.util.LinkedHashSet linkedHashSet = f4673a;
        if (linkedHashSet != null) {
            linkedHashSet.add(listener);
        }
    }

    public static boolean a(android.content.Context context) {
        try {
            java.lang.Object systemService = context.getSystemService("activity");
            kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                java.lang.String packageName = context.getPackageName();
                for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (packageName.equals(runningAppProcessInfo.processName)) {
                        return runningAppProcessInfo.importance == 100;
                    }
                }
                return false;
            }
            return false;
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("E1", "TAG");
            e.getMessage();
            return false;
        }
    }
}
