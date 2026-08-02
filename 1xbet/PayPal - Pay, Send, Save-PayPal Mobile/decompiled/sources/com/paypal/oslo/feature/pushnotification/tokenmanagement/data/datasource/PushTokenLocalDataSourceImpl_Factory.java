package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource;

/* loaded from: classes13.dex */
public final class PushTokenLocalDataSourceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRangesFor;

    private PushTokenLocalDataSourceImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.datasource.PushTokenLocalDataSourceImpl(appStorage);
    }
}
