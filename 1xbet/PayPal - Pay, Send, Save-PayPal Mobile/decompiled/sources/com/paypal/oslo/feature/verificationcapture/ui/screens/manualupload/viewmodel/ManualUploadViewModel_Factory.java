package com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel;

/* loaded from: classes15.dex */
public final class ManualUploadViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.reducer.ManualUploadReducer> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<android.app.Application> getHighSpeedVideoSizes;

    private ManualUploadViewModel_Factory(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.reducer.ManualUploadReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel_Factory create(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.reducer.ManualUploadReducer> provider2, dagger.internal.Provider<com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase> provider3) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel newInstance(android.app.Application application, com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.reducer.ManualUploadReducer manualUploadReducer, com.paypal.oslo.feature.verificationcapture.domain.usecase.UploadMultipleFilesUseCase uploadMultipleFilesUseCase) {
        return new com.paypal.oslo.feature.verificationcapture.ui.screens.manualupload.viewmodel.ManualUploadViewModel(application, manualUploadReducer, uploadMultipleFilesUseCase);
    }
}
