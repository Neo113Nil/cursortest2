package sg.bigo.ads.X0;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.e.AbstractC5079c;
import sg.bigo.ads.e.C5080d;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f12609a;
    public final /* synthetic */ r b;

    public n(r rVar, o oVar) {
        this.b = rVar;
        this.f12609a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        sg.bigo.ads.T0.p pVar;
        String str;
        Ad ad;
        sg.bigo.ads.P0.c cVar;
        boolean z;
        sg.bigo.ads.N.d dVar = (sg.bigo.ads.N.d) this.f12609a.f12610a;
        sg.bigo.ads.T0.n nVar = this.b.c;
        nVar.getClass();
        sg.bigo.ads.T0.p c = dVar.c();
        if (c == null) {
            String d = dVar.d();
            HashMap hashMap = nVar.e;
            if (hashMap == null || d == null) {
                pVar = null;
                if ((pVar == null && pVar.v == 3) || (dVar instanceof IconAdsRequest)) {
                    this.b.h.addFirst(this.f12609a);
                } else {
                    if (pVar != null) {
                        C5080d c5080d = AbstractC5079c.f12743a;
                        c5080d.getClass();
                        String str2 = pVar.l;
                        if (TextUtils.isEmpty(str2)) {
                            str = null;
                        } else {
                            str = str2 + "_" + pVar.v + "_" + pVar.b;
                        }
                        if (!TextUtils.isEmpty(str)) {
                            C5080d.a(str, c5080d.f12744a);
                            List list = (List) c5080d.f12744a.get(str);
                            if (list != null && !list.isEmpty()) {
                                int i = 0;
                                Ad ad2 = null;
                                while (i < list.size()) {
                                    try {
                                        Ad ad3 = (Ad) list.get(i);
                                        i++;
                                        ad2 = ad3;
                                    } catch (Exception e) {
                                        AbstractC5496a.a("AdCacheManager", "AdCacheManager:getAd end error= " + e.getMessage());
                                    }
                                }
                                if (ad2 != null) {
                                    list.remove(ad2);
                                }
                                list.size();
                                if (ad2 != null) {
                                    ad2.toString();
                                }
                                ad = ad2;
                                if (ad != null) {
                                    sg.bigo.ads.P0.c cVar2 = this.f12609a.b;
                                    if ((cVar2 instanceof sg.bigo.ads.P0.a) && ((z = (cVar = ((sg.bigo.ads.P0.a) cVar2).f12497a) instanceof sg.bigo.ads.Z0.k)) && z) {
                                        sg.bigo.ads.Z0.b bVar = (sg.bigo.ads.Z0.b) ((sg.bigo.ads.Z0.k) cVar);
                                        sg.bigo.ads.Z0.l lVar = bVar.o;
                                        String str3 = bVar.n;
                                        lVar.getClass();
                                        AbstractC5446j.a(3, null, new sg.bigo.ads.Z0.f(lVar, bVar, pVar, ad, str3), 0L);
                                    }
                                }
                            }
                        }
                        ad = null;
                        if (ad != null) {
                        }
                    }
                    this.b.h.offer(this.f12609a);
                }
                this.b.c();
            }
            c = (sg.bigo.ads.T0.p) hashMap.get(d);
        }
        pVar = c;
        if (pVar == null) {
        }
        if (pVar != null) {
        }
        this.b.h.offer(this.f12609a);
        this.b.c();
    }
}
