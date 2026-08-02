package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel;

/* loaded from: classes14.dex */
public final class CreatePinViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.C0410CreatePinViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private CreatePinViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.C0410CreatePinViewModel_Factory c0410CreatePinViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0410CreatePinViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.CreatePinArgs createPinArgs) {
        return this.getHighSpeedVideoFpsRangesFor.get(createPinArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.C0410CreatePinViewModel_Factory c0410CreatePinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel_Factory_Impl(c0410CreatePinViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.C0410CreatePinViewModel_Factory c0410CreatePinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.viewmodel.CreatePinViewModel_Factory_Impl(c0410CreatePinViewModel_Factory));
    }
}
