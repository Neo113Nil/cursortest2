package com.google.common.escape;

/* loaded from: classes9.dex */
public abstract class ArrayBasedCharEscaper extends com.google.common.escape.CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    protected abstract char[] escapeUnsafe(char c);

    protected ArrayBasedCharEscaper(java.util.Map<java.lang.Character, java.lang.String> map, char c, char c2) {
        this(com.google.common.escape.ArrayBasedEscaperMap.create(map), c, c2);
    }

    protected ArrayBasedCharEscaper(com.google.common.escape.ArrayBasedEscaperMap arrayBasedEscaperMap, char c, char c2) {
        com.google.common.base.Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (c2 < c) {
            c2 = 0;
            c = kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
        }
        this.safeMin = c;
        this.safeMax = c2;
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final java.lang.String escape(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.replacementsLength && this.replacements[charAt] != null) || charAt > this.safeMax || charAt < this.safeMin) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.CharEscaper
    protected final char[] escape(char c) {
        char[] cArr;
        if (c < this.replacementsLength && (cArr = this.replacements[c]) != null) {
            return cArr;
        }
        if (c < this.safeMin || c > this.safeMax) {
            return escapeUnsafe(c);
        }
        return null;
    }
}
