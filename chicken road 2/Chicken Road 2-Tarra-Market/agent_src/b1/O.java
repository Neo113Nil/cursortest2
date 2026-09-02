package b1;

/* loaded from: classes.dex */
public final class O extends N {

    /* renamed from: e, reason: collision with root package name */
    public final S f634e;

    /* renamed from: f, reason: collision with root package name */
    public final P f635f;

    /* renamed from: g, reason: collision with root package name */
    public final C0021i f636g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f637h;

    public O(S s2, P p2, C0021i c0021i, Object obj) {
        this.f634e = s2;
        this.f635f = p2;
        this.f636g = c0021i;
        this.f637h = obj;
    }

    @Override // U0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        k((Throwable) obj);
        return K0.i.f206a;
    }

    @Override // b1.N
    public final void k(Throwable th) {
        C0021i c0021i = this.f636g;
        S s2 = this.f634e;
        s2.getClass();
        C0021i C2 = S.C(c0021i);
        P p2 = this.f635f;
        Object obj = this.f637h;
        if (C2 != null) {
            while (AbstractC0030s.d(C2.f662e, false, new O(s2, p2, C2, obj), 1) == U.f648a) {
                C2 = S.C(C2);
                if (C2 == null) {
                }
            }
            return;
        }
        s2.l(s2.t(p2, obj));
    }
}
