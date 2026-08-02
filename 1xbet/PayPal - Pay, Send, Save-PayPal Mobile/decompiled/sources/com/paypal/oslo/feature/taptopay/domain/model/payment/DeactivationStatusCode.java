package com.paypal.oslo.feature.taptopay.domain.model.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/payment/DeactivationStatusCode;", "", "<init>", "(Ljava/lang/String;I)V", "DEACTIVATION_FAILED", "DEACTIVATION_SUCCESS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeactivationStatusCode {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode DEACTIVATION_FAILED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode DEACTIVATION_SUCCESS;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode[] getHighSpeedVideoFpsRangesFor;

    private DeactivationStatusCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode deactivationStatusCode = new com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode("DEACTIVATION_FAILED", 0);
        DEACTIVATION_FAILED = deactivationStatusCode;
        com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode deactivationStatusCode2 = new com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode("DEACTIVATION_SUCCESS", 1);
        DEACTIVATION_SUCCESS = deactivationStatusCode2;
        com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode[] deactivationStatusCodeArr = {deactivationStatusCode, deactivationStatusCode2};
        getHighSpeedVideoFpsRangesFor = deactivationStatusCodeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(deactivationStatusCodeArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.payment.DeactivationStatusCode> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
