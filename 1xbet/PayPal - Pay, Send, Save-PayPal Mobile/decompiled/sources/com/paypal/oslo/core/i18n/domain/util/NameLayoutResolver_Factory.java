package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class NameLayoutResolver_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoSizes;

    private NameLayoutResolver_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        return new com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        return new com.paypal.oslo.core.i18n.domain.util.NameLayoutResolver(localeResolverCache);
    }
}
