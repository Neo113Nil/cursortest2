package sg.bigo.ads.api.popup;

import sg.bigo.ads.H.a;
import sg.bigo.ads.P.j;
import sg.bigo.ads.U0.b;
import sg.bigo.ads.Z0.l;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.h.InterfaceC5159e0;
import sg.bigo.ads.u0.AbstractC5492a;

/* loaded from: classes3.dex */
public class PopupAdLoader extends l {

    public static class Builder implements AdLoader.Builder<PopupAd, Builder, PopupAdLoader> {
        private AdLoadListener<PopupAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public PopupAdLoader build() {
            return new PopupAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<PopupAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public PopupAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.Z0.l
    public final Ad a(j jVar) {
        b bVar = (b) jVar.f12482a;
        int i = bVar.l;
        if (i != 20 || i != 20) {
            return null;
        }
        int i2 = bVar.k;
        if (i2 == 1 || i2 == 2) {
            if (a.f12310a == null) {
                a.f12310a = (InterfaceC5159e0) AbstractC5492a.a("sg.bigo.ads.api.INAdCreator");
            }
            InterfaceC5159e0 interfaceC5159e0 = a.f12310a;
            if (interfaceC5159e0 == null) {
                return null;
            }
            Ad adInstance = interfaceC5159e0.getAdInstance(jVar);
            if (adInstance instanceof PopupAd) {
                return (PopupAd) adInstance;
            }
            return null;
        }
        if (i2 != 3) {
            return null;
        }
        if (a.b == null) {
            a.b = (InterfaceC5159e0) AbstractC5492a.a("sg.bigo.ads.api.IBAdCreator");
        }
        InterfaceC5159e0 interfaceC5159e02 = a.b;
        if (interfaceC5159e02 == null) {
            return null;
        }
        Ad adInstance2 = interfaceC5159e02.getAdInstance(jVar);
        if (adInstance2 instanceof PopupAd) {
            return (PopupAd) adInstance2;
        }
        return null;
    }
}
