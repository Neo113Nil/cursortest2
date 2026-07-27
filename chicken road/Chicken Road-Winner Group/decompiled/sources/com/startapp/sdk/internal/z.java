package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f4749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f4750b;

    public z(Context context, AdEventListener adEventListener, Ad ad) {
        this.f4749a = adEventListener;
        this.f4750b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onReceiveAd() of " + this.f4749a + " with parameter " + this.f4750b;
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(3, "StartAppSDK", str);
            this.f4749a.onReceiveAd(this.f4750b);
        } catch (Throwable th) {
            String str2 = "Failed method onReceiveAd() of " + this.f4749a + " with parameter " + this.f4750b;
            WeakHashMap weakHashMap2 = si.f4343a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f4749a, th);
        }
    }
}
