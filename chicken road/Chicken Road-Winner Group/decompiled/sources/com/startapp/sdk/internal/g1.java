package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f3744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerBase f3745b;

    public g1(Context context, BannerListener bannerListener, BannerBase bannerBase) {
        this.f3744a = bannerListener;
        this.f3745b = bannerBase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onFailedToReceiveAd() of " + this.f3744a + " with parameter " + this.f3745b;
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(3, "StartAppSDK", str);
            this.f3744a.onFailedToReceiveAd(this.f3745b);
        } catch (Throwable th) {
            String str2 = "Failed method onFailedToReceiveAd() of " + this.f3744a + " with parameter " + this.f3745b;
            WeakHashMap weakHashMap2 = si.f4343a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f3744a, th);
        }
    }
}
