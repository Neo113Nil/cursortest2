package com.paypal.oslo.feature.bnplacquisition.config;

/* loaded from: classes11.dex */
public final class SupportedCpisConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig_Factory create() {
        return com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig newInstance() {
        return new com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.bnplacquisition.config.SupportedCpisConfig_Factory();

        private InstanceHolder() {
        }
    }
}
