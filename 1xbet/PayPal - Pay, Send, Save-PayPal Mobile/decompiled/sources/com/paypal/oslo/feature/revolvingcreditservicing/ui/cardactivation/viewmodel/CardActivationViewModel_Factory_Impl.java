package com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel;

/* loaded from: classes14.dex */
public final class CardActivationViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.C0392CardActivationViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private CardActivationViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.C0392CardActivationViewModel_Factory c0392CardActivationViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0392CardActivationViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CardActivationArgs cardActivationArgs) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(cardActivationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.C0392CardActivationViewModel_Factory c0392CardActivationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel_Factory_Impl(c0392CardActivationViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.C0392CardActivationViewModel_Factory c0392CardActivationViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.cardactivation.viewmodel.CardActivationViewModel_Factory_Impl(c0392CardActivationViewModel_Factory));
    }
}
