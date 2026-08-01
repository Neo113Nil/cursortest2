package sg.bigo.ads.api;

import org.json.JSONObject;
import sg.bigo.ads.C.f;
import sg.bigo.ads.L.N;
import sg.bigo.ads.P.j;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.Z0.l;
import sg.bigo.ads.api.AdLoader;

/* loaded from: classes3.dex */
public class SplashAdLoader extends l {

    public static class Builder implements AdLoader.Builder<SplashAd, Builder, SplashAdLoader> {
        private AdLoadListener<SplashAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public SplashAdLoader build() {
            return new SplashAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<SplashAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public SplashAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.Z0.l
    public final Ad a(j jVar) {
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) jVar.f12482a;
        if (bVar.l == 12) {
            p pVar = bVar.c;
            if (pVar.r == null) {
                pVar.r = new q(new JSONObject());
            }
            q qVar = pVar.r;
            q qVar2 = ((sg.bigo.ads.U0.b) jVar.f12482a).I;
            sg.bigo.ads.C.l a2 = f.a(jVar);
            if (a2 != null) {
                return new N(a2, jVar, qVar, qVar2);
            }
        }
        return null;
    }
}
