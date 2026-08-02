package com.paypal.oslo.feature.bnplservicing.config;

/* loaded from: classes11.dex */
public final class SupportedCpisConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> getHighResolutionOutputSizeshNQ4ISI;

    private SupportedCpisConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig newInstance(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplservicing.config.SupportedCpisConfig(configContext);
    }
}
