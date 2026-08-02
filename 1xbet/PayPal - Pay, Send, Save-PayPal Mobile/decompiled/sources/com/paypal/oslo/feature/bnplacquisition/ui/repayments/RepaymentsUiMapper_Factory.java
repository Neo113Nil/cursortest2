package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

/* loaded from: classes11.dex */
public final class RepaymentsUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighSpeedVideoSizes;

    private RepaymentsUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig> provider5) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsContentProvider repaymentsContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsConfig repaymentsConfig) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper(applicationFailureUiMapper, bnplAcquisitionFormatter, repaymentsContentProvider, exitConfirmationContentProvider, repaymentsConfig);
    }
}
