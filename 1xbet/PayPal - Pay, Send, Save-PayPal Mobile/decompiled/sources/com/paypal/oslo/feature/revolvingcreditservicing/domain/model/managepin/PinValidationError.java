package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinValidationError;", "", "<init>", "(Ljava/lang/String;I)V", "TOO_SHORT", "SEQUENTIAL_DIGITS", "SAME_DIGITS", "MISMATCH"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinValidationError {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError MISMATCH;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError SAME_DIGITS;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError SEQUENTIAL_DIGITS;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError TOO_SHORT;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError[] getHighSpeedVideoFpsRanges;

    private PinValidationError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError pinValidationError = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError("TOO_SHORT", 0);
        TOO_SHORT = pinValidationError;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError pinValidationError2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError("SEQUENTIAL_DIGITS", 1);
        SEQUENTIAL_DIGITS = pinValidationError2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError pinValidationError3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError("SAME_DIGITS", 2);
        SAME_DIGITS = pinValidationError3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError pinValidationError4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError("MISMATCH", 3);
        MISMATCH = pinValidationError4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError[] pinValidationErrorArr = {pinValidationError, pinValidationError2, pinValidationError3, pinValidationError4};
        getHighSpeedVideoFpsRanges = pinValidationErrorArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(pinValidationErrorArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
