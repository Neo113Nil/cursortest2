package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* loaded from: classes.dex */
public final class lj extends cb {

    /* renamed from: h, reason: collision with root package name */
    public final sj f4017h;

    /* renamed from: i, reason: collision with root package name */
    public final com.startapp.sdk.ads.video.a f4018i;

    /* renamed from: j, reason: collision with root package name */
    public final rj f4019j;

    public lj(OverlayActivity overlayActivity, la laVar, la laVar2, sj sjVar, com.startapp.sdk.ads.video.a aVar, rj rjVar, TrackingParams trackingParams, boolean z3) {
        super(overlayActivity, laVar, trackingParams);
        this.f3543d = laVar2;
        this.f4017h = sjVar;
        this.f4018i = aVar;
        this.f4019j = rjVar;
        this.f3541b = z3;
    }

    @JavascriptInterface
    public void replayVideo() {
        new Handler(Looper.getMainLooper()).post(this.f4017h);
    }

    @JavascriptInterface
    public void skipVideo() {
        new Handler(Looper.getMainLooper()).post(this.f4018i);
    }

    @JavascriptInterface
    public void toggleSound() {
        new Handler(Looper.getMainLooper()).post(this.f4019j);
    }
}
