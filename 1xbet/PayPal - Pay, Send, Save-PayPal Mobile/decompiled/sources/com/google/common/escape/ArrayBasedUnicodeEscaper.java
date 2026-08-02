package com.google.common.escape;

/* loaded from: classes9.dex */
public abstract class ArrayBasedUnicodeEscaper extends com.google.common.escape.UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    protected abstract char[] escapeUnsafe(int i);

    protected ArrayBasedUnicodeEscaper(java.util.Map<java.lang.Character, java.lang.String> map, int i, int i2, java.lang.String str) {
        this(com.google.common.escape.ArrayBasedEscaperMap.create(map), i, i2, str);
    }

    protected ArrayBasedUnicodeEscaper(com.google.common.escape.ArrayBasedEscaperMap arrayBasedEscaperMap, int i, int i2, java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (i2 < i) {
            i2 = -1;
            i = Integer.MAX_VALUE;
        }
        this.safeMin = i;
        this.safeMax = i2;
        if (i >= 55296) {
            this.safeMinChar = kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
            this.safeMaxChar = (char) 0;
        } else {
            this.safeMinChar = (char) i;
            this.safeMaxChar = (char) java.lang.Math.min(i2, 55295);
        }
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final java.lang.String escape(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.replacementsLength && this.replacements[charAt] != null) || charAt > this.safeMaxChar || charAt < this.safeMinChar) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected final char[] escape(int i) {
        char[] cArr;
        if (i < this.replacementsLength && (cArr = this.replacements[i]) != null) {
            return cArr;
        }
        if (i < this.safeMin || i > this.safeMax) {
            return escapeUnsafe(i);
        }
        return null;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected final int nextEscapeIndex(java.lang.CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if ((charAt < this.replacementsLength && this.replacements[charAt] != null) || charAt > this.safeMaxChar || charAt < this.safeMinChar) {
                break;
            }
            i++;
        }
        return i;
    }
}
