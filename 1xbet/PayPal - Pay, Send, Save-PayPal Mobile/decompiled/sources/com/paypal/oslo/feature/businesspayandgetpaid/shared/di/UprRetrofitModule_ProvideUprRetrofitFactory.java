package com.paypal.oslo.feature.businesspayandgetpaid.shared.di;

/* loaded from: classes5.dex */
public final class UprRetrofitModule_ProvideUprRetrofitFactory implements dagger.internal.Factory<retrofit2.Retrofit> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.rest.RetrofitProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig> getHighSpeedVideoSizes;

    private UprRetrofitModule_ProvideUprRetrofitFactory(dagger.internal.Provider<com.paypal.oslo.core.network.rest.RetrofitProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final retrofit2.Retrofit get() {
        return provideUprRetrofit(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule_ProvideUprRetrofitFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.rest.RetrofitProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig> provider3) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule_ProvideUprRetrofitFactory(provider, provider2, provider3);
    }

    public static retrofit2.Retrofit provideUprRetrofit(com.paypal.oslo.core.network.rest.RetrofitProvider retrofitProvider, com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprOkHttpClientProvider uprOkHttpClientProvider, com.paypal.oslo.feature.businesspayandgetpaid.shared.data.config.UprEnvironmentConfig uprEnvironmentConfig) {
        return (retrofit2.Retrofit) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesspayandgetpaid.shared.di.UprRetrofitModule.INSTANCE.provideUprRetrofit(retrofitProvider, uprOkHttpClientProvider, uprEnvironmentConfig));
    }
}
