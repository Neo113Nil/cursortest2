package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

/* loaded from: classes15.dex */
public final class UpdatePreferredFundingInstrumentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository> Camera2StreamConfigurationMap;

    private UpdatePreferredFundingInstrumentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository> provider) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase newInstance(com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository updateFiRepository) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.UpdatePreferredFundingInstrumentUseCase(updateFiRepository);
    }
}
