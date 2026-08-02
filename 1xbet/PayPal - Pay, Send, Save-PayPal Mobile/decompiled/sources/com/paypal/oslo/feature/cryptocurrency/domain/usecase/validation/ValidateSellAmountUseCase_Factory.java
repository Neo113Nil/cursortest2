package com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation;

/* loaded from: classes12.dex */
public final class ValidateSellAmountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider> getHighSpeedVideoFpsRanges;

    private ValidateSellAmountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider cryptoAmountValidationProvider, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateSellAmountUseCase(cryptoAmountValidationProvider, currencyProvider);
    }
}
