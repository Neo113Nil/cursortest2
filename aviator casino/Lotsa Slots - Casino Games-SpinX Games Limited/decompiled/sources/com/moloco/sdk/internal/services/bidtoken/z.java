package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class z implements com.moloco.sdk.internal.services.bidtoken.y {
    public static final int i = 8;
    public final com.moloco.sdk.internal.services.bidtoken.InterfaceC3430a b;
    public final kotlinx.coroutines.CoroutineScope c;
    public final com.moloco.sdk.internal.services.bidtoken.v d;
    public final java.lang.String e;
    public boolean f;
    public final kotlinx.coroutines.sync.Mutex g;
    public kotlinx.coroutines.Job h;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$bidToken$2", f = "ServerBidTokenService.kt", i = {}, l = {com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.k>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7257a;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.z.a> continuation) {
            super(1, continuation);
            this.c = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.k> continuation) {
            return ((com.moloco.sdk.internal.services.bidtoken.z.a) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.bidtoken.z.this.new a(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7257a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.services.bidtoken.z.this.b("[Thread: " + java.lang.Thread.currentThread().getName() + "] Acquired lock, fetching status of current token");
                com.moloco.sdk.internal.services.bidtoken.v vVar = com.moloco.sdk.internal.services.bidtoken.z.this.d;
                this.f7257a = 1;
                obj = vVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.services.bidtoken.B b = (com.moloco.sdk.internal.services.bidtoken.B) obj;
            com.moloco.sdk.internal.services.bidtoken.z.this.a("[Thread: " + java.lang.Thread.currentThread().getName() + "] bidToken status: " + b);
            if (!b.b()) {
                com.moloco.sdk.internal.services.bidtoken.z.this.b("[Thread: " + java.lang.Thread.currentThread().getName() + "] bidToken needs refresh, fetching new token");
                com.moloco.sdk.internal.services.bidtoken.z zVar = com.moloco.sdk.internal.services.bidtoken.z.this;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.c;
                com.moloco.sdk.internal.services.bidtoken.k b2 = com.moloco.sdk.internal.services.bidtoken.e.b();
                this.f7257a = 2;
                obj = zVar.a(metricsRecorder, b2, false, false, this);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2 = this.c;
            com.moloco.sdk.acm.CountEvent withTag = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.v.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "true").withTag("initial_fetch", "false");
            com.moloco.sdk.internal.services.bidtoken.B b3 = com.moloco.sdk.internal.services.bidtoken.B.b;
            metricsRecorder2.recordCountEvent(withTag.withTag("expiring", b != b3 ? "false" : "true"));
            com.moloco.sdk.internal.services.bidtoken.k a2 = com.moloco.sdk.internal.services.bidtoken.z.this.d.a();
            if (b == b3) {
                com.moloco.sdk.internal.services.bidtoken.z.this.a("[Thread: " + java.lang.Thread.currentThread().getName() + "] bidToken is expiring, returning cached, and refreshing async");
                com.moloco.sdk.internal.services.bidtoken.z.this.a(this.c);
            } else {
                com.moloco.sdk.internal.services.bidtoken.z.this.a("[Thread: " + java.lang.Thread.currentThread().getName() + "] bidToken doesn't need refresh, returning cached");
            }
            return a2;
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl", f = "ServerBidTokenService.kt", i = {0, 0, 0, 0, 0, 0, 1, 1}, l = {129, 173}, m = "fetchServerBidToken$moloco_sdk_release", n = {"this", "metricsRecorder", "defaultTokenOnError", "bidTokenTimer", "asyncFetch", "wasExpiring", "this", "bidTokenFetchResult"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1"})
    public static final class b extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7258a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public boolean e;
        public boolean f;
        public /* synthetic */ java.lang.Object g;
        public int i;

        public b(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.z.b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.bidtoken.z.this.a(null, null, false, false, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$fetchServerBidToken$bidTokenComponents$1", f = "ServerBidTokenService.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7259a;
        public final /* synthetic */ com.moloco.sdk.internal.v<com.moloco.sdk.internal.services.bidtoken.k, com.moloco.sdk.internal.m> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.internal.v<com.moloco.sdk.internal.services.bidtoken.k, com.moloco.sdk.internal.m> vVar, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.z.c> continuation) {
            super(1, continuation);
            this.c = vVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.bidtoken.z.c) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.bidtoken.z.this.new c(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7259a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.services.bidtoken.v vVar = com.moloco.sdk.internal.services.bidtoken.z.this.d;
                com.moloco.sdk.internal.services.bidtoken.k kVar = (com.moloco.sdk.internal.services.bidtoken.k) ((com.moloco.sdk.internal.v.b) this.c).a();
                this.f7259a = 1;
                if (vVar.a(kVar, this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenServiceImpl$refreshTokenAsyncOnExpiry$1", f = "ServerBidTokenService.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7260a;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.z.d> continuation) {
            super(2, continuation);
            this.c = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.bidtoken.z.d) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.bidtoken.z.this.new d(this.c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7260a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.services.bidtoken.z.this.b("[Thread: " + java.lang.Thread.currentThread().getName() + "] Fetching token from server");
                com.moloco.sdk.internal.services.bidtoken.z zVar = com.moloco.sdk.internal.services.bidtoken.z.this;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.c;
                com.moloco.sdk.internal.services.bidtoken.k b = com.moloco.sdk.internal.services.bidtoken.e.b();
                this.f7260a = 1;
                if (zVar.a(metricsRecorder, b, true, true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.services.bidtoken.z.this.b("[Thread: " + java.lang.Thread.currentThread().getName() + "] Finished fetching token from server");
            return kotlin.Unit.INSTANCE;
        }
    }

    public z(com.moloco.sdk.internal.services.bidtoken.InterfaceC3430a bidTokenApi, kotlinx.coroutines.CoroutineScope scope, com.moloco.sdk.internal.services.bidtoken.v tokenCache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidTokenApi, "bidTokenApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenCache, "tokenCache");
        this.b = bidTokenApi;
        this.c = scope;
        this.d = tokenCache;
        this.e = "ServerBidTokenServiceImpl";
        this.f = true;
        this.g = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    public final void b(java.lang.String str) {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "[Thread: " + java.lang.Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }

    public final void a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        b("[Thread: " + java.lang.Thread.currentThread().getName() + "] Refreshing token async");
        com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.x.c());
        kotlinx.coroutines.Job job = this.h;
        metricsRecorder.recordCountEvent(countEvent.withTag("async", java.lang.String.valueOf(job != null ? job.isActive() : false)));
        kotlinx.coroutines.Job job2 = this.h;
        if (job2 != null && job2.isActive()) {
            b("[Thread: " + java.lang.Thread.currentThread().getName() + "] Async refresh already in progress. Returning");
            return;
        }
        b("[Thread: " + java.lang.Thread.currentThread().getName() + "] Scheduling to fetch token from server");
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.c, null, null, new com.moloco.sdk.internal.services.bidtoken.z.d(metricsRecorder, null), 3, null);
        this.h = launch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.internal.services.bidtoken.k kVar, boolean z, boolean z2, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.k> continuation) {
        com.moloco.sdk.internal.services.bidtoken.z.b bVar;
        int i2;
        com.moloco.sdk.internal.services.bidtoken.k kVar2;
        boolean z3;
        com.moloco.sdk.acm.TimerEvent timerEvent;
        boolean z4;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2;
        com.moloco.sdk.internal.services.bidtoken.z zVar;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.internal.services.bidtoken.z zVar2;
        com.moloco.sdk.internal.v vVar2;
        if (continuation instanceof com.moloco.sdk.internal.services.bidtoken.z.b) {
            bVar = (com.moloco.sdk.internal.services.bidtoken.z.b) continuation;
            int i3 = bVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.i = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.g;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bVar.i;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.acm.TimerEvent startTimerEvent = metricsRecorder.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.m.c());
                    b("[Thread: " + java.lang.Thread.currentThread().getName() + "] fetchServerBidToken");
                    com.moloco.sdk.internal.services.bidtoken.InterfaceC3430a interfaceC3430a = this.b;
                    bVar.f7258a = this;
                    bVar.b = metricsRecorder;
                    kVar2 = kVar;
                    bVar.c = kVar2;
                    bVar.d = startTimerEvent;
                    bVar.e = z;
                    z3 = z2;
                    bVar.f = z3;
                    bVar.i = 1;
                    java.lang.Object a2 = interfaceC3430a.a(metricsRecorder, bVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    timerEvent = startTimerEvent;
                    obj = a2;
                    z4 = z;
                    metricsRecorder2 = metricsRecorder;
                    zVar = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        vVar2 = (com.moloco.sdk.internal.v) bVar.b;
                        zVar2 = (com.moloco.sdk.internal.services.bidtoken.z) bVar.f7258a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.services.bidtoken.k kVar3 = (com.moloco.sdk.internal.services.bidtoken.k) ((com.moloco.sdk.internal.v.b) vVar2).a();
                        zVar2.f = false;
                        return kVar3;
                    }
                    boolean z5 = bVar.f;
                    z4 = bVar.e;
                    timerEvent = (com.moloco.sdk.acm.TimerEvent) bVar.d;
                    kVar2 = (com.moloco.sdk.internal.services.bidtoken.k) bVar.c;
                    metricsRecorder2 = (com.moloco.sdk.acm.recorder.MetricsRecorder) bVar.b;
                    com.moloco.sdk.internal.services.bidtoken.z zVar3 = (com.moloco.sdk.internal.services.bidtoken.z) bVar.f7258a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z3 = z5;
                    zVar = zVar3;
                }
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.u.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.d;
                    com.moloco.sdk.acm.CountEvent withTag = countEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE);
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.b;
                    com.moloco.sdk.internal.v.a aVar = (com.moloco.sdk.internal.v.a) vVar;
                    metricsRecorder2.recordCountEvent(withTag.withTag(dVar2.c(), java.lang.String.valueOf(((com.moloco.sdk.internal.m) aVar.a()).b())).withTag("initial_fetch", java.lang.String.valueOf(zVar.f)).withTag("was_expiring", java.lang.String.valueOf(z3)).withTag("async", java.lang.String.valueOf(z4)));
                    metricsRecorder2.recordTimerEvent(timerEvent.withTag(dVar.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(dVar2.c(), java.lang.String.valueOf(((com.moloco.sdk.internal.m) aVar.a()).b())).withTag("initial_fetch", java.lang.String.valueOf(zVar.f)).withTag("was_expiring", java.lang.String.valueOf(z3)).withTag("async", java.lang.String.valueOf(z4)));
                    com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, zVar.e, "bidtoken request failed: " + ((com.moloco.sdk.internal.m) aVar.a()).b() + ", details: " + ((com.moloco.sdk.internal.m) aVar.a()).a(), null, false, 12, null);
                    return kVar2;
                }
                if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.u.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder2.recordCountEvent(countEvent2.withTag(dVar3.c(), "success").withTag("initial_fetch", java.lang.String.valueOf(zVar.f)).withTag("was_expiring", java.lang.String.valueOf(z3)).withTag("async", java.lang.String.valueOf(z4)));
                    metricsRecorder2.recordTimerEvent(timerEvent.withTag(dVar3.c(), "success").withTag("initial_fetch", java.lang.String.valueOf(zVar.f)).withTag("was_expiring", java.lang.String.valueOf(z3)).withTag("async", java.lang.String.valueOf(z4)));
                    metricsRecorder2.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.v.c()).withTag(dVar3.c(), "false").withTag("initial_fetch", java.lang.String.valueOf(zVar.f)).withTag("async", java.lang.String.valueOf(z4)));
                    zVar.b("[Thread: " + java.lang.Thread.currentThread().getName() + "] bidtoken request success");
                    kotlinx.coroutines.sync.Mutex mutex = zVar.g;
                    com.moloco.sdk.internal.services.bidtoken.z.c cVar = zVar.new c(vVar, null);
                    bVar.f7258a = zVar;
                    bVar.b = vVar;
                    bVar.c = null;
                    bVar.d = null;
                    bVar.i = 2;
                    if (com.moloco.sdk.internal.utils.a.a(mutex, cVar, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zVar2 = zVar;
                    vVar2 = vVar;
                    com.moloco.sdk.internal.services.bidtoken.k kVar32 = (com.moloco.sdk.internal.services.bidtoken.k) ((com.moloco.sdk.internal.v.b) vVar2).a();
                    zVar2.f = false;
                    return kVar32;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        bVar = new com.moloco.sdk.internal.services.bidtoken.z.b(continuation);
        java.lang.Object obj2 = bVar.g;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bVar.i;
        if (i2 != 0) {
        }
        vVar = (com.moloco.sdk.internal.v) obj2;
        if (!(vVar instanceof com.moloco.sdk.internal.v.a)) {
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.y
    public java.lang.Object a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.bidtoken.k> continuation) {
        b("[Thread: " + java.lang.Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return com.moloco.sdk.internal.utils.a.a(this.g, new com.moloco.sdk.internal.services.bidtoken.z.a(metricsRecorder, null), continuation);
    }

    public final void a(java.lang.String str) {
        com.moloco.sdk.internal.MolocoLogger.debugBuildLog$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.e, "[Thread: " + java.lang.Thread.currentThread().getName() + "] " + str, false, 4, null);
    }
}
