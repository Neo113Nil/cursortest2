package com.zettle.sdk.common.ui.text;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"", "amount", "Ljava/util/Currency;", "currency", "Ljava/util/Locale;", "locale", "Landroid/text/SpannableString;", "format", "(JLjava/util/Currency;Ljava/util/Locale;)Landroid/text/SpannableString;", "Lcom/zettle/sdk/common/ui/text/OttoAmount;", "formatAsOttoAmount", "(JLjava/util/Currency;Ljava/util/Locale;)Lcom/zettle/sdk/common/ui/text/OttoAmount;", "", "GRAVITY_BOTTOM", com.visa.cbp.getEncExpo.warmup, "GRAVITY_CENTER", "GRAVITY_TOP", "", "NEGATIVE_SYMBOL", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CurrencyFormatterKt {
    public static final int GRAVITY_BOTTOM = 2;
    public static final int GRAVITY_CENTER = 1;
    public static final int GRAVITY_TOP = 0;
    public static final java.lang.String NEGATIVE_SYMBOL = "-";

    public static final android.text.SpannableString format(long j, java.util.Currency currency, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency).locale(locale).build().format(j);
    }

    public static final com.zettle.sdk.common.ui.text.OttoAmount formatAsOttoAmount(long j, java.util.Currency currency, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        return new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency).locale(locale).build().formatAsOttoAmount(j);
    }

    public static final /* synthetic */ float access$toShiftRatio(int i) {
        if (i == 0) {
            return 0.75f;
        }
        if (i == 1) {
            return 0.375f;
        }
        if (i == 2) {
            return 0.0f;
        }
        throw new java.lang.IllegalArgumentException("Unsupported gravity value ".concat(java.lang.String.valueOf(i)));
    }
}
