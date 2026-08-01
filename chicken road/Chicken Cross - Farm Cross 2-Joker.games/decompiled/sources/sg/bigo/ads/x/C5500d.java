package sg.bigo.ads.x;

import java.util.Iterator;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.common.view.RoundedFrameLayout;

/* renamed from: sg.bigo.ads.x.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5500d implements sg.bigo.ads.Q.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f13369a;

    public C5500d(k kVar) {
        this.f13369a = kVar;
    }

    @Override // sg.bigo.ads.Q.c
    public final /* bridge */ /* synthetic */ void a(Ad ad, int i, int i2, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sg.bigo.ads.Q.c
    public final /* bridge */ /* synthetic */ void a(sg.bigo.ads.Q.b bVar, boolean z) {
    }

    @Override // sg.bigo.ads.Q.c
    public final void a(Ad ad) {
        RoundedFrameLayout roundedFrameLayout;
        NativeAd nativeAd = (NativeAd) ad;
        Iterator it = this.f13369a.e0.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            q qVar = (q) it.next();
            if (qVar.r == nativeAd) {
                if (qVar.y != null && (roundedFrameLayout = qVar.q) != null) {
                    roundedFrameLayout.post(new p(qVar));
                }
            }
        }
        this.f13369a.K0();
    }
}
