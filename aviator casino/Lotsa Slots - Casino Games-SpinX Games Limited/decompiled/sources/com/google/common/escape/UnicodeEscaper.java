package com.google.common.escape;

@com.google.common.escape.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public abstract class UnicodeEscaper extends com.google.common.escape.Escaper {
    private static final int DEST_PAD = 32;

    @javax.annotation.CheckForNull
    protected abstract char[] escape(int cp);

    protected UnicodeEscaper() {
    }

    @Override // com.google.common.escape.Escaper
    public java.lang.String escape(java.lang.String string) {
        com.google.common.base.Preconditions.checkNotNull(string);
        int length = string.length();
        int nextEscapeIndex = nextEscapeIndex(string, 0, length);
        return nextEscapeIndex == length ? string : escapeSlow(string, nextEscapeIndex);
    }

    protected int nextEscapeIndex(java.lang.CharSequence csq, int start, int end) {
        while (start < end) {
            int codePointAt = codePointAt(csq, start, end);
            if (codePointAt < 0 || escape(codePointAt) != null) {
                break;
            }
            start += java.lang.Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1;
        }
        return start;
    }

    protected final java.lang.String escapeSlow(java.lang.String s, int index) {
        int length = s.length();
        char[] charBufferFromThreadLocal = com.google.common.escape.Platform.charBufferFromThreadLocal();
        int i = 0;
        int i2 = 0;
        while (index < length) {
            int codePointAt = codePointAt(s, index, length);
            if (codePointAt < 0) {
                throw new java.lang.IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] escape = escape(codePointAt);
            int i3 = (java.lang.Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1) + index;
            if (escape != null) {
                int i4 = index - i;
                int i5 = i2 + i4;
                int length2 = escape.length + i5;
                if (charBufferFromThreadLocal.length < length2) {
                    charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i2, length2 + (length - index) + 32);
                }
                if (i4 > 0) {
                    s.getChars(i, index, charBufferFromThreadLocal, i2);
                    i2 = i5;
                }
                if (escape.length > 0) {
                    java.lang.System.arraycopy(escape, 0, charBufferFromThreadLocal, i2, escape.length);
                    i2 += escape.length;
                }
                i = i3;
            }
            index = nextEscapeIndex(s, i3, length);
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i6 + i2;
            if (charBufferFromThreadLocal.length < i7) {
                charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i2, i7);
            }
            s.getChars(i, length, charBufferFromThreadLocal, i2);
            i2 = i7;
        }
        return new java.lang.String(charBufferFromThreadLocal, 0, i2);
    }

    protected static int codePointAt(java.lang.CharSequence seq, int index, int end) {
        com.google.common.base.Preconditions.checkNotNull(seq);
        if (index < end) {
            int i = index + 1;
            char charAt = seq.charAt(index);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                throw new java.lang.IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + ((int) charAt) + " at index " + index + " in '" + ((java.lang.Object) seq) + "'");
            }
            if (i == end) {
                return -charAt;
            }
            char charAt2 = seq.charAt(i);
            if (!java.lang.Character.isLowSurrogate(charAt2)) {
                throw new java.lang.IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i + " in '" + ((java.lang.Object) seq) + "'");
            }
            return java.lang.Character.toCodePoint(charAt, charAt2);
        }
        throw new java.lang.IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static char[] growBuffer(char[] dest, int index, int size) {
        if (size < 0) {
            throw new java.lang.AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr = new char[size];
        if (index > 0) {
            java.lang.System.arraycopy(dest, 0, cArr, 0, index);
        }
        return cArr;
    }
}
