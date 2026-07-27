package sg.bigo.ads.f;

import sg.bigo.ads.api.InnerBannerAd;

/* renamed from: sg.bigo.ads.f.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC5089B implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InnerBannerAd f12754a;

    public RunnableC5089B(InnerBannerAd innerBannerAd) {
        this.f12754a = innerBannerAd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InnerBannerAd innerBannerAd = this.f12754a;
        if (innerBannerAd != null) {
            innerBannerAd.destroy();
        }
    }
}
