package L5;

import W5.AbstractC0486a1;
import java.util.HashMap;
import p155w1.C1050x1;

/* JADX INFO: renamed from: L5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0332k extends p167y2.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1050x1 f4483b;

    public AbstractC0332k(int i7, C1050x1 c1050x1) {
        this.f4482a = i7;
        this.f4483b = c1050x1;
    }

    @Override // p167y2.d
    public final void onAdClicked() {
        C1050x1 c1050x1 = this.f4483b;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4482a, map, "adId", "eventName", "onAdClicked");
        c1050x1.Q(map);
    }

    @Override // p167y2.d
    public final void onAdClosed() {
        C1050x1 c1050x1 = this.f4483b;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4482a, map, "adId", "eventName", "onAdClosed");
        c1050x1.Q(map);
    }

    @Override // p167y2.d
    public final void onAdFailedToLoad(p167y2.n nVar) {
        this.f4483b.T(this.f4482a, new C0328g(nVar));
    }

    @Override // p167y2.d
    public final void onAdImpression() {
        C1050x1 c1050x1 = this.f4483b;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4482a, map, "adId", "eventName", "onAdImpression");
        c1050x1.Q(map);
    }

    @Override // p167y2.d
    public final void onAdOpened() {
        C1050x1 c1050x1 = this.f4483b;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4482a, map, "adId", "eventName", "onAdOpened");
        c1050x1.Q(map);
    }
}
