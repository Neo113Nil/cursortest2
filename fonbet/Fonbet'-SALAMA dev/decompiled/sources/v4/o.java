package v4;

/* loaded from: classes2.dex */
public final class o extends n {

    /* renamed from: c, reason: collision with root package name */
    public final long f17192c;

    public o(Long l7, r rVar) {
        super(rVar);
        this.f17192c = l7.longValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f17192c == oVar.f17192c && this.f17190a.equals(oVar.f17190a);
    }

    @Override // v4.r
    public final Object getValue() {
        return Long.valueOf(this.f17192c);
    }

    public final int hashCode() {
        long j = this.f17192c;
        return this.f17190a.hashCode() + ((int) (j ^ (j >>> 32)));
    }

    @Override // v4.r
    public final String j(int i7) {
        StringBuilder c3 = t.e.c(e1.k.e(t(i7), "number:"));
        c3.append(q4.k.a(this.f17192c));
        return c3.toString();
    }

    @Override // v4.n
    public final int l(n nVar) {
        long j = ((o) nVar).f17192c;
        char[] cArr = q4.k.f15865a;
        long j3 = this.f17192c;
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
        return new o(Long.valueOf(this.f17192c), rVar);
    }
}
