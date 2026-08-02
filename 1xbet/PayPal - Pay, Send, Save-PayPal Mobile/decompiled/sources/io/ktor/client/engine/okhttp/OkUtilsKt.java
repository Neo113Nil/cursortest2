package io.ktor.client.engine.okhttp;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\f\u001a\u00020\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\f\u0010\u0010"}, d2 = {"Lokhttp3/OkHttpClient;", "Lokhttp3/Request;", "request", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lokhttp3/Response;", "execute", "(Lokhttp3/OkHttpClient;Lokhttp3/Request;Lio/ktor/client/request/HttpRequestData;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Headers;", "Lio/ktor/http/Headers;", "fromOkHttp", "(Lokhttp3/Headers;)Lio/ktor/http/Headers;", "Lokhttp3/Protocol;", "Lio/ktor/http/HttpProtocolVersion;", "(Lokhttp3/Protocol;)Lio/ktor/http/HttpProtocolVersion;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OkUtilsKt {
    public static final io.ktor.http.Headers fromOkHttp(final okhttp3.Headers headers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headers, "");
        return new io.ktor.http.Headers() { // from class: io.ktor.client.engine.okhttp.OkUtilsKt$fromOkHttp$1
            private final boolean caseInsensitiveName = true;

            @Override // io.ktor.util.StringValues
            public final boolean contains(java.lang.String str) {
                return io.ktor.http.Headers.DefaultImpls.contains(this, str);
            }

            @Override // io.ktor.util.StringValues
            public final boolean contains(java.lang.String str, java.lang.String str2) {
                return io.ktor.http.Headers.DefaultImpls.contains(this, str, str2);
            }

            @Override // io.ktor.util.StringValues
            public final void forEach(kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.util.List<java.lang.String>, kotlin.Unit> function2) {
                io.ktor.http.Headers.DefaultImpls.forEach(this, function2);
            }

            @Override // io.ktor.util.StringValues
            public final java.lang.String get(java.lang.String str) {
                return io.ktor.http.Headers.DefaultImpls.get(this, str);
            }

            @Override // io.ktor.util.StringValues
            public final boolean getCaseInsensitiveName() {
                return this.caseInsensitiveName;
            }

            @Override // io.ktor.util.StringValues
            public final java.util.List<java.lang.String> getAll(java.lang.String name2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                java.util.List<java.lang.String> values = okhttp3.Headers.this.values(name2);
                if (values.isEmpty()) {
                    return null;
                }
                return values;
            }

            @Override // io.ktor.util.StringValues
            public final java.util.Set<java.lang.String> names() {
                return okhttp3.Headers.this.names();
            }

            @Override // io.ktor.util.StringValues
            public final java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
                return okhttp3.Headers.this.toMultimap().entrySet();
            }

            @Override // io.ktor.util.StringValues
            public final boolean isEmpty() {
                return okhttp3.Headers.this.size() == 0;
            }
        };
    }

    public static final io.ktor.http.HttpProtocolVersion fromOkHttp(okhttp3.Protocol protocol) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
        switch (io.ktor.client.engine.okhttp.OkUtilsKt.WhenMappings.$EnumSwitchMapping$0[protocol.ordinal()]) {
            case 1:
                return io.ktor.http.HttpProtocolVersion.INSTANCE.getHTTP_1_0();
            case 2:
                return io.ktor.http.HttpProtocolVersion.INSTANCE.getHTTP_1_1();
            case 3:
                return io.ktor.http.HttpProtocolVersion.INSTANCE.getSPDY_3();
            case 4:
                return io.ktor.http.HttpProtocolVersion.INSTANCE.getHTTP_2_0();
            case 5:
                return io.ktor.http.HttpProtocolVersion.INSTANCE.getHTTP_2_0();
            case 6:
                return io.ktor.http.HttpProtocolVersion.INSTANCE.getQUIC();
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final java.lang.Object execute(okhttp3.OkHttpClient okHttpClient, okhttp3.Request request, io.ktor.client.request.HttpRequestData httpRequestData, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super okhttp3.Response> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final okhttp3.Call newCall = okHttpClient.newCall(request);
        kotlin.coroutines.CoroutineContext.Element element = coroutineContext.get(kotlinx.coroutines.Job.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default((kotlinx.coroutines.Job) element, true, false, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: io.ktor.client.engine.okhttp.OkUtilsKt$execute$2$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                okhttp3.Call.this.cancel();
                return kotlin.Unit.INSTANCE;
            }
        }, 2, null);
        newCall.enqueue(new io.ktor.client.engine.okhttp.OkHttpCallback(httpRequestData, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final /* synthetic */ java.lang.Throwable access$mapOkHttpException(io.ktor.client.request.HttpRequestData httpRequestData, java.io.IOException iOException) {
        java.net.SocketTimeoutException SocketTimeoutException;
        if (iOException instanceof io.ktor.client.engine.okhttp.StreamAdapterIOException) {
            java.lang.Throwable cause = iOException.getCause();
            if (cause != null) {
                return cause;
            }
        } else if (iOException instanceof java.net.SocketTimeoutException) {
            java.lang.String message = iOException.getMessage();
            if (message != null && kotlin.text.StringsKt.contains((java.lang.CharSequence) message, (java.lang.CharSequence) "connect", true)) {
                SocketTimeoutException = io.ktor.client.plugins.HttpTimeoutKt.ConnectTimeoutException(httpRequestData, iOException);
            } else {
                SocketTimeoutException = io.ktor.client.plugins.HttpTimeoutKt.SocketTimeoutException(httpRequestData, iOException);
            }
            return SocketTimeoutException;
        }
        return iOException;
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[okhttp3.Protocol.values().length];
            try {
                iArr[okhttp3.Protocol.HTTP_1_0.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[okhttp3.Protocol.HTTP_1_1.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[okhttp3.Protocol.SPDY_3.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[okhttp3.Protocol.HTTP_2.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[okhttp3.Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[okhttp3.Protocol.QUIC.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
