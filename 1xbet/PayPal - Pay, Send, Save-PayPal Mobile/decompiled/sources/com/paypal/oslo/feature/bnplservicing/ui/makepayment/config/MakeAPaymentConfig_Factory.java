package com.paypal.oslo.feature.bnplservicing.ui.makepayment.config;

/* loaded from: classes11.dex */
public final class MakeAPaymentConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> getHighSpeedVideoFpsRanges;

    private MakeAPaymentConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig newInstance(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.config.MakeAPaymentConfig(configContext);
    }
}
