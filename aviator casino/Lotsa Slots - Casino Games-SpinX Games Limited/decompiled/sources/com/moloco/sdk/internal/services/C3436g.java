package com.moloco.sdk.internal.services;

/* renamed from: com.moloco.sdk.internal.services.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3436g implements com.moloco.sdk.internal.services.InterfaceC3435f {
    public static final com.moloco.sdk.internal.services.C3436g.a e = new com.moloco.sdk.internal.services.C3436g.a(null);
    public static final int f = 8;
    public static final java.lang.String g = "AnalyticsApplicationLifecycleTrackerImpl";

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.Lifecycle f7275a;
    public final com.moloco.sdk.internal.services.I b;
    public final kotlinx.coroutines.CoroutineScope c;
    public boolean d;

    /* renamed from: com.moloco.sdk.internal.services.g$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.AnalyticsApplicationLifecycleTrackerImpl$startObserving$1", f = "AnalyticsApplicationLifecycleTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.services.g$b */
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7276a;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.C3436g.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.C3436g.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.C3436g.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7276a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.services.C3436g.this.c();
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.AnalyticsApplicationLifecycleTrackerImpl$trackNextBackgroundForeground$1", f = "AnalyticsApplicationLifecycleTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.moloco.sdk.internal.services.g$c */
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7277a;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.C3436g.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.C3436g.c) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.C3436g.this.new c(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7277a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.C3436g.g, "Tracking next bg / fg of the application", false, 4, null);
            com.moloco.sdk.internal.services.C3436g.this.c();
            com.moloco.sdk.internal.services.C3436g.this.b.a();
            return kotlin.Unit.INSTANCE;
        }
    }

    public C3436g(androidx.lifecycle.Lifecycle lifecycle, com.moloco.sdk.internal.services.I fgBgListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fgBgListener, "fgBgListener");
        this.f7275a = lifecycle;
        this.b = fgBgListener;
        this.c = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMainImmediate());
    }

    public final void c() {
        if (this.d) {
            return;
        }
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "Observing application lifecycle events", false, 4, null);
        this.f7275a.addObserver(this.b);
        this.d = true;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3435f
    public void a() {
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, g, "Start observing application lifecycle events", false, 4, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.internal.services.C3436g.b(null), 3, null);
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3435f
    public void b() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.internal.services.C3436g.c(null), 3, null);
    }
}
