package com.google.zxing.pdf417.encoder;

/* loaded from: classes9.dex */
public final class BarcodeMatrix {
    private int currentRow;
    private final int height;
    private final com.google.zxing.pdf417.encoder.BarcodeRow[] matrix;
    private final int width;

    BarcodeMatrix(int i, int i2) {
        this.matrix = new com.google.zxing.pdf417.encoder.BarcodeRow[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.matrix[i3] = new com.google.zxing.pdf417.encoder.BarcodeRow(((i2 + 4) * 17) + 1);
        }
        this.width = i2 * 17;
        this.height = i;
        this.currentRow = -1;
    }

    final void set(int i, int i2, byte b) {
        this.matrix[i2].set(i, b);
    }

    final void startRow() {
        this.currentRow++;
    }

    final com.google.zxing.pdf417.encoder.BarcodeRow getCurrentRow() {
        return this.matrix[this.currentRow];
    }

    public final byte[][] getMatrix() {
        return getScaledMatrix(1, 1);
    }

    public final byte[][] getScaledMatrix(int i, int i2) {
        byte[][] bArr = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, this.height * i2, this.width * i);
        int i3 = this.height * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.matrix[i4 / i2].getScaledRow(i);
        }
        return bArr;
    }
}
