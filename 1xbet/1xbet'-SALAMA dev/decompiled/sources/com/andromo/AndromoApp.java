package com.andromo;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import p124r1.a;

/* JADX INFO: loaded from: classes.dex */
public class AndromoApp extends Application {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10451a = new a();

    @Override // android.app.Application
    public final void onCreate() {
        Thread.setDefaultUncaughtExceptionHandler(this.f10451a);
        try {
            getClassLoader().loadClass("com.facebook.ads.AudienceNetworkAds").getMethod("initialize", Context.class).invoke(null, this);
            Log.d("Andromo", "FAN Loaded from onCreate");
        } catch (Exception e7) {
            Log.d("Andromo", e7.toString());
        }
        super.onCreate();
    }
}
