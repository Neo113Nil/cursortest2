package v;

import w.C1669b;

/* renamed from: v.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1662m extends C1659j {

    /* renamed from: w0, reason: collision with root package name */
    public int f17065w0 = 0;

    /* renamed from: x0, reason: collision with root package name */
    public int f17066x0 = 0;

    /* renamed from: y0, reason: collision with root package name */
    public int f17067y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public int f17068z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public int f17058A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public int f17059B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f17060C0 = false;

    /* renamed from: D0, reason: collision with root package name */
    public int f17061D0 = 0;

    /* renamed from: E0, reason: collision with root package name */
    public int f17062E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    public final C1669b f17063F0 = new C1669b();

    /* renamed from: G0, reason: collision with root package name */
    public B.d f17064G0 = null;

    @Override // v.C1659j
    public final void U() {
        for (int i7 = 0; i7 < this.f17056v0; i7++) {
            C1654e c1654e = this.f17055u0[i7];
            if (c1654e != null) {
                c1654e.f16923G = true;
            }
        }
    }

    public abstract void V(int i7, int i8, int i9, int i10);

    public final void W(C1654e c1654e, EnumC1653d enumC1653d, int i7, EnumC1653d enumC1653d2, int i8) {
        B.d dVar;
        C1654e c1654e2;
        while (true) {
            dVar = this.f17064G0;
            if (dVar != null || (c1654e2 = this.f16938V) == null) {
                break;
            } else {
                this.f17064G0 = ((C1655f) c1654e2).f17007y0;
            }
        }
        C1669b c1669b = this.f17063F0;
        c1669b.f17214a = enumC1653d;
        c1669b.f17215b = enumC1653d2;
        c1669b.f17216c = i7;
        c1669b.f17217d = i8;
        dVar.b(c1654e, c1669b);
        c1654e.P(c1669b.f17218e);
        c1654e.M(c1669b.f17219f);
        c1654e.f16921E = c1669b.f17221h;
        c1654e.J(c1669b.f17220g);
    }
}
