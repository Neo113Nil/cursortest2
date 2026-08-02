package com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemCaptureType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "SAVINGS", "DONATION"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RedeemCaptureType {
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType BALANCE;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType DONATION;
    public static final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType SAVINGS;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType[] getHighSpeedVideoFpsRanges;

    private RedeemCaptureType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType redeemCaptureType = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = redeemCaptureType;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType redeemCaptureType2 = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType("SAVINGS", 1);
        SAVINGS = redeemCaptureType2;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType redeemCaptureType3 = new com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType("DONATION", 2);
        DONATION = redeemCaptureType3;
        com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType[] redeemCaptureTypeArr = {redeemCaptureType, redeemCaptureType2, redeemCaptureType3};
        getHighSpeedVideoFpsRanges = redeemCaptureTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(redeemCaptureTypeArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemCaptureType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
