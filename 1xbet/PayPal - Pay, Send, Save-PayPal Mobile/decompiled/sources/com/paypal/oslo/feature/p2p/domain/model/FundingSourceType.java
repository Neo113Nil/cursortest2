package com.paypal.oslo.feature.p2p.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/FundingSourceType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "BANK_ACCOUNT", "DEBIT_CARD", "CREDIT_CARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FundingSourceType {
    public static final com.paypal.oslo.feature.p2p.domain.model.FundingSourceType BALANCE;
    public static final com.paypal.oslo.feature.p2p.domain.model.FundingSourceType BANK_ACCOUNT;
    public static final com.paypal.oslo.feature.p2p.domain.model.FundingSourceType CREDIT_CARD;
    public static final com.paypal.oslo.feature.p2p.domain.model.FundingSourceType DEBIT_CARD;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.FundingSourceType[] getHighSpeedVideoSizes;

    private FundingSourceType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.p2p.domain.model.FundingSourceType fundingSourceType = new com.paypal.oslo.feature.p2p.domain.model.FundingSourceType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = fundingSourceType;
        com.paypal.oslo.feature.p2p.domain.model.FundingSourceType fundingSourceType2 = new com.paypal.oslo.feature.p2p.domain.model.FundingSourceType("BANK_ACCOUNT", 1);
        BANK_ACCOUNT = fundingSourceType2;
        com.paypal.oslo.feature.p2p.domain.model.FundingSourceType fundingSourceType3 = new com.paypal.oslo.feature.p2p.domain.model.FundingSourceType("DEBIT_CARD", 2);
        DEBIT_CARD = fundingSourceType3;
        com.paypal.oslo.feature.p2p.domain.model.FundingSourceType fundingSourceType4 = new com.paypal.oslo.feature.p2p.domain.model.FundingSourceType("CREDIT_CARD", 3);
        CREDIT_CARD = fundingSourceType4;
        com.paypal.oslo.feature.p2p.domain.model.FundingSourceType[] fundingSourceTypeArr = {fundingSourceType, fundingSourceType2, fundingSourceType3, fundingSourceType4};
        getHighSpeedVideoSizes = fundingSourceTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(fundingSourceTypeArr);
    }

    public static com.paypal.oslo.feature.p2p.domain.model.FundingSourceType[] values() {
        return (com.paypal.oslo.feature.p2p.domain.model.FundingSourceType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.p2p.domain.model.FundingSourceType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.p2p.domain.model.FundingSourceType) java.lang.Enum.valueOf(com.paypal.oslo.feature.p2p.domain.model.FundingSourceType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.p2p.domain.model.FundingSourceType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
