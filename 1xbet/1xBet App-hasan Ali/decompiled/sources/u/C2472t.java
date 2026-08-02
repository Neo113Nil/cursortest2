package u;

/* renamed from: u.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2472t {

    /* renamed from: a, reason: collision with root package name */
    public double f19935a;

    /* renamed from: b, reason: collision with root package name */
    public double f19936b;

    public C2472t(double d5, double d6) {
        this.f19935a = d5;
        this.f19936b = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2472t)) {
            return false;
        }
        C2472t c2472t = (C2472t) obj;
        return Double.compare(this.f19935a, c2472t.f19935a) == 0 && Double.compare(this.f19936b, c2472t.f19936b) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f19935a);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f19936b);
        return i + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public final String toString() {
        return "ComplexDouble(_real=" + this.f19935a + ", _imaginary=" + this.f19936b + ')';
    }
}
