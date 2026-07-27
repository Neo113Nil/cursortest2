package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class D2 implements sg.bigo.ads.f.z {

    /* renamed from: a, reason: collision with root package name */
    public final int f12813a;
    public final int b;
    public final /* synthetic */ H2 c;

    public D2(H2 h2, int i, int i2) {
        this.c = h2;
        this.f12813a = i;
        this.b = i2;
    }

    @Override // sg.bigo.ads.f.z
    public final void a(sg.bigo.ads.U.j jVar, sg.bigo.ads.P.f fVar) {
        ((C5185l1) this.c.e).D().a(jVar, this.f12813a, this.b, fVar);
    }

    @Override // sg.bigo.ads.f.z
    public final void b() {
    }

    @Override // sg.bigo.ads.f.z
    public final void c() {
    }

    @Override // sg.bigo.ads.f.z
    public final void a() {
        if (this.c.d0() == 5 || this.c.d0() == 1 || this.c.d0() == 7 || this.c.d0() == 8) {
            this.c.e(true);
        }
    }
}
