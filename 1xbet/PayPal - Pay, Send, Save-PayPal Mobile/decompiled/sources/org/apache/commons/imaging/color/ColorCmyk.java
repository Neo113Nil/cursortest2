package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorCmyk {
    public final double C;
    public final double K;
    public final double M;
    public final double Y;
    public static final org.apache.commons.imaging.color.ColorCmyk CYAN = new org.apache.commons.imaging.color.ColorCmyk(100.0d, 0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmyk MAGENTA = new org.apache.commons.imaging.color.ColorCmyk(0.0d, 100.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmyk YELLOW = new org.apache.commons.imaging.color.ColorCmyk(0.0d, 0.0d, 100.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmyk BLACK = new org.apache.commons.imaging.color.ColorCmyk(0.0d, 0.0d, 0.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorCmyk WHITE = new org.apache.commons.imaging.color.ColorCmyk(0.0d, 0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmyk RED = new org.apache.commons.imaging.color.ColorCmyk(0.0d, 100.0d, 100.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmyk GREEN = new org.apache.commons.imaging.color.ColorCmyk(100.0d, 0.0d, 100.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmyk BLUE = new org.apache.commons.imaging.color.ColorCmyk(100.0d, 100.0d, 0.0d, 0.0d);

    public ColorCmyk(double d, double d2, double d3, double d4) {
        this.C = d;
        this.M = d2;
        this.Y = d3;
        this.K = d4;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{C: ");
        sb.append(this.C);
        sb.append(", M: ");
        sb.append(this.M);
        sb.append(", Y: ");
        sb.append(this.Y);
        sb.append(", K: ");
        sb.append(this.K);
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
        org.apache.commons.imaging.color.ColorCmyk colorCmyk = (org.apache.commons.imaging.color.ColorCmyk) obj;
        return java.lang.Double.compare(colorCmyk.C, this.C) == 0 && java.lang.Double.compare(colorCmyk.K, this.K) == 0 && java.lang.Double.compare(colorCmyk.M, this.M) == 0 && java.lang.Double.compare(colorCmyk.Y, this.Y) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.C);
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.M);
        int i = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.Y);
        long doubleToLongBits4 = java.lang.Double.doubleToLongBits(this.K);
        return (((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + i) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }
}
