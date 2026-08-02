package v4;

/* loaded from: classes2.dex */
public final class a extends n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17167c;

    public a(Boolean bool, r rVar) {
        super(rVar);
        this.f17167c = bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17167c == aVar.f17167c && this.f17190a.equals(aVar.f17190a);
    }

    @Override // v4.r
    public final Object getValue() {
        return Boolean.valueOf(this.f17167c);
    }

    public final int hashCode() {
        return this.f17190a.hashCode() + (this.f17167c ? 1 : 0);
    }

    @Override // v4.r
    public final String j(int i7) {
        return t(i7) + "boolean:" + this.f17167c;
    }

    @Override // v4.n
    public final int l(n nVar) {
        boolean z4 = ((a) nVar).f17167c;
        boolean z7 = this.f17167c;
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
        return new a(Boolean.valueOf(this.f17167c), rVar);
    }
}
