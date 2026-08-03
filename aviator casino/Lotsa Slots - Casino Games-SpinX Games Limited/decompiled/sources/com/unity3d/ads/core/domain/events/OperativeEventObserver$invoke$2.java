package com.unity3d.ads.core.domain.events;

/* compiled from: OperativeEventObserver.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class OperativeEventObserver$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.events.OperativeEventObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperativeEventObserver$invoke$2(com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = operativeEventObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        java.lang.Boolean bool;
        com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.isRunning;
            do {
                value = mutableStateFlow.getValue();
                bool = (java.lang.Boolean) value;
                bool.booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
            if (bool.booleanValue()) {
                return kotlin.Unit.INSTANCE;
            }
            operativeEventRepository = this.this$0.operativeEventRepository;
            kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(operativeEventRepository.getOperativeEvents(), new com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2.AnonymousClass2(this.this$0, null));
            coroutineScope = this.this$0.scope;
            kotlinx.coroutines.flow.FlowKt.launchIn(onEach, coroutineScope);
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* compiled from: OperativeEventObserver.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "operativeEventRequest", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventRequest;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", i = {1, 1}, l = {44, 48, 53}, m = "invokeSuspend", n = {"fullRequest", "workId"}, s = {"L$0", "L$1"})
    /* renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        final /* synthetic */ com.unity3d.ads.core.domain.events.OperativeEventObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.unity3d.ads.core.domain.events.OperativeEventObserver operativeEventObserver, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2.AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = operativeEventObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2.AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2.AnonymousClass2) create(operativeEventRequest, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(1:(3:6|7|8)(2:10|11))(6:12|13|14|15|7|8))(1:21))(2:30|(1:32))|22|23|24|(1:26)(4:27|15|7|8)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ce, code lost:
        
            r3 = r8;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00f0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest;
            java.lang.String uuid;
            com.unity3d.ads.core.data.datasource.UniversalRequestDataSource universalRequestDataSource;
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender;
            com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
            com.unity3d.ads.core.domain.work.BackgroundWorker backgroundWorker;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
                gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl _create = companion._create(newBuilder);
                _create.setOperativeEvent(operativeEventRequest);
                gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload _build = _create._build();
                getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(_build, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    uuid = (java.lang.String) this.L$1;
                    universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) this.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.core.domain.work.UniversalRequestWorkerData universalRequestWorkerData = new com.unity3d.ads.core.domain.work.UniversalRequestWorkerData(uuid);
                        backgroundWorker = this.this$0.backgroundWorker;
                        androidx.work.OneTimeWorkRequest build = new androidx.work.OneTimeWorkRequest.Builder(com.unity3d.ads.core.domain.work.OperativeEventJob.class).setInputData(universalRequestWorkerData.invoke()).addTag(com.unity3d.ads.core.domain.work.BackgroundWorker.TAG).build();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                        backgroundWorker.getWorkManager().enqueue(build);
                    } catch (java.lang.Throwable unused) {
                        universalRequestEventSender = this.this$0.universalRequestEventSender;
                        getRequestPolicy = this.this$0.operativeRequestPolicy;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        if (universalRequestEventSender.invoke(universalRequest, getRequestPolicy.invoke(), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest2 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
            uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            universalRequestDataSource = this.this$0.universalRequestDataSource;
            byte[] byteArray = universalRequest2.toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "fullRequest.toByteArray()");
            this.L$0 = universalRequest2;
            this.L$1 = uuid;
            this.label = 2;
            if (universalRequestDataSource.set(uuid, com.google.protobuf.kotlin.ByteStringsKt.toByteString(byteArray), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            universalRequest = universalRequest2;
            com.unity3d.ads.core.domain.work.UniversalRequestWorkerData universalRequestWorkerData2 = new com.unity3d.ads.core.domain.work.UniversalRequestWorkerData(uuid);
            backgroundWorker = this.this$0.backgroundWorker;
            androidx.work.OneTimeWorkRequest build2 = new androidx.work.OneTimeWorkRequest.Builder(com.unity3d.ads.core.domain.work.OperativeEventJob.class).setInputData(universalRequestWorkerData2.invoke()).addTag(com.unity3d.ads.core.domain.work.BackgroundWorker.TAG).build();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build2, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
            backgroundWorker.getWorkManager().enqueue(build2);
            return kotlin.Unit.INSTANCE;
        }
    }
}
