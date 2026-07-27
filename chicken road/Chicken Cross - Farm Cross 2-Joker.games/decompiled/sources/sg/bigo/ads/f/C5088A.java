package sg.bigo.ads.f;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.InnerBannerAd;
import sg.bigo.ads.q0.AbstractC5446j;

/* renamed from: sg.bigo.ads.f.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5088A implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.Q.c f12753a;
    public final /* synthetic */ C5095H b;

    public C5088A(C5095H c5095h, sg.bigo.ads.Z0.g gVar) {
        this.b = c5095h;
        this.f12753a = gVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad, int i, int i2, String str) {
        InnerBannerAd innerBannerAd = (InnerBannerAd) ad;
        if (innerBannerAd == null || !innerBannerAd.isInnerBannerAdFromAutoRefresh()) {
            this.f12753a.a(this.b, i, i2, str);
        } else {
            this.b.a(i, i2, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final void a(sg.bigo.ads.Q.b bVar, boolean z) {
        this.f12753a.a(this.b, z);
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        InnerBannerAd innerBannerAd = (InnerBannerAd) ad;
        InnerBannerAd innerBannerAd2 = this.b.Q;
        if (innerBannerAd2 != null && innerBannerAd2 != innerBannerAd) {
            AbstractC5446j.b(new RunnableC5089B(innerBannerAd2));
        }
        this.b.Q = innerBannerAd;
        if (innerBannerAd.isInnerBannerAdFromAutoRefresh()) {
            C5095H c5095h = this.b;
            if (c5095h.Q != null) {
                c5095h.s();
                c5095h.r();
                c5095h.k = c5095h.S;
                c5095h.Q.setAdInteractionListener(c5095h.W);
                AbstractC5446j.b(new RunnableC5090C(c5095h));
            }
            C5095H c5095h2 = this.b;
            sg.bigo.ads.Z0.l lVar = c5095h2.U;
            if (lVar != null) {
                lVar.a((Ad) c5095h2, true);
                return;
            }
            return;
        }
        this.f12753a.a(this.b);
    }
}
