package com.payair.csdk;

/* loaded from: classes10.dex */
public abstract class c4 {
    public static int a(byte b) {
        int digit = java.lang.Character.digit((char) b, 16);
        if (digit != -1) {
            return digit;
        }
        throw new codec.DecoderException("Invalid URL encoding: not a valid digit (radix 16): ".concat(java.lang.String.valueOf((int) b)));
    }

    public static char a(int i) {
        return java.lang.Character.toUpperCase(java.lang.Character.forDigit(i & 15, 16));
    }
}
