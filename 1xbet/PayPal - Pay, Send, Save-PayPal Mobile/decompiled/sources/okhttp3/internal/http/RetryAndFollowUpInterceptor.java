package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "p0", "Lokhttp3/internal/connection/Exchange;", "p1", "Lokhttp3/Request;", "getHighSpeedVideoFpsRangesFor", "(Lokhttp3/Response;Lokhttp3/internal/connection/Exchange;)Lokhttp3/Request;", "", "getHighSpeedVideoFpsRanges", "(Lokhttp3/Response;I)I", "Lokhttp3/OkHttpClient;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final okhttp3.OkHttpClient getHighSpeedVideoFpsRangesFor;

    public RetryAndFollowUpInterceptor(okhttp3.OkHttpClient okHttpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(okHttpClient, "");
        this.getHighSpeedVideoFpsRangesFor = okHttpClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r0 = r13.proceed(r0).newBuilder().request(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r5 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        r5 = okhttp3.internal.UnreadableResponseBodyKt.stripBody(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r5 = r0.priorResponse(r5).build();
        r0 = r1.getInterceptorScopedExchange();
        r8 = getHighSpeedVideoFpsRangesFor(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r8 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        r0 = r8.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r0.isOneShot() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r1.getEventListener().followUpDecision(r1, r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        okhttp3.internal._UtilCommonKt.closeQuietly(r5.body());
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r6 > 20) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        r1.getEventListener().followUpDecision(r1, r5, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        r1.getEventListener().followUpDecision(r1, r5, null);
        r0 = new java.lang.StringBuilder();
        r0.append("Too many follow-up requests: ");
        r0.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        throw new java.net.ProtocolException(r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        if (r0.getIsDuplex() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0050, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0053, code lost:
    
        r1.getEventListener().followUpDecision(r1, r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005d, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0061, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        throw r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0035, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fe, code lost:
    
        if ((r8 instanceof javax.net.ssl.SSLPeerUnverifiedException) != false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:5:0x001c, B:8:0x0022, B:11:0x0026, B:13:0x0030, B:14:0x0036, B:35:0x004a, B:37:0x0050, B:17:0x0064, B:19:0x006a, B:26:0x007e, B:28:0x008c, B:31:0x009c, B:32:0x00bc, B:86:0x0128, B:87:0x012f, B:46:0x00be, B:49:0x0109, B:51:0x0115, B:54:0x0121, B:55:0x0127, B:57:0x00cc, B:59:0x00d2, B:61:0x00d8, B:64:0x00dd, B:68:0x00e4, B:70:0x00e8, B:74:0x0101, B:78:0x00ef, B:80:0x00f3, B:83:0x00fc), top: B:4:0x001c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121 A[SYNTHETIC] */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        boolean z;
        okhttp3.RequestBody body;
        okhttp3.Request highSpeedVideoFpsRangesFor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        okhttp3.Request request = realInterceptorChain.getRequest();
        okhttp3.internal.connection.RealCall call = realInterceptorChain.getCall();
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        boolean z2 = false;
        int i = 0;
        okhttp3.Response response = null;
        while (true) {
            boolean z3 = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z3, realInterceptorChain);
                try {
                    if (call.getCanceled()) {
                        throw new java.io.IOException("Canceled");
                    }
                    try {
                        break;
                    } catch (java.io.IOException e) {
                        boolean z4 = e instanceof okhttp3.internal.http2.ConnectionShutdownException;
                        if (this.getHighSpeedVideoFpsRangesFor.retryOnConnectionFailure() && (z4 || (((body = request.body()) == null || !body.isOneShot()) && !(e instanceof java.io.FileNotFoundException)))) {
                            boolean z5 = !z4;
                            if (!(e instanceof java.net.ProtocolException)) {
                                if (e instanceof java.io.InterruptedIOException) {
                                    if (e instanceof java.net.SocketTimeoutException) {
                                        if (z5) {
                                        }
                                        if (call.retryAfterFailure()) {
                                            z = true;
                                            call.getEventListener().retryDecision(call, e, z);
                                            if (z) {
                                                throw okhttp3.internal._UtilCommonKt.withSuppressed(e, emptyList);
                                            }
                                            emptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.io.IOException>) emptyList, e);
                                            call.exitNetworkInterceptorExchange$okhttp(true);
                                            z3 = false;
                                        }
                                    }
                                } else if (e instanceof javax.net.ssl.SSLHandshakeException) {
                                    if (e.getCause() instanceof java.security.cert.CertificateException) {
                                    }
                                }
                            }
                        }
                        z = false;
                        call.getEventListener().retryDecision(call, e, z);
                        if (z) {
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    z2 = true;
                }
            }
            call.exitNetworkInterceptorExchange$okhttp(true);
            request = highSpeedVideoFpsRangesFor;
        }
    }

    private final okhttp3.Request getHighSpeedVideoFpsRangesFor(okhttp3.Response p0, okhttp3.internal.connection.Exchange p1) throws java.io.IOException {
        java.lang.String header$default;
        okhttp3.HttpUrl resolve;
        okhttp3.internal.connection.RealConnection connection$okhttp;
        okhttp3.Route route = (p1 == null || (connection$okhttp = p1.getConnection$okhttp()) == null) ? null : connection$okhttp.route();
        int code = p0.code();
        java.lang.String method = p0.request().method();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.getHighSpeedVideoFpsRangesFor.authenticator().authenticate(route, p0);
            }
            if (code == 421) {
                okhttp3.RequestBody body = p0.request().body();
                if ((body != null && body.isOneShot()) || p1 == null || !p1.isCoalescedConnection$okhttp()) {
                    return null;
                }
                p1.getConnection$okhttp().noCoalescedConnections$okhttp();
                return p0.request();
            }
            if (code == 503) {
                okhttp3.Response priorResponse = p0.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && getHighSpeedVideoFpsRanges(p0, Integer.MAX_VALUE) == 0) {
                    return p0.request();
                }
                return null;
            }
            if (code == 407) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(route);
                if (route.proxy().type() != java.net.Proxy.Type.HTTP) {
                    throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.getHighSpeedVideoFpsRangesFor.proxyAuthenticator().authenticate(route, p0);
            }
            if (code == 408) {
                if (!this.getHighSpeedVideoFpsRangesFor.retryOnConnectionFailure()) {
                    return null;
                }
                okhttp3.RequestBody body2 = p0.request().body();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                okhttp3.Response priorResponse2 = p0.priorResponse();
                if ((priorResponse2 == null || priorResponse2.code() != 408) && getHighSpeedVideoFpsRanges(p0, 0) <= 0) {
                    return p0.request();
                }
                return null;
            }
            switch (code) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.getHighSpeedVideoFpsRangesFor.followRedirects() || (header$default = okhttp3.Response.header$default(p0, "Location", null, 2, null)) == null || (resolve = p0.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(resolve.scheme(), p0.request().url().scheme()) && !this.getHighSpeedVideoFpsRangesFor.followSslRedirects()) {
            return null;
        }
        okhttp3.Request.Builder newBuilder = p0.request().newBuilder();
        if (okhttp3.internal.http.HttpMethod.permitsRequestBody(method)) {
            int code2 = p0.code();
            boolean z = okhttp3.internal.http.HttpMethod.INSTANCE.redirectsWithBody(method) || code2 == 308 || code2 == 307;
            if (okhttp3.internal.http.HttpMethod.INSTANCE.redirectsToGet(method) && code2 != 308 && code2 != 307) {
                newBuilder.method("GET", null);
            } else {
                newBuilder.method(method, z ? p0.request().body() : null);
            }
            if (!z) {
                newBuilder.removeHeader(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!okhttp3.internal._UtilJvmKt.canReuseConnectionFor(p0.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private static int getHighSpeedVideoFpsRanges(okhttp3.Response p0, int p1) {
        java.lang.String header$default = okhttp3.Response.header$default(p0, "Retry-After", null, 2, null);
        if (header$default == null) {
            return p1;
        }
        if (!new kotlin.text.Regex("\\d+").matches(header$default)) {
            return Integer.MAX_VALUE;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(header$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        return valueOf.intValue();
    }
}
