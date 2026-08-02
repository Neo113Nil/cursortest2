package com.paypal.oslo.app.telemetry;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/telemetry/TelemetryFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "datadogSessionReplayEnabledKey$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getDatadogSessionReplayEnabledKey", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "datadogSessionReplayEnabledKey", "adobeEnabledKey$delegate", "getAdobeEnabledKey", "adobeEnabledKey", "componentVisibilityTrackingEnabledKey$delegate", "getComponentVisibilityTrackingEnabledKey", "componentVisibilityTrackingEnabledKey", "moduleVisibilityTrackingEnabledKey$delegate", "getModuleVisibilityTrackingEnabledKey", "moduleVisibilityTrackingEnabledKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TelemetryFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.app.telemetry.TelemetryFeatureGates INSTANCE;

    /* renamed from: adobeEnabledKey$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty adobeEnabledKey;

    /* renamed from: componentVisibilityTrackingEnabledKey$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty componentVisibilityTrackingEnabledKey;

    /* renamed from: datadogSessionReplayEnabledKey$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty datadogSessionReplayEnabledKey;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.class, "datadogSessionReplayEnabledKey", "getDatadogSessionReplayEnabledKey()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.class, "adobeEnabledKey", "getAdobeEnabledKey()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.class, "componentVisibilityTrackingEnabledKey", "getComponentVisibilityTrackingEnabledKey()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.app.telemetry.TelemetryFeatureGates.class, "moduleVisibilityTrackingEnabledKey", "getModuleVisibilityTrackingEnabledKey()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: moduleVisibilityTrackingEnabledKey$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty moduleVisibilityTrackingEnabledKey;

    private TelemetryFeatureGates() {
        super("telemetry");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getDatadogSessionReplayEnabledKey() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) datadogSessionReplayEnabledKey.getValue(this, getHighSpeedVideoSizes[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAdobeEnabledKey() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) adobeEnabledKey.getValue(this, getHighSpeedVideoSizes[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getComponentVisibilityTrackingEnabledKey() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) componentVisibilityTrackingEnabledKey.getValue(this, getHighSpeedVideoSizes[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getModuleVisibilityTrackingEnabledKey() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) moduleVisibilityTrackingEnabledKey.getValue(this, getHighSpeedVideoSizes[3]);
    }

    static {
        com.paypal.oslo.app.telemetry.TelemetryFeatureGates telemetryFeatureGates = new com.paypal.oslo.app.telemetry.TelemetryFeatureGates();
        INSTANCE = telemetryFeatureGates;
        datadogSessionReplayEnabledKey = telemetryFeatureGates.create("datadog_session_replay_enabled");
        adobeEnabledKey = telemetryFeatureGates.create("adobe_enabled");
        componentVisibilityTrackingEnabledKey = telemetryFeatureGates.create("component_visibility_tracking_enabled");
        moduleVisibilityTrackingEnabledKey = telemetryFeatureGates.create("module_visibility_tracking_enabled");
        $stable = 8;
    }
}
