package com.google.re2j;

/* loaded from: classes9.dex */
abstract class MatcherInput {

    enum Encoding {
        UTF_16,
        UTF_8
    }

    abstract byte[] asBytes();

    abstract java.lang.CharSequence asCharSequence();

    abstract com.google.re2j.MatcherInput.Encoding getEncoding();

    abstract int length();

    MatcherInput() {
    }

    static com.google.re2j.MatcherInput utf16(java.lang.CharSequence charSequence) {
        return new com.google.re2j.MatcherInput.Utf16MatcherInput(charSequence);
    }

    static com.google.re2j.MatcherInput utf8(byte[] bArr) {
        return new com.google.re2j.MatcherInput.Utf8MatcherInput(bArr);
    }

    static com.google.re2j.MatcherInput utf8(java.lang.String str) {
        return new com.google.re2j.MatcherInput.Utf8MatcherInput(str.getBytes(java.nio.charset.Charset.forName("UTF-8")));
    }

    static class Utf8MatcherInput extends com.google.re2j.MatcherInput {
        byte[] bytes;

        public Utf8MatcherInput(byte[] bArr) {
            this.bytes = bArr;
        }

        @Override // com.google.re2j.MatcherInput
        public com.google.re2j.MatcherInput.Encoding getEncoding() {
            return com.google.re2j.MatcherInput.Encoding.UTF_8;
        }

        @Override // com.google.re2j.MatcherInput
        public java.lang.CharSequence asCharSequence() {
            return new java.lang.String(this.bytes, java.nio.charset.Charset.forName("UTF-8"));
        }

        @Override // com.google.re2j.MatcherInput
        public byte[] asBytes() {
            return this.bytes;
        }

        @Override // com.google.re2j.MatcherInput
        public int length() {
            return this.bytes.length;
        }
    }

    static class Utf16MatcherInput extends com.google.re2j.MatcherInput {
        java.lang.CharSequence charSequence;

        public Utf16MatcherInput(java.lang.CharSequence charSequence) {
            this.charSequence = charSequence;
        }

        @Override // com.google.re2j.MatcherInput
        public com.google.re2j.MatcherInput.Encoding getEncoding() {
            return com.google.re2j.MatcherInput.Encoding.UTF_16;
        }

        @Override // com.google.re2j.MatcherInput
        public java.lang.CharSequence asCharSequence() {
            return this.charSequence;
        }

        @Override // com.google.re2j.MatcherInput
        public byte[] asBytes() {
            return this.charSequence.toString().getBytes(java.nio.charset.Charset.forName(codec.CharEncoding.UTF_16));
        }

        @Override // com.google.re2j.MatcherInput
        public int length() {
            return this.charSequence.length();
        }
    }
}
