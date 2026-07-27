package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Log;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerListener f3822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f3823b;

    public h1(Context context, BannerListener bannerListener, View view) {
        this.f3822a = bannerListener;
        this.f3823b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String str = "Calling method onImpression() of " + this.f3822a + " with parameter " + this.f3823b;
            WeakHashMap weakHashMap = si.f4343a;
            Log.println(3, "StartAppSDK", str);
            this.f3822a.onImpression(this.f3823b);
        } catch (Throwable th) {
            String str2 = "Calling method onImpression() of " + this.f3822a + " with parameter " + this.f3823b;
            WeakHashMap weakHashMap2 = si.f4343a;
            Log.println(5, "StartAppSDK", str2);
            si.a((Object) this.f3822a, th);
        }
    }
}
