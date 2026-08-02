package com.paypal.oslo.feature.bnplacquisition.paymode;

/* loaded from: classes11.dex */
public final class PayModeConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> Camera2StreamConfigurationMap;

    private PayModeConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.paymode.PayModeConfig(configContext);
    }
}
