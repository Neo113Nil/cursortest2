package com.google.zxing.pdf417.decoder;

/* loaded from: classes4.dex */
final class DetectionResult {
    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata;
    private com.google.zxing.pdf417.decoder.BoundingBox boundingBox;
    private final com.google.zxing.pdf417.decoder.DetectionResultColumn[] detectionResultColumns;

    DetectionResult(com.google.zxing.pdf417.decoder.BarcodeMetadata barcodeMetadata, com.google.zxing.pdf417.decoder.BoundingBox boundingBox) {
        this.barcodeMetadata = barcodeMetadata;
        int columnCount = barcodeMetadata.getColumnCount();
        this.barcodeColumnCount = columnCount;
        this.boundingBox = boundingBox;
        this.detectionResultColumns = new com.google.zxing.pdf417.decoder.DetectionResultColumn[columnCount + 2];
    }

    com.google.zxing.pdf417.decoder.DetectionResultColumn[] getDetectionResultColumns() {
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[0]);
        adjustIndicatorColumnRowNumbers(this.detectionResultColumns[this.barcodeColumnCount + 1]);
        int i = com.google.zxing.pdf417.PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int adjustRowNumbers = adjustRowNumbers();
            if (adjustRowNumbers <= 0 || adjustRowNumbers >= i) {
                break;
            }
            i = adjustRowNumbers;
        }
        return this.detectionResultColumns;
    }

    private void adjustIndicatorColumnRowNumbers(com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn) {
        if (detectionResultColumn != null) {
            ((com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn) detectionResultColumn).adjustCompleteIndicatorColumnRowNumbers(this.barcodeMetadata);
        }
    }

    private int adjustRowNumbers() {
        int adjustRowNumbersByRow = adjustRowNumbersByRow();
        if (adjustRowNumbersByRow == 0) {
            return 0;
        }
        for (int i = 1; i < this.barcodeColumnCount + 1; i++) {
            com.google.zxing.pdf417.decoder.Codeword[] codewords = this.detectionResultColumns[i].getCodewords();
            for (int i2 = 0; i2 < codewords.length; i2++) {
                com.google.zxing.pdf417.decoder.Codeword codeword = codewords[i2];
                if (codeword != null && !codeword.hasValidRowNumber()) {
                    adjustRowNumbers(i, i2, codewords);
                }
            }
        }
        return adjustRowNumbersByRow;
    }

    private int adjustRowNumbersByRow() {
        adjustRowNumbersFromBothRI();
        return adjustRowNumbersFromLRI() + adjustRowNumbersFromRRI();
    }

    private void adjustRowNumbersFromBothRI() {
        com.google.zxing.pdf417.decoder.DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null || detectionResultColumnArr[this.barcodeColumnCount + 1] == null) {
            return;
        }
        com.google.zxing.pdf417.decoder.Codeword[] codewords = detectionResultColumn.getCodewords();
        com.google.zxing.pdf417.decoder.Codeword[] codewords2 = this.detectionResultColumns[this.barcodeColumnCount + 1].getCodewords();
        for (int i = 0; i < codewords.length; i++) {
            com.google.zxing.pdf417.decoder.Codeword codeword = codewords[i];
            if (codeword != null && codewords2[i] != null && codeword.getRowNumber() == codewords2[i].getRowNumber()) {
                for (int i2 = 1; i2 <= this.barcodeColumnCount; i2++) {
                    com.google.zxing.pdf417.decoder.Codeword codeword2 = this.detectionResultColumns[i2].getCodewords()[i];
                    if (codeword2 != null) {
                        codeword2.setRowNumber(codewords[i].getRowNumber());
                        if (!codeword2.hasValidRowNumber()) {
                            this.detectionResultColumns[i2].getCodewords()[i] = null;
                        }
                    }
                }
            }
        }
    }

    private int adjustRowNumbersFromRRI() {
        com.google.zxing.pdf417.decoder.DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        int i = this.barcodeColumnCount;
        if (detectionResultColumnArr[i + 1] == null) {
            return 0;
        }
        com.google.zxing.pdf417.decoder.Codeword[] codewords = detectionResultColumnArr[i + 1].getCodewords();
        int i2 = 0;
        for (int i3 = 0; i3 < codewords.length; i3++) {
            com.google.zxing.pdf417.decoder.Codeword codeword = codewords[i3];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int i4 = 0;
                for (int i5 = this.barcodeColumnCount + 1; i5 > 0 && i4 < 2; i5--) {
                    com.google.zxing.pdf417.decoder.Codeword codeword2 = this.detectionResultColumns[i5].getCodewords()[i3];
                    if (codeword2 != null) {
                        i4 = adjustRowNumberIfValid(rowNumber, i4, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    private int adjustRowNumbersFromLRI() {
        com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn = this.detectionResultColumns[0];
        if (detectionResultColumn == null) {
            return 0;
        }
        com.google.zxing.pdf417.decoder.Codeword[] codewords = detectionResultColumn.getCodewords();
        int i = 0;
        for (int i2 = 0; i2 < codewords.length; i2++) {
            com.google.zxing.pdf417.decoder.Codeword codeword = codewords[i2];
            if (codeword != null) {
                int rowNumber = codeword.getRowNumber();
                int i3 = 0;
                for (int i4 = 1; i4 < this.barcodeColumnCount + 1 && i3 < 2; i4++) {
                    com.google.zxing.pdf417.decoder.Codeword codeword2 = this.detectionResultColumns[i4].getCodewords()[i2];
                    if (codeword2 != null) {
                        i3 = adjustRowNumberIfValid(rowNumber, i3, codeword2);
                        if (!codeword2.hasValidRowNumber()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    private static int adjustRowNumberIfValid(int i, int i2, com.google.zxing.pdf417.decoder.Codeword codeword) {
        if (codeword == null || codeword.hasValidRowNumber()) {
            return i2;
        }
        if (!codeword.isValidRowNumber(i)) {
            return i2 + 1;
        }
        codeword.setRowNumber(i);
        return 0;
    }

    private void adjustRowNumbers(int i, int i2, com.google.zxing.pdf417.decoder.Codeword[] codewordArr) {
        com.google.zxing.pdf417.decoder.Codeword codeword = codewordArr[i2];
        com.google.zxing.pdf417.decoder.Codeword[] codewords = this.detectionResultColumns[i - 1].getCodewords();
        com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn = this.detectionResultColumns[i + 1];
        com.google.zxing.pdf417.decoder.Codeword[] codewords2 = detectionResultColumn != null ? detectionResultColumn.getCodewords() : codewords;
        com.google.zxing.pdf417.decoder.Codeword[] codewordArr2 = new com.google.zxing.pdf417.decoder.Codeword[14];
        codewordArr2[2] = codewords[i2];
        codewordArr2[3] = codewords2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            codewordArr2[0] = codewordArr[i3];
            codewordArr2[4] = codewords[i3];
            codewordArr2[5] = codewords2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            codewordArr2[8] = codewordArr[i4];
            codewordArr2[10] = codewords[i4];
            codewordArr2[11] = codewords2[i4];
        }
        if (i2 < codewordArr.length - 1) {
            int i5 = i2 + 1;
            codewordArr2[1] = codewordArr[i5];
            codewordArr2[6] = codewords[i5];
            codewordArr2[7] = codewords2[i5];
        }
        if (i2 < codewordArr.length - 2) {
            int i6 = i2 + 2;
            codewordArr2[9] = codewordArr[i6];
            codewordArr2[12] = codewords[i6];
            codewordArr2[13] = codewords2[i6];
        }
        for (int i7 = 0; i7 < 14 && !adjustRowNumber(codeword, codewordArr2[i7]); i7++) {
        }
    }

    private static boolean adjustRowNumber(com.google.zxing.pdf417.decoder.Codeword codeword, com.google.zxing.pdf417.decoder.Codeword codeword2) {
        if (codeword2 == null || !codeword2.hasValidRowNumber() || codeword2.getBucket() != codeword.getBucket()) {
            return false;
        }
        codeword.setRowNumber(codeword2.getRowNumber());
        return true;
    }

    int getBarcodeColumnCount() {
        return this.barcodeColumnCount;
    }

    int getBarcodeRowCount() {
        return this.barcodeMetadata.getRowCount();
    }

    int getBarcodeECLevel() {
        return this.barcodeMetadata.getErrorCorrectionLevel();
    }

    void setBoundingBox(com.google.zxing.pdf417.decoder.BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    com.google.zxing.pdf417.decoder.BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    void setDetectionResultColumn(int i, com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn) {
        this.detectionResultColumns[i] = detectionResultColumn;
    }

    com.google.zxing.pdf417.decoder.DetectionResultColumn getDetectionResultColumn(int i) {
        return this.detectionResultColumns[i];
    }

    public java.lang.String toString() {
        com.google.zxing.pdf417.decoder.DetectionResultColumn[] detectionResultColumnArr = this.detectionResultColumns;
        com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn = detectionResultColumnArr[0];
        if (detectionResultColumn == null) {
            detectionResultColumn = detectionResultColumnArr[this.barcodeColumnCount + 1];
        }
        java.util.Formatter formatter = new java.util.Formatter();
        for (int i = 0; i < detectionResultColumn.getCodewords().length; i++) {
            try {
                formatter.format("CW %3d:", java.lang.Integer.valueOf(i));
                for (int i2 = 0; i2 < this.barcodeColumnCount + 2; i2++) {
                    com.google.zxing.pdf417.decoder.DetectionResultColumn detectionResultColumn2 = this.detectionResultColumns[i2];
                    if (detectionResultColumn2 == null) {
                        formatter.format("    |   ", new java.lang.Object[0]);
                    } else {
                        com.google.zxing.pdf417.decoder.Codeword codeword = detectionResultColumn2.getCodewords()[i];
                        if (codeword == null) {
                            formatter.format("    |   ", new java.lang.Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", java.lang.Integer.valueOf(codeword.getRowNumber()), java.lang.Integer.valueOf(codeword.getValue()));
                        }
                    }
                }
                formatter.format("%n", new java.lang.Object[0]);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        formatter.close();
                    } catch (java.lang.Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        java.lang.String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
