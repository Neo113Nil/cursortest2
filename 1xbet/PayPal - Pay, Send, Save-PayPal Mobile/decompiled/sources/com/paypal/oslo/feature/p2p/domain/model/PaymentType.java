package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, "PURCHASE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentType {
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentType PERSONAL;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentType PURCHASE;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PaymentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType = new com.paypal.oslo.feature.p2p.domain.model.PaymentType(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, 0);
        PERSONAL = paymentType;
        com.paypal.oslo.feature.p2p.domain.model.PaymentType paymentType2 = new com.paypal.oslo.feature.p2p.domain.model.PaymentType("PURCHASE", 1);
        PURCHASE = paymentType2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentType[] paymentTypeArr = {paymentType, paymentType2};
        getHighSpeedVideoFpsRanges = paymentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentType[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.PaymentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.PaymentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
