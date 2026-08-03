package io.ktor.client.plugins;

/* compiled from: HttpCallValidator.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u000b\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"(\u0010\u001c\u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!*`\u0010)\"-\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"2-\b\u0001\u0012\u0013\u0012\u00110#¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"*`\u0010,\"-\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"2-\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0\"*\u008a\u0001\u0010/\"B\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0-2B\b\u0001\u0012\u0013\u0012\u00110*¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0'\u0012\u0006\u0012\u0004\u0018\u00010(0-¨\u00060"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/request/HttpRequest;", "HttpRequest", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpCallValidatorConfig;", "", "Lkotlin/ExtensionFunctionType;", "block", "HttpResponseValidator", "(Lio/ktor/client/HttpClientConfig;Lkotlin/jvm/functions/Function1;)V", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpCallValidator", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpCallValidator", "()Lio/ktor/client/plugins/api/ClientPlugin;", "", "value", "getExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "setExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;Z)V", "expectSuccess", "Lio/ktor/util/AttributeKey;", "ExpectSuccessAttributeKey", "Lio/ktor/util/AttributeKey;", "getExpectSuccessAttributeKey", "()Lio/ktor/util/AttributeKey;", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", "name", com.ironsource.Ve.n, "Lkotlin/coroutines/Continuation;", "", "ResponseValidator", "", "cause", "CallExceptionHandler", "Lkotlin/Function3;", "request", "CallRequestExceptionHandler", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpCallValidatorKt {
    private static final io.ktor.util.AttributeKey<java.lang.Boolean> ExpectSuccessAttributeKey;
    private static final org.slf4j.Logger LOGGER = io.ktor.util.logging.KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final io.ktor.client.plugins.api.ClientPlugin<io.ktor.client.plugins.HttpCallValidatorConfig> HttpCallValidator = io.ktor.client.plugins.api.CreatePluginUtilsKt.createClientPlugin("HttpResponseValidator", io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.plugins.HttpCallValidatorKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            kotlin.Unit HttpCallValidator$lambda$2;
            HttpCallValidator$lambda$2 = io.ktor.client.plugins.HttpCallValidatorKt.HttpCallValidator$lambda$2((io.ktor.client.plugins.api.ClientPluginBuilder) obj);
            return HttpCallValidator$lambda$2;
        }
    });

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

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit HttpCallValidator$lambda$2(io.ktor.client.plugins.api.ClientPluginBuilder createClientPlugin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createClientPlugin, "$this$createClientPlugin");
        java.util.List reversed = kotlin.collections.CollectionsKt.reversed(((io.ktor.client.plugins.HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseValidators$ktor_client_core());
        java.util.List reversed2 = kotlin.collections.CollectionsKt.reversed(((io.ktor.client.plugins.HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getResponseExceptionHandlers$ktor_client_core());
        createClientPlugin.on(io.ktor.client.plugins.api.SetupRequest.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1(((io.ktor.client.plugins.HttpCallValidatorConfig) createClientPlugin.getPluginConfig()).getExpectSuccess(), null));
        createClientPlugin.on(io.ktor.client.plugins.api.Send.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2(reversed, null));
        createClientPlugin.on(io.ktor.client.plugins.RequestError.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$3(reversed2, null));
        createClientPlugin.on(io.ktor.client.plugins.ReceiveError.INSTANCE, new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4(reversed2, null));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object HttpCallValidator$lambda$2$validateResponse(java.util.List<? extends kotlin.jvm.functions.Function2<? super io.ktor.client.statement.HttpResponse, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>> list, io.ktor.client.statement.HttpResponse httpResponse, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 httpCallValidatorKt$HttpCallValidator$2$validateResponse$1;
        int i;
        java.util.Iterator it;
        if (continuation instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) {
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) continuation;
            if ((httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    LOGGER.trace("Validating response for request " + httpResponse.getCall().getRequest().getUrl());
                    it = list.iterator();
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1;
                    httpResponse = (io.ktor.client.statement.HttpResponse) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) it.next();
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0 = httpResponse;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1 = it;
                    httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = 1;
                    if (function2.invoke(httpResponse, httpCallValidatorKt$HttpCallValidator$2$validateResponse$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(continuation);
        java.lang.Object obj2 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        r6 = r9;
        r9 = r8;
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object HttpCallValidator$lambda$2$processException(java.util.List<? extends io.ktor.client.plugins.HandlerWrapper> list, java.lang.Throwable th, io.ktor.client.request.HttpRequest httpRequest, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 httpCallValidatorKt$HttpCallValidator$2$processException$1;
        int i;
        java.util.Iterator it;
        if (continuation instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) {
            httpCallValidatorKt$HttpCallValidator$2$processException$1 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) continuation;
            if ((httpCallValidatorKt$HttpCallValidator$2$processException$1.label & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$processException$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = httpCallValidatorKt$HttpCallValidator$2$processException$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    LOGGER.trace("Processing exception " + th + " for request " + httpRequest.getUrl());
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2;
                    io.ktor.client.request.HttpRequest httpRequest2 = (io.ktor.client.request.HttpRequest) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$1;
                    java.lang.Throwable th2 = (java.lang.Throwable) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Throwable th3 = th2;
                    httpRequest = httpRequest2;
                    th = th3;
                    if (it.hasNext()) {
                        io.ktor.client.plugins.HandlerWrapper handlerWrapper = (io.ktor.client.plugins.HandlerWrapper) it.next();
                        if (handlerWrapper instanceof io.ktor.client.plugins.ExceptionHandlerWrapper) {
                            kotlin.jvm.functions.Function2<java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> handler = ((io.ktor.client.plugins.ExceptionHandlerWrapper) handlerWrapper).getHandler();
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$0 = th;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$1 = httpRequest;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2 = it;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.label = 1;
                            if (handler.invoke(th, httpCallValidatorKt$HttpCallValidator$2$processException$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            io.ktor.client.request.HttpRequest httpRequest3 = httpRequest;
                            th2 = th;
                            httpRequest2 = httpRequest3;
                        } else {
                            if (!(handlerWrapper instanceof io.ktor.client.plugins.RequestExceptionHandlerWrapper)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            kotlin.jvm.functions.Function3<java.lang.Throwable, io.ktor.client.request.HttpRequest, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> handler2 = ((io.ktor.client.plugins.RequestExceptionHandlerWrapper) handlerWrapper).getHandler();
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$0 = th;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$1 = httpRequest;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2 = it;
                            httpCallValidatorKt$HttpCallValidator$2$processException$1.label = 2;
                            if (handler2.invoke(th, httpRequest, httpCallValidatorKt$HttpCallValidator$2$processException$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            io.ktor.client.request.HttpRequest httpRequest32 = httpRequest;
                            th2 = th;
                            httpRequest2 = httpRequest32;
                        }
                        java.lang.Throwable th32 = th2;
                        httpRequest = httpRequest2;
                        th = th32;
                        if (it.hasNext()) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        httpCallValidatorKt$HttpCallValidator$2$processException$1 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1(continuation);
        java.lang.Object obj2 = httpCallValidatorKt$HttpCallValidator$2$processException$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.client.request.HttpRequest HttpRequest(final io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
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
            public kotlin.coroutines.CoroutineContext getCoroutineContext() {
                return io.ktor.client.request.HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.client.request.HttpRequest
            public io.ktor.client.call.HttpClientCall getCall() {
                throw new java.lang.IllegalStateException("Call is not initialized".toString());
            }

            @Override // io.ktor.client.request.HttpRequest
            public io.ktor.http.HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            public io.ktor.http.Url getUrl() {
                return this.url;
            }

            @Override // io.ktor.client.request.HttpRequest
            public io.ktor.util.Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.http.HttpMessage
            public io.ktor.http.Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.request.HttpRequest
            public io.ktor.http.content.OutgoingContent getContent() {
                java.lang.Object body = io.ktor.client.request.HttpRequestBuilder.this.getBody();
                io.ktor.http.content.OutgoingContent outgoingContent = body instanceof io.ktor.http.content.OutgoingContent ? (io.ktor.http.content.OutgoingContent) body : null;
                if (outgoingContent != null) {
                    return outgoingContent;
                }
                throw new java.lang.IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + io.ktor.client.request.HttpRequestBuilder.this.getBody()).toString());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HttpResponseValidator(io.ktor.client.HttpClientConfig<?> httpClientConfig, kotlin.jvm.functions.Function1<? super io.ktor.client.plugins.HttpCallValidatorConfig, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClientConfig, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        httpClientConfig.install(HttpCallValidator, block);
    }

    public static final boolean getExpectSuccess(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        java.lang.Boolean bool = (java.lang.Boolean) httpRequestBuilder.getAttributes().getOrNull(ExpectSuccessAttributeKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final void setExpectSuccess(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestBuilder, "<this>");
        httpRequestBuilder.getAttributes().put(ExpectSuccessAttributeKey, java.lang.Boolean.valueOf(z));
    }

    public static final io.ktor.util.AttributeKey<java.lang.Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }
}
