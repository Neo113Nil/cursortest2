package com.paypal.oslo.feature.identity.devicebinding.data.storage;

/* loaded from: classes12.dex */
public final class DeviceBindingTokenStorageImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoSizes;

    private DeviceBindingTokenStorageImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceBindingTokenStorageImpl(appStorage);
    }
}
