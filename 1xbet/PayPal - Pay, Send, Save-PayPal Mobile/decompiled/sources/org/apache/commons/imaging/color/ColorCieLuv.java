package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorCieLuv {
    public final double L;
    public final double u;
    public final double v;
    public static final org.apache.commons.imaging.color.ColorCieLuv BLACK = new org.apache.commons.imaging.color.ColorCieLuv(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCieLuv WHITE = new org.apache.commons.imaging.color.ColorCieLuv(100.0d, 0.0d, -0.017d);
    public static final org.apache.commons.imaging.color.ColorCieLuv RED = new org.apache.commons.imaging.color.ColorCieLuv(53.233d, 175.053d, 37.751d);
    public static final org.apache.commons.imaging.color.ColorCieLuv GREEN = new org.apache.commons.imaging.color.ColorCieLuv(87.737d, -83.08d, 107.401d);
    public static final org.apache.commons.imaging.color.ColorCieLuv BLUE = new org.apache.commons.imaging.color.ColorCieLuv(32.303d, -9.4d, -130.358d);

    public ColorCieLuv(double d, double d2, double d3) {
        this.L = d;
        this.u = d2;
        this.v = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{L: ");
        sb.append(this.L);
        sb.append(", u: ");
        sb.append(this.u);
        sb.append(", v: ");
        sb.append(this.v);
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
        org.apache.commons.imaging.color.ColorCieLuv colorCieLuv = (org.apache.commons.imaging.color.ColorCieLuv) obj;
        return java.lang.Double.compare(colorCieLuv.L, this.L) == 0 && java.lang.Double.compare(colorCieLuv.u, this.u) == 0 && java.lang.Double.compare(colorCieLuv.v, this.v) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.L);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.u);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.v);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
