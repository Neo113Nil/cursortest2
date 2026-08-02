package io.ktor.client.plugins;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0006\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00060\bj\u0002`\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"(\u0010\u0019\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00138G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\" \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e*L\u0010$\"#\b\u0001\u0012\t\u0012\u00070 ¢\u0006\u0002\b!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001f2#\b\u0001\u0012\t\u0012\u00070 ¢\u0006\u0002\b!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001f*L\u0010&\"#\b\u0001\u0012\t\u0012\u00070%¢\u0006\u0002\b!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001f2#\b\u0001\u0012\t\u0012\u00070%¢\u0006\u0002\b!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0\u001f*b\u0010)\".\b\u0001\u0012\t\u0012\u00070%¢\u0006\u0002\b!\u0012\t\u0012\u00070(¢\u0006\u0002\b!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0'2.\b\u0001\u0012\t\u0012\u00070%¢\u0006\u0002\b!\u0012\t\u0012\u00070(¢\u0006\u0002\b!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\"\u0012\u0006\u0012\u0004\u0018\u00010#0'"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpCallValidatorConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "HttpResponseValidator", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "getHighSpeedVideoSizes", "Lorg/slf4j/Logger;", "getHighSpeedVideoFpsRangesFor", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpCallValidator", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpCallValidator", "()Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/client/request/HttpRequestBuilder;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "setExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;Z)V", "expectSuccess", "Lio/ktor/util/AttributeKey;", "ExpectSuccessAttributeKey", "Lio/ktor/util/AttributeKey;", "getExpectSuccessAttributeKey", "()Lio/ktor/util/AttributeKey;", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "Lkotlin/coroutines/Continuation;", "", "ResponseValidator", "", "CallExceptionHandler", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequest;", "CallRequestExceptionHandler"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpCallValidatorKt {
    private static final io.ktor.util.AttributeKey<java.lang.Boolean> ExpectSuccessAttributeKey;
    private static final org.slf4j.Logger getHighSpeedVideoSizes = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpCallValidatorConfig> HttpCallValidator = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("HttpResponseValidator", io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$1.Camera2StreamConfigurationMap, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return io.ktor.client.plugins.HttpCallValidatorKt.$r8$lambda$vvnuaQOqjYzf03_jn5W7LLwjN2w((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$HttpCallValidator$lambda$2$processException(java.util.List list, java.lang.Throwable th, io.ktor.client.request.HttpRequest httpRequest, kotlin.coroutines.Continuation continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 httpCallValidatorKt$HttpCallValidator$2$processException$1;
        int i;
        java.util.Iterator it;
        if (continuation instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) {
            httpCallValidatorKt$HttpCallValidator$2$processException$1 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) continuation;
            if ((httpCallValidatorKt$HttpCallValidator$2$processException$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$processException$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$processException$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    org.slf4j.Logger logger = getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Processing exception ");
                    sb.append(th);
                    sb.append(" for request ");
                    sb.append(httpRequest.getUrl());
                    logger.trace(sb.toString());
                    it = list.iterator();
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoSizes;
                    io.ktor.client.request.HttpRequest httpRequest2 = (io.ktor.client.request.HttpRequest) httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoFpsRanges;
                    java.lang.Throwable th2 = (java.lang.Throwable) httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpRequest = httpRequest2;
                    th = th2;
                }
                while (it.hasNext()) {
                    io.ktor.client.plugins.HandlerWrapper handlerWrapper = (io.ktor.client.plugins.HandlerWrapper) it.next();
                    if (handlerWrapper instanceof io.ktor.client.plugins.ExceptionHandlerWrapper) {
                        kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> handler = ((io.ktor.client.plugins.ExceptionHandlerWrapper) handlerWrapper).getHandler();
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighResolutionOutputSizeshNQ4ISI = th;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoFpsRanges = httpRequest;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoSizes = it;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.Camera2StreamConfigurationMap = 1;
                        if (handler.invoke(th, httpCallValidatorKt$HttpCallValidator$2$processException$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (!(handlerWrapper instanceof io.ktor.client.plugins.RequestExceptionHandlerWrapper)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        kotlin.jvm.functions.Function3<java.lang.Throwable, io.ktor.client.request.HttpRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> handler2 = ((io.ktor.client.plugins.RequestExceptionHandlerWrapper) handlerWrapper).getHandler();
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighResolutionOutputSizeshNQ4ISI = th;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoFpsRanges = httpRequest;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoSizes = it;
                        httpCallValidatorKt$HttpCallValidator$2$processException$1.Camera2StreamConfigurationMap = 2;
                        if (handler2.invoke(th, httpRequest, httpCallValidatorKt$HttpCallValidator$2$processException$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$processException$1 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1(continuation);
        java.lang.Object obj2 = httpCallValidatorKt$HttpCallValidator$2$processException$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$processException$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$HttpCallValidator$lambda$2$validateResponse(java.util.List list, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 httpCallValidatorKt$HttpCallValidator$2$validateResponse$1;
        int i;
        java.util.Iterator it;
        if (continuation instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) {
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) continuation;
            if ((httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    org.slf4j.Logger logger = getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Validating response for request ");
                    sb.append(httpResponse.getCall().getRequest().getUrl());
                    logger.trace(sb.toString());
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.Camera2StreamConfigurationMap;
                    httpResponse = (io.ktor.client.statement.HttpResponse) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) it.next();
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighSpeedVideoSizes = httpResponse;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.Camera2StreamConfigurationMap = it;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (function2.invoke(httpResponse, httpCallValidatorKt$HttpCallValidator$2$validateResponse$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(continuation);
        java.lang.Object obj2 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    static {
        kotlin.reflect.KType kType;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            kType = null;
        }
        ExpectSuccessAttributeKey = new io.ktor.util.AttributeKey<>("ExpectSuccessAttributeKey", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpCallValidatorConfig> getHttpCallValidator() {
        return HttpCallValidator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HttpResponseValidator(io.ktor.client.HttpClientConfig<?> httpClientConfig, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.HttpCallValidatorConfig, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        httpClientConfig.install(HttpCallValidator, function1);
    }

    public static final boolean getExpectSuccess(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        java.lang.Boolean bool = (java.lang.Boolean) httpRequestBuilder.getAttributes().getOrNull(ExpectSuccessAttributeKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final void setExpectSuccess(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "");
        httpRequestBuilder.getAttributes().put(ExpectSuccessAttributeKey, java.lang.Boolean.valueOf(z));
    }

    public static final io.ktor.util.AttributeKey<java.lang.Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vvnuaQOqjYzf03_jn5W7LLwjN2w(io.ktor.client.plugins.api.ClientPluginBuilder clientPluginBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientPluginBuilder, "");
        java.util.List reversed = kotlin.collections.CollectionsKt.reversed(((io.ktor.client.plugins.HttpCallValidatorConfig) clientPluginBuilder.getPluginConfig()).getResponseValidators$ktor_client_core());
        java.util.List reversed2 = kotlin.collections.CollectionsKt.reversed(((io.ktor.client.plugins.HttpCallValidatorConfig) clientPluginBuilder.getPluginConfig()).getResponseExceptionHandlers$ktor_client_core());
        clientPluginBuilder.on(io.ktor.client.plugins.api.SetupRequest.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1(((io.ktor.client.plugins.HttpCallValidatorConfig) clientPluginBuilder.getPluginConfig()).getExpectSuccess(), null));
        clientPluginBuilder.on(io.ktor.client.plugins.api.Send.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2(reversed, null));
        clientPluginBuilder.on(io.ktor.client.plugins.RequestError.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3(reversed2, null));
        clientPluginBuilder.on(io.ktor.client.plugins.ReceiveError.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4(reversed2, null));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ io.ktor.client.request.HttpRequest access$HttpRequest(final io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        return new io.ktor.client.request.HttpRequest() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$HttpRequest$1
            private final io.ktor.util.Attributes attributes;
            private final io.ktor.http.Headers headers;
            private final io.ktor.http.HttpMethod method;
            private final io.ktor.http.Url url;

            {
                this.method = io.ktor.client.request.HttpRequestBuilder.this.getMethod();
                this.url = io.ktor.client.request.HttpRequestBuilder.this.getUrl().build();
                this.attributes = io.ktor.client.request.HttpRequestBuilder.this.getAttributes();
                this.headers = io.ktor.client.request.HttpRequestBuilder.this.getHeaders().build();
            }

            @Override // io.ktor.client.request.HttpRequest, kotlinx.coroutines.CoroutineScope
            public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
                return io.ktor.client.request.HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.client.request.HttpRequest
            public final io.ktor.client.call.HttpClientCall getCall() {
                throw new java.lang.IllegalStateException("Call is not initialized".toString());
            }

            @Override // io.ktor.client.request.HttpRequest
            public final io.ktor.http.HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            public final io.ktor.http.Url getUrl() {
                return this.url;
            }

            @Override // io.ktor.client.request.HttpRequest
            public final io.ktor.util.Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.http.HttpMessage
            public final io.ktor.http.Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.request.HttpRequest
            public final io.ktor.http.content.OutgoingContent getContent() {
                java.lang.Object body = io.ktor.client.request.HttpRequestBuilder.this.getBody();
                io.ktor.http.content.OutgoingContent outgoingContent = body instanceof io.ktor.http.content.OutgoingContent ? (io.ktor.http.content.OutgoingContent) body : null;
                if (outgoingContent != null) {
                    return outgoingContent;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Content was not transformed to OutgoingContent yet. Current body is ");
                sb.append(io.ktor.client.request.HttpRequestBuilder.this.getBody());
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
        };
    }
}
