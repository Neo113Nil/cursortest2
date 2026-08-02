package com.paypal.oslo.feature.bnplservicing.domain.model.plandetails;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/plandetails/PaidOffPlanType;", "", "<init>", "(Ljava/lang/String;I)V", "COMPLETED", "MATURED", "REFUND_PENDING", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaidOffPlanType {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType COMPLETED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType MATURED;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType REFUND_PENDING;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaidOffPlanType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType("COMPLETED", 0);
        COMPLETED = paidOffPlanType;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType2 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType("MATURED", 1);
        MATURED = paidOffPlanType2;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType3 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType("REFUND_PENDING", 2);
        REFUND_PENDING = paidOffPlanType3;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType paidOffPlanType4 = new com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType("UNKNOWN", 3);
        UNKNOWN = paidOffPlanType4;
        com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType[] paidOffPlanTypeArr = {paidOffPlanType, paidOffPlanType2, paidOffPlanType3, paidOffPlanType4};
        getHighResolutionOutputSizeshNQ4ISI = paidOffPlanTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paidOffPlanTypeArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.plandetails.PaidOffPlanType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
