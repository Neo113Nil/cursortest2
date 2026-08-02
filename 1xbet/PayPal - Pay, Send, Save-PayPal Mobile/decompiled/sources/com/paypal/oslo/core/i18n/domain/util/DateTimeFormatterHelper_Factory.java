package com.paypal.oslo.core.i18n.domain.util;

/* loaded from: classes10.dex */
public final class DateTimeFormatterHelper_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRangesFor;

    private DateTimeFormatterHelper_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        return new com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        return new com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper(localeResolverCache);
    }
}
