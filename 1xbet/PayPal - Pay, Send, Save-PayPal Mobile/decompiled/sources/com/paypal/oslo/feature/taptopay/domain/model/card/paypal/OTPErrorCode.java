package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/OTPErrorCode;", "", "<init>", "(Ljava/lang/String;I)V", "INCORRECT_OTP", "INCORRECT_OTP_MAX_TRY_EXCEEDED", "OTP_EXPIRED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OTPErrorCode {
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode INCORRECT_OTP;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode INCORRECT_OTP_MAX_TRY_EXCEEDED;
    public static final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode OTP_EXPIRED;
    private static final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private OTPErrorCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode("INCORRECT_OTP", 0);
        INCORRECT_OTP = oTPErrorCode;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode2 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode("INCORRECT_OTP_MAX_TRY_EXCEEDED", 1);
        INCORRECT_OTP_MAX_TRY_EXCEEDED = oTPErrorCode2;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode oTPErrorCode3 = new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode("OTP_EXPIRED", 2);
        OTP_EXPIRED = oTPErrorCode3;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode[] oTPErrorCodeArr = {oTPErrorCode, oTPErrorCode2, oTPErrorCode3};
        getHighResolutionOutputSizeshNQ4ISI = oTPErrorCodeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(oTPErrorCodeArr);
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode[] values() {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.OTPErrorCode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
