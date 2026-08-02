package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoPriceFormatter;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode", "Ljava/util/Locale;", "locale", "", "showCurrencySymbol", "showInsignificantDecimals", "formatPrice", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;ZZ)Ljava/lang/String;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "p2", "p3", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoPriceFormatter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CryptoPriceFormatter() {
    }

    public static /* synthetic */ java.lang.String formatPrice$default(com.paypal.oslo.feature.cryptocurrency.ui.common.formatter.CryptoPriceFormatter cryptoPriceFormatter, java.lang.String str, java.lang.String str2, java.util.Locale locale, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return cryptoPriceFormatter.formatPrice(str, str2, locale, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2);
    }

    public final java.lang.String formatPrice(java.lang.String value, java.lang.String currencyCode, java.util.Locale locale, boolean showCurrencySymbol, boolean showInsignificantDecimals) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String highSpeedVideoFpsRanges = showCurrencySymbol ? getHighSpeedVideoFpsRanges(currencyCode, locale) : "";
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(value, locale, currencyCode, showInsignificantDecimals);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(highSpeedVideoFpsRanges);
        sb.append(Camera2StreamConfigurationMap);
        return sb.toString();
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0, java.util.Locale p1) {
        try {
            java.lang.String symbol = java.util.Currency.getInstance(p0).getSymbol(p1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(symbol);
            return symbol;
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.cryptocurrency.LoggerKt.log.e("CryptoPriceFormatter: Invalid currency code: ".concat(java.lang.String.valueOf(p0)), e);
            return p0;
        }
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String p0, java.util.Locale p1, java.lang.String p2, boolean p3) {
        int i;
        try {
            java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(p0);
            double doubleValue = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
            java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(p1);
            try {
                i = java.util.Currency.getInstance(p2).getDefaultFractionDigits();
            } catch (java.lang.Exception unused) {
                i = 2;
            }
            if (doubleValue != ((long) doubleValue) || p3) {
                numberInstance.setMinimumFractionDigits(java.lang.Math.min(i, 2));
                numberInstance.setMaximumFractionDigits(10);
            } else {
                numberInstance.setMinimumFractionDigits(0);
                numberInstance.setMaximumFractionDigits(0);
            }
            java.lang.String format = numberInstance.format(doubleValue);
            kotlin.jvm.internal.Intrinsics.checkNotNull(format);
            return format;
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.cryptocurrency.LoggerKt.log;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoPriceFormatter: Invalid format or locale: ");
            sb.append(p1);
            sb.append(", ");
            sb.append(p2);
            sb.append(", ");
            sb.append(p0);
            logger.e(sb.toString(), e);
            return p0;
        }
    }
}
