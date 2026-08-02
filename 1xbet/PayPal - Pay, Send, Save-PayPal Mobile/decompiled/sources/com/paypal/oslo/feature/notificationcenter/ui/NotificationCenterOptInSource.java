package com.paypal.oslo.feature.notificationcenter.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0017X\u0097D¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/ui/NotificationCenterOptInSource;", "Lcom/paypal/oslo/feature/pushnotification/api/optin/OptInSource;", "<init>", "()V", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "displayName", "getDisplayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NotificationCenterOptInSource implements com.paypal.oslo.feature.pushnotification.api.optin.OptInSource {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterOptInSource INSTANCE = new com.paypal.oslo.feature.notificationcenter.ui.NotificationCenterOptInSource();
    private static final java.lang.String key = com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER;
    private static final java.lang.String displayName = "Notification Center";

    private NotificationCenterOptInSource() {
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.OptInSource
    public final java.lang.String getKey() {
        return key;
    }

    @Override // com.paypal.oslo.feature.pushnotification.api.optin.OptInSource
    public final java.lang.String getDisplayName() {
        return displayName;
    }
}
