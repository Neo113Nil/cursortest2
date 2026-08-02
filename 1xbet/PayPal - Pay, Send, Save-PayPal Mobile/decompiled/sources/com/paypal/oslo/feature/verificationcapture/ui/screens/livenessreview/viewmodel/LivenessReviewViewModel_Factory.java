package com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel;

/* loaded from: classes15.dex */
public final class LivenessReviewViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.reducer.LivenessReviewReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoSizes;

    private LivenessReviewViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.reducer.LivenessReviewReducer> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.reducer.LivenessReviewReducer> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel newInstance(com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.reducer.LivenessReviewReducer livenessReviewReducer, androidx.view.SavedStateHandle savedStateHandle) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.livenessreview.viewmodel.LivenessReviewViewModel(livenessReviewReducer, savedStateHandle);
    }
}
