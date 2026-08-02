package L5;

import java.lang.ref.WeakReference;
import w1.C1759x1;
import w1.P2;

/* renamed from: L5.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0337p extends z2.d implements z2.e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4493a;

    public C0337p(C0338q c0338q) {
        this.f4493a = new WeakReference(c0338q);
    }

    @Override // y2.e
    public final void onAdFailedToLoad(y2.n nVar) {
        WeakReference weakReference = this.f4493a;
        if (weakReference.get() != null) {
            C0338q c0338q = (C0338q) weakReference.get();
            c0338q.getClass();
            c0338q.f4494b.T(c0338q.f4481a, new C0328g(nVar));
        }
    }

    @Override // y2.e
    public final void onAdLoaded(Object obj) {
        z2.c cVar = (z2.c) obj;
        WeakReference weakReference = this.f4493a;
        if (weakReference.get() != null) {
            C0338q c0338q = (C0338q) weakReference.get();
            c0338q.f4495c = cVar;
            cVar.setAppEventListener(new C0337p(c0338q));
            C1759x1 c1759x1 = c0338q.f4494b;
            cVar.setOnPaidEventListener(new P2(16, c1759x1, c0338q, false));
            c1759x1.U(c0338q.f4481a, cVar.getResponseInfo());
        }
    }

    @Override // z2.e
    public final void onAppEvent(String str, String str2) {
        WeakReference weakReference = this.f4493a;
        if (weakReference.get() != null) {
            C0338q c0338q = (C0338q) weakReference.get();
            c0338q.f4494b.V(c0338q.f4481a, str, str2);
        }
    }
}
