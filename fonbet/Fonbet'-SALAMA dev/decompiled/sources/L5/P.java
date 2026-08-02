package L5;

import W5.AbstractC0486a1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import w1.C1759x1;
import w1.P2;

/* loaded from: classes2.dex */
public final class P extends T2.b implements S2.a, y2.s {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4428a;

    public P(Q q7) {
        this.f4428a = new WeakReference(q7);
    }

    @Override // y2.e
    public final void onAdFailedToLoad(y2.n nVar) {
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            q7.getClass();
            q7.f4429b.T(q7.f4481a, new C0328g(nVar));
        }
    }

    @Override // y2.e
    public final void onAdLoaded(Object obj) {
        T2.a aVar = (T2.a) obj;
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            q7.f4434g = aVar;
            C1759x1 c1759x1 = q7.f4429b;
            aVar.setOnPaidEventListener(new P2(16, c1759x1, q7, false));
            c1759x1.U(q7.f4481a, aVar.getResponseInfo());
        }
    }

    @Override // S2.a
    public final void onAdMetadataChanged() {
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            C1759x1 c1759x1 = q7.f4429b;
            c1759x1.getClass();
            HashMap hashMap = new HashMap();
            AbstractC0486a1.m(q7.f4481a, hashMap, "adId", "eventName", "onAdMetadataChanged");
            c1759x1.Q(hashMap);
        }
    }

    @Override // y2.s
    public final void onUserEarnedReward(S2.b bVar) {
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            q7.getClass();
            q7.f4429b.W(q7.f4481a, new N(bVar.getType(), Integer.valueOf(bVar.getAmount())));
        }
    }
}
