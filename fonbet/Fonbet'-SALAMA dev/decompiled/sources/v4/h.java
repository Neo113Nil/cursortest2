package v4;

import java.util.Map;

/* loaded from: classes2.dex */
public final class h extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Map f17182c;

    public h(Map map, r rVar) {
        super(rVar);
        this.f17182c = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17182c.equals(hVar.f17182c) && this.f17190a.equals(hVar.f17190a);
    }

    @Override // v4.r
    public final Object getValue() {
        return this.f17182c;
    }

    public final int hashCode() {
        return this.f17190a.hashCode() + this.f17182c.hashCode();
    }

    @Override // v4.r
    public final String j(int i7) {
        return t(i7) + "deferredValue:" + this.f17182c;
    }

    @Override // v4.n
    public final /* bridge */ /* synthetic */ int l(n nVar) {
        return 0;
    }

    @Override // v4.n
    public final int m() {
        return 1;
    }

    @Override // v4.r
    public final r v(r rVar) {
        q4.k.c(p6.c.j(rVar));
        return new h(this.f17182c, rVar);
    }
}
