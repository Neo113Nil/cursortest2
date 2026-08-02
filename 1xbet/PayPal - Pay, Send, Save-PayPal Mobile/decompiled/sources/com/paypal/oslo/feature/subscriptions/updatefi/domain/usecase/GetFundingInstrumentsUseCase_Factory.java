package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

/* loaded from: classes15.dex */
public final class GetFundingInstrumentsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetFundingInstrumentsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository> provider) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase newInstance(com.paypal.oslo.feature.subscriptions.updatefi.domain.repository.UpdateFiRepository updateFiRepository) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetFundingInstrumentsUseCase(updateFiRepository);
    }
}
