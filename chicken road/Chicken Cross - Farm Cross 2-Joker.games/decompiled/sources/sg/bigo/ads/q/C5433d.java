package sg.bigo.ads.q;

import android.content.Context;
import android.webkit.URLUtil;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.IconAds;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.g.C5122e;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* renamed from: sg.bigo.ads.q.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5433d implements AdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f13240a;

    public C5433d(o oVar) {
        this.f13240a = oVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad) {
        int i;
        boolean z;
        IconAds iconAds = (IconAds) ad;
        o oVar = this.f13240a;
        if (oVar.a() || iconAds == null) {
            return;
        }
        oVar.e = iconAds;
        iconAds.setAdInteractionListener((sg.bigo.ads.N.e) oVar.w);
        o.b(oVar.k, oVar.i);
        o.b(oVar.j, oVar.h);
        if (iconAds instanceof C5122e) {
            for (sg.bigo.ads.D.h hVar : ((C5122e) iconAds).l) {
                sg.bigo.ads.P.c cVar = (InterfaceC5087a) hVar.k.f12482a;
                if (cVar != null) {
                    sg.bigo.ads.U0.h hVar2 = ((sg.bigo.ads.U0.k) cVar).y0;
                    String str = hVar2 != null ? hVar2.c : null;
                    if (URLUtil.isNetworkUrl(str)) {
                        if (sg.bigo.ads.O.g.f12472a.B.a(9) && URLUtil.isHttpUrl(str)) {
                            sg.bigo.ads.s1.b.a(3000, 10220, "Invalid http url: " + str, cVar);
                        } else {
                            Context context = hVar.k.e;
                            sg.bigo.ads.R0.j jVar = AbstractRunnableC5522h.e;
                            if (jVar != null) {
                                z = jVar.a(18);
                                i = 40;
                            } else {
                                i = 5;
                                z = false;
                            }
                            sg.bigo.ads.s0.u.f13300a.a(context, AbstractRunnableC5522h.a("IconCreativeNet", i, z), str, ((sg.bigo.ads.U0.b) cVar).T, hVar);
                        }
                    }
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        adError.getCode();
        adError.getMessage();
    }
}
