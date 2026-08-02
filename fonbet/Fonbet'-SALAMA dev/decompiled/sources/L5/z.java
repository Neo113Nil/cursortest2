package L5;

import java.lang.ref.WeakReference;
import w1.C1759x1;
import w1.P2;

/* loaded from: classes2.dex */
public final class z extends A2.a {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4517a;

    public z(A a2) {
        this.f4517a = new WeakReference(a2);
    }

    @Override // y2.e
    public final void onAdFailedToLoad(y2.n nVar) {
        WeakReference weakReference = this.f4517a;
        if (weakReference.get() != null) {
            A a2 = (A) weakReference.get();
            a2.getClass();
            a2.f4390b.T(a2.f4481a, new C0328g(nVar));
        }
    }

    @Override // y2.e
    public final void onAdLoaded(Object obj) {
        A2.b bVar = (A2.b) obj;
        WeakReference weakReference = this.f4517a;
        if (weakReference.get() != null) {
            A a2 = (A) weakReference.get();
            a2.f4391c = bVar;
            C1759x1 c1759x1 = a2.f4390b;
            bVar.setOnPaidEventListener(new P2(16, c1759x1, a2, false));
            c1759x1.U(a2.f4481a, bVar.getResponseInfo());
        }
    }
}
