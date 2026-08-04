package L2;

import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
public interface m {
    void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i7);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, C1057a c1057a);

    void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter);
}
