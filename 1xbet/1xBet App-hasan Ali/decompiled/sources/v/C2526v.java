package v;

/* renamed from: v.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2526v {

    /* renamed from: a, reason: collision with root package name */
    public final float f20320a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.M f20321b;

    public C2526v(float f, i0.M m5) {
        this.f20320a = f;
        this.f20321b = m5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2526v)) {
            return false;
        }
        C2526v c2526v = (C2526v) obj;
        return W0.f.a(this.f20320a, c2526v.f20320a) && this.f20321b.equals(c2526v.f20321b);
    }

    public final int hashCode() {
        return i0.p.i(this.f20321b.f17262e) + (Float.floatToIntBits(this.f20320a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) W0.f.b(this.f20320a)) + ", brush=" + this.f20321b + ')';
    }
}
