package com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade;

/* loaded from: classes12.dex */
public final class ExecuteTradeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository> getHighSpeedVideoFpsRanges;

    private ExecuteTradeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository cryptoTradeRepository) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.trade.ExecuteTradeUseCase(cryptoTradeRepository);
    }
}
