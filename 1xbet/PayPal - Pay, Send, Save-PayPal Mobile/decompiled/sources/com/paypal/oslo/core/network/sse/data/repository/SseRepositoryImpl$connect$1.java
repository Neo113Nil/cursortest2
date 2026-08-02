package com.paypal.oslo.core.network.sse.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/core/network/sse/model/SseEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1", f = "SseRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {62, 76, 104}, m = "invokeSuspend", n = {"$this$flow", "retryCount", "lastEventId", "failedWithError", "$this$flow", "retryCount", "lastEventId", "failedWithError", "eventReceived", "$this$flow", "retryCount", "lastEventId", "failedWithError", "eventReceived", "decision", "it", "$i$a$-let-SseRepositoryImpl$connect$1$5"}, nl = {63, 88, 104}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class SseRepositoryImpl$connect$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends com.paypal.oslo.core.network.sse.model.SseEvent>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl getOutputMinFrameDurationlomOqCM;
    private /* synthetic */ java.lang.Object getOutputSizes;
    int getOutputStallDurationlomOqCM;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
    
        if (r14.delayBeforeReconnect(r13.element, (java.lang.String) r12.element, r27) != r2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d8, code lost:
    
        if (r1.emit(r15, r27) == r2) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01e9  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v8, types: [T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x01d8 -> B:7:0x01dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x01db -> B:7:0x01dd). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlin.jvm.internal.Ref.IntRef intRef;
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        java.lang.String str;
        kotlin.jvm.internal.Ref.IntRef intRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        java.lang.Object obj2;
        kotlin.jvm.internal.Ref.BooleanRef booleanRef;
        java.lang.String str2;
        int i;
        char c;
        com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy sseRetryStrategy;
        com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision decideRetry;
        com.paypal.oslo.core.network.http.error.NetworkError errorToEmit;
        ?? r11;
        kotlinx.coroutines.flow.Flow callbackFlow;
        int i2;
        com.paypal.oslo.core.network.sse.config.SseConfig sseConfig;
        com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy sseRetryStrategy2;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.getOutputStallDurationlomOqCM;
        java.lang.String str3 = "last_event_id";
        int i4 = 3;
        int i5 = 1;
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = null;
        if (i3 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.Ref.IntRef intRef3 = new kotlin.jvm.internal.Ref.IntRef();
            objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            intRef = intRef3;
            objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            i2 = intRef.element;
            sseConfig = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges;
            if (i2 <= sseConfig.getMaxRetryAttempts()) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i3 == 1) {
            objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputFormats;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.getOutputMinFrameDuration;
            intRef = (kotlin.jvm.internal.Ref.IntRef) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.network.sse.LoggerKt.log;
            kotlin.Pair pair = kotlin.TuplesKt.to("endpoint", this.getHighSpeedVideoFpsRanges);
            kotlin.Pair pair2 = kotlin.TuplesKt.to("reconnection_attempt_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef.element));
            kotlin.Pair pair3 = kotlin.TuplesKt.to(str3, objectRef.element);
            kotlin.Pair[] pairArr = new kotlin.Pair[i4];
            pairArr[0] = pair;
            pairArr[i5] = pair2;
            pairArr[2] = pair3;
            com.paypal.android.logger.Logger.w$default(logger, "sse.reconnection", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            r11 = obj4;
            objectRef2.element = r11;
            final kotlin.jvm.internal.Ref.BooleanRef booleanRef2 = new kotlin.jvm.internal.Ref.BooleanRef();
            com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl = this.getOutputMinFrameDurationlomOqCM;
            java.lang.String str4 = this.getHighSpeedVideoFpsRanges;
            java.util.Map<java.lang.String, java.lang.String> map = this.getHighResolutionOutputSizeshNQ4ISI;
            com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body = this.getHighSpeedVideoFpsRangesFor;
            java.lang.Object obj5 = objectRef.element;
            java.lang.Object obj6 = obj5;
            if (intRef.element <= 0) {
            }
            str = str3;
            callbackFlow = kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1(sseRepositoryImpl, str4, (java.lang.String) obj6, body, map, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj7) {
                    return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this, (java.lang.String) obj7);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.BooleanRef.this);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj7) {
                    return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this, (com.paypal.oslo.core.network.http.error.NetworkError) obj7);
                }
            }, null));
            this.getOutputSizes = flowCollector;
            this.Camera2StreamConfigurationMap = intRef;
            this.getOutputMinFrameDuration = objectRef;
            this.getInputFormats = objectRef2;
            this.getOutputFormats = booleanRef2;
            obj2 = null;
            this.getHighSpeedVideoSizesFor = null;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM = 2;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, callbackFlow, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 == 2) {
            booleanRef = (kotlin.jvm.internal.Ref.BooleanRef) this.getOutputFormats;
            objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputFormats;
            objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.getOutputMinFrameDuration;
            intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
            str = "last_event_id";
            obj2 = null;
            if (booleanRef.element) {
            }
            str2 = str;
            i = 1;
            c = 2;
            sseRetryStrategy = this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap;
            decideRetry = sseRetryStrategy.decideRetry((com.paypal.oslo.core.network.http.error.NetworkError) objectRef4.element, intRef2.element);
            errorToEmit = decideRetry.getErrorToEmit();
            if (errorToEmit == null) {
            }
            intRef2.element = decideRetry.getNextRetryCount();
            if (decideRetry.getShouldReconnect()) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i3 != 3) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision retryDecision = (com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy.RetryDecision) this.getHighSpeedVideoSizesFor;
        objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.getInputFormats;
        objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.getOutputMinFrameDuration;
        intRef2 = (kotlin.jvm.internal.Ref.IntRef) this.Camera2StreamConfigurationMap;
        kotlin.ResultKt.throwOnFailure(obj);
        c = 2;
        obj2 = null;
        int i6 = 3;
        decideRetry = retryDecision;
        str2 = "last_event_id";
        i = 1;
        intRef2.element = decideRetry.getNextRetryCount();
        if (decideRetry.getShouldReconnect()) {
            i4 = i6;
            objectRef2 = objectRef4;
            objectRef = objectRef3;
            intRef = intRef2;
            obj3 = obj2;
            java.lang.String str5 = str2;
            i5 = i;
            str3 = str5;
            i2 = intRef.element;
            sseConfig = this.getOutputMinFrameDurationlomOqCM.getHighSpeedVideoFpsRanges;
            if (i2 <= sseConfig.getMaxRetryAttempts()) {
                r11 = obj3;
                if (intRef.element > 0) {
                    sseRetryStrategy2 = this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap;
                    this.getOutputSizes = flowCollector;
                    this.Camera2StreamConfigurationMap = intRef;
                    this.getOutputMinFrameDuration = objectRef;
                    this.getInputFormats = objectRef2;
                    this.getOutputFormats = obj3;
                    this.getHighSpeedVideoSizesFor = obj3;
                    this.getInputSizeshNQ4ISI = obj3;
                    this.getOutputStallDurationlomOqCM = i5;
                    obj4 = obj3;
                }
                objectRef2.element = r11;
                final kotlin.jvm.internal.Ref.BooleanRef booleanRef22 = new kotlin.jvm.internal.Ref.BooleanRef();
                com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl2 = this.getOutputMinFrameDurationlomOqCM;
                java.lang.String str42 = this.getHighSpeedVideoFpsRanges;
                java.util.Map<java.lang.String, java.lang.String> map2 = this.getHighResolutionOutputSizeshNQ4ISI;
                com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body2 = this.getHighSpeedVideoFpsRangesFor;
                java.lang.Object obj52 = objectRef.element;
                java.lang.Object obj62 = obj52;
                if (intRef.element <= 0) {
                    obj62 = null;
                }
                str = str3;
                callbackFlow = kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1(sseRepositoryImpl2, str42, (java.lang.String) obj62, body2, map2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj7) {
                        return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this, (java.lang.String) obj7);
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.BooleanRef.this);
                    }
                }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj7) {
                        return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this, (com.paypal.oslo.core.network.http.error.NetworkError) obj7);
                    }
                }, null));
                this.getOutputSizes = flowCollector;
                this.Camera2StreamConfigurationMap = intRef;
                this.getOutputMinFrameDuration = objectRef;
                this.getInputFormats = objectRef2;
                this.getOutputFormats = booleanRef22;
                obj2 = null;
                this.getHighSpeedVideoSizesFor = null;
                this.getInputSizeshNQ4ISI = null;
                this.getOutputStallDurationlomOqCM = 2;
                if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, callbackFlow, this) != coroutine_suspended) {
                    intRef2 = intRef;
                    objectRef3 = objectRef;
                    objectRef4 = objectRef2;
                    booleanRef = booleanRef22;
                    if (booleanRef.element || objectRef4.element == null || intRef2.element <= 0) {
                        str2 = str;
                        i = 1;
                        c = 2;
                    } else {
                        str2 = str;
                        i = 1;
                        c = 2;
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "SSE retry counter reset after established connection drop", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("endpoint", this.getHighSpeedVideoFpsRanges), kotlin.TuplesKt.to("reconnection_attempt_count", kotlin.coroutines.jvm.internal.Boxing.boxInt(intRef2.element)), kotlin.TuplesKt.to(str2, objectRef3.element)), null, 4, null);
                        intRef2.element = 0;
                    }
                    sseRetryStrategy = this.getOutputMinFrameDurationlomOqCM.Camera2StreamConfigurationMap;
                    decideRetry = sseRetryStrategy.decideRetry((com.paypal.oslo.core.network.http.error.NetworkError) objectRef4.element, intRef2.element);
                    errorToEmit = decideRetry.getErrorToEmit();
                    if (errorToEmit == null) {
                        arrow.core.Either left = arrow.core.EitherKt.left(errorToEmit);
                        this.getOutputSizes = flowCollector;
                        this.Camera2StreamConfigurationMap = intRef2;
                        this.getOutputMinFrameDuration = objectRef3;
                        this.getInputFormats = objectRef4;
                        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(booleanRef);
                        this.getHighSpeedVideoSizesFor = decideRetry;
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(errorToEmit);
                        this.getHighSpeedVideoSizes = 0;
                        i6 = 3;
                        this.getOutputStallDurationlomOqCM = 3;
                    } else {
                        i6 = 3;
                    }
                    intRef2.element = decideRetry.getNextRetryCount();
                    if (decideRetry.getShouldReconnect()) {
                    }
                }
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef objectRef, com.paypal.oslo.core.network.http.error.NetworkError networkError) {
        objectRef.element = networkError;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef objectRef, java.lang.String str) {
        objectRef.element = str;
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.BooleanRef booleanRef) {
        booleanRef.element = true;
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends com.paypal.oslo.core.network.sse.model.SseEvent>> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1 sseRepositoryImpl$connect$1 = new com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        sseRepositoryImpl$connect$1.getOutputSizes = obj;
        return sseRepositoryImpl$connect$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SseRepositoryImpl$connect$1(com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = sseRepositoryImpl;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
        this.getHighSpeedVideoFpsRangesFor = body;
    }
}
