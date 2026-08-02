package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation;

/* loaded from: classes14.dex */
public final class GetCardActivationAvailabilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetCardActivationAvailabilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository cardActivationRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase(cardActivationRepository);
    }
}
