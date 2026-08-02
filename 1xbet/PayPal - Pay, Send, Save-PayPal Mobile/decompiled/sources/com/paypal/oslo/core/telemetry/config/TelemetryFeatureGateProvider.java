package com.paypal.oslo.core.telemetry.config;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/config/TelemetryFeatureGateProvider;", "", "", "isDatadogSessionReplayEnabled", "()Z", "isAdobeEnabled", "componentVisibilityTrackingEnabled", "moduleVisibilityTrackingEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface TelemetryFeatureGateProvider {
    default boolean componentVisibilityTrackingEnabled() {
        return true;
    }

    boolean isAdobeEnabled();

    boolean isDatadogSessionReplayEnabled();

    default boolean moduleVisibilityTrackingEnabled() {
        return true;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean componentVisibilityTrackingEnabled(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
            return com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider.super.componentVisibilityTrackingEnabled();
        }

        @java.lang.Deprecated
        public static boolean moduleVisibilityTrackingEnabled(com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider telemetryFeatureGateProvider) {
            return com.paypal.oslo.core.telemetry.config.TelemetryFeatureGateProvider.super.moduleVisibilityTrackingEnabled();
        }
    }
}
