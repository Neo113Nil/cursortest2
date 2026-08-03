package io.ktor.client.plugins;

/* compiled from: HttpTimeout.kt */
@kotlin.Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\f\u001a\u00020\u0005*\u00020\u00012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0016\u001a%\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u0002\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0081\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#\"\u0018\u0010&\u001a\u00060$j\u0002`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u001e\u00102\u001a\u00020-*\u00020\u00018BX\u0082\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "", "requestTimeout", "", "applyRequestTimeout", "(Lkotlinx/coroutines/CoroutineScope;Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Long;)V", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "Lkotlin/ExtensionFunctionType;", "block", "timeout", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/request/HttpRequestData;", "", "cause", "Lio/ktor/client/network/sockets/ConnectTimeoutException;", "ConnectTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "", "url", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Ljava/net/SocketTimeoutException;", "Lio/ktor/client/network/sockets/SocketTimeoutException;", "SocketTimeoutException", "(Lio/ktor/client/request/HttpRequestData;Ljava/lang/Throwable;)Ljava/net/SocketTimeoutException;", "", "convertLongTimeoutToIntWithInfiniteAsZero", "(J)I", "convertLongTimeoutToLongWithInfiniteAsZero", "(J)J", "T", "Lkotlin/Function0;", "unwrapRequestTimeoutException", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpTimeout", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpTimeout", "()Lio/ktor/client/plugins/api/ClientPlugin;", "", "getSupportsRequestTimeout", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "getSupportsRequestTimeout$annotations", "(Lio/ktor/client/request/HttpRequestBuilder;)V", "supportsRequestTimeout", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpTimeoutKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpTimeout");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpTimeoutConfig> HttpTimeout = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("HttpTimeout", io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpTimeoutKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit HttpTimeout$lambda$1;
            HttpTimeout$lambda$1 = io.ktor.client.plugins.HttpTimeoutKt.HttpTimeout$lambda$1((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return HttpTimeout$lambda$1;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpTimeout$lambda$1$hasNotNullTimeouts(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, boolean z) {
        return ((!z || l == null) && l2 == null && l3 == null) ? false : true;
    }

    public static final int convertLongTimeoutToIntWithInfiniteAsZero(long j) {
        if (j == Long.MAX_VALUE) {
            return 0;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j > 2147483647L) {
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

    private static /* synthetic */ void getSupportsRequestTimeout$annotations(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpTimeoutConfig> getHttpTimeout() {
        return HttpTimeout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpTimeout$lambda$1(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(io.ktor.client.plugins.api.Send.INSTANCE, new io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$3$1(((io.ktor.client.plugins.HttpTimeoutConfig) createClientPlugin.getPluginConfig()).get_requestTimeoutMillis(), ((io.ktor.client.plugins.HttpTimeoutConfig) createClientPlugin.getPluginConfig()).get_connectTimeoutMillis(), ((io.ktor.client.plugins.HttpTimeoutConfig) createClientPlugin.getPluginConfig()).get_socketTimeoutMillis(), null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSupportsRequestTimeout(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        return (io.ktor.http.URLProtocolKt.isWebsocket(httpRequestBuilder.getUrl().getProtocol()) || (httpRequestBuilder.getBody() instanceof io.ktor.client.request.ClientUpgradeContent) || (httpRequestBuilder.getBody() instanceof io.ktor.client.plugins.sse.SSEClientContent)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyRequestTimeout(kotlinx.coroutines.CoroutineScope coroutineScope, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Long l) {
        final kotlinx.coroutines.Job launch$default;
        if (l == null || l.longValue() == Long.MAX_VALUE) {
            return;
        }
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, new kotlinx.coroutines.CoroutineName("request-timeout"), null, new io.ktor.client.plugins.HttpTimeoutKt$applyRequestTimeout$killer$1(l, httpRequestBuilder, httpRequestBuilder.getExecutionContext(), null), 2, null);
        httpRequestBuilder.getExecutionContext().invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpTimeoutKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit applyRequestTimeout$lambda$2;
                applyRequestTimeout$lambda$2 = io.ktor.client.plugins.HttpTimeoutKt.applyRequestTimeout$lambda$2(kotlinx.coroutines.Job.this, (java.lang.Throwable) obj);
                return applyRequestTimeout$lambda$2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit applyRequestTimeout$lambda$2(kotlinx.coroutines.Job job, java.lang.Throwable th) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static final void timeout(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.HttpTimeoutConfig, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.plugins.HttpTimeoutCapability httpTimeoutCapability = io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE;
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = new io.ktor.client.plugins.HttpTimeoutConfig(null, null, null, 7, null);
        block.invoke(httpTimeoutConfig);
        httpRequestBuilder.setCapability(httpTimeoutCapability, httpTimeoutConfig);
    }

    public static /* synthetic */ io.ktor.client.network.sockets.ConnectTimeoutException ConnectTimeoutException$default(io.ktor.client.request.HttpRequestData httpRequestData, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        return ConnectTimeoutException(httpRequestData, th);
    }

    public static final io.ktor.client.network.sockets.ConnectTimeoutException ConnectTimeoutException(io.ktor.client.request.HttpRequestData request, java.lang.Throwable th) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connect timeout has expired [url=");
        sb.append(request.getUrl());
        sb.append(", connect_timeout=");
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) request.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null || (obj = httpTimeoutConfig.get_connectTimeoutMillis()) == null) {
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

    public static final io.ktor.client.network.sockets.ConnectTimeoutException ConnectTimeoutException(java.lang.String url, java.lang.Long l, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Connect timeout has expired [url=");
        sb.append(url);
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

    public static final java.net.SocketTimeoutException SocketTimeoutException(io.ktor.client.request.HttpRequestData request, java.lang.Throwable th) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Socket timeout has expired [url=");
        sb.append(request.getUrl());
        sb.append(", socket_timeout=");
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) request.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig == null || (obj = httpTimeoutConfig.get_socketTimeoutMillis()) == null) {
            obj = "unknown";
        }
        sb.append(obj);
        sb.append("] ms");
        return io.ktor.client.network.sockets.TimeoutExceptionsKt.SocketTimeoutException(sb.toString(), th);
    }

    public static final <T> T unwrapRequestTimeoutException(kotlin.jvm.functions.Function0<? extends T> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke();
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
    }
}
