package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideEmailRepository$user_profile_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideEmailRepository$user_profile_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository get() {
        return provideEmailRepository$user_profile_prodRelease(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideEmailRepository$user_profile_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideEmailRepository$user_profile_prodReleaseFactory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository provideEmailRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl emailRepositoryImpl) {
        return (com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.RepositoryModule.INSTANCE.provideEmailRepository$user_profile_prodRelease(emailRepositoryImpl));
    }
}
