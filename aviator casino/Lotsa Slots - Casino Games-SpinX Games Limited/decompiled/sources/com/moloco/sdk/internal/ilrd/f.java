package com.moloco.sdk.internal.ilrd;

/* loaded from: classes5.dex */
public final class f {
    public static final com.moloco.sdk.internal.ilrd.f.a f = new com.moloco.sdk.internal.ilrd.f.a(null);
    public static final int g = 8;
    public static final java.lang.String h = "IlrdService";

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f6990a;
    public final com.moloco.sdk.internal.ilrd.b b;
    public final kotlin.Lazy c;
    public final java.util.Set<com.moloco.sdk.internal.ilrd.d> d;
    public kotlinx.coroutines.Job e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribe$1", f = "IlrdService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6991a;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.f.b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.f.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.ilrd.f.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6991a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.List<com.moloco.sdk.internal.ilrd.d> a2 = com.moloco.sdk.internal.ilrd.f.this.a();
            com.moloco.sdk.internal.ilrd.f fVar = com.moloco.sdk.internal.ilrd.f.this;
            for (com.moloco.sdk.internal.ilrd.d dVar : a2) {
                com.moloco.sdk.internal.ilrd.h value = dVar.getState().getValue();
                if (value instanceof com.moloco.sdk.internal.ilrd.h.a) {
                    com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.f.h, "Failed to subscribe to " + dVar.a() + " ILRD: " + ((com.moloco.sdk.internal.ilrd.h.a) value).b(), null, false, 12, null);
                } else if (value instanceof com.moloco.sdk.internal.ilrd.h.c) {
                    fVar.a(dVar);
                } else if (!(value instanceof com.moloco.sdk.internal.ilrd.h.b)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdService$subscribeToProvider$2$1", f = "IlrdService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.internal.ilrd.d.a, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f6992a;
        public /* synthetic */ java.lang.Object b;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.ilrd.f.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.internal.ilrd.d.a aVar, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.ilrd.f.c) create(aVar, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.ilrd.f.c cVar = com.moloco.sdk.internal.ilrd.f.this.new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6992a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            com.moloco.sdk.internal.ilrd.d.a aVar = (com.moloco.sdk.internal.ilrd.d.a) this.b;
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.ilrd.f.h, "Revenue event: " + aVar, null, false, 12, null);
            com.moloco.sdk.internal.ilrd.f.this.b.b(aVar);
            return kotlin.Unit.INSTANCE;
        }
    }

    public f(kotlinx.coroutines.CoroutineScope scope, final android.content.Context context, com.moloco.sdk.internal.ilrd.b eventsRepository, final java.util.List<? extends com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks> supportedNetworksList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsRepository, "eventsRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedNetworksList, "supportedNetworksList");
        this.f6990a = scope;
        this.b = eventsRepository;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.ilrd.f$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.moloco.sdk.internal.ilrd.f.a(supportedNetworksList, context, this);
            }
        });
        this.d = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());
    }

    public final synchronized void c() {
        kotlinx.coroutines.Job launch$default;
        kotlinx.coroutines.Job job = this.e;
        if (job == null || !job.isActive()) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.f6990a, null, null, new com.moloco.sdk.internal.ilrd.f.b(null), 3, null);
            this.e = launch$default;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r0 = com.moloco.sdk.internal.ilrd.g.b(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.moloco.sdk.internal.services.bidtoken.providers.p b() {
        com.moloco.sdk.internal.services.bidtoken.providers.p b2;
        com.moloco.sdk.internal.ilrd.b bVar = this.b;
        bVar.i();
        com.moloco.sdk.internal.ilrd.a e = bVar.e();
        if (e != null && b2 != null) {
            return b2;
        }
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "provideDataForBidToken() Session is null", null, false, 12, null);
        return null;
    }

    public final java.util.List<com.moloco.sdk.internal.ilrd.d> a() {
        return (java.util.List) this.c.getValue();
    }

    public static final java.util.List a(java.util.List list, android.content.Context context, com.moloco.sdk.internal.ilrd.f fVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list.contains(com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.MAX)) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "Adding AppLovin as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.a(context, fVar.f6990a));
        }
        if (list.contains(com.moloco.sdk.Init.SDKInitResponse.SupportedNetworks.LEVEL_PLAY)) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "Adding IronSource as ILRD provider", null, false, 12, null);
            arrayList.add(new com.moloco.sdk.internal.ilrd.provider.b(context, fVar.f6990a));
        }
        return kotlin.collections.CollectionsKt.toList(arrayList);
    }

    public final void a(com.moloco.sdk.internal.ilrd.d dVar) {
        java.lang.Object b2 = dVar.b();
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(b2);
        if (m10801exceptionOrNullimpl != null) {
            com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, h, "Failed to subscribe to " + dVar.a() + " ILRD: " + m10801exceptionOrNullimpl, null, false, 12, null);
        }
        if (kotlin.Result.m10805isSuccessimpl(b2)) {
            this.d.add(dVar);
            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(dVar.c(), new com.moloco.sdk.internal.ilrd.f.c(null)), this.f6990a);
        }
    }
}
