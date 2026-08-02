package com.google.zxing.oned.rss;

/* loaded from: classes9.dex */
public final class FinderPattern {
    private final com.google.zxing.ResultPoint[] resultPoints;
    private final int[] startEnd;
    private final int value;

    public FinderPattern(int i, int[] iArr, int i2, int i3, int i4) {
        this.value = i;
        this.startEnd = iArr;
        float f = i4;
        this.resultPoints = new com.google.zxing.ResultPoint[]{new com.google.zxing.ResultPoint(i2, f), new com.google.zxing.ResultPoint(i3, f)};
    }

    public final int getValue() {
        return this.value;
    }

    public final int[] getStartEnd() {
        return this.startEnd;
    }

    public final com.google.zxing.ResultPoint[] getResultPoints() {
        return this.resultPoints;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.zxing.oned.rss.FinderPattern) && this.value == ((com.google.zxing.oned.rss.FinderPattern) obj).value;
    }

    public final int hashCode() {
        return this.value;
    }
}
