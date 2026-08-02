package com.paypal.oslo.feature.notificationcenter.common;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/common/NotificationCenterFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "showMoreOrLess$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getShowMoreOrLess", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "showMoreOrLess", "criticalAlertsEnabled$delegate", "getCriticalAlertsEnabled", "criticalAlertsEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.notificationcenter.common.NotificationCenterFeatureGates.class, "showMoreOrLess", "getShowMoreOrLess()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.notificationcenter.common.NotificationCenterFeatureGates.class, "criticalAlertsEnabled", "getCriticalAlertsEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};
    public static final com.paypal.oslo.feature.notificationcenter.common.NotificationCenterFeatureGates INSTANCE;

    /* renamed from: criticalAlertsEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty criticalAlertsEnabled;

    /* renamed from: showMoreOrLess$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty showMoreOrLess;

    private NotificationCenterFeatureGates() {
        super(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getShowMoreOrLess() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) showMoreOrLess.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getCriticalAlertsEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) criticalAlertsEnabled.getValue(this, Camera2StreamConfigurationMap[1]);
    }

    static {
        com.paypal.oslo.feature.notificationcenter.common.NotificationCenterFeatureGates notificationCenterFeatureGates = new com.paypal.oslo.feature.notificationcenter.common.NotificationCenterFeatureGates();
        INSTANCE = notificationCenterFeatureGates;
        showMoreOrLess = notificationCenterFeatureGates.create("show_more_or_less");
        criticalAlertsEnabled = notificationCenterFeatureGates.create("critical_alerts_enabled");
        $stable = 8;
    }
}
