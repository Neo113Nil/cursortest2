package com.paypal.oslo.feature.businessinventory.common;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Ljava/util/Locale;", "locale", "", "formatAsPercent", "(DLjava/util/Locale;)Ljava/lang/String;", "formatAsPercentWithSymbol", "percentToFraction", "(Ljava/lang/String;)D"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormatAsPercentKt {
    public static final java.lang.String formatAsPercent(double d, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return new java.text.DecimalFormat("0.#####", new java.text.DecimalFormatSymbols(locale)).format(d).toString();
    }

    public static final java.lang.String formatAsPercentWithSymbol(double d, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.lang.String formatAsPercent = formatAsPercent(d, locale);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(formatAsPercent);
        sb.append("%");
        return sb.toString();
    }

    public static final double percentToFraction(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.isBlank(str)) {
            throw new java.lang.IllegalArgumentException("A tax must have a value".toString());
        }
        return java.lang.Double.parseDouble(str);
    }
}
