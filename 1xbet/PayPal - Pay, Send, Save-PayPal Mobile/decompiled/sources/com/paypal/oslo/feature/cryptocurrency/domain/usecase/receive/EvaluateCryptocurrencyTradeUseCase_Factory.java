package com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive;

/* loaded from: classes12.dex */
public final class EvaluateCryptocurrencyTradeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository> Camera2StreamConfigurationMap;

    private EvaluateCryptocurrencyTradeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository cryptoReceiveRepository) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase(cryptoReceiveRepository);
    }
}
