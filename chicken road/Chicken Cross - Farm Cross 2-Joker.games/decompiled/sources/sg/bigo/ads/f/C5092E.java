package sg.bigo.ads.f;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* renamed from: sg.bigo.ads.f.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5092E implements AdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public AdInteractionListener f12757a;
    public final /* synthetic */ C5095H b;

    public C5092E(C5095H c5095h) {
        this.b = c5095h;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        AdInteractionListener adInteractionListener = this.f12757a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        AdInteractionListener adInteractionListener = this.f12757a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdError(adError);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        AdInteractionListener adInteractionListener = this.f12757a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
        C5094G c5094g = this.b.T;
        if (c5094g != null) {
            c5094g.b.removeCallbacksAndMessages(null);
            c5094g.b.postDelayed(new RunnableC5093F(c5094g), c5094g.f12759a);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }
}
