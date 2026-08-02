package v4;

/* loaded from: classes2.dex */
public final class v extends n {

    /* renamed from: c, reason: collision with root package name */
    public final String f17203c;

    public v(String str, r rVar) {
        super(rVar);
        this.f17203c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f17203c.equals(vVar.f17203c) && this.f17190a.equals(vVar.f17190a);
    }

    @Override // v4.r
    public final Object getValue() {
        return this.f17203c;
    }

    public final int hashCode() {
        return this.f17190a.hashCode() + this.f17203c.hashCode();
    }

    @Override // v4.r
    public final String j(int i7) {
        int e7 = t.e.e(i7);
        String str = this.f17203c;
        if (e7 == 0) {
            return t(i7) + "string:" + str;
        }
        if (e7 != 1) {
            throw new IllegalArgumentException("Invalid hash version for string node: ".concat(e1.k.s(i7)));
        }
        return t(i7) + "string:" + q4.k.f(str);
    }

    @Override // v4.n
    public final int l(n nVar) {
        return this.f17203c.compareTo(((v) nVar).f17203c);
    }

    @Override // v4.n
    public final int m() {
        return 4;
    }

    @Override // v4.r
    public final r v(r rVar) {
        return new v(this.f17203c, rVar);
    }
}
