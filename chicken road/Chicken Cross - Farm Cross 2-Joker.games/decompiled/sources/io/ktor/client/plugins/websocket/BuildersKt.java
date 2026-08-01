package io.ktor.client.plugins.websocket;

import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.client.utils.ExceptionUtilsJvmKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.WebSocketSessionKt;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.channels.ReceiveChannel;

/* compiled from: builders.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\f\u001a\u00020\u000b*\u00020\b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\f\u001a\u00020\u000b*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0015\u001a7\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\f\u0010\u0017\u001aV\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0086\u0001\u0010\u001c\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001e\u001a`\u0010\u001c\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b\u001c\u0010\u001f\u001a\u0086\u0001\u0010 \u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001e\u001aV\u0010 \u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001d\u001a`\u0010 \u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b \u0010\u001f\u001aV\u0010!\u001a\u00020\u0003*\u00020\b2\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001d\u001a`\u0010!\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001f\u001a\u0086\u0001\u0010!\u001a\u00020\u0003*\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0019¢\u0006\u0002\b\u0004H\u0086@¢\u0006\u0004\b!\u0010\u001e¨\u0006\""}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "", "Lkotlin/ExtensionFunctionType;", "config", "WebSockets", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "webSocketSession", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/HttpMethod;", "method", "", "host", "", "port", "path", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "webSocket", "(Lio/ktor/client/HttpClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ws", "wss", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuildersKt {
    public static final void WebSockets(HttpClientConfig<?> httpClientConfig, final Function1<? super WebSockets.Config, Unit> config) {
        Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        httpClientConfig.install(WebSockets.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit WebSockets$lambda$0;
                WebSockets$lambda$0 = BuildersKt.WebSockets$lambda$0(Function1.this, (WebSockets.Config) obj);
                return WebSockets$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebSockets$lambda$0(Function1 function1, WebSockets.Config install) {
        Intrinsics.checkNotNullParameter(install, "$this$install");
        function1.invoke(install);
        return Unit.INSTANCE;
    }

    public static final Object webSocketSession(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.url(new Function2() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit webSocketSession$lambda$2$lambda$1;
                webSocketSession$lambda$2$lambda$1 = BuildersKt.webSocketSession$lambda$2$lambda$1((URLBuilder) obj, (URLBuilder) obj2);
                return webSocketSession$lambda$2$lambda$1;
            }
        });
        function1.invoke(httpRequestBuilder);
        BuildersKt__Builders_commonKt.launch$default(httpClient, null, null, new BuildersKt$webSocketSession$2(new HttpStatement(httpRequestBuilder, httpClient), CompletableDeferred$default, null), 3, null);
        return CompletableDeferred$default.await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$2$lambda$1(URLBuilder url, URLBuilder it) {
        Intrinsics.checkNotNullParameter(url, "$this$url");
        Intrinsics.checkNotNullParameter(it, "it");
        url.setProtocol(URLProtocol.INSTANCE.getWS());
        url.setPort(url.getProtocol().getDefaultPort());
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        HttpMethod httpMethod2 = httpMethod;
        String str3 = (i & 2) != 0 ? null : str;
        Integer num2 = (i & 4) != 0 ? null : num;
        String str4 = (i & 8) != 0 ? null : str2;
        if ((i & 16) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit webSocketSession$lambda$3;
                    webSocketSession$lambda$3 = BuildersKt.webSocketSession$lambda$3((HttpRequestBuilder) obj2);
                    return webSocketSession$lambda$3;
                }
            };
        }
        return webSocketSession(httpClient, httpMethod2, str3, num2, str4, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$3(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocketSession(HttpClient httpClient, final HttpMethod httpMethod, final String str, final Integer num, final String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit webSocketSession$lambda$4;
                webSocketSession$lambda$4 = BuildersKt.webSocketSession$lambda$4(HttpMethod.this, str, num, str2, function1, (HttpRequestBuilder) obj);
                return webSocketSession$lambda$4;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$4(HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, HttpRequestBuilder webSocketSession) {
        Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        webSocketSession.setMethod(httpMethod);
        HttpRequestKt.url$default(webSocketSession, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocketSession);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, String str, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit webSocketSession$lambda$5;
                    webSocketSession$lambda$5 = BuildersKt.webSocketSession$lambda$5((HttpRequestBuilder) obj2);
                    return webSocketSession$lambda$5;
                }
            };
        }
        return webSocketSession(httpClient, str, function1, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$5(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocketSession(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Continuation<? super DefaultClientWebSocketSession> continuation) {
        return webSocketSession(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit webSocketSession$lambda$6;
                webSocketSession$lambda$6 = BuildersKt.webSocketSession$lambda$6(str, function1, (HttpRequestBuilder) obj);
                return webSocketSession$lambda$6;
            }
        }, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocketSession$lambda$6(String str, Function1 function1, HttpRequestBuilder webSocketSession) {
        Intrinsics.checkNotNullParameter(webSocketSession, "$this$webSocketSession");
        URLParserKt.takeFrom(webSocketSession.getUrl(), str);
        function1.invoke(webSocketSession);
        return Unit.INSTANCE;
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
    public static final Object webSocket(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        BuildersKt$webSocket$1 buildersKt$webSocket$1;
        ?? r2;
        Function2 function22;
        HttpResponse httpResponse;
        KType kType;
        HttpResponse httpResponse2;
        Function2 function23;
        HttpStatement httpStatement;
        DefaultClientWebSocketSession defaultClientWebSocketSession;
        DefaultClientWebSocketSession defaultClientWebSocketSession2;
        HttpStatement httpStatement2;
        HttpStatement httpStatement3;
        HttpStatement httpStatement4;
        try {
            if (continuation instanceof BuildersKt$webSocket$1) {
                buildersKt$webSocket$1 = (BuildersKt$webSocket$1) continuation;
                if ((buildersKt$webSocket$1.label & Integer.MIN_VALUE) != 0) {
                    buildersKt$webSocket$1.label -= Integer.MIN_VALUE;
                    Object obj = buildersKt$webSocket$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = buildersKt$webSocket$1.label;
                    switch (r2) {
                        case 0:
                            ResultKt.throwOnFailure(obj);
                            HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
                            HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                            httpRequestBuilder.url(new Function2() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    Unit webSocket$lambda$8$lambda$7;
                                    webSocket$lambda$8$lambda$7 = BuildersKt.webSocket$lambda$8$lambda$7((URLBuilder) obj2, (URLBuilder) obj3);
                                    return webSocket$lambda$8$lambda$7;
                                }
                            });
                            function1.invoke(httpRequestBuilder);
                            HttpStatement httpStatement5 = new HttpStatement(httpRequestBuilder, httpClient);
                            buildersKt$webSocket$1.L$0 = function2;
                            buildersKt$webSocket$1.L$1 = httpStatement5;
                            buildersKt$webSocket$1.label = 1;
                            obj = httpStatement5.fetchStreamingResponse(buildersKt$webSocket$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r2 = httpStatement5;
                            function22 = function2;
                            httpResponse = (HttpResponse) obj;
                            try {
                                HttpClientCall call = httpResponse.getCall();
                                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class);
                                try {
                                    kType = Reflection.typeOf(DefaultClientWebSocketSession.class);
                                } catch (Throwable unused) {
                                    kType = null;
                                }
                                TypeInfo typeInfo = new TypeInfo(orCreateKotlinClass, kType);
                                buildersKt$webSocket$1.L$0 = function22;
                                buildersKt$webSocket$1.L$1 = r2;
                                buildersKt$webSocket$1.L$2 = httpResponse;
                                buildersKt$webSocket$1.label = 2;
                                obj = call.bodyNullable(typeInfo, buildersKt$webSocket$1);
                                if (obj != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Function2 function24 = function22;
                                httpResponse2 = httpResponse;
                                function23 = function24;
                                httpStatement = r2;
                                if (obj != null) {
                                    throw new NullPointerException("null cannot be cast to non-null type io.ktor.client.plugins.websocket.DefaultClientWebSocketSession");
                                }
                                DefaultClientWebSocketSession defaultClientWebSocketSession3 = (DefaultClientWebSocketSession) obj;
                                BuildersKt$webSocket$1 buildersKt$webSocket$12 = buildersKt$webSocket$1;
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
                                    if (WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (CancellationException) null, 1, (Object) null);
                                    buildersKt$webSocket$1.L$0 = Unit.INSTANCE;
                                    buildersKt$webSocket$1.L$1 = null;
                                    buildersKt$webSocket$1.L$2 = null;
                                    buildersKt$webSocket$1.label = 6;
                                    if (httpStatement4.cleanup(httpResponse2, buildersKt$webSocket$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    defaultClientWebSocketSession = defaultClientWebSocketSession3;
                                    httpStatement2 = httpStatement;
                                    buildersKt$webSocket$1.L$0 = httpStatement2;
                                    buildersKt$webSocket$1.L$1 = httpResponse2;
                                    buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession;
                                    buildersKt$webSocket$1.L$3 = th;
                                    buildersKt$webSocket$1.label = 5;
                                    if (WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (CancellationException) null, 1, (Object) null);
                                    throw th;
                                }
                            } catch (Throwable th2) {
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
                            HttpStatement httpStatement6 = (HttpStatement) buildersKt$webSocket$1.L$1;
                            Function2 function25 = (Function2) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            r2 = httpStatement6;
                            function22 = function25;
                            httpResponse = (HttpResponse) obj;
                            HttpClientCall call2 = httpResponse.getCall();
                            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(DefaultClientWebSocketSession.class);
                            kType = Reflection.typeOf(DefaultClientWebSocketSession.class);
                            TypeInfo typeInfo2 = new TypeInfo(orCreateKotlinClass2, kType);
                            buildersKt$webSocket$1.L$0 = function22;
                            buildersKt$webSocket$1.L$1 = r2;
                            buildersKt$webSocket$1.L$2 = httpResponse;
                            buildersKt$webSocket$1.label = 2;
                            obj = call2.bodyNullable(typeInfo2, buildersKt$webSocket$1);
                            if (obj != coroutine_suspended) {
                            }
                            break;
                        case 2:
                            httpResponse2 = (HttpResponse) buildersKt$webSocket$1.L$2;
                            HttpStatement httpStatement7 = (HttpStatement) buildersKt$webSocket$1.L$1;
                            function23 = (Function2) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            httpStatement = httpStatement7;
                            if (obj != null) {
                            }
                            break;
                        case 3:
                            defaultClientWebSocketSession2 = (DefaultClientWebSocketSession) buildersKt$webSocket$1.L$2;
                            HttpResponse httpResponse3 = (HttpResponse) buildersKt$webSocket$1.L$1;
                            HttpStatement httpStatement8 = (HttpStatement) buildersKt$webSocket$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                httpStatement3 = httpStatement8;
                                httpResponse2 = httpResponse3;
                                buildersKt$webSocket$1.L$0 = httpStatement3;
                                buildersKt$webSocket$1.L$1 = httpResponse2;
                                buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession2;
                                buildersKt$webSocket$1.label = 4;
                                httpStatement4 = httpStatement3;
                                if (WebSocketSessionKt.close$default(defaultClientWebSocketSession2, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (CancellationException) null, 1, (Object) null);
                                buildersKt$webSocket$1.L$0 = Unit.INSTANCE;
                                buildersKt$webSocket$1.L$1 = null;
                                buildersKt$webSocket$1.L$2 = null;
                                buildersKt$webSocket$1.label = 6;
                                if (httpStatement4.cleanup(httpResponse2, buildersKt$webSocket$1) == coroutine_suspended) {
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th3) {
                                httpStatement2 = httpStatement8;
                                httpResponse2 = httpResponse3;
                                defaultClientWebSocketSession = defaultClientWebSocketSession2;
                                th = th3;
                                buildersKt$webSocket$1.L$0 = httpStatement2;
                                buildersKt$webSocket$1.L$1 = httpResponse2;
                                buildersKt$webSocket$1.L$2 = defaultClientWebSocketSession;
                                buildersKt$webSocket$1.L$3 = th;
                                buildersKt$webSocket$1.label = 5;
                                if (WebSocketSessionKt.close$default(defaultClientWebSocketSession, null, buildersKt$webSocket$1, 1, null) == coroutine_suspended) {
                                }
                                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (CancellationException) null, 1, (Object) null);
                                throw th;
                            }
                        case 4:
                            defaultClientWebSocketSession2 = (DefaultClientWebSocketSession) buildersKt$webSocket$1.L$2;
                            httpResponse2 = (HttpResponse) buildersKt$webSocket$1.L$1;
                            HttpStatement httpStatement9 = (HttpStatement) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            httpStatement4 = httpStatement9;
                            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) defaultClientWebSocketSession2.getIncoming(), (CancellationException) null, 1, (Object) null);
                            buildersKt$webSocket$1.L$0 = Unit.INSTANCE;
                            buildersKt$webSocket$1.L$1 = null;
                            buildersKt$webSocket$1.L$2 = null;
                            buildersKt$webSocket$1.label = 6;
                            if (httpStatement4.cleanup(httpResponse2, buildersKt$webSocket$1) == coroutine_suspended) {
                            }
                            return Unit.INSTANCE;
                        case 5:
                            th = (Throwable) buildersKt$webSocket$1.L$3;
                            defaultClientWebSocketSession = (DefaultClientWebSocketSession) buildersKt$webSocket$1.L$2;
                            ResultKt.throwOnFailure(obj);
                            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) defaultClientWebSocketSession.getIncoming(), (CancellationException) null, 1, (Object) null);
                            throw th;
                        case 6:
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        case 7:
                            th = (Throwable) buildersKt$webSocket$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (r2) {
            }
        } catch (CancellationException e) {
            throw ExceptionUtilsJvmKt.unwrapCancellationException(e);
        }
        buildersKt$webSocket$1 = new BuildersKt$webSocket$1(continuation);
        Object obj2 = buildersKt$webSocket$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = buildersKt$webSocket$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$8$lambda$7(URLBuilder url, URLBuilder it) {
        Intrinsics.checkNotNullParameter(url, "$this$url");
        Intrinsics.checkNotNullParameter(it, "it");
        url.setProtocol(URLProtocol.INSTANCE.getWS());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$10(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocket(HttpClient httpClient, final HttpMethod httpMethod, final String str, final Integer num, final String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit webSocket$lambda$11;
                webSocket$lambda$11 = BuildersKt.webSocket$lambda$11(HttpMethod.this, str, num, str2, function1, (HttpRequestBuilder) obj);
                return webSocket$lambda$11;
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$11(HttpMethod httpMethod, String str, Integer num, String str2, Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.setMethod(httpMethod);
        HttpRequestKt.url$default(webSocket, "ws", str, num, str2, null, 16, null);
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit webSocket$lambda$12;
                    webSocket$lambda$12 = BuildersKt.webSocket$lambda$12((HttpRequestBuilder) obj2);
                    return webSocket$lambda$12;
                }
            };
        }
        return webSocket(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$12(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object webSocket(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, HttpMethod.INSTANCE.getGet(), null, null, null, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit webSocket$lambda$13;
                webSocket$lambda$13 = BuildersKt.webSocket$lambda$13(str, function1, (HttpRequestBuilder) obj);
                return webSocket$lambda$13;
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit webSocket$lambda$13(String str, Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWS());
        webSocket.getUrl().setPort(UtilsKt.getPort(webSocket));
        URLParserKt.takeFrom(webSocket.getUrl(), str);
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ws$lambda$14(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, httpMethod, str, num, str2, function1, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, function1, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit ws$lambda$15;
                    ws$lambda$15 = BuildersKt.ws$lambda$15((HttpRequestBuilder) obj2);
                    return ws$lambda$15;
                }
            };
        }
        return ws(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ws$lambda$15(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object ws(HttpClient httpClient, String str, Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, str, function1, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit wss$lambda$16;
                wss$lambda$16 = BuildersKt.wss$lambda$16(Function1.this, (HttpRequestBuilder) obj);
                return wss$lambda$16;
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$16(Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
        webSocket.getUrl().setPort(webSocket.getUrl().getProtocol().getDefaultPort());
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, String str, Function1 function1, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit wss$lambda$17;
                    wss$lambda$17 = BuildersKt.wss$lambda$17((HttpRequestBuilder) obj2);
                    return wss$lambda$17;
                }
            };
        }
        return wss(httpClient, str, function1, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$17(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, final String str, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object wss = wss(httpClient, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit wss$lambda$18;
                wss$lambda$18 = BuildersKt.wss$lambda$18(str, function1, (HttpRequestBuilder) obj);
                return wss$lambda$18;
            }
        }, function2, continuation);
        return wss == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wss : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$18(String str, Function1 function1, HttpRequestBuilder wss) {
        Intrinsics.checkNotNullParameter(wss, "$this$wss");
        URLParserKt.takeFrom(wss.getUrl(), str);
        function1.invoke(wss);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$19(HttpRequestBuilder httpRequestBuilder) {
        Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        return Unit.INSTANCE;
    }

    public static final Object wss(HttpClient httpClient, HttpMethod httpMethod, String str, final Integer num, String str2, final Function1<? super HttpRequestBuilder, Unit> function1, Function2<? super DefaultClientWebSocketSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object webSocket = webSocket(httpClient, httpMethod, str, num, str2, new Function1() { // from class: io.ktor.client.plugins.websocket.BuildersKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit wss$lambda$20;
                wss$lambda$20 = BuildersKt.wss$lambda$20(num, function1, (HttpRequestBuilder) obj);
                return wss$lambda$20;
            }
        }, function2, continuation);
        return webSocket == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? webSocket : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit wss$lambda$20(Integer num, Function1 function1, HttpRequestBuilder webSocket) {
        Intrinsics.checkNotNullParameter(webSocket, "$this$webSocket");
        webSocket.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
        if (num != null) {
            webSocket.getUrl().setPort(num.intValue());
        }
        function1.invoke(webSocket);
        return Unit.INSTANCE;
    }
}
