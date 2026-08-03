package com.inmobi.media;

/* renamed from: com.inmobi.media.fc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2405fc implements okhttp3.Interceptor {
    @Override // okhttp3.Interceptor
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.Response proceed = chain.proceed(chain.request());
        if (proceed.isRedirect()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(proceed);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(proceed, "<this>");
            java.lang.String header = proceed.isRedirect() ? proceed.header(com.google.common.net.HttpHeaders.LOCATION) : null;
            if (header != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "<this>");
                try {
                    new java.net.URL(header);
                } catch (java.net.MalformedURLException unused) {
                }
            }
            chain.call().cancel();
            throw new java.net.MalformedURLException("Invalid URL in Location header: " + header);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(proceed);
        return proceed;
    }
}
