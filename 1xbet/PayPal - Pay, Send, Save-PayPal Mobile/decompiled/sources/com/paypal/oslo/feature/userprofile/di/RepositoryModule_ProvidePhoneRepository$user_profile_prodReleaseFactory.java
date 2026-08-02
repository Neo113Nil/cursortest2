package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvidePhoneRepository$user_profile_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvidePhoneRepository$user_profile_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository get() {
        return providePhoneRepository$user_profile_prodRelease(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvidePhoneRepository$user_profile_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvidePhoneRepository$user_profile_prodReleaseFactory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository providePhoneRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl phoneRepositoryImpl) {
        return (com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.RepositoryModule.INSTANCE.providePhoneRepository$user_profile_prodRelease(phoneRepositoryImpl));
    }
}
