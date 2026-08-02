package com.paypal.oslo.feature.moneymovement.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureType;", "", "<init>", "(Ljava/lang/String;I)V", "QUASI_CASH", "BANK_ACCOUNT_ECHECK", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanDisclosureType {
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType BANK_ACCOUNT_ECHECK;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType QUASI_CASH;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PlanDisclosureType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType = new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType("QUASI_CASH", 0);
        QUASI_CASH = planDisclosureType;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType2 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType("BANK_ACCOUNT_ECHECK", 1);
        BANK_ACCOUNT_ECHECK = planDisclosureType2;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType planDisclosureType3 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType("UNKNOWN", 2);
        UNKNOWN = planDisclosureType3;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType[] planDisclosureTypeArr = {planDisclosureType, planDisclosureType2, planDisclosureType3};
        getHighSpeedVideoFpsRanges = planDisclosureTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(planDisclosureTypeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
