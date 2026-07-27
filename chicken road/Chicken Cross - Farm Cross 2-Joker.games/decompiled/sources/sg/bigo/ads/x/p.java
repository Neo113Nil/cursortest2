package sg.bigo.ads.x;

import android.view.View;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.h.F1;

/* loaded from: classes3.dex */
public final class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f13379a;

    public p(q qVar) {
        this.f13379a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f13379a;
        qVar.q.removeView(qVar.y);
        q qVar2 = this.f13379a;
        qVar2.y = null;
        if (qVar2.s == null || !((sg.bigo.ads.U0.k) ((InterfaceC5087a) qVar2.r.e())).W0 || qVar2.B) {
            return;
        }
        qVar2.B = true;
        F1 f1 = qVar2.s;
        RoundedFrameLayout roundedFrameLayout = qVar2.q;
        f1.a(roundedFrameLayout, roundedFrameLayout, 1, 8, 0, new View[0]);
    }
}
