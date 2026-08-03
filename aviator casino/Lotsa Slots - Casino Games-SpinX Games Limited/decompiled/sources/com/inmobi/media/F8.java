package com.inmobi.media;

/* loaded from: classes5.dex */
public final class F8 implements okhttp3.Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public final long f4700a;

    public F8(long j) {
        this.f4700a = j;
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Response proceed = chain.proceed(chain.request());
        okhttp3.ResponseBody body = proceed.body();
        long contentLength = body != null ? body.getContentLength() : 0L;
        if (contentLength <= this.f4700a) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(proceed);
            return proceed;
        }
        proceed.close();
        throw new com.inmobi.media.C2483ib("Image size exceeds limit: " + contentLength + " Bytes");
    }
}
