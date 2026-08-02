package com.paypal.oslo.feature.balance.domain.usecase;

/* loaded from: classes11.dex */
public final class GetBalanceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> getHighSpeedVideoSizes;

    private GetBalanceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        return new com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase newInstance(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository) {
        return new com.paypal.oslo.feature.balance.domain.usecase.GetBalanceUseCase(balanceRepository);
    }
}
