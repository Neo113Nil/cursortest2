package com.zettle.sdk.feature.taptopay.ui.tipping.component;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ljava/util/Currency;", "currency", "", "format", "(JLjava/util/Currency;)Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class KeyPadKt {
    public static final java.lang.String format(long j, java.util.Currency currency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency2 = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency);
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String spannableString = currency2.locale(locale).build().format(j).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(spannableString, "");
        return spannableString;
    }
}
