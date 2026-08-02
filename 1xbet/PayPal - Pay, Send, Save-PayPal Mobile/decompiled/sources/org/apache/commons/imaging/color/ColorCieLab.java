package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorCieLab {
    public final double L;

    /* renamed from: a, reason: collision with root package name */
    public final double f7034a;
    public final double b;
    public static final org.apache.commons.imaging.color.ColorCieLab BLACK = new org.apache.commons.imaging.color.ColorCieLab(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCieLab WHITE = new org.apache.commons.imaging.color.ColorCieLab(100.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorCieLab RED = new org.apache.commons.imaging.color.ColorCieLab(53.0d, 80.0d, 67.0d);
    public static final org.apache.commons.imaging.color.ColorCieLab GREEN = new org.apache.commons.imaging.color.ColorCieLab(88.0d, -86.0d, 83.0d);
    public static final org.apache.commons.imaging.color.ColorCieLab BLUE = new org.apache.commons.imaging.color.ColorCieLab(32.0d, 79.0d, -108.0d);

    public ColorCieLab(double d, double d2, double d3) {
        this.L = d;
        this.f7034a = d2;
        this.b = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{L: ");
        sb.append(this.L);
        sb.append(", a: ");
        sb.append(this.f7034a);
        sb.append(", b: ");
        sb.append(this.b);
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
        org.apache.commons.imaging.color.ColorCieLab colorCieLab = (org.apache.commons.imaging.color.ColorCieLab) obj;
        return java.lang.Double.compare(colorCieLab.L, this.L) == 0 && java.lang.Double.compare(colorCieLab.f7034a, this.f7034a) == 0 && java.lang.Double.compare(colorCieLab.b, this.b) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.L);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f7034a);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.b);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
