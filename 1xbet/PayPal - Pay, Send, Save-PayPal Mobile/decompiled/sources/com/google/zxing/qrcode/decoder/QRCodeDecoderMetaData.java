package com.google.zxing.qrcode.decoder;

/* loaded from: classes9.dex */
public final class QRCodeDecoderMetaData {
    private final boolean mirrored;

    QRCodeDecoderMetaData(boolean z) {
        this.mirrored = z;
    }

    public final boolean isMirrored() {
        return this.mirrored;
    }

    public final void applyMirroredCorrection(com.google.zxing.ResultPoint[] resultPointArr) {
        if (!this.mirrored || resultPointArr == null || resultPointArr.length < 3) {
            return;
        }
        com.google.zxing.ResultPoint resultPoint = resultPointArr[0];
        resultPointArr[0] = resultPointArr[2];
        resultPointArr[2] = resultPoint;
    }
}
