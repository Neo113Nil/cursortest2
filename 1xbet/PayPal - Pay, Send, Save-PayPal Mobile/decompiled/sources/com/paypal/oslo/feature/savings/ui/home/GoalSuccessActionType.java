package com.paypal.oslo.feature.savings.ui.home;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;", "", "<init>", "(Ljava/lang/String;I)V", "TransferMoney", "ViewGoal"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GoalSuccessActionType {
    public static final com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType TransferMoney;
    public static final com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType ViewGoal;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType[] getHighSpeedVideoFpsRangesFor;

    private GoalSuccessActionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType goalSuccessActionType = new com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType("TransferMoney", 0);
        TransferMoney = goalSuccessActionType;
        com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType goalSuccessActionType2 = new com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType("ViewGoal", 1);
        ViewGoal = goalSuccessActionType2;
        com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType[] goalSuccessActionTypeArr = {goalSuccessActionType, goalSuccessActionType2};
        getHighSpeedVideoFpsRangesFor = goalSuccessActionTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(goalSuccessActionTypeArr);
    }

    public static com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType[] values() {
        return (com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
