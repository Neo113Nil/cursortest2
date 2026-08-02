package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

/* loaded from: classes11.dex */
public final class IntermediaryLoadingConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> getHighSpeedVideoFpsRangesFor;

    private IntermediaryLoadingConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingConfig(configContext, nfcLockScreenConfig);
    }
}
