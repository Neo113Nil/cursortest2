package com.paypal.oslo.feature.qrc.domain.model.cancelpayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/model/cancelpayment/QrcPaymentCancellationReason;", "", "<init>", "(Ljava/lang/String;I)V", "USER_CANCELLATION", "FUNDING_OPTIONS_UNAVAILABLE", "RISK_DECLINE", "THREE_D_SECURE_AUTHENTICATION_FAILURE", "INTERNAL_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QrcPaymentCancellationReason {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason FUNDING_OPTIONS_UNAVAILABLE;
    public static final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason INTERNAL_ERROR;
    public static final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason RISK_DECLINE;
    public static final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason THREE_D_SECURE_AUTHENTICATION_FAILURE;
    public static final com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason USER_CANCELLATION;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason[] getHighSpeedVideoFpsRangesFor;

    private QrcPaymentCancellationReason(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason = new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason("USER_CANCELLATION", 0);
        USER_CANCELLATION = qrcPaymentCancellationReason;
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason2 = new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason("FUNDING_OPTIONS_UNAVAILABLE", 1);
        FUNDING_OPTIONS_UNAVAILABLE = qrcPaymentCancellationReason2;
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason3 = new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason("RISK_DECLINE", 2);
        RISK_DECLINE = qrcPaymentCancellationReason3;
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason4 = new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason("THREE_D_SECURE_AUTHENTICATION_FAILURE", 3);
        THREE_D_SECURE_AUTHENTICATION_FAILURE = qrcPaymentCancellationReason4;
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason qrcPaymentCancellationReason5 = new com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason("INTERNAL_ERROR", 4);
        INTERNAL_ERROR = qrcPaymentCancellationReason5;
        com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason[] qrcPaymentCancellationReasonArr = {qrcPaymentCancellationReason, qrcPaymentCancellationReason2, qrcPaymentCancellationReason3, qrcPaymentCancellationReason4, qrcPaymentCancellationReason5};
        getHighSpeedVideoFpsRangesFor = qrcPaymentCancellationReasonArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(qrcPaymentCancellationReasonArr);
    }

    public static com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason[] values() {
        return (com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.domain.model.cancelpayment.QrcPaymentCancellationReason> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
