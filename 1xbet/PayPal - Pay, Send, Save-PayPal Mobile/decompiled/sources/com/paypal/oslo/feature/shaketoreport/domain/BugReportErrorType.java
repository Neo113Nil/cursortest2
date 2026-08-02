package com.paypal.oslo.feature.shaketoreport.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/shaketoreport/domain/BugReportErrorType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY, "HTTP", "AUTHENTICATION", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BugReportErrorType {
    public static final com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType API;
    public static final com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType AUTHENTICATION;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType HTTP;
    public static final com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType NETWORK;
    public static final com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType[] getHighSpeedVideoFpsRanges;

    static {
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType = new com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 0);
        NETWORK = bugReportErrorType;
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType2 = new com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType(com.izettle.android.auth.repository.BaseUriRepositoryImpl.API_SERVICE_KEY, 1);
        API = bugReportErrorType2;
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType3 = new com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType("HTTP", 2);
        HTTP = bugReportErrorType3;
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType4 = new com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType("AUTHENTICATION", 3);
        AUTHENTICATION = bugReportErrorType4;
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType bugReportErrorType5 = new com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType("UNKNOWN", 4);
        UNKNOWN = bugReportErrorType5;
        com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType[] bugReportErrorTypeArr = {bugReportErrorType, bugReportErrorType2, bugReportErrorType3, bugReportErrorType4, bugReportErrorType5};
        getHighSpeedVideoFpsRanges = bugReportErrorTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(bugReportErrorTypeArr);
    }

    private BugReportErrorType(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType[] values() {
        return (com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shaketoreport.domain.BugReportErrorType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
