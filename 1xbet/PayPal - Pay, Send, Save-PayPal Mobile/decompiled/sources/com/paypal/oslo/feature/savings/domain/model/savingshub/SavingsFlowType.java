package com.paypal.oslo.feature.savings.domain.model.savingshub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsFlowType;", "", "<init>", "(Ljava/lang/String;)V", "SAVINGS_HOME_SCREEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsFlowType {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType SAVINGS_HOME_SCREEN;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType[] getHighSpeedVideoFpsRangesFor;

    private SavingsFlowType(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType savingsFlowType = new com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType("SAVINGS_HOME_SCREEN");
        SAVINGS_HOME_SCREEN = savingsFlowType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType[] savingsFlowTypeArr = {savingsFlowType};
        getHighSpeedVideoFpsRangesFor = savingsFlowTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(savingsFlowTypeArr);
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsFlowType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
