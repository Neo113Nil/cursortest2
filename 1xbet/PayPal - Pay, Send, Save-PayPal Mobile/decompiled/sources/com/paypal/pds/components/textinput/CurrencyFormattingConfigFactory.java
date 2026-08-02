package com.paypal.pds.components.textinput;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/pds/components/textinput/CurrencyFormattingConfigFactory;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "", "localeString", "Ljava/util/Currency;", "currency", "", "disableFractionalEntry", "Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "create", "(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Currency;Z)Lcom/paypal/pds/components/textinput/CurrencyFormattingConfig;", "p0", "Camera2StreamConfigurationMap", "(Ljava/lang/String;)Ljava/util/Locale;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CurrencyFormattingConfigFactory {
    public static final int $stable = 0;
    public static final com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory INSTANCE = new com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory();

    private CurrencyFormattingConfigFactory() {
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.CurrencyFormattingConfig create$default(com.paypal.pds.components.textinput.CurrencyFormattingConfigFactory currencyFormattingConfigFactory, java.util.Locale locale, java.lang.String str, java.util.Currency currency, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = null;
        }
        if ((i & 2) != 0) {
            str = "en_US";
        }
        return currencyFormattingConfigFactory.create(locale, str, currency, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r7 == null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.pds.components.textinput.CurrencyFormattingConfig create(java.util.Locale locale, java.lang.String localeString, java.util.Currency currency, boolean disableFractionalEntry) {
        java.util.Locale Camera2StreamConfigurationMap;
        int i;
        java.util.Set set;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        if (locale != null) {
            java.lang.String obj = locale.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(obj);
        }
        if (localeString == null) {
            localeString = "";
        }
        Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(localeString);
        java.text.DecimalFormatSymbols decimalFormatSymbols = java.text.DecimalFormatSymbols.getInstance(Camera2StreamConfigurationMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(decimalFormatSymbols, "");
        if (!disableFractionalEntry) {
            set = com.paypal.pds.components.textinput.CurrencyOutputTransformationKt.getHighResolutionOutputSizeshNQ4ISI;
            if (!set.contains(currency.getCurrencyCode())) {
                i = currency.getDefaultFractionDigits();
                int i2 = i;
                java.lang.String symbol = !kotlin.jvm.internal.Intrinsics.areEqual(currency.getCurrencyCode(), "USD") ? com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD : currency.getSymbol(Camera2StreamConfigurationMap);
                char zeroDigit = decimalFormatSymbols.getZeroDigit();
                char groupingSeparator = decimalFormatSymbols.getGroupingSeparator();
                char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
                kotlin.jvm.internal.Intrinsics.checkNotNull(symbol);
                return new com.paypal.pds.components.textinput.CurrencyFormattingConfig(i2, zeroDigit, groupingSeparator, decimalSeparator, symbol);
            }
        }
        i = 0;
        int i22 = i;
        java.lang.String symbol2 = !kotlin.jvm.internal.Intrinsics.areEqual(currency.getCurrencyCode(), "USD") ? com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD : currency.getSymbol(Camera2StreamConfigurationMap);
        char zeroDigit2 = decimalFormatSymbols.getZeroDigit();
        char groupingSeparator2 = decimalFormatSymbols.getGroupingSeparator();
        char decimalSeparator2 = decimalFormatSymbols.getDecimalSeparator();
        kotlin.jvm.internal.Intrinsics.checkNotNull(symbol2);
        return new com.paypal.pds.components.textinput.CurrencyFormattingConfig(i22, zeroDigit2, groupingSeparator2, decimalSeparator2, symbol2);
    }

    private static java.util.Locale Camera2StreamConfigurationMap(java.lang.String p0) {
        java.lang.String str = p0;
        java.lang.String str2 = "";
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str3 = (java.lang.String) split$default.get(0);
            if (split$default.size() > 1) {
                java.lang.String str4 = (java.lang.String) split$default.get(1);
                java.util.Locale locale = java.util.Locale.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String upperCase = str4.toUpperCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                str2 = upperCase;
            }
            java.util.Locale build = new java.util.Locale.Builder().setLanguage(str3).setRegion(str2).build();
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "_", false, 2, (java.lang.Object) null)) {
            java.util.List split$default2 = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str5 = (java.lang.String) split$default2.get(0);
            if (split$default2.size() > 1) {
                java.lang.String str6 = (java.lang.String) split$default2.get(1);
                java.util.Locale locale2 = java.util.Locale.getDefault();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
                java.lang.String upperCase2 = str6.toUpperCase(locale2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                str2 = upperCase2;
            }
            java.util.Locale build2 = new java.util.Locale.Builder().setLanguage(str5).setRegion(str2).build();
            kotlin.jvm.internal.Intrinsics.checkNotNull(build2);
            return build2;
        }
        java.util.Locale build3 = new java.util.Locale.Builder().setLanguage(p0).build();
        kotlin.jvm.internal.Intrinsics.checkNotNull(build3);
        return build3;
    }
}
