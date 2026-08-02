package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class GetFxQuoteUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository> Camera2StreamConfigurationMap;

    private GetFxQuoteUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository currencyRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetFxQuoteUseCase(currencyRepository);
    }
}
