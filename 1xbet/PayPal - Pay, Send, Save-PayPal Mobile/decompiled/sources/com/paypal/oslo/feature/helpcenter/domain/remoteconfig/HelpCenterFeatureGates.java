package com.paypal.oslo.feature.helpcenter.domain.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/remoteconfig/HelpCenterFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getFeatureEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "featureEnabled", "wifiCallingEnabled$delegate", "getWifiCallingEnabled", "wifiCallingEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HelpCenterFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterFeatureGates.class, "featureEnabled", "getFeatureEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterFeatureGates.class, "wifiCallingEnabled", "getWifiCallingEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterFeatureGates INSTANCE;

    /* renamed from: featureEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty featureEnabled;

    /* renamed from: wifiCallingEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty wifiCallingEnabled;

    private HelpCenterFeatureGates() {
        super("helpcenter");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getFeatureEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) featureEnabled.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getWifiCallingEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) wifiCallingEnabled.getValue(this, Camera2StreamConfigurationMap[1]);
    }

    static {
        com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterFeatureGates helpCenterFeatureGates = new com.paypal.oslo.feature.helpcenter.domain.remoteconfig.HelpCenterFeatureGates();
        INSTANCE = helpCenterFeatureGates;
        featureEnabled = helpCenterFeatureGates.create("feature_enabled");
        wifiCallingEnabled = helpCenterFeatureGates.create("wifi_calling_enabled");
        $stable = 8;
    }
}
