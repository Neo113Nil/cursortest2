package io.ktor.client.engine.android;

/* compiled from: AndroidClientEngine.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/engine/android/AndroidClientEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/android/AndroidEngineConfig;", com.helpshift.proactive.InAppViewConstants.CONFIG, "<init>", "(Lio/ktor/client/engine/android/AndroidEngineConfig;)V", "Lio/ktor/client/request/HttpRequestData;", "data", "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "urlString", "Ljava/net/HttpURLConnection;", "getProxyAwareConnection", "(Ljava/lang/String;)Ljava/net/HttpURLConnection;", "Lio/ktor/client/engine/android/AndroidEngineConfig;", "getConfig", "()Lio/ktor/client/engine/android/AndroidEngineConfig;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "supportedCapabilities", "Ljava/util/Set;", "getSupportedCapabilities", "()Ljava/util/Set;", "ktor-client-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidClientEngine extends io.ktor.client.engine.HttpClientEngineBase {
    private final io.ktor.client.engine.android.AndroidEngineConfig config;
    private final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> supportedCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine(io.ktor.client.engine.android.AndroidEngineConfig config) {
        super("ktor-android");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
        this.supportedCapabilities = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new io.ktor.client.engine.HttpClientEngineCapability[]{io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE, io.ktor.client.plugins.sse.SSECapability.INSTANCE});
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public io.ktor.client.engine.android.AndroidEngineConfig getConfig() {
        return this.config;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01b2 A[PHI: r1
      0x01b2: PHI (r1v11 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:19:0x01af, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object execute(io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation) {
        io.ktor.client.engine.android.AndroidClientEngine$execute$1 androidClientEngine$execute$1;
        int i;
        final io.ktor.client.request.HttpRequestData httpRequestData2;
        java.lang.Object callContext;
        final kotlin.coroutines.CoroutineContext coroutineContext;
        final io.ktor.util.date.GMTDate GMTDate$default;
        final io.ktor.http.content.OutgoingContent body;
        final java.net.HttpURLConnection proxyAwareConnection;
        io.ktor.util.date.GMTDate gMTDate;
        java.net.HttpURLConnection httpURLConnection;
        io.ktor.http.content.OutgoingContent outgoingContent;
        io.ktor.client.request.HttpRequestData httpRequestData3;
        if (continuation instanceof io.ktor.client.engine.android.AndroidClientEngine$execute$1) {
            androidClientEngine$execute$1 = (io.ktor.client.engine.android.AndroidClientEngine$execute$1) continuation;
            if ((androidClientEngine$execute$1.label & Integer.MIN_VALUE) != 0) {
                androidClientEngine$execute$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidClientEngine$execute$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidClientEngine$execute$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpRequestData2 = httpRequestData;
                    androidClientEngine$execute$1.L$0 = httpRequestData2;
                    androidClientEngine$execute$1.label = 1;
                    callContext = io.ktor.client.engine.UtilsKt.callContext(androidClientEngine$execute$1);
                    if (callContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.ResultKt.throwOnFailure(obj);
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        httpURLConnection = (java.net.HttpURLConnection) androidClientEngine$execute$1.L$4;
                        outgoingContent = (io.ktor.http.content.OutgoingContent) androidClientEngine$execute$1.L$3;
                        gMTDate = (io.ktor.util.date.GMTDate) androidClientEngine$execute$1.L$2;
                        coroutineContext = (kotlin.coroutines.CoroutineContext) androidClientEngine$execute$1.L$1;
                        httpRequestData3 = (io.ktor.client.request.HttpRequestData) androidClientEngine$execute$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        body = outgoingContent;
                        httpRequestData2 = httpRequestData3;
                        proxyAwareConnection = httpURLConnection;
                        GMTDate$default = gMTDate;
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                io.ktor.client.request.HttpResponseData execute$lambda$5;
                                execute$lambda$5 = io.ktor.client.engine.android.AndroidClientEngine.execute$lambda$5(kotlin.coroutines.CoroutineContext.this, httpRequestData2, body, GMTDate$default, (java.net.HttpURLConnection) obj2);
                                return execute$lambda$5;
                            }
                        };
                        androidClientEngine$execute$1.L$0 = null;
                        androidClientEngine$execute$1.L$1 = null;
                        androidClientEngine$execute$1.L$2 = null;
                        androidClientEngine$execute$1.L$3 = null;
                        androidClientEngine$execute$1.L$4 = null;
                        androidClientEngine$execute$1.label = 3;
                        obj = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData2, function1, androidClientEngine$execute$1);
                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                    }
                    io.ktor.client.request.HttpRequestData httpRequestData4 = (io.ktor.client.request.HttpRequestData) androidClientEngine$execute$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    callContext = obj;
                    httpRequestData2 = httpRequestData4;
                }
                coroutineContext = (kotlin.coroutines.CoroutineContext) callContext;
                GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
                java.lang.String urlString = httpRequestData2.getUrl().getUrlString();
                body = httpRequestData2.getBody();
                java.lang.String str = httpRequestData2.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                java.lang.Long boxLong = str == null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.Long.parseLong(str)) : body.getContentLength();
                proxyAwareConnection = getProxyAwareConnection(urlString);
                proxyAwareConnection.setConnectTimeout(getConfig().getConnectTimeout());
                proxyAwareConnection.setReadTimeout(getConfig().getSocketTimeout());
                io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.setupTimeoutAttributes(proxyAwareConnection, httpRequestData2);
                if (proxyAwareConnection instanceof javax.net.ssl.HttpsURLConnection) {
                    getConfig().getSslManager().invoke(proxyAwareConnection);
                }
                proxyAwareConnection.setRequestMethod(httpRequestData2.getMethod().getValue());
                proxyAwareConnection.setUseCaches(false);
                proxyAwareConnection.setInstanceFollowRedirects(false);
                final boolean z = io.ktor.http.HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod()) && io.ktor.http.content.OutgoingContentKt.isEmpty(httpRequestData2.getBody());
                io.ktor.client.engine.UtilsKt.mergeHeaders(httpRequestData2.getHeaders(), httpRequestData2.getBody(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit>() { // from class: io.ktor.client.engine.android.AndroidClientEngine$execute$lambda$1$$inlined$forEachHeader$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str2, java.lang.String str3) {
                        invoke2(str2, str3);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(java.lang.String key, java.lang.String value) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                        if (z && kotlin.jvm.internal.Intrinsics.areEqual(key, io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) {
                            return;
                        }
                        proxyAwareConnection.addRequestProperty(key, value);
                    }
                });
                getConfig().getRequestConfig().invoke(proxyAwareConnection);
                if (io.ktor.http.HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod())) {
                    if (!io.ktor.http.content.OutgoingContentKt.isEmpty(body)) {
                        throw new java.lang.IllegalStateException(("Request of type " + httpRequestData2.getMethod() + " couldn't send a body with the [Android] engine.").toString());
                    }
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            io.ktor.client.request.HttpResponseData execute$lambda$5;
                            execute$lambda$5 = io.ktor.client.engine.android.AndroidClientEngine.execute$lambda$5(kotlin.coroutines.CoroutineContext.this, httpRequestData2, body, GMTDate$default, (java.net.HttpURLConnection) obj2);
                            return execute$lambda$5;
                        }
                    };
                    androidClientEngine$execute$1.L$0 = null;
                    androidClientEngine$execute$1.L$1 = null;
                    androidClientEngine$execute$1.L$2 = null;
                    androidClientEngine$execute$1.L$3 = null;
                    androidClientEngine$execute$1.L$4 = null;
                    androidClientEngine$execute$1.label = 3;
                    obj = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData2, function12, androidClientEngine$execute$1);
                    if (obj == coroutine_suspended) {
                    }
                } else {
                    if (boxLong == null && proxyAwareConnection.getRequestProperty(io.ktor.http.HttpHeaders.INSTANCE.getTransferEncoding()) == null) {
                        proxyAwareConnection.addRequestProperty(io.ktor.http.HttpHeaders.INSTANCE.getTransferEncoding(), "chunked");
                    }
                    if (boxLong != null) {
                        proxyAwareConnection.setFixedLengthStreamingMode(boxLong.longValue());
                    } else {
                        proxyAwareConnection.setChunkedStreamingMode(0);
                    }
                    proxyAwareConnection.setDoOutput(true);
                    java.io.OutputStream outputStream = proxyAwareConnection.getOutputStream();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
                    androidClientEngine$execute$1.L$0 = httpRequestData2;
                    androidClientEngine$execute$1.L$1 = coroutineContext;
                    androidClientEngine$execute$1.L$2 = GMTDate$default;
                    androidClientEngine$execute$1.L$3 = body;
                    androidClientEngine$execute$1.L$4 = proxyAwareConnection;
                    androidClientEngine$execute$1.label = 2;
                    if (io.ktor.client.engine.android.AndroidClientEngineKt.writeTo(body, outputStream, coroutineContext, androidClientEngine$execute$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gMTDate = GMTDate$default;
                    httpURLConnection = proxyAwareConnection;
                    outgoingContent = body;
                    httpRequestData3 = httpRequestData2;
                    body = outgoingContent;
                    httpRequestData2 = httpRequestData3;
                    proxyAwareConnection = httpURLConnection;
                    GMTDate$default = gMTDate;
                    kotlin.jvm.functions.Function1 function122 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            io.ktor.client.request.HttpResponseData execute$lambda$5;
                            execute$lambda$5 = io.ktor.client.engine.android.AndroidClientEngine.execute$lambda$5(kotlin.coroutines.CoroutineContext.this, httpRequestData2, body, GMTDate$default, (java.net.HttpURLConnection) obj2);
                            return execute$lambda$5;
                        }
                    };
                    androidClientEngine$execute$1.L$0 = null;
                    androidClientEngine$execute$1.L$1 = null;
                    androidClientEngine$execute$1.L$2 = null;
                    androidClientEngine$execute$1.L$3 = null;
                    androidClientEngine$execute$1.L$4 = null;
                    androidClientEngine$execute$1.label = 3;
                    obj = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(proxyAwareConnection, httpRequestData2, function122, androidClientEngine$execute$1);
                    if (obj == coroutine_suspended) {
                    }
                }
            }
        }
        androidClientEngine$execute$1 = new io.ktor.client.engine.android.AndroidClientEngine$execute$1(this, continuation);
        java.lang.Object obj2 = androidClientEngine$execute$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidClientEngine$execute$1.label;
        if (i != 0) {
        }
        coroutineContext = (kotlin.coroutines.CoroutineContext) callContext;
        GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
        java.lang.String urlString2 = httpRequestData2.getUrl().getUrlString();
        body = httpRequestData2.getBody();
        java.lang.String str2 = httpRequestData2.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        if (str2 == null) {
        }
        proxyAwareConnection = getProxyAwareConnection(urlString2);
        proxyAwareConnection.setConnectTimeout(getConfig().getConnectTimeout());
        proxyAwareConnection.setReadTimeout(getConfig().getSocketTimeout());
        io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.setupTimeoutAttributes(proxyAwareConnection, httpRequestData2);
        if (proxyAwareConnection instanceof javax.net.ssl.HttpsURLConnection) {
        }
        proxyAwareConnection.setRequestMethod(httpRequestData2.getMethod().getValue());
        proxyAwareConnection.setUseCaches(false);
        proxyAwareConnection.setInstanceFollowRedirects(false);
        if (io.ktor.http.HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod())) {
        }
        io.ktor.client.engine.UtilsKt.mergeHeaders(httpRequestData2.getHeaders(), httpRequestData2.getBody(), new kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit>() { // from class: io.ktor.client.engine.android.AndroidClientEngine$execute$lambda$1$$inlined$forEachHeader$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str22, java.lang.String str3) {
                invoke2(str22, str3);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.String key, java.lang.String value) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                if (z && kotlin.jvm.internal.Intrinsics.areEqual(key, io.ktor.http.HttpHeaders.INSTANCE.getContentLength())) {
                    return;
                }
                proxyAwareConnection.addRequestProperty(key, value);
            }
        });
        getConfig().getRequestConfig().invoke(proxyAwareConnection);
        if (io.ktor.http.HttpMethodKt.getSupportsRequestBody(httpRequestData2.getMethod())) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.client.request.HttpResponseData execute$lambda$5(kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.client.request.HttpRequestData httpRequestData, io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.date.GMTDate gMTDate, java.net.HttpURLConnection current) {
        io.ktor.http.HttpStatusCode fromValue;
        java.lang.Object obj;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(current, "current");
        int responseCode = current.getResponseCode();
        java.lang.String responseMessage = current.getResponseMessage();
        if (responseMessage != null) {
            fromValue = new io.ktor.http.HttpStatusCode(responseCode, responseMessage);
        } else {
            fromValue = io.ktor.http.HttpStatusCode.INSTANCE.fromValue(responseCode);
        }
        io.ktor.utils.io.ByteReadChannel content = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.content(current, responseCode, coroutineContext);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = current.getHeaderFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headerFields, "getHeaderFields(...)");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(headerFields.size()));
        java.util.Iterator<T> it = headerFields.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str2 = (java.lang.String) entry.getKey();
            if (str2 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                str = str2.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                if (str != null) {
                    linkedHashMap.put(str, entry.getValue());
                }
            }
            str = "";
            linkedHashMap.put(str, entry.getValue());
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!kotlin.text.StringsKt.isBlank((java.lang.CharSequence) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        io.ktor.http.HttpProtocolVersion http_1_1 = io.ktor.http.HttpProtocolVersion.INSTANCE.getHTTP_1_1();
        io.ktor.http.HeadersImpl headersImpl = new io.ktor.http.HeadersImpl(linkedHashMap2);
        io.ktor.client.request.ResponseAdapter responseAdapter = (io.ktor.client.request.ResponseAdapter) httpRequestData.getAttributes().getOrNull(io.ktor.client.request.HttpRequestKt.getResponseAdapterAttributeKey());
        if (responseAdapter != null) {
            java.lang.Object adapt = responseAdapter.adapt(httpRequestData, fromValue, headersImpl, content, outgoingContent, coroutineContext);
            if (adapt != null) {
                obj = adapt;
                return new io.ktor.client.request.HttpResponseData(fromValue, gMTDate, headersImpl, http_1_1, obj, coroutineContext);
            }
        }
        obj = content;
        return new io.ktor.client.request.HttpResponseData(fromValue, gMTDate, headersImpl, http_1_1, obj, coroutineContext);
    }

    private final java.net.HttpURLConnection getProxyAwareConnection(java.lang.String urlString) {
        java.net.URLConnection openConnection;
        java.net.URL url = new java.net.URL(urlString);
        java.net.Proxy proxy = getConfig().getProxy();
        if (proxy == null || (openConnection = url.openConnection(proxy)) == null) {
            openConnection = url.openConnection();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openConnection, "openConnection(...)");
        }
        return (java.net.HttpURLConnection) openConnection;
    }
}
