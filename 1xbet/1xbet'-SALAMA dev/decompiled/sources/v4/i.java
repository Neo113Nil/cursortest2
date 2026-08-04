package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f17189c;

    public i(Double d7, r rVar) {
        super(rVar);
        this.f17189c = d7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f17189c.equals(iVar.f17189c) && this.f17196a.equals(iVar.f17196a);
    }

    @Override // v4.r
    public final Object getValue() {
        return this.f17189c;
    }

    public final int hashCode() {
        return this.f17196a.hashCode() + this.f17189c.hashCode();
    }

    @Override // v4.r
    public final String j(int i7) {
        StringBuilder sbC = p136t.e.c(p031e1.k.e(t(i7), "number:"));
        sbC.append(p120q4.k.a(this.f17189c.doubleValue()));
        return sbC.toString();
    }

    @Override // v4.n
    public final int l(n nVar) {
        return this.f17189c.compareTo(((i) nVar).f17189c);
    }

    @Override // v4.n
    public final int m() {
        return 3;
    }

    @Override // v4.r
    public final r v(r rVar) {
        p120q4.k.c(p115p6.c.j(rVar));
        return new i(this.f17189c, rVar);
    }
}
