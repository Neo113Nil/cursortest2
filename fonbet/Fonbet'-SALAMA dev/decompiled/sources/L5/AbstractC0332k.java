package L5;

import W5.AbstractC0486a1;
import java.util.HashMap;
import w1.C1759x1;

/* renamed from: L5.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0332k extends y2.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4482a;

    /* renamed from: b, reason: collision with root package name */
    public final C1759x1 f4483b;

    public AbstractC0332k(int i7, C1759x1 c1759x1) {
        this.f4482a = i7;
        this.f4483b = c1759x1;
    }

    @Override // y2.d
    public final void onAdClicked() {
        C1759x1 c1759x1 = this.f4483b;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4482a, hashMap, "adId", "eventName", "onAdClicked");
        c1759x1.Q(hashMap);
    }

    @Override // y2.d
    public final void onAdClosed() {
        C1759x1 c1759x1 = this.f4483b;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4482a, hashMap, "adId", "eventName", "onAdClosed");
        c1759x1.Q(hashMap);
    }

    @Override // y2.d
    public final void onAdFailedToLoad(y2.n nVar) {
        this.f4483b.T(this.f4482a, new C0328g(nVar));
    }

    @Override // y2.d
    public final void onAdImpression() {
        C1759x1 c1759x1 = this.f4483b;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4482a, hashMap, "adId", "eventName", "onAdImpression");
        c1759x1.Q(hashMap);
    }

    @Override // y2.d
    public final void onAdOpened() {
        C1759x1 c1759x1 = this.f4483b;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4482a, hashMap, "adId", "eventName", "onAdOpened");
        c1759x1.Q(hashMap);
    }
}
