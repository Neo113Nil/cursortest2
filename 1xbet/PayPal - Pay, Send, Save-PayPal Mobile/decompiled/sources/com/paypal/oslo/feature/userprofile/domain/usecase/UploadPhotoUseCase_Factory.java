package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class UploadPhotoUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private UploadPhotoUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository> provider, dagger.internal.Provider<android.content.Context> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository> provider, dagger.internal.Provider<android.content.Context> provider2) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository photoRepository, android.content.Context context) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.UploadPhotoUseCase(photoRepository, context);
    }
}
