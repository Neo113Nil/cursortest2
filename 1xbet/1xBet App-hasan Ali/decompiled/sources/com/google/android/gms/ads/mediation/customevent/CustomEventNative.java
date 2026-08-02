package com.google.android.gms.ads.mediation.customevent;

import W2.n;
import X2.a;
import X2.d;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, n nVar, Bundle bundle);
}
