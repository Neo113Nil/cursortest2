package sg.bigo.ads.Z0;

import android.text.TextUtils;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.X0.o;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.e.AbstractC5079c;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12657a;
    public final /* synthetic */ p b;
    public final /* synthetic */ Ad c;
    public final /* synthetic */ String d;
    public final /* synthetic */ l e;

    public f(l lVar, k kVar, p pVar, Ad ad, String str) {
        this.e = lVar;
        this.f12657a = kVar;
        this.b = pVar;
        this.c = ad;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12657a.f12662a) {
            AbstractC5079c.f12743a.a(this.b, this.c);
            o oVar = this.f12657a.i;
            if (oVar != null) {
                String str = ((sg.bigo.ads.N.d) oVar.f12610a).h.b;
            }
            String.valueOf(this.c);
            return;
        }
        if (!TextUtils.isEmpty(this.d)) {
            l.c.remove(this.d);
        }
        o oVar2 = this.f12657a.i;
        String str2 = oVar2 == null ? "0" : ((sg.bigo.ads.N.d) oVar2.f12610a).h.b;
        sg.bigo.ads.P.c[] a2 = m.a(this.c);
        if (!A.c(a2)) {
            for (sg.bigo.ads.P.c cVar : a2) {
                ((sg.bigo.ads.U0.b) cVar).Z = str2;
            }
        }
        k kVar = this.f12657a;
        o oVar3 = kVar.i;
        if (oVar3 != null) {
            oVar3.d = true;
            if (oVar3.f == 0) {
                oVar3.f = oVar3.e;
            }
        }
        kVar.e = true;
        l lVar = this.e;
        String str3 = this.d;
        lVar.getClass();
        l.a(str3, kVar);
        this.f12657a.a();
        this.f12657a.b = true;
        sg.bigo.ads.P.c[] a3 = m.a(this.c);
        k kVar2 = this.f12657a;
        kVar2.d = a3;
        o oVar4 = kVar2.i;
        m.a(a3, 4, oVar4 == null ? 1 : oVar4.f, true);
        l lVar2 = this.e;
        String str4 = this.d;
        k kVar3 = this.f12657a;
        Ad ad = this.c;
        lVar2.getClass();
        l.a(str4, kVar3, a3, 1, 0, 0, null, true, ad);
        AbstractC5446j.b(new e(this));
    }
}
