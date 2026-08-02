package com.paypal.oslo.feature.xoom.di;

/* loaded from: classes16.dex */
public final class XoomModule_ProvideXoomLocalRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private XoomModule_ProvideXoomLocalRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository get() {
        return provideXoomLocalRepository(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.xoom.di.XoomModule_ProvideXoomLocalRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.xoom.di.XoomModule_ProvideXoomLocalRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository provideXoomLocalRepository(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.userstore.UserStore userStore, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return (com.paypal.oslo.feature.xoom.domain.repository.XoomLocalRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.xoom.di.XoomModule.INSTANCE.provideXoomLocalRepository(appStorage, userStore, coroutineDispatcher));
    }
}
