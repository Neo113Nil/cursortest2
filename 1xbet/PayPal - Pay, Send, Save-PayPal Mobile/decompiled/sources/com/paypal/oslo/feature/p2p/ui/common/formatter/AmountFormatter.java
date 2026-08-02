package com.paypal.oslo.feature.p2p.ui.common.formatter;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/common/formatter/AmountFormatter;", "", "<init>", "()V", "", "amount", "currencyCode", "Ljava/util/Locale;", "locale", "", "showInsignificantDecimals", "formatAmountWithCurrency", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Z)Ljava/lang/String;", "formatAmountOnly", "p0", "", "p1", "p2", "p3", "p4", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;DLjava/lang/String;Ljava/util/Locale;Z)Ljava/lang/String;", "getCurrencyName", "(Ljava/lang/String;)Ljava/lang/String;", "", "getDecimalPlaces", "(Ljava/lang/String;)I", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AmountFormatter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AmountFormatter() {
    }

    public static /* synthetic */ java.lang.String formatAmountWithCurrency$default(com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, java.lang.String str, java.lang.String str2, java.util.Locale locale, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return amountFormatter.formatAmountWithCurrency(str, str2, locale, z);
    }

    public final java.lang.String formatAmountWithCurrency(java.lang.String amount, java.lang.String currencyCode, java.util.Locale locale, boolean showInsignificantDecimals) {
        java.lang.String str;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        try {
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(amount);
            if (doubleOrNull == null && amount.length() > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(currencyCode);
                sb.append(" 0");
                return sb.toString();
            }
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(amount, doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d, currencyCode, locale, showInsignificantDecimals);
            int hashCode = currencyCode.hashCode();
            if (hashCode == 69026) {
                if (currencyCode.equals(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR)) {
                    str = com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_EUR;
                }
                str = currencyCode;
            } else if (hashCode != 70357) {
                if (hashCode == 84326 && currencyCode.equals("USD")) {
                    str = com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD;
                }
                str = currencyCode;
            } else {
                if (currencyCode.equals("GBP")) {
                    str = com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_GBP;
                }
                str = currencyCode;
            }
            if (!kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"USD", "GBP", com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR}).contains(currencyCode)) {
                str2 = " ";
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(str2);
            sb2.append(highSpeedVideoFpsRanges);
            return sb2.toString();
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            com.paypal.android.logger.Logger.d$default(logger, "Error formatting amount with currency", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(currencyCode);
            sb3.append(" ");
            sb3.append(amount);
            return sb3.toString();
        }
    }

    public static /* synthetic */ java.lang.String formatAmountOnly$default(com.paypal.oslo.feature.p2p.ui.common.formatter.AmountFormatter amountFormatter, java.lang.String str, java.lang.String str2, java.util.Locale locale, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return amountFormatter.formatAmountOnly(str, str2, locale, z);
    }

    public final java.lang.String formatAmountOnly(java.lang.String amount, java.lang.String currencyCode, java.util.Locale locale, boolean showInsignificantDecimals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        try {
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(amount);
            return doubleOrNull != null ? getHighSpeedVideoFpsRanges(amount, doubleOrNull.doubleValue(), currencyCode, locale, showInsignificantDecimals) : amount;
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.p2p.LoggerKt.log;
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = com.paypal.oslo.feature.settings.closeaccount.data.repository.CloseAccountRepositoryImpl.UNKNOWN_ERROR;
            }
            com.paypal.android.logger.Logger.d$default(logger, "Error formatting amount only", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
            return amount;
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0, double p1, java.lang.String p2, java.util.Locale p3, boolean p4) {
        int i;
        java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(p3);
        try {
            i = java.util.Currency.getInstance(p2).getDefaultFractionDigits();
        } catch (java.lang.Exception unused) {
            i = 2;
        }
        if (p1 != ((long) p1)) {
            int length = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) p0, new java.text.DecimalFormatSymbols(p3).getDecimalSeparator(), 0, false, 6, (java.lang.Object) null) != -1 ? (p0.length() - r14) - 1 : 0;
            numberInstance.setMinimumFractionDigits(java.lang.Math.max(2, java.lang.Math.min(length, i)));
            numberInstance.setMaximumFractionDigits(java.lang.Math.max(length, i));
        } else if (p4) {
            numberInstance.setMinimumFractionDigits(java.lang.Math.min(i, 2));
            numberInstance.setMaximumFractionDigits(4);
        } else {
            numberInstance.setMinimumFractionDigits(0);
            numberInstance.setMaximumFractionDigits(0);
        }
        java.lang.String format = numberInstance.format(p1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public final java.lang.String getCurrencyName(java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        try {
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = currencyCode.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            java.lang.String displayName = java.util.Currency.getInstance(upperCase).getDisplayName(java.util.Locale.US);
            kotlin.jvm.internal.Intrinsics.checkNotNull(displayName);
            return displayName;
        } catch (java.lang.IllegalArgumentException unused) {
            return currencyCode;
        }
    }

    public final int getDecimalPlaces(java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        try {
            java.util.Locale locale = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            java.lang.String upperCase = currencyCode.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            return java.util.Currency.getInstance(upperCase).getDefaultFractionDigits();
        } catch (java.lang.IllegalArgumentException unused) {
            return 2;
        }
    }
}
