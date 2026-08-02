package com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/ErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "SERVER", "AUTHENTICATION", "UNKNOWN", "FEATURE_UNAVAILABLE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorType {
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType AUTHENTICATION;
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType FEATURE_UNAVAILABLE;
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType NETWORK;
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType NONE;
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType SERVER;
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType[] getHighSpeedVideoSizes;

    private ErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType = new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType("NONE", 0);
        NONE = errorType;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType2 = new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 1);
        NETWORK = errorType2;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType3 = new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType("SERVER", 2);
        SERVER = errorType3;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType4 = new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType("AUTHENTICATION", 3);
        AUTHENTICATION = errorType4;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType5 = new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType("UNKNOWN", 4);
        UNKNOWN = errorType5;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType errorType6 = new com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType("FEATURE_UNAVAILABLE", 5);
        FEATURE_UNAVAILABLE = errorType6;
        com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4, errorType5, errorType6};
        getHighSpeedVideoSizes = errorTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(errorTypeArr);
    }

    public static com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType[] values() {
        return (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
