package com.paypal.oslo.feature.subscriptions.cancel.domain.usecase;

/* loaded from: classes15.dex */
public final class DisableAgreementUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository> getHighSpeedVideoSizes;

    private DisableAgreementUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository> provider) {
        return new com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase newInstance(com.paypal.oslo.feature.subscriptions.cancel.domain.repository.DisableAgreementRepository disableAgreementRepository) {
        return new com.paypal.oslo.feature.subscriptions.cancel.domain.usecase.DisableAgreementUseCase(disableAgreementRepository);
    }
}
