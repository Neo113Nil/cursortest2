package com.paypal.oslo.core.money;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/money/Money;", "Ljava/util/Locale;", "locale", "", "formatAsCurrencyWithSeparators", "(Lcom/paypal/oslo/core/money/Money;Ljava/util/Locale;)Ljava/lang/String;", "formatAsNumberWithSeparators", "formatAsDecimalNumber", "(Lcom/paypal/oslo/core/money/Money;)Ljava/lang/String;", "formatAsNumberUnsigned", "currencyCode", "", "isCurrencySymbolPrefixed", "(Ljava/lang/String;Ljava/util/Locale;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MoneyFormattingKt {
    public static /* synthetic */ java.lang.String formatAsCurrencyWithSeparators$default(com.paypal.oslo.core.money.Money money, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return formatAsCurrencyWithSeparators(money, locale);
    }

    public static final java.lang.String formatAsCurrencyWithSeparators(com.paypal.oslo.core.money.Money money, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(java.util.Currency.getInstance(money.getCurrencyCode()));
        currencyInstance.setMinimumFractionDigits(money.getDefaultFractionDigits());
        currencyInstance.setMaximumFractionDigits(money.getDefaultFractionDigits());
        currencyInstance.setRoundingMode(java.math.RoundingMode.HALF_UP);
        java.lang.String format = currencyInstance.format(new java.math.BigDecimal(money.getValue()).divide(new java.math.BigDecimal(money.getScale()), money.getDefaultFractionDigits(), java.math.RoundingMode.HALF_UP));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static /* synthetic */ java.lang.String formatAsNumberWithSeparators$default(com.paypal.oslo.core.money.Money money, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return formatAsNumberWithSeparators(money, locale);
    }

    public static final java.lang.String formatAsNumberWithSeparators(com.paypal.oslo.core.money.Money money, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.text.NumberFormat decimalFormat = java.text.DecimalFormat.getInstance(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decimalFormat, "");
        java.text.DecimalFormat decimalFormat2 = (java.text.DecimalFormat) decimalFormat;
        decimalFormat2.setDecimalFormatSymbols(new java.text.DecimalFormatSymbols(locale));
        decimalFormat2.setMinimumFractionDigits(money.getDefaultFractionDigits());
        decimalFormat2.setMaximumFractionDigits(money.getDefaultFractionDigits());
        decimalFormat2.setRoundingMode(java.math.RoundingMode.HALF_UP);
        java.lang.String format = decimalFormat2.format(new java.math.BigDecimal(money.getValue()).divide(new java.math.BigDecimal(money.getScale()), money.getDefaultFractionDigits(), java.math.RoundingMode.HALF_UP));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static final java.lang.String formatAsDecimalNumber(com.paypal.oslo.core.money.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        java.lang.String valueOf = java.lang.String.valueOf(money.getValue());
        boolean z = money.getValue() < 0;
        if (z) {
            valueOf = valueOf.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
        }
        int length = valueOf.length() - money.getDefaultFractionDigits();
        if (money.getDefaultFractionDigits() != 0) {
            if (length <= 0) {
                java.lang.String repeat = kotlin.text.StringsKt.repeat("0", java.lang.Math.abs(length));
                java.lang.StringBuilder sb = new java.lang.StringBuilder("0.");
                sb.append(repeat);
                sb.append(valueOf);
                valueOf = sb.toString();
            } else {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(valueOf);
                sb2.insert(length, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                valueOf = sb2.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "");
            }
        }
        return z ? "-".concat(java.lang.String.valueOf(valueOf)) : valueOf;
    }

    public static final java.lang.String formatAsNumberUnsigned(com.paypal.oslo.core.money.Money money) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        java.lang.String valueOf = java.lang.String.valueOf(java.lang.Math.abs(money.getValue()));
        int length = valueOf.length() - money.getDefaultFractionDigits();
        if (money.getDefaultFractionDigits() == 0) {
            return valueOf;
        }
        if (length <= 0) {
            java.lang.String repeat = kotlin.text.StringsKt.repeat("0", java.lang.Math.abs(length));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("0.");
            sb.append(repeat);
            sb.append(valueOf);
            return sb.toString();
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(valueOf);
        sb2.insert(length, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        java.lang.String obj = sb2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static /* synthetic */ boolean isCurrencySymbolPrefixed$default(java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return isCurrencySymbolPrefixed(str, locale);
    }

    public static final boolean isCurrencySymbolPrefixed(java.lang.String str, java.util.Locale locale) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(str));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        java.util.Currency currency = (java.util.Currency) m23436constructorimpl;
        java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(locale);
        java.text.DecimalFormat decimalFormat = currencyInstance instanceof java.text.DecimalFormat ? (java.text.DecimalFormat) currencyInstance : null;
        if (kotlin.text.StringsKt.isBlank(str) || currency == null || decimalFormat == null) {
            return true;
        }
        decimalFormat.setCurrency(currency);
        java.lang.String positivePrefix = decimalFormat.getPositivePrefix();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(positivePrefix, "");
        java.lang.String symbol = currency.getSymbol(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(symbol, "");
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) positivePrefix, (java.lang.CharSequence) symbol, false, 2, (java.lang.Object) null);
    }
}
