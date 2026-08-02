package l4;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2059a {

    /* renamed from: a, reason: collision with root package name */
    public final float f17849a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17850b;

    public C2059a(float f, float f5) {
        this.f17849a = f;
        this.f17850b = f5;
    }

    public static boolean a(Float f, Float f5) {
        return f.floatValue() <= f5.floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2059a)) {
            return false;
        }
        float f = this.f17849a;
        float f5 = this.f17850b;
        if (f > f5) {
            C2059a c2059a = (C2059a) obj;
            if (c2059a.f17849a > c2059a.f17850b) {
                return true;
            }
        }
        C2059a c2059a2 = (C2059a) obj;
        return f == c2059a2.f17849a && f5 == c2059a2.f17850b;
    }

    public final int hashCode() {
        float f = this.f17849a;
        float f5 = this.f17850b;
        if (f > f5) {
            return -1;
        }
        return Float.floatToIntBits(f5) + (Float.floatToIntBits(f) * 31);
    }

    public final String toString() {
        return this.f17849a + ".." + this.f17850b;
    }
}
