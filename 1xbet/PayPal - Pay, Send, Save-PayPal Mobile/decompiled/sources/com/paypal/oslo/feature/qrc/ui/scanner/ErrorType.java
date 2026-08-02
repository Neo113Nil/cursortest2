package com.paypal.oslo.feature.qrc.ui.scanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/scanner/ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE, "UNSUPPORTED", "TIMEOUT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ErrorType {
    public static final com.paypal.oslo.feature.qrc.ui.scanner.ErrorType GENERIC_ERROR;
    public static final com.paypal.oslo.feature.qrc.ui.scanner.ErrorType NO_INTERNET;
    public static final com.paypal.oslo.feature.qrc.ui.scanner.ErrorType TIMEOUT;
    public static final com.paypal.oslo.feature.qrc.ui.scanner.ErrorType UNSUPPORTED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.scanner.ErrorType[] getHighSpeedVideoFpsRangesFor;

    private ErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType = new com.paypal.oslo.feature.qrc.ui.scanner.ErrorType(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR, 0);
        GENERIC_ERROR = errorType;
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType2 = new com.paypal.oslo.feature.qrc.ui.scanner.ErrorType(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorDescriptions.Network.NO_INTERNET_CODE, 1);
        NO_INTERNET = errorType2;
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType3 = new com.paypal.oslo.feature.qrc.ui.scanner.ErrorType("UNSUPPORTED", 2);
        UNSUPPORTED = errorType3;
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType errorType4 = new com.paypal.oslo.feature.qrc.ui.scanner.ErrorType("TIMEOUT", 3);
        TIMEOUT = errorType4;
        com.paypal.oslo.feature.qrc.ui.scanner.ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4};
        getHighSpeedVideoFpsRangesFor = errorTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(errorTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.ErrorType[] values() {
        return (com.paypal.oslo.feature.qrc.ui.scanner.ErrorType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.scanner.ErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.scanner.ErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.scanner.ErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.scanner.ErrorType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
