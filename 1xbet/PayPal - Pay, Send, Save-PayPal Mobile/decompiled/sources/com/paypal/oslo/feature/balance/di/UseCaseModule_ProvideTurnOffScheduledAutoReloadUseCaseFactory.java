package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideTurnOffScheduledAutoReloadUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> getHighSpeedVideoFpsRanges;

    private UseCaseModule_ProvideTurnOffScheduledAutoReloadUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase get() {
        return provideTurnOffScheduledAutoReloadUseCase(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideTurnOffScheduledAutoReloadUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideTurnOffScheduledAutoReloadUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase provideTurnOffScheduledAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffScheduledAutoReloadUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideTurnOffScheduledAutoReloadUseCase(autoReloadRepository));
    }
}
