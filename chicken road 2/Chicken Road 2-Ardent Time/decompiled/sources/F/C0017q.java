package F;

/* renamed from: F.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017q extends m1.AbstractC0935f implements s1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f509e;

    @Override // m1.AbstractC0931b
    public final k1.d b(java.lang.Object obj, k1.d dVar) {
        F.C0017q c0017q = new F.C0017q(2, dVar);
        c0017q.f509e = obj;
        return c0017q;
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        a.AbstractC0059a.A(obj);
        return java.lang.Boolean.valueOf(!(((F.k0) this.f509e) instanceof F.b0));
    }

    @Override // s1.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((F.C0017q) b((F.k0) obj, (k1.d) obj2)).g(h1.C0177i.f3302a);
    }
}
