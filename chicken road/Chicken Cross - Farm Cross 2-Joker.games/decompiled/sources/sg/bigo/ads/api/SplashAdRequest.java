package sg.bigo.ads.api;

import java.util.Map;
import sg.bigo.ads.N.d;

/* loaded from: classes3.dex */
public class SplashAdRequest extends d {
    public final int i;
    public final String j;

    public static class Builder extends AdRequestBuilder<Builder, SplashAdRequest> {
        private int mAppLogoResId;
        private String mAppName;

        public Builder withAppLogo(int i) {
            this.mAppLogoResId = i;
            return this;
        }

        public Builder withAppName(String str) {
            this.mAppName = str;
            return this;
        }

        @Override // sg.bigo.ads.api.AdRequestBuilder
        public SplashAdRequest createAdRequest() {
            return new SplashAdRequest(this.mSlotId, this.mAppLogoResId, this.mAppName, this.mServerBidPayload);
        }
    }

    public SplashAdRequest(String str, int i, String str2, String str3) {
        super(str, str3);
        this.i = i;
        this.j = str2;
    }

    @Override // sg.bigo.ads.N.d
    public final int a() {
        return 12;
    }

    @Override // sg.bigo.ads.N.d
    public final Map b() {
        return null;
    }
}
