package com.google.common.escape;

/* loaded from: classes9.dex */
public final class CharEscaperBuilder {
    private int max = -1;
    private final java.util.Map<java.lang.Character, java.lang.String> map = new java.util.HashMap();

    static final class CharArrayDecorator extends com.google.common.escape.CharEscaper {
        private final int replaceLength;
        private final char[][] replacements;

        CharArrayDecorator(char[][] cArr) {
            this.replacements = cArr;
            this.replaceLength = cArr.length;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public final java.lang.String escape(java.lang.String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                char[][] cArr = this.replacements;
                if (charAt < cArr.length && cArr[charAt] != null) {
                    return escapeSlow(str, i);
                }
            }
            return str;
        }

        @Override // com.google.common.escape.CharEscaper
        protected final char[] escape(char c) {
            if (c < this.replaceLength) {
                return this.replacements[c];
            }
            return null;
        }
    }

    public final com.google.common.escape.CharEscaperBuilder addEscape(char c, java.lang.String str) {
        this.map.put(java.lang.Character.valueOf(c), (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str));
        if (c > this.max) {
            this.max = c;
        }
        return this;
    }

    public final com.google.common.escape.CharEscaperBuilder addEscapes(char[] cArr, java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        for (char c : cArr) {
            addEscape(c, str);
        }
        return this;
    }

    public final char[][] toArray() {
        char[][] cArr = new char[this.max + 1][];
        for (java.util.Map.Entry<java.lang.Character, java.lang.String> entry : this.map.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public final com.google.common.escape.Escaper toEscaper() {
        return new com.google.common.escape.CharEscaperBuilder.CharArrayDecorator(toArray());
    }
}
