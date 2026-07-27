package M3;

import a3.C0182a;
import java.time.Instant;

/* loaded from: classes.dex */
public final class d extends l implements W2.e {

    /* renamed from: h, reason: collision with root package name */
    public L3.g f1957h;

    @Override // W2.e
    public W2.e a(Q2.c cVar) {
        if (cVar != null && !cVar.isEmpty()) {
            cVar.forEach(new D3.a(3, this));
        }
        return this;
    }

    @Override // M3.l, W2.e
    public final W2.e b(String str) {
        super.b(str);
        return this;
    }

    @Override // M3.l, W2.e
    public final void c() {
        i iVar = this.f1969a;
        if (iVar.f1965e != null) {
            return;
        }
        C0182a a6 = C0182a.a();
        long a7 = J3.d.f1367a.a(true);
        h hVar = iVar.f1964d;
        hVar.r(a6, new f(iVar.f1962b, this.f1971c, this.f1972d, a7, ((Y2.f) Y2.g.a(a6)).f3694a, this.f1973e, this.f1974f, this.f1957h));
    }

    @Override // M3.l, W2.e
    public final W2.e d(Instant instant) {
        super.d(instant);
        return this;
    }

    @Override // M3.l, W2.e
    public final W2.e e(W2.i iVar) {
        this.f1973e = iVar;
        return this;
    }

    @Override // M3.l, W2.e
    public final /* bridge */ /* synthetic */ W2.e f(V2.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // M3.l
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ l f(V2.e eVar, Object obj) {
        l(eVar, obj);
        return this;
    }

    @Override // M3.l
    public final l h(Q2.f fVar) {
        this.f1974f = fVar;
        return this;
    }

    @Override // M3.l
    /* renamed from: i */
    public final l b(String str) {
        super.b(str);
        return this;
    }

    @Override // M3.l
    /* renamed from: j */
    public final l e(W2.i iVar) {
        this.f1973e = iVar;
        return this;
    }

    @Override // M3.l
    /* renamed from: k */
    public final l d(Instant instant) {
        super.d(instant);
        return this;
    }

    public final void l(V2.e eVar, Object obj) {
        if (eVar == null || eVar.f3237b.isEmpty() || obj == null) {
            return;
        }
        S2.a c2 = S2.a.c(eVar);
        if (c2.f2746b.isEmpty()) {
            return;
        }
        if (this.f1957h == null) {
            b bVar = (b) this.f1970b;
            bVar.getClass();
            this.f1957h = new L3.g(bVar.f1947b, 128);
        }
        this.f1957h.put(c2, obj);
    }
}
