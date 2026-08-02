package com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings;

/* loaded from: classes12.dex */
public final class GetCryptoSettingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> getHighSpeedVideoSizes;

    private GetCryptoSettingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.settings.GetCryptoSettingsUseCase(featureGateManager, getPYUSDRewardsStatusUseCase);
    }
}
