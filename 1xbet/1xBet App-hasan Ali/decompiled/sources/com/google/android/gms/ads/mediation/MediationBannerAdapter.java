package com.google.android.gms.ads.mediation;

import J2.i;
import W2.d;
import W2.e;
import W2.h;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter extends e {
    View getBannerView();

    @Override // W2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // W2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // W2.e, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, h hVar, Bundle bundle, i iVar, d dVar, Bundle bundle2);
}
