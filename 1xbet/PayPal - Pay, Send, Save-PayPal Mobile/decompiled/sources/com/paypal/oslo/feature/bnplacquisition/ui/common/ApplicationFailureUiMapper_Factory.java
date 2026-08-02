package com.paypal.oslo.feature.bnplacquisition.ui.common;

/* loaded from: classes11.dex */
public final class ApplicationFailureUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ErrorContentProvider> getHighSpeedVideoFpsRangesFor;

    private ApplicationFailureUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ErrorContentProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ErrorContentProvider> provider2) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.DeclineContentProvider declineContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.ErrorContentProvider errorContentProvider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper(declineContentProvider, errorContentProvider);
    }
}
