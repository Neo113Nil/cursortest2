package io.ktor.client.plugins;

/* compiled from: HttpRequestRetry.kt */
@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\r\u001a\u00020\t*\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000e\"\u0018\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0006¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d\"\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\"7\u0010'\u001a%\u0012!\u0012\u001f\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0$¢\u0006\u0002\b\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#\"7\u0010(\u001a%\u0012!\u0012\u001f\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0$¢\u0006\u0002\b\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#\"1\u0010+\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030)¢\u0006\u0002\b\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#\"1\u0010.\u001a\u001f\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020-0)¢\u0006\u0002\b\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010#¨\u0006/"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpRequestRetryConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "retry", "(Lio/ktor/client/request/HttpRequestBuilder;Lkotlin/jvm/functions/Function1;)V", "", "", "isTimeoutException", "(Ljava/lang/Throwable;)Z", "Lio/ktor/client/statement/HttpResponse;", "throwOnInvalidResponseBody", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/plugins/HttpRetryEventData;", "HttpRequestRetryEvent", "Lio/ktor/events/EventDefinition;", "getHttpRequestRetryEvent", "()Lio/ktor/events/EventDefinition;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpRequestRetry", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRequestRetry", "()Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpRequestRetry$annotations", "()V", "Lio/ktor/util/AttributeKey;", "", "MaxRetriesPerRequestAttributeKey", "Lio/ktor/util/AttributeKey;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/HttpRetryShouldRetryContext;", "Lio/ktor/client/request/HttpRequest;", "ShouldRetryPerRequestAttributeKey", "ShouldRetryOnExceptionPerRequestAttributeKey", "Lkotlin/Function2;", "Lio/ktor/client/plugins/HttpRetryModifyRequestContext;", "ModifyRequestPerRequestAttributeKey", "Lio/ktor/client/plugins/HttpRetryDelayContext;", "", "RetryDelayPerRequestAttributeKey", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpRequestRetryKt {
    private static final io.ktor.util.AttributeKey<java.lang.Integer> MaxRetriesPerRequestAttributeKey;
    private static final io.ktor.util.AttributeKey<kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryModifyRequestContext, io.ktor.client.request.HttpRequestBuilder, kotlin.Unit>> ModifyRequestPerRequestAttributeKey;
    private static final io.ktor.util.AttributeKey<kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long>> RetryDelayPerRequestAttributeKey;
    private static final io.ktor.util.AttributeKey<kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean>> ShouldRetryOnExceptionPerRequestAttributeKey;
    private static final io.ktor.util.AttributeKey<kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean>> ShouldRetryPerRequestAttributeKey;
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpRequestRetry");
    private static final io.ktor.events.EventDefinition<io.ktor.client.plugins.HttpRetryEventData> HttpRequestRetryEvent = new io.ktor.events.EventDefinition<>();
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpRequestRetryConfig> HttpRequestRetry = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("RetryFeature", io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestRetryKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit HttpRequestRetry$lambda$1;
            HttpRequestRetry$lambda$1 = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return HttpRequestRetry$lambda$1;
        }
    });

    public static /* synthetic */ void getHttpRequestRetry$annotations() {
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KType kType2;
        kotlin.reflect.KType kType3;
        kotlin.reflect.KType kType4;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.class);
        kotlin.reflect.KType kType5 = null;
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(java.lang.Integer.TYPE);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        MaxRetriesPerRequestAttributeKey = new io.ktor.util.AttributeKey<>("MaxRetriesPerRequestAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
        kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.jvm.functions.Function3.class);
        try {
            kType2 = kotlin.jvm.internal.Reflection.typeOf(kotlin.jvm.functions.Function3.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.HttpRetryShouldRetryContext.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.HttpRequest.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.statement.HttpResponse.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.Boolean.TYPE)));
        } catch (java.lang.Throwable unused2) {
            kType2 = null;
        }
        ShouldRetryPerRequestAttributeKey = new io.ktor.util.AttributeKey<>("ShouldRetryPerRequestAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass2, kType2));
        kotlin.reflect.KClass orCreateKotlinClass3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.jvm.functions.Function3.class);
        try {
            kType3 = kotlin.jvm.internal.Reflection.typeOf(kotlin.jvm.functions.Function3.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.HttpRetryShouldRetryContext.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.HttpRequestBuilder.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.Throwable.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.Boolean.TYPE)));
        } catch (java.lang.Throwable unused3) {
            kType3 = null;
        }
        ShouldRetryOnExceptionPerRequestAttributeKey = new io.ktor.util.AttributeKey<>("ShouldRetryOnExceptionPerRequestAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass3, kType3));
        kotlin.reflect.KClass orCreateKotlinClass4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.jvm.functions.Function2.class);
        try {
            kType4 = kotlin.jvm.internal.Reflection.typeOf(kotlin.jvm.functions.Function2.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.HttpRetryModifyRequestContext.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.request.HttpRequestBuilder.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(kotlin.Unit.class)));
        } catch (java.lang.Throwable unused4) {
            kType4 = null;
        }
        ModifyRequestPerRequestAttributeKey = new io.ktor.util.AttributeKey<>("ModifyRequestPerRequestAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass4, kType4));
        kotlin.reflect.KClass orCreateKotlinClass5 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.jvm.functions.Function2.class);
        try {
            kType5 = kotlin.jvm.internal.Reflection.typeOf(kotlin.jvm.functions.Function2.class, kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.HttpRetryDelayContext.class)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.Integer.TYPE)), kotlin.reflect.KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.Reflection.typeOf(java.lang.Long.TYPE)));
        } catch (java.lang.Throwable unused5) {
        }
        RetryDelayPerRequestAttributeKey = new io.ktor.util.AttributeKey<>("RetryDelayPerRequestAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass5, kType5));
    }

    public static final io.ktor.events.EventDefinition<io.ktor.client.plugins.HttpRetryEventData> getHttpRequestRetryEvent() {
        return HttpRequestRetryEvent;
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpRequestRetryConfig> getHttpRequestRetry() {
        return HttpRequestRetry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpRequestRetry$lambda$1(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequest, io.ktor.client.statement.HttpResponse, java.lang.Boolean> shouldRetry$ktor_client_core = ((io.ktor.client.plugins.HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getShouldRetry$ktor_client_core();
        kotlin.jvm.functions.Function3<io.ktor.client.plugins.HttpRetryShouldRetryContext, io.ktor.client.request.HttpRequestBuilder, java.lang.Throwable, java.lang.Boolean> shouldRetryOnException$ktor_client_core = ((io.ktor.client.plugins.HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getShouldRetryOnException$ktor_client_core();
        kotlin.jvm.functions.Function2<io.ktor.client.plugins.HttpRetryDelayContext, java.lang.Integer, java.lang.Long> delayMillis$ktor_client_core = ((io.ktor.client.plugins.HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getDelayMillis$ktor_client_core();
        kotlin.jvm.functions.Function2<java.lang.Long, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> delay$ktor_client_core = ((io.ktor.client.plugins.HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getDelay$ktor_client_core();
        createClientPlugin.on(io.ktor.client.plugins.api.Send.INSTANCE, new io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1(shouldRetry$ktor_client_core, shouldRetryOnException$ktor_client_core, ((io.ktor.client.plugins.HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getMaxRetries(), delayMillis$ktor_client_core, ((io.ktor.client.plugins.HttpRequestRetryConfig) createClientPlugin.getPluginConfig()).getModifyRequest(), createClientPlugin, delay$ktor_client_core, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpRequestRetry$lambda$1$shouldRetry(int i, int i2, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequest, ? super io.ktor.client.statement.HttpResponse, java.lang.Boolean> function3, io.ktor.client.call.HttpClientCall httpClientCall) {
        return i < i2 && function3.invoke(new io.ktor.client.plugins.HttpRetryShouldRetryContext(i + 1), httpClientCall.getRequest(), httpClientCall.getResponse()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HttpRequestRetry$lambda$1$shouldRetryOnException(int i, int i2, kotlin.jvm.functions.Function3<? super io.ktor.client.plugins.HttpRetryShouldRetryContext, ? super io.ktor.client.request.HttpRequestBuilder, ? super java.lang.Throwable, java.lang.Boolean> function3, io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Throwable th) {
        return i < i2 && function3.invoke(new io.ktor.client.plugins.HttpRetryShouldRetryContext(i + 1), httpRequestBuilder, th).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.client.request.HttpRequestBuilder HttpRequestRetry$lambda$1$prepareRequest(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        final io.ktor.client.request.HttpRequestBuilder takeFrom = new io.ktor.client.request.HttpRequestBuilder().takeFrom(httpRequestBuilder);
        httpRequestBuilder.getExecutionContext().invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpRequestRetryKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit HttpRequestRetry$lambda$1$prepareRequest$lambda$0;
                HttpRequestRetry$lambda$1$prepareRequest$lambda$0 = io.ktor.client.plugins.HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest$lambda$0(io.ktor.client.request.HttpRequestBuilder.this, (java.lang.Throwable) obj);
                return HttpRequestRetry$lambda$1$prepareRequest$lambda$0;
            }
        });
        return takeFrom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpRequestRetry$lambda$1$prepareRequest$lambda$0(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.Throwable th) {
        kotlinx.coroutines.Job executionContext = httpRequestBuilder.getExecutionContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(executionContext, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        kotlinx.coroutines.CompletableJob completableJob = (kotlinx.coroutines.CompletableJob) executionContext;
        if (th == null) {
            completableJob.complete();
        } else {
            completableJob.completeExceptionally(th);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void retry(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.HttpRequestRetryConfig, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        io.ktor.client.plugins.HttpRequestRetryConfig httpRequestRetryConfig = new io.ktor.client.plugins.HttpRequestRetryConfig();
        block.invoke(httpRequestRetryConfig);
        httpRequestBuilder.getAttributes().put(ShouldRetryPerRequestAttributeKey, httpRequestRetryConfig.getShouldRetry$ktor_client_core());
        httpRequestBuilder.getAttributes().put(ShouldRetryOnExceptionPerRequestAttributeKey, httpRequestRetryConfig.getShouldRetryOnException$ktor_client_core());
        httpRequestBuilder.getAttributes().put(RetryDelayPerRequestAttributeKey, httpRequestRetryConfig.getDelayMillis$ktor_client_core());
        httpRequestBuilder.getAttributes().put(MaxRetriesPerRequestAttributeKey, java.lang.Integer.valueOf(httpRequestRetryConfig.getMaxRetries()));
        httpRequestBuilder.getAttributes().put(ModifyRequestPerRequestAttributeKey, httpRequestRetryConfig.getModifyRequest());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isTimeoutException(java.lang.Throwable th) {
        java.lang.Throwable unwrapCancellationException = io.ktor.client.utils.ExceptionUtilsJvmKt.unwrapCancellationException(th);
        return (unwrapCancellationException instanceof io.ktor.client.plugins.HttpRequestTimeoutException) || (unwrapCancellationException instanceof io.ktor.client.network.sockets.ConnectTimeoutException) || (unwrapCancellationException instanceof java.net.SocketTimeoutException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object throwOnInvalidResponseBody(io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return io.ktor.client.plugins.DoubleReceivePluginKt.isSaved(httpResponse) ? io.ktor.utils.io.ByteReadChannel.DefaultImpls.awaitContent$default(httpResponse.getRawContent(), 0, continuation, 1, null) : kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
    }
}
