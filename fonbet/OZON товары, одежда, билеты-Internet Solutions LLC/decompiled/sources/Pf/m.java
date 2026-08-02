package Pf;

import java.util.List;

/* loaded from: classes10.dex */
public abstract class m extends n {

    /* renamed from: d, reason: collision with root package name */
    Object f22483d;

    public m() {
        this.f22483d = "";
    }

    private void N() {
        Object obj = this.f22483d;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.f22483d = bVar;
        bVar.v(w(), (String) obj);
    }

    @Override // Pf.n
    public final h B() {
        return this.f22485a;
    }

    public final m L(String str) {
        boolean z11 = this.f22483d instanceof b;
        N();
        n I11 = I();
        f fVar = I11 instanceof f ? (f) I11 : null;
        e().w((fVar != null ? fVar.b0().e() : org.jsoup.parser.k.f79560c).a(), str);
        return this;
    }

    final String M() {
        return c(w());
    }

    @Override // Pf.n
    public final String a(String str) {
        N();
        return super.a(str);
    }

    @Override // Pf.n
    public final String c(String str) {
        return !(this.f22483d instanceof b) ? w().equals(str) ? (String) this.f22483d : "" : super.c(str);
    }

    @Override // Pf.n
    public final b e() {
        N();
        return (b) this.f22483d;
    }

    @Override // Pf.n
    public final String f() {
        h hVar = this.f22485a;
        return hVar != null ? hVar.f() : "";
    }

    @Override // Pf.n
    public final int h() {
        return 0;
    }

    @Override // Pf.n
    protected final n l(n nVar) {
        m mVar = (m) super.l(nVar);
        Object obj = this.f22483d;
        if (obj instanceof b) {
            mVar.f22483d = ((b) obj).clone();
        }
        return mVar;
    }

    @Override // Pf.n
    protected final void m(String str) {
    }

    @Override // Pf.n
    protected final List<n> n() {
        return n.f22484c;
    }

    @Override // Pf.n
    protected final boolean r() {
        return this.f22483d instanceof b;
    }

    protected m(String str) {
        Nf.b.d(str);
        this.f22483d = str;
    }
}
