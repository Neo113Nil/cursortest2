package sg.bigo.ads.L;

import com.ironsource.mediationsdk.logger.IronSourceError;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class y implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.c f12402a;
    public final /* synthetic */ N b;

    public y(N n, sg.bigo.ads.Z0.g gVar) {
        this.b = n;
        this.f12402a = gVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        N n = this.b;
        if (n.n || n.p) {
            return;
        }
        if (i == 1006) {
            sg.bigo.ads.P.j jVar = n.Z;
            sg.bigo.ads.U0.a.a(jVar == null ? "" : jVar.b.l);
        }
        this.f12402a.a(this.b, i, i2, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
        NativeAd nativeAd = (NativeAd) bVar;
        N n = this.b;
        if (n.n || n.p || !(nativeAd instanceof sg.bigo.ads.C.t)) {
            return;
        }
        if (((sg.bigo.ads.U0.k) ((InterfaceC5087a) ((sg.bigo.ads.C.t) nativeAd).k.f12482a)).V0 != null || z) {
            this.f12402a.a(n);
        } else {
            this.f12402a.a(n, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 10202, "video download failed and no backup creative resource.");
        }
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        N n = this.b;
        if (n.n || n.p) {
            return;
        }
        this.f12402a.a(n);
        AbstractC5446j.a(2, new x(this));
    }
}
