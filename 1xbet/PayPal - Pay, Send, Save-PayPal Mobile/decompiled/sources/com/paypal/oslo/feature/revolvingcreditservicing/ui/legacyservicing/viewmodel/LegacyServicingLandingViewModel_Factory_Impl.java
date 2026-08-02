package com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel;

/* loaded from: classes14.dex */
public final class LegacyServicingLandingViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0399LegacyServicingLandingViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private LegacyServicingLandingViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0399LegacyServicingLandingViewModel_Factory c0399LegacyServicingLandingViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0399LegacyServicingLandingViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.LegacyServicingLandingArgs legacyServicingLandingArgs) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(legacyServicingLandingArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0399LegacyServicingLandingViewModel_Factory c0399LegacyServicingLandingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel_Factory_Impl(c0399LegacyServicingLandingViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.C0399LegacyServicingLandingViewModel_Factory c0399LegacyServicingLandingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.legacyservicing.viewmodel.LegacyServicingLandingViewModel_Factory_Impl(c0399LegacyServicingLandingViewModel_Factory));
    }
}
