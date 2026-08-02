package com.paypal.oslo.core.telemetry.vendors.pie;

/* loaded from: classes10.dex */
public final class PieClient_Factory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.pie.PieClient> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.pie.PieService> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoFpsRangesFor;

    private PieClient_Factory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.pie.PieService> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.pie.PieClient get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.pie.PieClient_Factory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.vendors.pie.PieService> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieClient_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.telemetry.vendors.pie.PieClient newInstance(com.paypal.oslo.core.telemetry.vendors.pie.PieService pieService, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.core.telemetry.vendors.pie.PieClient(pieService, coroutineScope);
    }
}
