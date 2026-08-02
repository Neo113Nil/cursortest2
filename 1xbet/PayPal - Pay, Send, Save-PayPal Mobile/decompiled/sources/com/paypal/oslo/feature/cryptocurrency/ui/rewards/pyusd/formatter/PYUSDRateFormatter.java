package com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/formatter/PYUSDRateFormatter;", "", "<init>", "()V", "", "rate", "Ljava/util/Locale;", "locale", "format", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PYUSDRateFormatter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PYUSDRateFormatter() {
    }

    public static /* synthetic */ java.lang.String format$default(com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.formatter.PYUSDRateFormatter pYUSDRateFormatter, java.lang.String str, java.util.Locale locale, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        return pYUSDRateFormatter.format(str, locale);
    }

    public final java.lang.String format(java.lang.String rate, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        try {
            java.math.BigDecimal m = com.paypal.oslo.core.money.Tax$$ExternalSyntheticBackportWithForwarding0.m(new java.math.BigDecimal(rate));
            java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(locale);
            numberInstance.setMinimumFractionDigits(0);
            numberInstance.setMaximumFractionDigits(2);
            java.lang.String format = numberInstance.format(m);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            return format;
        } catch (java.lang.NumberFormatException e) {
            com.paypal.oslo.feature.cryptocurrency.LoggerKt.log.e("Invalid PYUSD rate from backend: ".concat(java.lang.String.valueOf(rate)), e);
            return "";
        }
    }
}
