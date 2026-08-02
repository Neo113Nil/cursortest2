package com.payair.csdk;

/* loaded from: classes10.dex */
public abstract class q2 {
    public static java.lang.String a(java.lang.String str) {
        if (str.length() == 0) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (java.lang.Character.isLetter(str.charAt(i2))) {
                cArr[i] = str.charAt(i2);
                i++;
            }
        }
        return i == length ? str.toUpperCase(java.util.Locale.ENGLISH) : new java.lang.String(cArr, 0, i).toUpperCase(java.util.Locale.ENGLISH);
    }

    public static int a(codec.StringEncoder stringEncoder, java.lang.String str, java.lang.String str2) {
        java.lang.String encode = stringEncoder.encode(str);
        java.lang.String encode2 = stringEncoder.encode(str2);
        if (encode == null || encode2 == null) {
            return 0;
        }
        int min = java.lang.Math.min(encode.length(), encode2.length());
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            if (encode.charAt(i2) == encode2.charAt(i2)) {
                i++;
            }
        }
        return i;
    }
}
