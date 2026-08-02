package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class Hex {
    public static java.lang.String encode(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static byte[] decode(java.lang.String str) {
        if (str.length() % 2 != 0) {
            throw new java.lang.IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = java.lang.Character.digit(str.charAt(i2), 16);
            int digit2 = java.lang.Character.digit(str.charAt(i2 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new java.lang.IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    private Hex() {
    }
}
