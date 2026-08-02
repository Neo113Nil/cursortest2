package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

/* loaded from: classes11.dex */
public final class EnterAmountConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> getHighSpeedVideoFpsRanges;

    private EnterAmountConfig_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.ConfigContext> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig newInstance(com.paypal.oslo.feature.bnplacquisition.config.ConfigContext configContext, com.paypal.oslo.feature.bnplacquisition.config.NfcLockScreenConfig nfcLockScreenConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountConfig(configContext, nfcLockScreenConfig);
    }
}
