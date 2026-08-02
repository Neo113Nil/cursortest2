package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

/* loaded from: classes14.dex */
public final class CardActivationSideEffectMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability> getHighSpeedVideoSizes;

    private CardActivationSideEffectMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase> provider4) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationPreloadedAvailability cardActivationPreloadedAvailability, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase getCardActivationAvailabilityUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase activateCardUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationSideEffectMiddleware(creditProductIdentifier, cardActivationPreloadedAvailability, getCardActivationAvailabilityUseCase, activateCardUseCase);
    }
}
