package sg.bigo.ads.L;

import sg.bigo.ads.ad.splash.AdSplashActivity;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* renamed from: sg.bigo.ads.L.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4967a implements SplashAdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdSplashActivity f12378a;

    public C4967a(AdSplashActivity adSplashActivity) {
        this.f12378a = adSplashActivity;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        if (adError == null) {
            return;
        }
        adError.getCode();
        adError.getMessage();
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdFinished() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdSkipped() {
        this.f12378a.finish();
    }
}
