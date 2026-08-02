package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/ActiveCurrency;", "", "<init>", "(Ljava/lang/String;I)V", "SENDER", "RECEIVER"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActiveCurrency {
    public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency RECEIVER;
    public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency SENDER;
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private ActiveCurrency(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency activeCurrency = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency("SENDER", 0);
        SENDER = activeCurrency;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency activeCurrency2 = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency("RECEIVER", 1);
        RECEIVER = activeCurrency2;
        com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency[] activeCurrencyArr = {activeCurrency, activeCurrency2};
        getHighSpeedVideoFpsRanges = activeCurrencyArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(activeCurrencyArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency[] values() {
        return (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.ActiveCurrency> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
