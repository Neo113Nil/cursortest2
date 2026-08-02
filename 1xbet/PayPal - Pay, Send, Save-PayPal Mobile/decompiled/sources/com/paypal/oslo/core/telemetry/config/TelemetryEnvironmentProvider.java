package com.paypal.oslo.core.telemetry.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentProvider;", "", "Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentType;", "getEnvironmentType", "()Lcom/paypal/oslo/core/telemetry/config/TelemetryEnvironmentType;", "environmentType", "", "getEnvironmentBaseUrl", "()Ljava/lang/String;", "environmentBaseUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TelemetryEnvironmentProvider {
    java.lang.String getEnvironmentBaseUrl();

    com.paypal.oslo.core.telemetry.config.TelemetryEnvironmentType getEnvironmentType();
}
