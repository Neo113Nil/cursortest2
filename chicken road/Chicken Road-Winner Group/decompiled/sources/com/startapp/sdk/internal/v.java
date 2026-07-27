package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f4500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f4501b;

    public v(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f4500a = adDisplayListener;
        this.f4501b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adDisplayed() of " + this.f4500a + " with parameter " + this.f4501b;
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(3, "StartAppSDK", str);
            this.f4500a.adDisplayed(this.f4501b);
        } catch (Throwable th) {
            String str2 = "Failed method adDisplayed() of " + this.f4500a + " with parameter " + this.f4501b;
            WeakHashMap weakHashMap2 = si.f4343a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f4500a, th);
        }
    }
}
