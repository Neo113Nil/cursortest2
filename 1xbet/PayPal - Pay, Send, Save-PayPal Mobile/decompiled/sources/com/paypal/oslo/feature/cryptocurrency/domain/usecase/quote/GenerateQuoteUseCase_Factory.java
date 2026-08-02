package com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote;

/* loaded from: classes12.dex */
public final class GenerateQuoteUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GenerateQuoteUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository cryptoQuoteRepository) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.quote.GenerateQuoteUseCase(cryptoQuoteRepository);
    }
}
