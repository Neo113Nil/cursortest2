package com.google.zxing.common;

/* loaded from: classes9.dex */
public final class ECIStringBuilder {
    private java.lang.StringBuilder currentBytes;
    private java.nio.charset.Charset currentCharset;
    private java.lang.StringBuilder result;

    public ECIStringBuilder() {
        this.currentCharset = java.nio.charset.StandardCharsets.ISO_8859_1;
        this.currentBytes = new java.lang.StringBuilder();
    }

    public ECIStringBuilder(int i) {
        this.currentCharset = java.nio.charset.StandardCharsets.ISO_8859_1;
        this.currentBytes = new java.lang.StringBuilder(i);
    }

    public final void append(char c) {
        this.currentBytes.append((char) (c & 255));
    }

    public final void append(byte b) {
        this.currentBytes.append((char) (b & 255));
    }

    public final void append(java.lang.String str) {
        this.currentBytes.append(str);
    }

    public final void append(int i) {
        append(java.lang.String.valueOf(i));
    }

    public final void appendECI(int i) throws com.google.zxing.FormatException {
        encodeCurrentBytesIfAny();
        com.google.zxing.common.CharacterSetECI characterSetECIByValue = com.google.zxing.common.CharacterSetECI.getCharacterSetECIByValue(i);
        if (characterSetECIByValue == null) {
            throw com.google.zxing.FormatException.getFormatInstance();
        }
        this.currentCharset = characterSetECIByValue.getCharset();
    }

    private void encodeCurrentBytesIfAny() {
        if (this.currentCharset.equals(java.nio.charset.StandardCharsets.ISO_8859_1)) {
            if (this.currentBytes.length() > 0) {
                java.lang.StringBuilder sb = this.result;
                if (sb == null) {
                    this.result = this.currentBytes;
                    this.currentBytes = new java.lang.StringBuilder();
                    return;
                } else {
                    sb.append((java.lang.CharSequence) this.currentBytes);
                    this.currentBytes = new java.lang.StringBuilder();
                    return;
                }
            }
            return;
        }
        if (this.currentBytes.length() > 0) {
            byte[] bytes = this.currentBytes.toString().getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
            this.currentBytes = new java.lang.StringBuilder();
            java.lang.StringBuilder sb2 = this.result;
            if (sb2 == null) {
                this.result = new java.lang.StringBuilder(new java.lang.String(bytes, this.currentCharset));
            } else {
                sb2.append(new java.lang.String(bytes, this.currentCharset));
            }
        }
    }

    public final void appendCharacters(java.lang.StringBuilder sb) {
        encodeCurrentBytesIfAny();
        this.result.append((java.lang.CharSequence) sb);
    }

    public final int length() {
        return toString().length();
    }

    public final boolean isEmpty() {
        if (this.currentBytes.length() != 0) {
            return false;
        }
        java.lang.StringBuilder sb = this.result;
        return sb == null || sb.length() == 0;
    }

    public final java.lang.String toString() {
        encodeCurrentBytesIfAny();
        java.lang.StringBuilder sb = this.result;
        return sb == null ? "" : sb.toString();
    }
}
