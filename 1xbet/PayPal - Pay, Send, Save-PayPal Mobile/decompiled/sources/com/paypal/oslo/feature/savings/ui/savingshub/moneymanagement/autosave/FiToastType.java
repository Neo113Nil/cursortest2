package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/FiToastType;", "", "<init>", "(Ljava/lang/String;)V", "CREDIT_CARD_NOT_SUPPORTED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FiToastType {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType CREDIT_CARD_NOT_SUPPORTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType[] getHighSpeedVideoFpsRanges;

    private FiToastType(java.lang.String str) {
    }

    static {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType fiToastType = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType("CREDIT_CARD_NOT_SUPPORTED");
        CREDIT_CARD_NOT_SUPPORTED = fiToastType;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType[] fiToastTypeArr = {fiToastType};
        getHighSpeedVideoFpsRanges = fiToastTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(fiToastTypeArr);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType[] values() {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.FiToastType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
