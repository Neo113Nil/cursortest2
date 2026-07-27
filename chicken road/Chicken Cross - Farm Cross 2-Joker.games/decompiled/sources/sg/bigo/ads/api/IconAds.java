package sg.bigo.ads.api;

import sg.bigo.ads.N.e;

/* loaded from: classes3.dex */
public interface IconAds extends Ad {
    NativeAd[] getNativeAds();

    void setAdInteractionListener(e eVar);

    @Override // sg.bigo.ads.api.Ad
    @Deprecated
    void setAdInteractionListener(AdInteractionListener adInteractionListener);
}
