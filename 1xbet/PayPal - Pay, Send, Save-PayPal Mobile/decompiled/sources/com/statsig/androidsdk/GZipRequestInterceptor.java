package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/statsig/androidsdk/GZipRequestInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "Lokhttp3/RequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, com.statsig.androidsdk.HttpUtils.ENCODING_GZIP, "(Lokhttp3/RequestBody;)Lokhttp3/RequestBody;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GZipRequestInterceptor implements okhttp3.Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        if (request.body() == null || request.headers().names().contains("Content-Encoding")) {
            return chain.proceed(request);
        }
        okhttp3.Request.Builder addHeader = request.newBuilder().addHeader("Content-Encoding", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP);
        java.lang.String method = request.method();
        okhttp3.RequestBody body = request.body();
        kotlin.jvm.internal.Intrinsics.checkNotNull(body);
        return chain.proceed(addHeader.method(method, gzip(body)).build());
    }

    private final okhttp3.RequestBody gzip(final okhttp3.RequestBody body) {
        return new okhttp3.RequestBody() { // from class: com.statsig.androidsdk.GZipRequestInterceptor$gzip$1
            @Override // okhttp3.RequestBody
            /* renamed from: contentLength */
            public final long getContentLength() {
                return -1L;
            }

            @Override // okhttp3.RequestBody
            /* renamed from: contentType */
            public final okhttp3.MediaType getContentType() {
                return okhttp3.RequestBody.this.getContentType();
            }

            @Override // okhttp3.RequestBody
            public final void writeTo(okio.BufferedSink sink) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "");
                okio.BufferedSink buffer = okio.Okio.buffer(new okio.GzipSink(sink));
                okhttp3.RequestBody.this.writeTo(buffer);
                buffer.close();
            }
        };
    }
}
