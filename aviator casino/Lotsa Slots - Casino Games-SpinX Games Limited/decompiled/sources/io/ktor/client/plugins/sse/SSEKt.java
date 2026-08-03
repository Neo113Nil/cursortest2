package io.ktor.client.plugins.sse;

/* compiled from: SSE.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u001e\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\" \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\" \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006#"}, d2 = {"", "T", "Lio/ktor/client/request/HttpRequestBuilder;", "request", "Lio/ktor/util/AttributeKey;", "attributeKey", "getAttributeValue", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpResponse;", com.ironsource.Ve.n, "", "checkResponse", "(Lio/ktor/client/statement/HttpResponse;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "getLOGGER", "()Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/plugins/sse/SSEConfig;", "SSE", "Lio/ktor/client/plugins/api/ClientPlugin;", "getSSE", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getSSE$annotations", "()V", "Lio/ktor/client/HttpClient;", "SSEClientForReconnectionAttr", "Lio/ktor/util/AttributeKey;", "getSSEClientForReconnectionAttr", "()Lio/ktor/util/AttributeKey;", "", "SSEReconnectionRequestAttr", "getSSEReconnectionRequestAttr", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SSEKt {
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.sse.SSE");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.sse.SSEConfig> SSE = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("SSE", io.ktor.client.plugins.sse.SSEKt$SSE$1.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.sse.SSEKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit SSE$lambda$0;
            SSE$lambda$0 = io.ktor.client.plugins.sse.SSEKt.SSE$lambda$0((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return SSE$lambda$0;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit SSE$lambda$0(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.on(io.ktor.client.plugins.sse.AfterRender.INSTANCE, new io.ktor.client.plugins.sse.SSEKt$SSE$2$1(createClientPlugin, ((io.ktor.client.plugins.sse.SSEConfig) createClientPlugin.getPluginConfig()).getReconnectionTime(), ((io.ktor.client.plugins.sse.SSEConfig) createClientPlugin.getPluginConfig()).getShowCommentEvents(), ((io.ktor.client.plugins.sse.SSEConfig) createClientPlugin.getPluginConfig()).getShowRetryEvents(), ((io.ktor.client.plugins.sse.SSEConfig) createClientPlugin.getPluginConfig()).getMaxReconnectionAttempts(), null));
        createClientPlugin.getClient().getResponsePipeline().intercept(io.ktor.client.statement.HttpResponsePipeline.INSTANCE.getTransform(), new io.ktor.client.plugins.sse.SSEKt$SSE$2$2(null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T getAttributeValue(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, io.ktor.util.AttributeKey<T> attributeKey) {
        return (T) httpRequestBuilder.getAttributes().getOrNull(attributeKey);
    }

    public static final io.ktor.util.AttributeKey<io.ktor.client.HttpClient> getSSEClientForReconnectionAttr() {
        return SSEClientForReconnectionAttr;
    }

    public static final io.ktor.util.AttributeKey<java.lang.Boolean> getSSEReconnectionRequestAttr() {
        return SSEReconnectionRequestAttr;
    }

    public static final void checkResponse(io.ktor.client.statement.HttpResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        io.ktor.http.HttpStatusCode status = response.getStatus();
        io.ktor.http.ContentType contentType = io.ktor.http.HttpMessagePropertiesKt.contentType(response);
        if (kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getNoContent())) {
            org.slf4j.Logger logger = LOGGER;
            if (io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(logger)) {
                logger.trace("Receive status code NoContent for SSE request to " + io.ktor.client.statement.HttpResponseKt.getRequest(response).getUrl());
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(status, io.ktor.http.HttpStatusCode.INSTANCE.getOK())) {
            throw new io.ktor.client.plugins.sse.SSEClientException(response, null, "Expected status code " + io.ktor.http.HttpStatusCode.INSTANCE.getOK().getValue() + " but was " + status.getValue(), 2, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(contentType != null ? contentType.withoutParameters() : null, io.ktor.http.ContentType.Text.INSTANCE.getEventStream())) {
            return;
        }
        throw new io.ktor.client.plugins.sse.SSEClientException(response, null, "Expected Content-Type " + io.ktor.http.ContentType.Text.INSTANCE.getEventStream() + " but was " + contentType, 2, null);
    }
}
