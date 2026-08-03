package com.moloco.sdk.internal.services.init;

/* loaded from: classes5.dex */
public final class l implements com.moloco.sdk.internal.services.init.k {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.init.d f7296a;
    public final com.moloco.sdk.internal.services.init.g b;
    public final kotlinx.coroutines.CoroutineScope c;
    public com.moloco.sdk.Init.SDKInitResponse d;

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", i = {0, 0, 0, 0, 1}, l = {94, 107}, m = "fetchInitResponse", n = {"this", "appKey", "mediationInfo", "metricsRecorder", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7297a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public /* synthetic */ java.lang.Object e;
        public int g;

        public a(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.l.a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.init.l.this.a(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl$fetchInitResponse$3", f = "InitService.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f7298a;
        public final /* synthetic */ java.lang.String c;
        public final /* synthetic */ com.moloco.sdk.publisher.MediationInfo d;
        public final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.l.b> continuation) {
            super(2, continuation);
            this.c = str;
            this.d = mediationInfo;
            this.e = metricsRecorder;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.moloco.sdk.internal.services.init.l.b) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.moloco.sdk.internal.services.init.l.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f7298a;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.m.f7301a, "Async fetching init response", null, false, 12, null);
                com.moloco.sdk.internal.services.init.l lVar = com.moloco.sdk.internal.services.init.l.this;
                java.lang.String str = this.c;
                com.moloco.sdk.publisher.MediationInfo mediationInfo = this.d;
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.e;
                this.f7298a = 1;
                if (lVar.a(str, mediationInfo, metricsRecorder, true, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>>) this) == coroutine_suspended) {
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

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 4, 4}, l = {135, 144, 146, 183, 196}, m = "fetchServerInitResponse$moloco_sdk_release", n = {"this", "appKey", "mediationInfo", "metricsRecorder", "result", "asyncFetch", "attempt", "metricsRecorder", "it", "cacheKey", "$this$fetchServerInitResponse_u24lambda_u244_u24lambda_u242_u24lambda_u241", "asyncFetch", "attempt", "metricsRecorder", "it", "asyncFetch", "attempt", "result", "this", "appKey", "mediationInfo", "metricsRecorder", "result", "asyncFetch"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$2", "L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"})
    public static final class c extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7299a;
        public java.lang.Object b;
        public java.lang.Object c;
        public java.lang.Object d;
        public java.lang.Object e;
        public java.lang.Object f;
        public boolean g;
        public int h;
        public int i;
        public int j;
        public /* synthetic */ java.lang.Object k;
        public int m;

        public c(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.l.c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.init.l.this.a((java.lang.String) null, (com.moloco.sdk.publisher.MediationInfo) null, (com.moloco.sdk.acm.recorder.MetricsRecorder) null, false, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>>) this);
        }
    }

    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", i = {0, 0}, l = {68}, m = "performInit", n = {"metricsRecorder", "performInitEvent"}, s = {"L$0", "L$1"})
    public static final class d extends kotlin.coroutines.jvm.internal.ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.Object f7300a;
        public java.lang.Object b;
        public /* synthetic */ java.lang.Object c;
        public int e;

        public d(kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.l.d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return com.moloco.sdk.internal.services.init.l.this.a(null, null, this);
        }
    }

    public l(com.moloco.sdk.internal.services.init.d initApi, com.moloco.sdk.internal.services.init.g initCache, kotlinx.coroutines.CoroutineScope scope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initApi, "initApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initCache, "initCache");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "scope");
        this.f7296a = initApi;
        this.b = initCache;
        this.c = scope;
    }

    @Override // com.moloco.sdk.internal.services.init.k
    public com.moloco.sdk.Init.SDKInitResponse a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.moloco.sdk.internal.services.init.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
        com.moloco.sdk.internal.services.init.l.d dVar;
        int i;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder;
        com.moloco.sdk.acm.TimerEvent timerEvent;
        com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j> d2;
        if (continuation instanceof com.moloco.sdk.internal.services.init.l.d) {
            dVar = (com.moloco.sdk.internal.services.init.l.d) continuation;
            int i2 = dVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.e = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = dVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.acm.recorder.MetricsRecorder create = com.moloco.sdk.acm.recorder.MetricsRecorder.INSTANCE.create(mediationInfo.getName());
                    com.moloco.sdk.acm.TimerEvent startTimerEvent = create.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.e.c.c());
                    dVar.f7300a = create;
                    dVar.b = startTimerEvent;
                    dVar.e = 1;
                    java.lang.Object a2 = a(str, mediationInfo, create, dVar);
                    if (a2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    metricsRecorder = create;
                    obj = a2;
                    timerEvent = startTimerEvent;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    timerEvent = (com.moloco.sdk.acm.TimerEvent) dVar.b;
                    metricsRecorder = (com.moloco.sdk.acm.recorder.MetricsRecorder) dVar.f7300a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.moloco.sdk.internal.services.init.c cVar = (com.moloco.sdk.internal.services.init.c) obj;
                d2 = cVar.d();
                if (!(d2 instanceof com.moloco.sdk.internal.v.a)) {
                    com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.d.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder.recordCountEvent(countEvent.withTag(dVar2.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("state", cVar.c()));
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(dVar2.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag("state", cVar.c()));
                } else if (d2 instanceof com.moloco.sdk.internal.v.b) {
                    com.moloco.sdk.acm.CountEvent countEvent2 = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.d.c());
                    com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.d;
                    metricsRecorder.recordCountEvent(countEvent2.withTag(dVar3.c(), "success").withTag("state", cVar.c()));
                    metricsRecorder.recordTimerEvent(timerEvent.withTag(dVar3.c(), "success").withTag("state", cVar.c()));
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return cVar.d();
            }
        }
        dVar = new com.moloco.sdk.internal.services.init.l.d(continuation);
        java.lang.Object obj2 = dVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dVar.e;
        if (i != 0) {
        }
        com.moloco.sdk.internal.services.init.c cVar2 = (com.moloco.sdk.internal.services.init.c) obj2;
        d2 = cVar2.d();
        if (!(d2 instanceof com.moloco.sdk.internal.v.a)) {
        }
        return cVar2.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.services.init.c> continuation) {
        com.moloco.sdk.internal.services.init.l.a aVar;
        int i;
        com.moloco.sdk.internal.services.init.l lVar;
        java.lang.String str2;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2;
        com.moloco.sdk.publisher.MediationInfo mediationInfo2;
        com.moloco.sdk.Init.SDKInitResponse sDKInitResponse;
        com.moloco.sdk.internal.services.init.l lVar2;
        com.moloco.sdk.internal.v vVar;
        if (continuation instanceof com.moloco.sdk.internal.services.init.l.a) {
            aVar = (com.moloco.sdk.internal.services.init.l.a) continuation;
            int i2 = aVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g = i2 - Integer.MIN_VALUE;
                com.moloco.sdk.internal.services.init.l.a aVar2 = aVar;
                java.lang.Object obj = aVar2.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = aVar2.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.moloco.sdk.Init.SDKInitResponse sDKInitResponse2 = this.d;
                    if (sDKInitResponse2 != null) {
                        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.m.f7301a, "Returning current session init response", null, false, 12, null);
                        return new com.moloco.sdk.internal.services.init.c(new com.moloco.sdk.internal.v.b(sDKInitResponse2), "in_memory");
                    }
                    com.moloco.sdk.internal.services.init.g gVar = this.b;
                    com.moloco.sdk.internal.services.init.a aVar3 = new com.moloco.sdk.internal.services.init.a(str);
                    aVar2.f7297a = this;
                    aVar2.b = str;
                    aVar2.c = mediationInfo;
                    aVar2.d = metricsRecorder;
                    aVar2.g = 1;
                    obj = gVar.a(aVar3, metricsRecorder, aVar2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    lVar = this;
                    str2 = str;
                    metricsRecorder2 = metricsRecorder;
                    mediationInfo2 = mediationInfo;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lVar2 = (com.moloco.sdk.internal.services.init.l) aVar2.f7297a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        vVar = (com.moloco.sdk.internal.v) obj;
                        if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                            lVar2.d = (com.moloco.sdk.Init.SDKInitResponse) ((com.moloco.sdk.internal.v.b) vVar).a();
                        } else if (vVar instanceof com.moloco.sdk.internal.v.a) {
                            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.m.f7301a, "Fetching init response failed", null, false, 12, null);
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return new com.moloco.sdk.internal.services.init.c(vVar, "network");
                    }
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3 = (com.moloco.sdk.acm.recorder.MetricsRecorder) aVar2.d;
                    com.moloco.sdk.publisher.MediationInfo mediationInfo3 = (com.moloco.sdk.publisher.MediationInfo) aVar2.c;
                    java.lang.String str3 = (java.lang.String) aVar2.b;
                    com.moloco.sdk.internal.services.init.l lVar3 = (com.moloco.sdk.internal.services.init.l) aVar2.f7297a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    metricsRecorder2 = metricsRecorder3;
                    mediationInfo2 = mediationInfo3;
                    str2 = str3;
                    lVar = lVar3;
                }
                sDKInitResponse = (com.moloco.sdk.Init.SDKInitResponse) obj;
                if (sDKInitResponse == null) {
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.m.f7301a, "Returning cached init response", null, false, 12, null);
                    lVar.d = sDKInitResponse;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(lVar.c, null, null, lVar.new b(str2, mediationInfo2, metricsRecorder2, null), 3, null);
                    return new com.moloco.sdk.internal.services.init.c(new com.moloco.sdk.internal.v.b(sDKInitResponse), "cache");
                }
                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.m.f7301a, "No cached response, fetching from server", null, false, 12, null);
                aVar2.f7297a = lVar;
                aVar2.b = null;
                aVar2.c = null;
                aVar2.d = null;
                aVar2.g = 2;
                obj = lVar.a(str2, mediationInfo2, metricsRecorder2, false, (kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>>) aVar2);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lVar2 = lVar;
                vVar = (com.moloco.sdk.internal.v) obj;
                if (!(vVar instanceof com.moloco.sdk.internal.v.b)) {
                }
                return new com.moloco.sdk.internal.services.init.c(vVar, "network");
            }
        }
        aVar = new com.moloco.sdk.internal.services.init.l.a(continuation);
        com.moloco.sdk.internal.services.init.l.a aVar22 = aVar;
        java.lang.Object obj2 = aVar22.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = aVar22.g;
        if (i != 0) {
        }
        sDKInitResponse = (com.moloco.sdk.Init.SDKInitResponse) obj2;
        if (sDKInitResponse == null) {
        }
    }

    @Override // com.moloco.sdk.internal.services.init.k
    public java.lang.Object a(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.d = null;
        java.lang.Object a2 = this.b.a(continuation);
        return a2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x033d -> B:14:0x0344). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, com.moloco.sdk.publisher.MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z, kotlin.coroutines.Continuation<? super com.moloco.sdk.internal.v<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>> continuation) {
        com.moloco.sdk.internal.services.init.l.c cVar;
        com.moloco.sdk.internal.services.init.l lVar;
        int i;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder2;
        boolean z2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        com.moloco.sdk.internal.services.init.l.c cVar2;
        com.moloco.sdk.internal.services.init.l lVar2;
        int i2;
        int i3;
        java.lang.String str2;
        com.moloco.sdk.publisher.MediationInfo mediationInfo2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        T t;
        com.moloco.sdk.Init.SDKInitResponse sDKInitResponse;
        boolean z3;
        int i4;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder3;
        com.moloco.sdk.Init.SDKInitResponse sDKInitResponse2;
        com.moloco.sdk.internal.services.init.a aVar;
        com.moloco.sdk.internal.services.init.g gVar;
        boolean z4;
        int i5;
        com.moloco.sdk.internal.services.init.l.c cVar3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder4;
        int i6;
        java.lang.String str3;
        com.moloco.sdk.publisher.MediationInfo mediationInfo3;
        com.moloco.sdk.internal.services.init.l lVar3;
        boolean z5;
        int i7;
        T t2;
        T t3;
        com.moloco.sdk.internal.v vVar;
        com.moloco.sdk.internal.v vVar2;
        java.lang.Object valueOf;
        com.moloco.sdk.internal.v vVar3;
        com.moloco.sdk.internal.v vVar4;
        if (continuation instanceof com.moloco.sdk.internal.services.init.l.c) {
            cVar = (com.moloco.sdk.internal.services.init.l.c) continuation;
            int i8 = cVar.m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.m = i8 - Integer.MIN_VALUE;
                lVar = this;
                java.lang.Object obj = cVar.k;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cVar.m;
                java.lang.String str4 = "async";
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    metricsRecorder2 = metricsRecorder;
                    z2 = z;
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    cVar2 = cVar;
                    lVar2 = lVar;
                    i2 = 0;
                    i3 = 3;
                    str2 = str;
                    mediationInfo2 = mediationInfo;
                    if (i2 < i3) {
                    }
                } else if (i == 1) {
                    i5 = cVar.j;
                    i7 = cVar.i;
                    int i9 = cVar.h;
                    boolean z6 = cVar.g;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) cVar.f;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) cVar.e;
                    metricsRecorder4 = (com.moloco.sdk.acm.recorder.MetricsRecorder) cVar.d;
                    com.moloco.sdk.publisher.MediationInfo mediationInfo4 = (com.moloco.sdk.publisher.MediationInfo) cVar.c;
                    str3 = (java.lang.String) cVar.b;
                    com.moloco.sdk.internal.services.init.l lVar4 = (com.moloco.sdk.internal.services.init.l) cVar.f7299a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    i6 = i9;
                    z5 = z6;
                    lVar3 = lVar4;
                    mediationInfo3 = mediationInfo4;
                    objectRef3 = objectRef4;
                    t2 = obj;
                    objectRef.element = t2;
                    t3 = objectRef3.element;
                    if (t3 != 0) {
                    }
                    if (vVar instanceof com.moloco.sdk.internal.v.b) {
                    }
                } else if (i == 2) {
                    i5 = cVar.h;
                    z4 = cVar.g;
                    gVar = (com.moloco.sdk.internal.services.init.g) cVar.d;
                    aVar = (com.moloco.sdk.internal.services.init.a) cVar.c;
                    sDKInitResponse2 = (com.moloco.sdk.Init.SDKInitResponse) cVar.b;
                    com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder5 = (com.moloco.sdk.acm.recorder.MetricsRecorder) cVar.f7299a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    cVar3 = cVar;
                    metricsRecorder3 = metricsRecorder5;
                    com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.m.f7301a, "Updating cache to new init response", null, false, 12, null);
                    cVar3.f7299a = metricsRecorder3;
                    cVar3.b = sDKInitResponse2;
                    cVar3.c = null;
                    cVar3.d = null;
                    cVar3.g = z4;
                    cVar3.h = i5;
                    cVar3.m = 3;
                    if (gVar.a(aVar, metricsRecorder3, sDKInitResponse2, cVar3) != coroutine_suspended) {
                    }
                } else {
                    if (i == 3) {
                        i4 = cVar.h;
                        z3 = cVar.g;
                        sDKInitResponse = (com.moloco.sdk.Init.SDKInitResponse) cVar.b;
                        metricsRecorder3 = (com.moloco.sdk.acm.recorder.MetricsRecorder) cVar.f7299a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        metricsRecorder3.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), java.lang.String.valueOf(i4)).withTag(str4, java.lang.String.valueOf(z3)));
                        return new com.moloco.sdk.internal.v.b(sDKInitResponse);
                    }
                    if (i == 4) {
                        objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) cVar.f7299a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        t = objectRef2.element;
                        if (t == 0) {
                        }
                    } else {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i10 = cVar.i;
                        int i11 = cVar.h;
                        boolean z7 = cVar.g;
                        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) cVar.e;
                        com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder6 = (com.moloco.sdk.acm.recorder.MetricsRecorder) cVar.d;
                        com.moloco.sdk.publisher.MediationInfo mediationInfo5 = (com.moloco.sdk.publisher.MediationInfo) cVar.c;
                        java.lang.String str5 = (java.lang.String) cVar.b;
                        com.moloco.sdk.internal.services.init.l lVar5 = (com.moloco.sdk.internal.services.init.l) cVar.f7299a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.moloco.sdk.internal.services.init.l.c cVar4 = cVar;
                        java.lang.String str6 = "async";
                        mediationInfo2 = mediationInfo5;
                        lVar2 = lVar5;
                        str2 = str5;
                        i3 = i11;
                        z5 = z7;
                        metricsRecorder4 = metricsRecorder6;
                        i2 = i10 + 1;
                        str4 = str6;
                        z2 = z5;
                        metricsRecorder2 = metricsRecorder4;
                        objectRef = objectRef3;
                        cVar2 = cVar4;
                        if (i2 < i3) {
                            com.moloco.sdk.internal.services.init.d dVar = lVar2.f7296a;
                            cVar2.f7299a = lVar2;
                            cVar2.b = str2;
                            cVar2.c = mediationInfo2;
                            cVar2.d = metricsRecorder2;
                            cVar2.e = objectRef;
                            cVar2.f = objectRef;
                            cVar2.g = z2;
                            cVar2.h = i3;
                            cVar2.i = i2;
                            cVar2.j = i2;
                            cVar2.m = 1;
                            java.lang.Object a2 = dVar.a(str2, mediationInfo2, metricsRecorder2, cVar2);
                            if (a2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            metricsRecorder4 = metricsRecorder2;
                            i5 = i2;
                            objectRef3 = objectRef;
                            lVar3 = lVar2;
                            str3 = str2;
                            t2 = a2;
                            i6 = i3;
                            mediationInfo3 = mediationInfo2;
                            cVar = cVar2;
                            z5 = z2;
                            i7 = i5;
                            objectRef.element = t2;
                            t3 = objectRef3.element;
                            if (t3 != 0) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("result");
                                vVar = null;
                            } else {
                                vVar = (com.moloco.sdk.internal.v) t3;
                            }
                            if (vVar instanceof com.moloco.sdk.internal.v.b) {
                                T t4 = objectRef3.element;
                                if (t4 == 0) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("result");
                                    vVar3 = null;
                                } else {
                                    vVar3 = (com.moloco.sdk.internal.v) t4;
                                }
                                kotlin.jvm.internal.Intrinsics.checkNotNull(vVar3, "null cannot be cast to non-null type com.moloco.sdk.internal.Result.Success<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.InitFailure>");
                                com.moloco.sdk.Init.SDKInitResponse sDKInitResponse3 = (com.moloco.sdk.Init.SDKInitResponse) ((com.moloco.sdk.internal.v.b) vVar3).a();
                                com.moloco.sdk.internal.MolocoLogger molocoLogger = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.m.f7301a, "Init, successful in attempt(#" + i5 + ')', null, false, 12, null);
                                com.moloco.sdk.internal.services.init.a aVar2 = new com.moloco.sdk.internal.services.init.a(str3);
                                com.moloco.sdk.internal.services.init.g gVar2 = lVar3.b;
                                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger, com.moloco.sdk.internal.services.init.m.f7301a, "Clearing cache for old init response", null, false, 12, null);
                                cVar.f7299a = metricsRecorder4;
                                cVar.b = sDKInitResponse3;
                                cVar.c = aVar2;
                                cVar.d = gVar2;
                                cVar.e = null;
                                cVar.f = null;
                                cVar.g = z5;
                                cVar.h = i5;
                                cVar.m = 2;
                                if (gVar2.b(aVar2, metricsRecorder4, cVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                z4 = z5;
                                gVar = gVar2;
                                aVar = aVar2;
                                sDKInitResponse2 = sDKInitResponse3;
                                cVar3 = cVar;
                                metricsRecorder3 = metricsRecorder4;
                                com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, com.moloco.sdk.internal.services.init.m.f7301a, "Updating cache to new init response", null, false, 12, null);
                                cVar3.f7299a = metricsRecorder3;
                                cVar3.b = sDKInitResponse2;
                                cVar3.c = null;
                                cVar3.d = null;
                                cVar3.g = z4;
                                cVar3.h = i5;
                                cVar3.m = 3;
                                if (gVar.a(aVar, metricsRecorder3, sDKInitResponse2, cVar3) != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i4 = i5;
                                z3 = z4;
                                sDKInitResponse = sDKInitResponse2;
                                metricsRecorder3.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "success").withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), java.lang.String.valueOf(i4)).withTag(str4, java.lang.String.valueOf(z3)));
                                return new com.moloco.sdk.internal.v.b(sDKInitResponse);
                            }
                            if (vVar instanceof com.moloco.sdk.internal.v.a) {
                                T t5 = objectRef3.element;
                                if (t5 == 0) {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("result");
                                    vVar2 = null;
                                } else {
                                    vVar2 = (com.moloco.sdk.internal.v) t5;
                                }
                                kotlin.jvm.internal.Intrinsics.checkNotNull(vVar2, "null cannot be cast to non-null type com.moloco.sdk.internal.Result.Failure<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.InitFailure>");
                                com.moloco.sdk.internal.v.a aVar3 = (com.moloco.sdk.internal.v.a) vVar2;
                                com.moloco.sdk.internal.services.init.j jVar = (com.moloco.sdk.internal.services.init.j) aVar3.a();
                                if (jVar instanceof com.moloco.sdk.internal.services.init.j.a) {
                                    valueOf = ((com.moloco.sdk.internal.services.init.j.a) jVar).a();
                                } else {
                                    if (!(jVar instanceof com.moloco.sdk.internal.services.init.j.b)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    valueOf = java.lang.String.valueOf(((com.moloco.sdk.internal.services.init.j.b) jVar).a());
                                }
                                int i12 = i7;
                                int i13 = i6;
                                metricsRecorder4.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), com.facebook.login.LoginLogger.EVENT_EXTRAS_FAILURE).withTag(com.moloco.sdk.internal.client_metrics_data.d.f.c(), java.lang.String.valueOf(i5)).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), java.lang.String.valueOf(valueOf)).withTag(str4, java.lang.String.valueOf(z5)));
                                com.moloco.sdk.internal.MolocoLogger molocoLogger2 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                                com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger2, com.moloco.sdk.internal.services.init.m.f7301a, "Init attempt(#" + i5 + ") failed with error: " + valueOf, null, false, 12, null);
                                if (!com.moloco.sdk.internal.services.init.m.a((com.moloco.sdk.internal.v.a<com.moloco.sdk.Init.SDKInitResponse, com.moloco.sdk.internal.services.init.j>) aVar3)) {
                                    if (aVar3.a() instanceof com.moloco.sdk.internal.services.init.j.b) {
                                        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger2, com.moloco.sdk.internal.services.init.m.f7301a, "Init response is non-retryable server failure: " + ((com.moloco.sdk.internal.services.init.j.b) aVar3.a()).a() + ", clearing cache", null, false, 12, null);
                                        com.moloco.sdk.internal.services.init.g gVar3 = lVar3.b;
                                        com.moloco.sdk.internal.services.init.a aVar4 = new com.moloco.sdk.internal.services.init.a(str3);
                                        cVar.f7299a = objectRef3;
                                        cVar.b = null;
                                        cVar.c = null;
                                        cVar.d = null;
                                        cVar.e = null;
                                        cVar.f = null;
                                        cVar.m = 4;
                                        if (gVar3.b(aVar4, metricsRecorder4, cVar) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        com.moloco.sdk.internal.MolocoLogger.error$default(molocoLogger2, com.moloco.sdk.internal.services.init.m.f7301a, "Init response is non-retryable server or client failure: " + aVar3.a(), null, false, 12, null);
                                    }
                                    objectRef2 = objectRef3;
                                    t = objectRef2.element;
                                    if (t == 0) {
                                        return (com.moloco.sdk.internal.v) t;
                                    }
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("result");
                                    return null;
                                }
                                cVar.f7299a = lVar3;
                                cVar.b = str3;
                                cVar.c = mediationInfo3;
                                cVar.d = metricsRecorder4;
                                cVar.e = objectRef3;
                                cVar.f = null;
                                cVar.g = z5;
                                cVar.h = i13;
                                cVar.i = i12;
                                cVar.m = 5;
                                str6 = str4;
                                if (kotlinx.coroutines.DelayKt.delay(1000L, cVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i10 = i12;
                                cVar4 = cVar;
                                mediationInfo2 = mediationInfo3;
                                i3 = i13;
                                str2 = str3;
                                lVar2 = lVar3;
                                i2 = i10 + 1;
                                str4 = str6;
                                z2 = z5;
                                metricsRecorder2 = metricsRecorder4;
                                objectRef = objectRef3;
                                cVar2 = cVar4;
                                if (i2 < i3) {
                                    com.moloco.sdk.internal.MolocoLogger molocoLogger3 = com.moloco.sdk.internal.MolocoLogger.INSTANCE;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Moloco SDK Init failed after all retries: ");
                                    java.lang.Object obj2 = objectRef.element;
                                    if (obj2 == null) {
                                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("result");
                                        vVar4 = null;
                                    } else {
                                        vVar4 = (com.moloco.sdk.internal.v) obj2;
                                    }
                                    sb.append(vVar4);
                                    com.moloco.sdk.internal.MolocoLogger.info$default(molocoLogger3, com.moloco.sdk.internal.services.init.m.f7301a, sb.toString(), null, false, 12, null);
                                    T t6 = objectRef.element;
                                    if (t6 != 0) {
                                        return (com.moloco.sdk.internal.v) t6;
                                    }
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("result");
                                    return null;
                                }
                            } else {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                        }
                    }
                }
            }
        }
        lVar = this;
        cVar = lVar.new c(continuation);
        java.lang.Object obj3 = cVar.k;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cVar.m;
        java.lang.String str42 = "async";
        if (i != 0) {
        }
    }
}
