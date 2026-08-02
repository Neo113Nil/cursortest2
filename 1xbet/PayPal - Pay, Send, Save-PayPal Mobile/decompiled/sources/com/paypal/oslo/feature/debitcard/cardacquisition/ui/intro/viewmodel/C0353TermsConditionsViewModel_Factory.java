package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel;

/* renamed from: com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C0353TermsConditionsViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsReducer> Camera2StreamConfigurationMap;

    private C0353TermsConditionsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsReducer> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel get(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
        return newInstance(debitCardProductName, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0353TermsConditionsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsReducer> provider) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.C0353TermsConditionsViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel newInstance(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.TermsConditionsReducer termsConditionsReducer) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.viewmodel.TermsConditionsViewModel(debitCardProductName, termsConditionsReducer);
    }
}
