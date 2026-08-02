package com.paypal.oslo.feature.cashin.data.repository;

/* loaded from: classes11.dex */
public final class DeviceLocationRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository> {
    private final dagger.internal.Provider<android.content.Context> Camera2StreamConfigurationMap;

    private DeviceLocationRepository_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository newInstance(android.content.Context context) {
        return new com.paypal.oslo.feature.cashin.data.repository.DeviceLocationRepository(context);
    }
}
