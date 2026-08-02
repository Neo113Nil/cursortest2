package com.paypal.oslo.feature.balance.di;

/* loaded from: classes11.dex */
public final class UseCaseModule_ProvideTurnOffAutoTransferUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> Camera2StreamConfigurationMap;

    private UseCaseModule_ProvideTurnOffAutoTransferUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase get() {
        return provideTurnOffAutoTransferUseCase(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideTurnOffAutoTransferUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository> provider) {
        return new com.paypal.oslo.feature.balance.di.UseCaseModule_ProvideTurnOffAutoTransferUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase provideTurnOffAutoTransferUseCase(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository autoTransferRepository) {
        return (com.paypal.oslo.feature.balance.domain.usecase.autoreload.TurnOffAutoTransferUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.balance.di.UseCaseModule.INSTANCE.provideTurnOffAutoTransferUseCase(autoTransferRepository));
    }
}
