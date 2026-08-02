package com.google.android.gms.ads.mediation;

import W2.d;
import W2.e;
import W2.j;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, j jVar, Bundle bundle, d dVar, Bundle bundle2);

    void showInterstitial();
}
