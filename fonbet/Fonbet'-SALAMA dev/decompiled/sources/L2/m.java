package L2;

import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import y2.C1797a;

/* loaded from: classes.dex */
public interface m {
    void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i7);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, C1797a c1797a);

    void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter);
}
