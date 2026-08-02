package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideGetAutoReloadInitialConfigUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> getHighSpeedVideoSizes;

    private UseCaseModule_ProvideGetAutoReloadInitialConfigUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase get() {
        return provideGetAutoReloadInitialConfigUseCase(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetAutoReloadInitialConfigUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideGetAutoReloadInitialConfigUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase provideGetAutoReloadInitialConfigUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.GetAutoReloadInitialConfigUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideGetAutoReloadInitialConfigUseCase(autoReloadRepository));
    }
}
