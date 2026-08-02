package com.paypal.oslo.feature.ads.di;

/* loaded from: classes11.dex */
public final class AdsClientOkHttpProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRangesFor;

    private AdsClientOkHttpProvider_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider newInstance(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.feature.ads.di.AdsClientOkHttpProvider(dynamicOkHttpClientProvider, coroutineScope);
    }
}
