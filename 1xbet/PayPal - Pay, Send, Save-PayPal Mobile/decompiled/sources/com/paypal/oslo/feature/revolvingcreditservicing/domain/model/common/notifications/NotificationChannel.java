package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationChannel;", "", "<init>", "(Ljava/lang/String;I)V", "EMAIL", "PAPER", "PUSH", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationChannel {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel EMAIL;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel PAPER;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel PUSH;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private NotificationChannel(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel notificationChannel = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel("EMAIL", 0);
        EMAIL = notificationChannel;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel notificationChannel2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel("PAPER", 1);
        PAPER = notificationChannel2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel notificationChannel3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel("PUSH", 2);
        PUSH = notificationChannel3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel notificationChannel4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel("UNKNOWN", 3);
        UNKNOWN = notificationChannel4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel[] notificationChannelArr = {notificationChannel, notificationChannel2, notificationChannel3, notificationChannel4};
        getHighSpeedVideoFpsRangesFor = notificationChannelArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(notificationChannelArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
