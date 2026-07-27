package sg.bigo.ads.api;

import java.util.Map;
import sg.bigo.ads.N.d;

/* loaded from: classes3.dex */
public class RewardVideoAdRequest extends d {

    public static class Builder extends AdRequestBuilder<Builder, RewardVideoAdRequest> {
        @Override // sg.bigo.ads.api.AdRequestBuilder
        public RewardVideoAdRequest createAdRequest() {
            return new RewardVideoAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public RewardVideoAdRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // sg.bigo.ads.N.d
    public final int a() {
        return 4;
    }

    @Override // sg.bigo.ads.N.d
    public final Map b() {
        return null;
    }
}
