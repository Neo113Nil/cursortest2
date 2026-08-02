package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideCheckAutoTransferEnabledUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> getHighResolutionOutputSizeshNQ4ISI;

    private UseCaseModule_ProvideCheckAutoTransferEnabledUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase get() {
        return provideCheckAutoTransferEnabledUseCase(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideCheckAutoTransferEnabledUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideCheckAutoTransferEnabledUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase provideCheckAutoTransferEnabledUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository autoTransferRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideCheckAutoTransferEnabledUseCase(autoTransferRepository));
    }
}
