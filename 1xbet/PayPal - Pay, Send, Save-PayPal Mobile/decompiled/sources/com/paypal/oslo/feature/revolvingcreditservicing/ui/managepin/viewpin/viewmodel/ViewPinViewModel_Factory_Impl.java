package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel;

/* loaded from: classes14.dex */
public final class ViewPinViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.C0412ViewPinViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private ViewPinViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.C0412ViewPinViewModel_Factory c0412ViewPinViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0412ViewPinViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ViewPinArgs viewPinArgs) {
        return this.getHighSpeedVideoFpsRangesFor.get(viewPinArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.C0412ViewPinViewModel_Factory c0412ViewPinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_Factory_Impl(c0412ViewPinViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.C0412ViewPinViewModel_Factory c0412ViewPinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.viewpin.viewmodel.ViewPinViewModel_Factory_Impl(c0412ViewPinViewModel_Factory));
    }
}
