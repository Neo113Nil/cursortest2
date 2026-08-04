package v4;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f17188c;

    public h(Map map, r rVar) {
        super(rVar);
        this.f17188c = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17188c.equals(hVar.f17188c) && this.f17196a.equals(hVar.f17196a);
    }

    @Override // v4.r
    public final Object getValue() {
        return this.f17188c;
    }

    public final int hashCode() {
        return this.f17196a.hashCode() + this.f17188c.hashCode();
    }

    @Override // v4.r
    public final String j(int i7) {
        return t(i7) + "deferredValue:" + this.f17188c;
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
        p120q4.k.c(p115p6.c.j(rVar));
        return new h(this.f17188c, rVar);
    }
}
