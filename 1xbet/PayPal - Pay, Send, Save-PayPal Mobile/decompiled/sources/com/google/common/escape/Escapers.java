package com.google.common.escape;

/* loaded from: classes9.dex */
public final class Escapers {
    private static final com.google.common.escape.Escaper NULL_ESCAPER = new com.google.common.escape.CharEscaper() { // from class: com.google.common.escape.Escapers.1
        @Override // com.google.common.escape.CharEscaper
        protected char[] escape(char c) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public java.lang.String escape(java.lang.String str) {
            return (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
        }
    };

    private Escapers() {
    }

    public static com.google.common.escape.Escaper nullEscaper() {
        return NULL_ESCAPER;
    }

    public static com.google.common.escape.Escapers.Builder builder() {
        return new com.google.common.escape.Escapers.Builder();
    }

    public static final class Builder {
        private final java.util.Map<java.lang.Character, java.lang.String> replacementMap;
        private char safeMax;
        private char safeMin;
        private java.lang.String unsafeReplacement;

        private Builder() {
            this.replacementMap = new java.util.HashMap();
            this.safeMin = (char) 0;
            this.safeMax = kotlin.jvm.internal.CharCompanionObject.MAX_VALUE;
            this.unsafeReplacement = null;
        }

        public final com.google.common.escape.Escapers.Builder setSafeRange(char c, char c2) {
            this.safeMin = c;
            this.safeMax = c2;
            return this;
        }

        public final com.google.common.escape.Escapers.Builder setUnsafeReplacement(java.lang.String str) {
            this.unsafeReplacement = str;
            return this;
        }

        public final com.google.common.escape.Escapers.Builder addEscape(char c, java.lang.String str) {
            com.google.common.base.Preconditions.checkNotNull(str);
            this.replacementMap.put(java.lang.Character.valueOf(c), str);
            return this;
        }

        public final com.google.common.escape.Escaper build() {
            return new com.google.common.escape.ArrayBasedCharEscaper(this.replacementMap, this.safeMin, this.safeMax) { // from class: com.google.common.escape.Escapers.Builder.1
                private final char[] replacementChars;

                {
                    this.replacementChars = com.google.common.escape.Escapers.Builder.this.unsafeReplacement != null ? com.google.common.escape.Escapers.Builder.this.unsafeReplacement.toCharArray() : null;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                protected char[] escapeUnsafe(char c) {
                    return this.replacementChars;
                }
            };
        }
    }

    public static java.lang.String computeReplacement(com.google.common.escape.CharEscaper charEscaper, char c) {
        return stringOrNull(charEscaper.escape(c));
    }

    public static java.lang.String computeReplacement(com.google.common.escape.UnicodeEscaper unicodeEscaper, int i) {
        return stringOrNull(unicodeEscaper.escape(i));
    }

    private static java.lang.String stringOrNull(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new java.lang.String(cArr);
    }
}
