package com.paypal.oslo.feature.bnplacquisition.ui;

/* loaded from: classes11.dex */
public final class SessionStorage_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;

    private SessionStorage_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage(appStorage);
    }
}
