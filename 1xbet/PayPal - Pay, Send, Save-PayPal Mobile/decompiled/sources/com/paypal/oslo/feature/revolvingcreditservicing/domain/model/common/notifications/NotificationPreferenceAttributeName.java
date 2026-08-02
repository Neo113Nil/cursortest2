package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceAttributeName;", "", "<init>", "(Ljava/lang/String;I)V", "BALANCE_LIMIT_WARNING_THRESHOLD_AMOUNT", "CREDIT_LIMIT_WARNING_THRESHOLD_AMOUNT", "PURCHASE_LIMIT_WARNING_THRESHOLD_AMOUNT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationPreferenceAttributeName {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName BALANCE_LIMIT_WARNING_THRESHOLD_AMOUNT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName CREDIT_LIMIT_WARNING_THRESHOLD_AMOUNT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName PURCHASE_LIMIT_WARNING_THRESHOLD_AMOUNT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private NotificationPreferenceAttributeName(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName("BALANCE_LIMIT_WARNING_THRESHOLD_AMOUNT", 0);
        BALANCE_LIMIT_WARNING_THRESHOLD_AMOUNT = notificationPreferenceAttributeName;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName("CREDIT_LIMIT_WARNING_THRESHOLD_AMOUNT", 1);
        CREDIT_LIMIT_WARNING_THRESHOLD_AMOUNT = notificationPreferenceAttributeName2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName("PURCHASE_LIMIT_WARNING_THRESHOLD_AMOUNT", 2);
        PURCHASE_LIMIT_WARNING_THRESHOLD_AMOUNT = notificationPreferenceAttributeName3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName notificationPreferenceAttributeName4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName("UNKNOWN", 3);
        UNKNOWN = notificationPreferenceAttributeName4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName[] notificationPreferenceAttributeNameArr = {notificationPreferenceAttributeName, notificationPreferenceAttributeName2, notificationPreferenceAttributeName3, notificationPreferenceAttributeName4};
        getHighResolutionOutputSizeshNQ4ISI = notificationPreferenceAttributeNameArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(notificationPreferenceAttributeNameArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceAttributeName> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
