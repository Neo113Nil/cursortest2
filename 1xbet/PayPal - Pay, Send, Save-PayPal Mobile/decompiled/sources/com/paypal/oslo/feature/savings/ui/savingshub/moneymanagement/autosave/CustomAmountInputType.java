package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/CustomAmountInputType;", "", "<init>", "(Ljava/lang/String;I)V", "CREATE_GOAL", "MANAGE_AUTOSAVE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CustomAmountInputType {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType CREATE_GOAL;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType MANAGE_AUTOSAVE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CustomAmountInputType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType customAmountInputType = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType("CREATE_GOAL", 0);
        CREATE_GOAL = customAmountInputType;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType customAmountInputType2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType("MANAGE_AUTOSAVE", 1);
        MANAGE_AUTOSAVE = customAmountInputType2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType[] customAmountInputTypeArr = {customAmountInputType, customAmountInputType2};
        Camera2StreamConfigurationMap = customAmountInputTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(customAmountInputTypeArr);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType[] values() {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountInputType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
