package com.google.android.gms.ads.mediation;

import L2.e;
import L2.o;
import L2.s;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface MediationNativeAdapter extends e {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, o oVar, Bundle bundle, s sVar, Bundle bundle2);
}
