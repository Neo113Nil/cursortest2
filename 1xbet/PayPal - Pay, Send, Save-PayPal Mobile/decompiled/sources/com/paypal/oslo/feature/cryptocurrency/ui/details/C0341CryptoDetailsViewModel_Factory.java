package com.paypal.oslo.feature.cryptocurrency.ui.details;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0341CryptoDetailsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsUiMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceHistoryUiMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.ChartInteractionDataMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.CryptoAssetHoldingDataMapper> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getOutputSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases> getOutputStallDurationlomOqCM;

    private C0341CryptoDetailsViewModel_Factory(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceHistoryUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.CryptoAssetHoldingDataMapper> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.ChartInteractionDataMapper> provider8, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider9, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider10, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider11, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory> provider12, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider13) {
        this.getOutputSizes = provider;
        this.getOutputStallDurationlomOqCM = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getOutputMinFrameDurationlomOqCM = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getHighSpeedVideoSizesFor = provider7;
        this.getHighSpeedVideoSizes = provider8;
        this.getOutputMinFrameDuration = provider9;
        this.getInputSizeshNQ4ISI = provider10;
        this.getInputFormats = provider11;
        this.getHighResolutionOutputSizeshNQ4ISI = provider12;
        this.getOutputFormats = provider13;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel get(java.lang.String str) {
        return newInstance(str, this.getOutputSizes.get(), this.getOutputStallDurationlomOqCM.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDurationlomOqCM.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get(), this.getInputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.C0341CryptoDetailsViewModel_Factory create(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsUiMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceHistoryUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.CryptoAssetHoldingDataMapper> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.ChartInteractionDataMapper> provider8, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator> provider9, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider10, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider11, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory> provider12, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider13) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.C0341CryptoDetailsViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel newInstance(java.lang.String str, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases, com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsUiMapper assetPriceDetailsUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceDetailsCardActionsUiMapper assetPriceDetailsCardActionsUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.facade.PYUSDRewardsCardFacade pYUSDRewardsCardFacade, com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.AssetPriceHistoryUiMapper assetPriceHistoryUiMapper, com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.CryptoAssetHoldingDataMapper cryptoAssetHoldingDataMapper, com.paypal.oslo.feature.cryptocurrency.ui.details.mapper.ChartInteractionDataMapper chartInteractionDataMapper, com.paypal.oslo.feature.cryptocurrency.ui.common.coordinator.CryptocurrencyProvisioningCoordinator cryptocurrencyProvisioningCoordinator, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, com.paypal.oslo.feature.cryptocurrency.ui.details.factory.CryptoAssetDescriptionUiFactory cryptoAssetDescriptionUiFactory, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.CryptoDetailsViewModel(str, savedStateHandle, cryptoDetailsUseCases, assetPriceDetailsUiMapper, assetPriceDetailsCardActionsUiMapper, pYUSDRewardsCardFacade, assetPriceHistoryUiMapper, cryptoAssetHoldingDataMapper, chartInteractionDataMapper, cryptocurrencyProvisioningCoordinator, featureGateManager, dynamicConfigurationManager, cryptoAssetDescriptionUiFactory, currencyProvider);
    }
}
