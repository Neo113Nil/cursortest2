package sg.bigo.ads.m;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class k0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdCountDownButton f13089a;

    public k0(AdCountDownButton adCountDownButton) {
        this.f13089a = adCountDownButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f13089a.getVisibility() == 4) {
            this.f13089a.setVisibility(0);
            AdCountDownButton adCountDownButton = this.f13089a;
            if (adCountDownButton.c) {
                return;
            }
            adCountDownButton.b();
        }
    }
}
