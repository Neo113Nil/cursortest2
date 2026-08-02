package com.google.zxing.pdf417.decoder;

/* loaded from: classes9.dex */
final class BarcodeMetadata {
    private final int columnCount;
    private final int errorCorrectionLevel;
    private final int rowCount;
    private final int rowCountLowerPart;
    private final int rowCountUpperPart;

    BarcodeMetadata(int i, int i2, int i3, int i4) {
        this.columnCount = i;
        this.errorCorrectionLevel = i4;
        this.rowCountUpperPart = i2;
        this.rowCountLowerPart = i3;
        this.rowCount = i2 + i3;
    }

    final int getColumnCount() {
        return this.columnCount;
    }

    final int getErrorCorrectionLevel() {
        return this.errorCorrectionLevel;
    }

    final int getRowCount() {
        return this.rowCount;
    }

    final int getRowCountUpperPart() {
        return this.rowCountUpperPart;
    }

    final int getRowCountLowerPart() {
        return this.rowCountLowerPart;
    }
}
