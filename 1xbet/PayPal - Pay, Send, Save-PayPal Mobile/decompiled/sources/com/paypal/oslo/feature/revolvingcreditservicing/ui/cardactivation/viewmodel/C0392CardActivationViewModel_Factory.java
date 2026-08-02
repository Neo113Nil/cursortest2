package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

/* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C0392CardActivationViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationReducer> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase> getHighSpeedVideoFpsRangesFor;

    private C0392CardActivationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel get(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationArgs cardActivationArgs) {
        return newInstance(cardActivationArgs, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.C0392CardActivationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.C0392CardActivationViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel newInstance(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationArgs cardActivationArgs, com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationReducer cardActivationReducer, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.GetCardActivationAvailabilityUseCase getCardActivationAvailabilityUseCase, com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.cardactivation.ActivateCardUseCase activateCardUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel(cardActivationArgs, cardActivationReducer, getCardActivationAvailabilityUseCase, activateCardUseCase);
    }
}
