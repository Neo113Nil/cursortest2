package com.paypal.oslo.feature.balance.domain.model.autoreload;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/PaymentMethodType;", "", "<init>", "(Ljava/lang/String;I)V", "BANK_ACCOUNT", "DEBIT_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentMethodType {
    public static final com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType BANK_ACCOUNT;
    public static final com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType DEBIT_CARD;
    private static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaymentMethodType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType paymentMethodType = new com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType("BANK_ACCOUNT", 0);
        BANK_ACCOUNT = paymentMethodType;
        com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType paymentMethodType2 = new com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType("DEBIT_CARD", 1);
        DEBIT_CARD = paymentMethodType2;
        com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType[] paymentMethodTypeArr = {paymentMethodType, paymentMethodType2};
        getHighSpeedVideoFpsRangesFor = paymentMethodTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paymentMethodTypeArr);
    }

    public static com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType[] values() {
        return (com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType) java.lang.Enum.valueOf(com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.balance.domain.model.autoreload.PaymentMethodType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
