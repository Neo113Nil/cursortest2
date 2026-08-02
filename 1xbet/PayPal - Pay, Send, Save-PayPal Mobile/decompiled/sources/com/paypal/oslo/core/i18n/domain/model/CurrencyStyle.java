package com.paypal.oslo.core.i18n.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;", "", "<init>", "(Ljava/lang/String;I)V", "CODE", "SYMBOL", "INTERNATIONAL", "NAME"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CurrencyStyle {
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyStyle CODE;
    private static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyStyle[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyStyle INTERNATIONAL;
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyStyle NAME;
    public static final com.paypal.oslo.core.i18n.domain.model.CurrencyStyle SYMBOL;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private CurrencyStyle(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle = new com.paypal.oslo.core.i18n.domain.model.CurrencyStyle("CODE", 0);
        CODE = currencyStyle;
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle2 = new com.paypal.oslo.core.i18n.domain.model.CurrencyStyle("SYMBOL", 1);
        SYMBOL = currencyStyle2;
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle3 = new com.paypal.oslo.core.i18n.domain.model.CurrencyStyle("INTERNATIONAL", 2);
        INTERNATIONAL = currencyStyle3;
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle currencyStyle4 = new com.paypal.oslo.core.i18n.domain.model.CurrencyStyle("NAME", 3);
        NAME = currencyStyle4;
        com.paypal.oslo.core.i18n.domain.model.CurrencyStyle[] currencyStyleArr = {currencyStyle, currencyStyle2, currencyStyle3, currencyStyle4};
        Camera2StreamConfigurationMap = currencyStyleArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(currencyStyleArr);
    }

    public static com.paypal.oslo.core.i18n.domain.model.CurrencyStyle[] values() {
        return (com.paypal.oslo.core.i18n.domain.model.CurrencyStyle[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.core.i18n.domain.model.CurrencyStyle valueOf(java.lang.String str) {
        return (com.paypal.oslo.core.i18n.domain.model.CurrencyStyle) java.lang.Enum.valueOf(com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.core.i18n.domain.model.CurrencyStyle> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
