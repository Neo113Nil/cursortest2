package L5;

import W5.AbstractC0486a1;
import java.util.HashMap;
import p155w1.C1050x1;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes2.dex */
public final class D extends p167y2.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1050x1 f4395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4396b;

    public D(int i7, C1050x1 c1050x1) {
        this.f4395a = c1050x1;
        this.f4396b = i7;
    }

    @Override // p167y2.m
    public final void a() {
        C1050x1 c1050x1 = this.f4395a;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4396b, map, "adId", "eventName", "onAdClicked");
        c1050x1.Q(map);
    }

    @Override // p167y2.m
    public final void b() {
        C1050x1 c1050x1 = this.f4395a;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4396b, map, "adId", "eventName", "onAdDismissedFullScreenContent");
        c1050x1.Q(map);
    }

    @Override // p167y2.m
    public final void c(C1057a c1057a) {
        C1050x1 c1050x1 = this.f4395a;
        c1050x1.getClass();
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(this.f4396b));
        map.put("eventName", "onFailedToShowFullScreenContent");
        map.put("error", new C0326e(c1057a));
        c1050x1.Q(map);
    }

    @Override // p167y2.m
    public final void d() {
        C1050x1 c1050x1 = this.f4395a;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4396b, map, "adId", "eventName", "onAdImpression");
        c1050x1.Q(map);
    }

    @Override // p167y2.m
    public final void e() {
        C1050x1 c1050x1 = this.f4395a;
        c1050x1.getClass();
        HashMap map = new HashMap();
        AbstractC0486a1.m(this.f4396b, map, "adId", "eventName", "onAdShowedFullScreenContent");
        c1050x1.Q(map);
    }
}
