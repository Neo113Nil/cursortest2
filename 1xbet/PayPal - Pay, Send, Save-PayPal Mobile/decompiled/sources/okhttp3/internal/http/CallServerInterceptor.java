package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallServerInterceptor implements okhttp3.Interceptor {
    public static final okhttp3.internal.http.CallServerInterceptor INSTANCE = new okhttp3.internal.http.CallServerInterceptor();

    private CallServerInterceptor() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010b A[Catch: IOException -> 0x0204, TryCatch #1 {IOException -> 0x0204, blocks: (B:78:0x00c4, B:80:0x00cd, B:27:0x00d1, B:31:0x0102, B:33:0x010b, B:35:0x010e, B:42:0x0133, B:46:0x013f, B:49:0x014a, B:50:0x0151, B:54:0x0155, B:59:0x0164, B:60:0x01ab, B:62:0x01b9, B:69:0x01ce, B:71:0x01dd, B:72:0x0203, B:73:0x01c3, B:74:0x0190), top: B:77:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        boolean z;
        okhttp3.Response.Builder builder;
        java.io.IOException iOException;
        okhttp3.Response.Builder builder2;
        okhttp3.Response build;
        int code;
        boolean z2;
        okhttp3.Response build2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        final okhttp3.internal.connection.Exchange exchange = realInterceptorChain.getExchange();
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchange);
        okhttp3.Request request = realInterceptorChain.getRequest();
        okhttp3.RequestBody body = request.body();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z3 = false;
        boolean z4 = okhttp3.internal.http.HttpMethod.permitsRequestBody(request.method()) && body != null;
        boolean equals = kotlin.text.StringsKt.equals("upgrade", request.header(com.google.common.net.HttpHeaders.CONNECTION), true);
        try {
            exchange.writeRequestHeaders(request);
            if (z4) {
                if (kotlin.text.StringsKt.equals("100-continue", request.header(com.google.common.net.HttpHeaders.EXPECT), true)) {
                    exchange.flushRequest();
                    builder = exchange.readResponseHeaders(true);
                    try {
                        exchange.responseHeadersStart();
                        z = false;
                    } catch (java.io.IOException e) {
                        e = e;
                        z = true;
                        if (e instanceof okhttp3.internal.http2.ConnectionShutdownException) {
                        }
                    }
                } else {
                    z = true;
                    builder = null;
                }
                if (builder == null) {
                    try {
                        if (body.isDuplex()) {
                            exchange.flushRequest();
                            body.writeTo(okio.Okio.buffer(exchange.createRequestBody(request, true)));
                        } else {
                            okio.BufferedSink buffer = okio.Okio.buffer(exchange.createRequestBody(request, false));
                            body.writeTo(buffer);
                            buffer.close();
                        }
                    } catch (java.io.IOException e2) {
                        e = e2;
                        if (e instanceof okhttp3.internal.http2.ConnectionShutdownException) {
                        }
                    }
                } else {
                    try {
                        exchange.noRequestBody();
                        if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                        }
                        z = false;
                    } catch (java.io.IOException e3) {
                        e = e3;
                        z = false;
                        if (e instanceof okhttp3.internal.http2.ConnectionShutdownException) {
                            throw e;
                        }
                        if (!exchange.getHasFailure()) {
                            throw e;
                        }
                        okhttp3.Response.Builder builder3 = builder;
                        iOException = e;
                        builder2 = builder3;
                        if (builder2 == null) {
                        }
                        build = builder2.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
                        code = build.code();
                        while (true) {
                            if (code != 100) {
                                break;
                            }
                            okhttp3.Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(readResponseHeaders);
                            if (!z) {
                            }
                            build = readResponseHeaders.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
                            code = build.code();
                        }
                        exchange.responseHeadersEnd(build);
                        if (code != 101) {
                        }
                        if (z2) {
                            throw new java.net.ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                        if (z2) {
                            z3 = true;
                        }
                        if (!equals) {
                        }
                        final okhttp3.ResponseBody openResponseBody = exchange.openResponseBody(build);
                        build2 = build.newBuilder().body(openResponseBody).trailers(new okhttp3.TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor$intercept$1
                            @Override // okhttp3.TrailersSource
                            public final okhttp3.Headers peek() {
                                return okhttp3.internal.connection.Exchange.this.peekTrailers();
                            }

                            @Override // okhttp3.TrailersSource
                            public final okhttp3.Headers get() {
                                okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = openResponseBody.getGetHighResolutionOutputSizeshNQ4ISI();
                                if (getHighResolutionOutputSizeshNQ4ISI.isOpen()) {
                                    okhttp3.internal._UtilJvmKt.skipAll(getHighResolutionOutputSizeshNQ4ISI);
                                }
                                okhttp3.Headers peek = peek();
                                if (peek != null) {
                                    return peek;
                                }
                                throw new java.lang.IllegalStateException("null trailers after exhausting response body?!".toString());
                            }
                        }).build();
                        if (!kotlin.text.StringsKt.equals("close", build2.request().header(com.google.common.net.HttpHeaders.CONNECTION), true)) {
                        }
                        exchange.noNewExchangesOnConnection();
                        if (code == 204) {
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("HTTP ");
                        sb.append(code);
                        sb.append(" had non-zero Content-Length: ");
                        sb.append(build2.body().getGetHighSpeedVideoFpsRanges());
                        throw new java.net.ProtocolException(sb.toString());
                    }
                }
            } else {
                exchange.noRequestBody();
                z = true;
                builder = null;
            }
            if (body == null || !body.isDuplex()) {
                exchange.finishRequest();
            }
            builder2 = builder;
            iOException = null;
        } catch (java.io.IOException e4) {
            e = e4;
            z = true;
            builder = null;
        }
        if (builder2 == null) {
            try {
                builder2 = exchange.readResponseHeaders(false);
                kotlin.jvm.internal.Intrinsics.checkNotNull(builder2);
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (java.io.IOException e5) {
                if (iOException != null) {
                    kotlin.ExceptionsKt.addSuppressed(iOException, e5);
                    throw iOException;
                }
                throw e5;
            }
        }
        build = builder2.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
        code = build.code();
        while (true) {
            if (code != 100 && (102 > code || code >= 200)) {
                break;
            }
            okhttp3.Response.Builder readResponseHeaders2 = exchange.readResponseHeaders(false);
            kotlin.jvm.internal.Intrinsics.checkNotNull(readResponseHeaders2);
            if (!z) {
                exchange.responseHeadersStart();
            }
            build = readResponseHeaders2.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange.responseHeadersEnd(build);
        z2 = code != 101;
        if (z2 && exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
            throw new java.net.ProtocolException("Unexpected 101 code on HTTP/2 connection");
        }
        if (z2 && kotlin.text.StringsKt.equals("upgrade", okhttp3.Response.header$default(build, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null), true)) {
            z3 = true;
        }
        if (!equals && z3) {
            build2 = build.newBuilder().body(new okhttp3.internal.UnreadableResponseBody(build.body().getGetHighSpeedVideoFpsRangesFor(), build.body().getGetHighSpeedVideoFpsRanges())).socket(exchange.upgradeToSocket()).build();
        } else {
            final okhttp3.ResponseBody openResponseBody2 = exchange.openResponseBody(build);
            build2 = build.newBuilder().body(openResponseBody2).trailers(new okhttp3.TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor$intercept$1
                @Override // okhttp3.TrailersSource
                public final okhttp3.Headers peek() {
                    return okhttp3.internal.connection.Exchange.this.peekTrailers();
                }

                @Override // okhttp3.TrailersSource
                public final okhttp3.Headers get() {
                    okio.BufferedSource getHighResolutionOutputSizeshNQ4ISI = openResponseBody2.getGetHighResolutionOutputSizeshNQ4ISI();
                    if (getHighResolutionOutputSizeshNQ4ISI.isOpen()) {
                        okhttp3.internal._UtilJvmKt.skipAll(getHighResolutionOutputSizeshNQ4ISI);
                    }
                    okhttp3.Headers peek = peek();
                    if (peek != null) {
                        return peek;
                    }
                    throw new java.lang.IllegalStateException("null trailers after exhausting response body?!".toString());
                }
            }).build();
        }
        if (!kotlin.text.StringsKt.equals("close", build2.request().header(com.google.common.net.HttpHeaders.CONNECTION), true) || kotlin.text.StringsKt.equals("close", okhttp3.Response.header$default(build2, com.google.common.net.HttpHeaders.CONNECTION, null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if ((code == 204 && code != 205) || build2.body().getGetHighSpeedVideoFpsRanges() <= 0) {
            return build2;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("HTTP ");
        sb2.append(code);
        sb2.append(" had non-zero Content-Length: ");
        sb2.append(build2.body().getGetHighSpeedVideoFpsRanges());
        throw new java.net.ProtocolException(sb2.toString());
    }
}
