package sg.bigo.ads.Z0;

import sg.bigo.ads.K0.A;
import sg.bigo.ads.api.Ad;

/* loaded from: classes3.dex */
public abstract class m {
    public static sg.bigo.ads.P.c[] a(Ad ad) {
        if (ad instanceof sg.bigo.ads.Q.e) {
            return ((sg.bigo.ads.Q.e) ad).m();
        }
        if (ad instanceof sg.bigo.ads.e.h) {
            return new sg.bigo.ads.P.c[]{((sg.bigo.ads.e.h) ad).e()};
        }
        return null;
    }

    public static void a(sg.bigo.ads.P.c[] cVarArr, int i, int i2, boolean z) {
        if (A.c(cVarArr)) {
            return;
        }
        for (sg.bigo.ads.P.c cVar : cVarArr) {
            if (cVar != null) {
                sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
                if (!bVar.e0 || z) {
                    bVar.e0 = true;
                    bVar.f0 = i;
                    bVar.g0 = i2;
                }
            }
        }
    }
}
