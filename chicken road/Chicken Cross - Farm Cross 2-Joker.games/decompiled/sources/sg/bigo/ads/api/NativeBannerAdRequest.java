package sg.bigo.ads.api;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class NativeBannerAdRequest extends BannerAdRequest {

    public static class Builder extends AdRequestBuilder<Builder, NativeBannerAdRequest> {
        private List<AdSize> mAdSizes;

        public Builder withAdSizes(AdSize... adSizeArr) {
            this.mAdSizes = Arrays.asList(adSizeArr);
            return this;
        }

        @Override // sg.bigo.ads.api.AdRequestBuilder
        public NativeBannerAdRequest createAdRequest() {
            return new NativeBannerAdRequest(this.mSlotId, this.mAdSizes);
        }
    }

    public NativeBannerAdRequest(String str, List list) {
        super(str, list, null);
    }

    @Override // sg.bigo.ads.api.BannerAdRequest, sg.bigo.ads.N.d
    public final int a() {
        return 0;
    }
}
