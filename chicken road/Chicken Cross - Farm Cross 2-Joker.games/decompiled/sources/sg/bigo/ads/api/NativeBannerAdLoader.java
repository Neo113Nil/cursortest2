package sg.bigo.ads.api;

import sg.bigo.ads.C.f;
import sg.bigo.ads.P.j;
import sg.bigo.ads.Z0.l;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.f.v;

/* loaded from: classes3.dex */
public class NativeBannerAdLoader extends l {

    public static class Builder implements AdLoader.Builder<Ad, Builder, NativeBannerAdLoader> {
        private AdLoadListener<BannerAd> mBannerAdLoader;
        private String mExt;
        private AdLoadListener<NativeAd> mNativeAdLoader;

        /* JADX INFO: Access modifiers changed from: private */
        public AdLoadListener<Ad> createMixAdLoadListener() {
            return new b(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        @Deprecated
        public Builder withAdLoadListener(AdLoadListener<Ad> adLoadListener) {
            return this;
        }

        public Builder withBannerAdLoadListener(AdLoadListener<BannerAd> adLoadListener) {
            this.mBannerAdLoader = adLoadListener;
            return this;
        }

        public Builder withNativeAdLoadListener(AdLoadListener<NativeAd> adLoadListener) {
            this.mNativeAdLoader = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public NativeBannerAdLoader build() {
            return new NativeBannerAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public NativeBannerAdLoader(Builder builder) {
        super(builder.createMixAdLoadListener(), builder.mExt);
    }

    @Override // sg.bigo.ads.Z0.l
    public final Ad a(j jVar) {
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) jVar.f12482a;
        int i = bVar.l;
        int i2 = bVar.k;
        if (i == 2 || i2 == 3) {
            return new v(jVar);
        }
        if (i == 1) {
            return f.a(jVar);
        }
        return null;
    }
}
