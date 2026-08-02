package com.paypal.oslo.core.network.sse.domain.usecase;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1", f = "SubscribeToSseUseCase.kt", i = {0, 0, 0}, l = {70}, m = "invokeSuspend", n = {"$this$flow", "dataBuffer", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME}, nl = {112}, s = {"L$0", "L$1", "J$0"}, v = 2)
/* loaded from: classes10.dex */
final class SubscribeToSseUseCase$invoke$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.core.network.sse.domain.repository.SseRepository sseRepository;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "SSE stream starting", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("endpoint", this.getHighSpeedVideoFpsRangesFor)), null, 4, null);
            sseRepository = ((com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase) this.getInputSizeshNQ4ISI).getHighSpeedVideoFpsRangesFor;
            java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
            java.util.Map<java.lang.String, java.lang.String> map = this.getHighSpeedVideoFpsRanges;
            java.lang.String str2 = this.getHighSpeedVideoSizes;
            com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body = str2 != null ? new com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body(str2, "application/json") : null;
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sb);
            this.getHighResolutionOutputSizeshNQ4ISI = currentTimeMillis;
            this.getInputFormats = 1;
            if (kotlinx.coroutines.flow.FlowKt.onCompletion(sseRepository.connect(str, map, body), new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1.AnonymousClass2(this.getInputSizeshNQ4ISI, flowCollector, sb, null)).collect(new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1.AnonymousClass3(currentTimeMillis, sb, flowCollector, this.getInputSizeshNQ4ISI), this) == coroutine_suspended) {
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

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/core/network/sse/model/SseEvent;", "it", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$2", f = "SubscribeToSseUseCase.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, nl = {70}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends com.paypal.oslo.core.network.sse.model.SseEvent>>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T>> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.StringBuilder getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.access$emit(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends com.paypal.oslo.core.network.sse.model.SseEvent>> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1.AnonymousClass2(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> subscribeToSseUseCase, kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T>> flowCollector, java.lang.StringBuilder sb, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1.AnonymousClass2> continuation) {
            super(3, continuation);
            this.Camera2StreamConfigurationMap = subscribeToSseUseCase;
            this.getHighResolutionOutputSizeshNQ4ISI = flowCollector;
            this.getHighSpeedVideoFpsRanges = sb;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$3, reason: invalid class name */
    static final class AnonymousClass3<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T>> getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.StringBuilder getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ long getHighSpeedVideoSizes;

        /* JADX WARN: Code restructure failed: missing block: B:25:0x017f, code lost:
        
            if (com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.access$emit(r12, r5, r2, r3) != r4) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01a0, code lost:
        
            if (com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.access$emit(r14, r5, r2, r3) == r4) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0208, code lost:
        
            if (r5.emit(r2, r3) == r4) goto L47;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.core.network.sse.model.SseEvent> either, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$3$emit$1 subscribeToSseUseCase$invoke$1$3$emit$1;
            int i;
            java.lang.StringBuilder sb;
            kotlinx.coroutines.flow.FlowCollector<arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T>> flowCollector;
            int i2;
            com.paypal.oslo.core.network.sse.model.SseEvent sseEvent;
            java.lang.String data;
            arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.core.network.sse.model.SseEvent> either2;
            com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> subscribeToSseUseCase;
            arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.core.network.sse.model.SseEvent> either3;
            int i3;
            java.lang.StringBuilder sb2;
            kotlinx.coroutines.flow.FlowCollector<arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T>> flowCollector2;
            int i4;
            com.paypal.oslo.core.network.sse.model.SseEvent sseEvent2;
            if (continuation instanceof com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$3$emit$1) {
                subscribeToSseUseCase$invoke$1$3$emit$1 = (com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$3$emit$1) continuation;
                if ((subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                    subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats -= 2147483648;
                    java.lang.Object obj = subscribeToSseUseCase$invoke$1$3$emit$1.getOutputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        long j = this.getHighSpeedVideoSizes;
                        sb = this.getHighSpeedVideoFpsRangesFor;
                        flowCollector = this.getHighSpeedVideoFpsRanges;
                        com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> subscribeToSseUseCase2 = this.getHighResolutionOutputSizeshNQ4ISI;
                        i2 = 0;
                        if (either instanceof arrow.core.Either.Right) {
                            sseEvent = (com.paypal.oslo.core.network.sse.model.SseEvent) ((arrow.core.Either.Right) either).getValue();
                            com.paypal.android.logger.Logger logger = com.paypal.oslo.core.network.sse.LoggerKt.log;
                            kotlin.Pair[] pairArr = new kotlin.Pair[4];
                            pairArr[0] = kotlin.TuplesKt.to("id", sseEvent.getId());
                            pairArr[1] = kotlin.TuplesKt.to("type", sseEvent.getEvent());
                            pairArr[2] = kotlin.TuplesKt.to("hasData", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(sseEvent.getData().length() > 0));
                            pairArr[3] = kotlin.TuplesKt.to("elapsed", kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis() - j));
                            com.paypal.android.logger.Logger.d$default(logger, "SSE event received", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                            if (sseEvent.getData().length() > 0) {
                                if (kotlin.text.StringsKt.startsWith$default(sseEvent.getData(), com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA, false, 2, (java.lang.Object) null)) {
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                    subscribeToSseUseCase$invoke$1$3$emit$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI = subscribeToSseUseCase2;
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getInputSizeshNQ4ISI = flowCollector;
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getOutputMinFrameDuration = sb;
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizesFor = sseEvent;
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes = 0;
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor = 0;
                                    subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats = 1;
                                    if (com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.access$emit(subscribeToSseUseCase2, flowCollector, sb, subscribeToSseUseCase$invoke$1$3$emit$1) != coroutine_suspended) {
                                        either2 = either;
                                        sb2 = sb;
                                        flowCollector2 = flowCollector;
                                        i4 = 0;
                                        subscribeToSseUseCase = subscribeToSseUseCase2;
                                        either3 = either2;
                                        i3 = 0;
                                        sseEvent2 = sseEvent;
                                        data = kotlin.text.StringsKt.removePrefix(sseEvent2.getData(), (java.lang.CharSequence) com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA);
                                        sseEvent = sseEvent2;
                                        sb = sb2;
                                        i2 = i4;
                                        flowCollector = flowCollector2;
                                    }
                                } else {
                                    data = sseEvent.getData();
                                    either2 = either;
                                    subscribeToSseUseCase = subscribeToSseUseCase2;
                                    either3 = either2;
                                    i3 = 0;
                                }
                            } else {
                                subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                subscribeToSseUseCase$invoke$1$3$emit$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                                subscribeToSseUseCase$invoke$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sseEvent);
                                subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes = 0;
                                subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor = 0;
                                subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats = 3;
                            }
                            return coroutine_suspended;
                        }
                        if (either instanceof arrow.core.Either.Left) {
                            com.paypal.oslo.core.network.http.error.NetworkError networkError = (com.paypal.oslo.core.network.http.error.NetworkError) ((arrow.core.Either.Left) either).getValue();
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "SSE connection error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", networkError.toString()), kotlin.TuplesKt.to("elapsed", kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis() - j))), null, 4, null);
                            kotlin.text.StringsKt.clear(sb);
                            arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T> left = arrow.core.EitherKt.left(new com.paypal.oslo.core.network.sse.domain.error.SseError.ConnectionError(networkError));
                            subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            subscribeToSseUseCase$invoke$1$3$emit$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            subscribeToSseUseCase$invoke$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(networkError);
                            subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes = 0;
                            subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor = 0;
                            subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats = 4;
                        } else {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else if (i == 1) {
                        i3 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor;
                        i4 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes;
                        sseEvent2 = (com.paypal.oslo.core.network.sse.model.SseEvent) subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizesFor;
                        sb2 = (java.lang.StringBuilder) subscribeToSseUseCase$invoke$1$3$emit$1.getOutputMinFrameDuration;
                        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) subscribeToSseUseCase$invoke$1$3$emit$1.getInputSizeshNQ4ISI;
                        subscribeToSseUseCase = (com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase) subscribeToSseUseCase$invoke$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                        either2 = (arrow.core.Either) subscribeToSseUseCase$invoke$1$3$emit$1.Camera2StreamConfigurationMap;
                        either3 = (arrow.core.Either) subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        data = kotlin.text.StringsKt.removePrefix(sseEvent2.getData(), (java.lang.CharSequence) com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.PREFIX_DATA);
                        sseEvent = sseEvent2;
                        sb = sb2;
                        i2 = i4;
                        flowCollector = flowCollector2;
                    } else {
                        if (i == 2) {
                            int i5 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor;
                            int i6 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes;
                        } else {
                            if (i != 3) {
                                if (i != 4) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                int i7 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor;
                                int i8 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes;
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            int i9 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor;
                            int i10 = subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    sb.append(data);
                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
                    subscribeToSseUseCase$invoke$1$3$emit$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sseEvent);
                    subscribeToSseUseCase$invoke$1$3$emit$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
                    subscribeToSseUseCase$invoke$1$3$emit$1.getOutputMinFrameDuration = null;
                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizesFor = null;
                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes = i2;
                    subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor = i3;
                    subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats = 2;
                }
            }
            subscribeToSseUseCase$invoke$1$3$emit$1 = new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1$3$emit$1(this, continuation);
            java.lang.Object obj2 = subscribeToSseUseCase$invoke$1$3$emit$1.getOutputFormats;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats;
            if (i != 0) {
            }
            sb.append(data);
            subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either3);
            subscribeToSseUseCase$invoke$1$3$emit$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
            subscribeToSseUseCase$invoke$1$3$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sseEvent);
            subscribeToSseUseCase$invoke$1$3$emit$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(data);
            subscribeToSseUseCase$invoke$1$3$emit$1.getOutputMinFrameDuration = null;
            subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizesFor = null;
            subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoSizes = i2;
            subscribeToSseUseCase$invoke$1$3$emit$1.getHighSpeedVideoFpsRangesFor = i3;
            subscribeToSseUseCase$invoke$1$3$emit$1.getInputFormats = 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(long j, java.lang.StringBuilder sb, kotlinx.coroutines.flow.FlowCollector<? super arrow.core.Either<? extends com.paypal.oslo.core.network.sse.domain.error.SseError, ? extends T>> flowCollector, com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> subscribeToSseUseCase) {
            this.getHighSpeedVideoSizes = j;
            this.getHighSpeedVideoFpsRangesFor = sb;
            this.getHighSpeedVideoFpsRanges = flowCollector;
            this.getHighResolutionOutputSizeshNQ4ISI = subscribeToSseUseCase;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1) create((kotlinx.coroutines.flow.FlowCollector) obj, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1 subscribeToSseUseCase$invoke$1 = new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1(this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        subscribeToSseUseCase$invoke$1.getOutputMinFrameDuration = obj;
        return subscribeToSseUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscribeToSseUseCase$invoke$1(java.lang.String str, com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase<T> subscribeToSseUseCase, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getInputSizeshNQ4ISI = subscribeToSseUseCase;
        this.getHighSpeedVideoFpsRanges = map;
        this.getHighSpeedVideoSizes = str2;
    }
}
