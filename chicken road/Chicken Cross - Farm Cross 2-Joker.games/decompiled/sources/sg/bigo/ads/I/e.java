package sg.bigo.ads.I;

import sg.bigo.ads.K0.E;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f12324a;

    public e(f fVar) {
        this.f12324a = fVar;
    }

    @Override // sg.bigo.ads.I.k
    public final void a() {
    }

    @Override // sg.bigo.ads.I.k
    public final void b() {
        f fVar = this.f12324a;
        fVar.q = true;
        fVar.C();
    }

    @Override // sg.bigo.ads.I.k
    public final void c() {
        E e = this.f12324a.m;
        if (e != null && e.b()) {
            this.f12324a.m.e();
        }
        AdCountDownButton adCountDownButton = this.f12324a.g;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.b();
    }

    @Override // sg.bigo.ads.I.k
    public final void d() {
        E e = this.f12324a.m;
        if (e != null) {
            e.d();
        }
        AdCountDownButton adCountDownButton = this.f12324a.g;
        if (adCountDownButton != null) {
            adCountDownButton.a();
        }
    }
}
