package com.google.common.net;

@com.google.common.net.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class PercentEscaper extends com.google.common.escape.UnicodeEscaper {
    private static final char[] PLUS_SIGN = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(java.lang.String safeChars, boolean plusForSpace) {
        com.google.common.base.Preconditions.checkNotNull(safeChars);
        if (safeChars.matches(".*[0-9A-Za-z].*")) {
            throw new java.lang.IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        java.lang.String str = safeChars + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (plusForSpace && str.contains(io.ktor.sse.ServerSentEventKt.SPACE)) {
            throw new java.lang.IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.plusForSpace = plusForSpace;
        this.safeOctets = createSafeOctets(str);
    }

    private static boolean[] createSafeOctets(java.lang.String safeChars) {
        char[] charArray = safeChars.toCharArray();
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
    protected int nextEscapeIndex(java.lang.CharSequence csq, int index, int end) {
        com.google.common.base.Preconditions.checkNotNull(csq);
        while (index < end) {
            char charAt = csq.charAt(index);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            index++;
        }
        return index;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String s) {
        com.google.common.base.Preconditions.checkNotNull(s);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char charAt = s.charAt(i);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(s, i);
            }
        }
        return s;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @javax.annotation.CheckForNull
    protected char[] escape(int cp) {
        boolean[] zArr = this.safeOctets;
        if (cp < zArr.length && zArr[cp]) {
            return null;
        }
        if (cp == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (cp <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[cp >>> 4], cArr[cp & 15]};
        }
        if (cp <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            char c = cArr2[cp & 15];
            return new char[]{'%', cArr2[(cp >>> 10) | 12], cArr2[(cp >>> 6) & 15], '%', cArr2[8 | ((cp >>> 4) & 3)], c};
        }
        if (cp <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            char c2 = cArr3[cp & 15];
            char c3 = cArr3[((cp >>> 4) & 3) | 8];
            return new char[]{'%', 'E', cArr3[cp >>> 12], '%', cArr3[((cp >>> 10) & 3) | 8], cArr3[(cp >>> 6) & 15], '%', c3, c2};
        }
        if (cp <= 1114111) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            char c4 = cArr4[cp & 15];
            char c5 = cArr4[((cp >>> 4) & 3) | 8];
            char c6 = cArr4[(cp >>> 6) & 15];
            char c7 = cArr4[((cp >>> 10) & 3) | 8];
            return new char[]{'%', 'F', cArr4[(cp >>> 18) & 7], '%', cArr4[((cp >>> 16) & 3) | 8], cArr4[(cp >>> 12) & 15], '%', c7, c6, '%', c5, c4};
        }
        throw new java.lang.IllegalArgumentException("Invalid unicode character value " + cp);
    }
}
