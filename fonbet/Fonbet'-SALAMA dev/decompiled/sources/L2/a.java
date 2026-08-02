package L2;

import android.content.Context;
import android.os.RemoteException;
import e6.C1054c;
import java.util.List;
import y2.C1797a;
import y2.w;

/* loaded from: classes.dex */
public abstract class a {
    public abstract w getSDKVersionInfo();

    public abstract w getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<C1054c> list);

    public void loadAppOpenAd(g gVar, c cVar) {
        cVar.onFailure(new C1797a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(h hVar, c cVar) {
        cVar.onFailure(new C1797a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(l lVar, c cVar) {
        cVar.onFailure(new C1797a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(n nVar, c cVar) {
        cVar.onFailure(new C1797a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(n nVar, c cVar) {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(q qVar, c cVar) {
        cVar.onFailure(new C1797a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(q qVar, c cVar) {
        cVar.onFailure(new C1797a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
