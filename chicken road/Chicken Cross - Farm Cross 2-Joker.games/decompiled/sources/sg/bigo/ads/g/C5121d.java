package sg.bigo.ads.g;

import sg.bigo.ads.D.h;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;

/* renamed from: sg.bigo.ads.g.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5121d implements AdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public final h f12795a;
    public final sg.bigo.ads.N.e b;

    public C5121d(h hVar, C5118a c5118a) {
        this.f12795a = hVar;
        this.b = c5118a;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        sg.bigo.ads.N.e eVar = this.b;
        if (eVar != null) {
            eVar.a(this.f12795a);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        sg.bigo.ads.N.e eVar = this.b;
        if (eVar != null) {
            eVar.b(this.f12795a);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        sg.bigo.ads.N.e eVar = this.b;
        if (eVar != null) {
            eVar.a(this.f12795a, adError);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        sg.bigo.ads.N.e eVar = this.b;
        if (eVar != null) {
            eVar.c(this.f12795a);
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
        sg.bigo.ads.N.e eVar = this.b;
        if (eVar != null) {
            eVar.d(this.f12795a);
        }
    }
}
