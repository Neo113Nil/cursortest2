package com.datadog.android.core.internal.data.upload;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/core/internal/data/upload/GzipRequestInterceptor;", "Lokhttp3/Interceptor;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GzipRequestInterceptor implements okhttp3.Interceptor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    public GzipRequestInterceptor(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoSizes = internalLogger;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
        okhttp3.Request request = chain.request();
        final okhttp3.RequestBody body = request.body();
        if (body == null || request.header("Content-Encoding") != null || (body instanceof okhttp3.MultipartBody)) {
            return chain.proceed(request);
        }
        try {
            request = request.newBuilder().header("Content-Encoding", com.statsig.androidsdk.HttpUtils.ENCODING_GZIP).method(request.method(), new okhttp3.RequestBody() { // from class: com.datadog.android.core.internal.data.upload.GzipRequestInterceptor$gzip$1
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
            }).build();
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.data.upload.GzipRequestInterceptor$intercept$compressedRequest$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Unable to gzip request body";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
        return chain.proceed(request);
    }
}
