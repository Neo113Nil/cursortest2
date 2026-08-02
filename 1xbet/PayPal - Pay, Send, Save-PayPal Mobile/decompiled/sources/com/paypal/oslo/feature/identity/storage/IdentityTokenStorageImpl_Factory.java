package com.paypal.oslo.feature.identity.storage;

/* loaded from: classes13.dex */
public final class IdentityTokenStorageImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.storage.IdentityTokenStorageImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateSetter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighResolutionOutputSizeshNQ4ISI;

    private IdentityTokenStorageImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateSetter> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.storage.IdentityTokenStorageImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.identity.storage.IdentityTokenStorageImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider, dagger.internal.Provider<com.paypal.oslo.core.identity.AuthStateSetter> provider2) {
        return new com.paypal.oslo.feature.identity.storage.IdentityTokenStorageImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.identity.storage.IdentityTokenStorageImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.identity.AuthStateSetter authStateSetter) {
        return new com.paypal.oslo.feature.identity.storage.IdentityTokenStorageImpl(appStorage, authStateSetter);
    }
}
