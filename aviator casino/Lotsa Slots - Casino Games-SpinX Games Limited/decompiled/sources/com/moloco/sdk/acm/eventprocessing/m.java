package com.moloco.sdk.acm.eventprocessing;

/* loaded from: classes5.dex */
public final class m implements com.moloco.sdk.acm.eventprocessing.l {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.eventprocessing.c f6901a;
    public final com.moloco.sdk.acm.a b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final kotlinx.coroutines.CoroutineScope d;
    public java.util.concurrent.ScheduledFuture<?> e;
    public final kotlinx.coroutines.sync.Mutex f;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer", f = "RequestSchedulerTimer.kt", i = {0, 0}, l = {68}, m = "resetScheduleAndTriggerNewScheduledUpload", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6902a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.m.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.acm.eventprocessing.m.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer$schedule$1$1", f = "RequestSchedulerTimer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6903a;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.m.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.acm.eventprocessing.m.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.acm.eventprocessing.m.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6903a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.acm.eventprocessing.m.this.f6901a.a();
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.acm.eventprocessing.RequestSchedulerTimer", f = "RequestSchedulerTimer.kt", i = {0, 0}, l = {68}, m = "scheduleUploadAndPurge", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f6904a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.acm.eventprocessing.m.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.acm.eventprocessing.m.this.b(this);
        }
    }

    public m(com.moloco.sdk.acm.eventprocessing.c dbWorkRequest, com.moloco.sdk.acm.a opsConfig, java.util.concurrent.ScheduledExecutorService scheduler, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbWorkRequest, "dbWorkRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opsConfig, "opsConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f6901a = dbWorkRequest;
        this.b = opsConfig;
        this.c = scheduler;
        this.d = coroutineScope;
        this.f = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.eventprocessing.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.acm.eventprocessing.m.c cVar;
        int i;
        com.moloco.sdk.acm.eventprocessing.m mVar;
        kotlinx.coroutines.sync.Mutex mutex;
        try {
            if (continuation instanceof com.moloco.sdk.acm.eventprocessing.m.c) {
                cVar = (com.moloco.sdk.acm.eventprocessing.m.c) continuation;
                int i2 = cVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cVar.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = cVar.c;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cVar.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.f;
                        cVar.f6904a = this;
                        cVar.b = mutex2;
                        cVar.e = 1;
                        if (mutex2.lock(null, cVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mVar = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) cVar.b;
                        mVar = (com.moloco.sdk.acm.eventprocessing.m) cVar.f6904a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    mVar.a();
                    return kotlin.Unit.INSTANCE;
                }
            }
            mVar.a();
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        cVar = new com.moloco.sdk.acm.eventprocessing.m.c(continuation);
        java.lang.Object obj2 = cVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.e;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:11:0x004e, B:13:0x0052, B:14:0x005a), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.moloco.sdk.acm.eventprocessing.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.acm.eventprocessing.m.a aVar;
        int i;
        com.moloco.sdk.acm.eventprocessing.m mVar;
        kotlinx.coroutines.sync.Mutex mutex;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture;
        try {
            if (continuation instanceof com.moloco.sdk.acm.eventprocessing.m.a) {
                aVar = (com.moloco.sdk.acm.eventprocessing.m.a) continuation;
                int i2 = aVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.e = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = aVar.c;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = aVar.e;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex2 = this.f;
                        aVar.f6902a = this;
                        aVar.b = mutex2;
                        aVar.e = 1;
                        if (mutex2.lock(null, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mVar = this;
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex = (kotlinx.coroutines.sync.Mutex) aVar.b;
                        mVar = (com.moloco.sdk.acm.eventprocessing.m) aVar.f6902a;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    scheduledFuture = mVar.e;
                    if (scheduledFuture != null) {
                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(scheduledFuture.cancel(false));
                    }
                    mVar.a();
                    return kotlin.Unit.INSTANCE;
                }
            }
            scheduledFuture = mVar.e;
            if (scheduledFuture != null) {
            }
            mVar.a();
            return kotlin.Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
        aVar = new com.moloco.sdk.acm.eventprocessing.m.a(continuation);
        java.lang.Object obj2 = aVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar.e;
        if (i != 0) {
        }
    }

    public /* synthetic */ m(com.moloco.sdk.acm.eventprocessing.c cVar, com.moloco.sdk.acm.a aVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, (i & 4) != 0 ? java.util.concurrent.Executors.newSingleThreadScheduledExecutor() : scheduledExecutorService, coroutineScope);
    }

    public static final void b(com.moloco.sdk.acm.eventprocessing.m mVar) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(mVar.d, null, null, mVar.new b(null), 3, null);
    }

    public final void a() {
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.e;
        if (scheduledFuture == null || (scheduledFuture != null && scheduledFuture.isCancelled())) {
            this.e = this.c.scheduleWithFixedDelay(new java.lang.Runnable() { // from class: com.moloco.sdk.acm.eventprocessing.m$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.moloco.sdk.acm.eventprocessing.m.b(com.moloco.sdk.acm.eventprocessing.m.this);
                }
            }, this.b.h(), this.b.h(), java.util.concurrent.TimeUnit.SECONDS);
        }
    }
}
