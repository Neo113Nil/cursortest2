package o2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f18625a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18626b;

    public d(String str, int i) {
        this.f18625a = str;
        this.f18626b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f18626b != dVar.f18626b) {
            return false;
        }
        return this.f18625a.equals(dVar.f18625a);
    }

    public final int hashCode() {
        return (this.f18625a.hashCode() * 31) + this.f18626b;
    }
}
