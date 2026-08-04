package com.google.android.gms.ads.nativead;

import O2.b;
import android.os.Bundle;
import p167y2.r;
import p167y2.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAd {
    public abstract void destroy();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract String getHeadline();

    public abstract b getIcon();

    public abstract v getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    public abstract void recordEvent(Bundle bundle);

    public abstract void setOnPaidEventListener(r rVar);

    public abstract Object zza();
}
