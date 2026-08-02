package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorHsl {
    public final double H;
    public final double L;
    public final double S;
    public static final org.apache.commons.imaging.color.ColorHsl BLACK = new org.apache.commons.imaging.color.ColorHsl(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorHsl WHITE = new org.apache.commons.imaging.color.ColorHsl(0.0d, 0.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorHsl RED = new org.apache.commons.imaging.color.ColorHsl(0.0d, 100.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorHsl GREEN = new org.apache.commons.imaging.color.ColorHsl(120.0d, 100.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorHsl BLUE = new org.apache.commons.imaging.color.ColorHsl(240.0d, 100.0d, 100.0d);

    public ColorHsl(double d, double d2, double d3) {
        this.H = d;
        this.S = d2;
        this.L = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{H: ");
        sb.append(this.H);
        sb.append(", S: ");
        sb.append(this.S);
        sb.append(", L: ");
        sb.append(this.L);
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
        org.apache.commons.imaging.color.ColorHsl colorHsl = (org.apache.commons.imaging.color.ColorHsl) obj;
        return java.lang.Double.compare(colorHsl.H, this.H) == 0 && java.lang.Double.compare(colorHsl.L, this.L) == 0 && java.lang.Double.compare(colorHsl.S, this.S) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.H);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.S);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.L);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
