package com.paypal.oslo.feature.savings.domain.model.savingshub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/SavingsInitialFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "AUTO_SAVE", "CREATE_GOAL", "GOAL_DETAILS", "TRANSFER_TO_SAVINGS", "ADD_MONEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsInitialFlowType {
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType ADD_MONEY;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType AUTO_SAVE;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType CREATE_GOAL;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType GOAL_DETAILS;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType NONE;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType TRANSFER_TO_SAVINGS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType[] getHighSpeedVideoSizes;

    private SavingsInitialFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType = new com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType("NONE", 0);
        NONE = savingsInitialFlowType;
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType2 = new com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType("AUTO_SAVE", 1);
        AUTO_SAVE = savingsInitialFlowType2;
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType3 = new com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType("CREATE_GOAL", 2);
        CREATE_GOAL = savingsInitialFlowType3;
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType4 = new com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType("GOAL_DETAILS", 3);
        GOAL_DETAILS = savingsInitialFlowType4;
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType5 = new com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType("TRANSFER_TO_SAVINGS", 4);
        TRANSFER_TO_SAVINGS = savingsInitialFlowType5;
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType savingsInitialFlowType6 = new com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType("ADD_MONEY", 5);
        ADD_MONEY = savingsInitialFlowType6;
        com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType[] savingsInitialFlowTypeArr = {savingsInitialFlowType, savingsInitialFlowType2, savingsInitialFlowType3, savingsInitialFlowType4, savingsInitialFlowType5, savingsInitialFlowType6};
        getHighSpeedVideoSizes = savingsInitialFlowTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(savingsInitialFlowTypeArr);
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType[] values() {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.domain.model.savingshub.SavingsInitialFlowType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
