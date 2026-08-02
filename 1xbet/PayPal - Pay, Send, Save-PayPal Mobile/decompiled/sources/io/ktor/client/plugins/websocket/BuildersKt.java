package io.ktor.client.plugins.websocket;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u000b*\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0015\u001a7\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0017\u001aV\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0086\u0001\u0010\u001c\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001e\u001a`\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001f\u001a\u0086\u0001\u0010 \u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001e\u001aV\u0010 \u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001d\u001a`\u0010 \u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001f\u001aV\u0010!\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001d\u001a`\u0010!\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001f\u001a\u0086\u0001\u0010!\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001e"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "", "Lkotlin/ExtensionFunctionType;", "config", "WebSockets", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "webSocketSession", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/HttpMethod;", "method", "", com.datadog.android.log.LogAttributes.HOST, "", "port", "path", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "webSocket", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ws", "wss"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BuildersKt {
    public static final void WebSockets(io.ktor.client.HttpClientConfig<?> httpClientConfig, final kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.websocket.WebSockets.Config, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        httpClientConfig.install(io.ktor.client.plugins.websocket.WebSockets.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$iGw_6qgE1ReLCkGRSSEzwmyPi1I(kotlin.jvm.functions.Function1.this, (io.ktor.client.plugins.websocket.WebSockets.Config) obj);
            }
        });
    }

    public static final java.lang.Object webSocketSession(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> continuation) {
        io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.websocket.WebSockets.INSTANCE);
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.url(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$tTrmGUvXtRZH4NWZ58dHlm7PT2c((io.ktor.http.URLBuilder) obj, (io.ktor.http.URLBuilder) obj2);
            }
        });
        function1.invoke(httpRequestBuilder);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2(new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    public static /* synthetic */ java.lang.Object webSocketSession$default(io.ktor.client.HttpClient httpClient, io.ktor.http.HttpMethod httpMethod, java.lang.String str, java.lang.Integer num, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            httpMethod = io.ktor.http.HttpMethod.INSTANCE.getGet();
        }
        io.ktor.http.HttpMethod httpMethod2 = httpMethod;
        java.lang.String str3 = (i & 2) != 0 ? null : str;
        java.lang.Integer num2 = (i & 4) != 0 ? null : num;
        java.lang.String str4 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.plugins.websocket.BuildersKt.m23332$r8$lambda$OQm5itdvItPmMz28_Tltm7UDDw((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return webSocketSession(httpClient, httpMethod2, str3, num2, str4, function1, continuation);
    }

    public static final java.lang.Object webSocketSession(io.ktor.client.HttpClient httpClient, final io.ktor.http.HttpMethod httpMethod, final java.lang.String str, final java.lang.Integer num, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$YV6DYgTaCpiPcHYNNICxtjKfRa8(io.ktor.http.HttpMethod.this, str, num, str2, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.lang.Object webSocketSession$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.plugins.websocket.BuildersKt.m23330$r8$lambda$80O2VoZv6_3M7C88PcoTwmJDIQ((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return webSocketSession(httpClient, str, function1, continuation);
    }

    public static final java.lang.Object webSocketSession(io.ktor.client.HttpClient httpClient, final java.lang.String str, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$p9XEvdV1feKOrS5FtWczcuiKSVM(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|83|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013c, code lost:
    
        if (r2.cleanup(r9, r0) != r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0094, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0168, code lost:
    
        r10 = r9;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe A[Catch: all -> 0x0094, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0094, blocks: (B:20:0x0050, B:21:0x0158, B:22:0x015f, B:24:0x0063, B:25:0x0126, B:33:0x0113, B:39:0x0143, B:43:0x0090, B:45:0x00fe, B:53:0x0160, B:54:0x0167), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160 A[Catch: all -> 0x0094, TryCatch #3 {all -> 0x0094, blocks: (B:20:0x0050, B:21:0x0158, B:22:0x015f, B:24:0x0063, B:25:0x0126, B:33:0x0113, B:39:0x0143, B:43:0x0090, B:45:0x00fe, B:53:0x0160, B:54:0x0167), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.client.statement.HttpStatement] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object webSocket(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.websocket.BuildersKt$webSocket$1 buildersKt$webSocket$1;
        int i;
        io.ktor.client.statement.HttpStatement httpStatement;
        io.ktor.client.statement.HttpResponse httpResponse;
        kotlin.reflect.KType kType;
        java.lang.Object bodyNullable;
        io.ktor.client.statement.HttpStatement httpStatement2;
        kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22;
        io.ktor.client.statement.HttpResponse httpResponse2;
        io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession;
        io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession2;
        try {
            if (continuation instanceof io.ktor.client.plugins.websocket.BuildersKt$webSocket$1) {
                buildersKt$webSocket$1 = (io.ktor.client.plugins.websocket.BuildersKt$webSocket$1) continuation;
                if ((buildersKt$webSocket$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    buildersKt$webSocket$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = buildersKt$webSocket$1.getInputFormats;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = buildersKt$webSocket$1.Camera2StreamConfigurationMap;
                    switch (i) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj);
                            io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.websocket.WebSockets.INSTANCE);
                            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                            httpRequestBuilder.url(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$rUqPDTRhizgK7dQVwwmkVlH6Js8((io.ktor.http.URLBuilder) obj2, (io.ktor.http.URLBuilder) obj3);
                                }
                            });
                            function1.invoke(httpRequestBuilder);
                            io.ktor.client.statement.HttpStatement httpStatement3 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                            buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = function2;
                            buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpStatement3;
                            buildersKt$webSocket$1.Camera2StreamConfigurationMap = 1;
                            obj = httpStatement3.fetchStreamingResponse(buildersKt$webSocket$1);
                            if (obj != coroutine_suspended) {
                                httpStatement = httpStatement3;
                                httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                                try {
                                    io.ktor.client.call.HttpClientCall call = httpResponse.getCall();
                                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
                                    try {
                                        kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
                                    } catch (java.lang.Throwable unused) {
                                        kType = null;
                                    }
                                    io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType);
                                    buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = function2;
                                    buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpStatement;
                                    buildersKt$webSocket$1.getHighSpeedVideoSizes = httpResponse;
                                    buildersKt$webSocket$1.Camera2StreamConfigurationMap = 2;
                                    bodyNullable = call.bodyNullable(typeInfo, buildersKt$webSocket$1);
                                    if (bodyNullable != coroutine_suspended) {
                                        httpStatement2 = httpStatement;
                                        function22 = function2;
                                        httpResponse2 = httpResponse;
                                        obj = bodyNullable;
                                        if (obj != null) {
                                            throw new java.lang.NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                                        }
                                        io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession3 = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) obj;
                                        io.ktor.client.plugins.websocket.BuildersKt$webSocket$1 buildersKt$webSocket$12 = buildersKt$webSocket$1;
                                        try {
                                            buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = httpStatement2;
                                            buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpResponse2;
                                            buildersKt$webSocket$1.getHighSpeedVideoSizes = defaultClientWebSocketSession3;
                                            buildersKt$webSocket$1.Camera2StreamConfigurationMap = 3;
                                            if (function22.invoke(defaultClientWebSocketSession3, buildersKt$webSocket$1) != coroutine_suspended) {
                                                defaultClientWebSocketSession2 = defaultClientWebSocketSession3;
                                                buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = httpStatement2;
                                                buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpResponse2;
                                                buildersKt$webSocket$1.getHighSpeedVideoSizes = defaultClientWebSocketSession2;
                                                buildersKt$webSocket$1.Camera2StreamConfigurationMap = 4;
                                                if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                                }
                                                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                                buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = kotlin.Unit.INSTANCE;
                                                buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                                buildersKt$webSocket$1.getHighSpeedVideoSizes = null;
                                                buildersKt$webSocket$1.Camera2StreamConfigurationMap = 6;
                                                break;
                                            }
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            defaultClientWebSocketSession = defaultClientWebSocketSession3;
                                            buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = httpStatement2;
                                            buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpResponse2;
                                            buildersKt$webSocket$1.getHighSpeedVideoSizes = defaultClientWebSocketSession;
                                            buildersKt$webSocket$1.getHighSpeedVideoFpsRanges = th;
                                            buildersKt$webSocket$1.Camera2StreamConfigurationMap = 5;
                                            if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                            throw th;
                                        }
                                    }
                                } catch (java.lang.Throwable th2) {
                                    ?? r2 = httpStatement;
                                    th = th2;
                                    ?? r10 = httpResponse;
                                    buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = th;
                                    buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                    buildersKt$webSocket$1.getHighSpeedVideoSizes = null;
                                    buildersKt$webSocket$1.getHighSpeedVideoFpsRanges = null;
                                    buildersKt$webSocket$1.Camera2StreamConfigurationMap = 7;
                                    if (r2.cleanup(r10, buildersKt$webSocket$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    throw th;
                                }
                            }
                            return coroutine_suspended;
                        case 1:
                            httpStatement = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI;
                            function2 = (kotlin.jvm.functions.Function2) buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                            io.ktor.client.call.HttpClientCall call2 = httpResponse.getCall();
                            kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
                            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
                            io.ktor.util.reflect.TypeInfo typeInfo2 = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType);
                            buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = function2;
                            buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpStatement;
                            buildersKt$webSocket$1.getHighSpeedVideoSizes = httpResponse;
                            buildersKt$webSocket$1.Camera2StreamConfigurationMap = 2;
                            bodyNullable = call2.bodyNullable(typeInfo2, buildersKt$webSocket$1);
                            if (bodyNullable != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        case 2:
                            httpResponse2 = (io.ktor.client.statement.HttpResponse) buildersKt$webSocket$1.getHighSpeedVideoSizes;
                            httpStatement2 = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI;
                            function22 = (kotlin.jvm.functions.Function2) buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (obj != null) {
                            }
                            break;
                        case 3:
                            defaultClientWebSocketSession2 = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) buildersKt$webSocket$1.getHighSpeedVideoSizes;
                            io.ktor.client.statement.HttpResponse httpResponse3 = (io.ktor.client.statement.HttpResponse) buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI;
                            io.ktor.client.statement.HttpStatement httpStatement4 = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                httpStatement2 = httpStatement4;
                                httpResponse2 = httpResponse3;
                                buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = httpStatement2;
                                buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpResponse2;
                                buildersKt$webSocket$1.getHighSpeedVideoSizes = defaultClientWebSocketSession2;
                                buildersKt$webSocket$1.Camera2StreamConfigurationMap = 4;
                                if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = kotlin.Unit.INSTANCE;
                                buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = null;
                                buildersKt$webSocket$1.getHighSpeedVideoSizes = null;
                                buildersKt$webSocket$1.Camera2StreamConfigurationMap = 6;
                                break;
                            } catch (java.lang.Throwable th3) {
                                httpStatement2 = httpStatement4;
                                httpResponse2 = httpResponse3;
                                defaultClientWebSocketSession = defaultClientWebSocketSession2;
                                th = th3;
                                buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = httpStatement2;
                                buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = httpResponse2;
                                buildersKt$webSocket$1.getHighSpeedVideoSizes = defaultClientWebSocketSession;
                                buildersKt$webSocket$1.getHighSpeedVideoFpsRanges = th;
                                buildersKt$webSocket$1.Camera2StreamConfigurationMap = 5;
                                if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                throw th;
                            }
                            break;
                        case 4:
                            defaultClientWebSocketSession2 = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) buildersKt$webSocket$1.getHighSpeedVideoSizes;
                            httpResponse2 = (io.ktor.client.statement.HttpResponse) buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI;
                            httpStatement2 = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                            buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor = kotlin.Unit.INSTANCE;
                            buildersKt$webSocket$1.getHighResolutionOutputSizeshNQ4ISI = null;
                            buildersKt$webSocket$1.getHighSpeedVideoSizes = null;
                            buildersKt$webSocket$1.Camera2StreamConfigurationMap = 6;
                            break;
                        case 5:
                            th = (java.lang.Throwable) buildersKt$webSocket$1.getHighSpeedVideoFpsRanges;
                            defaultClientWebSocketSession = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) buildersKt$webSocket$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                            throw th;
                        case 6:
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        case 7:
                            java.lang.Throwable th4 = (java.lang.Throwable) buildersKt$webSocket$1.getHighSpeedVideoFpsRangesFor;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th4;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (i) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        buildersKt$webSocket$1 = new io.ktor.client.plugins.websocket.BuildersKt$webSocket$1(continuation);
        java.lang.Object obj2 = buildersKt$webSocket$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = buildersKt$webSocket$1.Camera2StreamConfigurationMap;
    }

    public static final java.lang.Object webSocket(io.ktor.client.HttpClient httpClient, final io.ktor.http.HttpMethod httpMethod, final java.lang.String str, final java.lang.Integer num, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.m23329$r8$lambda$25VeMizO56wk2lJVj6tf8GXRi4(io.ktor.http.HttpMethod.this, str, num, str2, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object webSocket$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$2t0zMBZnwd8ht7eRFq7aV6xqmFw((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return webSocket(httpClient, str, function1, function2, continuation);
    }

    public static final java.lang.Object webSocket(io.ktor.client.HttpClient httpClient, final java.lang.String str, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, io.ktor.http.HttpMethod.INSTANCE.getGet(), null, null, null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$RyKGCr5f9Y9Mu32p01sP8kHUHx4(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object ws(io.ktor.client.HttpClient httpClient, io.ktor.http.HttpMethod httpMethod, java.lang.String str, java.lang.Integer num, java.lang.String str2, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, httpMethod, str, num, str2, function1, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object ws(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, function1, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object ws$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.plugins.websocket.BuildersKt.m23331$r8$lambda$FS8AR3PNY8ni_Dnpj81M117t_8((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return ws(httpClient, str, function1, function2, continuation);
    }

    public static final java.lang.Object ws(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, str, function1, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object wss(io.ktor.client.HttpClient httpClient, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$yTgGFqytu8VBlRH7rPKlUwER7Pw(kotlin.jvm.functions.Function1.this, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object wss$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return io.ktor.client.plugins.websocket.BuildersKt.m23333$r8$lambda$oTYWbEAvfOwOBcI5p3776BE0rs((io.ktor.client.request.HttpRequestBuilder) obj2);
                }
            };
        }
        return wss(httpClient, str, function1, function2, continuation);
    }

    public static final java.lang.Object wss(io.ktor.client.HttpClient httpClient, final java.lang.String str, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object wss = wss(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.$r8$lambda$3TqYT74CJFw2Pzq1DyRK3c11MgU(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return wss == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wss : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object wss(io.ktor.client.HttpClient httpClient, io.ktor.http.HttpMethod httpMethod, java.lang.String str, final java.lang.Integer num, java.lang.String str2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, httpMethod, str, num, str2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.client.plugins.websocket.BuildersKt.m23334$r8$lambda$oX5PP2br86OeLN0wCLMOVmFx0M(num, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$25-VeMizO56wk2lJVj6tf8GXRi4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23329$r8$lambda$25VeMizO56wk2lJVj6tf8GXRi4(io.ktor.http.HttpMethod httpMethod, java.lang.String str, java.lang.Integer num, java.lang.String str2, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.setMethod(httpMethod);
        io.ktor.client.request.HttpRequestKt.url$default(httpRequestBuilder, "ws", str, num, str2, null, 16, null);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2t0zMBZnwd8ht7eRFq7aV6xqmFw(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3TqYT74CJFw2Pzq1DyRK3c11MgU(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7KalEmPEbNhXaPZ9QIp4ikJqy0w(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$80O2VoZv6_3M7C88PcoTwmJDI-Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23330$r8$lambda$80O2VoZv6_3M7C88PcoTwmJDIQ(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FS8AR3PNY8ni_Dnpj81M117-t_8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23331$r8$lambda$FS8AR3PNY8ni_Dnpj81M117t_8(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NqX_N2lkvbm1o1HXjGDY18aGgD0(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OQm5itdvItPmMz28_T-ltm7UDDw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23332$r8$lambda$OQm5itdvItPmMz28_Tltm7UDDw(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RyKGCr5f9Y9Mu32p01sP8kHUHx4(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.getUrl().setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWS());
        httpRequestBuilder.getUrl().setPort(io.ktor.client.request.UtilsKt.getPort(httpRequestBuilder));
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YV6DYgTaCpiPcHYNNICxtjKfRa8(io.ktor.http.HttpMethod httpMethod, java.lang.String str, java.lang.Integer num, java.lang.String str2, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.setMethod(httpMethod);
        io.ktor.client.request.HttpRequestKt.url$default(httpRequestBuilder, "ws", str, num, str2, null, 16, null);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iGw_6qgE1ReLCkGRSSEzwmyPi1I(kotlin.jvm.functions.Function1 function1, io.ktor.client.plugins.websocket.WebSockets.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        function1.invoke(config);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oTYWbEAvfO-wOBcI5p3776BE0rs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23333$r8$lambda$oTYWbEAvfOwOBcI5p3776BE0rs(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oX5PP2-br86OeLN0wCLMOVmFx0M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23334$r8$lambda$oX5PP2br86OeLN0wCLMOVmFx0M(java.lang.Integer num, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.getUrl().setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWSS());
        if (num != null) {
            httpRequestBuilder.getUrl().setPort(num.intValue());
        }
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p9XEvdV1feKOrS5FtWczcuiKSVM(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rUqPDTRhizgK7dQVwwmkVlH6Js8(io.ktor.http.URLBuilder uRLBuilder, io.ktor.http.URLBuilder uRLBuilder2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder2, "");
        uRLBuilder.setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWS());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tTrmGUvXtRZH4NWZ58dHlm7PT2c(io.ktor.http.URLBuilder uRLBuilder, io.ktor.http.URLBuilder uRLBuilder2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uRLBuilder2, "");
        uRLBuilder.setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWS());
        uRLBuilder.setPort(uRLBuilder.getProtocol().getDefaultPort());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yTgGFqytu8VBlRH7rPKlUwER7Pw(kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.getUrl().setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWSS());
        httpRequestBuilder.getUrl().setPort(httpRequestBuilder.getUrl().getProtocol().getDefaultPort());
        function1.invoke(httpRequestBuilder);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$z7cgj4QTU3xzeevd4-LVwkQ2QTo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23335$r8$lambda$z7cgj4QTU3xzeevd4LVwkQ2QTo(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        return kotlin.Unit.INSTANCE;
    }
}
