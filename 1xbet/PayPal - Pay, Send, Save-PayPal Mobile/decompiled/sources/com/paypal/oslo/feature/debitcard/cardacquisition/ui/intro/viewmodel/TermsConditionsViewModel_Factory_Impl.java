package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel;

/* loaded from: classes12.dex */
public final class TermsConditionsViewModel_Factory_Impl implements com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel.Factory {
    private final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0353TermsConditionsViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private TermsConditionsViewModel_Factory_Impl(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0353TermsConditionsViewModel_Factory c0353TermsConditionsViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0353TermsConditionsViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel.Factory
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel create(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return this.getHighSpeedVideoFpsRangesFor.get(debitCardProductName);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel.Factory> create(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0353TermsConditionsViewModel_Factory c0353TermsConditionsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel_Factory_Impl(c0353TermsConditionsViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0353TermsConditionsViewModel_Factory c0353TermsConditionsViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel_Factory_Impl(c0353TermsConditionsViewModel_Factory));
    }
}
