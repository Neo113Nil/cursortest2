package com.paypal.oslo.feature.businesshome.data.local;

/* loaded from: classes11.dex */
public final class DismissedCardsStorageImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> Camera2StreamConfigurationMap;

    private DismissedCardsStorageImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.businesshome.data.local.DismissedCardsStorageImpl(appStorage);
    }
}
