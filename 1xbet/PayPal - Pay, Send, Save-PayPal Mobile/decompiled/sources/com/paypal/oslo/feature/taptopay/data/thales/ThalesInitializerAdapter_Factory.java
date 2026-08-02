package com.paypal.oslo.feature.taptopay.data.thales;

/* loaded from: classes15.dex */
public final class ThalesInitializerAdapter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter> {
    private final dagger.internal.Provider<android.app.Application> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory> getHighSpeedVideoFpsRangesFor;

    private ThalesInitializerAdapter_Factory(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter_Factory create(dagger.internal.Provider<android.app.Application> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory> provider2) {
        return new com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter newInstance(android.app.Application application, com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerFactory thalesInitializerFactory) {
        return new com.paypal.oslo.feature.taptopay.data.thales.ThalesInitializerAdapter(application, thalesInitializerFactory);
    }
}
