package com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0346CryptoSellAmountEntryViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAllAmountUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase> getOutputMinFrameDuration;

    private C0346CryptoSellAmountEntryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAllAmountUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getOutputMinFrameDuration = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.C0346CryptoSellAmountEntryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAllAmountUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider6) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.C0346CryptoSellAmountEntryViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.ExchangeRateFormatter exchangeRateFormatter, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase validateSellAmountUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAllAmountUseCase validateSellAllAmountUseCase, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.sell.amountentry.CryptoSellAmountEntryViewModel(str, getAssetHoldingUseCase, exchangeRateFormatter, cryptoPriceFormatter, validateSellAmountUseCase, validateSellAllAmountUseCase, currencyProvider);
    }
}
