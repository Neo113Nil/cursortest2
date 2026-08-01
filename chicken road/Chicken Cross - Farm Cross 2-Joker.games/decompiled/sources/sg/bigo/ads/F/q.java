package sg.bigo.ads.F;

import sg.bigo.ads.api.NativeAd;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public o f12297a;
    public p b;
    public final /* synthetic */ r c;

    public q(r rVar, sg.bigo.ads.Q.c cVar) {
        this.c = rVar;
        this.f12297a = new o(this, cVar);
        this.b = new p(this, cVar);
    }

    public static void a(q qVar, NativeAd nativeAd, int i) {
        r rVar;
        int i2;
        qVar.getClass();
        if (nativeAd instanceof sg.bigo.ads.D.g) {
            rVar = qVar.c;
            i2 = 3;
        } else {
            if (!(nativeAd instanceof sg.bigo.ads.D.a)) {
                return;
            }
            rVar = qVar.c;
            i2 = 2;
        }
        rVar.a(i2, i);
    }
}
