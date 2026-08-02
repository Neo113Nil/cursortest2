package com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper;

/* loaded from: classes12.dex */
public final class PricesToAssetSelectionUiItemMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> getHighSpeedVideoFpsRangesFor;

    private PricesToAssetSelectionUiItemMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper newInstance(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceMovementFormatter cryptoPriceMovementFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter pYUSDRateFormatter) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.mapper.PricesToAssetSelectionUiItemMapper(cryptoPriceMovementFormatter, cryptoPriceFormatter, pYUSDRateFormatter);
    }
}
