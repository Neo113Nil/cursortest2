package sg.bigo.ads.h;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class A2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B2 f12801a;

    public A2(B2 b2) {
        this.f12801a = b2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdCountDownButton adCountDownButton;
        if (this.f12801a.f12805a.d0() != 5 || (adCountDownButton = this.f12801a.f12805a.g) == null || adCountDownButton.getVisibility() == 0) {
            return;
        }
        H2 h2 = this.f12801a.f12805a;
        h2.h0 = 8;
        h2.E0();
    }
}
