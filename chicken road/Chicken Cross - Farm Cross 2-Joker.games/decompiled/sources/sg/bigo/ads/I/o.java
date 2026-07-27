package sg.bigo.ads.I;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12330a;

    public o(p pVar) {
        this.f12330a = pVar;
    }

    @Override // sg.bigo.ads.I.k
    public final void a() {
        p pVar = this.f12330a;
        n nVar = pVar.v;
        if (nVar != null) {
            nVar.e();
        }
        AdCountDownButton adCountDownButton = pVar.g;
        if (adCountDownButton != null) {
            adCountDownButton.b();
        }
    }

    @Override // sg.bigo.ads.I.k
    public final void b() {
        this.f12330a.getClass();
        this.f12330a.C();
    }

    @Override // sg.bigo.ads.I.k
    public final void c() {
    }

    @Override // sg.bigo.ads.I.k
    public final void d() {
        p pVar = this.f12330a;
        n nVar = pVar.v;
        if (nVar != null) {
            nVar.d();
        }
        AdCountDownButton adCountDownButton = pVar.g;
        if (adCountDownButton != null) {
            adCountDownButton.a();
        }
    }
}
