package com.google.android.gms.ads.mediation.customevent;

import L2.d;
import M2.a;
import M2.b;
import android.content.Context;
import android.os.Bundle;
import p167y2.j;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventBanner extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, b bVar, String str, j jVar, d dVar, Bundle bundle);
}
