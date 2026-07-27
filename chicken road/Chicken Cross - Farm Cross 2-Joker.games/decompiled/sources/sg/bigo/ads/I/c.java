package sg.bigo.ads.I;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f12323a;

    public c(d dVar) {
        this.f12323a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdCountDownButton adCountDownButton = this.f12323a.i.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
        f fVar = this.f12323a.i;
        fVar.r = true;
        fVar.U();
    }
}
