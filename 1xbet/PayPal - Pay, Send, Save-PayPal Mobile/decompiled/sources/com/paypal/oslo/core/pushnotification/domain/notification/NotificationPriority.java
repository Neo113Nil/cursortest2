package com.paypal.oslo.core.pushnotification.domain.notification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationPriority;", "", "<init>", "(Ljava/lang/String;I)V", "MIN", "LOW", "DEFAULT", "HIGH", "MAX"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationPriority {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority DEFAULT;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority HIGH;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority LOW;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority MAX;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority MIN;
    private static final /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority[] getHighSpeedVideoFpsRangesFor;

    private NotificationPriority(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority("MIN", 0);
        MIN = notificationPriority;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority2 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority("LOW", 1);
        LOW = notificationPriority2;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority3 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority("DEFAULT", 2);
        DEFAULT = notificationPriority3;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority4 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority("HIGH", 3);
        HIGH = notificationPriority4;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority notificationPriority5 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority("MAX", 4);
        MAX = notificationPriority5;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority[] notificationPriorityArr = {notificationPriority, notificationPriority2, notificationPriority3, notificationPriority4, notificationPriority5};
        getHighSpeedVideoFpsRangesFor = notificationPriorityArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(notificationPriorityArr);
    }

    public static com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority[] values() {
        return (com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority) java.lang.Enum.valueOf(com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.pushnotification.domain.notification.NotificationPriority> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
