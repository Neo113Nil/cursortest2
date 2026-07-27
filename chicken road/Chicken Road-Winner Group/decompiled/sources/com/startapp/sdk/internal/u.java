package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdDisplayListener f4401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f4402b;

    public u(Context context, AdDisplayListener adDisplayListener, Ad ad) {
        this.f4401a = adDisplayListener;
        this.f4402b = ad;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method adHidden() of " + this.f4401a + " with parameter " + this.f4402b;
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(3, "StartAppSDK", str);
            this.f4401a.adHidden(this.f4402b);
        } catch (Throwable th) {
            String str2 = "Failed method adHidden() of " + this.f4401a + " with parameter " + this.f4402b;
            WeakHashMap weakHashMap2 = si.f4343a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f4401a, th);
        }
    }
}
