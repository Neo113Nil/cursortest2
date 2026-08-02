package com.paypal.oslo.feature.cashin.data.repository;

/* loaded from: classes11.dex */
public final class HardcodedLocationRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository_Factory create() {
        return com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository newInstance() {
        return new com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.cashin.data.repository.HardcodedLocationRepository_Factory();

        private InstanceHolder() {
        }
    }
}
