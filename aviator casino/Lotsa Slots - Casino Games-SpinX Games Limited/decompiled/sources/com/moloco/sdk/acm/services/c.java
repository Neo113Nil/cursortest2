package com.moloco.sdk.acm.services;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.acm.services.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.Lifecycle f6917a;
    public final com.moloco.sdk.acm.services.ApplicationLifecycleObserver b;
    public java.util.concurrent.atomic.AtomicBoolean c;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.services.ApplicationLifecycleTrackerImpl$startObserving$2", f = "ApplicationLifecycleTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6918a;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.services.c.a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.acm.services.c.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.acm.services.c.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6918a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (com.moloco.sdk.acm.services.c.this.c.compareAndSet(false, true)) {
                com.moloco.sdk.acm.services.e.a(com.moloco.sdk.acm.services.e.f6920a, com.moloco.sdk.acm.services.d.f6919a, "Start observing application lifecycle events", false, 4, null);
                com.moloco.sdk.acm.services.c.this.f6917a.addObserver(com.moloco.sdk.acm.services.c.this.b);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    public c(androidx.lifecycle.Lifecycle lifecycle, com.moloco.sdk.acm.services.ApplicationLifecycleObserver bgListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bgListener, "bgListener");
        this.f6917a = lifecycle;
        this.b = bgListener;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.moloco.sdk.acm.services.b
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new com.moloco.sdk.acm.services.c.a(null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public final void a() {
        this.b.onStop(androidx.lifecycle.ProcessLifecycleOwner.INSTANCE.get());
    }
}
