package com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview;

/* loaded from: classes11.dex */
public final class VirtualCardOverviewConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoFpsRanges;

    private VirtualCardOverviewConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewConfig(configContext, nfcLockScreenConfig);
    }
}
