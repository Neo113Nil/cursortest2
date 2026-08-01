package sg.bigo.ads.api.popup;

import sg.bigo.ads.N.d;
import sg.bigo.ads.api.AdRequestBuilder;

/* loaded from: classes3.dex */
public class PopupAdRequest extends d {

    public static class Builder extends AdRequestBuilder<Builder, PopupAdRequest> {
        @Override // sg.bigo.ads.api.AdRequestBuilder
        public PopupAdRequest createAdRequest() {
            return new PopupAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public PopupAdRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // sg.bigo.ads.N.d
    public final int a() {
        return 20;
    }
}
