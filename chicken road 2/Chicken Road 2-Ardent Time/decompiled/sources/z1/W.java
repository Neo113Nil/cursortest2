package z1;

/* loaded from: classes.dex */
public final class W extends z1.U {

    /* renamed from: e, reason: collision with root package name */
    public final z1.Z f8543e;

    /* renamed from: f, reason: collision with root package name */
    public final z1.X f8544f;

    /* renamed from: g, reason: collision with root package name */
    public final z1.C1057j f8545g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f8546h;

    public W(z1.Z z2, z1.X x2, z1.C1057j c1057j, java.lang.Object obj) {
        this.f8543e = z2;
        this.f8544f = x2;
        this.f8545g = c1057j;
        this.f8546h = obj;
    }

    @Override // s1.l
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        k((java.lang.Throwable) obj);
        return h1.C0177i.f3302a;
    }

    @Override // z1.U
    public final void k(java.lang.Throwable th) {
        z1.C1057j c1057j = this.f8545g;
        z1.Z z2 = this.f8543e;
        z2.getClass();
        z1.C1057j L2 = z1.Z.L(c1057j);
        z1.X x2 = this.f8544f;
        java.lang.Object obj = this.f8546h;
        if (L2 != null) {
            while (z1.AbstractC1068v.e(L2.f8572e, false, new z1.W(z2, x2, L2, obj), 1) == z1.b0.f8559a) {
                L2 = z1.Z.L(L2);
                if (L2 == null) {
                }
            }
            return;
        }
        z2.p(z2.y(x2, obj));
    }
}
