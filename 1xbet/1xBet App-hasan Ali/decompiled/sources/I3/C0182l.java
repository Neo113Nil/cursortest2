package I3;

import u.AbstractC2462i;

/* renamed from: I3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182l extends F3.y {

    /* renamed from: b, reason: collision with root package name */
    public static final C0181k f2659b = new C0181k(0, new C0182l(F3.x.f1562l));

    /* renamed from: a, reason: collision with root package name */
    public final F3.x f2660a;

    public C0182l(F3.x xVar) {
        this.f2660a = xVar;
    }

    @Override // F3.y
    public final Object a(N3.a aVar) {
        int K = aVar.K();
        int b3 = AbstractC2462i.b(K);
        if (b3 == 5 || b3 == 6) {
            return this.f2660a.a(aVar);
        }
        if (b3 == 8) {
            aVar.G();
            return null;
        }
        throw new F3.p("Expecting number, got: " + L1.a.u(K) + "; at path " + aVar.m(false));
    }

    @Override // F3.y
    public final void b(N3.b bVar, Object obj) {
        bVar.A((Number) obj);
    }
}
