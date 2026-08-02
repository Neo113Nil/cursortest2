package L2;

import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbge;
import y2.C1797a;

/* loaded from: classes.dex */
public interface o {
    void onAdClicked(MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(MediationNativeAdapter mediationNativeAdapter);

    void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C1797a c1797a);

    void onAdImpression(MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, t tVar);

    void onAdOpened(MediationNativeAdapter mediationNativeAdapter);

    void zzd(MediationNativeAdapter mediationNativeAdapter, zzbge zzbgeVar);

    void zze(MediationNativeAdapter mediationNativeAdapter, zzbge zzbgeVar, String str);
}
