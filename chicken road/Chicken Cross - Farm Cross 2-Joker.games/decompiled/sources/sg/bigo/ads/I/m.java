package sg.bigo.ads.I;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12329a;

    public m(n nVar) {
        this.f12329a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f12329a.i;
        x xVar = pVar.t;
        if (xVar == null || pVar.u) {
            AbstractC5496a.a(2, 6, "", "Failed to claim reward because of null RewardVideoAd.");
        } else {
            pVar.u = true;
            xVar.G();
        }
        AdCountDownButton adCountDownButton = this.f12329a.i.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
    }
}
