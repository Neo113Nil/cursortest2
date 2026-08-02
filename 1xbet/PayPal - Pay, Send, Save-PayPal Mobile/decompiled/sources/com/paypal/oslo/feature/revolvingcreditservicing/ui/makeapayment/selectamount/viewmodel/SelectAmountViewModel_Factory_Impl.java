package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel;

/* loaded from: classes14.dex */
public final class SelectAmountViewModel_Factory_Impl implements com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory {
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0407SelectAmountViewModel_Factory getHighSpeedVideoFpsRanges;

    private SelectAmountViewModel_Factory_Impl(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0407SelectAmountViewModel_Factory c0407SelectAmountViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0407SelectAmountViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel create(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.SelectAmountArgs selectAmountArgs) {
        return this.getHighSpeedVideoFpsRanges.get(selectAmountArgs);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory> create(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0407SelectAmountViewModel_Factory c0407SelectAmountViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel_Factory_Impl(c0407SelectAmountViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.C0407SelectAmountViewModel_Factory c0407SelectAmountViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.viewmodel.SelectAmountViewModel_Factory_Impl(c0407SelectAmountViewModel_Factory));
    }
}
