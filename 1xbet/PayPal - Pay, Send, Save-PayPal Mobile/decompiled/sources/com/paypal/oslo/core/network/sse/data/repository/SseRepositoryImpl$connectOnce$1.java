package com.paypal.oslo.core.network.sse.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/core/network/sse/model/SseEvent;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1", f = "SseRepositoryImpl.kt", i = {0, 0, 0}, l = {147}, m = "invokeSuspend", n = {"$this$callbackFlow", "eventSource", "$i$a$-onSuccess-SseRepositoryImpl$connectOnce$1$3"}, nl = {151}, s = {"L$0", "L$2", "I$0"}, v = 2)
/* loaded from: classes4.dex */
final class SseRepositoryImpl$connectOnce$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends com.paypal.oslo.core.network.sse.model.SseEvent>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.core.network.http.error.NetworkError, kotlin.Unit> getOutputFormats;
    int getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl getOutputSizeshNQ4ISI;
    int getOutputStallDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.core.network.sse.config.SseConfig sseConfig;
        com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider sseOkHttpClientProvider;
        final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputStallDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl = this.getOutputSizeshNQ4ISI;
            java.lang.String str = this.getHighSpeedVideoSizes;
            java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body = this.Camera2StreamConfigurationMap;
            java.util.Map<java.lang.String, java.lang.String> map = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getInputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1<com.paypal.oslo.core.network.http.error.NetworkError, kotlin.Unit> function12 = this.getOutputFormats;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                sseConfig = sseRepositoryImpl.getHighSpeedVideoFpsRanges;
                java.lang.String baseUrl = sseConfig.getBaseUrl();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(baseUrl);
                sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
                sb.append(str);
                java.lang.String obj2 = sb.toString();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.core.network.sse.LoggerKt.log;
                kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("endpoint", str), kotlin.TuplesKt.to("last_event_id", str2));
                kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, body));
                okhttp3.Request access$buildRequest = com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl.access$buildRequest(sseRepositoryImpl, obj2, map, body, str2);
                com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$createEventSourceListener$1 access$createEventSourceListener = com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl.access$createEventSourceListener(sseRepositoryImpl, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.ProducerScope.this, (arrow.core.Either) obj3);
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.ProducerScope.this);
                    }
                }, function1, function0, function12);
                sseOkHttpClientProvider = sseRepositoryImpl.getHighSpeedVideoSizes;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(sseOkHttpClientProvider.getEventSourceFactory().newEventSource(access$buildRequest, access$createEventSourceListener));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            kotlin.jvm.functions.Function1<com.paypal.oslo.core.network.http.error.NetworkError, kotlin.Unit> function13 = this.getOutputFormats;
            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
                function13.invoke(new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(m23439exceptionOrNullimpl));
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
            }
            if (kotlin.Result.m23442isSuccessimpl(m23436constructorimpl)) {
                final okhttp3.sse.EventSource eventSource = (okhttp3.sse.EventSource) m23436constructorimpl;
                kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1.Camera2StreamConfigurationMap(okhttp3.sse.EventSource.this);
                    }
                };
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(producerScope);
                this.getHighSpeedVideoSizesFor = m23436constructorimpl;
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(eventSource);
                this.getOutputMinFrameDuration = 0;
                this.getOutputStallDuration = 1;
                if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, function02, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.ProducerScope producerScope, arrow.core.Either either) {
        producerScope.mo9266trySendJP2dKIU(either);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.channels.ProducerScope producerScope) {
        kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(okhttp3.sse.EventSource eventSource) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "Closing SSE connection", null, null, 6, null);
        eventSource.cancel();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends com.paypal.oslo.core.network.sse.model.SseEvent>> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1 sseRepositoryImpl$connectOnce$1 = new com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1(this.getOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputFormats, continuation);
        sseRepositoryImpl$connectOnce$1.getOutputSizes = obj;
        return sseRepositoryImpl$connectOnce$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SseRepositoryImpl$connectOnce$1(com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body, java.util.Map<java.lang.String, java.lang.String> map, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.network.http.error.NetworkError, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connectOnce$1> continuation) {
        super(2, continuation);
        this.getOutputSizeshNQ4ISI = sseRepositoryImpl;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.Camera2StreamConfigurationMap = body;
        this.getHighSpeedVideoFpsRangesFor = map;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getInputSizeshNQ4ISI = function0;
        this.getOutputFormats = function12;
    }
}
