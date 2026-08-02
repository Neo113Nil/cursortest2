package com.paypal.oslo.feature.bnplservicing.config;

/* loaded from: classes11.dex */
public final class ConfigContext_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.CountryResolver> getHighSpeedVideoFpsRangesFor;

    private ConfigContext_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.CountryResolver> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.config.ConfigContext get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.config.ConfigContext_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.CountryResolver> provider) {
        return new com.paypal.oslo.feature.bnplservicing.config.ConfigContext_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.config.ConfigContext newInstance(com.paypal.oslo.feature.bnplservicing.config.CountryResolver countryResolver) {
        return new com.paypal.oslo.feature.bnplservicing.config.ConfigContext(countryResolver);
    }
}
