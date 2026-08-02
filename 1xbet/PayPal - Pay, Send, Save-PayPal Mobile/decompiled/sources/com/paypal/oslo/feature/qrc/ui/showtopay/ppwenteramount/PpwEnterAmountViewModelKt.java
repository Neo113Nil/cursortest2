package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "countryCode", "currencyCodeFromCountry", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PpwEnterAmountViewModelKt {
    public static final java.lang.String currencyCodeFromCountry(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            java.lang.String currencyCode = java.util.Currency.getInstance(new java.util.Locale("", str)).getCurrencyCode();
            kotlin.jvm.internal.Intrinsics.checkNotNull(currencyCode);
            return currencyCode;
        } catch (java.lang.IllegalArgumentException unused) {
            return str;
        }
    }
}
