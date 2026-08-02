package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/autopay/PaymentOption;", "", "<init>", "(Ljava/lang/String;I)V", "MINIMUM_PAYMENT_DUE", "STATEMENT_BALANCE", "CURRENT_BALANCE", "CUSTOM_AMOUNT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaymentOption {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption CURRENT_BALANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption CUSTOM_AMOUNT;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption MINIMUM_PAYMENT_DUE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption STATEMENT_BALANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaymentOption(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption("MINIMUM_PAYMENT_DUE", 0);
        MINIMUM_PAYMENT_DUE = paymentOption;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption("STATEMENT_BALANCE", 1);
        STATEMENT_BALANCE = paymentOption2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption("CURRENT_BALANCE", 2);
        CURRENT_BALANCE = paymentOption3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption("CUSTOM_AMOUNT", 3);
        CUSTOM_AMOUNT = paymentOption4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption paymentOption5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption("UNKNOWN", 4);
        UNKNOWN = paymentOption5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption[] paymentOptionArr = {paymentOption, paymentOption2, paymentOption3, paymentOption4, paymentOption5};
        Camera2StreamConfigurationMap = paymentOptionArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paymentOptionArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.autopay.PaymentOption> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
