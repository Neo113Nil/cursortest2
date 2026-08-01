package sg.bigo.ads.K;

import android.app.Activity;
import sg.bigo.ads.C.l;
import sg.bigo.ads.E.e;
import sg.bigo.ads.E.f;
import sg.bigo.ads.I.x;
import sg.bigo.ads.h.AbstractC5163f0;
import sg.bigo.ads.x.k;

/* loaded from: classes3.dex */
public final class c extends k {
    public boolean k0;

    public c(Activity activity) {
        super(activity);
        this.k0 = false;
    }

    @Override // sg.bigo.ads.x.k
    public final void J0() {
        if (this.k0) {
            return;
        }
        AbstractC5163f0 abstractC5163f0 = this.e;
        if (abstractC5163f0 instanceof x) {
            this.k0 = true;
            ((x) abstractC5163f0).G();
        }
    }

    @Override // sg.bigo.ads.x.k
    public final void a(l lVar) {
        if (lVar instanceof e) {
            ((e) lVar).m0 = true;
            a aVar = new a(this.f12687a, I0(), this.k0);
            this.b0.k0 = lVar;
            aVar.l = lVar;
            aVar.v();
            return;
        }
        if (lVar instanceof f) {
            ((f) lVar).w0 = true;
            b bVar = new b(this.f12687a, I0(), this.k0);
            this.b0.k0 = lVar;
            bVar.l = lVar;
            bVar.v();
        }
    }
}
