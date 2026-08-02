package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestIdType;", "", "<init>", "(Ljava/lang/String;I)V", "PAYMENT_CODE", "PAYMENT_REQUEST_ID"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentRequestIdType {
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType PAYMENT_CODE;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType PAYMENT_REQUEST_ID;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PaymentRequestIdType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType paymentRequestIdType = new com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType("PAYMENT_CODE", 0);
        PAYMENT_CODE = paymentRequestIdType;
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType paymentRequestIdType2 = new com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType("PAYMENT_REQUEST_ID", 1);
        PAYMENT_REQUEST_ID = paymentRequestIdType2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType[] paymentRequestIdTypeArr = {paymentRequestIdType, paymentRequestIdType2};
        getHighResolutionOutputSizeshNQ4ISI = paymentRequestIdTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentRequestIdTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.PaymentRequestIdType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
