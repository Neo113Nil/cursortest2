package io.ktor.client.plugins.sse;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\" \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\" \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018"}, d2 = {"Lio/ktor/client/statement/HttpResponse;", "response", "", "checkResponse", "(Lio/ktor/client/statement/HttpResponse;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "getLOGGER", "()Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/sse/SSEConfig;", "SSE", "Lio/ktor/client/plugins/api/ClientPlugin;", "getSSE", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getSSE$annotations", "()V", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/HttpClient;", "SSEClientForReconnectionAttr", "Lio/ktor/util/AttributeKey;", "getSSEClientForReconnectionAttr", "()Lio/ktor/util/AttributeKey;", "", "SSEReconnectionRequestAttr", "getSSEReconnectionRequestAttr"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SSEKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.sse.SSE");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.sse.SSEConfig> SSE = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("SSE", io.ktor.client.plugins.sse.SSEKt$SSE$1.getHighResolutionOutputSizeshNQ4ISI, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.SSEKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.plugins.sse.SSEKt.$r8$lambda$PYJ8M_CEti6q79Ox_epofDK6b5E((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
        }
    });
    private static final io.ktor.util.AttributeKey<io.ktor.client.HttpClient> SSEClientForReconnectionAttr;
    private static final io.ktor.util.AttributeKey<java.lang.Boolean> SSEReconnectionRequestAttr;

    public static /* synthetic */ void getSSE$annotations() {
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.HttpClient.class);
        kotlin.reflect.KType kType2 = null;
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.HttpClient.class);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        SSEClientForReconnectionAttr = new io.ktor.util.AttributeKey<>("SSEClientForReconnection", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused2) {
        }
        SSEReconnectionRequestAttr = new io.ktor.util.AttributeKey<>("SSEReconnectionRequestAttr", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
    }

    public static final org.slf4j.Logger getLOGGER() {
        return LOGGER;
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.sse.SSEConfig> getSSE() {
        return SSE;
    }

    public static final io.ktor.util.AttributeKey<io.ktor.client.HttpClient> getSSEClientForReconnectionAttr() {
        return SSEClientForReconnectionAttr;
    }

    public static final io.ktor.util.AttributeKey<java.lang.Boolean> getSSEReconnectionRequestAttr() {
        return SSEReconnectionRequestAttr;
    }

    public static final void checkResponse(io.ktor.client.statement.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "");
        io.ktor.http.HttpStatusCode status = httpResponse.getStatus();
        io.ktor.http.ContentType contentType = io.ktor.http.HttpMessagePropertiesKt.contentType(httpResponse);
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
            org.slf4j.Logger logger = LOGGER;
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Receive status code NoContent for SSE request to ");
                sb.append(io.ktor.client.statement.HttpResponseKt.getRequest(httpResponse).getUrl());
                logger.trace(sb.toString());
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected status code ");
            sb2.append(io.ktor.http.HttpStatusCode.INSTANCE.getOK().getValue());
            sb2.append(" but was ");
            sb2.append(status.getValue());
            throw new io.ktor.client.plugins.sse.SSEClientException(httpResponse, null, sb2.toString(), 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(contentType != null ? contentType.withoutParameters() : null, io.ktor.http.ContentType.Text.INSTANCE.getEventStream())) {
            return;
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected Content-Type ");
        sb3.append(io.ktor.http.ContentType.Text.INSTANCE.getEventStream());
        sb3.append(" but was ");
        sb3.append(contentType);
        throw new io.ktor.client.plugins.sse.SSEClientException(httpResponse, null, sb3.toString(), 2, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PYJ8M_CEti6q79Ox_epofDK6b5E(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        clientPluginBuilder.on(io.ktor.client.plugins.sse.AfterRender.INSTANCE, new io.ktor.client.plugins.sse.SSEKt$SSE$2$1(clientPluginBuilder, ((io.ktor.client.plugins.sse.SSEConfig) clientPluginBuilder.getPluginConfig()).getReconnectionTime(), ((io.ktor.client.plugins.sse.SSEConfig) clientPluginBuilder.getPluginConfig()).getShowCommentEvents(), ((io.ktor.client.plugins.sse.SSEConfig) clientPluginBuilder.getPluginConfig()).getShowRetryEvents(), ((io.ktor.client.plugins.sse.SSEConfig) clientPluginBuilder.getPluginConfig()).getMaxReconnectionAttempts(), null));
        clientPluginBuilder.getClient().getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getTransform(), new io.ktor.client.plugins.sse.SSEKt$SSE$2$2(null));
        return kotlin.Unit.INSTANCE;
    }
}
