package sg.bigo.ads.M;

/* renamed from: sg.bigo.ads.M.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4994k implements sg.bigo.ads.N.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5002t f12448a;

    public C4994k(C5002t c5002t) {
        this.f12448a = c5002t;
    }

    @Override // sg.bigo.ads.N.h
    public final void a(boolean z) {
        sg.bigo.ads.K0.E e = this.f12448a.f;
        if (e != null) {
            e.a();
            this.f12448a.f = null;
        }
        sg.bigo.ads.K0.E e2 = this.f12448a.f12454a;
        if (e2 != null) {
            e2.a();
            this.f12448a.f12454a = null;
        }
        this.f12448a.j.G();
        sg.bigo.ads.K0.E e3 = this.f12448a.g;
        if (e3 != null) {
            e3.a();
            this.f12448a.g = null;
        }
    }
}
