package com.google.android.gms.ads.mediation.customevent;

import L2.s;
import M2.a;
import M2.d;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventNative extends a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, s sVar, Bundle bundle);
}
