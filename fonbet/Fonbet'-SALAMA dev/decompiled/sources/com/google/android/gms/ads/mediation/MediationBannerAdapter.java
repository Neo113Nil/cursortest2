package com.google.android.gms.ads.mediation;

import L2.d;
import L2.e;
import L2.i;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import y2.j;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends e {
    View getBannerView();

    @Override // L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // L2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, i iVar, Bundle bundle, j jVar, d dVar, Bundle bundle2);
}
