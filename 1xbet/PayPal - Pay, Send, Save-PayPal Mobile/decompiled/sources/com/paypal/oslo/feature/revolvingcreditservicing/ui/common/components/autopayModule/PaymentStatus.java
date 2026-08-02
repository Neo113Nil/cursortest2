package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/autopayModule/PaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NoPaymentDue", "HasPaymentDue", "PaymentPastDue"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus HasPaymentDue;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus NoPaymentDue;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus PaymentPastDue;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus[] getHighSpeedVideoSizes;

    private PaymentStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus paymentStatus = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus("NoPaymentDue", 0);
        NoPaymentDue = paymentStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus paymentStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus("HasPaymentDue", 1);
        HasPaymentDue = paymentStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus paymentStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus("PaymentPastDue", 2);
        PaymentPastDue = paymentStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus[] paymentStatusArr = {paymentStatus, paymentStatus2, paymentStatus3};
        getHighSpeedVideoSizes = paymentStatusArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.autopayModule.PaymentStatus> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
