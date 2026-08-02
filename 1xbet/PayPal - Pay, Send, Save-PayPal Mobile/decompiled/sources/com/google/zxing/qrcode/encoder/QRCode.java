package com.google.zxing.qrcode.encoder;

/* loaded from: classes9.dex */
public final class QRCode {
    public static final int NUM_MASK_PATTERNS = 8;
    private com.google.zxing.qrcode.decoder.ErrorCorrectionLevel ecLevel;
    private int maskPattern = -1;
    private com.google.zxing.qrcode.encoder.ByteMatrix matrix;
    private com.google.zxing.qrcode.decoder.Mode mode;
    private com.google.zxing.qrcode.decoder.Version version;

    public static boolean isValidMaskPattern(int i) {
        return i >= 0 && i < 8;
    }

    public final com.google.zxing.qrcode.decoder.Mode getMode() {
        return this.mode;
    }

    public final com.google.zxing.qrcode.decoder.ErrorCorrectionLevel getECLevel() {
        return this.ecLevel;
    }

    public final com.google.zxing.qrcode.decoder.Version getVersion() {
        return this.version;
    }

    public final int getMaskPattern() {
        return this.maskPattern;
    }

    public final com.google.zxing.qrcode.encoder.ByteMatrix getMatrix() {
        return this.matrix;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.mode);
        sb.append("\n ecLevel: ");
        sb.append(this.ecLevel);
        sb.append("\n version: ");
        sb.append(this.version);
        sb.append("\n maskPattern: ");
        sb.append(this.maskPattern);
        if (this.matrix == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.matrix);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    public final void setMode(com.google.zxing.qrcode.decoder.Mode mode) {
        this.mode = mode;
    }

    public final void setECLevel(com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel) {
        this.ecLevel = errorCorrectionLevel;
    }

    public final void setVersion(com.google.zxing.qrcode.decoder.Version version) {
        this.version = version;
    }

    public final void setMaskPattern(int i) {
        this.maskPattern = i;
    }

    public final void setMatrix(com.google.zxing.qrcode.encoder.ByteMatrix byteMatrix) {
        this.matrix = byteMatrix;
    }
}
