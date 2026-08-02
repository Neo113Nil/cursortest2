package com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper;

/* loaded from: classes12.dex */
public final class HoldingsToAssetSelectionUiItemMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighResolutionOutputSizeshNQ4ISI;

    private HoldingsToAssetSelectionUiItemMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoGainLossFormatter cryptoGainLossFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.HoldingsToAssetSelectionUiItemMapper(cryptoPriceFormatter, cryptoGainLossFormatter);
    }
}
