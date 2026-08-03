package com.inmobi.media;

/* loaded from: classes5.dex */
public final class A3 {
    public static kotlinx.coroutines.CoroutineScope c;
    public static com.inmobi.media.HandlerC2526k3 d;
    public static android.os.HandlerThread e;
    public static final com.inmobi.media.C2871x3 l;

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.A3 f4593a = new com.inmobi.media.A3();
    public static final kotlin.Lazy b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.inmobi.media.A3$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.inmobi.media.A3.b();
        }
    });
    public static java.util.List f = new java.util.ArrayList();
    public static final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);
    public static final java.util.concurrent.atomic.AtomicBoolean h = new java.util.concurrent.atomic.AtomicBoolean(true);
    public static final java.lang.Object i = new java.lang.Object();
    public static final java.util.LinkedHashMap j = new java.util.LinkedHashMap();
    public static final kotlin.jvm.functions.Function1 k = new kotlin.jvm.functions.Function1() { // from class: com.inmobi.media.A3$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.inmobi.media.A3.a((com.inmobi.media.J2) obj);
        }
    };

    public static final kotlin.Unit a(com.inmobi.media.J2 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        int i2 = event.f4774a;
        if (i2 == 1 || i2 == 2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
            h.set(false);
        } else if (i2 != 10) {
            if (i2 != 11) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
                int i3 = event.f4774a;
            } else if (!java.lang.Boolean.parseBoolean(event.b)) {
                f();
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual("available", event.b)) {
            f();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void b(com.inmobi.media.V2 v2) {
        int i2 = v2.f;
        if (i2 > 0) {
            v2.f = i2 - 1;
            v2.g = java.lang.System.currentTimeMillis();
            kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2921z3(v2, null), 1, null);
        }
    }

    public static com.inmobi.media.core.config.models.AdConfig.ImaiConfig c() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.AdConfig.class, "clazz");
        return ((com.inmobi.media.core.config.models.AdConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.AdConfig.class)).getImai();
    }

    public static void d() {
        try {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = new java.util.concurrent.LinkedBlockingQueue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("A3", "name");
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(5, 5, 5L, timeUnit, linkedBlockingQueue, new com.inmobi.media.I9("A3", false));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            c = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) threadPoolExecutor).plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("pingHandlerThread");
            e = handlerThread;
            com.inmobi.media.L6.a(handlerThread, "pingHandlerThread");
            android.os.HandlerThread handlerThread2 = e;
            kotlin.jvm.internal.Intrinsics.checkNotNull(handlerThread2);
            android.os.Looper looper = handlerThread2.getLooper();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
            d = new com.inmobi.media.HandlerC2526k3(looper);
            ((com.inmobi.media.Fc) com.inmobi.media.Xi.e.getValue()).a(new int[]{10, 11, 2, 1}, k);
        } catch (java.lang.Exception e2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
            e2.getMessage();
        }
    }

    public static boolean e() {
        com.inmobi.media.C2580m4 c2580m4 = com.inmobi.media.AbstractC2318c4.f5134a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.core.config.models.RootConfig.class, "clazz");
        return !((com.inmobi.media.core.config.models.RootConfig) com.inmobi.media.AbstractC2318c4.f5134a.a(com.inmobi.media.core.config.models.RootConfig.class)).getMonetizationDisabled();
    }

    public static void f() {
        android.os.HandlerThread handlerThread;
        try {
            if (com.inmobi.media.Ze.a() != null) {
                return;
            }
            synchronized (i) {
                if (g.compareAndSet(false, true)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
                    if (e == null) {
                        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("pingHandlerThread");
                        e = handlerThread2;
                        com.inmobi.media.L6.a(handlerThread2, "pingHandlerThread");
                    }
                    if (d == null && (handlerThread = e) != null) {
                        android.os.Looper looper = handlerThread.getLooper();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(looper, "getLooper(...)");
                        d = new com.inmobi.media.HandlerC2526k3(looper);
                    }
                    kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.inmobi.media.C2896y3(null), 1, null);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        } catch (java.lang.Exception e2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
            e2.getMessage();
        }
    }

    public static void g() {
        try {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = g;
            atomicBoolean.set(false);
            synchronized (i) {
                if (!atomicBoolean.get()) {
                    android.os.HandlerThread handlerThread = e;
                    if (handlerThread != null) {
                        handlerThread.getLooper().quit();
                        handlerThread.interrupt();
                    }
                    e = null;
                    d = null;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        } catch (java.lang.Exception e2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
            e2.getMessage();
        }
    }

    public static final com.inmobi.media.Z2 b() {
        return new com.inmobi.media.Z2(com.inmobi.media.AbstractC2639o9.b());
    }

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.inmobi.media.A3$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.inmobi.media.A3.a();
            }
        };
        android.content.Context context = com.inmobi.media.Xi.f5051a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(runnable, "runnable");
        com.inmobi.media.Xi.g.submit(runnable);
        l = new com.inmobi.media.C2871x3();
    }

    public static final java.util.HashMap a(com.inmobi.media.V2 v2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            int maxRetries = (c().getMaxRetries() - v2.f) + 1;
            if (maxRetries > 0) {
                hashMap.put("X-im-retry-count", java.lang.String.valueOf(maxRetries));
                return hashMap;
            }
        } catch (java.lang.Exception unused) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
        }
        return hashMap;
    }

    public static final void a() {
        d();
    }

    public static void a(java.lang.String url, boolean z, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
        com.inmobi.media.Mg.a(com.inmobi.media.Jg.b, new com.inmobi.media.C2686q3(url, z, interfaceC2772t9, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.inmobi.media.V2 v2, com.inmobi.media.C2260a0 c2260a0, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9, kotlin.coroutines.jvm.internal.ContinuationImpl continuationImpl) {
        com.inmobi.media.C2793u3 c2793u3;
        int i2;
        com.inmobi.media.C2260a0 c2260a02;
        com.inmobi.media.V2 v22 = v2;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = interfaceC2772t9;
        if (continuationImpl instanceof com.inmobi.media.C2793u3) {
            c2793u3 = (com.inmobi.media.C2793u3) continuationImpl;
            int i3 = c2793u3.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2793u3.f = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = c2793u3.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = c2793u3.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (interfaceC2772t92 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t92).c("A3", "record Click");
                    }
                    com.inmobi.media.Z2 z2 = (com.inmobi.media.Z2) b.getValue();
                    int maxDbEvents = c().getMaxDbEvents();
                    c2793u3.f5478a = v22;
                    c2260a02 = c2260a0;
                    c2793u3.b = c2260a02;
                    c2793u3.c = interfaceC2772t92;
                    c2793u3.f = 1;
                    com.inmobi.media.C2613n9 c2613n9 = z2.f5077a;
                    com.inmobi.media.Y2 y2 = new com.inmobi.media.Y2(maxDbEvents, z2, v22, null);
                    c2613n9.getClass();
                    java.lang.Object a2 = c2613n9.a(new com.inmobi.media.C2585m9(c2613n9, y2, null), c2793u3);
                    if (a2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = kotlin.Unit.INSTANCE;
                    }
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.inmobi.media.InterfaceC2772t9 interfaceC2772t93 = c2793u3.c;
                    com.inmobi.media.C2260a0 c2260a03 = c2793u3.b;
                    com.inmobi.media.V2 v23 = c2793u3.f5478a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    c2260a02 = c2260a03;
                    interfaceC2772t92 = interfaceC2772t93;
                    v22 = v23;
                }
                if (c2260a02 != null) {
                    j.put(java.lang.Integer.valueOf(v22.f5007a), c2260a02);
                }
                if (com.inmobi.media.Ze.a() == null) {
                    if (interfaceC2772t92 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t92).b("A3", "No network available. Saving click for later processing ...");
                    }
                    g.set(false);
                    g();
                } else {
                    if (interfaceC2772t92 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("A3", "TAG");
                        ((com.inmobi.media.C2799u9) interfaceC2772t92).a("A3", "submit click - " + v22.f5007a);
                    }
                    kotlinx.coroutines.CoroutineScope coroutineScope = c;
                    if (coroutineScope != null) {
                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.inmobi.media.C2819v3(v22, interfaceC2772t92, null), 3, null);
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        c2793u3 = new com.inmobi.media.C2793u3(this, continuationImpl);
        java.lang.Object obj2 = c2793u3.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = c2793u3.f;
        if (i2 != 0) {
        }
        if (c2260a02 != null) {
        }
        if (com.inmobi.media.Ze.a() == null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static void a(com.inmobi.media.V2 click, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "error");
        java.util.LinkedHashMap linkedHashMap = j;
        com.inmobi.media.C2260a0 c2260a0 = (com.inmobi.media.C2260a0) linkedHashMap.get(java.lang.Integer.valueOf(click.f5007a));
        if (c2260a0 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(click, "click");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "error");
            com.inmobi.media.C2888xk c2888xk = c2260a0.b;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
            java.util.LinkedHashMap a2 = c2888xk.a();
            a2.put("networkType", com.inmobi.media.B5.g());
            a2.put("errorCode", (short) 2178);
            a2.put("reason", reason);
            java.lang.String str = c2888xk.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            com.inmobi.media.C2624nk c2624nk = com.inmobi.media.C2624nk.f5360a;
            com.inmobi.media.C2624nk.b("AdImpressionSuccessful", a2, com.inmobi.media.EnumC2728rk.f5431a);
        }
        linkedHashMap.remove(java.lang.Integer.valueOf(click.f5007a));
    }
}
