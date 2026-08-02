package com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel;

/* loaded from: classes15.dex */
public final class VerificationCaptureTutorialViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.reducer.VerificationCaptureTutorialReducer> getHighSpeedVideoSizes;

    private VerificationCaptureTutorialViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.reducer.VerificationCaptureTutorialReducer> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.reducer.VerificationCaptureTutorialReducer> provider) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel newInstance(com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.reducer.VerificationCaptureTutorialReducer verificationCaptureTutorialReducer) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.tutorial.viewmodel.VerificationCaptureTutorialViewModel(verificationCaptureTutorialReducer);
    }
}
