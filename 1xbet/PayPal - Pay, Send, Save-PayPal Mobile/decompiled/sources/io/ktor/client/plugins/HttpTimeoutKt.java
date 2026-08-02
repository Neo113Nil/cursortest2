package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a*\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u0012\u001a%\u0010\u0015\u001a\u00060\u0013j\u0002`\u00142\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\"\u001a\u00060 j\u0002`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/request/HttpRequestData;", "request", "", "cause", "Lio/ktor/client/network/sockets/ConnectTimeoutException;", "ConnectTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "", "url", "", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Ljava/net/SocketTimeoutException;", "Lio/ktor/client/network/sockets/Camera2StreamConfigurationMap;", "SocketTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;", "", "convertLongTimeoutToIntWithInfiniteAsZero", "(J)I", "convertLongTimeoutToLongWithInfiniteAsZero", "(J)J", "T", "Lkotlin/Function0;", "unwrapRequestTimeoutException", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighSpeedVideoFpsRanges", "Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpTimeout", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpTimeout", "()Lio/ktor/client/plugins/api/ClientPlugin;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpTimeoutKt {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRanges = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpTimeout");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpTimeoutConfig> HttpTimeout = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("HttpTimeout", io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpTimeoutKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.plugins.HttpTimeoutKt.$r8$lambda$5Q0WU_gxhQ8J8aMM3aEJrZ0yokg((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
        }
    });

    public static final /* synthetic */ boolean access$HttpTimeout$lambda$1$hasNotNullTimeouts(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, boolean z) {
        return ((!z || l == null) && l2 == null && l3 == null) ? false : true;
    }

    public static final int convertLongTimeoutToIntWithInfiniteAsZero(long j) {
        if (j == Long.MAX_VALUE) {
            return 0;
        }
        if (j < androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        if (j > androidx.collection.SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static final long convertLongTimeoutToLongWithInfiniteAsZero(long j) {
        if (j == Long.MAX_VALUE) {
            return 0L;
        }
        return j;
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpTimeoutConfig> getHttpTimeout() {
        return HttpTimeout;
    }

    public static final void timeout(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.HttpTimeoutConfig, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        io.ktor.client.plugins.HttpTimeoutCapability httpTimeoutCapability = io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE;
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = new io.ktor.client.plugins.HttpTimeoutConfig(null, null, null, 7, null);
        function1.invoke(httpTimeoutConfig);
        httpRequestBuilder.setCapability(httpTimeoutCapability, httpTimeoutConfig);
    }

    public static /* synthetic */ io.ktor.client.network.sockets.ConnectTimeoutException ConnectTimeoutException$default(io.ktor.client.request.HttpRequestData httpRequestData, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return ConnectTimeoutException(httpRequestData, th);
    }

    public static final io.ktor.client.network.sockets.ConnectTimeoutException ConnectTimeoutException(io.ktor.client.request.HttpRequestData httpRequestData, java.lang.Throwable th) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connect timeout has expired [url=");
        sb.append(httpRequestData.getUrl());
        sb.append(", connect_timeout=");
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) httpRequestData.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null || (obj = httpTimeoutConfig.getGetHighSpeedVideoFpsRangesFor()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append(" ms]");
        return new io.ktor.client.network.sockets.ConnectTimeoutException(sb.toString(), th);
    }

    public static /* synthetic */ io.ktor.client.network.sockets.ConnectTimeoutException ConnectTimeoutException$default(java.lang.String str, java.lang.Long l, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        return ConnectTimeoutException(str, l, th);
    }

    public static final io.ktor.client.network.sockets.ConnectTimeoutException ConnectTimeoutException(java.lang.String str, java.lang.Long l, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connect timeout has expired [url=");
        sb.append(str);
        sb.append(", connect_timeout=");
        java.lang.Object obj = l;
        if (l == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append(" ms]");
        return new io.ktor.client.network.sockets.ConnectTimeoutException(sb.toString(), th);
    }

    public static /* synthetic */ java.net.SocketTimeoutException SocketTimeoutException$default(io.ktor.client.request.HttpRequestData httpRequestData, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return SocketTimeoutException(httpRequestData, th);
    }

    public static final java.net.SocketTimeoutException SocketTimeoutException(io.ktor.client.request.HttpRequestData httpRequestData, java.lang.Throwable th) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestData, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Socket timeout has expired [url=");
        sb.append(httpRequestData.getUrl());
        sb.append(", socket_timeout=");
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) httpRequestData.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null || (obj = httpTimeoutConfig.getGetHighSpeedVideoSizes()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        return io.ktor.client.network.sockets.TimeoutExceptionsKt.SocketTimeoutException(sb.toString(), th);
    }

    public static final <T> T unwrapRequestTimeoutException(kotlin.jvm.functions.Function0<? extends T> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        try {
            return function0.invoke();
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5Q0WU_gxhQ8J8aMM3aEJrZ0yokg(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        clientPluginBuilder.on(io.ktor.client.plugins.api.Send.INSTANCE, new io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1(((io.ktor.client.plugins.HttpTimeoutConfig) clientPluginBuilder.getPluginConfig()).getGetHighSpeedVideoFpsRanges(), ((io.ktor.client.plugins.HttpTimeoutConfig) clientPluginBuilder.getPluginConfig()).getGetHighSpeedVideoFpsRangesFor(), ((io.ktor.client.plugins.HttpTimeoutConfig) clientPluginBuilder.getPluginConfig()).getGetHighSpeedVideoSizes(), null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$kablOVt2_vVgLbpUEP-TwB5Sx-w, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23257$r8$lambda$kablOVt2_vVgLbpUEPTwB5Sxw(kotlinx.coroutines.Job job, java.lang.Throwable th) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$applyRequestTimeout(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Long l) {
        final kotlinx.coroutines.Job launch$default;
        if (l == null || l.longValue() == Long.MAX_VALUE) {
            return;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, new kotlinx.coroutines.CoroutineName("request-timeout"), null, new io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1(l, httpRequestBuilder, httpRequestBuilder.getExecutionContext(), null), 2, null);
        httpRequestBuilder.getExecutionContext().invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpTimeoutKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.HttpTimeoutKt.m23257$r8$lambda$kablOVt2_vVgLbpUEPTwB5Sxw(kotlinx.coroutines.Job.this, (java.lang.Throwable) obj);
            }
        });
    }

    public static final /* synthetic */ boolean access$getSupportsRequestTimeout(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        return (io.ktor.http.URLProtocolKt.isWebsocket(httpRequestBuilder.getUrl().getProtocol()) || (httpRequestBuilder.getBody() instanceof io.ktor.client.request.ClientUpgradeContent) || (httpRequestBuilder.getBody() instanceof io.ktor.client.plugins.sse.SSEClientContent)) ? false : true;
    }
}
