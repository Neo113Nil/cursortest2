package L5;

import java.lang.ref.WeakReference;
import p155w1.C1050x1;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class F extends K2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4398a;

    public F(G g3) {
        this.f4398a = new WeakReference(g3);
    }

    @Override // p167y2.e
    public final void onAdFailedToLoad(p167y2.n nVar) {
        WeakReference weakReference = this.f4398a;
        if (weakReference.get() != null) {
            G g3 = (G) weakReference.get();
            g3.getClass();
            g3.f4399b.T(g3.f4481a, new C0328g(nVar));
        }
    }

    @Override // p167y2.e
    public final void onAdLoaded(Object obj) {
        K2.a aVar = (K2.a) obj;
        WeakReference weakReference = this.f4398a;
        if (weakReference.get() != null) {
            G g3 = (G) weakReference.get();
            g3.f4400c = aVar;
            C1050x1 c1050x1 = g3.f4399b;
            aVar.setOnPaidEventListener(new P2(16, c1050x1, g3, false));
            c1050x1.U(g3.f4481a, aVar.getResponseInfo());
        }
    }
}
