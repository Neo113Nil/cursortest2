package sg.bigo.ads.api;

import sg.bigo.ads.I.g;
import sg.bigo.ads.I.x;
import sg.bigo.ads.P.j;
import sg.bigo.ads.Z0.l;
import sg.bigo.ads.api.AdLoader;

/* loaded from: classes3.dex */
public class RewardVideoAdLoader extends l {

    public static class Builder implements AdLoader.Builder<RewardVideoAd, Builder, RewardVideoAdLoader> {
        private AdLoadListener<RewardVideoAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public RewardVideoAdLoader build() {
            return new RewardVideoAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<RewardVideoAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public RewardVideoAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.Z0.l
    public final Ad a(j jVar) {
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) jVar.f12482a;
        if (bVar.l != 4) {
            return null;
        }
        int i = bVar.k;
        if (i == 1 || i == 2) {
            return new x(jVar);
        }
        if (i != 3) {
            return null;
        }
        return new g(jVar);
    }
}
