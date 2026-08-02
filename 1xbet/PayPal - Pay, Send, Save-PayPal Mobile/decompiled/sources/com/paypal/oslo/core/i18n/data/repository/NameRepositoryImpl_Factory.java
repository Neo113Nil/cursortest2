package com.paypal.oslo.core.i18n.data.repository;

/* loaded from: classes10.dex */
public final class NameRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoSizes;

    private NameRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3) {
        return new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl newInstance(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.core.i18n.data.repository.NameRepositoryImpl(networkRepository, localeResolverCache, json);
    }
}
