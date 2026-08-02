package L5;

import W5.AbstractC0486a1;
import java.util.HashMap;
import w1.C1759x1;
import y2.C1797a;

/* loaded from: classes2.dex */
public final class D extends y2.m {

    /* renamed from: a, reason: collision with root package name */
    public final C1759x1 f4395a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4396b;

    public D(int i7, C1759x1 c1759x1) {
        this.f4395a = c1759x1;
        this.f4396b = i7;
    }

    @Override // y2.m
    public final void a() {
        C1759x1 c1759x1 = this.f4395a;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4396b, hashMap, "adId", "eventName", "onAdClicked");
        c1759x1.Q(hashMap);
    }

    @Override // y2.m
    public final void b() {
        C1759x1 c1759x1 = this.f4395a;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4396b, hashMap, "adId", "eventName", "onAdDismissedFullScreenContent");
        c1759x1.Q(hashMap);
    }

    @Override // y2.m
    public final void c(C1797a c1797a) {
        C1759x1 c1759x1 = this.f4395a;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(this.f4396b));
        hashMap.put("eventName", "onFailedToShowFullScreenContent");
        hashMap.put("error", new C0326e(c1797a));
        c1759x1.Q(hashMap);
    }

    @Override // y2.m
    public final void d() {
        C1759x1 c1759x1 = this.f4395a;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4396b, hashMap, "adId", "eventName", "onAdImpression");
        c1759x1.Q(hashMap);
    }

    @Override // y2.m
    public final void e() {
        C1759x1 c1759x1 = this.f4395a;
        c1759x1.getClass();
        HashMap hashMap = new HashMap();
        AbstractC0486a1.m(this.f4396b, hashMap, "adId", "eventName", "onAdShowedFullScreenContent");
        c1759x1.Q(hashMap);
    }
}
