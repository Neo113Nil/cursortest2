package io.ktor.client.plugins;

/* compiled from: HttpRedirect.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lio/ktor/http/HttpStatusCode;", "", "isRedirect", "(Lio/ktor/http/HttpStatusCode;)Z", "", "Lio/ktor/http/HttpMethod;", "ALLOWED_FOR_REDIRECT", "Ljava/util/Set;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/statement/HttpResponse;", "HttpResponseRedirectEvent", "Lio/ktor/events/EventDefinition;", "getHttpResponseRedirectEvent", "()Lio/ktor/events/EventDefinition;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/HttpRedirectConfig;", "HttpRedirect", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRedirect", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRedirect$annotations", "()V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRedirectKt {
    private static final java.util.Set<io.ktor.http.HttpMethod> ALLOWED_FOR_REDIRECT = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new io.ktor.http.HttpMethod[]{io.ktor.http.HttpMethod.INSTANCE.getGet(), io.ktor.http.HttpMethod.INSTANCE.getHead()});
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRedirect");
    private static final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> HttpResponseRedirectEvent = new io.ktor.events.EventDefinition<>();
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpRedirectConfig> HttpRedirect = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("HttpRedirect", io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$1.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRedirectKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit HttpRedirect$lambda$2;
            HttpRedirect$lambda$2 = io.ktor.client.plugins.HttpRedirectKt.HttpRedirect$lambda$2((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return HttpRedirect$lambda$2;
        }
    });

    public static /* synthetic */ void getHttpRedirect$annotations() {
    }

    public static final io.ktor.events.EventDefinition<io.ktor.client.statement.HttpResponse> getHttpResponseRedirectEvent() {
        return HttpResponseRedirectEvent;
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpRedirectConfig> getHttpRedirect() {
        return HttpRedirect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpRedirect$lambda$2(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(io.ktor.client.plugins.api.Send.INSTANCE, new io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1(((io.ktor.client.plugins.HttpRedirectConfig) createClientPlugin.getPluginConfig()).getCheckHttpMethod(), ((io.ktor.client.plugins.HttpRedirectConfig) createClientPlugin.getPluginConfig()).getAllowHttpsDowngrade(), createClientPlugin, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, io.ktor.client.request.HttpRequestBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0184 -> B:10:0x0189). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object HttpRedirect$lambda$2$handleCall(io.ktor.client.plugins.api.Send.Sender sender, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.client.call.HttpClientCall httpClientCall, boolean z, io.ktor.client.HttpClient httpClient, kotlin.coroutines.Continuation<? super io.ktor.client.call.HttpClientCall> continuation) {
        io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$handleCall$1 httpRedirectKt$HttpRedirect$2$handleCall$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        io.ktor.http.URLProtocol protocol;
        io.ktor.client.request.HttpRequestBuilder httpRequestBuilder2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        io.ktor.client.HttpClient httpClient2;
        boolean z2;
        java.lang.String str;
        java.lang.String str2;
        ?? httpRequestBuilder3;
        java.lang.Object proceed;
        if (continuation instanceof io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$handleCall$1) {
            httpRedirectKt$HttpRedirect$2$handleCall$1 = (io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$handleCall$1) continuation;
            if ((httpRedirectKt$HttpRedirect$2$handleCall$1.label & Integer.MIN_VALUE) != 0) {
                httpRedirectKt$HttpRedirect$2$handleCall$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpRedirectKt$HttpRedirect$2$handleCall$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpRedirectKt$HttpRedirect$2$handleCall$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!isRedirect(httpClientCall.getResponse().getStatus())) {
                        return httpClientCall;
                    }
                    kotlin.jvm.internal.Ref.ObjectRef objectRef3 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef3.element = httpClientCall;
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef.element = httpRequestBuilder;
                    protocol = httpClientCall.getRequest().getUrl().getProtocol();
                    java.lang.String authority = io.ktor.http.UrlKt.getAuthority(httpClientCall.getRequest().getUrl());
                    httpRequestBuilder2 = httpRequestBuilder;
                    objectRef2 = objectRef3;
                    httpClient2 = httpClient;
                    z2 = z;
                    str = authority;
                    httpClient2.getMonitor().raise(HttpResponseRedirectEvent, ((io.ktor.client.call.HttpClientCall) objectRef2.element).getResponse());
                    str2 = ((io.ktor.client.call.HttpClientCall) objectRef2.element).getResponse().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLocation());
                    org.slf4j.Logger logger = LOGGER;
                    logger.trace("Received redirect response to " + str2 + " for request " + httpRequestBuilder2.getUrl());
                    httpRequestBuilder3 = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder3.takeFromWithExecutionContext((io.ktor.client.request.HttpRequestBuilder) objectRef.element);
                    httpRequestBuilder3.getUrl().getParameters().clear();
                    if (str2 != null) {
                    }
                    if (z2) {
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                    }
                    objectRef.element = httpRequestBuilder3;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder4 = (io.ktor.client.request.HttpRequestBuilder) objectRef.element;
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
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = httpRedirectKt$HttpRedirect$2$handleCall$1.Z$0;
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$7;
                    java.lang.String str3 = (java.lang.String) httpRedirectKt$HttpRedirect$2$handleCall$1.L$6;
                    io.ktor.http.URLProtocol uRLProtocol = (io.ktor.http.URLProtocol) httpRedirectKt$HttpRedirect$2$handleCall$1.L$5;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$4;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) httpRedirectKt$HttpRedirect$2$handleCall$1.L$3;
                    io.ktor.client.HttpClient httpClient3 = (io.ktor.client.HttpClient) httpRedirectKt$HttpRedirect$2$handleCall$1.L$2;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder5 = (io.ktor.client.request.HttpRequestBuilder) httpRedirectKt$HttpRedirect$2$handleCall$1.L$1;
                    io.ktor.client.plugins.api.Send.Sender sender2 = (io.ktor.client.plugins.api.Send.Sender) httpRedirectKt$HttpRedirect$2$handleCall$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    z2 = z3;
                    sender = sender2;
                    io.ktor.http.URLProtocol uRLProtocol2 = uRLProtocol;
                    str = str3;
                    httpRequestBuilder2 = httpRequestBuilder5;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef6 = objectRef4;
                    T t = obj;
                    objectRef2.element = t;
                    if (isRedirect(((io.ktor.client.call.HttpClientCall) objectRef5.element).getResponse().getStatus())) {
                        return objectRef5.element;
                    }
                    objectRef2 = objectRef5;
                    httpClient2 = httpClient3;
                    objectRef = objectRef6;
                    protocol = uRLProtocol2;
                    httpClient2.getMonitor().raise(HttpResponseRedirectEvent, ((io.ktor.client.call.HttpClientCall) objectRef2.element).getResponse());
                    str2 = ((io.ktor.client.call.HttpClientCall) objectRef2.element).getResponse().getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getLocation());
                    org.slf4j.Logger logger2 = LOGGER;
                    logger2.trace("Received redirect response to " + str2 + " for request " + httpRequestBuilder2.getUrl());
                    httpRequestBuilder3 = new io.ktor.client.request.HttpRequestBuilder();
                    httpRequestBuilder3.takeFromWithExecutionContext((io.ktor.client.request.HttpRequestBuilder) objectRef.element);
                    httpRequestBuilder3.getUrl().getParameters().clear();
                    if (str2 != null) {
                        io.ktor.http.URLParserKt.takeFrom(httpRequestBuilder3.getUrl(), str2);
                    }
                    if (z2 && io.ktor.http.URLProtocolKt.isSecure(protocol) && !io.ktor.http.URLProtocolKt.isSecure(httpRequestBuilder3.getUrl().getProtocol())) {
                        logger2.trace("Can not redirect " + httpRequestBuilder2.getUrl() + " because of security downgrade");
                        return objectRef2.element;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.URLBuilderKt.getAuthority(httpRequestBuilder3.getUrl()))) {
                        httpRequestBuilder3.getHeaders().remove(io.ktor.http.HttpHeaders.INSTANCE.getAuthorization());
                        logger2.trace("Removing Authorization header from redirect for " + httpRequestBuilder2.getUrl());
                    }
                    objectRef.element = httpRequestBuilder3;
                    io.ktor.client.request.HttpRequestBuilder httpRequestBuilder42 = (io.ktor.client.request.HttpRequestBuilder) objectRef.element;
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
                    if (isRedirect(((io.ktor.client.call.HttpClientCall) objectRef5.element).getResponse().getStatus())) {
                    }
                }
            }
        }
        httpRedirectKt$HttpRedirect$2$handleCall$1 = new io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$handleCall$1(continuation);
        java.lang.Object obj2 = httpRedirectKt$HttpRedirect$2$handleCall$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpRedirectKt$HttpRedirect$2$handleCall$1.label;
        if (i != 0) {
        }
    }

    private static final boolean isRedirect(io.ktor.http.HttpStatusCode httpStatusCode) {
        int value = httpStatusCode.getValue();
        return value == io.ktor.http.HttpStatusCode.INSTANCE.getMovedPermanently().getValue() || value == io.ktor.http.HttpStatusCode.INSTANCE.getFound().getValue() || value == io.ktor.http.HttpStatusCode.INSTANCE.getTemporaryRedirect().getValue() || value == io.ktor.http.HttpStatusCode.INSTANCE.getPermanentRedirect().getValue() || value == io.ktor.http.HttpStatusCode.INSTANCE.getSeeOther().getValue();
    }
}
