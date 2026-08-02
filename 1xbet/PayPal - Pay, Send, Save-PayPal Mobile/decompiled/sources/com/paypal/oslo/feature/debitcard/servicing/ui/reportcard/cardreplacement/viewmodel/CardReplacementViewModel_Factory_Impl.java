package com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel;

/* loaded from: classes12.dex */
public final class CardReplacementViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.C0365CardReplacementViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private CardReplacementViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.C0365CardReplacementViewModel_Factory c0365CardReplacementViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0365CardReplacementViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel create(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
        return this.getHighSpeedVideoFpsRangesFor.get(cardReplacementInfo);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.Factory> create(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.C0365CardReplacementViewModel_Factory c0365CardReplacementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel_Factory_Impl(c0365CardReplacementViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.C0365CardReplacementViewModel_Factory c0365CardReplacementViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.servicing.ui.reportcard.cardreplacement.viewmodel.CardReplacementViewModel_Factory_Impl(c0365CardReplacementViewModel_Factory));
    }
}
