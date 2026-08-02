package com.paypal.oslo.feature.home.domain.loading;

/* loaded from: classes12.dex */
public final class LoadingSectionProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider> {
    private final dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory>> Camera2StreamConfigurationMap;

    private LoadingSectionProvider_Factory(dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory>> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider_Factory create(dagger.internal.Provider<java.util.Map<java.lang.String, com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory>> provider) {
        return new com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider newInstance(java.util.Map<java.lang.String, com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory> map) {
        return new com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider(map);
    }
}
