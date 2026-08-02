package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationSectionType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_UPDATES", "SPENDING", "CUSTOMIZE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NotificationSectionType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType ACCOUNT_UPDATES;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType CUSTOMIZE;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType SPENDING;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private NotificationSectionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType notificationSectionType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType("ACCOUNT_UPDATES", 0);
        ACCOUNT_UPDATES = notificationSectionType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType notificationSectionType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType("SPENDING", 1);
        SPENDING = notificationSectionType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType notificationSectionType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType("CUSTOMIZE", 2);
        CUSTOMIZE = notificationSectionType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType[] notificationSectionTypeArr = {notificationSectionType, notificationSectionType2, notificationSectionType3};
        Camera2StreamConfigurationMap = notificationSectionTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(notificationSectionTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
