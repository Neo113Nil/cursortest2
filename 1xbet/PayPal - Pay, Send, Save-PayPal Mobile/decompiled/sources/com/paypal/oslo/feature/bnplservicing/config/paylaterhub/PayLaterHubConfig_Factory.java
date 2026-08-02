package com.paypal.oslo.feature.bnplservicing.config.paylaterhub;

/* loaded from: classes11.dex */
public final class PayLaterHubConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> Camera2StreamConfigurationMap;

    private PayLaterHubConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig newInstance(com.paypal.oslo.feature.bnplservicing.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplservicing.config.paylaterhub.PayLaterHubConfig(configContext);
    }
}
