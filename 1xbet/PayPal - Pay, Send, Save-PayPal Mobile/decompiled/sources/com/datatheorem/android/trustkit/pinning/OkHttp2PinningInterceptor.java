package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
public class OkHttp2PinningInterceptor implements com.squareup.okhttp.Interceptor {
    private final com.datatheorem.android.trustkit.pinning.OkHttpRootTrustManager getHighResolutionOutputSizeshNQ4ISI;

    public OkHttp2PinningInterceptor(com.datatheorem.android.trustkit.pinning.OkHttpRootTrustManager okHttpRootTrustManager) {
        this.getHighResolutionOutputSizeshNQ4ISI = okHttpRootTrustManager;
    }

    public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws java.io.IOException {
        com.squareup.okhttp.Request request = chain.request();
        this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.set(request.url().getHost());
        return chain.proceed(request);
    }
}
