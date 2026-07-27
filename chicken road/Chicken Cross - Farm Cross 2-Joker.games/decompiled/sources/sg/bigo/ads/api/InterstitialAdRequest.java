package sg.bigo.ads.api;

import java.util.Map;
import sg.bigo.ads.N.d;

/* loaded from: classes3.dex */
public class InterstitialAdRequest extends d {
    public int i;

    public static class Builder extends AdRequestBuilder<Builder, InterstitialAdRequest> {
        @Override // sg.bigo.ads.api.AdRequestBuilder
        public InterstitialAdRequest createAdRequest() {
            return new InterstitialAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public InterstitialAdRequest(String str, String str2) {
        super(str, str2);
        this.i = 3;
    }

    @Override // sg.bigo.ads.N.d
    public final boolean a(int i) {
        if (i == 3) {
            this.i = 3;
            return false;
        }
        if (i != 20) {
            return true;
        }
        this.i = 20;
        return false;
    }

    @Override // sg.bigo.ads.N.d
    public final Map b() {
        return null;
    }

    @Override // sg.bigo.ads.N.d
    public final int a() {
        return this.i;
    }
}
