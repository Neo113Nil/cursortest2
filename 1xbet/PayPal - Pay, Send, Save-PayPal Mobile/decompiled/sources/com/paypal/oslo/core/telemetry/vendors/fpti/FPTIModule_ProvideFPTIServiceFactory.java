package com.paypal.oslo.core.telemetry.vendors.fpti;

/* loaded from: classes5.dex */
public final class FPTIModule_ProvideFPTIServiceFactory implements dagger.internal.Factory<com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService> {
    private final dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider> getHighResolutionOutputSizeshNQ4ISI;

    private FPTIModule_ProvideFPTIServiceFactory(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService get() {
        return provideFPTIService(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.FPTIModule_ProvideFPTIServiceFactory create(dagger.internal.Provider<com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider> provider) {
        return new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIModule_ProvideFPTIServiceFactory(provider);
    }

    public static com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService provideFPTIService(com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider telemetryServiceProvider) {
        return (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIModule.INSTANCE.provideFPTIService(telemetryServiceProvider));
    }
}
