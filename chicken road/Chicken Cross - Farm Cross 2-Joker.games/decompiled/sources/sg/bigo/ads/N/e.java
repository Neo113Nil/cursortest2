package sg.bigo.ads.N;

import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* loaded from: classes3.dex */
public abstract class e implements AdInteractionListener {
    public abstract void a(sg.bigo.ads.D.h hVar);

    public abstract void a(sg.bigo.ads.D.h hVar, AdError adError);

    public abstract void b(sg.bigo.ads.D.h hVar);

    public abstract void c(sg.bigo.ads.D.h hVar);

    public abstract void d(sg.bigo.ads.D.h hVar);

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }
}
