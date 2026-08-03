package io.ktor.client.plugins.websocket;

/* compiled from: builders.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u000b*\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0015\u001a7\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0017\u001aV\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0086\u0001\u0010\u001c\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001e\u001a`\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001f\u001a\u0086\u0001\u0010 \u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001e\u001aV\u0010 \u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001d\u001a`\u0010 \u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001f\u001aV\u0010!\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001d\u001a`\u0010!\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001f\u001a\u0086\u0001\u0010!\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "", "Lkotlin/ExtensionFunctionType;", com.helpshift.proactive.InAppViewConstants.CONFIG, "WebSockets", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "webSocketSession", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/HttpMethod;", "method", "", "host", "", "port", "path", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "webSocket", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ws", "wss", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuildersKt {
    public static final void WebSockets(io.ktor.client.HttpClientConfig<?> httpClientConfig, final kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.websocket.WebSockets.Config, kotlin.Unit> config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        httpClientConfig.install(io.ktor.client.plugins.websocket.WebSockets.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit WebSockets$lambda$0;
                WebSockets$lambda$0 = io.ktor.client.plugins.websocket.BuildersKt.WebSockets$lambda$0(kotlin.jvm.functions.Function1.this, (io.ktor.client.plugins.websocket.WebSockets.Config) obj);
                return WebSockets$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit WebSockets$lambda$0(kotlin.jvm.functions.Function1 function1, io.ktor.client.plugins.websocket.WebSockets.Config install) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object webSocketSession(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> continuation) {
        io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.websocket.WebSockets.INSTANCE);
        kotlinx.coroutines.CompletableDeferred CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
        httpRequestBuilder.url(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit webSocketSession$lambda$2$lambda$1;
                webSocketSession$lambda$2$lambda$1 = io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$2$lambda$1((io.ktor.http.URLBuilder) obj, (io.ktor.http.URLBuilder) obj2);
                return webSocketSession$lambda$2$lambda$1;
            }
        });
        function1.invoke(httpRequestBuilder);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2(new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocketSession$lambda$2$lambda$1(io.ktor.http.URLBuilder url, io.ktor.http.URLBuilder it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "$this$url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        url.setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWS());
        url.setPort(url.getProtocol().getDefaultPort());
        return kotlin.Unit.INSTANCE;
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
                    kotlin.Unit webSocketSession$lambda$3;
                    webSocketSession$lambda$3 = io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$3((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return webSocketSession$lambda$3;
                }
            };
        }
        return webSocketSession(httpClient, httpMethod2, str3, num2, str4, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocketSession$lambda$3(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object webSocketSession(io.ktor.client.HttpClient httpClient, final io.ktor.http.HttpMethod httpMethod, final java.lang.String str, final java.lang.Integer num, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit webSocketSession$lambda$4;
                webSocketSession$lambda$4 = io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$4(io.ktor.http.HttpMethod.this, str, num, str2, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return webSocketSession$lambda$4;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocketSession$lambda$4(io.ktor.http.HttpMethod httpMethod, java.lang.String str, java.lang.Integer num, java.lang.String str2, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder webSocketSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        webSocketSession.setMethod(httpMethod);
        io.ktor.client.request.HttpRequestKt.url$default(webSocketSession, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocketSession);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object webSocketSession$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit webSocketSession$lambda$5;
                    webSocketSession$lambda$5 = io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$5((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return webSocketSession$lambda$5;
                }
            };
        }
        return webSocketSession(httpClient, str, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocketSession$lambda$5(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object webSocketSession(io.ktor.client.HttpClient httpClient, final java.lang.String str, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit webSocketSession$lambda$6;
                webSocketSession$lambda$6 = io.ktor.client.plugins.websocket.BuildersKt.webSocketSession$lambda$6(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return webSocketSession$lambda$6;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocketSession$lambda$6(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder webSocketSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        io.ktor.http.URLParserKt.takeFrom(webSocketSession.getUrl(), str);
        function1.invoke(webSocketSession);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0095, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102 A[Catch: all -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0095, blocks: (B:20:0x0050, B:21:0x015e, B:22:0x0165, B:24:0x0063, B:25:0x012b, B:33:0x0118, B:39:0x0149, B:43:0x0090, B:45:0x0102, B:54:0x0166, B:55:0x016d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0166 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:20:0x0050, B:21:0x015e, B:22:0x0165, B:24:0x0063, B:25:0x012b, B:33:0x0118, B:39:0x0149, B:43:0x0090, B:45:0x0102, B:54:0x0166, B:55:0x016d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [io.ktor.client.statement.HttpStatement] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object webSocket(io.ktor.client.HttpClient httpClient, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.websocket.BuildersKt$webSocket$1 buildersKt$webSocket$1;
        ?? r2;
        kotlin.jvm.functions.Function2 function22;
        io.ktor.client.statement.HttpResponse httpResponse;
        kotlin.reflect.KType kType;
        io.ktor.client.statement.HttpResponse httpResponse2;
        kotlin.jvm.functions.Function2 function23;
        io.ktor.client.statement.HttpStatement httpStatement;
        io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession;
        io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession2;
        io.ktor.client.statement.HttpStatement httpStatement2;
        io.ktor.client.statement.HttpStatement httpStatement3;
        io.ktor.client.statement.HttpStatement httpStatement4;
        try {
            if (continuation instanceof io.ktor.client.plugins.websocket.BuildersKt$webSocket$1) {
                buildersKt$webSocket$1 = (io.ktor.client.plugins.websocket.BuildersKt$webSocket$1) continuation;
                if ((buildersKt$webSocket$1.label & Integer.MIN_VALUE) != 0) {
                    buildersKt$webSocket$1.label -= Integer.MIN_VALUE;
                    java.lang.Object obj = buildersKt$webSocket$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = buildersKt$webSocket$1.label;
                    switch (r2) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj);
                            io.ktor.client.plugins.HttpClientPluginKt.plugin(httpClient, io.ktor.client.plugins.websocket.WebSockets.INSTANCE);
                            io.ktor.client.request.HttpRequestBuilder httpRequestBuilder = new io.ktor.client.request.HttpRequestBuilder();
                            httpRequestBuilder.url(new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit webSocket$lambda$8$lambda$7;
                                    webSocket$lambda$8$lambda$7 = io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$8$lambda$7((io.ktor.http.URLBuilder) obj2, (io.ktor.http.URLBuilder) obj3);
                                    return webSocket$lambda$8$lambda$7;
                                }
                            });
                            function1.invoke(httpRequestBuilder);
                            io.ktor.client.statement.HttpStatement httpStatement5 = new io.ktor.client.statement.HttpStatement(httpRequestBuilder, httpClient);
                            buildersKt$webSocket$1.L$0 = function2;
                            buildersKt$webSocket$1.L$1 = httpStatement5;
                            buildersKt$webSocket$1.label = 1;
                            obj = httpStatement5.fetchStreamingResponse(buildersKt$webSocket$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = httpStatement5;
                            function22 = function2;
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
                                buildersKt$webSocket$1.L$0 = function22;
                                buildersKt$webSocket$1.L$1 = r2;
                                buildersKt$webSocket$1.L$2 = httpResponse;
                                buildersKt$webSocket$1.label = 2;
                                obj = call.bodyNullable(typeInfo, buildersKt$webSocket$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                kotlin.jvm.functions.Function2 function24 = function22;
                                httpResponse2 = httpResponse;
                                function23 = function24;
                                httpStatement = r2;
                                if (obj != null) {
                                    throw new java.lang.NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                                }
                                io.ktor.client.plugins.websocket.DefaultClientWebSocketSession defaultClientWebSocketSession3 = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) obj;
                                io.ktor.client.plugins.websocket.BuildersKt$webSocket$1 buildersKt$webSocket$12 = buildersKt$webSocket$1;
                                try {
                                    buildersKt$webSocket$1.L$0 = httpStatement;
                                    buildersKt$webSocket$1.L$1 = httpResponse2;
                                    buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession3;
                                    buildersKt$webSocket$1.label = 3;
                                    if (function23.invoke(defaultClientWebSocketSession3, buildersKt$webSocket$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    defaultClientWebSocketSession2 = defaultClientWebSocketSession3;
                                    httpStatement3 = httpStatement;
                                    buildersKt$webSocket$1.L$0 = httpStatement3;
                                    buildersKt$webSocket$1.L$1 = httpResponse2;
                                    buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession2;
                                    buildersKt$webSocket$1.label = 4;
                                    httpStatement4 = httpStatement3;
                                    if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                    buildersKt$webSocket$1.L$0 = kotlin.Unit.INSTANCE;
                                    buildersKt$webSocket$1.L$1 = null;
                                    buildersKt$webSocket$1.L$2 = null;
                                    buildersKt$webSocket$1.label = 6;
                                    if (httpStatement4.cleanup(httpResponse2, buildersKt$webSocket$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return kotlin.Unit.INSTANCE;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    defaultClientWebSocketSession = defaultClientWebSocketSession3;
                                    httpStatement2 = httpStatement;
                                    buildersKt$webSocket$1.L$0 = httpStatement2;
                                    buildersKt$webSocket$1.L$1 = httpResponse2;
                                    buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession;
                                    buildersKt$webSocket$1.L$3 = th;
                                    buildersKt$webSocket$1.label = 5;
                                    if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                    throw th;
                                }
                            } catch (java.lang.Throwable th2) {
                                function2 = httpResponse;
                                th = th2;
                                buildersKt$webSocket$1.L$0 = th;
                                buildersKt$webSocket$1.L$1 = null;
                                buildersKt$webSocket$1.L$2 = null;
                                buildersKt$webSocket$1.L$3 = null;
                                buildersKt$webSocket$1.label = 7;
                                if (r2.cleanup(function2, buildersKt$webSocket$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                throw th;
                            }
                        case 1:
                            io.ktor.client.statement.HttpStatement httpStatement6 = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.L$1;
                            kotlin.jvm.functions.Function2 function25 = (kotlin.jvm.functions.Function2) buildersKt$webSocket$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            r2 = httpStatement6;
                            function22 = function25;
                            httpResponse = (io.ktor.client.statement.HttpResponse) obj;
                            io.ktor.client.call.HttpClientCall call2 = httpResponse.getCall();
                            kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
                            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.websocket.DefaultClientWebSocketSession.class);
                            io.ktor.util.reflect.TypeInfo typeInfo2 = new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType);
                            buildersKt$webSocket$1.L$0 = function22;
                            buildersKt$webSocket$1.L$1 = r2;
                            buildersKt$webSocket$1.L$2 = httpResponse;
                            buildersKt$webSocket$1.label = 2;
                            obj = call2.bodyNullable(typeInfo2, buildersKt$webSocket$1);
                            if (obj != coroutine_suspended) {
                            }
                            break;
                        case 2:
                            httpResponse2 = (io.ktor.client.statement.HttpResponse) buildersKt$webSocket$1.L$2;
                            io.ktor.client.statement.HttpStatement httpStatement7 = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.L$1;
                            function23 = (kotlin.jvm.functions.Function2) buildersKt$webSocket$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            httpStatement = httpStatement7;
                            if (obj != null) {
                            }
                            break;
                        case 3:
                            defaultClientWebSocketSession2 = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) buildersKt$webSocket$1.L$2;
                            io.ktor.client.statement.HttpResponse httpResponse3 = (io.ktor.client.statement.HttpResponse) buildersKt$webSocket$1.L$1;
                            io.ktor.client.statement.HttpStatement httpStatement8 = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.L$0;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                httpStatement3 = httpStatement8;
                                httpResponse2 = httpResponse3;
                                buildersKt$webSocket$1.L$0 = httpStatement3;
                                buildersKt$webSocket$1.L$1 = httpResponse2;
                                buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession2;
                                buildersKt$webSocket$1.label = 4;
                                httpStatement4 = httpStatement3;
                                if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                buildersKt$webSocket$1.L$0 = kotlin.Unit.INSTANCE;
                                buildersKt$webSocket$1.L$1 = null;
                                buildersKt$webSocket$1.L$2 = null;
                                buildersKt$webSocket$1.label = 6;
                                if (httpStatement4.cleanup(httpResponse2, buildersKt$webSocket$1) == coroutine_suspended) {
                                }
                                return kotlin.Unit.INSTANCE;
                            } catch (java.lang.Throwable th3) {
                                httpStatement2 = httpStatement8;
                                httpResponse2 = httpResponse3;
                                defaultClientWebSocketSession = defaultClientWebSocketSession2;
                                th = th3;
                                buildersKt$webSocket$1.L$0 = httpStatement2;
                                buildersKt$webSocket$1.L$1 = httpResponse2;
                                buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession;
                                buildersKt$webSocket$1.L$3 = th;
                                buildersKt$webSocket$1.label = 5;
                                if (io.ktor.websocket.WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                throw th;
                            }
                        case 4:
                            defaultClientWebSocketSession2 = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) buildersKt$webSocket$1.L$2;
                            httpResponse2 = (io.ktor.client.statement.HttpResponse) buildersKt$webSocket$1.L$1;
                            io.ktor.client.statement.HttpStatement httpStatement9 = (io.ktor.client.statement.HttpStatement) buildersKt$webSocket$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            httpStatement4 = httpStatement9;
                            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                            buildersKt$webSocket$1.L$0 = kotlin.Unit.INSTANCE;
                            buildersKt$webSocket$1.L$1 = null;
                            buildersKt$webSocket$1.L$2 = null;
                            buildersKt$webSocket$1.label = 6;
                            if (httpStatement4.cleanup(httpResponse2, buildersKt$webSocket$1) == coroutine_suspended) {
                            }
                            return kotlin.Unit.INSTANCE;
                        case 5:
                            th = (java.lang.Throwable) buildersKt$webSocket$1.L$3;
                            defaultClientWebSocketSession = (io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) buildersKt$webSocket$1.L$2;
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                            throw th;
                        case 6:
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        case 7:
                            th = (java.lang.Throwable) buildersKt$webSocket$1.L$0;
                            kotlin.ResultKt.throwOnFailure(obj);
                            throw th;
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r2) {
            }
        } catch (java.util.concurrent.CancellationException e) {
            throw io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        buildersKt$webSocket$1 = new io.ktor.client.plugins.websocket.BuildersKt$webSocket$1(continuation);
        java.lang.Object obj2 = buildersKt$webSocket$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = buildersKt$webSocket$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocket$lambda$8$lambda$7(io.ktor.http.URLBuilder url, io.ktor.http.URLBuilder it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "$this$url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        url.setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWS());
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocket$lambda$10(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object webSocket(io.ktor.client.HttpClient httpClient, final io.ktor.http.HttpMethod httpMethod, final java.lang.String str, final java.lang.Integer num, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit webSocket$lambda$11;
                webSocket$lambda$11 = io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$11(io.ktor.http.HttpMethod.this, str, num, str2, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return webSocket$lambda$11;
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocket$lambda$11(io.ktor.http.HttpMethod httpMethod, java.lang.String str, java.lang.Integer num, java.lang.String str2, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder webSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.setMethod(httpMethod);
        io.ktor.client.request.HttpRequestKt.url$default(webSocket, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocket);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object webSocket$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit webSocket$lambda$12;
                    webSocket$lambda$12 = io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$12((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return webSocket$lambda$12;
                }
            };
        }
        return webSocket(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocket$lambda$12(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object webSocket(io.ktor.client.HttpClient httpClient, final java.lang.String str, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, io.ktor.http.HttpMethod.INSTANCE.getGet(), null, null, null, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit webSocket$lambda$13;
                webSocket$lambda$13 = io.ktor.client.plugins.websocket.BuildersKt.webSocket$lambda$13(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return webSocket$lambda$13;
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit webSocket$lambda$13(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder webSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWS());
        webSocket.getUrl().setPort(io.ktor.client.request.UtilsKt.getPort(webSocket));
        io.ktor.http.URLParserKt.takeFrom(webSocket.getUrl(), str);
        function1.invoke(webSocket);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit ws$lambda$14(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
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
                    kotlin.Unit ws$lambda$15;
                    ws$lambda$15 = io.ktor.client.plugins.websocket.BuildersKt.ws$lambda$15((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return ws$lambda$15;
                }
            };
        }
        return ws(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit ws$lambda$15(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object ws(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, str, function1, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object wss(io.ktor.client.HttpClient httpClient, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit wss$lambda$16;
                wss$lambda$16 = io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$16(kotlin.jvm.functions.Function1.this, (io.ktor.client.request.HttpRequestBuilder) obj);
                return wss$lambda$16;
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit wss$lambda$16(kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder webSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWSS());
        webSocket.getUrl().setPort(webSocket.getUrl().getProtocol().getDefaultPort());
        function1.invoke(webSocket);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object wss$default(io.ktor.client.HttpClient httpClient, java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit wss$lambda$17;
                    wss$lambda$17 = io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$17((io.ktor.client.request.HttpRequestBuilder) obj2);
                    return wss$lambda$17;
                }
            };
        }
        return wss(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit wss$lambda$17(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object wss(io.ktor.client.HttpClient httpClient, final java.lang.String str, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object wss = wss(httpClient, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit wss$lambda$18;
                wss$lambda$18 = io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$18(str, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return wss$lambda$18;
            }
        }, function2, continuation);
        return wss == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wss : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit wss$lambda$18(java.lang.String str, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder wss) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wss, "$this$wss");
        io.ktor.http.URLParserKt.takeFrom(wss.getUrl(), str);
        function1.invoke(wss);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit wss$lambda$19(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object wss(io.ktor.client.HttpClient httpClient, io.ktor.http.HttpMethod httpMethod, java.lang.String str, final java.lang.Integer num, java.lang.String str2, final kotlin.jvm.functions.Function1<? super io.ktor.client.request.HttpRequestBuilder, kotlin.Unit> function1, kotlin.jvm.functions.Function2<? super io.ktor.client.plugins.websocket.DefaultClientWebSocketSession, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object webSocket = webSocket(httpClient, httpMethod, str, num, str2, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit wss$lambda$20;
                wss$lambda$20 = io.ktor.client.plugins.websocket.BuildersKt.wss$lambda$20(num, function1, (io.ktor.client.request.HttpRequestBuilder) obj);
                return wss$lambda$20;
            }
        }, function2, continuation);
        return webSocket == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit wss$lambda$20(java.lang.Integer num, kotlin.jvm.functions.Function1 function1, io.ktor.client.request.HttpRequestBuilder webSocket) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(io.ktor.http.URLProtocol.INSTANCE.getWSS());
        if (num != null) {
            webSocket.getUrl().setPort(num.intValue());
        }
        function1.invoke(webSocket);
        return kotlin.Unit.INSTANCE;
    }
}
