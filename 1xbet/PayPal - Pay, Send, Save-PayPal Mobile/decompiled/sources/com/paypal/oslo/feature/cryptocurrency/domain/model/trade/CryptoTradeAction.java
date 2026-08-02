package com.paypal.oslo.feature.cryptocurrency.domain.model.trade;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/trade/CryptoTradeAction;", "", "<init>", "(Ljava/lang/String;I)V", "BUY", "SELL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoTradeAction {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction BUY;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction SELL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction[] getHighSpeedVideoFpsRangesFor;

    private CryptoTradeAction(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction = new com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction("BUY", 0);
        BUY = cryptoTradeAction;
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction cryptoTradeAction2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction("SELL", 1);
        SELL = cryptoTradeAction2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction[] cryptoTradeActionArr = {cryptoTradeAction, cryptoTradeAction2};
        getHighSpeedVideoFpsRangesFor = cryptoTradeActionArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(cryptoTradeActionArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.domain.model.trade.CryptoTradeAction> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
