package com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry;

/* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0337AmountEntryViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoSizes;

    private C0337AmountEntryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel get(java.lang.String str) {
        return newInstance(str, this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.C0337AmountEntryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter> provider3, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider4) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.C0337AmountEntryViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel newInstance(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase validateBuyAmountUseCase, com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.buy.amountentry.AmountEntryViewModel(str, getAssetCurrentPriceUseCase, validateBuyAmountUseCase, cryptoPriceFormatter, currencyProvider);
    }
}
