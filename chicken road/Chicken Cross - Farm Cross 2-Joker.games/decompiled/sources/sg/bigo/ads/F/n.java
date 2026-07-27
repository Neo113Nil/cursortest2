package sg.bigo.ads.F;

import android.os.SystemClock;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* loaded from: classes3.dex */
public final class n implements AdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public AdInteractionListener f12294a;
    public final /* synthetic */ r b;

    public n(r rVar) {
        this.b = rVar;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        AdInteractionListener adInteractionListener = this.f12294a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        sg.bigo.ads.C.l lVar;
        if (this.f12294a != null) {
            if (adError.getCode() == 2002 && (lVar = this.b.f12298a) != null && lVar.t()) {
                return;
            }
            this.f12294a.onAdError(adError);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        k kVar;
        this.b.i = SystemClock.elapsedRealtime();
        r rVar = this.b;
        sg.bigo.ads.G.h hVar = rVar.e;
        if (hVar != null && (kVar = rVar.f) != null) {
            hVar.a(kVar.b);
        }
        r rVar2 = this.b;
        sg.bigo.ads.C.l lVar = rVar2.f12298a;
        if (lVar != null) {
            lVar.e0 = rVar2.l;
        }
        AdInteractionListener adInteractionListener = this.f12294a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdImpression();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }
}
