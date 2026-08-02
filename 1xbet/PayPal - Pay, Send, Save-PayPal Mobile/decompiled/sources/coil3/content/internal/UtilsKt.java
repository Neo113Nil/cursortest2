package coil3.content.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\tH\u0080@¢\u0006\u0002\u0010\n\u001a\u0015\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0080\u0002\u001a\f\u0010\u0015\u001a\u00020\t*\u00020\u0016H\u0000\u001a\u0010\u0010\u0017\u001a\u00020\u0005*\u00060\u0018j\u0002`\u0019H\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0010X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"append", "Lcoil3/network/NetworkHeaders$Builder;", "line", "", "abortQuietly", "", "Lcoil3/disk/DiskCache$Editor;", "readBuffer", "Lokio/Buffer;", "Lcoil3/network/NetworkResponseBody;", "(Lcoil3/network/NetworkResponseBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "CACHE_CONTROL", "CONTENT_TYPE", "HTTP_METHOD_GET", "MIME_TYPE_TEXT_PLAIN", "HTTP_RESPONSE_OK", "", "HTTP_RESPONSE_NOT_MODIFIED", "plus", "Lcoil3/network/NetworkHeaders;", "other", "requireBody", "Lcoil3/network/NetworkResponse;", "closeQuietly", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "coil-network-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UtilsKt {
    public static final java.lang.String CACHE_CONTROL = "Cache-Control";
    public static final java.lang.String CONTENT_TYPE = "Content-Type";
    public static final java.lang.String HTTP_METHOD_GET = "GET";
    public static final int HTTP_RESPONSE_NOT_MODIFIED = 304;
    public static final int HTTP_RESPONSE_OK = 200;
    public static final java.lang.String MIME_TYPE_TEXT_PLAIN = "text/plain";

    public static final coil3.network.NetworkHeaders.Builder append(coil3.network.NetworkHeaders.Builder builder, java.lang.String str) {
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
        if (indexOf$default == -1) {
            throw new java.lang.IllegalArgumentException("Unexpected header: ".concat(java.lang.String.valueOf(str)).toString());
        }
        java.lang.String substring = str.substring(0, indexOf$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(substring).toString();
        java.lang.String substring2 = str.substring(indexOf$default + 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        builder.add(obj, substring2);
        return builder;
    }

    public static final void abortQuietly(coil3.disk.DiskCache.Editor editor) {
        try {
            editor.abort();
        } catch (java.lang.Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object readBuffer(coil3.content.NetworkResponseBody networkResponseBody, kotlin.coroutines.Continuation<? super okio.Buffer> continuation) {
        coil3.content.internal.UtilsKt$readBuffer$1 utilsKt$readBuffer$1;
        int i;
        java.lang.AutoCloseable autoCloseable;
        java.lang.Throwable th;
        okio.Buffer buffer;
        if (continuation instanceof coil3.content.internal.UtilsKt$readBuffer$1) {
            utilsKt$readBuffer$1 = (coil3.content.internal.UtilsKt$readBuffer$1) continuation;
            if ((utilsKt$readBuffer$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                utilsKt$readBuffer$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = utilsKt$readBuffer$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = utilsKt$readBuffer$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coil3.content.NetworkResponseBody networkResponseBody2 = networkResponseBody;
                    try {
                        okio.Buffer buffer2 = new okio.Buffer();
                        utilsKt$readBuffer$1.getHighSpeedVideoFpsRanges = networkResponseBody2;
                        utilsKt$readBuffer$1.getHighSpeedVideoFpsRangesFor = buffer2;
                        utilsKt$readBuffer$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (networkResponseBody2.writeTo(buffer2, utilsKt$readBuffer$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        autoCloseable = networkResponseBody2;
                        buffer = buffer2;
                    } catch (java.lang.Throwable th2) {
                        autoCloseable = networkResponseBody2;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    buffer = (okio.Buffer) utilsKt$readBuffer$1.getHighSpeedVideoFpsRangesFor;
                    autoCloseable = (java.lang.AutoCloseable) utilsKt$readBuffer$1.getHighSpeedVideoFpsRanges;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, th);
                            throw th4;
                        }
                    }
                }
                kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
                return buffer;
            }
        }
        utilsKt$readBuffer$1 = new coil3.content.internal.UtilsKt$readBuffer$1(continuation);
        java.lang.Object obj2 = utilsKt$readBuffer$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = utilsKt$readBuffer$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        kotlin.jdk7.AutoCloseableKt.closeFinally(autoCloseable, null);
        return buffer;
    }

    public static final coil3.content.NetworkHeaders plus(coil3.content.NetworkHeaders networkHeaders, coil3.content.NetworkHeaders networkHeaders2) {
        coil3.network.NetworkHeaders.Builder newBuilder = networkHeaders.newBuilder();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : networkHeaders2.asMap().entrySet()) {
            newBuilder.set(entry.getKey(), entry.getValue());
        }
        return newBuilder.build();
    }

    public static final coil3.content.NetworkResponseBody requireBody(coil3.content.NetworkResponse networkResponse) {
        coil3.content.NetworkResponseBody body = networkResponse.getBody();
        if (body != null) {
            return body;
        }
        throw new java.lang.IllegalStateException("body == null".toString());
    }

    public static final void closeQuietly(java.lang.AutoCloseable autoCloseable) {
        try {
            androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9182m((java.lang.Object) autoCloseable);
        } catch (java.lang.RuntimeException e) {
            throw e;
        } catch (java.lang.Exception unused) {
        }
    }
}
