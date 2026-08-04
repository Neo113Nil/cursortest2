package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17173c;

    public a(Boolean bool, r rVar) {
        super(rVar);
        this.f17173c = bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17173c == aVar.f17173c && this.f17196a.equals(aVar.f17196a);
    }

    @Override // v4.r
    public final Object getValue() {
        return Boolean.valueOf(this.f17173c);
    }

    public final int hashCode() {
        return this.f17196a.hashCode() + (this.f17173c ? 1 : 0);
    }

    @Override // v4.r
    public final String j(int i7) {
        return t(i7) + "boolean:" + this.f17173c;
    }

    @Override // v4.n
    public final int l(n nVar) {
        boolean z4 = ((a) nVar).f17173c;
        boolean z7 = this.f17173c;
        if (z7 == z4) {
            return 0;
        }
        return z7 ? 1 : -1;
    }

    @Override // v4.n
    public final int m() {
        return 2;
    }

    @Override // v4.r
    public final r v(r rVar) {
        return new a(Boolean.valueOf(this.f17173c), rVar);
    }
}
