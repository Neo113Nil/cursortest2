package io.ktor.client.engine.android;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lio/ktor/client/engine/android/AndroidClientEngine;", "Lio/ktor/client/engine/HttpClientEngineBase;", "Lio/ktor/client/engine/android/AndroidEngineConfig;", "config", "<init>", "(Lio/ktor/client/engine/android/AndroidEngineConfig;)V", "Lio/ktor/client/request/HttpRequestData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lio/ktor/client/request/HttpResponseData;", "execute", "(Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/engine/android/AndroidEngineConfig;", "getConfig", "()Lio/ktor/client/engine/android/AndroidEngineConfig;", "", "Lio/ktor/client/engine/HttpClientEngineCapability;", "supportedCapabilities", "Ljava/util/Set;", "getSupportedCapabilities", "()Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AndroidClientEngine extends io.ktor.client.engine.HttpClientEngineBase {
    private final io.ktor.client.engine.android.AndroidEngineConfig config;
    private final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> supportedCapabilities;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidClientEngine(io.ktor.client.engine.android.AndroidEngineConfig androidEngineConfig) {
        super("ktor-android");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidEngineConfig, "");
        this.config = androidEngineConfig;
        this.supportedCapabilities = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new io.ktor.client.engine.HttpClientEngineCapability[]{io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE, io.ktor.client.plugins.sse.SSECapability.INSTANCE});
    }

    @Override // io.ktor.client.engine.HttpClientEngine
    public final io.ktor.client.engine.android.AndroidEngineConfig getConfig() {
        return this.config;
    }

    @Override // io.ktor.client.engine.HttpClientEngineBase, io.ktor.client.engine.HttpClientEngine
    public final java.util.Set<io.ktor.client.engine.HttpClientEngineCapability<?>> getSupportedCapabilities() {
        return this.supportedCapabilities;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
    
        if (r4 != r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // io.ktor.client.engine.HttpClientEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object execute(io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.Continuation<? super io.ktor.client.request.HttpResponseData> continuation) {
        io.ktor.client.engine.android.AndroidClientEngine$execute$1 androidClientEngine$execute$1;
        int i;
        final io.ktor.client.request.HttpRequestData httpRequestData2;
        java.lang.Object callContext;
        final kotlin.coroutines.CoroutineContext coroutineContext;
        final io.ktor.util.date.GMTDate GMTDate$default;
        final io.ktor.http.content.OutgoingContent body;
        java.net.URL url;
        java.net.Proxy proxy;
        final java.net.HttpURLConnection httpURLConnection;
        java.util.List list;
        io.ktor.util.date.GMTDate gMTDate;
        java.net.HttpURLConnection httpURLConnection2;
        io.ktor.http.content.OutgoingContent outgoingContent;
        io.ktor.client.request.HttpRequestData httpRequestData3;
        if (continuation instanceof io.ktor.client.engine.android.AndroidClientEngine$execute$1) {
            androidClientEngine$execute$1 = (io.ktor.client.engine.android.AndroidClientEngine$execute$1) continuation;
            if ((androidClientEngine$execute$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                androidClientEngine$execute$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = androidClientEngine$execute$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidClientEngine$execute$1.getHighSpeedVideoSizesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    httpRequestData2 = httpRequestData;
                    androidClientEngine$execute$1.Camera2StreamConfigurationMap = httpRequestData2;
                    androidClientEngine$execute$1.getHighSpeedVideoSizesFor = 1;
                    callContext = io.ktor.client.engine.UtilsKt.callContext(androidClientEngine$execute$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        httpURLConnection2 = (java.net.HttpURLConnection) androidClientEngine$execute$1.getHighResolutionOutputSizeshNQ4ISI;
                        outgoingContent = (io.ktor.http.content.OutgoingContent) androidClientEngine$execute$1.getHighSpeedVideoFpsRanges;
                        gMTDate = (io.ktor.util.date.GMTDate) androidClientEngine$execute$1.getHighSpeedVideoSizes;
                        coroutineContext = (kotlin.coroutines.CoroutineContext) androidClientEngine$execute$1.getHighSpeedVideoFpsRangesFor;
                        httpRequestData3 = (io.ktor.client.request.HttpRequestData) androidClientEngine$execute$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        body = outgoingContent;
                        httpRequestData2 = httpRequestData3;
                        httpURLConnection = httpURLConnection2;
                        GMTDate$default = gMTDate;
                        kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return io.ktor.client.engine.android.AndroidClientEngine.$r8$lambda$XGvU6w_a4JBRnF8ePms01NNBvM4(kotlin.coroutines.CoroutineContext.this, httpRequestData2, body, GMTDate$default, (java.net.HttpURLConnection) obj2);
                            }
                        };
                        androidClientEngine$execute$1.Camera2StreamConfigurationMap = null;
                        androidClientEngine$execute$1.getHighSpeedVideoFpsRangesFor = null;
                        androidClientEngine$execute$1.getHighSpeedVideoSizes = null;
                        androidClientEngine$execute$1.getHighSpeedVideoFpsRanges = null;
                        androidClientEngine$execute$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        androidClientEngine$execute$1.getHighSpeedVideoSizesFor = 3;
                        java.lang.Object timeoutAwareConnection = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(httpURLConnection, httpRequestData2, function1, androidClientEngine$execute$1);
                        return timeoutAwareConnection == coroutine_suspended ? coroutine_suspended : timeoutAwareConnection;
                    }
                    io.ktor.client.request.HttpRequestData httpRequestData4 = (io.ktor.client.request.HttpRequestData) androidClientEngine$execute$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    callContext = obj;
                    httpRequestData2 = httpRequestData4;
                }
                coroutineContext = (kotlin.coroutines.CoroutineContext) callContext;
                GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
                java.lang.String obj2 = httpRequestData2.getUrl().toString();
                body = httpRequestData2.getBody();
                java.lang.String str = httpRequestData2.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
                java.lang.Long boxLong = str == null ? kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.Long.parseLong(str)) : body.getContentLength();
                url = new java.net.URL(obj2);
                proxy = getConfig().getProxy();
                if (proxy != null || (r10 = url.openConnection(proxy)) == null) {
                    java.net.URLConnection openConnection = url.openConnection();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openConnection, "");
                }
                httpURLConnection = (java.net.HttpURLConnection) openConnection;
                httpURLConnection.setConnectTimeout(getConfig().getConnectTimeout());
                httpURLConnection.setReadTimeout(getConfig().getSocketTimeout());
                io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.setupTimeoutAttributes(httpURLConnection, httpRequestData2);
                if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
                    getConfig().getSslManager().invoke(httpURLConnection);
                }
                httpURLConnection.setRequestMethod(httpRequestData2.getMethod().getValue());
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(false);
                io.ktor.client.engine.UtilsKt.mergeHeaders(httpRequestData2.getHeaders(), body, new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return io.ktor.client.engine.android.AndroidClientEngine.$r8$lambda$LwlhtYgREP1drItd6NHJaqTBje8(httpURLConnection, (java.lang.String) obj3, (java.lang.String) obj4);
                    }
                });
                getConfig().getRequestConfig().invoke(httpURLConnection);
                list = io.ktor.client.engine.android.AndroidClientEngineKt.Camera2StreamConfigurationMap;
                if (!list.contains(httpRequestData2.getMethod())) {
                    if (!io.ktor.http.content.OutgoingContentKt.isEmpty(body)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request of type ");
                        sb.append(httpRequestData2.getMethod());
                        sb.append(" couldn't send a body with the [Android] engine.");
                        throw new java.lang.IllegalStateException(sb.toString().toString());
                    }
                    kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj22) {
                            return io.ktor.client.engine.android.AndroidClientEngine.$r8$lambda$XGvU6w_a4JBRnF8ePms01NNBvM4(kotlin.coroutines.CoroutineContext.this, httpRequestData2, body, GMTDate$default, (java.net.HttpURLConnection) obj22);
                        }
                    };
                    androidClientEngine$execute$1.Camera2StreamConfigurationMap = null;
                    androidClientEngine$execute$1.getHighSpeedVideoFpsRangesFor = null;
                    androidClientEngine$execute$1.getHighSpeedVideoSizes = null;
                    androidClientEngine$execute$1.getHighSpeedVideoFpsRanges = null;
                    androidClientEngine$execute$1.getHighResolutionOutputSizeshNQ4ISI = null;
                    androidClientEngine$execute$1.getHighSpeedVideoSizesFor = 3;
                    java.lang.Object timeoutAwareConnection2 = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(httpURLConnection, httpRequestData2, function12, androidClientEngine$execute$1);
                    if (timeoutAwareConnection2 == coroutine_suspended) {
                    }
                } else {
                    if (boxLong == null && httpURLConnection.getRequestProperty(io.ktor.http.HttpHeaders.INSTANCE.getTransferEncoding()) == null) {
                        httpURLConnection.addRequestProperty(io.ktor.http.HttpHeaders.INSTANCE.getTransferEncoding(), "chunked");
                    }
                    if (boxLong != null) {
                        httpURLConnection.setFixedLengthStreamingMode(boxLong.longValue());
                    } else {
                        httpURLConnection.setChunkedStreamingMode(0);
                    }
                    httpURLConnection.setDoOutput(true);
                    java.io.OutputStream outputStream = httpURLConnection.getOutputStream();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(outputStream, "");
                    androidClientEngine$execute$1.Camera2StreamConfigurationMap = httpRequestData2;
                    androidClientEngine$execute$1.getHighSpeedVideoFpsRangesFor = coroutineContext;
                    androidClientEngine$execute$1.getHighSpeedVideoSizes = GMTDate$default;
                    androidClientEngine$execute$1.getHighSpeedVideoFpsRanges = body;
                    androidClientEngine$execute$1.getHighResolutionOutputSizeshNQ4ISI = httpURLConnection;
                    androidClientEngine$execute$1.getHighSpeedVideoSizesFor = 2;
                    if (io.ktor.client.engine.android.AndroidClientEngineKt.writeTo(body, outputStream, coroutineContext, androidClientEngine$execute$1) != coroutine_suspended) {
                        gMTDate = GMTDate$default;
                        httpURLConnection2 = httpURLConnection;
                        outgoingContent = body;
                        httpRequestData3 = httpRequestData2;
                        body = outgoingContent;
                        httpRequestData2 = httpRequestData3;
                        httpURLConnection = httpURLConnection2;
                        GMTDate$default = gMTDate;
                        kotlin.jvm.functions.Function1 function122 = new kotlin.jvm.functions.Function1() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj22) {
                                return io.ktor.client.engine.android.AndroidClientEngine.$r8$lambda$XGvU6w_a4JBRnF8ePms01NNBvM4(kotlin.coroutines.CoroutineContext.this, httpRequestData2, body, GMTDate$default, (java.net.HttpURLConnection) obj22);
                            }
                        };
                        androidClientEngine$execute$1.Camera2StreamConfigurationMap = null;
                        androidClientEngine$execute$1.getHighSpeedVideoFpsRangesFor = null;
                        androidClientEngine$execute$1.getHighSpeedVideoSizes = null;
                        androidClientEngine$execute$1.getHighSpeedVideoFpsRanges = null;
                        androidClientEngine$execute$1.getHighResolutionOutputSizeshNQ4ISI = null;
                        androidClientEngine$execute$1.getHighSpeedVideoSizesFor = 3;
                        java.lang.Object timeoutAwareConnection22 = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.timeoutAwareConnection(httpURLConnection, httpRequestData2, function122, androidClientEngine$execute$1);
                        if (timeoutAwareConnection22 == coroutine_suspended) {
                        }
                    }
                }
            }
        }
        androidClientEngine$execute$1 = new io.ktor.client.engine.android.AndroidClientEngine$execute$1(this, continuation);
        java.lang.Object obj3 = androidClientEngine$execute$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidClientEngine$execute$1.getHighSpeedVideoSizesFor;
        if (i != 0) {
        }
        coroutineContext = (kotlin.coroutines.CoroutineContext) callContext;
        GMTDate$default = io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
        java.lang.String obj22 = httpRequestData2.getUrl().toString();
        body = httpRequestData2.getBody();
        java.lang.String str2 = httpRequestData2.getHeaders().get(io.ktor.http.HttpHeaders.INSTANCE.getContentLength());
        if (str2 == null) {
        }
        url = new java.net.URL(obj22);
        proxy = getConfig().getProxy();
        if (proxy != null) {
        }
        java.net.URLConnection openConnection2 = url.openConnection();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openConnection2, "");
        httpURLConnection = (java.net.HttpURLConnection) openConnection2;
        httpURLConnection.setConnectTimeout(getConfig().getConnectTimeout());
        httpURLConnection.setReadTimeout(getConfig().getSocketTimeout());
        io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.setupTimeoutAttributes(httpURLConnection, httpRequestData2);
        if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
        }
        httpURLConnection.setRequestMethod(httpRequestData2.getMethod().getValue());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        io.ktor.client.engine.UtilsKt.mergeHeaders(httpRequestData2.getHeaders(), body, new kotlin.jvm.functions.Function2() { // from class: io.ktor.client.engine.android.AndroidClientEngine$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj32, java.lang.Object obj4) {
                return io.ktor.client.engine.android.AndroidClientEngine.$r8$lambda$LwlhtYgREP1drItd6NHJaqTBje8(httpURLConnection, (java.lang.String) obj32, (java.lang.String) obj4);
            }
        });
        getConfig().getRequestConfig().invoke(httpURLConnection);
        list = io.ktor.client.engine.android.AndroidClientEngineKt.Camera2StreamConfigurationMap;
        if (!list.contains(httpRequestData2.getMethod())) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LwlhtYgREP1drItd6NHJaqTBje8(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        httpURLConnection.addRequestProperty(str, str2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ io.ktor.client.request.HttpResponseData $r8$lambda$XGvU6w_a4JBRnF8ePms01NNBvM4(kotlin.coroutines.CoroutineContext coroutineContext, io.ktor.client.request.HttpRequestData httpRequestData, io.ktor.http.content.OutgoingContent outgoingContent, io.ktor.util.date.GMTDate gMTDate, java.net.HttpURLConnection httpURLConnection) {
        java.lang.Object obj;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpURLConnection, "");
        int responseCode = httpURLConnection.getResponseCode();
        java.lang.String responseMessage = httpURLConnection.getResponseMessage();
        io.ktor.http.HttpStatusCode httpStatusCode = responseMessage != null ? new io.ktor.http.HttpStatusCode(responseCode, responseMessage) : io.ktor.http.HttpStatusCode.INSTANCE.fromValue(responseCode);
        io.ktor.utils.io.ByteReadChannel content = io.ktor.client.engine.android.AndroidURLConnectionUtilsKt.content(httpURLConnection, responseCode, coroutineContext);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(headerFields, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(headerFields.size()));
        java.util.Iterator<T> it = headerFields.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str2 = (java.lang.String) entry.getKey();
            if (str2 != null) {
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                str = str2.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
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
            java.lang.Object adapt = responseAdapter.adapt(httpRequestData, httpStatusCode, headersImpl, content, outgoingContent, coroutineContext);
            if (adapt != null) {
                obj = adapt;
                return new io.ktor.client.request.HttpResponseData(httpStatusCode, gMTDate, headersImpl, http_1_1, obj, coroutineContext);
            }
        }
        obj = content;
        return new io.ktor.client.request.HttpResponseData(httpStatusCode, gMTDate, headersImpl, http_1_1, obj, coroutineContext);
    }
}
