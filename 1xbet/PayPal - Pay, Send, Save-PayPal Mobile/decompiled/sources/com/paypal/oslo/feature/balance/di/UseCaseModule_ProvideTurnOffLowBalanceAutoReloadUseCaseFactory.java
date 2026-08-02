package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideTurnOffLowBalanceAutoReloadUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> getHighSpeedVideoFpsRangesFor;

    private UseCaseModule_ProvideTurnOffLowBalanceAutoReloadUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase get() {
        return provideTurnOffLowBalanceAutoReloadUseCase(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideTurnOffLowBalanceAutoReloadUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideTurnOffLowBalanceAutoReloadUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase provideTurnOffLowBalanceAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffLowBalanceAutoReloadUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideTurnOffLowBalanceAutoReloadUseCase(autoReloadRepository));
    }
}
