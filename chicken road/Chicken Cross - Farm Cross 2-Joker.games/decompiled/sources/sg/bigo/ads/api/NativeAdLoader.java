package sg.bigo.ads.api;

import com.ironsource.L6;
import java.util.HashMap;
import java.util.regex.Pattern;
import sg.bigo.ads.C.f;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.P.j;
import sg.bigo.ads.Z0.l;
import sg.bigo.ads.api.AdLoader;
import sg.bigo.ads.e1.InterfaceC5087a;

/* loaded from: classes3.dex */
public class NativeAdLoader extends l {

    public static class Builder implements AdLoader.Builder<NativeAd, Builder, NativeAdLoader> {
        private AdLoadListener<NativeAd> mAdLoadListener;
        private String mExt;

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public NativeAdLoader build() {
            return new NativeAdLoader(this);
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withAdLoadListener(AdLoadListener<NativeAd> adLoadListener) {
            this.mAdLoadListener = adLoadListener;
            return this;
        }

        @Override // sg.bigo.ads.api.AdLoader.Builder
        public Builder withExt(String str) {
            this.mExt = str;
            return this;
        }
    }

    public NativeAdLoader(Builder builder) {
        super(builder.mAdLoadListener, builder.mExt);
    }

    @Override // sg.bigo.ads.Z0.l
    public final Ad a(j jVar) {
        HashMap hashMap;
        if (((sg.bigo.ads.U0.b) jVar.f12482a).l != 1) {
            return null;
        }
        sg.bigo.ads.C.l a2 = f.a(jVar);
        if (a2 == null) {
            return a2;
        }
        sg.bigo.ads.P.c cVar = (InterfaceC5087a) a2.e();
        if (!(cVar instanceof sg.bigo.ads.U0.b)) {
            return a2;
        }
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        if (!bVar.T || (hashMap = bVar.j0) == null) {
            return a2;
        }
        Pattern pattern = I.f12345a;
        if (L6.K0.length() == 0 || "1".length() == 0 || hashMap.containsKey(L6.K0)) {
            return a2;
        }
        hashMap.put(L6.K0, "1");
        return a2;
    }
}
