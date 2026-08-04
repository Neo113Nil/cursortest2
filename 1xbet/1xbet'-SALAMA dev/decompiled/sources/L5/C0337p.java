package L5;

import java.lang.ref.WeakReference;
import p155w1.C1050x1;
import p155w1.P2;

/* JADX INFO: renamed from: L5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0337p extends p172z2.d implements p172z2.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4493a;

    public C0337p(C0338q c0338q) {
        this.f4493a = new WeakReference(c0338q);
    }

    @Override // p167y2.e
    public final void onAdFailedToLoad(p167y2.n nVar) {
        WeakReference weakReference = this.f4493a;
        if (weakReference.get() != null) {
            C0338q c0338q = (C0338q) weakReference.get();
            c0338q.getClass();
            c0338q.f4494b.T(c0338q.f4481a, new C0328g(nVar));
        }
    }

    @Override // p167y2.e
    public final void onAdLoaded(Object obj) {
        p172z2.c cVar = (p172z2.c) obj;
        WeakReference weakReference = this.f4493a;
        if (weakReference.get() != null) {
            C0338q c0338q = (C0338q) weakReference.get();
            c0338q.f4495c = cVar;
            cVar.setAppEventListener(new C0337p(c0338q));
            C1050x1 c1050x1 = c0338q.f4494b;
            cVar.setOnPaidEventListener(new P2(16, c1050x1, c0338q, false));
            c1050x1.U(c0338q.f4481a, cVar.getResponseInfo());
        }
    }

    @Override // p172z2.e
    public final void onAppEvent(String str, String str2) {
        WeakReference weakReference = this.f4493a;
        if (weakReference.get() != null) {
            C0338q c0338q = (C0338q) weakReference.get();
            c0338q.f4494b.V(c0338q.f4481a, str, str2);
        }
    }
}
