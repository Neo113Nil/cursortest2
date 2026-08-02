package com.paypal.oslo.core.telemetry.vendors.adjust;

/* loaded from: classes10.dex */
public final class AdjustThirdPartySharingManager_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;

    private AdjustThirdPartySharingManager_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.core.telemetry.vendors.adjust.AdjustThirdPartySharingManager(appStorage);
    }
}
