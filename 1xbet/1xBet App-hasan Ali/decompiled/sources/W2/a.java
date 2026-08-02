package W2;

import J2.r;
import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public abstract r getSDKVersionInfo();

    public abstract r getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<Q1.j> list);

    public void loadAppOpenAd(f fVar, c cVar) {
        cVar.w(new J2.b(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(g gVar, c cVar) {
        cVar.w(new J2.b(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadInterscrollerAd(g gVar, c cVar) {
        cVar.w(new J2.b(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(i iVar, c cVar) {
        cVar.w(new J2.b(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(k kVar, c cVar) {
        cVar.w(new J2.b(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(k kVar, c cVar) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(m mVar, c cVar) {
        cVar.w(new J2.b(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(m mVar, c cVar) {
        cVar.w(new J2.b(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
