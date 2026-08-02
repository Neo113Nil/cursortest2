package com.paypal.oslo.app.di;

/* loaded from: classes10.dex */
public final class ChuckerModule_ProvideChuckerInterceptor$app_prodReleaseFactory implements dagger.internal.Factory<okhttp3.Interceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerInterceptorProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerConfig> getHighSpeedVideoSizes;

    private ChuckerModule_ProvideChuckerInterceptor$app_prodReleaseFactory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerConfig> provider2, dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerInterceptorProvider> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final okhttp3.Interceptor get() {
        return provideChuckerInterceptor$app_prodRelease(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.di.ChuckerModule_ProvideChuckerInterceptor$app_prodReleaseFactory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerConfig> provider2, dagger.internal.Provider<com.paypal.oslo.app.network.ChuckerInterceptorProvider> provider3) {
        return new com.paypal.oslo.app.di.ChuckerModule_ProvideChuckerInterceptor$app_prodReleaseFactory(provider, provider2, provider3);
    }

    public static okhttp3.Interceptor provideChuckerInterceptor$app_prodRelease(android.content.Context context, com.paypal.oslo.app.network.ChuckerConfig chuckerConfig, com.paypal.oslo.app.network.ChuckerInterceptorProvider chuckerInterceptorProvider) {
        return (okhttp3.Interceptor) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.app.di.ChuckerModule.INSTANCE.provideChuckerInterceptor$app_prodRelease(context, chuckerConfig, chuckerInterceptorProvider));
    }
}
