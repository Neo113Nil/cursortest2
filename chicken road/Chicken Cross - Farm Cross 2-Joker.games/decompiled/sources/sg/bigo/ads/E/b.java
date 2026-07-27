package sg.bigo.ads.E;

import sg.bigo.ads.C.l;
import sg.bigo.ads.C.t;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public final class b implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12262a;

    public b(d dVar) {
        this.f12262a = dVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        NativeAd nativeAd = (NativeAd) ad;
        this.f12262a.p0.addAndGet(1);
        if (nativeAd instanceof l) {
            this.f12262a.a(false, (l) nativeAd);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
        NativeAd nativeAd = (NativeAd) bVar;
        if (nativeAd instanceof t) {
            t tVar = (t) nativeAd;
            if (((k) ((InterfaceC5087a) tVar.k.f12482a)).V0 == null && !z) {
                this.f12262a.p0.addAndGet(1);
                this.f12262a.a(false, (l) tVar);
            } else {
                this.f12262a.a(true, (l) tVar);
            }
        }
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        NativeAd nativeAd = (NativeAd) ad;
        if (nativeAd instanceof l) {
            this.f12262a.a(true, (l) nativeAd);
        }
    }
}
