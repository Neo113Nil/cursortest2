package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class ec {

    /* renamed from: a, reason: collision with root package name */
    public final String f3632a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3633b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f3634c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f3635d;

    public ec(Context applicationContext) {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        kotlin.jvm.internal.j.e(applicationContext, "applicationContext");
        this.f3633b = true;
        PackageManager packageManager = applicationContext.getPackageManager();
        if (packageManager != null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    String packageName = applicationContext.getPackageName();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                }
                kotlin.jvm.internal.j.b(applicationInfo);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    String obj2 = obj != null ? obj.toString() : null;
                    this.f3632a = obj2;
                    if (obj2 != null) {
                        Log.i("StartAppSDK", "appId is ".concat(obj2));
                    } else {
                        Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CONSENT_ENABLED")) {
                        this.f3633b = applicationInfo.metaData.getBoolean("com.startapp.sdk.CONSENT_ENABLED");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                        Boolean valueOf = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                        this.f3634c = valueOf;
                        Log.i("StartAppSDK", "is mixed audience: " + valueOf);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                        Boolean valueOf2 = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                        this.f3635d = valueOf2;
                        Log.i("StartAppSDK", "is child directed: " + valueOf2);
                    }
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
    }
}
