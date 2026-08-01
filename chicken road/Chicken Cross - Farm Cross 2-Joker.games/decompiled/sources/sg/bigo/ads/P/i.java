package sg.bigo.ads.P;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class i implements AdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final AdLoadListener f12481a;

    public i() {
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad) {
        if (this.f12481a != null) {
            AbstractC5446j.a(2, new h(this, ad));
        }
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        if (this.f12481a != null) {
            AbstractC5446j.a(2, new g(this, adError));
        }
    }

    public i(AdLoadListener adLoadListener) {
        this.f12481a = adLoadListener;
    }
}
