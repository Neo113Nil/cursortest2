package L2;

import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import y2.C1797a;

/* loaded from: classes.dex */
public interface i {
    void onAdClicked(MediationBannerAdapter mediationBannerAdapter);

    void onAdClosed(MediationBannerAdapter mediationBannerAdapter);

    void onAdFailedToLoad(MediationBannerAdapter mediationBannerAdapter, C1797a c1797a);

    void onAdLoaded(MediationBannerAdapter mediationBannerAdapter);

    void onAdOpened(MediationBannerAdapter mediationBannerAdapter);

    void zzb(MediationBannerAdapter mediationBannerAdapter, String str, String str2);
}
