package sg.bigo.ads.X0;

import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sg.bigo.ads.N.d f12608a;
    public final /* synthetic */ o b;
    public final /* synthetic */ r c;

    public m(r rVar, sg.bigo.ads.N.d dVar, o oVar) {
        this.c = rVar;
        this.f12608a = dVar;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg.bigo.ads.N.d dVar = this.f12608a;
        dVar.getClass();
        if (dVar instanceof IconAdsRequest) {
            sg.bigo.ads.N.c cVar = ((sg.bigo.ads.N.d) this.b.f12610a).h;
            if (cVar.j == 0) {
                cVar.i = 0;
                cVar.j = System.currentTimeMillis();
            }
            r.a(this.c, this.b);
            return;
        }
        q qVar = this.c.p;
        if (qVar.f12612a == 1 || qVar.f12612a == 2) {
            if (qVar.f12612a == 1) {
                AbstractC5446j.a(qVar);
            }
            qVar.f12612a = 3;
        }
        this.c.f.a(new l(this), 1);
    }
}
