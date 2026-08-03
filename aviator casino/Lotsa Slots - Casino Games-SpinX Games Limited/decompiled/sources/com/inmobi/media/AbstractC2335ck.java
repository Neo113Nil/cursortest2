package com.inmobi.media;

/* renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2335ck {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f5145a = new java.util.concurrent.ConcurrentHashMap();
    public static com.inmobi.media.C2307bk b;
    public static boolean c;

    public static void a(java.lang.String str) {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            com.inmobi.media.B5.f4614a.getClass();
            if (!com.inmobi.media.B5.r() || !kotlin.jvm.internal.Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str)) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f5145a;
                if (concurrentHashMap.get(str) == null) {
                    com.inmobi.media.C2281ak c2281ak = new com.inmobi.media.C2281ak();
                    concurrentHashMap.put(str, c2281ak);
                    com.inmobi.media.J3.a(context, c2281ak, new android.content.IntentFilter(str));
                    return;
                }
                return;
            }
            java.lang.Object systemService = context.getSystemService("connectivity");
            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                com.inmobi.media.C2307bk c2307bk = new com.inmobi.media.C2307bk();
                b = c2307bk;
                connectivityManager.registerDefaultNetworkCallback(c2307bk);
            }
        }
    }

    public static void b() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
        a("android.intent.action.ACTION_SHUTDOWN");
        a("android.intent.action.REBOOT");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.y()) {
            a("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        a("android.intent.action.USER_PRESENT");
        if (com.inmobi.media.B5.r()) {
            a("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            a("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public static void b(java.lang.String str) {
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            com.inmobi.media.B5.f4614a.getClass();
            if (com.inmobi.media.B5.r() && kotlin.jvm.internal.Intrinsics.areEqual("SYSTEM_CONNECTIVITY_CHANGE", str) && b != null) {
                java.lang.Object systemService = context.getSystemService("connectivity");
                android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    com.inmobi.media.C2307bk c2307bk = b;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(c2307bk);
                    connectivityManager.unregisterNetworkCallback(c2307bk);
                    b = null;
                    return;
                }
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f5145a;
            if (concurrentHashMap.get(str) != null) {
                context.unregisterReceiver((android.content.BroadcastReceiver) concurrentHashMap.get(str));
                concurrentHashMap.remove(str);
            }
        }
    }

    public static void a() {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
        b("android.intent.action.ACTION_SHUTDOWN");
        b("android.intent.action.REBOOT");
        com.inmobi.media.B5.f4614a.getClass();
        if (com.inmobi.media.B5.y()) {
            b("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        b("android.intent.action.USER_PRESENT");
        if (com.inmobi.media.B5.r()) {
            b("SYSTEM_CONNECTIVITY_CHANGE");
        } else {
            b("android.net.conn.CONNECTIVITY_CHANGE");
        }
        f5145a.clear();
    }

    public static void a(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
        if (intent.getAction() == null) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
            intent.getAction();
            boolean z = false;
            if (kotlin.jvm.internal.Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", intent.getAction())) {
                java.lang.Object systemService = context.getSystemService("connectivity");
                android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
                if (connectivityManager != null) {
                    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || activeNetworkInfo.isConnected() != c) {
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            z = true;
                        }
                        c = z;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
                        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(10, 4, c ? "available" : "lost"));
                        return;
                    }
                    return;
                }
                return;
            }
            if (kotlin.text.StringsKt.equals("android.os.action.DEVICE_IDLE_MODE_CHANGED", intent.getAction(), true)) {
                java.lang.Object systemService2 = context.getSystemService("power");
                android.os.PowerManager powerManager = systemService2 instanceof android.os.PowerManager ? (android.os.PowerManager) systemService2 : null;
                if (powerManager != null) {
                    com.inmobi.media.B5.f4614a.getClass();
                    if (com.inmobi.media.B5.y()) {
                        z = powerManager.isDeviceIdleMode();
                    }
                }
                if (z != c) {
                    com.inmobi.media.B5.f4614a.getClass();
                    if (com.inmobi.media.B5.y()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
                        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(11, 4, java.lang.String.valueOf(z)));
                        return;
                    }
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual("android.intent.action.USER_PRESENT", intent.getAction())) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
                ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(100, 6, (java.lang.String) null));
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual("android.intent.action.ACTION_SHUTDOWN", intent.getAction())) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
                ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(1, 6, (java.lang.String) null));
                java.util.Iterator it = f5145a.entrySet().iterator();
                while (it.hasNext()) {
                    b((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
                }
                f5145a.clear();
                b = null;
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual("android.intent.action.REBOOT", intent.getAction())) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
                ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(2, 6, (java.lang.String) null));
                java.util.Iterator it2 = f5145a.entrySet().iterator();
                while (it2.hasNext()) {
                    b((java.lang.String) ((java.util.Map.Entry) it2.next()).getKey());
                }
                f5145a.clear();
                b = null;
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("ck", "TAG");
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).b(new com.inmobi.media.J2(99, 4, intent.getAction()));
        } catch (java.lang.Exception unused) {
        }
    }
}
