package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "FROM_DATE", "TO_DATE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ActiveDatePicker {
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker FROM_DATE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker NONE;
    public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker TO_DATE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker[] getHighSpeedVideoSizes;

    private ActiveDatePicker(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker("NONE", 0);
        NONE = activeDatePicker;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker2 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker("FROM_DATE", 1);
        FROM_DATE = activeDatePicker2;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker3 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker("TO_DATE", 2);
        TO_DATE = activeDatePicker3;
        com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker[] activeDatePickerArr = {activeDatePicker, activeDatePicker2, activeDatePicker3};
        getHighSpeedVideoSizes = activeDatePickerArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(activeDatePickerArr);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker[] values() {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker) java.lang.Enum.valueOf(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
