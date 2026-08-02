package com.google.android.gms.ads.mediation.customevent;

import W2.d;
import X2.a;
import X2.c;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, c cVar, String str, d dVar, Bundle bundle);

    void showInterstitial();
}
