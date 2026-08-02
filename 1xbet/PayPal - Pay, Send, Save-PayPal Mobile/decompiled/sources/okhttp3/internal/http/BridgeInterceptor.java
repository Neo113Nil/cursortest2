package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/CookieJar;", "cookieJar", "<init>", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Camera2StreamConfigurationMap", "Lokhttp3/CookieJar;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BridgeInterceptor implements okhttp3.Interceptor {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final okhttp3.CookieJar getHighResolutionOutputSizeshNQ4ISI;

    public BridgeInterceptor(okhttp3.CookieJar cookieJar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookieJar, "");
        this.getHighResolutionOutputSizeshNQ4ISI = cookieJar;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        boolean z;
        okhttp3.ResponseBody body;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        okhttp3.Request.Builder newBuilder = request.newBuilder();
        okhttp3.RequestBody body2 = request.body();
        if (body2 != null) {
            okhttp3.MediaType contentType = body2.getContentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body2.getContentLength();
            if (contentLength == -1) {
                newBuilder.header(com.google.common.net.HttpHeaders.TRANSFER_ENCODING, "chunked");
                newBuilder.removeHeader("Content-Length");
            } else {
                newBuilder.header("Content-Length", java.lang.String.valueOf(contentLength));
                newBuilder.removeHeader(com.google.common.net.HttpHeaders.TRANSFER_ENCODING);
            }
        }
        int i = 0;
        if (request.header(com.google.common.net.HttpHeaders.HOST) == null) {
            newBuilder.header(com.google.common.net.HttpHeaders.HOST, okhttp3.internal._UtilJvmKt.toHostHeader$default(request.url(), false, 1, null));
        }
        if (request.header(com.google.common.net.HttpHeaders.CONNECTION) == null) {
            newBuilder.header(com.google.common.net.HttpHeaders.CONNECTION, com.google.common.net.HttpHeaders.KEEP_ALIVE);
        }
        if (request.header(com.google.common.net.HttpHeaders.ACCEPT_ENCODING) == null && request.header(com.google.common.net.HttpHeaders.RANGE) == null) {
            newBuilder.header(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, com.statsig.androidsdk.HttpUtils.ENCODING_GZIP);
            z = true;
        } else {
            z = false;
        }
        java.util.List<okhttp3.Cookie> loadForRequest = this.getHighResolutionOutputSizeshNQ4ISI.loadForRequest(request.url());
        if (!loadForRequest.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.lang.Object obj : loadForRequest) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                okhttp3.Cookie cookie = (okhttp3.Cookie) obj;
                if (i > 0) {
                    sb.append("; ");
                }
                sb.append(cookie.name());
                sb.append('=');
                sb.append(cookie.value());
                i++;
            }
            newBuilder.header("Cookie", sb.toString());
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", okhttp3.internal._UtilCommonKt.USER_AGENT);
        }
        okhttp3.Request build = newBuilder.build();
        okhttp3.Response proceed = chain.proceed(build);
        okhttp3.internal.http.HttpHeaders.receiveHeaders(this.getHighResolutionOutputSizeshNQ4ISI, build.url(), proceed.headers());
        okhttp3.Response.Builder request2 = proceed.newBuilder().request(build);
        if (z && kotlin.text.StringsKt.equals(com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, okhttp3.Response.header$default(proceed, "Content-Encoding", null, 2, null), true) && okhttp3.internal.http.HttpHeaders.promisesBody(proceed) && (body = proceed.body()) != null) {
            okio.GzipSource gzipSource = new okio.GzipSource(body.getGetHighResolutionOutputSizeshNQ4ISI());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new okhttp3.internal.http.RealResponseBody(okhttp3.Response.header$default(proceed, "Content-Type", null, 2, null), -1L, okio.Okio.buffer(gzipSource)));
        }
        return request2.build();
    }
}
