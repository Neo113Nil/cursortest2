package com.paypal.oslo.core.pushnotification.deeplink;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/deeplink/OpenWebSource;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "PUSH_NOTIFICATION", "NOTIFICATION_CENTER", "CRITICAL_ALERT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OpenWebSource {
    public static final com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource CRITICAL_ALERT;
    public static final com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource NOTIFICATION_CENTER;
    public static final com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource PUSH_NOTIFICATION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource[] getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private OpenWebSource(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource openWebSource = new com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource("PUSH_NOTIFICATION", 0, com.paypal.oslo.feature.taptopay.ui.transaction.notification.DefaultTapToPayNotificationContentProvider.DEEPLINK_SOURCE_VALUE);
        PUSH_NOTIFICATION = openWebSource;
        com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource openWebSource2 = new com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource("NOTIFICATION_CENTER", 1, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Feature.NOTIFICATION_CENTER);
        NOTIFICATION_CENTER = openWebSource2;
        com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource openWebSource3 = new com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource("CRITICAL_ALERT", 2, "critical_alert");
        CRITICAL_ALERT = openWebSource3;
        com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource[] openWebSourceArr = {openWebSource, openWebSource2, openWebSource3};
        getHighSpeedVideoFpsRangesFor = openWebSourceArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(openWebSourceArr);
    }

    public static com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource[] values() {
        return (com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource) java.lang.Enum.valueOf(com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.pushnotification.deeplink.OpenWebSource> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
