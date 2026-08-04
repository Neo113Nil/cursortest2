package L2;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;
import p167y2.C1057a;
import p167y2.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public abstract w getSDKVersionInfo();

    public abstract w getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<p036e6.c> list);

    public void loadAppOpenAd(g gVar, c cVar) {
        cVar.onFailure(new C1057a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads", null));
    }

    public void loadBannerAd(h hVar, c cVar) {
        cVar.onFailure(new C1057a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(l lVar, c cVar) {
        cVar.onFailure(new C1057a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    @Deprecated
    public void loadNativeAd(n nVar, c cVar) {
        cVar.onFailure(new C1057a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAdMapper(n nVar, c cVar) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadRewardedAd(q qVar, c cVar) {
        cVar.onFailure(new C1057a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(q qVar, c cVar) {
        cVar.onFailure(new C1057a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
