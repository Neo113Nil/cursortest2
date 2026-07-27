package sg.bigo.ads.z;

import android.graphics.Point;
import java.util.Iterator;
import sg.bigo.ads.C.l;
import sg.bigo.ads.C.t;
import sg.bigo.ads.e.h;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.n1.o;
import sg.bigo.ads.x1.q;
import sg.bigo.ads.z1.n;

/* renamed from: sg.bigo.ads.z.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5523a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f13421a;

    public RunnableC5523a(g gVar) {
        this.f13421a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar;
        h hVar = this.f13421a.d;
        l D = hVar != null ? ((C5185l1) hVar).D() : null;
        if ((D instanceof t) && (oVar = ((t) D).k0) != null) {
            Iterator it = oVar.f13215a.j.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (nVar != null) {
                    nVar.d = true;
                }
            }
        }
        if (D != null) {
            Iterator it2 = D.m.b.iterator();
            while (it2.hasNext()) {
                q qVar = (q) it2.next();
                if (qVar != null && qVar.b()) {
                    qVar.k = true;
                }
            }
            D.a(new Point(0, 0), 37, 15, new sg.bigo.ads.P.f());
        }
    }
}
