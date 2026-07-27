package sg.bigo.ads.X0;

import java.util.HashMap;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class l implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f12607a;

    public l(m mVar) {
        this.f12607a = mVar;
    }

    @Override // sg.bigo.ads.X0.x
    public final void a(int i, int i2, String str) {
        sg.bigo.ads.N.c cVar = ((sg.bigo.ads.N.d) this.f12607a.b.f12610a).h;
        if (cVar.j == 0) {
            cVar.i = i;
            cVar.j = System.currentTimeMillis();
        }
        m mVar = this.f12607a;
        r rVar = mVar.c;
        if (rVar.b.i != 0) {
            r.a(rVar, mVar.b);
            return;
        }
        o oVar = mVar.b;
        rVar.getClass();
        AbstractC5446j.a(2, null, new RunnableC5006a(oVar, 1008, i2, str), 0L);
    }

    @Override // sg.bigo.ads.X0.x
    public final void a(int i) {
        r.a(this.f12607a.c, 1, (HashMap) null);
        sg.bigo.ads.N.c cVar = ((sg.bigo.ads.N.d) this.f12607a.b.f12610a).h;
        if (cVar.j == 0) {
            cVar.i = i;
            cVar.j = System.currentTimeMillis();
        }
        m mVar = this.f12607a;
        r.a(mVar.c, mVar.b);
    }
}
