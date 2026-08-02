package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation;

/* loaded from: classes14.dex */
public final class ActivateCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository> getHighSpeedVideoSizes;

    private ActivateCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CardActivationRepository cardActivationRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase(cardActivationRepository);
    }
}
