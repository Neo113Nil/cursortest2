package com.google.zxing.pdf417.detector;

/* loaded from: classes9.dex */
public final class PDF417DetectorResult {
    private final com.google.zxing.common.BitMatrix bits;
    private final java.util.List<com.google.zxing.ResultPoint[]> points;
    private final int rotation;

    public PDF417DetectorResult(com.google.zxing.common.BitMatrix bitMatrix, java.util.List<com.google.zxing.ResultPoint[]> list, int i) {
        this.bits = bitMatrix;
        this.points = list;
        this.rotation = i;
    }

    public PDF417DetectorResult(com.google.zxing.common.BitMatrix bitMatrix, java.util.List<com.google.zxing.ResultPoint[]> list) {
        this(bitMatrix, list, 0);
    }

    public final com.google.zxing.common.BitMatrix getBits() {
        return this.bits;
    }

    public final java.util.List<com.google.zxing.ResultPoint[]> getPoints() {
        return this.points;
    }

    public final int getRotation() {
        return this.rotation;
    }
}
