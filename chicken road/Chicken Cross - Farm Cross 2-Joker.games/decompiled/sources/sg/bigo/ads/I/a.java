package sg.bigo.ads.I;

import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f12321a;

    public a(b bVar) {
        this.f12321a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AdCountDownButton adCountDownButton = this.f12321a.f12322a.g;
        if (adCountDownButton != null) {
            adCountDownButton.c();
        }
        f fVar = this.f12321a.f12322a;
        fVar.r = true;
        fVar.U();
    }
}
