package com.google.android.gms.ads.mediation.customevent;

import J2.i;
import W2.d;
import X2.a;
import X2.b;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, i iVar, d dVar, Bundle bundle);
}
