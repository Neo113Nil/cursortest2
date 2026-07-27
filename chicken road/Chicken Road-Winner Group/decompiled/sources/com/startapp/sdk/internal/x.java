package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f4614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f4615b;

    public x(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f4614a = adDisplayListener;
        this.f4615b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adNotDisplayed() of " + this.f4614a + " with parameter " + this.f4615b;
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(3, "StartAppSDK", str);
            this.f4614a.adNotDisplayed(this.f4615b);
        } catch (Throwable th) {
            String str2 = "Failed method adNotDisplayed() of " + this.f4614a + " with parameter " + this.f4615b;
            WeakHashMap weakHashMap2 = si.f4343a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f4614a, th);
        }
    }
}
