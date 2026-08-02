package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/autosave/CustomAmountValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class CustomAmountValidationError {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError getHighResolutionOutputSizeshNQ4ISI;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError[] getHighSpeedVideoSizes;

    private CustomAmountValidationError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError customAmountValidationError = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError("MINIMUM", 0);
        getHighSpeedVideoFpsRanges = customAmountValidationError;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError customAmountValidationError2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError("MAXIMUM", 1);
        getHighResolutionOutputSizeshNQ4ISI = customAmountValidationError2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError[] customAmountValidationErrorArr = {customAmountValidationError, customAmountValidationError2};
        getHighSpeedVideoSizes = customAmountValidationErrorArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(customAmountValidationErrorArr);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError[] values() {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.CustomAmountValidationError.class, str);
    }
}
