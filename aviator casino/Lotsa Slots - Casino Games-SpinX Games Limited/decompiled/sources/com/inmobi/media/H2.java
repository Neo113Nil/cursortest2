package com.inmobi.media;

/* loaded from: classes5.dex */
public final class H2 implements okhttp3.Interceptor {

    /* renamed from: a, reason: collision with root package name */
    public static final com.inmobi.media.H2 f4736a = new com.inmobi.media.H2();

    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Request request = chain.request();
        java.lang.String str = com.inmobi.media.I2.f4755a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
        java.util.Objects.toString(request);
        try {
            okhttp3.Response proceed = chain.proceed(request);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            java.util.Objects.toString(proceed);
            kotlin.jvm.internal.Intrinsics.checkNotNull(request);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            java.util.Objects.toString(request);
            java.util.Objects.toString(proceed);
            kotlin.jvm.internal.Intrinsics.checkNotNull(proceed);
            return proceed;
        } catch (java.lang.Exception e) {
            java.lang.String str2 = com.inmobi.media.I2.f4755a;
            java.util.Objects.toString(request);
            kotlin.jvm.internal.Intrinsics.checkNotNull(request);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            throw e;
        }
    }
}
