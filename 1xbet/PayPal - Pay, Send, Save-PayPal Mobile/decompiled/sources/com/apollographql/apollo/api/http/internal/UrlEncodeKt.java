package com.apollographql.apollo.api.http.internal;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0003\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0002"}, d2 = {"", "urlEncode", "(Ljava/lang/String;)Ljava/lang/String;", "urlDecode"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UrlEncodeKt {
    public static final java.lang.String urlEncode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : kotlin.text.StringsKt.encodeToByteArray(str)) {
            int i = b & 255;
            if ((97 <= i && i < 123) || ((65 <= i && i < 91) || ((48 <= i && i < 58) || i == 45 || i == 46 || i == 95 || i == 126))) {
                sb.append((char) i);
            } else {
                java.lang.String num = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(16));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
                java.lang.String upperCase = num.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                if (upperCase.length() == 1) {
                    upperCase = "0".concat(java.lang.String.valueOf(upperCase));
                }
                sb.append("%".concat(java.lang.String.valueOf(upperCase)));
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static final java.lang.String urlDecode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        okio.Buffer buffer = new okio.Buffer();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '%') {
                int i2 = i + 3;
                if (i2 > str.length()) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String substring = str.substring(i + 1, i2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                buffer.writeByte(java.lang.Integer.parseInt(substring, kotlin.text.CharsKt.checkRadix(16)));
                i = i2;
            } else {
                buffer.writeUtf8CodePoint((int) charAt);
                i++;
            }
        }
        return buffer.readUtf8();
    }
}
