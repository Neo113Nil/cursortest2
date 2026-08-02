package com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/FailureType;", "", "<init>", "(Ljava/lang/String;I)V", "ABOVE_MAXIMUM", "BELOW_MINIMUM", "GENERIC_FAILURE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FailureType {
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType ABOVE_MAXIMUM;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType BELOW_MINIMUM;
    public static final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType GENERIC_FAILURE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType[] getHighSpeedVideoSizes;

    private FailureType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType("ABOVE_MAXIMUM", 0);
        ABOVE_MAXIMUM = failureType;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType2 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType("BELOW_MINIMUM", 1);
        BELOW_MINIMUM = failureType2;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType failureType3 = new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType("GENERIC_FAILURE", 2);
        GENERIC_FAILURE = failureType3;
        com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType[] failureTypeArr = {failureType, failureType2, failureType3};
        getHighSpeedVideoSizes = failureTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(failureTypeArr);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType[] values() {
        return (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.FailureType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
