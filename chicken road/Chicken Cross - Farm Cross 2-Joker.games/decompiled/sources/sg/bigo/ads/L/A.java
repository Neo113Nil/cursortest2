package sg.bigo.ads.L;

import android.os.SystemClock;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* loaded from: classes3.dex */
public final class A implements SplashAdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public SplashAdInteractionListener f12367a;
    public SplashAdInteractionListener b;
    public boolean c;
    public boolean d = false;
    public final /* synthetic */ N e;

    public A(N n) {
        this.e = n;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        SplashAdInteractionListener splashAdInteractionListener = this.f12367a;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClicked();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.b;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClicked();
        }
        sg.bigo.ads.M.F f = this.e.Q;
        if (f != null) {
            f.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        SplashAdInteractionListener splashAdInteractionListener = this.f12367a;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClosed();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.b;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClosed();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        if (adError.getCode() == 2002 && this.d) {
            return;
        }
        SplashAdInteractionListener splashAdInteractionListener = this.f12367a;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdError(adError);
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.b;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdError(adError);
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdFinished() {
        if (this.c) {
            return;
        }
        SplashAdInteractionListener splashAdInteractionListener = this.f12367a;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdFinished();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.b;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdFinished();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        SplashAdInteractionListener splashAdInteractionListener = this.f12367a;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdImpression();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.b;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdImpression();
        }
        this.d = true;
        this.e.T = SystemClock.elapsedRealtime();
        sg.bigo.ads.M.F f = this.e.Q;
        if (f != null) {
            f.onAdImpression();
        }
        this.e.G();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
        SplashAdInteractionListener splashAdInteractionListener = this.f12367a;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdOpened();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.b;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdOpened();
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public final void onAdSkipped() {
        SplashAdInteractionListener splashAdInteractionListener = this.f12367a;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdSkipped();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.b;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdSkipped();
        }
        this.c = true;
    }
}
