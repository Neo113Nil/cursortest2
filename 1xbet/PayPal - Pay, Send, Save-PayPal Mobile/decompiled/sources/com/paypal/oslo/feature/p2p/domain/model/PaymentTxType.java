package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTxType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, "PURCHASE", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentTxType {
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTxType PERSONAL;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTxType PURCHASE;
    public static final com.paypal.oslo.feature.p2p.domain.model.PaymentTxType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentTxType[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private PaymentTxType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType = new com.paypal.oslo.feature.p2p.domain.model.PaymentTxType(com.paypal.oslo.feature.balance.common.BalanceConstants.AccountType.PERSONAL, 0);
        PERSONAL = paymentTxType;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType2 = new com.paypal.oslo.feature.p2p.domain.model.PaymentTxType("PURCHASE", 1);
        PURCHASE = paymentTxType2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType3 = new com.paypal.oslo.feature.p2p.domain.model.PaymentTxType("UNKNOWN", 2);
        UNKNOWN = paymentTxType3;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType[] paymentTxTypeArr = {paymentTxType, paymentTxType2, paymentTxType3};
        getHighSpeedVideoFpsRangesFor = paymentTxTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(paymentTxTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentTxType[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentTxType[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.PaymentTxType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.PaymentTxType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.PaymentTxType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
