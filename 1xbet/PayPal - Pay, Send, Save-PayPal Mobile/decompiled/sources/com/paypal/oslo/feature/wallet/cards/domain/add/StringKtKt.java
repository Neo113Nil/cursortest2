package com.paypal.oslo.feature.wallet.cards.domain.add;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0006\n\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00038\u0000X\u0081T¢\u0006\u0006\n\u0004\b\n\u0010\t"}, d2 = {"", "digits", "(Ljava/lang/String;)Ljava/lang/String;", "", "maxLength", "cvvDigits", "(Ljava/lang/String;I)Ljava/lang/String;", "expiryDateDigits", "CVVMaxDigits", com.visa.cbp.getEncExpo.warmup, "ExpiryDateMaxDigits"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class StringKtKt {
    public static final int CVVMaxDigits = 4;
    public static final int ExpiryDateMaxDigits = 4;

    public static /* synthetic */ java.lang.String cvvDigits$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return cvvDigits(str, i);
    }

    public static /* synthetic */ java.lang.String expiryDateDigits$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 4;
        }
        return expiryDateDigits(str, i);
    }

    public static final java.lang.String digits(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final java.lang.String cvvDigits(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return kotlin.text.StringsKt.take(sb.toString(), i);
    }

    public static final java.lang.String expiryDateDigits(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (java.lang.Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return kotlin.text.StringsKt.take(sb.toString(), i);
    }
}
