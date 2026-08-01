package com.vungle.ads.internal.network;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

/* loaded from: classes7.dex */
public final class u implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.body();
        if (body == null || request.header(HttpHeaders.CONTENT_ENCODING) != null) {
            return chain.proceed(request);
        }
        Request.Builder header = request.newBuilder().header(HttpHeaders.CONTENT_ENCODING, "gzip");
        String method = request.method();
        Buffer buffer = new Buffer();
        BufferedSink buffer2 = Okio.buffer(new GzipSink(buffer));
        body.writeTo(buffer2);
        buffer2.close();
        return chain.proceed(header.method(method, new t(body, buffer)).build());
    }
}
