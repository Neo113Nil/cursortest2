package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorXyz {
    public final double X;
    public final double Y;
    public final double Z;
    public static final org.apache.commons.imaging.color.ColorXyz BLACK = new org.apache.commons.imaging.color.ColorXyz(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorXyz WHITE = new org.apache.commons.imaging.color.ColorXyz(95.05d, 100.0d, 108.9d);
    public static final org.apache.commons.imaging.color.ColorXyz RED = new org.apache.commons.imaging.color.ColorXyz(41.24d, 21.26d, 1.93d);
    public static final org.apache.commons.imaging.color.ColorXyz GREEN = new org.apache.commons.imaging.color.ColorXyz(35.76d, 71.52d, 11.92d);
    public static final org.apache.commons.imaging.color.ColorXyz BLUE = new org.apache.commons.imaging.color.ColorXyz(18.05d, 7.22d, 95.05d);

    public ColorXyz(double d, double d2, double d3) {
        this.X = d;
        this.Y = d2;
        this.Z = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{X: ");
        sb.append(this.X);
        sb.append(", Y: ");
        sb.append(this.Y);
        sb.append(", Z: ");
        sb.append(this.Z);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        org.apache.commons.imaging.color.ColorXyz colorXyz = (org.apache.commons.imaging.color.ColorXyz) obj;
        return java.lang.Double.compare(colorXyz.X, this.X) == 0 && java.lang.Double.compare(colorXyz.Y, this.Y) == 0 && java.lang.Double.compare(colorXyz.Z, this.Z) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.X);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.Y);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.Z);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
