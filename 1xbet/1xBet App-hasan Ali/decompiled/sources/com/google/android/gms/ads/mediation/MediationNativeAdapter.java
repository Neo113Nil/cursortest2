package com.google.android.gms.ads.mediation;

import W2.e;
import W2.l;
import W2.n;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, l lVar, Bundle bundle, n nVar, Bundle bundle2);
}
