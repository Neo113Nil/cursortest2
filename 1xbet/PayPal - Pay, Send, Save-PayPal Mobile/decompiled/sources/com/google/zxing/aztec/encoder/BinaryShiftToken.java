package com.google.zxing.aztec.encoder;

/* loaded from: classes9.dex */
final class BinaryShiftToken extends com.google.zxing.aztec.encoder.Token {
    private final int binaryShiftByteCount;
    private final int binaryShiftStart;

    BinaryShiftToken(com.google.zxing.aztec.encoder.Token token, int i, int i2) {
        super(token);
        this.binaryShiftStart = i;
        this.binaryShiftByteCount = i2;
    }

    @Override // com.google.zxing.aztec.encoder.Token
    public final void appendTo(com.google.zxing.common.BitArray bitArray, byte[] bArr) {
        int i = this.binaryShiftByteCount;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 || (i2 == 31 && i <= 62)) {
                bitArray.appendBits(31, 5);
                if (i > 62) {
                    bitArray.appendBits(i - 31, 16);
                } else if (i2 == 0) {
                    bitArray.appendBits(java.lang.Math.min(i, 31), 5);
                } else {
                    bitArray.appendBits(i - 31, 5);
                }
            }
            bitArray.appendBits(bArr[this.binaryShiftStart + i2], 8);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
        sb.append(this.binaryShiftStart);
        sb.append("::");
        sb.append((this.binaryShiftStart + this.binaryShiftByteCount) - 1);
        sb.append(kotlin.text.Typography.greater);
        return sb.toString();
    }
}
