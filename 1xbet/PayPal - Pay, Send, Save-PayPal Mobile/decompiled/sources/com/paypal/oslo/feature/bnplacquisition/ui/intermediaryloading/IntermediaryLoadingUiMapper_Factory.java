package com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading;

/* loaded from: classes11.dex */
public final class IntermediaryLoadingUiMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> getHighSpeedVideoFpsRangesFor;

    private IntermediaryLoadingUiMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.ApplicationFailureUiMapper applicationFailureUiMapper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.intermediaryloading.IntermediaryLoadingUiMapper(applicationFailureUiMapper);
    }
}
