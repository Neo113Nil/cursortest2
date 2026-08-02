package com.paypal.oslo.feature.identity.moreoptions.data.repository;

/* loaded from: classes12.dex */
public final class MoreOptionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.moreoptions.data.repository.MoreOptionRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder> getHighSpeedVideoFpsRangesFor;

    private MoreOptionRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.moreoptions.data.repository.MoreOptionRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.moreoptions.data.repository.MoreOptionRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder> provider2) {
        return new com.paypal.oslo.feature.identity.moreoptions.data.repository.MoreOptionRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.data.repository.MoreOptionRepositoryImpl newInstance(com.paypal.oslo.feature.identity.userverification.data.cache.AuthOptionCache authOptionCache, com.paypal.oslo.feature.identity.moreoptions.data.AuthOptionBuilder authOptionBuilder) {
        return new com.paypal.oslo.feature.identity.moreoptions.data.repository.MoreOptionRepositoryImpl(authOptionCache, authOptionBuilder);
    }
}
