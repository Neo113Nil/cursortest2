package com.paypal.oslo.core.money;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/money/Tax;", "Ljava/util/Locale;", "locale", "", "formatAsPercent", "(Lcom/paypal/oslo/core/money/Tax;Ljava/util/Locale;)Ljava/lang/String;", "formatAsPercentWithSymbol", "(Lcom/paypal/oslo/core/money/Tax;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TaxFormattingKt {
    public static /* synthetic */ java.lang.String formatAsPercent$default(com.paypal.oslo.core.money.Tax tax, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return formatAsPercent(tax, locale);
    }

    public static final java.lang.String formatAsPercent(com.paypal.oslo.core.money.Tax tax, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tax, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.#####", new java.text.DecimalFormatSymbols(locale));
        decimalFormat.setRoundingMode(java.math.RoundingMode.HALF_UP);
        java.lang.String format = decimalFormat.format(tax.getValue() * 100.0d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }

    public static final java.lang.String formatAsPercentWithSymbol(com.paypal.oslo.core.money.Tax tax) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tax, "");
        java.lang.String formatAsPercent$default = formatAsPercent$default(tax, null, 1, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(formatAsPercent$default);
        sb.append("%");
        return sb.toString();
    }
}
