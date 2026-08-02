package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideUpdateAutoReloadUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> Camera2StreamConfigurationMap;

    private UseCaseModule_ProvideUpdateAutoReloadUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase get() {
        return provideUpdateAutoReloadUseCase(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideUpdateAutoReloadUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideUpdateAutoReloadUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase provideUpdateAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.UpdateAutoReloadUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideUpdateAutoReloadUseCase(autoReloadRepository));
    }
}
