package com.paypal.oslo.feature.moneymovement.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanDisclosureAlertType;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "WARNING", "INFO"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanDisclosureAlertType {
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType ERROR;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType INFO;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType WARNING;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PlanDisclosureAlertType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType = new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType("ERROR", 0);
        ERROR = planDisclosureAlertType;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType2 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType("WARNING", 1);
        WARNING = planDisclosureAlertType2;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType planDisclosureAlertType3 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType("INFO", 2);
        INFO = planDisclosureAlertType3;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType[] planDisclosureAlertTypeArr = {planDisclosureAlertType, planDisclosureAlertType2, planDisclosureAlertType3};
        getHighSpeedVideoFpsRanges = planDisclosureAlertTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(planDisclosureAlertTypeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.domain.PlanDisclosureAlertType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
