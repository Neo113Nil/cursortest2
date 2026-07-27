package sg.bigo.ads.h;

/* loaded from: classes3.dex */
public final class Y1 implements InterfaceC5219x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5149b2 f12866a;

    public Y1(C5149b2 c5149b2) {
        this.f12866a = c5149b2;
    }

    @Override // sg.bigo.ads.h.InterfaceC5219x
    public final void a() {
        Y0 y0 = this.f12866a.J;
        if (y0 != null) {
            y0.I.a(null);
        }
        C5149b2 c5149b2 = this.f12866a;
        if (!c5149b2.K0() || c5149b2.c0 || c5149b2.w) {
            return;
        }
        c5149b2.w = true;
        ((C5185l1) c5149b2.e).D().a((sg.bigo.ads.U.j) null, 8, 22);
    }
}
