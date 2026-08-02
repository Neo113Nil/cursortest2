package v4;

/* loaded from: classes2.dex */
public final class i extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Double f17183c;

    public i(Double d7, r rVar) {
        super(rVar);
        this.f17183c = d7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17183c.equals(iVar.f17183c) && this.f17190a.equals(iVar.f17190a);
    }

    @Override // v4.r
    public final Object getValue() {
        return this.f17183c;
    }

    public final int hashCode() {
        return this.f17190a.hashCode() + this.f17183c.hashCode();
    }

    @Override // v4.r
    public final String j(int i7) {
        StringBuilder c3 = t.e.c(e1.k.e(t(i7), "number:"));
        c3.append(q4.k.a(this.f17183c.doubleValue()));
        return c3.toString();
    }

    @Override // v4.n
    public final int l(n nVar) {
        return this.f17183c.compareTo(((i) nVar).f17183c);
    }

    @Override // v4.n
    public final int m() {
        return 3;
    }

    @Override // v4.r
    public final r v(r rVar) {
        q4.k.c(p6.c.j(rVar));
        return new i(this.f17183c, rVar);
    }
}
