package com.google.common.base;

/* loaded from: classes4.dex */
public final class Strings {
    private Strings() {
    }

    public static java.lang.String nullToEmpty(java.lang.String str) {
        return com.google.common.base.Platform.nullToEmpty(str);
    }

    public static java.lang.String emptyToNull(java.lang.String str) {
        return com.google.common.base.Platform.emptyToNull(str);
    }

    public static boolean isNullOrEmpty(java.lang.String str) {
        return com.google.common.base.Platform.stringIsNullOrEmpty(str);
    }

    public static java.lang.String padStart(java.lang.String str, int i, char c) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String padEnd(java.lang.String str, int i, char c) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (str.length() >= i) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i);
        sb.append(str);
        for (int length = str.length(); length < i; length++) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static java.lang.String repeat(java.lang.String str, int i) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (i <= 1) {
            com.google.common.base.Preconditions.checkArgument(i >= 0, "invalid count: %s", i);
            return i == 0 ? "" : str;
        }
        int length = str.length();
        long j = length * i;
        int i2 = (int) j;
        if (i2 != j) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Required array size too large: ".concat(java.lang.String.valueOf(j)));
        }
        char[] cArr = new char[i2];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i3 = i2 - length;
            if (length < i3) {
                java.lang.System.arraycopy(cArr, 0, cArr, length, length);
                length <<= 1;
            } else {
                java.lang.System.arraycopy(cArr, 0, cArr, length, i3);
                return new java.lang.String(cArr);
            }
        }
    }

    public static java.lang.String commonPrefix(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        com.google.common.base.Preconditions.checkNotNull(charSequence2);
        int min = java.lang.Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt(i) == charSequence2.charAt(i)) {
            i++;
        }
        int i2 = i - 1;
        if (validSurrogatePairAt(charSequence, i2) || validSurrogatePairAt(charSequence2, i2)) {
            i = i2;
        }
        return charSequence.subSequence(0, i).toString();
    }

    public static java.lang.String commonSuffix(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        com.google.common.base.Preconditions.checkNotNull(charSequence2);
        int min = java.lang.Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && charSequence.charAt((charSequence.length() - i) - 1) == charSequence2.charAt((charSequence2.length() - i) - 1)) {
            i++;
        }
        if (validSurrogatePairAt(charSequence, (charSequence.length() - i) - 1) || validSurrogatePairAt(charSequence2, (charSequence2.length() - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(charSequence.length() - i, charSequence.length()).toString();
    }

    static boolean validSurrogatePairAt(java.lang.CharSequence charSequence, int i) {
        return i >= 0 && i <= charSequence.length() + (-2) && java.lang.Character.isHighSurrogate(charSequence.charAt(i)) && java.lang.Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    public static java.lang.String lenientFormat(java.lang.String str, java.lang.Object... objArr) {
        int indexOf;
        java.lang.String valueOf = java.lang.String.valueOf(str);
        if (objArr == null) {
            objArr = new java.lang.Object[]{"(Object[])null"};
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append((java.lang.CharSequence) valueOf, i2, indexOf);
            sb.append(lenientToString(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((java.lang.CharSequence) valueOf, i2, valueOf.length());
        if (i < objArr.length) {
            java.lang.String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(lenientToString(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }
        return sb.toString();
    }

    private static java.lang.String lenientToString(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj.getClass().getName());
            sb.append('@');
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
            java.lang.String obj2 = sb.toString();
            java.util.logging.Logger.getLogger("com.google.common.base.Strings").log(java.util.logging.Level.WARNING, "Exception during lenientFormat for ".concat(java.lang.String.valueOf(obj2)), (java.lang.Throwable) e);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<");
            sb2.append(obj2);
            sb2.append(" threw ");
            sb2.append(e.getClass().getName());
            sb2.append(">");
            return sb2.toString();
        }
    }
}
