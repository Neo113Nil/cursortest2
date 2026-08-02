package com.paypal.oslo.core.i18n.data.repository;

/* loaded from: classes10.dex */
public final class AddressRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoFpsRangesFor;

    private AddressRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3) {
        return new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl newInstance(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.core.i18n.data.repository.AddressRepositoryImpl(networkRepository, localeResolverCache, json);
    }
}
