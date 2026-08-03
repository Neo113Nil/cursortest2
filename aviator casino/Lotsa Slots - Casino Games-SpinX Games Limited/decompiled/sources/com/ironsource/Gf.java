package com.ironsource;

/* loaded from: classes5.dex */
public final class Gf {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.Gf f5727a = new com.ironsource.Gf();
    private static kotlin.jvm.functions.Function0<java.lang.Boolean> b = com.ironsource.Gf.d.f5731a;
    private static final kotlin.Lazy c = kotlin.LazyKt.lazy(com.ironsource.Gf.c.f5730a);
    private static final kotlin.Lazy d = kotlin.LazyKt.lazy(com.ironsource.Gf.a.f5728a);

    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.coroutines.CoroutineScope> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Gf.a f5728a = new com.ironsource.Gf.a();

        /* renamed from: com.ironsource.Gf$a$a, reason: collision with other inner class name */
        public static final class C0118a extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.CoroutineExceptionHandler {
            public C0118a(kotlinx.coroutines.CoroutineExceptionHandler.Companion companion) {
                super(companion);
            }

            @Override // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Throwable th) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("CoroutineExceptionHandler caught: " + th.getMessage());
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.CoroutineScope invoke() {
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(new com.ironsource.Gf.a.C0118a(kotlinx.coroutines.CoroutineExceptionHandler.INSTANCE)));
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.mediation.internal.TempThreadManager$launchCoroutineTask$1", f = "TempThreadManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        int f5729a;
        final /* synthetic */ java.lang.Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.Runnable runnable, kotlin.coroutines.Continuation<? super com.ironsource.Gf.b> continuation) {
            super(2, continuation);
            this.b = runnable;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.ironsource.Gf.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.ironsource.Gf.b(this.b, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f5729a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            try {
                com.ironsource.Gf.f5727a.a(this.b, true).run();
            } catch (java.lang.Throwable th) {
                com.ironsource.C3180n4.d().a(th);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Exception in TempThreadManager coroutine: " + th.getMessage());
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.ironsource.C3154le> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Gf.c f5730a = new com.ironsource.Gf.c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.ironsource.C3154le invoke() {
            return new com.ironsource.C3154le(16, null, null, 6, null);
        }
    }

    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.ironsource.Gf.d f5731a = new com.ironsource.Gf.d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.valueOf(kotlin.ranges.RangesKt.random(new kotlin.ranges.IntRange(0, 9), kotlin.random.Random.INSTANCE) == 0);
        }
    }

    private Gf() {
    }

    private final com.ironsource.C3154le b() {
        return (com.ironsource.C3154le) c.getValue();
    }

    public final kotlin.jvm.functions.Function0<java.lang.Boolean> c() {
        return b;
    }

    public final void a(kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "<set-?>");
        b = function0;
    }

    public final void b(java.lang.Runnable action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            return;
        }
        b().execute(a(action, false));
    }

    private final kotlinx.coroutines.CoroutineScope a() {
        return (kotlinx.coroutines.CoroutineScope) d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Runnable a(final java.lang.Runnable runnable, final boolean z) {
        return new java.lang.Runnable() { // from class: com.ironsource.Gf$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.ironsource.Gf.b(runnable, z);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(java.lang.Runnable action, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "$action");
        action.run();
        f5727a.a(z);
    }

    private final boolean a(java.lang.Runnable runnable) {
        if (!com.ironsource.Jb.u.d().h().D()) {
            return false;
        }
        try {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(a(), null, null, new com.ironsource.Gf.b(runnable, null), 3, null);
            return true;
        } catch (java.lang.Throwable th) {
            try {
                com.ironsource.Ff.a(th);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
            }
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to launch coroutine: " + th.getMessage());
            return false;
        }
    }

    private final void a(boolean z) {
        if (b.invoke().booleanValue()) {
            try {
                int activeCount = java.lang.Thread.activeCount();
                com.ironsource.Lb lb = new com.ironsource.Lb.a.C0120a().get();
                java.lang.String kotlinVersion = kotlin.KotlinVersion.CURRENT.toString();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("kotlinVersion=" + kotlinVersion + ";");
                if (z) {
                    sb.append("coroutineVersion=" + new com.ironsource.C3126k4().a() + ";");
                }
                sb.append("threadCount=" + activeCount + ";");
                sb.append("javaHeapKb=" + lb.d() + ";");
                sb.append("nativeHeapKb=" + lb.e() + ";");
                sb.append("sharedOtherKb=" + lb.f());
                java.lang.String sb2 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, sb2);
                com.ironsource.Ff.a(com.ironsource.EnumC3378y5.TROUBLESHOOTING_COROUTINE_USAGE_METRICS, jSONObject);
            } catch (java.lang.Exception e) {
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to send usage metrics: " + e.getMessage());
            }
        }
    }
}
