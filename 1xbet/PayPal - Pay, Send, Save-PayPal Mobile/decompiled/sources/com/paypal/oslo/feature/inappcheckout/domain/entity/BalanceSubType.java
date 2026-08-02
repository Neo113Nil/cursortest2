package com.paypal.oslo.feature.inappcheckout.domain.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BalanceSubType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "PPDC", "UNKNOWN__"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BalanceSubType {
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType BALANCE;
    private static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType PPDC;
    public static final com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType UNKNOWN__;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private BalanceSubType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType = new com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = balanceSubType;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType2 = new com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType("PPDC", 1);
        PPDC = balanceSubType2;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType balanceSubType3 = new com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType("UNKNOWN__", 2);
        UNKNOWN__ = balanceSubType3;
        com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType[] balanceSubTypeArr = {balanceSubType, balanceSubType2, balanceSubType3};
        Camera2StreamConfigurationMap = balanceSubTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(balanceSubTypeArr);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType[] values() {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType) java.lang.Enum.valueOf(com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.inappcheckout.domain.entity.BalanceSubType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
