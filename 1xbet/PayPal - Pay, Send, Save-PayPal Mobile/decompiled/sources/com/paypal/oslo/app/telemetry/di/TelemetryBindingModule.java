package com.paypal.oslo.app.telemetry.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/app/telemetry/di/TelemetryBindingModule;", "", "Lcom/paypal/oslo/app/telemetry/AppTelemetryEnvironmentProvider;", "impl", "Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;", "bindTelemetryEnvironmentProvider", "(Lcom/paypal/oslo/app/telemetry/AppTelemetryEnvironmentProvider;)Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;", "Lcom/paypal/oslo/app/telemetry/AppTelemetryServiceProvider;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryServiceProvider;", "bindTelemetryServiceProvider", "(Lcom/paypal/oslo/app/telemetry/AppTelemetryServiceProvider;)Lcom/paypal/oslo/core/telemetry/config/TelemetryServiceProvider;", "Lcom/paypal/oslo/app/telemetry/AppTelemetryFeatureGateProvider;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "bindTelemetryFeatureGateProvider", "(Lcom/paypal/oslo/app/telemetry/AppTelemetryFeatureGateProvider;)Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "Lcom/paypal/oslo/app/launch/SessionLaunchSourceProviderImpl;", "Lcom/paypal/oslo/core/telemetry/analytics/SessionLaunchSourceProvider;", "bindSessionLaunchSourceProvider", "(Lcom/paypal/oslo/app/launch/SessionLaunchSourceProviderImpl;)Lcom/paypal/oslo/core/telemetry/analytics/SessionLaunchSourceProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface TelemetryBindingModule {
    @dagger.Binds
    com.paypal.oslo.core.telemetry.analytics.SessionLaunchSourceProvider bindSessionLaunchSourceProvider(com.paypal.oslo.app.launch.SessionLaunchSourceProviderImpl impl);

    @dagger.Binds
    com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider bindTelemetryEnvironmentProvider(com.paypal.oslo.app.telemetry.AppTelemetryEnvironmentProvider impl);

    @dagger.Binds
    com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider bindTelemetryFeatureGateProvider(com.paypal.oslo.app.telemetry.AppTelemetryFeatureGateProvider impl);

    @dagger.Binds
    com.paypal.oslo.core.telemetry.config.TelemetryServiceProvider bindTelemetryServiceProvider(com.paypal.oslo.app.telemetry.AppTelemetryServiceProvider impl);
}
