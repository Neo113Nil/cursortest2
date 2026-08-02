package com.paypal.oslo.feature.packagetracking.di;

/* loaded from: classes5.dex */
public final class PackageTrackingProviderModule_ProvidesGeoCoderApiFactory implements dagger.internal.Factory<com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighResolutionOutputSizeshNQ4ISI;

    private PackageTrackingProviderModule_ProvidesGeoCoderApiFactory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi get() {
        return providesGeoCoderApi(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule_ProvidesGeoCoderApiFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider) {
        return new com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule_ProvidesGeoCoderApiFactory(provider);
    }

    public static com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi providesGeoCoderApi(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider) {
        return (com.paypal.oslo.feature.packagetracking.domain.repository.GeoCoderApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.packagetracking.di.PackageTrackingProviderModule.INSTANCE.providesGeoCoderApi(dynamicOkHttpClientProvider));
    }
}
