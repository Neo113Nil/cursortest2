package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/repayment/PaymentFundingInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", "CARD", "BANK", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaymentFundingInstrumentType {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType BALANCE;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType BANK;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType CARD;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PaymentFundingInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType paymentFundingInstrumentType = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType("CARD", 0);
        CARD = paymentFundingInstrumentType;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType paymentFundingInstrumentType2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType("BANK", 1);
        BANK = paymentFundingInstrumentType2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType paymentFundingInstrumentType3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 2);
        BALANCE = paymentFundingInstrumentType3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType paymentFundingInstrumentType4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType("UNKNOWN", 3);
        UNKNOWN = paymentFundingInstrumentType4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType[] paymentFundingInstrumentTypeArr = {paymentFundingInstrumentType, paymentFundingInstrumentType2, paymentFundingInstrumentType3, paymentFundingInstrumentType4};
        getHighResolutionOutputSizeshNQ4ISI = paymentFundingInstrumentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentFundingInstrumentTypeArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.repayment.PaymentFundingInstrumentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
