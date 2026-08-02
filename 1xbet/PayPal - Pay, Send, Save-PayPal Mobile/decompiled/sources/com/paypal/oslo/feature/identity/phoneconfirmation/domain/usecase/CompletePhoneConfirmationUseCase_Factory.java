package com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase;

/* loaded from: classes13.dex */
public final class CompletePhoneConfirmationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository> getHighSpeedVideoFpsRanges;

    private CompletePhoneConfirmationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository> provider) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase newInstance(com.paypal.oslo.feature.identity.phoneconfirmation.domain.repository.PhoneConfirmationCompletionRepository phoneConfirmationCompletionRepository) {
        return new com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.CompletePhoneConfirmationUseCase(phoneConfirmationCompletionRepository);
    }
}
