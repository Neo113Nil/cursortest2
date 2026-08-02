package com.google.zxing.datamatrix.encoder;

/* loaded from: classes9.dex */
final class EncoderContext {
    private final java.lang.StringBuilder codewords;
    private com.google.zxing.Dimension maxSize;
    private com.google.zxing.Dimension minSize;
    private final java.lang.String msg;
    private int newEncoding;
    int pos;
    private com.google.zxing.datamatrix.encoder.SymbolShapeHint shape;
    private int skipAtEnd;
    private com.google.zxing.datamatrix.encoder.SymbolInfo symbolInfo;

    EncoderContext(java.lang.String str) {
        byte[] bytes = str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                throw new java.lang.IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c);
        }
        this.msg = sb.toString();
        this.shape = com.google.zxing.datamatrix.encoder.SymbolShapeHint.FORCE_NONE;
        this.codewords = new java.lang.StringBuilder(str.length());
        this.newEncoding = -1;
    }

    public final void setSymbolShape(com.google.zxing.datamatrix.encoder.SymbolShapeHint symbolShapeHint) {
        this.shape = symbolShapeHint;
    }

    public final void setSizeConstraints(com.google.zxing.Dimension dimension, com.google.zxing.Dimension dimension2) {
        this.minSize = dimension;
        this.maxSize = dimension2;
    }

    public final java.lang.String getMessage() {
        return this.msg;
    }

    public final void setSkipAtEnd(int i) {
        this.skipAtEnd = i;
    }

    public final char getCurrentChar() {
        return this.msg.charAt(this.pos);
    }

    public final char getCurrent() {
        return this.msg.charAt(this.pos);
    }

    public final java.lang.StringBuilder getCodewords() {
        return this.codewords;
    }

    public final void writeCodewords(java.lang.String str) {
        this.codewords.append(str);
    }

    public final void writeCodeword(char c) {
        this.codewords.append(c);
    }

    public final int getCodewordCount() {
        return this.codewords.length();
    }

    public final int getNewEncoding() {
        return this.newEncoding;
    }

    public final void signalEncoderChange(int i) {
        this.newEncoding = i;
    }

    public final void resetEncoderSignal() {
        this.newEncoding = -1;
    }

    public final boolean hasMoreCharacters() {
        return this.pos < getTotalMessageCharCount();
    }

    private int getTotalMessageCharCount() {
        return this.msg.length() - this.skipAtEnd;
    }

    public final int getRemainingCharacters() {
        return getTotalMessageCharCount() - this.pos;
    }

    public final com.google.zxing.datamatrix.encoder.SymbolInfo getSymbolInfo() {
        return this.symbolInfo;
    }

    public final void updateSymbolInfo() {
        updateSymbolInfo(getCodewordCount());
    }

    public final void updateSymbolInfo(int i) {
        com.google.zxing.datamatrix.encoder.SymbolInfo symbolInfo = this.symbolInfo;
        if (symbolInfo == null || i > symbolInfo.getDataCapacity()) {
            this.symbolInfo = com.google.zxing.datamatrix.encoder.SymbolInfo.lookup(i, this.shape, this.minSize, this.maxSize, true);
        }
    }

    public final void resetSymbolInfo() {
        this.symbolInfo = null;
    }
}
