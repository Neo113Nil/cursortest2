package com.paypal.oslo.feature.moneymovement.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/DisbursementDestinationType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "CRYPTOCURRENCY", "CHECK", "PAYMENT_TOKEN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DisbursementDestinationType {
    public static final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType BALANCE;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType BANK;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType CARD;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType CHECK;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType CRYPTOCURRENCY;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType PAYMENT_TOKEN;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DisbursementDestinationType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType = new com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = disbursementDestinationType;
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType2 = new com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType("BANK", 1);
        BANK = disbursementDestinationType2;
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType3 = new com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType("CARD", 2);
        CARD = disbursementDestinationType3;
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType4 = new com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType("CRYPTOCURRENCY", 3);
        CRYPTOCURRENCY = disbursementDestinationType4;
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType5 = new com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType("CHECK", 4);
        CHECK = disbursementDestinationType5;
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType disbursementDestinationType6 = new com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType("PAYMENT_TOKEN", 5);
        PAYMENT_TOKEN = disbursementDestinationType6;
        com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType[] disbursementDestinationTypeArr = {disbursementDestinationType, disbursementDestinationType2, disbursementDestinationType3, disbursementDestinationType4, disbursementDestinationType5, disbursementDestinationType6};
        getHighSpeedVideoFpsRanges = disbursementDestinationTypeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(disbursementDestinationTypeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.domain.DisbursementDestinationType> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
