package sg.bigo.ads.I;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.h.C5185l1;
import sg.bigo.ads.h.Y0;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f12331a;

    public q(r rVar) {
        this.f12331a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdCountDownButton adCountDownButton = this.f12331a.f12332a.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
        s sVar = this.f12331a.f12332a;
        x xVar = sVar.e0;
        if (xVar == null || sVar.g0) {
            AbstractC5496a.a(2, 6, "", "Failed to claim reward because of null RewardVideoAd.");
        } else {
            sVar.g0 = true;
            xVar.G();
        }
        Y0 y0 = this.f12331a.f12332a.J;
        if (y0 != null) {
            y0.I.a(null);
        }
        s sVar2 = this.f12331a.f12332a;
        if (sVar2.z.j != 3 || sVar2.w) {
            return;
        }
        sVar2.w = true;
        ((C5185l1) sVar2.e).D().a((sg.bigo.ads.U.j) null, 8, 22);
    }
}
