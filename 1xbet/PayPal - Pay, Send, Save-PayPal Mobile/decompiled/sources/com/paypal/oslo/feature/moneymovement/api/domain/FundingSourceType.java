package com.paypal.oslo.feature.moneymovement.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/domain/FundingSourceType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK", "CARD", "CRYPTOCURRENCY", "CREDIT", "PAYMENT_TOKEN", "REWARDS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FundingSourceType {
    public static final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType BALANCE;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType BANK;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType CARD;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType CREDIT;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType CRYPTOCURRENCY;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType PAYMENT_TOKEN;
    public static final com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType REWARDS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType[] getHighSpeedVideoSizes;

    private FundingSourceType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType = new com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = fundingSourceType;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType2 = new com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType("BANK", 1);
        BANK = fundingSourceType2;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType3 = new com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType("CARD", 2);
        CARD = fundingSourceType3;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType4 = new com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType("CRYPTOCURRENCY", 3);
        CRYPTOCURRENCY = fundingSourceType4;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType5 = new com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType("CREDIT", 4);
        CREDIT = fundingSourceType5;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType6 = new com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType("PAYMENT_TOKEN", 5);
        PAYMENT_TOKEN = fundingSourceType6;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType fundingSourceType7 = new com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType("REWARDS", 6);
        REWARDS = fundingSourceType7;
        com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType[] fundingSourceTypeArr = {fundingSourceType, fundingSourceType2, fundingSourceType3, fundingSourceType4, fundingSourceType5, fundingSourceType6, fundingSourceType7};
        getHighSpeedVideoSizes = fundingSourceTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(fundingSourceTypeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.domain.FundingSourceType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
