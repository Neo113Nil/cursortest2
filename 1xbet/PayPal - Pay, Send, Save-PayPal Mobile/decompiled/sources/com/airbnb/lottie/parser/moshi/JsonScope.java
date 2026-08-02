package com.airbnb.lottie.parser.moshi;

/* loaded from: classes7.dex */
final class JsonScope {
    private JsonScope() {
    }

    static java.lang.String getHighResolutionOutputSizeshNQ4ISI(int i, int[] iArr, java.lang.String[] strArr, int[] iArr2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.SYMBOL_USD);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(iArr2[i2]);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                java.lang.String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
