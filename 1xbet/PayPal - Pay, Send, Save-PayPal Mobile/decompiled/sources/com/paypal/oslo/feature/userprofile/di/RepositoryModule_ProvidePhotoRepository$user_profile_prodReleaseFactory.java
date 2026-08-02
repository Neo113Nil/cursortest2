package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvidePhotoRepository$user_profile_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvidePhotoRepository$user_profile_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository get() {
        return providePhotoRepository$user_profile_prodRelease(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvidePhotoRepository$user_profile_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvidePhotoRepository$user_profile_prodReleaseFactory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository providePhotoRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl photoRepositoryImpl) {
        return (com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.RepositoryModule.INSTANCE.providePhotoRepository$user_profile_prodRelease(photoRepositoryImpl));
    }
}
