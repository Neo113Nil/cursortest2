package com.paypal.oslo.app.telemetry;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/app/telemetry/AppTelemetryFeatureGateProvider;", "Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isDatadogSessionReplayEnabled", "()Z", "isAdobeEnabled", "componentVisibilityTrackingEnabled", "moduleVisibilityTrackingEnabled", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTelemetryFeatureGateProvider implements com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AppTelemetryFeatureGateProvider(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoSizes = featureGate;
    }

    @Override // com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider
    public final boolean isDatadogSessionReplayEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.INSTANCE.getDatadogSessionReplayEnabledKey());
    }

    @Override // com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider
    public final boolean isAdobeEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.INSTANCE.getAdobeEnabledKey());
    }

    @Override // com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider
    public final boolean componentVisibilityTrackingEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.INSTANCE.getComponentVisibilityTrackingEnabledKey());
    }

    @Override // com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider
    public final boolean moduleVisibilityTrackingEnabled() {
        return this.getHighSpeedVideoSizes.checkGate(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.INSTANCE.getModuleVisibilityTrackingEnabledKey());
    }
}
