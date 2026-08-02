package B4;

/* loaded from: classes2.dex */
public final class M implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final double f1116a;

    /* renamed from: b, reason: collision with root package name */
    public final double f1117b;

    public M(double d7, double d8) {
        if (Double.isNaN(d7) || d7 < -90.0d || d7 > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d8) || d8 < -180.0d || d8 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.f1116a = d7;
        this.f1117b = d8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        M m7 = (M) obj;
        double d7 = m7.f1116a;
        H5.k kVar = L4.r.f4389a;
        int H7 = p3.f.H(this.f1116a, d7);
        return H7 == 0 ? p3.f.H(this.f1117b, m7.f1117b) : H7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m7 = (M) obj;
        return this.f1116a == m7.f1116a && this.f1117b == m7.f1117b;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f1116a);
        int i7 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f1117b);
        return (i7 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        return "GeoPoint { latitude=" + this.f1116a + ", longitude=" + this.f1117b + " }";
    }
}
