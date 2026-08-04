package L5;

import W5.AbstractC0486a1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p155w1.C1050x1;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class M extends S2.d implements S2.a, p167y2.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4419a;

    public M(O o7) {
        this.f4419a = new WeakReference(o7);
    }

    @Override // p167y2.e
    public final void onAdFailedToLoad(p167y2.n nVar) {
        WeakReference weakReference = this.f4419a;
        if (weakReference.get() != null) {
            O o7 = (O) weakReference.get();
            o7.getClass();
            o7.f4422b.T(o7.f4481a, new C0328g(nVar));
        }
    }

    @Override // p167y2.e
    public final void onAdLoaded(Object obj) {
        S2.c cVar = (S2.c) obj;
        WeakReference weakReference = this.f4419a;
        if (weakReference.get() != null) {
            O o7 = (O) weakReference.get();
            o7.f4427g = cVar;
            C1050x1 c1050x1 = o7.f4422b;
            cVar.setOnPaidEventListener(new P2(16, c1050x1, o7, false));
            c1050x1.U(o7.f4481a, cVar.getResponseInfo());
        }
    }

    @Override // S2.a
    public final void onAdMetadataChanged() {
        WeakReference weakReference = this.f4419a;
        if (weakReference.get() != null) {
            O o7 = (O) weakReference.get();
            C1050x1 c1050x1 = o7.f4422b;
            c1050x1.getClass();
            HashMap map = new HashMap();
            AbstractC0486a1.m(o7.f4481a, map, "adId", "eventName", "onAdMetadataChanged");
            c1050x1.Q(map);
        }
    }

    @Override // p167y2.s
    public final void onUserEarnedReward(S2.b bVar) {
        WeakReference weakReference = this.f4419a;
        if (weakReference.get() != null) {
            O o7 = (O) weakReference.get();
            o7.getClass();
            o7.f4422b.W(o7.f4481a, new N(bVar.getType(), Integer.valueOf(bVar.getAmount())));
        }
    }
}
