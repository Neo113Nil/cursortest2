package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel;

/* loaded from: classes14.dex */
public final class ChooseWayToPayViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0401ChooseWayToPayViewModel_Factory getHighSpeedVideoFpsRanges;

    private ChooseWayToPayViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0401ChooseWayToPayViewModel_Factory c0401ChooseWayToPayViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0401ChooseWayToPayViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ChooseWayToPayArgs chooseWayToPayArgs) {
        return this.getHighSpeedVideoFpsRanges.get(chooseWayToPayArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0401ChooseWayToPayViewModel_Factory c0401ChooseWayToPayViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel_Factory_Impl(c0401ChooseWayToPayViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.C0401ChooseWayToPayViewModel_Factory c0401ChooseWayToPayViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.choosewaytopay.viewmodel.ChooseWayToPayViewModel_Factory_Impl(c0401ChooseWayToPayViewModel_Factory));
    }
}
