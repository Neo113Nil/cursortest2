package sg.bigo.ads.api;

import java.util.Map;
import sg.bigo.ads.N.d;

/* loaded from: classes3.dex */
public class NativeAdRequest extends d {

    public static class Builder extends AdRequestBuilder<Builder, NativeAdRequest> {
        @Override // sg.bigo.ads.api.AdRequestBuilder
        public NativeAdRequest createAdRequest() {
            return new NativeAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public NativeAdRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // sg.bigo.ads.N.d
    public final int a() {
        return 1;
    }

    @Override // sg.bigo.ads.N.d
    public final Map b() {
        return null;
    }
}
