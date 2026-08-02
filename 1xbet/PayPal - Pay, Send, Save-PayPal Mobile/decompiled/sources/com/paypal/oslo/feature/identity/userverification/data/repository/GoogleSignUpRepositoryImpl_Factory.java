package com.paypal.oslo.feature.identity.userverification.data.repository;

/* loaded from: classes13.dex */
public final class GoogleSignUpRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl> {
    private final dagger.internal.Provider<java.lang.String> getHighSpeedVideoFpsRanges;

    private GoogleSignUpRepositoryImpl_Factory(dagger.internal.Provider<java.lang.String> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl_Factory create(dagger.internal.Provider<java.lang.String> provider) {
        return new com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl newInstance(java.lang.String str) {
        return new com.paypal.oslo.feature.identity.userverification.data.repository.GoogleSignUpRepositoryImpl(str);
    }
}
