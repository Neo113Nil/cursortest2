package sg.bigo.ads.api;

import sg.bigo.ads.P.j;
import sg.bigo.ads.Z0.l;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.h.AbstractC5155d0;
import sg.bigo.ads.h.InterfaceC5159e0;
import sg.bigo.ads.u0.AbstractC5492a;

/* loaded from: classes3.dex */
public class InterstitialAdLoader extends l {

    public static class Builder implements AdLoader.Builder<InterstitialAd, Builder, InterstitialAdLoader> {
        private AdLoadListener<InterstitialAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public InterstitialAdLoader build() {
            return new InterstitialAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<InterstitialAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public InterstitialAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.Z0.l
    public final Ad a(j jVar) {
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) jVar.f12482a;
        int i = bVar.l;
        if (i != 3 && i != 20) {
            return null;
        }
        int i2 = bVar.k;
        if (i2 == 1 || i2 == 2) {
            if (AbstractC5155d0.f12878a == null) {
                AbstractC5155d0.f12878a = (InterfaceC5159e0) AbstractC5492a.a("sg.bigo.ads.api.INAdCreator");
            }
            InterfaceC5159e0 interfaceC5159e0 = AbstractC5155d0.f12878a;
            if (interfaceC5159e0 == null) {
                return null;
            }
            return interfaceC5159e0.getAdInstance(jVar);
        }
        if (i2 != 3) {
            return null;
        }
        if (AbstractC5155d0.b == null) {
            AbstractC5155d0.b = (InterfaceC5159e0) AbstractC5492a.a("sg.bigo.ads.api.IBAdCreator");
        }
        InterfaceC5159e0 interfaceC5159e02 = AbstractC5155d0.b;
        if (interfaceC5159e02 == null) {
            return null;
        }
        return interfaceC5159e02.getAdInstance(jVar);
    }
}
