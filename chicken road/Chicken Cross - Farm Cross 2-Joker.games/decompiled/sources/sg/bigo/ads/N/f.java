package sg.bigo.ads.N;

import sg.bigo.ads.T0.p;
import sg.bigo.ads.api.AdRequestBuilder;
import sg.bigo.ads.api.IconAdsRequest;

/* loaded from: classes3.dex */
public final class f extends AdRequestBuilder {

    /* renamed from: a, reason: collision with root package name */
    public p f12466a;
    public sg.bigo.ads.P.c b;
    public int c;
    public int d = 1;
    public int e = 20;
    public sg.bigo.ads.q.h f;

    @Override // sg.bigo.ads.api.AdRequestBuilder
    public final d createAdRequest() {
        if (this.f12466a == null) {
            return null;
        }
        return new IconAdsRequest(this);
    }
}
