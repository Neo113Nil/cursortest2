package L2;

import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
public interface i {
    void onAdClicked(MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(MediationBannerAdapter mediationBannerAdapter);

    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, C1057a c1057a);

    void onAdLoaded(MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(MediationBannerAdapter mediationBannerAdapter);

    void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2);
}
