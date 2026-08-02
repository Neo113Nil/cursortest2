package com.paypal.oslo.feature.balance.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/balance/common/BalanceErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "GENERIC", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "CRITICAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BalanceErrorType {
    public static final com.paypal.oslo.feature.balance.common.BalanceErrorType CRITICAL;
    public static final com.paypal.oslo.feature.balance.common.BalanceErrorType GENERIC;
    public static final com.paypal.oslo.feature.balance.common.BalanceErrorType NETWORK;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.common.BalanceErrorType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BalanceErrorType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.common.BalanceErrorType balanceErrorType = new com.paypal.oslo.feature.balance.common.BalanceErrorType("GENERIC", 0);
        GENERIC = balanceErrorType;
        com.paypal.oslo.feature.balance.common.BalanceErrorType balanceErrorType2 = new com.paypal.oslo.feature.balance.common.BalanceErrorType(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 1);
        NETWORK = balanceErrorType2;
        com.paypal.oslo.feature.balance.common.BalanceErrorType balanceErrorType3 = new com.paypal.oslo.feature.balance.common.BalanceErrorType("CRITICAL", 2);
        CRITICAL = balanceErrorType3;
        com.paypal.oslo.feature.balance.common.BalanceErrorType[] balanceErrorTypeArr = {balanceErrorType, balanceErrorType2, balanceErrorType3};
        getHighResolutionOutputSizeshNQ4ISI = balanceErrorTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(balanceErrorTypeArr);
    }

    public static com.paypal.oslo.feature.balance.common.BalanceErrorType[] values() {
        return (com.paypal.oslo.feature.balance.common.BalanceErrorType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.balance.common.BalanceErrorType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.common.BalanceErrorType) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.common.BalanceErrorType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.common.BalanceErrorType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
