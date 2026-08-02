package okhttp3.internal.http;

import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TrailersSource;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.E;
import okio.InterfaceC1192g;
import okio.z;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "<init>", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "exchange", "Lokhttp3/internal/connection/Exchange;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    private final boolean shouldIgnoreAndWaitForRealResponse(int code, Exchange exchange) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0155, code lost:
    
        if (r0 != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4 A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:62:0x00a9, B:64:0x00b2, B:23:0x00ba, B:24:0x00de, B:26:0x00e4, B:28:0x00ed, B:30:0x00f0, B:33:0x0115, B:37:0x0120, B:38:0x013e, B:40:0x014c, B:48:0x0162, B:50:0x0171, B:51:0x0197, B:59:0x0157, B:60:0x0125), top: B:61:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c A[Catch: IOException -> 0x00b7, TryCatch #1 {IOException -> 0x00b7, blocks: (B:62:0x00a9, B:64:0x00b2, B:23:0x00ba, B:24:0x00de, B:26:0x00e4, B:28:0x00ed, B:30:0x00f0, B:33:0x0115, B:37:0x0120, B:38:0x013e, B:40:0x014c, B:48:0x0162, B:50:0x0171, B:51:0x0197, B:59:0x0157, B:60:0x0125), top: B:61:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response.Builder builder;
        Response build;
        int code;
        Response build2;
        boolean equals;
        boolean equals2;
        boolean equals3;
        boolean z;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        final Exchange exchange = realInterceptorChain.getExchange();
        Intrinsics.checkNotNull(exchange);
        Request request = realInterceptorChain.getRequest();
        RequestBody body = request.body();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = true;
        try {
            exchange.writeRequestHeaders(request);
            if (!HttpMethod.permitsRequestBody(request.method()) || body == null) {
                exchange.noRequestBody();
                builder = null;
            } else {
                equals3 = StringsKt__StringsJVMKt.equals("100-continue", request.header("Expect"), true);
                if (equals3) {
                    exchange.flushRequest();
                    builder = exchange.readResponseHeaders(true);
                    try {
                        exchange.responseHeadersStart();
                        z = false;
                    } catch (IOException e) {
                        e = e;
                        if (!(e instanceof ConnectionShutdownException)) {
                            throw e;
                        }
                        if (!exchange.getHasFailure()) {
                            throw e;
                        }
                        if (builder == null) {
                        }
                        build = builder.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                        code = build.code();
                        while (shouldIgnoreAndWaitForRealResponse(code, exchange)) {
                        }
                        exchange.responseHeadersEnd(build);
                        if (this.forWebSocket) {
                        }
                        final ResponseBody openResponseBody = exchange.openResponseBody(build);
                        build2 = build.newBuilder().body(openResponseBody).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor$intercept$1
                            @Override // okhttp3.TrailersSource
                            public Headers get() {
                                InterfaceC1192g source = openResponseBody.getSource();
                                if (source.isOpen()) {
                                    _UtilJvmKt.skipAll(source);
                                }
                                Headers peek = peek();
                                if (peek != null) {
                                    return peek;
                                }
                                throw new IllegalStateException("null trailers after exhausting response body?!");
                            }

                            @Override // okhttp3.TrailersSource
                            public Headers peek() {
                                return Exchange.this.peekTrailers();
                            }
                        }).build();
                        equals = StringsKt__StringsJVMKt.equals("close", build2.request().header(RtspHeaders.CONNECTION), true);
                        if (!equals) {
                        }
                        exchange.noNewExchangesOnConnection();
                        if (code == 204) {
                        }
                        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().getContentLength());
                    }
                } else {
                    z = true;
                    builder = null;
                }
                try {
                    if (builder != null) {
                        exchange.noRequestBody();
                        if (!exchange.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                        }
                    } else if (body.isDuplex()) {
                        exchange.flushRequest();
                        body.writeTo(z.a(exchange.createRequestBody(request, true)));
                    } else {
                        E a = z.a(exchange.createRequestBody(request, false));
                        body.writeTo(a);
                        a.close();
                    }
                    z2 = z;
                } catch (IOException e2) {
                    e = e2;
                    z2 = z;
                    if (!(e instanceof ConnectionShutdownException)) {
                    }
                }
            }
            if (body == null || !body.isDuplex()) {
                exchange.finishRequest();
            }
            e = null;
        } catch (IOException e3) {
            e = e3;
            builder = null;
        }
        if (builder == null) {
            try {
                builder = exchange.readResponseHeaders(false);
                Intrinsics.checkNotNull(builder);
                if (z2) {
                    exchange.responseHeadersStart();
                    z2 = false;
                }
            } catch (IOException e4) {
                if (e == null) {
                    throw e4;
                }
                ExceptionsKt.addSuppressed(e, e4);
                throw e;
            }
        }
        build = builder.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        code = build.code();
        while (shouldIgnoreAndWaitForRealResponse(code, exchange)) {
            Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
            Intrinsics.checkNotNull(readResponseHeaders);
            if (z2) {
                exchange.responseHeadersStart();
            }
            build = readResponseHeaders.request(request).handshake(exchange.getConnection$okhttp().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange.responseHeadersEnd(build);
        if (this.forWebSocket || code != 101) {
            final ResponseBody openResponseBody2 = exchange.openResponseBody(build);
            build2 = build.newBuilder().body(openResponseBody2).trailers(new TrailersSource() { // from class: okhttp3.internal.http.CallServerInterceptor$intercept$1
                @Override // okhttp3.TrailersSource
                public Headers get() {
                    InterfaceC1192g source = openResponseBody2.getSource();
                    if (source.isOpen()) {
                        _UtilJvmKt.skipAll(source);
                    }
                    Headers peek = peek();
                    if (peek != null) {
                        return peek;
                    }
                    throw new IllegalStateException("null trailers after exhausting response body?!");
                }

                @Override // okhttp3.TrailersSource
                public Headers peek() {
                    return Exchange.this.peekTrailers();
                }
            }).build();
        } else {
            build2 = UnreadableResponseBodyKt.stripBody(build);
        }
        equals = StringsKt__StringsJVMKt.equals("close", build2.request().header(RtspHeaders.CONNECTION), true);
        if (!equals) {
            equals2 = StringsKt__StringsJVMKt.equals("close", Response.header$default(build2, RtspHeaders.CONNECTION, null, 2, null), true);
        }
        exchange.noNewExchangesOnConnection();
        if ((code == 204 && code != 205) || build2.body().getContentLength() <= 0) {
            return build2;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().getContentLength());
    }
}
