package com.paypal.oslo.core.pushnotification.domain.notification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/notification/NotificationImportance;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "LOW", "DEFAULT", "HIGH", "MAX"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationImportance {
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance DEFAULT;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance HIGH;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance LOW;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance MAX;
    public static final com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance NONE;
    private static final /* synthetic */ com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private NotificationImportance(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance("NONE", 0);
        NONE = notificationImportance;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance2 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance("LOW", 1);
        LOW = notificationImportance2;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance3 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance("DEFAULT", 2);
        DEFAULT = notificationImportance3;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance4 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance("HIGH", 3);
        HIGH = notificationImportance4;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance notificationImportance5 = new com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance("MAX", 4);
        MAX = notificationImportance5;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance[] notificationImportanceArr = {notificationImportance, notificationImportance2, notificationImportance3, notificationImportance4, notificationImportance5};
        getHighSpeedVideoFpsRanges = notificationImportanceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(notificationImportanceArr);
    }

    public static com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance[] values() {
        return (com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance) java.lang.Enum.valueOf(com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.pushnotification.domain.notification.NotificationImportance> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
