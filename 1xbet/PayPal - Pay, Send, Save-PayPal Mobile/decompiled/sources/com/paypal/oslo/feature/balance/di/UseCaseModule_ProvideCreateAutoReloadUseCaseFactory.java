package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideCreateAutoReloadUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> getHighResolutionOutputSizeshNQ4ISI;

    private UseCaseModule_ProvideCreateAutoReloadUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase get() {
        return provideCreateAutoReloadUseCase(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideCreateAutoReloadUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideCreateAutoReloadUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase provideCreateAutoReloadUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoReloadRepository autoReloadRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.CreateAutoReloadUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideCreateAutoReloadUseCase(autoReloadRepository));
    }
}
