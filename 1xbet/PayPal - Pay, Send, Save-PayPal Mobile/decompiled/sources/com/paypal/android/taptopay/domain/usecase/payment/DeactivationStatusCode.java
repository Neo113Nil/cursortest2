package com.paypal.android.taptopay.domain.usecase.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/android/taptopay/domain/usecase/payment/DeactivationStatusCode;", "", "<init>", "(Ljava/lang/String;I)V", "DEACTIVATION_FAILED", "DEACTIVATION_SUCCESS"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DeactivationStatusCode {
    public static final com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode DEACTIVATION_FAILED;
    public static final com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode DEACTIVATION_SUCCESS;
    private static final /* synthetic */ com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DeactivationStatusCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode deactivationStatusCode = new com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode("DEACTIVATION_FAILED", 0);
        DEACTIVATION_FAILED = deactivationStatusCode;
        com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode deactivationStatusCode2 = new com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode("DEACTIVATION_SUCCESS", 1);
        DEACTIVATION_SUCCESS = deactivationStatusCode2;
        com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode[] deactivationStatusCodeArr = {deactivationStatusCode, deactivationStatusCode2};
        getHighSpeedVideoFpsRanges = deactivationStatusCodeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(deactivationStatusCodeArr);
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode[] values() {
        return (com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode valueOf(java.lang.String str) {
        return (com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode) java.lang.Enum.valueOf(com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.domain.usecase.payment.DeactivationStatusCode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
