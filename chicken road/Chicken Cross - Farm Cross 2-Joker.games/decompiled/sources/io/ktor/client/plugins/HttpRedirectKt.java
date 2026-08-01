package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMethod;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import io.ktor.http.URLProtocolKt;
import io.ktor.http.UrlKt;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.slf4j.Logger;

/* compiled from: HttpRedirect.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/ktor/http/HttpStatusCode;", "", "isRedirect", "(Lio/ktor/http/HttpStatusCode;)Z", "", "Lio/ktor/http/HttpMethod;", "ALLOWED_FOR_REDIRECT", "Ljava/util/Set;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "HttpResponseRedirectEvent", "Lio/ktor/events/EventDefinition;", "getHttpResponseRedirectEvent", "()Lio/ktor/events/EventDefinition;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/HttpRedirectConfig;", "HttpRedirect", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRedirect", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRedirect$annotations", "()V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HttpRedirectKt {
    private static final Set<HttpMethod> ALLOWED_FOR_REDIRECT = SetsKt.setOf((Object[]) new HttpMethod[]{HttpMethod.INSTANCE.getGet(), HttpMethod.INSTANCE.getHead()});
    private static final Logger LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRedirect");
    private static final EventDefinition<HttpResponse> HttpResponseRedirectEvent = new EventDefinition<>();
    private static final ClientPlugin<HttpRedirectConfig> HttpRedirect = CreatePluginUtilsKt.createClientPlugin("HttpRedirect", HttpRedirectKt$HttpRedirect$1.INSTANCE, new Function1() { // from class: io.ktor.client.plugins.HttpRedirectKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit HttpRedirect$lambda$2;
            HttpRedirect$lambda$2 = HttpRedirectKt.HttpRedirect$lambda$2((ClientPluginBuilder) obj);
            return HttpRedirect$lambda$2;
        }
    });

    public static /* synthetic */ void getHttpRedirect$annotations() {
    }

    public static final EventDefinition<HttpResponse> getHttpResponseRedirectEvent() {
        return HttpResponseRedirectEvent;
    }

    public static final ClientPlugin<HttpRedirectConfig> getHttpRedirect() {
        return HttpRedirect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HttpRedirect$lambda$2(ClientPluginBuilder createClientPlugin) {
        Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(Send.INSTANCE, new HttpRedirectKt$HttpRedirect$2$1(((HttpRedirectConfig) createClientPlugin.getPluginConfig()).getCheckHttpMethod(), ((HttpRedirectConfig) createClientPlugin.getPluginConfig()).getAllowHttpsDowngrade(), createClientPlugin, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, io.ktor.client.request.HttpRequestBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x018a -> B:10:0x018f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object HttpRedirect$lambda$2$handleCall(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, HttpClientCall httpClientCall, boolean z, HttpClient httpClient, Continuation<? super HttpClientCall> continuation) {
        HttpRedirectKt$HttpRedirect$2$handleCall$1 httpRedirectKt$HttpRedirect$2$handleCall$1;
        int i;
        Ref.ObjectRef objectRef;
        URLProtocol protocol;
        HttpRequestBuilder httpRequestBuilder2;
        Ref.ObjectRef objectRef2;
        HttpClient httpClient2;
        boolean z2;
        String str;
        String str2;
        ?? httpRequestBuilder3;
        Object proceed;
        if (continuation instanceof HttpRedirectKt$HttpRedirect$2$handleCall$1) {
            httpRedirectKt$HttpRedirect$2$handleCall$1 = (HttpRedirectKt$HttpRedirect$2$handleCall$1) continuation;
            if ((httpRedirectKt$HttpRedirect$2$handleCall$1.label & Integer.MIN_VALUE) != 0) {
                httpRedirectKt$HttpRedirect$2$handleCall$1.label -= Integer.MIN_VALUE;
                Object obj = httpRedirectKt$HttpRedirect$2$handleCall$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpRedirectKt$HttpRedirect$2$handleCall$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!isRedirect(httpClientCall.getResponse().getStatus())) {
                        return httpClientCall;
                    }
                    Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                    objectRef3.element = httpClientCall;
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = httpRequestBuilder;
                    protocol = httpClientCall.getRequest().getUrl().getProtocol();
                    String authority = UrlKt.getAuthority(httpClientCall.getRequest().getUrl());
                    httpRequestBuilder2 = httpRequestBuilder;
                    objectRef2 = objectRef3;
                    httpClient2 = httpClient;
                    z2 = z;
                    str = authority;
                    httpClient2.getMonitor().raise(HttpResponseRedirectEvent, ((HttpClientCall) objectRef2.element).getResponse());
                    str2 = ((HttpClientCall) objectRef2.element).getResponse().getHeaders().get(HttpHeaders.INSTANCE.getLocation());
                    Logger logger = LOGGER;
                    logger.trace("Received redirect response to " + str2 + " for request " + httpRequestBuilder2.getUrl());
                    httpRequestBuilder3 = new HttpRequestBuilder();
                    httpRequestBuilder3.takeFromWithExecutionContext((HttpRequestBuilder) objectRef.element);
                    httpRequestBuilder3.getUrl().getParameters().clear();
                    if (str2 != null) {
                    }
                    if (z2) {
                    }
                    if (!Intrinsics.areEqual(str, URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                    }
                    objectRef.element = httpRequestBuilder3;
                    HttpRequestBuilder httpRequestBuilder4 = (HttpRequestBuilder) objectRef.element;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$0 = sender;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$1 = httpRequestBuilder2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$2 = httpClient2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$3 = objectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$4 = objectRef;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$5 = protocol;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$6 = str;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$7 = objectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.Z$0 = z2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.label = 1;
                    proceed = sender.proceed(httpRequestBuilder4, httpRedirectKt$HttpRedirect$2$handleCall$1);
                    if (proceed != coroutine_suspended) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = httpRedirectKt$HttpRedirect$2$handleCall$1.Z$0;
                    objectRef2 = (Ref.ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$7;
                    String str3 = (String) httpRedirectKt$HttpRedirect$2$handleCall$1.L$6;
                    URLProtocol uRLProtocol = (URLProtocol) httpRedirectKt$HttpRedirect$2$handleCall$1.L$5;
                    Ref.ObjectRef objectRef4 = (Ref.ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$4;
                    Ref.ObjectRef objectRef5 = (Ref.ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$3;
                    HttpClient httpClient3 = (HttpClient) httpRedirectKt$HttpRedirect$2$handleCall$1.L$2;
                    HttpRequestBuilder httpRequestBuilder5 = (HttpRequestBuilder) httpRedirectKt$HttpRedirect$2$handleCall$1.L$1;
                    Send.Sender sender2 = (Send.Sender) httpRedirectKt$HttpRedirect$2$handleCall$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    sender = sender2;
                    URLProtocol uRLProtocol2 = uRLProtocol;
                    str = str3;
                    httpRequestBuilder2 = httpRequestBuilder5;
                    Ref.ObjectRef objectRef6 = objectRef4;
                    T t = obj;
                    objectRef2.element = t;
                    if (isRedirect(((HttpClientCall) objectRef5.element).getResponse().getStatus())) {
                        return objectRef5.element;
                    }
                    objectRef2 = objectRef5;
                    httpClient2 = httpClient3;
                    objectRef = objectRef6;
                    protocol = uRLProtocol2;
                    httpClient2.getMonitor().raise(HttpResponseRedirectEvent, ((HttpClientCall) objectRef2.element).getResponse());
                    str2 = ((HttpClientCall) objectRef2.element).getResponse().getHeaders().get(HttpHeaders.INSTANCE.getLocation());
                    Logger logger2 = LOGGER;
                    logger2.trace("Received redirect response to " + str2 + " for request " + httpRequestBuilder2.getUrl());
                    httpRequestBuilder3 = new HttpRequestBuilder();
                    httpRequestBuilder3.takeFromWithExecutionContext((HttpRequestBuilder) objectRef.element);
                    httpRequestBuilder3.getUrl().getParameters().clear();
                    if (str2 != null) {
                        URLParserKt.takeFrom(httpRequestBuilder3.getUrl(), str2);
                    }
                    if (z2 && URLProtocolKt.isSecure(protocol) && !URLProtocolKt.isSecure(httpRequestBuilder3.getUrl().getProtocol())) {
                        logger2.trace("Can not redirect " + httpRequestBuilder2.getUrl() + " because of security downgrade");
                        return objectRef2.element;
                    }
                    if (!Intrinsics.areEqual(str, URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                        httpRequestBuilder3.getHeaders().remove(HttpHeaders.INSTANCE.getAuthorization());
                        logger2.trace("Removing Authorization header from redirect for " + httpRequestBuilder2.getUrl());
                    }
                    objectRef.element = httpRequestBuilder3;
                    HttpRequestBuilder httpRequestBuilder42 = (HttpRequestBuilder) objectRef.element;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$0 = sender;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$1 = httpRequestBuilder2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$2 = httpClient2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$3 = objectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$4 = objectRef;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$5 = protocol;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$6 = str;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.L$7 = objectRef2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.Z$0 = z2;
                    httpRedirectKt$HttpRedirect$2$handleCall$1.label = 1;
                    proceed = sender.proceed(httpRequestBuilder42, httpRedirectKt$HttpRedirect$2$handleCall$1);
                    if (proceed != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    uRLProtocol2 = protocol;
                    httpClient3 = httpClient2;
                    t = proceed;
                    objectRef6 = objectRef;
                    objectRef5 = objectRef2;
                    objectRef2.element = t;
                    if (isRedirect(((HttpClientCall) objectRef5.element).getResponse().getStatus())) {
                    }
                }
            }
        }
        httpRedirectKt$HttpRedirect$2$handleCall$1 = new HttpRedirectKt$HttpRedirect$2$handleCall$1(continuation);
        Object obj2 = httpRedirectKt$HttpRedirect$2$handleCall$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpRedirectKt$HttpRedirect$2$handleCall$1.label;
        if (i != 0) {
        }
    }

    private static final boolean isRedirect(HttpStatusCode httpStatusCode) {
        int value = httpStatusCode.getValue();
        return value == HttpStatusCode.INSTANCE.getMovedPermanently().getValue() || value == HttpStatusCode.INSTANCE.getFound().getValue() || value == HttpStatusCode.INSTANCE.getTemporaryRedirect().getValue() || value == HttpStatusCode.INSTANCE.getPermanentRedirect().getValue() || value == HttpStatusCode.INSTANCE.getSeeOther().getValue();
    }
}
