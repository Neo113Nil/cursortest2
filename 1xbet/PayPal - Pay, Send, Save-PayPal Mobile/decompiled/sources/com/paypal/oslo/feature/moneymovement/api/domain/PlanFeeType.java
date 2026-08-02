package com.paypal.oslo.feature.moneymovement.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/PlanFeeType;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSACTION", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "TAX", "CROSS_BORDER", "OTHER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlanFeeType {
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType CROSS_BORDER;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType NETWORK;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType OTHER;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType TAX;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType TRANSACTION;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PlanFeeType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType = new com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType("TRANSACTION", 0);
        TRANSACTION = planFeeType;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType2 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 1);
        NETWORK = planFeeType2;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType3 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType("TAX", 2);
        TAX = planFeeType3;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType4 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType("CROSS_BORDER", 3);
        CROSS_BORDER = planFeeType4;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType planFeeType5 = new com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType("OTHER", 4);
        OTHER = planFeeType5;
        com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType[] planFeeTypeArr = {planFeeType, planFeeType2, planFeeType3, planFeeType4, planFeeType5};
        Camera2StreamConfigurationMap = planFeeTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(planFeeTypeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.domain.PlanFeeType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
