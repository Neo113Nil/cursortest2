package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class PhotoUploadViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;

    private PhotoUploadViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase> provider2, dagger.internal.Provider<android.content.Context> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase> provider2, dagger.internal.Provider<android.content.Context> provider3) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel newInstance(com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase uploadPhotoUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase deleteProfilePhotoUseCase, android.content.Context context) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel(uploadPhotoUseCase, deleteProfilePhotoUseCase, context);
    }
}
