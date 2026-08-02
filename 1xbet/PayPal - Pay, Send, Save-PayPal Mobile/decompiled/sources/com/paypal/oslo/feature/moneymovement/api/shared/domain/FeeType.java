package com.paypal.oslo.feature.moneymovement.api.shared.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/FeeType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, "SERVICE", "CONVERSION", "INSTANT_TRANSFER", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FeeType {
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType CONVERSION;
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType INSTANT_TRANSFER;
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType NETWORK;
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType NONE;
    public static final com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType SERVICE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType[] getHighSpeedVideoFpsRanges;

    private FeeType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType feeType = new com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase.NETWORK_ERROR_CODE, 0);
        NETWORK = feeType;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType feeType2 = new com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType("SERVICE", 1);
        SERVICE = feeType2;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType feeType3 = new com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType("CONVERSION", 2);
        CONVERSION = feeType3;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType feeType4 = new com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType("INSTANT_TRANSFER", 3);
        INSTANT_TRANSFER = feeType4;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType feeType5 = new com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType("NONE", 4);
        NONE = feeType5;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType[] feeTypeArr = {feeType, feeType2, feeType3, feeType4, feeType5};
        getHighSpeedVideoFpsRanges = feeTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(feeTypeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.shared.domain.FeeType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
