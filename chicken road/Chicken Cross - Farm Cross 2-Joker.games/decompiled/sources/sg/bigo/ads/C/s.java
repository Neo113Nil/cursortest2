package sg.bigo.ads.C;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* loaded from: classes3.dex */
public final class s implements AdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public AdInteractionListener f12239a;
    public final /* synthetic */ t b;

    public s(t tVar) {
        this.b = tVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        AdInteractionListener adInteractionListener = this.f12239a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        AdInteractionListener adInteractionListener = this.f12239a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        if (this.f12239a != null) {
            if (adError.getCode() == 2002 && this.b.s) {
                return;
            }
            this.f12239a.onAdError(adError);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        AdInteractionListener adInteractionListener = this.f12239a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
        AdInteractionListener adInteractionListener = this.f12239a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdOpened();
        }
    }
}
