package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
public class OkHttp3PinningInterceptor implements okhttp3.Interceptor {
    private final com.datatheorem.android.trustkit.pinning.OkHttpRootTrustManager Camera2StreamConfigurationMap;

    public OkHttp3PinningInterceptor(com.datatheorem.android.trustkit.pinning.OkHttpRootTrustManager okHttpRootTrustManager) {
        this.Camera2StreamConfigurationMap = okHttpRootTrustManager;
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        okhttp3.Request request = chain.request();
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.set(request.url().host());
        return chain.proceed(request);
    }
}
