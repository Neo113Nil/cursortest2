package com.google.zxing.aztec.encoder;

/* loaded from: classes9.dex */
final class SimpleToken extends com.google.zxing.aztec.encoder.Token {
    private final short bitCount;
    private final short value;

    SimpleToken(com.google.zxing.aztec.encoder.Token token, int i, int i2) {
        super(token);
        this.value = (short) i;
        this.bitCount = (short) i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    final void appendTo(com.google.zxing.common.BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public final java.lang.String toString() {
        short s = this.value;
        short s2 = this.bitCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
        int i = 1 << s2;
        sb.append(java.lang.Integer.toBinaryString((s & (i - 1)) | i | (1 << this.bitCount)).substring(1));
        sb.append(kotlin.text.Typography.greater);
        return sb.toString();
    }
}
