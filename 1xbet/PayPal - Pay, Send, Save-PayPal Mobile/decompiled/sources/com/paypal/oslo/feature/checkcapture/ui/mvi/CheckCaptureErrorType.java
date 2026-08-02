package com.paypal.oslo.feature.checkcapture.ui.mvi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/checkcapture/ui/mvi/CheckCaptureErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "FEATURE_DISABLED", "AUTHENTICATION_FAILED", "NETWORK_ERROR", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckCaptureErrorType {
    public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType AUTHENTICATION_FAILED;
    public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType FEATURE_DISABLED;
    public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType GENERIC_ERROR;
    public static final com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType NETWORK_ERROR;
    private static final /* synthetic */ com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private CheckCaptureErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType("FEATURE_DISABLED", 0);
        FEATURE_DISABLED = checkCaptureErrorType;
        com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType2 = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType("AUTHENTICATION_FAILED", 1);
        AUTHENTICATION_FAILED = checkCaptureErrorType2;
        com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType3 = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType("NETWORK_ERROR", 2);
        NETWORK_ERROR = checkCaptureErrorType3;
        com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType checkCaptureErrorType4 = new com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 3);
        GENERIC_ERROR = checkCaptureErrorType4;
        com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType[] checkCaptureErrorTypeArr = {checkCaptureErrorType, checkCaptureErrorType2, checkCaptureErrorType3, checkCaptureErrorType4};
        getHighResolutionOutputSizeshNQ4ISI = checkCaptureErrorTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(checkCaptureErrorTypeArr);
    }

    public static com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType[] values() {
        return (com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.checkcapture.ui.mvi.CheckCaptureErrorType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
