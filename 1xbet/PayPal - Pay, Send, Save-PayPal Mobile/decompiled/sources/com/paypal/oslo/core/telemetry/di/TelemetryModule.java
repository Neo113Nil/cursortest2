package com.paypal.oslo.core.telemetry.di;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/core/telemetry/di/TelemetryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;", "telemetryEnvironmentProvider", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "Lokhttp3/Interceptor;", "provideDatadogInterceptor", "(Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;)Lokhttp3/Interceptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class TelemetryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.di.TelemetryModule INSTANCE = new com.paypal.oslo.core.telemetry.di.TelemetryModule();

    private TelemetryModule() {
    }

    @dagger.Provides
    @com.paypal.oslo.core.telemetry.di.DatadogInterceptor
    public final okhttp3.Interceptor provideDatadogInterceptor(com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider telemetryEnvironmentProvider, com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryEnvironmentProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentity, "");
        return com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInterceptorFactory.INSTANCE.create(telemetryEnvironmentProvider.getEnvironmentBaseUrl(), appIdentity.getAppVersion());
    }
}
