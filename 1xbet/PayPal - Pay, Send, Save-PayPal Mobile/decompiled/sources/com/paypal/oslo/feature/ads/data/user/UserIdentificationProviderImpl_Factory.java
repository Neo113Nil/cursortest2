package com.paypal.oslo.feature.ads.data.user;

/* loaded from: classes11.dex */
public final class UserIdentificationProviderImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.ads.data.user.UserIdentificationProviderImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;

    private UserIdentificationProviderImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.ads.data.user.UserIdentificationProviderImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.ads.data.user.UserIdentificationProviderImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.ads.data.user.UserIdentificationProviderImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.ads.data.user.UserIdentificationProviderImpl newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.ads.data.user.UserIdentificationProviderImpl(userStore);
    }
}
