package com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/sell/review/model/CryptoSellPaymentOptionType;", "", "<init>", "(Ljava/lang/String;I)V", com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, "PYUSD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoSellPaymentOptionType {
    public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType BALANCE;
    public static final com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType PYUSD;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private CryptoSellPaymentOptionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType cryptoSellPaymentOptionType = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType(com.paypal.oslo.feature.balance.ui.balanceDashboard.BalanceDashboardViewModelKt.ActivityWidgetFundingSourceBalance, 0);
        BALANCE = cryptoSellPaymentOptionType;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType cryptoSellPaymentOptionType2 = new com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType("PYUSD", 1);
        PYUSD = cryptoSellPaymentOptionType2;
        com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType[] cryptoSellPaymentOptionTypeArr = {cryptoSellPaymentOptionType, cryptoSellPaymentOptionType2};
        getHighResolutionOutputSizeshNQ4ISI = cryptoSellPaymentOptionTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(cryptoSellPaymentOptionTypeArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.ui.sell.review.model.CryptoSellPaymentOptionType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
