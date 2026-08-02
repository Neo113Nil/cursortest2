package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideAddressRepository$user_profile_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;

    private RepositoryModule_ProvideAddressRepository$user_profile_prodReleaseFactory(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository get() {
        return provideAddressRepository$user_profile_prodRelease(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideAddressRepository$user_profile_prodReleaseFactory create(dagger.internal.Provider<com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideAddressRepository$user_profile_prodReleaseFactory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository provideAddressRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl addressRepositoryImpl) {
        return (com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.RepositoryModule.INSTANCE.provideAddressRepository$user_profile_prodRelease(addressRepositoryImpl));
    }
}
