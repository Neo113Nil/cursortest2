package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorCieLch {
    public final double C;
    public final double H;
    public final double L;
    public static final org.apache.commons.imaging.color.ColorCieLch BLACK = new org.apache.commons.imaging.color.ColorCieLch(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCieLch WHITE = new org.apache.commons.imaging.color.ColorCieLch(100.0d, 0.0d, 297.0d);
    public static final org.apache.commons.imaging.color.ColorCieLch RED = new org.apache.commons.imaging.color.ColorCieLch(53.0d, 80.0d, 67.0d);
    public static final org.apache.commons.imaging.color.ColorCieLch GREEN = new org.apache.commons.imaging.color.ColorCieLch(88.0d, -86.0d, 83.0d);
    public static final org.apache.commons.imaging.color.ColorCieLch BLUE = new org.apache.commons.imaging.color.ColorCieLch(32.0d, 79.0d, -108.0d);

    public ColorCieLch(double d, double d2, double d3) {
        this.L = d;
        this.C = d2;
        this.H = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{L: ");
        sb.append(this.L);
        sb.append(", C: ");
        sb.append(this.C);
        sb.append(", H: ");
        sb.append(this.H);
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
        org.apache.commons.imaging.color.ColorCieLch colorCieLch = (org.apache.commons.imaging.color.ColorCieLch) obj;
        return java.lang.Double.compare(colorCieLch.C, this.C) == 0 && java.lang.Double.compare(colorCieLch.H, this.H) == 0 && java.lang.Double.compare(colorCieLch.L, this.L) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.L);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.C);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.H);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
