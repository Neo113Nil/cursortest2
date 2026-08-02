package E;

import E.O;

/* renamed from: E.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2889e extends O.a {

    /* renamed from: a, reason: collision with root package name */
    private final N.m<O.b> f6890a;

    /* renamed from: b, reason: collision with root package name */
    private final N.m<O.b> f6891b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6892c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6893d;

    C2889e(N.m<O.b> mVar, N.m<O.b> mVar2, int i11, int i12) {
        this.f6890a = mVar;
        this.f6891b = mVar2;
        this.f6892c = i11;
        this.f6893d = i12;
    }

    @Override // E.O.a
    final N.m<O.b> a() {
        return this.f6890a;
    }

    @Override // E.O.a
    final int b() {
        return this.f6892c;
    }

    @Override // E.O.a
    final int c() {
        return this.f6893d;
    }

    @Override // E.O.a
    final N.m<O.b> d() {
        return this.f6891b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof O.a)) {
            return false;
        }
        O.a aVar = (O.a) obj;
        return this.f6890a.equals(aVar.a()) && this.f6891b.equals(aVar.d()) && this.f6892c == aVar.b() && this.f6893d == aVar.c();
    }

    public final int hashCode() {
        return ((((((this.f6890a.hashCode() ^ 1000003) * 1000003) ^ this.f6891b.hashCode()) * 1000003) ^ this.f6892c) * 1000003) ^ this.f6893d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{edge=");
        sb2.append(this.f6890a);
        sb2.append(", postviewEdge=");
        sb2.append(this.f6891b);
        sb2.append(", inputFormat=");
        sb2.append(this.f6892c);
        sb2.append(", outputFormat=");
        return K00.b.e(this.f6893d, "}", sb2);
    }
}
