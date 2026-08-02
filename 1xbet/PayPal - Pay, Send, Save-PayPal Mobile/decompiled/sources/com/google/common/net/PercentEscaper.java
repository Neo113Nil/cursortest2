package com.google.common.net;

/* loaded from: classes9.dex */
public final class PercentEscaper extends com.google.common.escape.UnicodeEscaper {
    private static final char[] plusSign = {'+'};
    private static final char[] upperHexDigits = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(java.lang.String str, boolean z) {
        com.google.common.base.Preconditions.checkNotNull(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new java.lang.IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        java.lang.String obj = sb.toString();
        if (z && obj.contains(" ")) {
            throw new java.lang.IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.plusForSpace = z;
        this.safeOctets = createSafeOctets(obj);
    }

    private static boolean[] createSafeOctets(java.lang.String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = java.lang.Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public final int nextEscapeIndex(java.lang.CharSequence charSequence, int i, int i2) {
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final java.lang.String escape(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    public final char[] escape(int i) {
        boolean[] zArr = this.safeOctets;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.plusForSpace) {
            return plusSign;
        }
        if (i <= 127) {
            char[] cArr = upperHexDigits;
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        }
        if (i <= 2047) {
            char[] cArr2 = upperHexDigits;
            char c = cArr2[i & 15];
            char c2 = cArr2[8 | ((i >>> 4) & 3)];
            return new char[]{'%', cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], '%', c2, c};
        }
        if (i <= 65535) {
            char[] cArr3 = upperHexDigits;
            char c3 = cArr3[i & 15];
            char c4 = cArr3[((i >>> 4) & 3) | 8];
            char c5 = cArr3[(i >>> 6) & 15];
            return new char[]{'%', 'E', cArr3[i >>> 12], '%', cArr3[((i >>> 10) & 3) | 8], c5, '%', c4, c3};
        }
        if (i <= 1114111) {
            char[] cArr4 = upperHexDigits;
            char c6 = cArr4[i & 15];
            char c7 = cArr4[((i >>> 4) & 3) | 8];
            char c8 = cArr4[(i >>> 6) & 15];
            char c9 = cArr4[((i >>> 10) & 3) | 8];
            char c10 = cArr4[(i >>> 12) & 15];
            return new char[]{'%', 'F', cArr4[(i >>> 18) & 7], '%', cArr4[((i >>> 16) & 3) | 8], c10, '%', c9, c8, '%', c7, c6};
        }
        throw new java.lang.IllegalArgumentException("Invalid unicode character value ".concat(java.lang.String.valueOf(i)));
    }
}
