package com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi;

/* loaded from: classes12.dex */
public final class DebitCardAcquisitionIntroReducer_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;

    private DebitCardAcquisitionIntroReducer_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.intro.mvi.DebitCardAcquisitionIntroReducer(userStore);
    }
}
