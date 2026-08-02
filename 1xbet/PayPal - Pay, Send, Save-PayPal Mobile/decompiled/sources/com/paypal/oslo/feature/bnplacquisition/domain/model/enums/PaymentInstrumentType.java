package com.paypal.oslo.feature.bnplacquisition.domain.model.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/PaymentInstrumentType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CREDIT_CARD", "DEBIT_CARD", "PREPAID_CARD", "CREDIT", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PaymentInstrumentType {
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType BALANCE;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType BANK;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType CREDIT;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType CREDIT_CARD;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType DEBIT_CARD;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType PREPAID_CARD;
    public static final com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private PaymentInstrumentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = paymentInstrumentType;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType2 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType("BANK", 1);
        BANK = paymentInstrumentType2;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType3 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType("CREDIT_CARD", 2);
        CREDIT_CARD = paymentInstrumentType3;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType4 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType("DEBIT_CARD", 3);
        DEBIT_CARD = paymentInstrumentType4;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType5 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType("PREPAID_CARD", 4);
        PREPAID_CARD = paymentInstrumentType5;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType6 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType("CREDIT", 5);
        CREDIT = paymentInstrumentType6;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType paymentInstrumentType7 = new com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType("UNKNOWN", 6);
        UNKNOWN = paymentInstrumentType7;
        com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType[] paymentInstrumentTypeArr = {paymentInstrumentType, paymentInstrumentType2, paymentInstrumentType3, paymentInstrumentType4, paymentInstrumentType5, paymentInstrumentType6, paymentInstrumentType7};
        getHighResolutionOutputSizeshNQ4ISI = paymentInstrumentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(paymentInstrumentTypeArr);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType[] values() {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplacquisition.domain.model.enums.PaymentInstrumentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
