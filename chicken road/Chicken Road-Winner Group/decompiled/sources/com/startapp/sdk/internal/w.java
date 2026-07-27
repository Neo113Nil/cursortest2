package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f4548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f4549b;

    public w(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f4548a = adDisplayListener;
        this.f4549b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adClicked() of " + this.f4548a + " with parameter " + this.f4549b;
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(3, "StartAppSDK", str);
            this.f4548a.adClicked(this.f4549b);
        } catch (Throwable th) {
            String str2 = "Failed method adClicked() of " + this.f4548a + " with parameter " + this.f4549b;
            WeakHashMap weakHashMap2 = si.f4343a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f4548a, th);
        }
    }
}
