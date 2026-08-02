package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/PaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NO_PAYMENT_DUE", "MINIMUM_PAYMENT_DUE", "PAST_DUE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus MINIMUM_PAYMENT_DUE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus NO_PAYMENT_DUE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus PAST_DUE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus[] getHighSpeedVideoSizes;

    private PaymentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus("NO_PAYMENT_DUE", 0);
        NO_PAYMENT_DUE = paymentStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus("MINIMUM_PAYMENT_DUE", 1);
        MINIMUM_PAYMENT_DUE = paymentStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus("PAST_DUE", 2);
        PAST_DUE = paymentStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus paymentStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus("UNKNOWN", 3);
        UNKNOWN = paymentStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus[] paymentStatusArr = {paymentStatus, paymentStatus2, paymentStatus3, paymentStatus4};
        getHighSpeedVideoSizes = paymentStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.PaymentStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
