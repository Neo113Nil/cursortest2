package sg.bigo.ads.api;

import android.util.Log;
import sg.bigo.ads.P.j;
import sg.bigo.ads.Z0.l;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.f.C5095H;

/* loaded from: classes3.dex */
public class BannerAdLoader extends l {

    public static class Builder implements AdLoader.Builder<BannerAd, Builder, BannerAdLoader> {
        private AdLoadListener<BannerAd> mBannerAdLoader;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public BannerAdLoader build() {
            return new BannerAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<BannerAd> adLoadListener) {
            this.mBannerAdLoader = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public BannerAdLoader(Builder builder) {
        super(builder.mBannerAdLoader, builder.mExt);
    }

    @Override // sg.bigo.ads.Z0.l
    public final Ad a(j jVar) {
        if (((sg.bigo.ads.U0.b) jVar.f12482a).l != 2) {
            return null;
        }
        try {
            return new C5095H(jVar);
        } catch (Exception e) {
            sg.bigo.ads.s1.b.a(3000, 10100, Log.getStackTraceString(e), (sg.bigo.ads.P.c) null);
            return null;
        }
    }
}
