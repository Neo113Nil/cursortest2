package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

/* loaded from: classes13.dex */
public final class HandledAlertsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoSizes;

    private HandledAlertsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl(appStorage);
    }
}
