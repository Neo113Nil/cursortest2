package com.paypal.oslo.feature.bnplacquisition.ui.shared;

/* loaded from: classes11.dex */
public final class BnplAcquisitionSharedViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getHighResolutionOutputSizeshNQ4ISI;

    private BnplAcquisitionSharedViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel(sessionStorage);
    }
}
