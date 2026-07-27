package sg.bigo.ads.api;

import sg.bigo.ads.N.d;
import sg.bigo.ads.api.AdRequestBuilder;

/* loaded from: classes3.dex */
public abstract class AdRequestBuilder<ARB extends AdRequestBuilder, AR extends d> {
    private long mActivatedTime;
    private int mAge;
    private int mGender;
    protected String mServerBidPayload;
    protected String mSlotId;
    private String mWatermark;

    public AR build() {
        AR createAdRequest = createAdRequest();
        if (createAdRequest != null) {
            int i = this.mAge;
            int i2 = this.mGender;
            long j = this.mActivatedTime;
            createAdRequest.d = i;
            createAdRequest.e = i2;
            createAdRequest.f = j;
            createAdRequest.g = this.mWatermark;
        }
        return createAdRequest;
    }

    public abstract AR createAdRequest();

    public ARB withActivatedTime(long j) {
        this.mActivatedTime = j;
        return this;
    }

    public ARB withAge(int i) {
        this.mAge = i;
        return this;
    }

    public final ARB withBid(String str) {
        this.mServerBidPayload = str;
        return this;
    }

    public ARB withGender(int i) {
        this.mGender = i;
        return this;
    }

    public final ARB withSlotId(String str) {
        this.mSlotId = str;
        return this;
    }

    public ARB withWatermark(String str) {
        this.mWatermark = str;
        return this;
    }
}
