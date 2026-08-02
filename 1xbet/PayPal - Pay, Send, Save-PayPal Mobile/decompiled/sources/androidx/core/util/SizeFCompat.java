package androidx.core.util;

/* loaded from: classes7.dex */
public final class SizeFCompat {
    private final float getHighSpeedVideoFpsRanges;
    private final float getHighSpeedVideoSizes;

    public SizeFCompat(float f, float f2) {
        this.getHighSpeedVideoFpsRanges = androidx.core.util.Preconditions.checkArgumentFinite(f, "width");
        this.getHighSpeedVideoSizes = androidx.core.util.Preconditions.checkArgumentFinite(f2, "height");
    }

    public final float getWidth() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final float getHeight() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.util.SizeFCompat)) {
            return false;
        }
        androidx.core.util.SizeFCompat sizeFCompat = (androidx.core.util.SizeFCompat) obj;
        return sizeFCompat.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoFpsRanges && sizeFCompat.getHighSpeedVideoSizes == this.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.getHighSpeedVideoFpsRanges) ^ java.lang.Float.floatToIntBits(this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("x");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }

    public final android.util.SizeF toSizeF() {
        return new android.util.SizeF(getWidth(), getHeight());
    }

    public static androidx.core.util.SizeFCompat toSizeFCompat(android.util.SizeF sizeF) {
        return new androidx.core.util.SizeFCompat(sizeF.getWidth(), sizeF.getHeight());
    }
}
