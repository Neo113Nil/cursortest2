package com.paypal.oslo.feature.directdeposit.ui.pdf;

/* loaded from: classes12.dex */
public final class DirectDepositPDFViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;

    private DirectDepositPDFViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.directdeposit.ui.pdf.DirectDepositPDFViewModel(userStore);
    }
}
