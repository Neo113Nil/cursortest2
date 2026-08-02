package com.paypal.oslo.core.network.sse.domain.usecase;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0019*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0019B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJL\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tH\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/usecase/SubscribeToSseUseCase;", "T", "", "Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;", "sseRepository", "Lcom/paypal/oslo/core/network/sse/SseParser;", "sseParser", "<init>", "(Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;Lcom/paypal/oslo/core/network/sse/SseParser;)V", "", "endpoint", "", "headers", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/sse/domain/error/SseError;", "invoke", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/sse/SseParser;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SubscribeToSseUseCase<T> {
    private static final com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.Companion Companion = new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String MIME_TYPE_JSON = "application/json";

    @java.lang.Deprecated
    public static final java.lang.String PREFIX_DATA = "data: ";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.sse.SseParser<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.sse.domain.repository.SseRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SubscribeToSseUseCase(com.paypal.oslo.core.network.sse.domain.repository.SseRepository sseRepository, com.paypal.oslo.core.network.sse.SseParser<T> sseParser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseParser, "");
        this.getHighSpeedVideoFpsRangesFor = sseRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = sseParser;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$emit(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase subscribeToSseUseCase, kotlinx.coroutines.flow.FlowCollector flowCollector, java.lang.StringBuilder sb, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$emit$1 subscribeToSseUseCase$emit$1;
        int i;
        java.lang.String obj;
        if (continuation instanceof com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$emit$1) {
            subscribeToSseUseCase$emit$1 = (com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$emit$1) continuation;
            if ((subscribeToSseUseCase$emit$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                subscribeToSseUseCase$emit$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj2 = subscribeToSseUseCase$emit$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = subscribeToSseUseCase$emit$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj2);
                    java.lang.StringBuilder sb2 = sb.length() > 0 ? sb : null;
                    if (sb2 != null && (obj = sb2.toString()) != null) {
                        com.paypal.android.logger.Logger.v$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "Emit complete SSE data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, obj)), null, 4, null);
                        arrow.core.Either<com.paypal.oslo.core.network.sse.domain.error.SseError, T> parse = subscribeToSseUseCase.getHighResolutionOutputSizeshNQ4ISI.parse(obj);
                        subscribeToSseUseCase$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                        subscribeToSseUseCase$emit$1.getHighSpeedVideoSizes = sb;
                        subscribeToSseUseCase$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj);
                        subscribeToSseUseCase$emit$1.Camera2StreamConfigurationMap = 0;
                        subscribeToSseUseCase$emit$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (flowCollector.emit(parse, subscribeToSseUseCase$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = subscribeToSseUseCase$emit$1.Camera2StreamConfigurationMap;
                    sb = (java.lang.StringBuilder) subscribeToSseUseCase$emit$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj2);
                }
                kotlin.text.StringsKt.clear(sb);
                return kotlin.Unit.INSTANCE;
            }
        }
        subscribeToSseUseCase$emit$1 = new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$emit$1(subscribeToSseUseCase, continuation);
        java.lang.Object obj22 = subscribeToSseUseCase$emit$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = subscribeToSseUseCase$emit$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        kotlin.text.StringsKt.clear(sb);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase subscribeToSseUseCase, java.lang.String str, java.util.Map map, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return subscribeToSseUseCase.invoke(str, map, str2);
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.sse.domain.error.SseError, T>> invoke(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, java.lang.String body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.network.sse.domain.usecase.SubscribeToSseUseCase$invoke$1(endpoint, this, headers, body, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/sse/domain/usecase/SubscribeToSseUseCase$Companion;", "", "<init>", "()V", "", "PREFIX_DATA", "Ljava/lang/String;", "MIME_TYPE_JSON"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
