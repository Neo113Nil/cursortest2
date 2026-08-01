package sg.bigo.ads.api;

import sg.bigo.ads.api.AdLoader;

/* loaded from: classes3.dex */
public final class a implements AdLoader.Builder {

    /* renamed from: a, reason: collision with root package name */
    public AdLoadListener f12685a;
    public String b;

    @Override // sg.bigo.ads.api.AdLoader.Builder
    public final AdLoader build() {
        return new IconAdsLoader(this);
    }

    @Override // sg.bigo.ads.api.AdLoader.Builder
    public final AdLoader.Builder withAdLoadListener(AdLoadListener adLoadListener) {
        this.f12685a = adLoadListener;
        return this;
    }

    @Override // sg.bigo.ads.api.AdLoader.Builder
    public final AdLoader.Builder withExt(String str) {
        this.b = str;
        return this;
    }
}
