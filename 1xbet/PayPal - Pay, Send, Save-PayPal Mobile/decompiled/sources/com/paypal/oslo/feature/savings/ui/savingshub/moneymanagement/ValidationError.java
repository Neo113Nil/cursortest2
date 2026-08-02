package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/ValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
final class ValidationError {
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    public static final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError[] getHighSpeedVideoSizes;

    private ValidationError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError("MINIMUM", 0);
        Camera2StreamConfigurationMap = validationError;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError("MAXIMUM", 1);
        getHighSpeedVideoFpsRangesFor = validationError2;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError validationError3 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError("EXCEEDS_AVAILABLE", 2);
        getHighResolutionOutputSizeshNQ4ISI = validationError3;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError[] validationErrorArr = {validationError, validationError2, validationError3};
        getHighSpeedVideoSizes = validationErrorArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(validationErrorArr);
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError[] values() {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError) java.lang.Enum.valueOf(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ValidationError.class, str);
    }
}
