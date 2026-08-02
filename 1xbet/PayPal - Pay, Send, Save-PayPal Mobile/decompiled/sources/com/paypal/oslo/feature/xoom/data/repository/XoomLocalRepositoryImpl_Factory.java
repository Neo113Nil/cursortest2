package com.paypal.oslo.feature.xoom.data.repository;

/* loaded from: classes16.dex */
public final class XoomLocalRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private XoomLocalRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.userstore.UserStore userStore, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.xoom.data.repository.XoomLocalRepositoryImpl(appStorage, userStore, coroutineDispatcher);
    }
}
