package com.paypal.oslo.feature.controlcenter.data.repository;

/* loaded from: classes12.dex */
public final class UserProfileRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;

    private UserProfileRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.controlcenter.data.repository.UserProfileRepositoryImpl(userStore);
    }
}
