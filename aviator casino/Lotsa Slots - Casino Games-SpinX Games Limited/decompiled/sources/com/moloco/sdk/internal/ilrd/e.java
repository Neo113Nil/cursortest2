package com.moloco.sdk.internal.ilrd;

/* loaded from: classes5.dex */
public final class e {
    public static final com.moloco.sdk.internal.ilrd.e.a f = new com.moloco.sdk.internal.ilrd.e.a(null);
    public static final int g = 8;
    public static final java.lang.String h = "IlrdScheduler";

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f6987a;
    public final com.moloco.sdk.internal.services.J b;
    public final java.lang.String c;
    public kotlinx.coroutines.Job d;
    public final java.text.SimpleDateFormat e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2", f = "IlrdScheduler.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6988a;
        public final /* synthetic */ long c;
        public final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> d;

        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2$1", f = "IlrdScheduler.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f6989a;
            public final /* synthetic */ com.moloco.sdk.internal.ilrd.e b;
            public final /* synthetic */ kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(com.moloco.sdk.internal.ilrd.e eVar, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.e.b.a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.moloco.sdk.internal.ilrd.e.b.a) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.moloco.sdk.internal.ilrd.e.b.a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f6989a;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.e.h, "Task " + this.b.c + " invoked", null, false, 12, null);
                    kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function1 = this.c;
                    this.f6989a = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.e.b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.e.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.e.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f6988a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String format = com.moloco.sdk.internal.ilrd.e.this.e.format(kotlin.coroutines.jvm.internal.Boxing.boxLong(com.moloco.sdk.internal.ilrd.e.this.b.a() + kotlin.time.Duration.m12157getInWholeMillisecondsimpl(this.c)));
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.e.h, "Task " + com.moloco.sdk.internal.ilrd.e.this.c + " scheduled at " + format, null, false, 12, null);
                long j = this.c;
                this.f6988a = 1;
                if (kotlinx.coroutines.DelayKt.m12291delayVtjQ1oo(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(com.moloco.sdk.internal.ilrd.e.this.f6987a, null, null, new com.moloco.sdk.internal.ilrd.e.b.a(com.moloco.sdk.internal.ilrd.e.this, this.d, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    public e(kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.internal.services.J timeProvider, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.f6987a = scope;
        this.b = timeProvider;
        this.c = name;
        this.e = new java.text.SimpleDateFormat("HH:mm:ss");
    }

    public final synchronized void a(long j, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> task) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
        kotlinx.coroutines.Job job = this.d;
        if (job != null) {
            a(job);
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6987a, null, null, new com.moloco.sdk.internal.ilrd.e.b(j, task, null), 3, null);
        this.d = launch$default;
    }

    public final void a(kotlinx.coroutines.Job job) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(job, "job");
        if (job.isActive()) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "Task " + this.c + " cancelled", null, false, 12, null);
        }
    }
}
