package com.paypal.oslo.core.appidentity.data;

/* loaded from: classes10.dex */
public final class AppGUID_Factory implements dagger.internal.Factory<com.paypal.oslo.core.appidentity.data.AppGUID> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;

    private AppGUID_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.appidentity.data.AppGUID get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.appidentity.data.AppGUID_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.core.appidentity.data.AppGUID_Factory(provider);
    }

    public static com.paypal.oslo.core.appidentity.data.AppGUID newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.core.appidentity.data.AppGUID(appStorage);
    }
}
