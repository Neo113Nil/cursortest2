package com.moloco.sdk.internal.publisher;

/* loaded from: classes5.dex */
public final class w {
    public static final com.moloco.sdk.internal.publisher.w.a f = new com.moloco.sdk.internal.publisher.w.a(null);
    public static final int g = 8;
    public static final com.moloco.sdk.publisher.MolocoInitStatus h;
    public static final com.moloco.sdk.publisher.MolocoInitStatus i;
    public static final java.lang.String j = "InitializationHandler";
    public static final java.lang.String k = "Moloco SDK failed to initialize due to unexpected app key";
    public static final java.lang.String l = "Moloco SDK failed to initialize due to unexpected app key during existing initialization";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.J f7181a;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.publisher.Initialization> b;
    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.publisher.Initialization> c;
    public com.moloco.sdk.Init.SDKInitResponse d;
    public final kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.internal.InterfaceC3408a> e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final com.moloco.sdk.publisher.MolocoInitStatus a() {
            return com.moloco.sdk.internal.publisher.w.h;
        }

        public final com.moloco.sdk.publisher.MolocoInitStatus b() {
            return com.moloco.sdk.internal.publisher.w.i;
        }

        public a() {
        }

        public final com.moloco.sdk.publisher.MolocoInitStatus a(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new com.moloco.sdk.publisher.MolocoInitStatus(com.moloco.sdk.publisher.Initialization.FAILURE, errorMessage);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", i = {}, l = {85}, m = "awaitAdFactory", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ java.lang.Object f7182a;
        public int c;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.w.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.f7182a = obj;
            this.c |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.w.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler$awaitAdFactory$adFactory$1", f = "InitializationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.moloco.sdk.internal.InterfaceC3408a, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7183a;
        public /* synthetic */ java.lang.Object b;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.w.c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            return ((com.moloco.sdk.internal.publisher.w.c) create(interfaceC3408a, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.moloco.sdk.internal.publisher.w.c cVar = new com.moloco.sdk.internal.publisher.w.c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f7183a != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.moloco.sdk.internal.InterfaceC3408a) this.b) != null);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {androidx.compose.material.TextFieldImplKt.AnimationDuration, 153, 183, 184, 192}, m = "handleInitializationResult", n = {"result", "trackingApi", "metricsRecorder", "initTimerEvent", "latency", "result", "metricsRecorder", "initTimerEvent", "this", "trackingApi", "metricsRecorder", "initTimerEvent", "$this$handleInitializationResult_u24lambda_u240", "latency", "this", "metricsRecorder", "initTimerEvent", "$this$handleInitializationResult_u24lambda_u240"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3"})
    public static final class d extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7184a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public long f;
        public /* synthetic */ java.lang.Object g;
        public int i;

        public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.w.d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.w.this.a((com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>) null, 0L, (com.moloco.sdk.internal.services.init.n) null, (com.moloco.sdk.acm.recorder.MetricsRecorder) null, (com.moloco.sdk.acm.TimerEvent) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler", f = "InitializationHandler.kt", i = {0, 0, 0, 1}, l = {112, 116, 120}, m = com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, n = {"this", "metricsRecorder", "clientFailureType", "clientFailureType"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class e extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7185a;
        public java.lang.Object b;
        public java.lang.Object c;
        public /* synthetic */ java.lang.Object d;
        public int f;

        public e(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.w.e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.publisher.w.this.a(null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.publisher.InitializationHandler$startInitialization$2", f = "InitializationHandler.kt", i = {0, 0, 1}, l = {134, 138}, m = "invokeSuspend", n = {"acmInitTimer", "startTime", "result"}, s = {"L$0", "J$0", "L$0"})
    public static final class f extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7186a;
        public long b;
        public int c;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder d;
        public final /* synthetic */ com.moloco.sdk.internal.publisher.w e;
        public final /* synthetic */ java.lang.String f;
        public final /* synthetic */ com.moloco.sdk.publisher.MediationInfo g;
        public final /* synthetic */ com.moloco.sdk.internal.services.init.n h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.publisher.w wVar, java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.publisher.w.f> continuation) {
            super(2, continuation);
            this.d = metricsRecorder;
            this.e = wVar;
            this.f = str;
            this.g = mediationInfo;
            this.h = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
            return ((com.moloco.sdk.internal.publisher.w.f) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.moloco.sdk.internal.publisher.w.f(this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.moloco.sdk.acm.TimerEvent timerEvent;
            long j;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.publisher.w.j, "startInitialization switch to Dispatchers.IO", null, false, 12, null);
                com.moloco.sdk.acm.TimerEvent startTimerEvent = this.d.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.b.c());
                long a2 = this.e.f().a();
                com.moloco.sdk.internal.services.init.k b = com.moloco.sdk.service_locator.a.f.f7347a.b();
                java.lang.String str = this.f;
                com.moloco.sdk.publisher.MediationInfo mediationInfo = this.g;
                this.f7186a = startTimerEvent;
                this.b = a2;
                this.c = 1;
                obj = b.a(str, mediationInfo, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timerEvent = startTimerEvent;
                j = a2;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.moloco.sdk.internal.v vVar = (com.moloco.sdk.internal.v) this.f7186a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return vVar;
                }
                j = this.b;
                com.moloco.sdk.acm.TimerEvent timerEvent2 = (com.moloco.sdk.acm.TimerEvent) this.f7186a;
                kotlin.ResultKt.throwOnFailure(obj);
                timerEvent = timerEvent2;
            }
            com.moloco.sdk.internal.v vVar2 = (com.moloco.sdk.internal.v) obj;
            long a3 = this.e.f().a() - j;
            com.moloco.sdk.internal.publisher.w wVar = this.e;
            com.moloco.sdk.internal.services.init.n nVar = this.h;
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.d;
            this.f7186a = vVar2;
            this.c = 2;
            return wVar.a((com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>) vVar2, a3, nVar, metricsRecorder, timerEvent, this) == coroutine_suspended ? coroutine_suspended : vVar2;
        }
    }

    static {
        com.moloco.sdk.publisher.Initialization initialization = com.moloco.sdk.publisher.Initialization.SUCCESS;
        h = new com.moloco.sdk.publisher.MolocoInitStatus(initialization, "Already Initialized");
        i = new com.moloco.sdk.publisher.MolocoInitStatus(initialization, "Initialized");
    }

    public w(com.moloco.sdk.internal.services.J timeProviderService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f7181a = timeProviderService;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.publisher.Initialization> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.b = MutableStateFlow;
        this.c = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        this.e = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
    }

    public final boolean c() {
        return g();
    }

    public final kotlinx.coroutines.flow.StateFlow<com.moloco.sdk.publisher.Initialization> d() {
        return this.c;
    }

    public final com.moloco.sdk.Init.SDKInitResponse e() {
        return this.d;
    }

    public final com.moloco.sdk.internal.services.J f() {
        return this.f7181a;
    }

    public final boolean g() {
        try {
            com.moloco.sdk.service_locator.a.i.f7350a.c();
            return true;
        } catch (java.lang.IllegalStateException unused) {
            return false;
        }
    }

    public final java.lang.Object b(java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new com.moloco.sdk.internal.publisher.w.f(metricsRecorder, this, str, mediationInfo, nVar, null), continuation);
    }

