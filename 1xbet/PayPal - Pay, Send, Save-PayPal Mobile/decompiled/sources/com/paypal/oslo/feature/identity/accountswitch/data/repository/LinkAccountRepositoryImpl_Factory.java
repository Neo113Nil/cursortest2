package com.paypal.oslo.feature.identity.accountswitch.data.repository;

/* loaded from: classes12.dex */
public final class LinkAccountRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.accountswitch.data.repository.LinkAccountRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;

    private LinkAccountRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.accountswitch.data.repository.LinkAccountRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.accountswitch.data.repository.LinkAccountRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.identity.accountswitch.data.repository.LinkAccountRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.accountswitch.data.repository.LinkAccountRepositoryImpl newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.identity.accountswitch.data.repository.LinkAccountRepositoryImpl(userStore);
    }
}
