package com.google.zxing.aztec.encoder;

/* loaded from: classes9.dex */
final class State {
    static final com.google.zxing.aztec.encoder.State INITIAL_STATE = new com.google.zxing.aztec.encoder.State(com.google.zxing.aztec.encoder.Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int binaryShiftCost;
    private final int bitCount;
    private final int mode;
    private final com.google.zxing.aztec.encoder.Token token;

    private static int calculateBinaryShiftCost(int i) {
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    private State(com.google.zxing.aztec.encoder.Token token, int i, int i2, int i3) {
        this.token = token;
        this.mode = i;
        this.binaryShiftByteCount = i2;
        this.bitCount = i3;
        this.binaryShiftCost = calculateBinaryShiftCost(i2);
    }

    final int getMode() {
        return this.mode;
    }

    final com.google.zxing.aztec.encoder.Token getToken() {
        return this.token;
    }

    final int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    final int getBitCount() {
        return this.bitCount;
    }

    final com.google.zxing.aztec.encoder.State appendFLGn(int i) {
        com.google.zxing.aztec.encoder.Token token;
        com.google.zxing.aztec.encoder.Token token2 = shiftAndAppend(4, 0).token;
        int i2 = 3;
        if (i < 0) {
            token = token2.add(0, 3);
        } else {
            if (i > 999999) {
                throw new java.lang.IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] bytes = java.lang.Integer.toString(i).getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
            com.google.zxing.aztec.encoder.Token add = token2.add(bytes.length, 3);
            for (byte b : bytes) {
                add = add.add(b - 46, 4);
            }
            i2 = 3 + (bytes.length * 4);
            token = add;
        }
        return new com.google.zxing.aztec.encoder.State(token, this.mode, 0, this.bitCount + i2);
    }

    final com.google.zxing.aztec.encoder.State latchAndAppend(int i, int i2) {
        int i3 = this.bitCount;
        com.google.zxing.aztec.encoder.Token token = this.token;
        if (i != this.mode) {
            int i4 = com.google.zxing.aztec.encoder.HighLevelEncoder.LATCH_TABLE[this.mode][i];
            int i5 = i4 >> 16;
            token = token.add(i4 & 65535, i5);
            i3 += i5;
        }
        int i6 = i == 2 ? 4 : 5;
        return new com.google.zxing.aztec.encoder.State(token.add(i2, i6), i, 0, i3 + i6);
    }

    final com.google.zxing.aztec.encoder.State shiftAndAppend(int i, int i2) {
        com.google.zxing.aztec.encoder.Token token = this.token;
        int i3 = this.mode == 2 ? 4 : 5;
        return new com.google.zxing.aztec.encoder.State(token.add(com.google.zxing.aztec.encoder.HighLevelEncoder.SHIFT_TABLE[this.mode][i], i3).add(i2, 5), this.mode, 0, this.bitCount + i3 + 5);
    }

    final com.google.zxing.aztec.encoder.State addBinaryShiftChar(int i) {
        com.google.zxing.aztec.encoder.Token token = this.token;
        int i2 = this.mode;
        int i3 = this.bitCount;
        if (i2 == 4 || i2 == 2) {
            int i4 = com.google.zxing.aztec.encoder.HighLevelEncoder.LATCH_TABLE[i2][0];
            int i5 = i4 >> 16;
            token = token.add(i4 & 65535, i5);
            i3 += i5;
            i2 = 0;
        }
        int i6 = this.binaryShiftByteCount;
        com.google.zxing.aztec.encoder.State state = new com.google.zxing.aztec.encoder.State(token, i2, i6 + 1, i3 + ((i6 == 0 || i6 == 31) ? 18 : i6 == 62 ? 9 : 8));
        return state.binaryShiftByteCount == 2078 ? state.endBinaryShift(i + 1) : state;
    }

    final com.google.zxing.aztec.encoder.State endBinaryShift(int i) {
        int i2 = this.binaryShiftByteCount;
        return i2 == 0 ? this : new com.google.zxing.aztec.encoder.State(this.token.addBinaryShift(i - i2, i2), this.mode, 0, this.bitCount);
    }

    final boolean isBetterThanOrEqualTo(com.google.zxing.aztec.encoder.State state) {
        int i = this.bitCount + (com.google.zxing.aztec.encoder.HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i2 = this.binaryShiftByteCount;
        int i3 = state.binaryShiftByteCount;
        if (i2 < i3) {
            i += state.binaryShiftCost - this.binaryShiftCost;
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= state.bitCount;
    }

    final com.google.zxing.common.BitArray toBitArray(byte[] bArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.zxing.aztec.encoder.Token token = endBinaryShift(bArr.length).token; token != null; token = token.getPrevious()) {
            arrayList.add(token);
        }
        com.google.zxing.common.BitArray bitArray = new com.google.zxing.common.BitArray();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((com.google.zxing.aztec.encoder.Token) arrayList.get(size)).appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("%s bits=%d bytes=%d", com.google.zxing.aztec.encoder.HighLevelEncoder.MODE_NAMES[this.mode], java.lang.Integer.valueOf(this.bitCount), java.lang.Integer.valueOf(this.binaryShiftByteCount));
    }
}
