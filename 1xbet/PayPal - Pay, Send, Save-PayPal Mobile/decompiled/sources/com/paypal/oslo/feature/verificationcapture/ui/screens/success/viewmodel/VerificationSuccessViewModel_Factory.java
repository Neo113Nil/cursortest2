package com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel;

/* loaded from: classes15.dex */
public final class VerificationSuccessViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoFpsRanges;

    private VerificationSuccessViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer> provider, dagger.internal.Provider<androidx.view.SavedStateHandle> provider2) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel newInstance(com.paypal.oslo.feature.verificationcapture.ui.screens.success.reducer.VerificationSuccessReducer verificationSuccessReducer, androidx.view.SavedStateHandle savedStateHandle) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.success.viewmodel.VerificationSuccessViewModel(verificationSuccessReducer, savedStateHandle);
    }
}
