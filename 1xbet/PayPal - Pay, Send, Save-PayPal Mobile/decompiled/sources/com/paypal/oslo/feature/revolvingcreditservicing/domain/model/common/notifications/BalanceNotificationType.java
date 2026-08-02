package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/BalanceNotificationType;", "", "<init>", "(Ljava/lang/String;I)V", "LOW_AVAILABLE_CREDIT", "HIGH_BALANCE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BalanceNotificationType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType HIGH_BALANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType LOW_AVAILABLE_CREDIT;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType[] getHighSpeedVideoSizes;

    private BalanceNotificationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType balanceNotificationType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType("LOW_AVAILABLE_CREDIT", 0);
        LOW_AVAILABLE_CREDIT = balanceNotificationType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType balanceNotificationType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType("HIGH_BALANCE", 1);
        HIGH_BALANCE = balanceNotificationType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType balanceNotificationType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType("UNKNOWN", 2);
        UNKNOWN = balanceNotificationType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType[] balanceNotificationTypeArr = {balanceNotificationType, balanceNotificationType2, balanceNotificationType3};
        getHighSpeedVideoSizes = balanceNotificationTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(balanceNotificationTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.BalanceNotificationType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
