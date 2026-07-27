package sg.bigo.ads.f;

import sg.bigo.ads.api.InnerBannerAd;

/* renamed from: sg.bigo.ads.f.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5112q {
    public static InnerBannerAd a(sg.bigo.ads.P.j jVar) {
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) jVar.f12482a;
        if (bVar.k == 3) {
            return new v(jVar);
        }
        if (bVar.k == 2 || bVar.k == 1) {
            return new sg.bigo.ads.F.r(jVar);
        }
        return null;
    }
}
