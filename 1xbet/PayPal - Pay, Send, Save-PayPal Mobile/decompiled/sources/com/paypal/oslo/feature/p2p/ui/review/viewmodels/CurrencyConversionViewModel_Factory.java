package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class CurrencyConversionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase> getHighSpeedVideoSizes;

    private CurrencyConversionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase> provider2) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel newInstance(com.paypal.oslo.feature.p2p.ui.review.mappers.ExchangeRateToStringMapper exchangeRateToStringMapper, com.paypal.oslo.feature.p2p.domain.usecase.UpdateCurrencyConversionProviderUseCase updateCurrencyConversionProviderUseCase) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.CurrencyConversionViewModel(exchangeRateToStringMapper, updateCurrencyConversionProviderUseCase);
    }
}
