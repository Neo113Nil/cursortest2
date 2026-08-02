package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel;

/* loaded from: classes12.dex */
public final class ShowDebitCardViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.C0367ShowDebitCardViewModel_Factory getHighSpeedVideoFpsRanges;

    private ShowDebitCardViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.C0367ShowDebitCardViewModel_Factory c0367ShowDebitCardViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0367ShowDebitCardViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel create(java.lang.String str) {
        return this.getHighSpeedVideoFpsRanges.get(str);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.C0367ShowDebitCardViewModel_Factory c0367ShowDebitCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel_Factory_Impl(c0367ShowDebitCardViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.C0367ShowDebitCardViewModel_Factory c0367ShowDebitCardViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel_Factory_Impl(c0367ShowDebitCardViewModel_Factory));
    }
}
