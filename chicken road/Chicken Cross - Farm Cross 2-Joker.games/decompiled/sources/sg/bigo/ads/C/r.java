package sg.bigo.ads.C;

import android.content.Context;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12238a;
    public final /* synthetic */ sg.bigo.ads.Q.c b;
    public final /* synthetic */ InterfaceC5087a c;
    public final /* synthetic */ sg.bigo.ads.P.c d;
    public final /* synthetic */ t e;

    public r(t tVar, int i, sg.bigo.ads.Q.c cVar, sg.bigo.ads.U0.k kVar, sg.bigo.ads.P.c cVar2) {
        this.e = tVar;
        this.f12238a = i;
        this.b = cVar;
        this.c = kVar;
        this.d = cVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12238a;
        if (i != 0) {
            t tVar = this.e;
            sg.bigo.ads.F.r rVar = tVar.X;
            if (rVar != null) {
                rVar.h = true;
            }
            this.b.a(tVar, 1006, i, "Invalid media video.");
            return;
        }
        this.e.B();
        t tVar2 = this.e;
        sg.bigo.ads.z1.p pVar = tVar2.l0;
        int i2 = (int) ((pVar != null ? pVar.s : 0L) / 1000);
        sg.bigo.ads.P.j jVar = tVar2.k;
        if (((sg.bigo.ads.U0.b) ((InterfaceC5087a) jVar.f12482a)).l == 4 && i2 < 5) {
            this.b.a(tVar2, 1032, 1402, "Invalid video duration.");
            return;
        }
        q qVar = new q(this);
        sg.bigo.ads.n1.n nVar = sg.bigo.ads.n1.n.n;
        Context context = jVar.e;
        InterfaceC5087a interfaceC5087a = this.c;
        if (nVar.b.get()) {
            if (AbstractC5446j.c == Thread.currentThread()) {
                nVar.a(context, interfaceC5087a, (sg.bigo.ads.n1.m) qVar, true);
            } else {
                AbstractC5446j.a(1, null, new sg.bigo.ads.n1.g(nVar, context, interfaceC5087a, qVar), 0L);
            }
        }
    }
}
