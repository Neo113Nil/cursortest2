package com.paypal.oslo.feature.userprofile.domain.usecase;

/* loaded from: classes15.dex */
public final class DeleteProfilePhotoUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository> getHighSpeedVideoFpsRangesFor;

    private DeleteProfilePhotoUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository> provider) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase newInstance(com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository photoRepository) {
        return new com.paypal.oslo.feature.userprofile.domain.usecase.DeleteProfilePhotoUseCase(photoRepository);
    }
}
