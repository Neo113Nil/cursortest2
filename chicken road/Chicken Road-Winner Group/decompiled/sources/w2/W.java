package w2;

import d2.C0279i;

/* loaded from: classes.dex */
public final class W extends U {

    /* renamed from: e, reason: collision with root package name */
    public final Z f10481e;
    public final X f;

    /* renamed from: g, reason: collision with root package name */
    public final C1231j f10482g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f10483h;

    public W(Z z3, X x3, C1231j c1231j, Object obj) {
        this.f10481e = z3;
        this.f = x3;
        this.f10482g = c1231j;
        this.f10483h = obj;
    }

    @Override // o2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C0279i.f4852a;
    }

    @Override // w2.U
    public final void j(Throwable th) {
        C G3;
        C1231j c1231j = this.f10482g;
        Z z3 = this.f10481e;
        z3.getClass();
        C1231j K2 = Z.K(c1231j);
        X x3 = this.f;
        Object obj = this.f10483h;
        if (K2 != null) {
            do {
                G3 = K2.f10508e.G((r5 & 1) == 0, (r5 & 2) != 0, new W(z3, x3, K2, obj));
                if (G3 != b0.f10496a) {
                    return;
                } else {
                    K2 = Z.K(K2);
                }
            } while (K2 != null);
        }
        z3.o(z3.x(x3, obj));
    }
}
