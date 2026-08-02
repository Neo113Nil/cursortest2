package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanUserDataCollectionAttribute;", "", "<init>", "(Ljava/lang/String;I)V", "SENDER_DATE_OF_BIRTH", "SENDER_GOVERNMENT_ID", "SENDER_ADDRESS", "RECEIVER_NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanUserDataCollectionAttribute {
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute RECEIVER_NAME;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute SENDER_ADDRESS;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute SENDER_DATE_OF_BIRTH;
    public static final com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute SENDER_GOVERNMENT_ID;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute[] getHighSpeedVideoSizes;

    private PlanUserDataCollectionAttribute(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute planUserDataCollectionAttribute = new com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute("SENDER_DATE_OF_BIRTH", 0);
        SENDER_DATE_OF_BIRTH = planUserDataCollectionAttribute;
        com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute planUserDataCollectionAttribute2 = new com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute("SENDER_GOVERNMENT_ID", 1);
        SENDER_GOVERNMENT_ID = planUserDataCollectionAttribute2;
        com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute planUserDataCollectionAttribute3 = new com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute("SENDER_ADDRESS", 2);
        SENDER_ADDRESS = planUserDataCollectionAttribute3;
        com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute planUserDataCollectionAttribute4 = new com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute("RECEIVER_NAME", 3);
        RECEIVER_NAME = planUserDataCollectionAttribute4;
        com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute[] planUserDataCollectionAttributeArr = {planUserDataCollectionAttribute, planUserDataCollectionAttribute2, planUserDataCollectionAttribute3, planUserDataCollectionAttribute4};
        getHighSpeedVideoSizes = planUserDataCollectionAttributeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(planUserDataCollectionAttributeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.PlanUserDataCollectionAttribute> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
