package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class S0 implements sg.bigo.ads.d1.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.C.l f12852a;
    public final /* synthetic */ T0 b;

    public S0(T0 t0, sg.bigo.ads.C.l lVar) {
        this.b = t0;
        this.f12852a = lVar;
    }

    @Override // sg.bigo.ads.d1.u
    public final void a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b.p.s = true;
        this.f12852a.a(i, i2, i3, i4, i5, i6);
    }

    @Override // sg.bigo.ads.d1.u
    public final void a(sg.bigo.ads.U.j jVar) {
        this.b.p.s = true;
        this.f12852a.a(jVar, 1, 5);
    }
}
