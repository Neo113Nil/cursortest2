package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/makepayment/PaymentType;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOPAY", "REAL_TIME", "SCHEDULED", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType AUTOPAY;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType REAL_TIME;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType SCHEDULED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType UNKNOWN__;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PaymentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType paymentType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType("AUTOPAY", 0);
        AUTOPAY = paymentType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType paymentType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType("REAL_TIME", 1);
        REAL_TIME = paymentType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType paymentType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType("SCHEDULED", 2);
        SCHEDULED = paymentType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType paymentType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType("UNKNOWN__", 3);
        UNKNOWN__ = paymentType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType[] paymentTypeArr = {paymentType, paymentType2, paymentType3, paymentType4};
        getHighResolutionOutputSizeshNQ4ISI = paymentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.makepayment.PaymentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
