package Q2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f2485a;

    /* renamed from: b, reason: collision with root package name */
    public final g f2486b;

    public d(String str, g gVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f2485a = str;
        if (gVar == null) {
            throw new NullPointerException("Null value");
        }
        this.f2486b = gVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2485a.equals(dVar.f2485a) && this.f2486b.equals(dVar.f2486b);
    }

    public final int hashCode() {
        return ((this.f2485a.hashCode() ^ 1000003) * 1000003) ^ this.f2486b.hashCode();
    }

    public final String toString() {
        return "KeyValueImpl{key=" + this.f2485a + ", value=" + this.f2486b + "}";
    }
}
