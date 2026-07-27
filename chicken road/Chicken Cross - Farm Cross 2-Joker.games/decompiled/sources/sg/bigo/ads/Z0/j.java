package sg.bigo.ads.Z0;

import android.util.Pair;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.X0.o;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12661a;

    public j(k kVar) {
        this.f12661a = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k kVar = this.f12661a;
        o oVar = kVar.i;
        if (oVar == null || kVar.e) {
            return;
        }
        kVar.f12662a = true;
        oVar.c = true;
        if (oVar.f == 0) {
            oVar.f = oVar.e;
        }
        if (A.c(kVar.c)) {
            k kVar2 = this.f12661a;
            sg.bigo.ads.P.c[] cVarArr = kVar2.c;
            int i = kVar2.i.f;
            if (!A.c(cVarArr)) {
                for (sg.bigo.ads.P.c cVar : cVarArr) {
                    if (cVar != null) {
                        ((sg.bigo.ads.U0.b) cVar).b0 = i;
                    }
                }
            }
            k kVar3 = this.f12661a;
            int i2 = kVar3.f12662a ? 2 : kVar3.b ? 4 : 1;
            o oVar2 = kVar3.i;
            m.a(kVar3.c, i2, oVar2 == null ? 1 : oVar2.f, true);
        }
        k kVar4 = this.f12661a;
        kVar4.m.a(kVar4, 1011, 10206, "Ad request is timeout due to bad network.", new Pair((sg.bigo.ads.N.d) kVar4.i.f12610a, null));
    }
}
