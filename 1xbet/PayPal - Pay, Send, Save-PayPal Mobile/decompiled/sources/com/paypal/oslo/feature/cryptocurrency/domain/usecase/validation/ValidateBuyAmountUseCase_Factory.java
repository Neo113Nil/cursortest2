package com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation;

/* loaded from: classes12.dex */
public final class ValidateBuyAmountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> getHighSpeedVideoSizes;

    private ValidateBuyAmountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider> provider2) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.provider.CryptoAmountValidationProvider cryptoAmountValidationProvider, com.paypal.oslo.feature.cryptocurrency.domain.provider.CurrencyProvider currencyProvider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.validation.ValidateBuyAmountUseCase(cryptoAmountValidationProvider, currencyProvider);
    }
}
