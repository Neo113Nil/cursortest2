package com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel;

/* loaded from: classes12.dex */
public final class ViewPinViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.C0368ViewPinViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private ViewPinViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.C0368ViewPinViewModel_Factory c0368ViewPinViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0368ViewPinViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoFpsRangesFor.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.C0368ViewPinViewModel_Factory c0368ViewPinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel_Factory_Impl(c0368ViewPinViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.C0368ViewPinViewModel_Factory c0368ViewPinViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.viewpin.viewmodel.ViewPinViewModel_Factory_Impl(c0368ViewPinViewModel_Factory));
    }
}
