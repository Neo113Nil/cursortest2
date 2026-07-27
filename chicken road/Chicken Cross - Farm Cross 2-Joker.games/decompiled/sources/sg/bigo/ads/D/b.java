package sg.bigo.ads.D;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class b implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.c f12247a;
    public final /* synthetic */ g b;

    public b(g gVar, sg.bigo.ads.Q.c cVar) {
        this.b = gVar;
        this.f12247a = cVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        this.f12247a.a((NativeAd) ad, i, i2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final /* bridge */ /* synthetic */ void a(sg.bigo.ads.Q.b bVar, boolean z) {
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        NativeAd nativeAd = (NativeAd) ad;
        this.f12247a.a(nativeAd);
        if (nativeAd instanceof a) {
            g gVar = this.b;
            gVar.w0 = true;
            if (!gVar.y0 || gVar.x0 || gVar.u) {
                return;
            }
            AbstractC5446j.b(new c(gVar));
            return;
        }
        if (nativeAd instanceof g) {
            g gVar2 = this.b;
            gVar2.x0 = true;
            if (!gVar2.y0 || gVar2.u) {
                return;
            }
            AbstractC5446j.b(new d(gVar2));
        }
    }
}
