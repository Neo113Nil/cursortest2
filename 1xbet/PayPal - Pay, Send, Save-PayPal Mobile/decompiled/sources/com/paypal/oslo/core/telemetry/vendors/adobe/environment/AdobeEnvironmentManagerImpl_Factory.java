package com.paypal.oslo.core.telemetry.vendors.adobe.environment;

/* loaded from: classes10.dex */
public final class AdobeEnvironmentManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRangesFor;

    private AdobeEnvironmentManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl newInstance(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        return new com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManagerImpl(appStorage);
    }
}
