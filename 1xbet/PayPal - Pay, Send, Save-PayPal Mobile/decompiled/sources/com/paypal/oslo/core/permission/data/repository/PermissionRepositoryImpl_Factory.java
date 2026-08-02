package com.paypal.oslo.core.permission.data.repository;

/* loaded from: classes10.dex */
public final class PermissionRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> Camera2StreamConfigurationMap;

    private PermissionRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.core.permission.data.repository.PermissionRepositoryImpl(appStorage);
    }
}
