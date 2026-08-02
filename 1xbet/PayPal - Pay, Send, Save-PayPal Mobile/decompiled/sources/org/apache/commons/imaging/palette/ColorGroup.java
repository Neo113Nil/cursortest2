package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
class ColorGroup {
    final int alphaDiff;
    final int blueDiff;
    private final java.util.List<org.apache.commons.imaging.palette.ColorCount> colorCounts;
    org.apache.commons.imaging.palette.ColorGroupCut cut;
    final int diffTotal;
    final int greenDiff;
    final boolean ignoreAlpha;
    int maxAlpha;
    int maxBlue;
    final int maxDiff;
    int maxGreen;
    int maxRed;
    int minAlpha;
    int minBlue;
    int minGreen;
    int minRed;
    int paletteIndex = -1;
    final int redDiff;
    final int totalPoints;

    ColorGroup(java.util.List<org.apache.commons.imaging.palette.ColorCount> list, boolean z) throws org.apache.commons.imaging.ImageWriteException {
        this.minRed = Integer.MAX_VALUE;
        this.maxRed = Integer.MIN_VALUE;
        this.minGreen = Integer.MAX_VALUE;
        this.maxGreen = Integer.MIN_VALUE;
        this.minBlue = Integer.MAX_VALUE;
        this.maxBlue = Integer.MIN_VALUE;
        this.minAlpha = Integer.MAX_VALUE;
        this.maxAlpha = Integer.MIN_VALUE;
        this.colorCounts = list;
        this.ignoreAlpha = z;
        if (list.isEmpty()) {
            throw new org.apache.commons.imaging.ImageWriteException("empty color_group");
        }
        int i = 0;
        for (org.apache.commons.imaging.palette.ColorCount colorCount : list) {
            i += colorCount.count;
            this.minAlpha = java.lang.Math.min(this.minAlpha, colorCount.alpha);
            this.maxAlpha = java.lang.Math.max(this.maxAlpha, colorCount.alpha);
            this.minRed = java.lang.Math.min(this.minRed, colorCount.red);
            this.maxRed = java.lang.Math.max(this.maxRed, colorCount.red);
            this.minGreen = java.lang.Math.min(this.minGreen, colorCount.green);
            this.maxGreen = java.lang.Math.max(this.maxGreen, colorCount.green);
            this.minBlue = java.lang.Math.min(this.minBlue, colorCount.blue);
            this.maxBlue = java.lang.Math.max(this.maxBlue, colorCount.blue);
        }
        this.totalPoints = i;
        int i2 = this.maxAlpha - this.minAlpha;
        this.alphaDiff = i2;
        int i3 = this.maxRed - this.minRed;
        this.redDiff = i3;
        int i4 = this.maxGreen - this.minGreen;
        this.greenDiff = i4;
        int i5 = this.maxBlue - this.minBlue;
        this.blueDiff = i5;
        this.maxDiff = java.lang.Math.max(z ? i3 : java.lang.Math.max(i2, i3), java.lang.Math.max(i4, i5));
        this.diffTotal = (z ? 0 : i2) + i3 + i4 + i5;
    }

    boolean contains(int i) {
        int i2 = (i >> 24) & 255;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 8) & 255;
        int i5 = i & 255;
        return (this.ignoreAlpha || (i2 >= this.minAlpha && i2 <= this.maxAlpha)) && i3 >= this.minRed && i3 <= this.maxRed && i4 >= this.minGreen && i4 <= this.maxGreen && i5 >= this.minBlue && i5 <= this.maxBlue;
    }

    int getMedianValue() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        for (org.apache.commons.imaging.palette.ColorCount colorCount : this.colorCounts) {
            j += colorCount.count;
            j2 += colorCount.count * colorCount.alpha;
            j3 += colorCount.count * colorCount.red;
            j4 += colorCount.count * colorCount.green;
            j5 += colorCount.count * colorCount.blue;
        }
        int round = this.ignoreAlpha ? 255 : (int) java.lang.Math.round(j2 / j);
        double d = j;
        return (round << 24) | (((int) java.lang.Math.round(j3 / d)) << 16) | (((int) java.lang.Math.round(j4 / d)) << 8) | ((int) java.lang.Math.round(j5 / d));
    }

    java.util.List<org.apache.commons.imaging.palette.ColorCount> getColorCounts() {
        return new java.util.ArrayList(this.colorCounts);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{ColorGroup. minRed: ");
        sb.append(java.lang.Integer.toHexString(this.minRed));
        sb.append(", maxRed: ");
        sb.append(java.lang.Integer.toHexString(this.maxRed));
        sb.append(", minGreen: ");
        sb.append(java.lang.Integer.toHexString(this.minGreen));
        sb.append(", maxGreen: ");
        sb.append(java.lang.Integer.toHexString(this.maxGreen));
        sb.append(", minBlue: ");
        sb.append(java.lang.Integer.toHexString(this.minBlue));
        sb.append(", maxBlue: ");
        sb.append(java.lang.Integer.toHexString(this.maxBlue));
        sb.append(", minAlpha: ");
        sb.append(java.lang.Integer.toHexString(this.minAlpha));
        sb.append(", maxAlpha: ");
        sb.append(java.lang.Integer.toHexString(this.maxAlpha));
        sb.append(", maxDiff: ");
        sb.append(java.lang.Integer.toHexString(this.maxDiff));
        sb.append(", diffTotal: ");
        sb.append(this.diffTotal);
        sb.append("}");
        return sb.toString();
    }
}
