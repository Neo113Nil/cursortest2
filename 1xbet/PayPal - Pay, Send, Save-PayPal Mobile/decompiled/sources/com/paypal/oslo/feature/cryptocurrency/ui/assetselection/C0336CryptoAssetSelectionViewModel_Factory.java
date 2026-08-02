package com.paypal.oslo.feature.cryptocurrency.ui.assetselection;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0336CryptoAssetSelectionViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> getOutputMinFrameDuration;

    private C0336CryptoAssetSelectionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider8) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getInputFormats = provider3;
        this.getOutputFormats = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
        this.getOutputMinFrameDuration = provider7;
        this.getHighSpeedVideoSizes = provider8;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel get(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType) {
        return newInstance(assetSelectionOperationType, this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getInputFormats.get(), this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.C0336CryptoAssetSelectionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager> provider6, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider8) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.C0336CryptoAssetSelectionViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel newInstance(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper pricesToAssetSelectionUiItemMapper, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper holdingsToAssetSelectionUiItemMapper, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.values.DynamicConfigurationManager dynamicConfigurationManager, com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase getPYUSDRewardsStatusUseCase, com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.CryptoAssetSelectionViewModel(assetSelectionOperationType, getCurrentMarketPricesUseCase, getCryptoHoldingsUseCase, pricesToAssetSelectionUiItemMapper, holdingsToAssetSelectionUiItemMapper, getAvailableNetworksUseCase, dynamicConfigurationManager, getPYUSDRewardsStatusUseCase, featureGateManager);
    }
}
