package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class AdsConfigurationProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.AdsConfigurationProvider> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.AdsConfigurationProvider get() {
        return newInstance();
    }

    public static com.paypal.oslo.app.config.AdsConfigurationProvider_Factory create() {
        return com.paypal.oslo.app.config.AdsConfigurationProvider_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static com.paypal.oslo.app.config.AdsConfigurationProvider newInstance() {
        return new com.paypal.oslo.app.config.AdsConfigurationProvider();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.app.config.AdsConfigurationProvider_Factory getHighSpeedVideoFpsRanges = new com.paypal.oslo.app.config.AdsConfigurationProvider_Factory();

        private InstanceHolder() {
        }
    }
}
