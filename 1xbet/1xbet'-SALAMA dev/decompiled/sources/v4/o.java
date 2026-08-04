package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17198c;

    public o(Long l7, r rVar) {
        super(rVar);
        this.f17198c = l7.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f17198c == oVar.f17198c && this.f17196a.equals(oVar.f17196a);
    }

    @Override // v4.r
    public final Object getValue() {
        return Long.valueOf(this.f17198c);
    }

    public final int hashCode() {
        long j = this.f17198c;
        return this.f17196a.hashCode() + ((int) (j ^ (j >>> 32)));
    }

    @Override // v4.r
    public final String j(int i7) {
        StringBuilder sbC = p136t.e.c(p031e1.k.e(t(i7), "number:"));
        sbC.append(p120q4.k.a(this.f17198c));
        return sbC.toString();
    }

    @Override // v4.n
    public final int l(n nVar) {
        long j = ((o) nVar).f17198c;
        char[] cArr = p120q4.k.f15871a;
        long j3 = this.f17198c;
        if (j3 < j) {
            return -1;
        }
        return j3 == j ? 0 : 1;
    }

    @Override // v4.n
    public final int m() {
        return 3;
    }

    @Override // v4.r
    public final r v(r rVar) {
        return new o(Long.valueOf(this.f17198c), rVar);
    }
}
