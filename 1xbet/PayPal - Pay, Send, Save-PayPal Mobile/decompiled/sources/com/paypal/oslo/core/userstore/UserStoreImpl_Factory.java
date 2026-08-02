package com.paypal.oslo.core.userstore;

/* loaded from: classes10.dex */
public final class UserStoreImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.userstore.UserStoreImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.data.repository.UserRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateProvider> getHighSpeedVideoFpsRangesFor;

    private UserStoreImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.data.repository.UserRepository> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.userstore.UserStoreImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.core.userstore.UserStoreImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateProvider> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.data.repository.UserRepository> provider2) {
        return new com.paypal.oslo.core.userstore.UserStoreImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.userstore.UserStoreImpl newInstance(com.paypal.oslo.core.identity.AuthStateProvider authStateProvider, dagger.Lazy<com.paypal.oslo.core.userstore.data.repository.UserRepository> lazy) {
        return new com.paypal.oslo.core.userstore.UserStoreImpl(authStateProvider, lazy);
    }
}
