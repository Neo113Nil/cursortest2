package com.google.zxing.qrcode.detector;

/* loaded from: classes9.dex */
public final class FinderPatternInfo {
    private final com.google.zxing.qrcode.detector.FinderPattern bottomLeft;
    private final com.google.zxing.qrcode.detector.FinderPattern topLeft;
    private final com.google.zxing.qrcode.detector.FinderPattern topRight;

    public FinderPatternInfo(com.google.zxing.qrcode.detector.FinderPattern[] finderPatternArr) {
        this.bottomLeft = finderPatternArr[0];
        this.topLeft = finderPatternArr[1];
        this.topRight = finderPatternArr[2];
    }

    public final com.google.zxing.qrcode.detector.FinderPattern getBottomLeft() {
        return this.bottomLeft;
    }

    public final com.google.zxing.qrcode.detector.FinderPattern getTopLeft() {
        return this.topLeft;
    }

    public final com.google.zxing.qrcode.detector.FinderPattern getTopRight() {
        return this.topRight;
    }
}
