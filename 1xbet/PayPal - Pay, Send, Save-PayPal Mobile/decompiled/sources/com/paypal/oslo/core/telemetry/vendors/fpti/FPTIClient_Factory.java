package com.paypal.oslo.core.telemetry.vendors.fpti;

/* loaded from: classes10.dex */
public final class FPTIClient_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;

    private FPTIClient_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient newInstance(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService fPTIService, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient(fPTIService, coroutineScope);
    }
}
