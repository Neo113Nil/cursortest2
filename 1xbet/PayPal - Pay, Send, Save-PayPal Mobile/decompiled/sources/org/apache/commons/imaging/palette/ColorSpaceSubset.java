package org.apache.commons.imaging.palette;

/* loaded from: classes17.dex */
class ColorSpaceSubset {
    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(org.apache.commons.imaging.palette.ColorSpaceSubset.class.getName());
    public static final org.apache.commons.imaging.palette.ColorSpaceSubset.RgbComparator RGB_COMPARATOR = new org.apache.commons.imaging.palette.ColorSpaceSubset.RgbComparator();
    private int index;
    final int[] maxs;
    final int[] mins;
    final int precision;
    final int precisionMask;
    int rgb;
    final int total;

    ColorSpaceSubset(int i, int i2) {
        this.total = i;
        this.precision = i2;
        this.precisionMask = (1 << i2) - 1;
        this.mins = new int[3];
        this.maxs = new int[3];
        for (int i3 = 0; i3 < 3; i3++) {
            this.mins[i3] = 0;
            this.maxs[i3] = this.precisionMask;
        }
        this.rgb = -1;
    }

    ColorSpaceSubset(int i, int i2, int[] iArr, int[] iArr2) {
        this.total = i;
        this.precision = i2;
        this.mins = iArr;
        this.maxs = iArr2;
        this.precisionMask = (1 << i2) - 1;
        this.rgb = -1;
    }

    public final boolean contains(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 8 - this.precision;
        int i7 = i >> i6;
        int[] iArr = this.mins;
        if (iArr[0] > i7) {
            return false;
        }
        int[] iArr2 = this.maxs;
        return iArr2[0] >= i7 && iArr[1] <= (i4 = i2 >> i6) && iArr2[1] >= i4 && iArr[2] <= (i5 = i3 >> i6) && iArr2[2] >= i5;
    }

    public void dump(java.lang.String str) {
        int[] iArr = this.maxs;
        int i = iArr[0];
        int[] iArr2 = this.mins;
        int i2 = (i - iArr2[0]) + 1;
        int i3 = (iArr[1] - iArr2[1]) + 1;
        int i4 = (iArr[2] - iArr2[2]) + 1;
        java.util.logging.Logger logger = LOGGER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": [");
        sb.append(java.lang.Integer.toHexString(this.rgb));
        sb.append("] total : ");
        sb.append(this.total);
        logger.fine(sb.toString());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("\trgb: ");
        sb2.append(java.lang.Integer.toHexString(this.rgb));
        sb2.append(", red: ");
        sb2.append(java.lang.Integer.toHexString(this.mins[0] << (8 - this.precision)));
        sb2.append(", ");
        sb2.append(java.lang.Integer.toHexString(this.maxs[0] << (8 - this.precision)));
        sb2.append(", green: ");
        sb2.append(java.lang.Integer.toHexString(this.mins[1] << (8 - this.precision)));
        sb2.append(", ");
        sb2.append(java.lang.Integer.toHexString(this.maxs[1] << (8 - this.precision)));
        sb2.append(", blue: ");
        sb2.append(java.lang.Integer.toHexString(this.mins[2] << (8 - this.precision)));
        sb2.append(", ");
        sb2.append(java.lang.Integer.toHexString(this.maxs[2] << (8 - this.precision)));
        logger.fine(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("\tred: ");
        sb3.append(this.mins[0]);
        sb3.append(", ");
        sb3.append(this.maxs[0]);
        sb3.append(", green: ");
        sb3.append(this.mins[1]);
        sb3.append(", ");
        sb3.append(this.maxs[1]);
        sb3.append(", blue: ");
        sb3.append(this.mins[2]);
        sb3.append(", ");
        sb3.append(this.maxs[2]);
        logger.fine(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("\trdiff: ");
        sb4.append(i2);
        sb4.append(", gdiff: ");
        sb4.append(i3);
        sb4.append(", bdiff: ");
        sb4.append(i4);
        sb4.append(", colorArea: ");
        sb4.append(i2 * i3 * i4);
        logger.fine(sb4.toString());
    }

    public void dumpJustRGB(java.lang.String str) {
        java.util.logging.Logger logger = LOGGER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\trgb: ");
        sb.append(java.lang.Integer.toHexString(this.rgb));
        sb.append(", red: ");
        sb.append(java.lang.Integer.toHexString(this.mins[0] << (8 - this.precision)));
        sb.append(", ");
        sb.append(java.lang.Integer.toHexString(this.maxs[0] << (8 - this.precision)));
        sb.append(", green: ");
        sb.append(java.lang.Integer.toHexString(this.mins[1] << (8 - this.precision)));
        sb.append(", ");
        sb.append(java.lang.Integer.toHexString(this.maxs[1] << (8 - this.precision)));
        sb.append(", blue: ");
        sb.append(java.lang.Integer.toHexString(this.mins[2] << (8 - this.precision)));
        sb.append(", ");
        sb.append(java.lang.Integer.toHexString(this.maxs[2] << (8 - this.precision)));
        logger.fine(sb.toString());
    }

    public int getArea() {
        int[] iArr = this.maxs;
        int i = iArr[0];
        int[] iArr2 = this.mins;
        return ((i - iArr2[0]) + 1) * ((iArr[1] - iArr2[1]) + 1) * ((iArr[2] - iArr2[2]) + 1);
    }

    public void setAverageRGB(int[] iArr) {
        int i = this.mins[0];
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (char c = 0; i <= this.maxs[c]; c = 0) {
            int i2 = this.mins[1];
            for (char c2 = 1; i2 <= this.maxs[c2]; c2 = 1) {
                for (int i3 = this.mins[2]; i3 <= this.maxs[2]; i3++) {
                    int i4 = this.precision;
                    int i5 = iArr[(i3 << (i4 * 2)) | (i2 << i4) | i];
                    int i6 = 8 - i4;
                    j += i5 * (i << i6);
                    j2 += (i2 << i6) * i5;
                    j3 += i5 * (i3 << i6);
                }
                i2++;
            }
            i++;
        }
        long j4 = this.total;
        this.rgb = (int) (((255 & (j2 / j4)) << 8) | (((j / j4) & 255) << 16) | ((j3 / j4) & 255));
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public static class RgbComparator implements java.util.Comparator<org.apache.commons.imaging.palette.ColorSpaceSubset>, java.io.Serializable {
        private static final long serialVersionUID = 509214838111679029L;

        @Override // java.util.Comparator
        public int compare(org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset, org.apache.commons.imaging.palette.ColorSpaceSubset colorSpaceSubset2) {
            return colorSpaceSubset.rgb - colorSpaceSubset2.rgb;
        }
    }
}
