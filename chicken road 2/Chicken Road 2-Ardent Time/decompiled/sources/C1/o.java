package C1;

/* loaded from: classes.dex */
public final class o implements C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f162b;

    public /* synthetic */ o(int i2, java.lang.Object obj) {
        this.f161a = i2;
        this.f162b = obj;
    }

    @Override // C1.e
    public final java.lang.Object a(java.lang.Object obj, k1.d dVar) {
        java.lang.Object d2;
        switch (this.f161a) {
            case 0:
                ((kotlin.jvm.internal.p) this.f162b).f7960a = obj;
                throw new D1.a(this);
            case 1:
                F.P p2 = (F.P) this.f162b;
                boolean z2 = p2.f385h.l() instanceof F.b0;
                h1.C0177i c0177i = h1.C0177i.f3302a;
                return (z2 || (d2 = F.P.d(p2, true, dVar)) != l1.EnumC0927a.f8017a) ? c0177i : d2;
            default:
                ((P0.q) this.f162b).accept(obj);
                return h1.C0177i.f3302a;
        }
    }
}
