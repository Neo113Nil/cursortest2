package com.paypal.oslo.feature.pushnotification.delivery.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/model/OsloActionType;", "", "<init>", "(Ljava/lang/String;I)V", "DEEPLINK", "ACTION", "DISMISS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OsloActionType {
    public static final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType ACTION;
    public static final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType DEEPLINK;
    public static final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType DISMISS;
    public static final com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private OsloActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType = new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType("DEEPLINK", 0);
        DEEPLINK = osloActionType;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType2 = new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType("ACTION", 1);
        ACTION = osloActionType2;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType3 = new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType("DISMISS", 2);
        DISMISS = osloActionType3;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType osloActionType4 = new com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType("UNKNOWN", 3);
        UNKNOWN = osloActionType4;
        com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType[] osloActionTypeArr = {osloActionType, osloActionType2, osloActionType3, osloActionType4};
        getHighResolutionOutputSizeshNQ4ISI = osloActionTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(osloActionTypeArr);
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType[] values() {
        return (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.pushnotification.delivery.domain.model.OsloActionType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
