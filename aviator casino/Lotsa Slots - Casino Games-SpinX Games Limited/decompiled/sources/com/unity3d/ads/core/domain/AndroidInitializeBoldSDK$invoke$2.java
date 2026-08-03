package com.unity3d.ads.core.domain;

/* compiled from: AndroidInitializeBoldSDK.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", i = {0, 0}, l = {68, 85}, m = "invokeSuspend", n = {"startTime", "isRetry"}, s = {"J$0", "I$0"})
/* loaded from: classes5.dex */
final class AndroidInitializeBoldSDK$invoke$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $source;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidInitializeBoldSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidInitializeBoldSDK$invoke$2(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = androidInitializeBoldSDK;
        this.$source = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2(this.this$0, this.$source, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.time.TimeMark, kotlin.time.TimeSource$Monotonic$ValueTimeMark, long] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
        long m12261markNowz9LOYto;
        com.unity3d.ads.core.data.repository.SessionRepository sessionRepository2;
        ?? m12262boximpl;
        java.lang.Object initializationSuccess;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                m12261markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m12261markNowz9LOYto();
                sessionRepository2 = this.this$0.sessionRepository;
                ?? r1 = !sessionRepository2.isFirstInitAttempt();
                this.J$0 = m12261markNowz9LOYto;
                this.I$0 = r1;
                this.label = 1;
                java.lang.Object withTimeout = kotlinx.coroutines.TimeoutKt.withTimeout(com.unity3d.services.UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.AnonymousClass1(this.this$0, this.$source, r1, null), this);
                i = r1;
                if (withTimeout == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                int i2 = this.I$0;
                m12261markNowz9LOYto = this.J$0;
                kotlin.ResultKt.throwOnFailure(obj);
                i = i2;
            }
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
            m12262boximpl = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(m12261markNowz9LOYto);
            java.lang.String str = this.$source;
            boolean z = i != 0;
            this.label = 2;
            initializationSuccess = androidInitializeBoldSDK.initializationSuccess(m12262boximpl, str, z, this);
            if (initializationSuccess == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Exception e) {
            com.unity3d.ads.core.data.model.exception.InitializationException parseFrom = com.unity3d.ads.core.data.model.exception.InitializationException.INSTANCE.parseFrom(e);
            if (e instanceof com.unity3d.ads.core.data.model.exception.GatewayException) {
                sessionRepository = this.this$0.sessionRepository;
                sessionRepository.setShouldInitialize(false);
            }
            this.this$0.initializationFailure(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m12262boximpl(m12262boximpl), parseFrom, this.$source, i != 0);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* compiled from: AndroidInitializeBoldSDK.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", i = {}, l = {69, 71, 73, 74}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ boolean $isRetry;
        final /* synthetic */ java.lang.String $source;
        int label;
        final /* synthetic */ com.unity3d.ads.core.domain.AndroidInitializeBoldSDK this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK, java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = androidInitializeBoldSDK;
            this.$source = str;
            this.$isRetry = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.AnonymousClass1(this.this$0, this.$source, this.$isRetry, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object initializationStart;
            com.unity3d.ads.core.domain.GetInitializationRequest getInitializationRequest;
            com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;
            com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
            java.lang.Object handleResponse;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                initializationStart = this.this$0.initializationStart(this.$source, this.$isRetry, this);
                if (initializationStart == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK = this.this$0;
                        this.label = 4;
                        handleResponse = androidInitializeBoldSDK.handleResponse((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj, this);
                        if (handleResponse == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
                    getRequestPolicy = this.this$0.getRequestPolicy;
                    com.unity3d.ads.gatewayclient.RequestPolicy invoke = getRequestPolicy.invoke();
                    gatewayClient = this.this$0.gatewayClient;
                    this.label = 3;
                    obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, invoke, com.unity3d.ads.core.data.model.OperationType.INITIALIZATION, this, 1, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK2 = this.this$0;
                    this.label = 4;
                    handleResponse = androidInitializeBoldSDK2.handleResponse((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj, this);
                    if (handleResponse == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.this$0.checkCanInitialize();
            getInitializationRequest = this.this$0.getInitializeRequest;
            this.label = 2;
            obj = getInitializationRequest.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest2 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj;
            getRequestPolicy = this.this$0.getRequestPolicy;
            com.unity3d.ads.gatewayclient.RequestPolicy invoke2 = getRequestPolicy.invoke();
            gatewayClient = this.this$0.gatewayClient;
            this.label = 3;
            obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest2, invoke2, com.unity3d.ads.core.data.model.OperationType.INITIALIZATION, this, 1, null);
            if (obj == coroutine_suspended) {
            }
            com.unity3d.ads.core.domain.AndroidInitializeBoldSDK androidInitializeBoldSDK22 = this.this$0;
            this.label = 4;
            handleResponse = androidInitializeBoldSDK22.handleResponse((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj, this);
            if (handleResponse == coroutine_suspended) {
            }
            return kotlin.Unit.INSTANCE;
        }
    }
}
