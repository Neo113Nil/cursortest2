package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

/* loaded from: classes11.dex */
public final class UprOkHttpClientProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRanges;

    private UprOkHttpClientProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider3) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider newInstance(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprInterceptor uprInterceptor, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider(dynamicOkHttpClientProvider, uprInterceptor, coroutineScope);
    }
}
