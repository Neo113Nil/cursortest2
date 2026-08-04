package L2;

import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbge;
import p167y2.C1057a;

/* JADX INFO: loaded from: classes.dex */
public interface o {
    void onAdClicked(MediationNativeAdapter mediationNativeAdapter);

    void onAdClosed(MediationNativeAdapter mediationNativeAdapter);

    void onAdFailedToLoad(MediationNativeAdapter mediationNativeAdapter, C1057a c1057a);

    void onAdImpression(MediationNativeAdapter mediationNativeAdapter);

    void onAdLoaded(MediationNativeAdapter mediationNativeAdapter, t tVar);

    void onAdOpened(MediationNativeAdapter mediationNativeAdapter);

    void zzd(MediationNativeAdapter mediationNativeAdapter, zzbge zzbgeVar);

    void zze(MediationNativeAdapter mediationNativeAdapter, zzbge zzbgeVar, String str);
}
