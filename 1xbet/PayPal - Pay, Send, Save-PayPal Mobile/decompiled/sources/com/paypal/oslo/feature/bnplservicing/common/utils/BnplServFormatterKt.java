package com.paypal.oslo.feature.bnplservicing.common.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "toDoubleOrZero", "(Ljava/lang/String;)D"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BnplServFormatterKt {
    public static final double toDoubleOrZero(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            } else if (charAt == '.' && !z) {
                sb.append(charAt);
                z = true;
            }
        }
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(sb.toString());
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        return 0.0d;
    }
}
