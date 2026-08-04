package L5;

import W5.AbstractC0486a1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p155w1.C1050x1;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class P extends T2.b implements S2.a, p167y2.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4428a;

    public P(Q q7) {
        this.f4428a = new WeakReference(q7);
    }

    @Override // p167y2.e
    public final void onAdFailedToLoad(p167y2.n nVar) {
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            q7.getClass();
            q7.f4429b.T(q7.f4481a, new C0328g(nVar));
        }
    }

    @Override // p167y2.e
    public final void onAdLoaded(Object obj) {
        T2.a aVar = (T2.a) obj;
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            q7.f4434g = aVar;
            C1050x1 c1050x1 = q7.f4429b;
            aVar.setOnPaidEventListener(new P2(16, c1050x1, q7, false));
            c1050x1.U(q7.f4481a, aVar.getResponseInfo());
        }
    }

    @Override // S2.a
    public final void onAdMetadataChanged() {
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            C1050x1 c1050x1 = q7.f4429b;
            c1050x1.getClass();
            HashMap map = new HashMap();
            AbstractC0486a1.m(q7.f4481a, map, "adId", "eventName", "onAdMetadataChanged");
            c1050x1.Q(map);
        }
    }

    @Override // p167y2.s
    public final void onUserEarnedReward(S2.b bVar) {
        WeakReference weakReference = this.f4428a;
        if (weakReference.get() != null) {
            Q q7 = (Q) weakReference.get();
            q7.getClass();
            q7.f4429b.W(q7.f4481a, new N(bVar.getType(), Integer.valueOf(bVar.getAmount())));
        }
    }
}
