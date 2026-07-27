package sg.bigo.ads.h;

import android.os.SystemClock;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.u.C5485f;

/* renamed from: sg.bigo.ads.h.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5179j1 implements AdInteractionListener {

    /* renamed from: a, reason: collision with root package name */
    public AdInteractionListener f12896a;
    public final /* synthetic */ C5185l1 b;

    public C5179j1(C5185l1 c5185l1) {
        this.b = c5185l1;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        AdInteractionListener adInteractionListener = this.f12896a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClicked();
        }
        AbstractC5151c0 abstractC5151c0 = this.b.S;
        if (abstractC5151c0 != null) {
            abstractC5151c0.O();
        }
        C5167g0 c5167g0 = this.b.a0;
        if (c5167g0 != null) {
            c5167g0.getClass();
            c5167g0.f12886a = SystemClock.elapsedRealtime();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        AdInteractionListener adInteractionListener = this.f12896a;
        if (adInteractionListener != null) {
            adInteractionListener.onAdClosed();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        AbstractC5151c0 abstractC5151c0;
        if (this.f12896a != null && (adError.getCode() != 2002 || !this.b.t())) {
            this.f12896a.onAdError(adError);
        }
        if (adError.getCode() != 2002 || (abstractC5151c0 = this.b.S) == null) {
            return;
        }
        adError.getMessage();
        abstractC5151c0.Q();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        AdInteractionListener adInteractionListener = this.f12896a;
        if (adInteractionListener != null) {
            sg.bigo.ads.C.l lVar = this.b.W;
            if (lVar instanceof sg.bigo.ads.E.d) {
                sg.bigo.ads.E.d dVar = (sg.bigo.ads.E.d) lVar;
                if (adInteractionListener == null) {
                    dVar.getClass();
                } else if (!dVar.s0) {
                    dVar.s0 = true;
                    adInteractionListener.onAdImpression();
                }
            } else {
                adInteractionListener.onAdImpression();
            }
        }
        C5167g0 c5167g0 = this.b.a0;
        if (c5167g0 != null) {
            c5167g0.getClass();
            c5167g0.b = SystemClock.elapsedRealtime();
        }
        C5485f E = this.b.E();
        if (E != null) {
            E.b();
        }
        C5485f C = this.b.C();
        if (C != null) {
            C.b();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
        AdInteractionListener adInteractionListener = this.f12896a;
        if (adInteractionListener != null) {
            sg.bigo.ads.C.l lVar = this.b.W;
            if (!(lVar instanceof sg.bigo.ads.E.d)) {
                adInteractionListener.onAdOpened();
                return;
            }
            sg.bigo.ads.E.d dVar = (sg.bigo.ads.E.d) lVar;
            if (adInteractionListener == null) {
                dVar.getClass();
            } else {
                if (dVar.t0) {
                    return;
                }
                dVar.t0 = true;
                adInteractionListener.onAdOpened();
            }
        }
    }
}
