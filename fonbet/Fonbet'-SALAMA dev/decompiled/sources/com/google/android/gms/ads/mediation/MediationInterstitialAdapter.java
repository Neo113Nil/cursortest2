package com.google.android.gms.ads.mediation;

import L2.d;
import L2.e;
import L2.m;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, m mVar, Bundle bundle, d dVar, Bundle bundle2);

    void showInterstitial();
}
