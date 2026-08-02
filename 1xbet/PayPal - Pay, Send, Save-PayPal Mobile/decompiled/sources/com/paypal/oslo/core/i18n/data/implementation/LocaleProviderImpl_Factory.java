package com.paypal.oslo.core.i18n.data.implementation;

/* loaded from: classes10.dex */
public final class LocaleProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.implementation.LocaleProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRangesFor;

    private LocaleProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.implementation.LocaleProviderImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.data.implementation.LocaleProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        return new com.paypal.oslo.core.i18n.data.implementation.LocaleProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.data.implementation.LocaleProviderImpl newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        return new com.paypal.oslo.core.i18n.data.implementation.LocaleProviderImpl(localeResolverCache);
    }
}
