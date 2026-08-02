package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class GetCryptosUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository> getHighSpeedVideoSizes;

    private GetCryptosUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.CurrencyRepository currencyRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.GetCryptosUseCase(currencyRepository);
    }
}
