package org.apache.commons.imaging.color;

/* loaded from: classes17.dex */
public final class ColorHunterLab {
    public final double L;

    /* renamed from: a, reason: collision with root package name */
    public final double f7035a;
    public final double b;
    public static final org.apache.commons.imaging.color.ColorHunterLab BLACK = new org.apache.commons.imaging.color.ColorHunterLab(0.0d, 0.0d, 0.0d);
    public static final org.apache.commons.imaging.color.ColorHunterLab WHITE = new org.apache.commons.imaging.color.ColorHunterLab(100.0d, -5.336d, 5.433d);
    public static final org.apache.commons.imaging.color.ColorHunterLab RED = new org.apache.commons.imaging.color.ColorHunterLab(46.109d, 78.962d, 29.794d);
    public static final org.apache.commons.imaging.color.ColorHunterLab GREEN = new org.apache.commons.imaging.color.ColorHunterLab(84.569d, -72.518d, 50.842d);
    public static final org.apache.commons.imaging.color.ColorHunterLab BLUE = new org.apache.commons.imaging.color.ColorHunterLab(26.87d, 72.885d, -190.923d);

    public ColorHunterLab(double d, double d2, double d3) {
        this.L = d;
        this.f7035a = d2;
        this.b = d3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{L: ");
        sb.append(this.L);
        sb.append(", a: ");
        sb.append(this.f7035a);
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
        org.apache.commons.imaging.color.ColorHunterLab colorHunterLab = (org.apache.commons.imaging.color.ColorHunterLab) obj;
        return java.lang.Double.compare(colorHunterLab.L, this.L) == 0 && java.lang.Double.compare(colorHunterLab.f7035a, this.f7035a) == 0 && java.lang.Double.compare(colorHunterLab.b, this.b) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.L);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.f7035a);
        int i2 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = java.lang.Double.doubleToLongBits(this.b);
        return (((i * 31) + i2) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
