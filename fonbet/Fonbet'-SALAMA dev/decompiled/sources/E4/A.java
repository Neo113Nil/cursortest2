package E4;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f2084a;

    /* renamed from: b, reason: collision with root package name */
    public final H4.j f2085b;

    public A(int i7, H4.j jVar) {
        this.f2084a = i7;
        this.f2085b = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof A)) {
            return false;
        }
        A a2 = (A) obj;
        return this.f2084a == a2.f2084a && this.f2085b.equals(a2.f2085b);
    }

    public final int hashCode() {
        return this.f2085b.hashCode() + ((t.e.e(this.f2084a) + 899) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2084a == 1 ? "" : "-");
        sb.append(this.f2085b.c());
        return sb.toString();
    }
}
