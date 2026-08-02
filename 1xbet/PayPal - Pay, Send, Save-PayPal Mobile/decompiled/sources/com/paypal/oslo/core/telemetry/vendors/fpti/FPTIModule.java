package com.paypal.oslo.core.telemetry.vendors.fpti;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/config/TelemetryServiceProvider;", "telemetryServiceProvider", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIService;", "provideFPTIService", "(Lcom/paypal/oslo/core/telemetry/config/TelemetryServiceProvider;)Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIService;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class FPTIModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIModule INSTANCE = new com.paypal.oslo.core.telemetry.vendors.fpti.FPTIModule();

    private FPTIModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService provideFPTIService(com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider telemetryServiceProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryServiceProvider, "");
        return (com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService) telemetryServiceProvider.provide(com.paypal.oslo.core.telemetry.vendors.fpti.FPTIService.class);
    }
}
