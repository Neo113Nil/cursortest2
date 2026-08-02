package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideGetBalanceIdUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> getHighSpeedVideoFpsRanges;

    private UseCaseModule_ProvideGetBalanceIdUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase get() {
        return provideGetBalanceIdUseCase(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetBalanceIdUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetBalanceIdUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase provideGetBalanceIdUseCase(com.paypal.oslo.feature.balance.domain.repository.balance.BalanceRepository balanceRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetBalanceIdUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideGetBalanceIdUseCase(balanceRepository));
    }
}
