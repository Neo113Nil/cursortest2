package com.paypal.oslo.feature.bnplacquisition.config;

/* loaded from: classes11.dex */
public final class NfcLockScreenConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoFpsRanges;

    private NfcLockScreenConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext) {
        return new com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig(configContext);
    }
}
