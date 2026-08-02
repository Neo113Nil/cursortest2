package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/AutoSaveFlowType;", "", "<init>", "(Ljava/lang/String;I)V", "AutoSaveSetup", "AutoSaveManage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveFlowType {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType AutoSaveManage;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType AutoSaveSetup;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType[] getHighSpeedVideoFpsRanges;

    private AutoSaveFlowType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType autoSaveFlowType = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType("AutoSaveSetup", 0);
        AutoSaveSetup = autoSaveFlowType;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType autoSaveFlowType2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType("AutoSaveManage", 1);
        AutoSaveManage = autoSaveFlowType2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType[] autoSaveFlowTypeArr = {autoSaveFlowType, autoSaveFlowType2};
        getHighSpeedVideoFpsRanges = autoSaveFlowTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(autoSaveFlowTypeArr);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType[] values() {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveFlowType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
