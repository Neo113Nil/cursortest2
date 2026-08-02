package com.paypal.oslo.core.network.sse.data.repository;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/core/network/sse/data/repository/SseRepositoryImpl;", "Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository;", "Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "sseConfig", "Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;", "sseOkHttpClientProvider", "Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy;", "retryStrategy", "<init>", "(Lcom/paypal/oslo/core/network/sse/config/SseConfig;Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy;)V", "", "endpoint", "", "headers", "Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository$Body;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/core/network/sse/model/SseEvent;", "connect", "(Ljava/lang/String;Ljava/util/Map;Lcom/paypal/oslo/core/network/sse/domain/repository/SseRepository$Body;)Lkotlinx/coroutines/flow/Flow;", "", "p0", "Lokhttp3/Response;", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/Throwable;Lokhttp3/Response;)Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/core/network/sse/config/SseConfig;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/network/sse/di/SseOkHttpClientProvider;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/network/sse/data/repository/SseRetryStrategy;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SseRepositoryImpl implements com.paypal.oslo.core.network.sse.domain.repository.SseRepository {
    private static final com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl.Companion Companion = new com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String LAST_EVENT_ID_HEADER = "Last-Event-ID";
    private final com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.network.sse.config.SseConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider getHighSpeedVideoSizes;

    public SseRepositoryImpl(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig, com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider sseOkHttpClientProvider, com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy sseRetryStrategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseOkHttpClientProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sseRetryStrategy, "");
        this.getHighSpeedVideoFpsRanges = sseConfig;
        this.getHighSpeedVideoSizes = sseOkHttpClientProvider;
        this.Camera2StreamConfigurationMap = sseRetryStrategy;
    }

    public /* synthetic */ SseRepositoryImpl(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig, com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider sseOkHttpClientProvider, com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy sseRetryStrategy, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(sseConfig, sseOkHttpClientProvider, (i & 4) != 0 ? new com.paypal.oslo.core.network.sse.data.repository.SseRetryStrategy(sseConfig) : sseRetryStrategy);
    }

    @Override // com.paypal.oslo.core.network.sse.domain.repository.SseRepository
    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.core.network.sse.model.SseEvent>> connect(java.lang.String endpoint, java.util.Map<java.lang.String, java.lang.String> headers, com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endpoint, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$connect$1(this, endpoint, headers, body, null));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/network/sse/data/repository/SseRepositoryImpl$Companion;", "", "<init>", "()V", "", "LAST_EVENT_ID_HEADER", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.core.network.http.error.NetworkError getHighSpeedVideoFpsRanges(java.lang.Throwable p0, okhttp3.Response p1) {
        java.lang.Object m23436constructorimpl;
        if (p0 instanceof java.io.IOException) {
            return new com.paypal.oslo.core.network.http.error.NetworkError.NoInternet(p0);
        }
        if (p1 == null || p1.getIsSuccessful()) {
            if (p0 != null) {
                return new com.paypal.oslo.core.network.http.error.NetworkError.UnknownError(p0);
            }
            return new com.paypal.oslo.core.network.http.error.NetworkError.NoInternet(new java.io.IOException("SSE stream closed unexpectedly"));
        }
        int code = p1.code();
        java.lang.String message = p1.message();
        okhttp3.ResponseBody body = p1.body();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(body.string());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return new com.paypal.oslo.core.network.http.error.NetworkError.HttpError(code, message, (java.lang.String) m23436constructorimpl, null, 8, null);
    }

    public static final /* synthetic */ okhttp3.Request access$buildRequest(com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl, java.lang.String str, java.util.Map map, com.paypal.oslo.core.network.sse.domain.repository.SseRepository.Body body, java.lang.String str2) {
        okhttp3.Request.Builder header = new okhttp3.Request.Builder().url(str).header("Cache-Control", "no-cache");
        for (java.util.Map.Entry entry : map.entrySet()) {
            header.header((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (str2 != null) {
            header.header("Last-Event-ID", str2);
        }
        if (body != null) {
            header.post(okhttp3.RequestBody.INSTANCE.create(body.getContent(), okhttp3.MediaType.INSTANCE.get(body.getMimeType())));
        }
        return header.build();
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$createEventSourceListener$1] */
    public static final /* synthetic */ com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$createEventSourceListener$1 access$createEventSourceListener(final com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl sseRepositoryImpl, final kotlin.jvm.functions.Function1 function1, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function12, final kotlin.jvm.functions.Function0 function02, final kotlin.jvm.functions.Function1 function13) {
        return new okhttp3.sse.EventSourceListener() { // from class: com.paypal.oslo.core.network.sse.data.repository.SseRepositoryImpl$createEventSourceListener$1
            @Override // okhttp3.sse.EventSourceListener
            public final void onOpen(okhttp3.sse.EventSource eventSource, okhttp3.Response response) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "SSE connection opened", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("code", java.lang.Integer.valueOf(response.code()))), null, 4, null);
            }

            @Override // okhttp3.sse.EventSourceListener
            public final void onEvent(okhttp3.sse.EventSource eventSource, java.lang.String id, java.lang.String type, java.lang.String data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                function02.invoke();
                java.lang.String str = id;
                if (str != null && str.length() != 0) {
                    function12.invoke(id);
                }
                function1.invoke(arrow.core.EitherKt.right(new com.paypal.oslo.core.network.sse.model.SseEvent(id, type, data)));
            }

            @Override // okhttp3.sse.EventSourceListener
            public final void onClosed(okhttp3.sse.EventSource eventSource) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "SSE connection closed normally", null, null, 6, null);
                function0.invoke();
            }

            @Override // okhttp3.sse.EventSourceListener
            public final void onFailure(okhttp3.sse.EventSource eventSource, java.lang.Throwable t, okhttp3.Response response) {
                com.paypal.oslo.core.network.http.error.NetworkError highSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSource, "");
                highSpeedVideoFpsRanges = sseRepositoryImpl.getHighSpeedVideoFpsRanges(t, response);
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.network.sse.LoggerKt.log, "SSE connection failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", highSpeedVideoFpsRanges)), null, 4, null);
                function13.invoke(highSpeedVideoFpsRanges);
                function0.invoke();
            }
        };
    }
}
