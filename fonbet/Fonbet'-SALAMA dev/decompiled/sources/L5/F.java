package L5;

import java.lang.ref.WeakReference;
import w1.C1759x1;
import w1.P2;

/* loaded from: classes2.dex */
public final class F extends K2.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4398a;

    public F(G g3) {
        this.f4398a = new WeakReference(g3);
    }

    @Override // y2.e
    public final void onAdFailedToLoad(y2.n nVar) {
        WeakReference weakReference = this.f4398a;
        if (weakReference.get() != null) {
            G g3 = (G) weakReference.get();
            g3.getClass();
            g3.f4399b.T(g3.f4481a, new C0328g(nVar));
        }
    }

    @Override // y2.e
    public final void onAdLoaded(Object obj) {
        K2.a aVar = (K2.a) obj;
        WeakReference weakReference = this.f4398a;
        if (weakReference.get() != null) {
            G g3 = (G) weakReference.get();
            g3.f4400c = aVar;
            C1759x1 c1759x1 = g3.f4399b;
            aVar.setOnPaidEventListener(new P2(16, c1759x1, g3, false));
            c1759x1.U(g3.f4481a, aVar.getResponseInfo());
        }
    }
}
