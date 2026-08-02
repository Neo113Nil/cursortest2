package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0015\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0002\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\u0002\u001a\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0005"}, d2 = {"", "digitsOnly", "(Ljava/lang/String;)Ljava/lang/String;", com.daon.sdk.face.license.License.FEATURE_MASK, "formatWithMask", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "visibleDigits", "maskPrefix", "maskLastDigits", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", "formatPhoneNumber", "accessiblePhoneNumber", "", "toDoubleOrZero", "(Ljava/lang/String;)D", "pattern", "toIsoDateFormat"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StringExtensionsKt {
    public static final java.lang.String formatWithMask(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String digitsOnly = digitsOnly(str);
        if (digitsOnly.length() == 0) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (i >= digitsOnly.length()) {
                break;
            }
            if (charAt == '0') {
                sb.append(digitsOnly.charAt(i));
                i++;
            } else {
                sb.append(charAt);
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static final java.lang.String maskLastDigits(java.lang.String str, int i, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() < i) {
            return str;
        }
        java.lang.String takeLast = kotlin.text.StringsKt.takeLast(str, i);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(takeLast);
        return sb.toString();
    }

    public static final java.lang.String formatPhoneNumber(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String digitsOnly = digitsOnly(str);
        if (digitsOnly.length() != 10) {
            return str;
        }
        java.lang.String substring = digitsOnly.substring(0, 3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = digitsOnly.substring(3, 6);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.String substring3 = digitsOnly.substring(6);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(substring);
        sb.append(") ");
        sb.append(substring2);
        sb.append("-");
        sb.append(substring3);
        return sb.toString();
    }

    public static final java.lang.String accessiblePhoneNumber(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        char[] charArray = digitsOnly(str).toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "");
        return kotlin.collections.ArraysKt.joinToString$default(charArray, (java.lang.CharSequence) " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
    }

    public static final double toDoubleOrZero(java.lang.String str) {
        if (str == null) {
            return 0.0d;
        }
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

    public static final java.lang.String toIsoDateFormat(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String digitsOnly = digitsOnly(str);
        if (digitsOnly.length() != 8 || str2 == null) {
            return str;
        }
        java.lang.String str3 = str2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int length = str3.length();
        for (int i = 0; i < length; i++) {
            char charAt = str3.charAt(i);
            if (java.lang.Character.isLetter(charAt)) {
                sb.append(charAt);
            }
        }
        java.lang.String obj = sb.toString();
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) obj, io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 0, false, 6, (java.lang.Object) null);
        int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) obj, io.ktor.util.date.GMTDateParser.MONTH, 0, false, 6, (java.lang.Object) null);
        int indexOf$default3 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) obj, 'y', 0, false, 6, (java.lang.Object) null);
        java.lang.String substring = digitsOnly.substring(indexOf$default, indexOf$default + 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.String substring2 = digitsOnly.substring(indexOf$default2, indexOf$default2 + 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
        java.lang.String substring3 = digitsOnly.substring(indexOf$default3, indexOf$default3 + 4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(substring3);
        sb2.append("-");
        sb2.append(substring2);
        sb2.append("-");
        sb2.append(substring);
        return sb2.toString();
    }

    public static final java.lang.String digitsOnly(java.lang.String str) {
        java.lang.String str2;
        if (str != null) {
            java.lang.String str3 = str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = str3.length();
            for (int i = 0; i < length; i++) {
                char charAt = str3.charAt(i);
                if (java.lang.Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            str2 = sb.toString();
        } else {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }
}
