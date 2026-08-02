package com.paypal.oslo.feature.userprofile.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_ProvideDmsApiService$user_profile_prodReleaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.data.api.DmsApiService> {
    private final dagger.internal.Provider<retrofit2.Retrofit> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvideDmsApiService$user_profile_prodReleaseFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.data.api.DmsApiService get() {
        return provideDmsApiService$user_profile_prodRelease(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideDmsApiService$user_profile_prodReleaseFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.feature.userprofile.di.RepositoryModule_ProvideDmsApiService$user_profile_prodReleaseFactory(provider);
    }

    public static com.paypal.oslo.feature.userprofile.data.api.DmsApiService provideDmsApiService$user_profile_prodRelease(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.feature.userprofile.data.api.DmsApiService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.userprofile.di.RepositoryModule.INSTANCE.provideDmsApiService$user_profile_prodRelease(retrofit));
    }
}
