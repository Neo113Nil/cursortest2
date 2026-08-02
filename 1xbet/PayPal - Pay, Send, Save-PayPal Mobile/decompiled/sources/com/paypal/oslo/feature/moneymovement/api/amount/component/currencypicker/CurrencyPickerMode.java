package com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/amount/component/currencypicker/CurrencyPickerMode;", "", "<init>", "(Ljava/lang/String;I)V", "CASH_AND_CRYPTO", "CROSS_BORDER_DISPLAY_ONLY", "SINGLE", "DISPLAY_ONLY", "NONE"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyPickerMode {
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode CASH_AND_CRYPTO;
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode CROSS_BORDER_DISPLAY_ONLY;
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode DISPLAY_ONLY;
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode NONE;
    public static final com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode SINGLE;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode[] getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private CurrencyPickerMode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode currencyPickerMode = new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode("CASH_AND_CRYPTO", 0);
        CASH_AND_CRYPTO = currencyPickerMode;
        com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode currencyPickerMode2 = new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode("CROSS_BORDER_DISPLAY_ONLY", 1);
        CROSS_BORDER_DISPLAY_ONLY = currencyPickerMode2;
        com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode currencyPickerMode3 = new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode("SINGLE", 2);
        SINGLE = currencyPickerMode3;
        com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode currencyPickerMode4 = new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode("DISPLAY_ONLY", 3);
        DISPLAY_ONLY = currencyPickerMode4;
        com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode currencyPickerMode5 = new com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode("NONE", 4);
        NONE = currencyPickerMode5;
        com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode[] currencyPickerModeArr = {currencyPickerMode, currencyPickerMode2, currencyPickerMode3, currencyPickerMode4, currencyPickerMode5};
        getHighSpeedVideoFpsRangesFor = currencyPickerModeArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(currencyPickerModeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.amount.component.currencypicker.CurrencyPickerMode> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
