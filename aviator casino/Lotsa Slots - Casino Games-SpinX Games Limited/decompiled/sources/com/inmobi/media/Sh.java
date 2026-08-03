package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Sh {
    public static com.inmobi.media.Rb b;

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.Ib f4959a = com.inmobi.media.Ib.c;
    public static final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final com.inmobi.media.Rh d = new com.inmobi.media.Rh();
    public static final java.util.concurrent.locks.ReentrantLock e = new java.util.concurrent.locks.ReentrantLock();
    public static final kotlin.jvm.functions.Function1 f = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.Sh$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.inmobi.media.Sh.a((com.inmobi.media.J2) obj);
        }
    };
    public static final java.lang.ref.ReferenceQueue g = new java.lang.ref.ReferenceQueue();
    public static final java.util.concurrent.ConcurrentHashMap h = new java.util.concurrent.ConcurrentHashMap();
    public static final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static final kotlin.Unit a(com.inmobi.media.J2 it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        int i2 = it.f4774a;
        if (i2 != 1 && i2 != 2) {
            switch (i2) {
                case androidx.compose.material.TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION /* 152 */:
                    java.util.Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        java.lang.Object obj = it.c.get("data");
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        a((com.inmobi.media.X9) obj);
                        break;
                    }
                    break;
            }
        } else {
            a(i2);
            c.set(false);
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(f);
            b = null;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static void b() {
        if (b != null) {
            return;
        }
        java.util.concurrent.locks.ReentrantLock reentrantLock = e;
        if (reentrantLock.tryLock()) {
            try {
                if (b == null && c.get()) {
                    android.content.Context context = com.inmobi.media.Xi.f5051a;
                    if (context != null) {
                        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
                        com.inmobi.media.core.config.models.TelemetryConfig.LoggingConfig loggingConfig = ((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getLoggingConfig();
                        b = new com.inmobi.media.Rb(context, loggingConfig.getLoggingUrl(), loggingConfig.getRetryInterval() * 1000, loggingConfig.getExpiry(), loggingConfig.getMaxRetries(), loggingConfig.getMaxNoOfEntries());
                    }
                    com.inmobi.media.Rb rb = b;
                    if (rb != null) {
                        com.inmobi.media.AbstractC2877x9.a(rb);
                    }
                }
                reentrantLock.unlock();
            } catch (java.lang.Throwable th) {
                e.unlock();
                throw th;
            }
        }
    }

    public static final void c() {
        while (c.get()) {
            a();
        }
    }

    public static void a(java.lang.Object obj, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
        try {
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
            if (((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getLoggingConfig().getEnabled()) {
                if (interfaceC2772t9 != null) {
                    ((com.inmobi.media.C2799u9) interfaceC2772t9).a("RemoteLoggerComponent", "starting to track reference of " + obj);
                }
                if (interfaceC2772t9 != null) {
                    h.put(new java.lang.ref.PhantomReference(obj, g), new kotlin.Pair(obj.toString(), new java.lang.ref.WeakReference(interfaceC2772t9)));
                    if (i.getAndSet(true)) {
                        return;
                    }
                    kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
                    java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.Sh$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.inmobi.media.Sh.c();
                        }
                    };
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("RemoteLoggerComponent", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
                    try {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.inmobi.media.AbstractC2273ac.f5097a, null, null, new com.inmobi.media.Wb(runnable, null), 3, null);
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        } catch (java.lang.Exception e2) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.AbstractC2665p9.a(e2);
        }
    }

    public static double b(java.lang.String str, java.lang.String str2, com.inmobi.media.core.config.models.TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (!str.equals("banner")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getBanner().getAb().getSamplePercent();
                }
                return loggingConfig.getBanner().getNonAb().getSamplePercent();
            case -1052618729:
                if (!str.equals("native")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getNative().getAb().getSamplePercent();
                }
                return loggingConfig.getNative().getNonAb().getSamplePercent();
            case -171121434:
                if (!str.equals("intNative")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_native().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_native().getNonAb().getSamplePercent();
            case 93166550:
                if (str.equals("audio")) {
                    return loggingConfig.getAudio().getNonAb().getSamplePercent();
                }
                return 0.01d;
            case 1957200954:
                if (!str.equals("intHtml")) {
                    return 0.01d;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                    return loggingConfig.getInt_html().getAb().getSamplePercent();
                }
                return loggingConfig.getInt_html().getNonAb().getSamplePercent();
            case 1966366787:
                if (str.equals("getToken")) {
                    return loggingConfig.getGetToken().getSamplePercent();
                }
                return 0.01d;
            default:
                return 0.01d;
        }
    }

    public static com.inmobi.media.C2799u9 a(java.lang.String logType, java.lang.String placementType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logType, "logType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementType, "placementType");
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        if (context != null) {
            try {
                b();
                com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.TelemetryConfig.class, "clazz");
                com.inmobi.media.core.config.models.TelemetryConfig.LoggingConfig loggingConfig = ((com.inmobi.media.core.config.models.TelemetryConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.TelemetryConfig.class)).getLoggingConfig();
                double b2 = b(logType, placementType, loggingConfig);
                com.inmobi.media.Ib logLevel = a(logType, placementType, loggingConfig);
                boolean z = !loggingConfig.getEnabled();
                long expiry = loggingConfig.getExpiry() * 1000;
                int maxNoOfEntries = loggingConfig.getMaxNoOfEntries();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
                return new com.inmobi.media.C2799u9(context, b2, logLevel, z, maxNoOfEntries, expiry);
            } catch (java.lang.Exception e2) {
                kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
                com.inmobi.media.AbstractC2665p9.a(e2);
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.inmobi.media.Ib a(java.lang.String str, java.lang.String str2, com.inmobi.media.core.config.models.TelemetryConfig.LoggingConfig loggingConfig) {
        switch (str.hashCode()) {
            case -1396342996:
                if (str.equals("banner")) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                        return com.inmobi.media.Jb.a(loggingConfig.getBanner().getAb().getLogLevel());
                    }
                    return com.inmobi.media.Jb.a(loggingConfig.getBanner().getNonAb().getLogLevel());
                }
                break;
            case -1052618729:
                if (str.equals("native")) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                        return com.inmobi.media.Jb.a(loggingConfig.getNative().getAb().getLogLevel());
                    }
                    return com.inmobi.media.Jb.a(loggingConfig.getNative().getNonAb().getLogLevel());
                }
                break;
            case -171121434:
                if (str.equals("intNative")) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                        return com.inmobi.media.Jb.a(loggingConfig.getInt_native().getAb().getLogLevel());
                    }
                    return com.inmobi.media.Jb.a(loggingConfig.getInt_native().getNonAb().getLogLevel());
                }
                break;
            case 93166550:
                if (str.equals("audio")) {
                    return com.inmobi.media.Jb.a(loggingConfig.getAudio().getNonAb().getLogLevel());
                }
                break;
            case 1957200954:
                if (str.equals("intHtml")) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str2, "AB")) {
                        return com.inmobi.media.Jb.a(loggingConfig.getInt_html().getAb().getLogLevel());
                    }
                    return com.inmobi.media.Jb.a(loggingConfig.getInt_html().getNonAb().getLogLevel());
                }
                break;
            case 1966366787:
                if (str.equals("getToken")) {
                    return com.inmobi.media.Jb.a(loggingConfig.getGetToken().getLogLevel());
                }
                break;
        }
        return f4959a;
    }

    public static void a() {
        java.lang.ref.WeakReference weakReference;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9;
        java.lang.ref.Reference remove = g.remove();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = h;
        if (kotlin.collections.CollectionsKt.contains(concurrentHashMap.keySet(), remove)) {
            kotlin.Pair pair = (kotlin.Pair) concurrentHashMap.get(remove);
            if (pair != null && (weakReference = (java.lang.ref.WeakReference) pair.getSecond()) != null && (interfaceC2772t9 = (com.inmobi.media.InterfaceC2772t9) weakReference.get()) != null) {
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a("ReferenceTracker", " reference " + pair.getFirst() + " reference is GCed.");
            }
            kotlin.jvm.internal.TypeIntrinsics.asMutableMap(concurrentHashMap).remove(remove);
        }
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((java.lang.ref.WeakReference) ((kotlin.Pair) entry.getValue()).getSecond()).get() == null) {
                h.remove(entry.getKey());
            }
        }
    }

    public static void a(com.inmobi.media.X9 incident) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(incident, "incident");
        boolean z = incident instanceof com.inmobi.media.X4;
        if (!z && !(incident instanceof com.inmobi.media.C2654oo)) {
            com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.CrashConfig.class, "clazz");
            com.inmobi.media.C2580m4 c2580m42 = com.inmobi.media.AbstractC2318c4.f5134a;
            if (((com.inmobi.media.core.config.models.CrashConfig) c2580m42.a(com.inmobi.media.core.config.models.CrashConfig.class)).getAnr().getAppExitReason().getReportToLogs() && (incident instanceof com.inmobi.media.C2919z1)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.CrashConfig.class, "clazz");
                com.inmobi.media.C2403fa c2403fa = new com.inmobi.media.C2403fa(((com.inmobi.media.core.config.models.CrashConfig) c2580m42.a(com.inmobi.media.core.config.models.CrashConfig.class)).getAnr().getAppExitReason().getIncompleteLogThresholdTime());
                java.lang.String message = incident.f5268a;
                java.lang.String str = incident.b;
                java.lang.String exitData = str == null ? "" : str;
                int i2 = ((com.inmobi.media.C2919z1) incident).g;
                long j = incident.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exitData, "exitData");
                kotlinx.coroutines.CoroutineScope coroutineScope = com.inmobi.media.AbstractC2273ac.f5097a;
                com.inmobi.media.Zb.a(new com.inmobi.media.C2376ea(c2403fa, j, message, i2, exitData, null));
                return;
            }
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.AbstractC2877x9.f5546a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = com.inmobi.media.Ub.f4994a;
        java.util.Iterator it = com.inmobi.media.Tb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new com.inmobi.media.Ri((com.inmobi.media.Ph) it.next()));
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.inmobi.media.Ri ri = (com.inmobi.media.Ri) it2.next();
            com.inmobi.media.Ib logLevel = com.inmobi.media.Ib.c;
            java.lang.String str2 = incident.f5268a;
            long j2 = incident.c;
            java.lang.String str3 = incident.b;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String message2 = "TYPE - " + str2 + ", TIMESTAMP - " + j2 + ", PAYLOAD - " + str3;
            ri.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("LOGGER CRASH", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message2, "message");
            ri.f4940a.a(logLevel, "LOGGER CRASH", message2);
            if (z) {
                ri.f4940a.b();
            }
        }
    }

    public static void a(int i2) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = com.inmobi.media.AbstractC2877x9.f5546a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = com.inmobi.media.Ub.f4994a;
        java.util.Iterator it = com.inmobi.media.Tb.a().iterator();
        while (it.hasNext()) {
            arrayList.add(new com.inmobi.media.Ri((com.inmobi.media.Ph) it.next()));
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            com.inmobi.media.Ri ri = (com.inmobi.media.Ri) it2.next();
            com.inmobi.media.Ib logLevel = com.inmobi.media.Ib.c;
            java.lang.String message = "SYSTEM SHUTDOWN RECEIVED - " + i2;
            ri.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logLevel, "logLevel");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("LOGGER CRASH", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            ri.f4940a.a(logLevel, "LOGGER CRASH", message);
            ri.f4940a.b();
        }
        c.set(false);
        ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(f);
        b = null;
    }
}
