package com.paypal.oslo.app.telemetry;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/app/telemetry/AppTelemetryEnvironmentProvider;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "environmentProvider", "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentProvider;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/app/environment/EnvironmentProvider;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentType;", "getEnvironmentType", "()Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentType;", "environmentType", "", "getEnvironmentBaseUrl", "()Ljava/lang/String;", "environmentBaseUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTelemetryEnvironmentProvider implements com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.app.environment.EnvironmentProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public AppTelemetryEnvironmentProvider(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentProvider, "");
        this.Camera2StreamConfigurationMap = environmentProvider;
    }

    @Override // com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider
    public final com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType getEnvironmentType() {
        com.paypal.oslo.app.environment.Environment environment = this.Camera2StreamConfigurationMap.getEnvironment();
        if (environment instanceof com.paypal.oslo.app.environment.Environment.Production) {
            return com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType.PROD;
        }
        if (environment instanceof com.paypal.oslo.app.environment.Environment.Stage) {
            return com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType.STAGE;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    @Override // com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentProvider
    public final java.lang.String getEnvironmentBaseUrl() {
        return this.Camera2StreamConfigurationMap.getEnvironment().getBaseUrl();
    }
}