    public final java.lang.Object b(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.d = null;
        this.e.setValue(null);
        this.b.setValue(null);
        java.lang.Object a2 = com.moloco.sdk.service_locator.a.f.f7347a.b().a(continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.InterfaceC3408a> continuation) {
        com.moloco.sdk.internal.publisher.w.b bVar;
        int i2;
        if (continuation instanceof com.moloco.sdk.internal.publisher.w.b) {
            bVar = (com.moloco.sdk.internal.publisher.w.b) continuation;
            int i3 = bVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.c = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.f7182a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bVar.c;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "Moloco SDK awaiting init to receive AdFactory", null, false, 12, null);
                    kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.internal.InterfaceC3408a> mutableStateFlow = this.e;
                    com.moloco.sdk.internal.publisher.w.c cVar = new com.moloco.sdk.internal.publisher.w.c(null);
                    bVar.c = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.first(mutableStateFlow, cVar, bVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory");
                com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a = (com.moloco.sdk.internal.InterfaceC3408a) obj;
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "Moloco SDK init completed, AdFactory received", null, false, 12, null);
                return interfaceC3408a;
            }
        }
        bVar = new com.moloco.sdk.internal.publisher.w.b(continuation);
        java.lang.Object obj2 = bVar.f7182a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bVar.c;
        if (i2 != 0) {
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory");
        com.moloco.sdk.internal.InterfaceC3408a interfaceC3408a2 = (com.moloco.sdk.internal.InterfaceC3408a) obj2;
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "Moloco SDK init completed, AdFactory received", null, false, 12, null);
        return interfaceC3408a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.n nVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
        com.moloco.sdk.internal.publisher.w.e eVar;
        int i2;
        com.moloco.sdk.internal.services.init.j.a aVar;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2;
        com.moloco.sdk.internal.publisher.w wVar;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.publisher.Initialization> mutableStateFlow;
        com.moloco.sdk.publisher.Initialization initialization;
        if (continuation instanceof com.moloco.sdk.internal.publisher.w.e) {
            eVar = (com.moloco.sdk.internal.publisher.w.e) continuation;
            int i3 = eVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f = i3 - Integer.MIN_VALUE;
                com.moloco.sdk.internal.publisher.w.e eVar2 = eVar;
                java.lang.Object obj = eVar2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = eVar2.f;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, j, "initialize()", null, false, 12, null);
                    metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.f6940a.c()));
                    if (!c()) {
                        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger, j, "PersistentHttpRequest is not available, failing to initialize", null, false, 12, null);
                        com.moloco.sdk.internal.services.init.j.a aVar2 = new com.moloco.sdk.internal.services.init.j.a(com.moloco.sdk.internal.services.init.b.e);
                        eVar2.f7185a = this;
                        eVar2.b = metricsRecorder;
                        eVar2.c = aVar2;
                        eVar2.f = 1;
                        if (nVar.a(aVar2, 0L, eVar2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = aVar2;
                        metricsRecorder2 = metricsRecorder;
                        wVar = this;
                        metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), aVar.a().name()));
                        mutableStateFlow = wVar.b;
                        initialization = com.moloco.sdk.publisher.Initialization.FAILURE;
                        eVar2.f7185a = aVar;
                        eVar2.b = null;
                        eVar2.c = null;
                        eVar2.f = 2;
                        if (mutableStateFlow.emit(initialization, eVar2) == coroutine_suspended) {
                        }
                    } else {
                        eVar2.f = 3;
                        obj = b(str, mediationInfo, nVar, metricsRecorder, eVar2);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                } else if (i2 == 1) {
                    aVar = (com.moloco.sdk.internal.services.init.j.a) eVar2.c;
                    metricsRecorder2 = (com.moloco.sdk.acm.recorder.MetricsRecorder) eVar2.b;
                    wVar = (com.moloco.sdk.internal.publisher.w) eVar2.f7185a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), aVar.a().name()));
                    mutableStateFlow = wVar.b;
                    initialization = com.moloco.sdk.publisher.Initialization.FAILURE;
                    eVar2.f7185a = aVar;
                    eVar2.b = null;
                    eVar2.c = null;
                    eVar2.f = 2;
                    if (mutableStateFlow.emit(initialization, eVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.moloco.sdk.internal.services.init.j.a) eVar2.f7185a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.moloco.sdk.internal.v.a(aVar);
            }
        }
        eVar = new com.moloco.sdk.internal.publisher.w.e(continuation);
        com.moloco.sdk.internal.publisher.w.e eVar22 = eVar;
        java.lang.Object obj2 = eVar22.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = eVar22.f;
        if (i2 != 0) {
        }
        return new com.moloco.sdk.internal.v.a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0254 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar, long j2, com.moloco.sdk.internal.services.init.n nVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.acm.TimerEvent timerEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.moloco.sdk.internal.publisher.w.d dVar;
        int i2;
        com.moloco.sdk.internal.publisher.w wVar;
        com.moloco.sdk.Init.SDKInitResponse sDKInitResponse;
        long j3;
        com.moloco.sdk.internal.services.init.j jVar;
        com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar2;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2;
        com.moloco.sdk.acm.TimerEvent timerEvent2;
        com.moloco.sdk.internal.services.init.j jVar2;
        com.moloco.sdk.Init.SDKInitResponse sDKInitResponse2;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3;
        com.moloco.sdk.acm.TimerEvent timerEvent3;
        com.moloco.sdk.internal.publisher.w wVar2;
        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.internal.InterfaceC3408a> mutableStateFlow;
        com.moloco.sdk.internal.InterfaceC3408a a2;
        com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar3 = vVar;
        long j4 = j2;
        com.moloco.sdk.internal.services.init.n nVar2 = nVar;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder4 = metricsRecorder;
        com.moloco.sdk.acm.TimerEvent timerEvent4 = timerEvent;
        if (continuation instanceof com.moloco.sdk.internal.publisher.w.d) {
            dVar = (com.moloco.sdk.internal.publisher.w.d) continuation;
            int i3 = dVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.i = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = dVar.g;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dVar.i;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (vVar3 instanceof com.moloco.sdk.internal.v.a) {
                        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.publisher.Initialization> mutableStateFlow2 = this.b;
                        com.moloco.sdk.publisher.Initialization initialization = com.moloco.sdk.publisher.Initialization.FAILURE;
                        dVar.f7184a = vVar3;
                        dVar.b = nVar2;
                        dVar.c = metricsRecorder4;
                        dVar.d = timerEvent4;
                        dVar.f = j4;
                        dVar.i = 1;
                        if (mutableStateFlow2.emit(initialization, dVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "sdk init failed", null, false, 12, null);
                        jVar = (com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.v.a) vVar3).a();
                        dVar.f7184a = vVar3;
                        dVar.b = metricsRecorder4;
                        dVar.c = timerEvent4;
                        dVar.d = null;
                        dVar.i = 2;
                        if (nVar2.a(jVar, j4, dVar) != coroutine_suspended) {
                        }
                    } else if (vVar3 instanceof com.moloco.sdk.internal.v.b) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "sdk init success", null, false, 12, null);
                        com.moloco.sdk.Init.SDKInitResponse sDKInitResponse3 = (com.moloco.sdk.Init.SDKInitResponse) ((com.moloco.sdk.internal.v.b) vVar3).a();
                        this.d = sDKInitResponse3;
                        kotlinx.coroutines.flow.MutableStateFlow<com.moloco.sdk.publisher.Initialization> mutableStateFlow3 = this.b;
                        com.moloco.sdk.publisher.Initialization initialization2 = com.moloco.sdk.publisher.Initialization.SUCCESS;
                        dVar.f7184a = this;
                        dVar.b = nVar2;
                        dVar.c = metricsRecorder4;
                        dVar.d = timerEvent4;
                        dVar.e = sDKInitResponse3;
                        dVar.f = j4;
                        dVar.i = 3;
                        if (mutableStateFlow3.emit(initialization2, dVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        wVar = this;
                        sDKInitResponse = sDKInitResponse3;
                        j3 = j4;
                        dVar.f7184a = wVar;
                        dVar.b = metricsRecorder4;
                        dVar.c = timerEvent4;
                        dVar.d = sDKInitResponse;
                        dVar.e = null;
                        dVar.i = 4;
                        if (nVar2.a(j3, dVar) != coroutine_suspended) {
                        }
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else if (i2 == 1) {
                    long j5 = dVar.f;
                    com.moloco.sdk.acm.TimerEvent timerEvent5 = (com.moloco.sdk.acm.TimerEvent) dVar.d;
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder5 = (com.moloco.sdk.acm.recorder.MetricsRecorder) dVar.c;
                    com.moloco.sdk.internal.services.init.n nVar3 = (com.moloco.sdk.internal.services.init.n) dVar.b;
                    com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> vVar4 = (com.moloco.sdk.internal.v) dVar.f7184a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    timerEvent4 = timerEvent5;
                    j4 = j5;
                    vVar3 = vVar4;
                    metricsRecorder4 = metricsRecorder5;
                    nVar2 = nVar3;
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, j, "sdk init failed", null, false, 12, null);
                    jVar = (com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.v.a) vVar3).a();
                    dVar.f7184a = vVar3;
                    dVar.b = metricsRecorder4;
                    dVar.c = timerEvent4;
                    dVar.d = null;
                    dVar.i = 2;
                    if (nVar2.a(jVar, j4, dVar) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    vVar2 = vVar3;
                    metricsRecorder2 = metricsRecorder4;
                    timerEvent2 = timerEvent4;
                    jVar2 = (com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.v.a) vVar2).a();
                    if (!(jVar2 instanceof com.moloco.sdk.internal.services.init.j.a)) {
                    }
                } else if (i2 == 2) {
                    timerEvent2 = (com.moloco.sdk.acm.TimerEvent) dVar.c;
                    metricsRecorder2 = (com.moloco.sdk.acm.recorder.MetricsRecorder) dVar.b;
                    vVar2 = (com.moloco.sdk.internal.v) dVar.f7184a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    jVar2 = (com.moloco.sdk.internal.services.init.j) ((com.moloco.sdk.internal.v.a) vVar2).a();
                    if (!(jVar2 instanceof com.moloco.sdk.internal.services.init.j.a)) {
                        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c());
                        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                        com.moloco.sdk.internal.services.init.j.a aVar = (com.moloco.sdk.internal.services.init.j.a) jVar2;
                        metricsRecorder2.recordCountEvent(countEvent.withTag(dVar2.c(), aVar.a().name()));
                        metricsRecorder2.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), aVar.a().name()));
                    } else if (jVar2 instanceof com.moloco.sdk.internal.services.init.j.b) {
                        com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c.c());
                        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.b;
                        com.moloco.sdk.internal.services.init.j.b bVar = (com.moloco.sdk.internal.services.init.j.b) jVar2;
                        metricsRecorder2.recordCountEvent(countEvent2.withTag(dVar3.c(), java.lang.String.valueOf(bVar.a())));
                        metricsRecorder2.recordTimerEvent(timerEvent2.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar3.c(), java.lang.String.valueOf(bVar.a())));
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                } else if (i2 == 3) {
                    j3 = dVar.f;
                    sDKInitResponse = (com.moloco.sdk.Init.SDKInitResponse) dVar.e;
                    com.moloco.sdk.acm.TimerEvent timerEvent6 = (com.moloco.sdk.acm.TimerEvent) dVar.d;
                    metricsRecorder4 = (com.moloco.sdk.acm.recorder.MetricsRecorder) dVar.c;
                    com.moloco.sdk.internal.services.init.n nVar4 = (com.moloco.sdk.internal.services.init.n) dVar.b;
                    wVar = (com.moloco.sdk.internal.publisher.w) dVar.f7184a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    timerEvent4 = timerEvent6;
                    nVar2 = nVar4;
                    dVar.f7184a = wVar;
                    dVar.b = metricsRecorder4;
                    dVar.c = timerEvent4;
                    dVar.d = sDKInitResponse;
                    dVar.e = null;
                    dVar.i = 4;
                    if (nVar2.a(j3, dVar) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sDKInitResponse2 = sDKInitResponse;
                    metricsRecorder3 = metricsRecorder4;
                    timerEvent3 = timerEvent4;
                    wVar2 = wVar;
                    com.moloco.sdk.acm.CountEvent countEvent3 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.b.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar4 = com.moloco.sdk.internal.client_metrics_data.d.e;
                    java.lang.String c2 = dVar4.c();
                    java.lang.String countryIso2Code = sDKInitResponse2.getCountryIso2Code();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(countryIso2Code, "getCountryIso2Code(...)");
                    metricsRecorder3.recordCountEvent(countEvent3.withTag(c2, countryIso2Code));
                    com.moloco.sdk.acm.TimerEvent withTag = timerEvent3.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success");
                    java.lang.String c3 = dVar4.c();
                    java.lang.String countryIso2Code2 = sDKInitResponse2.getCountryIso2Code();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(countryIso2Code2, "getCountryIso2Code(...)");
                    metricsRecorder3.recordTimerEvent(withTag.withTag(c3, countryIso2Code2));
                    mutableStateFlow = wVar2.e;
                    a2 = com.moloco.sdk.service_locator.a.f.f7347a.a(sDKInitResponse2);
                    dVar.f7184a = null;
                    dVar.b = null;
                    dVar.c = null;
                    dVar.d = null;
                    dVar.i = 5;
                    if (mutableStateFlow.emit(a2, dVar) == coroutine_suspended) {
                    }
                } else if (i2 == 4) {
                    sDKInitResponse2 = (com.moloco.sdk.Init.SDKInitResponse) dVar.d;
                    timerEvent3 = (com.moloco.sdk.acm.TimerEvent) dVar.c;
                    metricsRecorder3 = (com.moloco.sdk.acm.recorder.MetricsRecorder) dVar.b;
                    wVar2 = (com.moloco.sdk.internal.publisher.w) dVar.f7184a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.acm.CountEvent countEvent32 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.b.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar42 = com.moloco.sdk.internal.client_metrics_data.d.e;
                    java.lang.String c22 = dVar42.c();
                    java.lang.String countryIso2Code3 = sDKInitResponse2.getCountryIso2Code();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(countryIso2Code3, "getCountryIso2Code(...)");
                    metricsRecorder3.recordCountEvent(countEvent32.withTag(c22, countryIso2Code3));
                    com.moloco.sdk.acm.TimerEvent withTag2 = timerEvent3.withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success");
                    java.lang.String c32 = dVar42.c();
                    java.lang.String countryIso2Code22 = sDKInitResponse2.getCountryIso2Code();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(countryIso2Code22, "getCountryIso2Code(...)");
                    metricsRecorder3.recordTimerEvent(withTag2.withTag(c32, countryIso2Code22));
                    mutableStateFlow = wVar2.e;
                    a2 = com.moloco.sdk.service_locator.a.f.f7347a.a(sDKInitResponse2);
                    dVar.f7184a = null;
                    dVar.b = null;
                    dVar.c = null;
                    dVar.d = null;
                    dVar.i = 5;
                    if (mutableStateFlow.emit(a2, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        dVar = new com.moloco.sdk.internal.publisher.w.d(continuation);
        java.lang.Object obj2 = dVar.g;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dVar.i;
        if (i2 != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
