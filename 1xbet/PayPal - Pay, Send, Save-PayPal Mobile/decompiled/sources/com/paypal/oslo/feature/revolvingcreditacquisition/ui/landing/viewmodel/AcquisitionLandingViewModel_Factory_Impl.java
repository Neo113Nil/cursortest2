package com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel;

/* loaded from: classes14.dex */
public final class AcquisitionLandingViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.C0381AcquisitionLandingViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private AcquisitionLandingViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.C0381AcquisitionLandingViewModel_Factory c0381AcquisitionLandingViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0381AcquisitionLandingViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel create(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs) {
        return this.getHighSpeedVideoFpsRangesFor.get(acquisitionLandingNavigationArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.C0381AcquisitionLandingViewModel_Factory c0381AcquisitionLandingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel_Factory_Impl(c0381AcquisitionLandingViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.C0381AcquisitionLandingViewModel_Factory c0381AcquisitionLandingViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel_Factory_Impl(c0381AcquisitionLandingViewModel_Factory));
    }
}
