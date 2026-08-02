package com.paypal.oslo.feature.bnplservicing.ui.planlist.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/planlist/components/AfterPurchasePlanType;", "", "<init>", "(Ljava/lang/String;I)V", "InProgress", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "PastDue", "Refund"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AfterPurchasePlanType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType Completed;
    public static final com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType InProgress;
    public static final com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType PastDue;
    public static final com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType Refund;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType[] getHighSpeedVideoFpsRanges;

    private AfterPurchasePlanType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType afterPurchasePlanType = new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType("InProgress", 0);
        InProgress = afterPurchasePlanType;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType afterPurchasePlanType2 = new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, 1);
        Completed = afterPurchasePlanType2;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType afterPurchasePlanType3 = new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType("PastDue", 2);
        PastDue = afterPurchasePlanType3;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType afterPurchasePlanType4 = new com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType("Refund", 3);
        Refund = afterPurchasePlanType4;
        com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType[] afterPurchasePlanTypeArr = {afterPurchasePlanType, afterPurchasePlanType2, afterPurchasePlanType3, afterPurchasePlanType4};
        getHighSpeedVideoFpsRanges = afterPurchasePlanTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(afterPurchasePlanTypeArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.ui.planlist.components.AfterPurchasePlanType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
