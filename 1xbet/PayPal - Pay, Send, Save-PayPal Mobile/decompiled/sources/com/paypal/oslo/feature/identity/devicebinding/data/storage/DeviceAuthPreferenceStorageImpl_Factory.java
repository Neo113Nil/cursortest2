package com.paypal.oslo.feature.identity.devicebinding.data.storage;

/* loaded from: classes12.dex */
public final class DeviceAuthPreferenceStorageImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoSizes;

    private DeviceAuthPreferenceStorageImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.identity.devicebinding.data.storage.DeviceAuthPreferenceStorageImpl(appStorage);
    }
}
