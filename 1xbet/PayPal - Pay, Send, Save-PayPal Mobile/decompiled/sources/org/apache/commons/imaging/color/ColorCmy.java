package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorCmy {
    public final double C;
    public final double M;
    public final double Y;
    public static final org.apache.commons.imaging.color.ColorCmy CYAN = new org.apache.commons.imaging.color.ColorCmy(100.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmy MAGENTA = new org.apache.commons.imaging.color.ColorCmy(0.0d, 100.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmy YELLOW = new org.apache.commons.imaging.color.ColorCmy(0.0d, 0.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorCmy BLACK = new org.apache.commons.imaging.color.ColorCmy(100.0d, 100.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorCmy WHITE = new org.apache.commons.imaging.color.ColorCmy(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCmy RED = new org.apache.commons.imaging.color.ColorCmy(0.0d, 100.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorCmy GREEN = new org.apache.commons.imaging.color.ColorCmy(100.0d, 0.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorCmy BLUE = new org.apache.commons.imaging.color.ColorCmy(100.0d, 100.0d, 0.0d);

    public ColorCmy(double d, double d2, double d3) {
        this.C = d;
        this.M = d2;
        this.Y = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{C: ");
        sb.append(this.C);
        sb.append(", M: ");
        sb.append(this.M);
        sb.append(", Y: ");
        sb.append(this.Y);
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
        org.apache.commons.imaging.color.ColorCmy colorCmy = (org.apache.commons.imaging.color.ColorCmy) obj;
        return java.lang.Double.compare(colorCmy.C, this.C) == 0 && java.lang.Double.compare(colorCmy.M, this.M) == 0 && java.lang.Double.compare(colorCmy.Y, this.Y) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.C);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.M);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.Y);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
