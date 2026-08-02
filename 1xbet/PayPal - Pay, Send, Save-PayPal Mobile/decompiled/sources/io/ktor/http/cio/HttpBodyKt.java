package io.ktor.http.cio;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b\u001a;\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000b\u001aF\u0010\u0019\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001a\u001a<\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0087@¢\u0006\u0004\b\u0019\u0010\u001b\u001a(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!"}, d2 = {"Lio/ktor/http/HttpMethod;", "method", "", "upgrade", "Lio/ktor/http/cio/ConnectionOptions;", "connectionOptions", "", "expectHttpUpgrade", "(Lio/ktor/http/HttpMethod;Ljava/lang/CharSequence;Lio/ktor/http/cio/ConnectionOptions;)Z", "Lio/ktor/http/cio/Request;", "request", "(Lio/ktor/http/cio/Request;)Z", "", "contentLength", "transferEncoding", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "expectHttpBody", "(Lio/ktor/http/HttpMethod;JLjava/lang/CharSequence;Lio/ktor/http/cio/ConnectionOptions;Ljava/lang/CharSequence;)Z", "Lio/ktor/http/HttpProtocolVersion;", "version", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "out", "", "parseHttpBody", "(Lio/ktor/http/HttpProtocolVersion;JLjava/lang/CharSequence;Lio/ktor/http/cio/ConnectionOptions;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(JLjava/lang/CharSequence;Lio/ktor/http/cio/ConnectionOptions;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "(Lio/ktor/http/cio/HttpHeadersMap;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/CharSequence;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HttpBodyKt {
    public static final boolean expectHttpUpgrade(io.ktor.http.HttpMethod httpMethod, java.lang.CharSequence charSequence, io.ktor.http.cio.ConnectionOptions connectionOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(httpMethod, io.ktor.http.HttpMethod.INSTANCE.getGet()) && charSequence != null && connectionOptions != null && connectionOptions.getUpgrade();
    }

    public static final boolean expectHttpUpgrade(io.ktor.http.cio.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return expectHttpUpgrade(request.getMethod(), request.getHeaders().get(com.google.common.net.HttpHeaders.UPGRADE), io.ktor.http.cio.ConnectionOptions.INSTANCE.parse(request.getHeaders().get(com.google.common.net.HttpHeaders.CONNECTION)));
    }

    public static final boolean expectHttpBody(io.ktor.http.HttpMethod httpMethod, long j, java.lang.CharSequence charSequence, io.ktor.http.cio.ConnectionOptions connectionOptions, java.lang.CharSequence charSequence2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpMethod, "");
        if (charSequence == null) {
            return j != -1 ? j > 0 : (kotlin.jvm.internal.Intrinsics.areEqual(httpMethod, io.ktor.http.HttpMethod.INSTANCE.getGet()) || kotlin.jvm.internal.Intrinsics.areEqual(httpMethod, io.ktor.http.HttpMethod.INSTANCE.getHead()) || kotlin.jvm.internal.Intrinsics.areEqual(httpMethod, io.ktor.http.HttpMethod.INSTANCE.getOptions()) || connectionOptions == null || !connectionOptions.getClose()) ? false : true;
        }
        getHighSpeedVideoFpsRangesFor(charSequence);
        return true;
    }

    public static final boolean expectHttpBody(io.ktor.http.cio.Request request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        io.ktor.http.HttpMethod method = request.getMethod();
        java.lang.CharSequence charSequence = request.getHeaders().get("Content-Length");
        return expectHttpBody(method, charSequence != null ? io.ktor.http.cio.internals.CharsKt.parseDecLong(charSequence) : -1L, request.getHeaders().get(com.google.common.net.HttpHeaders.TRANSFER_ENCODING), io.ktor.http.cio.ConnectionOptions.INSTANCE.parse(request.getHeaders().get(com.google.common.net.HttpHeaders.CONNECTION)), request.getHeaders().get("Content-Type"));
    }

    public static final java.lang.Object parseHttpBody(io.ktor.http.HttpProtocolVersion httpProtocolVersion, long j, java.lang.CharSequence charSequence, io.ktor.http.cio.ConnectionOptions connectionOptions, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (charSequence != null && getHighSpeedVideoFpsRangesFor(charSequence)) {
            java.lang.Object decodeChunked = io.ktor.http.cio.ChunkedTransferEncodingKt.decodeChunked(byteReadChannel, byteWriteChannel, continuation);
            return decodeChunked == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? decodeChunked : kotlin.Unit.INSTANCE;
        }
        if (j != -1) {
            java.lang.Object copyTo = io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(byteReadChannel, byteWriteChannel, j, continuation);
            return copyTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? copyTo : kotlin.Unit.INSTANCE;
        }
        if ((connectionOptions != null && connectionOptions.getClose()) || (connectionOptions == null && kotlin.jvm.internal.Intrinsics.areEqual(httpProtocolVersion, io.ktor.http.HttpProtocolVersion.INSTANCE.getHTTP_1_0()))) {
            java.lang.Object copyTo2 = io.ktor.utils.io.ByteReadChannelOperationsKt.copyTo(byteReadChannel, byteWriteChannel, Long.MAX_VALUE, continuation);
            return copyTo2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? copyTo2 : kotlin.Unit.INSTANCE;
        }
        io.ktor.utils.io.ByteWriteChannelOperationsKt.close(byteWriteChannel, new java.lang.IllegalStateException("Failed to parse request body: request body length should be specified,\nchunked transfer encoding should be used or\nkeep-alive should be disabled (connection: close)"));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Please use method with version parameter")
    public static final java.lang.Object parseHttpBody(long j, java.lang.CharSequence charSequence, io.ktor.http.cio.ConnectionOptions connectionOptions, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object parseHttpBody = parseHttpBody(null, j, charSequence, connectionOptions, byteReadChannel, byteWriteChannel, continuation);
        return parseHttpBody == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? parseHttpBody : kotlin.Unit.INSTANCE;
    }

    public static final java.lang.Object parseHttpBody(io.ktor.http.cio.HttpHeadersMap httpHeadersMap, io.ktor.utils.io.ByteReadChannel byteReadChannel, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.CharSequence charSequence = httpHeadersMap.get("Content-Length");
        java.lang.Object parseHttpBody = parseHttpBody(null, charSequence != null ? io.ktor.http.cio.internals.CharsKt.parseDecLong(charSequence) : -1L, httpHeadersMap.get(com.google.common.net.HttpHeaders.TRANSFER_ENCODING), io.ktor.http.cio.ConnectionOptions.INSTANCE.parse(httpHeadersMap.get(com.google.common.net.HttpHeaders.CONNECTION)), byteReadChannel, byteWriteChannel, continuation);
        return parseHttpBody == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? parseHttpBody : kotlin.Unit.INSTANCE;
    }

    private static final boolean getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence) {
        if (io.ktor.http.cio.internals.CharsKt.equalsLowerCase$default(charSequence, 0, 0, "chunked", 3, null)) {
            return true;
        }
        boolean z = false;
        if (io.ktor.http.cio.internals.CharsKt.equalsLowerCase$default(charSequence, 0, 0, "identity", 3, null)) {
            return false;
        }
        java.util.Iterator it = kotlin.text.StringsKt.split$default(charSequence, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null).iterator();
        while (it.hasNext()) {
            java.lang.String lowerCase = kotlin.text.StringsKt.trim((java.lang.String) it.next()).toString().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "chunked")) {
                if (z) {
                    throw new java.lang.IllegalArgumentException("Double-chunked TE is not supported: ".concat(java.lang.String.valueOf(charSequence)));
                }
                z = true;
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(lowerCase, "identity")) {
                throw new java.lang.IllegalArgumentException("Unsupported transfer encoding ".concat(java.lang.String.valueOf(lowerCase)));
            }
        }
        return z;
    }
}
