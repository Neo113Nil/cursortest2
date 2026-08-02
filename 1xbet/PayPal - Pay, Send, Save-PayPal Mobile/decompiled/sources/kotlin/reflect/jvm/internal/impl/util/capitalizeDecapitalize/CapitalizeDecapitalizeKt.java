package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

/* loaded from: classes5.dex */
public final class CapitalizeDecapitalizeKt {
    public static final java.lang.String decapitalizeSmartForCompiler(java.lang.String str, boolean z) {
        java.lang.Integer num;
        java.lang.String lowerCase;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        if (str2.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!z ? java.lang.Character.isUpperCase(charAt) : 'A' <= charAt && charAt < '[') {
            return str;
        }
        if (str.length() != 1) {
            char charAt2 = str.charAt(1);
            if (!z ? java.lang.Character.isUpperCase(charAt2) : !('A' > charAt2 || charAt2 >= '[')) {
                java.util.Iterator<java.lang.Integer> it = kotlin.text.StringsKt.getIndices(str2).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        num = null;
                        break;
                    }
                    num = it.next();
                    char charAt3 = str.charAt(num.intValue());
                    if (z) {
                        if ('A' > charAt3 || charAt3 >= '[') {
                            break;
                        }
                    } else if (!java.lang.Character.isUpperCase(charAt3)) {
                        break;
                    }
                }
                java.lang.Integer num2 = num;
                if (num2 == null) {
                    if (z) {
                        return toLowerCaseAsciiOnly(str);
                    }
                    java.lang.String lowerCase2 = str.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    return lowerCase2;
                }
                int intValue = num2.intValue() - 1;
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String substring = str.substring(0, intValue);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                if (z) {
                    lowerCase = toLowerCaseAsciiOnly(substring);
                } else {
                    lowerCase = substring.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                }
                sb.append(lowerCase);
                java.lang.String substring2 = str.substring(intValue);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                sb.append(substring2);
                return sb.toString();
            }
        }
        if (z) {
            return decapitalizeAsciiOnly(str);
        }
        if (str2.length() <= 0) {
            return str;
        }
        char lowerCase3 = java.lang.Character.toLowerCase(str.charAt(0));
        java.lang.String substring3 = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(lowerCase3);
        sb2.append(substring3);
        return sb2.toString();
    }

    public static final java.lang.String capitalizeAsciiOnly(java.lang.String str) {
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = str;
        if (str2.length() == 0 || 'a' > (charAt = str.charAt(0)) || charAt >= '{') {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        sb.append(java.lang.Character.toUpperCase(charAt));
        sb.append((java.lang.CharSequence) str2, 1, str.length());
        return sb.toString();
    }

    public static final java.lang.String decapitalizeAsciiOnly(java.lang.String str) {
        char charAt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || 'A' > (charAt = str.charAt(0)) || charAt >= '[') {
            return str;
        }
        char lowerCase = java.lang.Character.toLowerCase(charAt);
        java.lang.String substring = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(lowerCase);
        sb.append(substring);
        return sb.toString();
    }

    public static final java.lang.String toLowerCaseAsciiOnly(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('A' <= charAt && charAt < '[') {
                charAt = java.lang.Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }
}
