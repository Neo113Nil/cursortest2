package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17209c;

    public v(String str, r rVar) {
        super(rVar);
        this.f17209c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f17209c.equals(vVar.f17209c) && this.f17196a.equals(vVar.f17196a);
    }

    @Override // v4.r
    public final Object getValue() {
        return this.f17209c;
    }

    public final int hashCode() {
        return this.f17196a.hashCode() + this.f17209c.hashCode();
    }

    @Override // v4.r
    public final String j(int i7) {
        int iE = p136t.e.e(i7);
        String str = this.f17209c;
        if (iE == 0) {
            return t(i7) + "string:" + str;
        }
        if (iE != 1) {
            throw new IllegalArgumentException("Invalid hash version for string node: ".concat(p031e1.k.s(i7)));
        }
        return t(i7) + "string:" + p120q4.k.f(str);
    }

    @Override // v4.n
    public final int l(n nVar) {
        return this.f17209c.compareTo(((v) nVar).f17209c);
    }

    @Override // v4.n
    public final int m() {
        return 4;
    }

    @Override // v4.r
    public final r v(r rVar) {
        return new v(this.f17209c, rVar);
    }
}
