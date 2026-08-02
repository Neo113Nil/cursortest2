package com.paypal.oslo.feature.cryptocurrency.ui.settings;

/* loaded from: classes12.dex */
public final class CryptoSettingsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase> getHighSpeedVideoFpsRanges;

    private CryptoSettingsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase getCryptoSettingsUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.settings.CryptoSettingsViewModel(featureGateManager, getCryptoSettingsUseCase);
    }
}
