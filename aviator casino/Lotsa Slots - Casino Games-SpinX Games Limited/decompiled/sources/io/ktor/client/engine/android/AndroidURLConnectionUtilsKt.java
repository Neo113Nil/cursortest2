package io.ktor.client.engine.android;

/* compiled from: AndroidURLConnectionUtils.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a6\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljava/net/HttpURLConnection;", "Lio/ktor/client/request/HttpRequestData;", "requestData", "", "setupTimeoutAttributes", "(Ljava/net/HttpURLConnection;Lio/ktor/client/request/HttpRequestData;)V", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "timeoutAttributes", "setupRequestTimeoutAttributes", "(Ljava/net/HttpURLConnection;Lio/ktor/client/plugins/HttpTimeoutConfig;)V", "T", "request", "Lkotlin/Function1;", "block", "timeoutAwareConnection", "(Ljava/net/HttpURLConnection;Lio/ktor/client/request/HttpRequestData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "status", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lio/ktor/utils/io/ByteReadChannel;", "content", "(Ljava/net/HttpURLConnection;ILkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "", "", "isTimeoutException", "(Ljava/lang/Throwable;)Z", "ktor-client-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidURLConnectionUtilsKt {
    public static final void setupTimeoutAttributes(java.net.HttpURLConnection httpURLConnection, io.ktor.client.request.HttpRequestData requestData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestData, "requestData");
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) requestData.getCapabilityOrNull(io.ktor.client.plugins.HttpTimeoutCapability.INSTANCE);
        if (httpTimeoutConfig != null) {
            java.lang.Long l = httpTimeoutConfig.get_connectTimeoutMillis();
            if (l != null) {
                httpURLConnection.setConnectTimeout(io.ktor.client.plugins.HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(l.longValue()));
            }
            java.lang.Long l2 = httpTimeoutConfig.get_socketTimeoutMillis();
            if (l2 != null) {
                httpURLConnection.setReadTimeout(io.ktor.client.plugins.HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(l2.longValue()));
            }
            setupRequestTimeoutAttributes(httpURLConnection, httpTimeoutConfig);
        }
    }

    private static final void setupRequestTimeoutAttributes(java.net.HttpURLConnection httpURLConnection, io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig) {
        java.lang.Long l = httpTimeoutConfig.get_requestTimeoutMillis();
        if (l != null) {
            long longValue = l.longValue();
            if (longValue != Long.MAX_VALUE) {
                if (httpURLConnection.getConnectTimeout() == 0 || httpURLConnection.getConnectTimeout() > longValue) {
                    httpURLConnection.setConnectTimeout(io.ktor.client.plugins.HttpTimeoutKt.convertLongTimeoutToIntWithInfiniteAsZero(longValue));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object timeoutAwareConnection(java.net.HttpURLConnection httpURLConnection, io.ktor.client.request.HttpRequestData httpRequestData, kotlin.jvm.functions.Function1<? super java.net.HttpURLConnection, ? extends T> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1 androidURLConnectionUtilsKt$timeoutAwareConnection$1;
        int i;
        if (continuation instanceof io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1) {
            androidURLConnectionUtilsKt$timeoutAwareConnection$1 = (io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1) continuation;
            if ((androidURLConnectionUtilsKt$timeoutAwareConnection$1.label & Integer.MIN_VALUE) != 0) {
                androidURLConnectionUtilsKt$timeoutAwareConnection$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = androidURLConnectionUtilsKt$timeoutAwareConnection$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidURLConnectionUtilsKt$timeoutAwareConnection$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        return function1.invoke(httpURLConnection);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$0 = httpRequestData;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$1 = th;
                        androidURLConnectionUtilsKt$timeoutAwareConnection$1.label = 1;
                        if (kotlinx.coroutines.YieldKt.yield(androidURLConnectionUtilsKt$timeoutAwareConnection$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th = (java.lang.Throwable) androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$1;
                    httpRequestData = (io.ktor.client.request.HttpRequestData) androidURLConnectionUtilsKt$timeoutAwareConnection$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!isTimeoutException(th)) {
                    throw io.ktor.client.plugins.HttpTimeoutKt.ConnectTimeoutException(httpRequestData, th);
                }
                throw th;
            }
        }
        androidURLConnectionUtilsKt$timeoutAwareConnection$1 = new io.ktor.client.engine.android.AndroidURLConnectionUtilsKt$timeoutAwareConnection$1(continuation);
        java.lang.Object obj2 = androidURLConnectionUtilsKt$timeoutAwareConnection$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidURLConnectionUtilsKt$timeoutAwareConnection$1.label;
        if (i != 0) {
        }
        if (!isTimeoutException(th)) {
        }
    }

    public static final io.ktor.utils.io.ByteReadChannel content(java.net.HttpURLConnection httpURLConnection, int i, kotlin.coroutines.CoroutineContext callContext) {
        io.ktor.utils.io.ByteReadChannel byteReadChannel;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpURLConnection, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callContext, "callContext");
        if (kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{java.lang.Integer.valueOf(io.ktor.http.HttpStatusCode.INSTANCE.getNotModified().getValue()), java.lang.Integer.valueOf(io.ktor.http.HttpStatusCode.INSTANCE.getNoContent().getValue())}).contains(java.lang.Integer.valueOf(i))) {
            return io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty();
        }
        try {
            java.io.InputStream inputStream = httpURLConnection.getInputStream();
            r0 = inputStream != null ? inputStream instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) inputStream : new java.io.BufferedInputStream(inputStream, 8192) : null;
        } catch (java.io.IOException unused) {
            java.io.InputStream errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                r0 = errorStream instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) errorStream : new java.io.BufferedInputStream(errorStream, 8192);
            }
        }
        return (r0 == null || (byteReadChannel = io.ktor.utils.io.jvm.javaio.ReadingKt.toByteReadChannel(r0, callContext, io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool())) == null) ? io.ktor.utils.io.ByteReadChannel.INSTANCE.getEmpty() : byteReadChannel;
    }

    private static final boolean isTimeoutException(java.lang.Throwable th) {
        java.lang.String message;
        return (th instanceof java.net.SocketTimeoutException) || ((th instanceof java.net.ConnectException) && (message = th.getMessage()) != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "timed out", false, 2, (java.lang.Object) null));
    }
}
