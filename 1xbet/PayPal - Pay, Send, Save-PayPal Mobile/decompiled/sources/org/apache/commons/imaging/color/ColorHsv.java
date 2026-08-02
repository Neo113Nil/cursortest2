package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorHsv {
    public final double H;
    public final double S;
    public final double V;
    public static final org.apache.commons.imaging.color.ColorHsv BLACK = new org.apache.commons.imaging.color.ColorHsv(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorHsv WHITE = new org.apache.commons.imaging.color.ColorHsv(0.0d, 0.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorHsv RED = new org.apache.commons.imaging.color.ColorHsv(0.0d, 100.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorHsv GREEN = new org.apache.commons.imaging.color.ColorHsv(120.0d, 100.0d, 100.0d);
    public static final org.apache.commons.imaging.color.ColorHsv BLUE = new org.apache.commons.imaging.color.ColorHsv(240.0d, 100.0d, 100.0d);

    public ColorHsv(double d, double d2, double d3) {
        this.H = d;
        this.S = d2;
        this.V = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{H: ");
        sb.append(this.H);
        sb.append(", S: ");
        sb.append(this.S);
        sb.append(", V: ");
        sb.append(this.V);
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
        org.apache.commons.imaging.color.ColorHsv colorHsv = (org.apache.commons.imaging.color.ColorHsv) obj;
        return java.lang.Double.compare(colorHsv.H, this.H) == 0 && java.lang.Double.compare(colorHsv.S, this.S) == 0 && java.lang.Double.compare(colorHsv.V, this.V) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.H);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.S);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.V);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
