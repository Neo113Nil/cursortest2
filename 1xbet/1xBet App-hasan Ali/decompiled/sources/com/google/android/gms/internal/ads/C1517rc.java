package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import java.util.Locale;
import q3.AbstractC2309b;
import r3.C2350b;

/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517rc {

    /* renamed from: a, reason: collision with root package name */
    public int f15308a;

    /* renamed from: b, reason: collision with root package name */
    public int f15309b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15310c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15311d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15312e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15313g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15314h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f15315j;

    /* renamed from: k, reason: collision with root package name */
    public final float f15316k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15317l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15318m;

    /* renamed from: n, reason: collision with root package name */
    public final String f15319n;

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b2, blocks: (B:12:0x008e, B:14:0x009c), top: B:11:0x008e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1517rc(Context context) {
        ActivityInfo activityInfo;
        PackageInfo c5;
        String str;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo c6;
        PackageManager packageManager = context.getPackageManager();
        F7.a(context);
        c(context);
        e(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.f15310c = b(packageManager, "geo:0,0?q=donuts") != null;
        this.f15311d = b(packageManager, "http://www.google.com") != null;
        this.f15312e = locale.getCountry();
        T2.L l5 = P2.o.f4767B.f4771c;
        U2.e eVar = C0379q.f.f5048a;
        this.f = U2.e.j();
        this.f15313g = AbstractC2309b.g(context);
        this.f15314h = AbstractC2309b.j(context);
        this.i = locale.getLanguage();
        ResolveInfo b3 = b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (b3 != null && (activityInfo = b3.activityInfo) != null) {
            try {
                c5 = C2350b.a(context).c(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (c5 != null) {
                str = c5.versionCode + "." + activityInfo.packageName;
                this.f15315j = str;
                c6 = C2350b.a(context).c("com.android.vending", 128);
                if (c6 != null) {
                    str2 = c6.versionCode + "." + c6.packageName;
                }
                this.f15319n = str2;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.f15316k = displayMetrics.density;
                    this.f15317l = displayMetrics.widthPixels;
                    this.f15318m = displayMetrics.heightPixels;
                }
                return;
            }
        }
        str = null;
        this.f15315j = str;
        c6 = C2350b.a(context).c("com.android.vending", 128);
        if (c6 != null) {
        }
        this.f15319n = str2;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.f15316k = displayMetrics.density;
        this.f15317l = displayMetrics.widthPixels;
        this.f15318m = displayMetrics.heightPixels;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            P2.o.f4767B.f4774g.i("DeviceInfo.getResolveInfo", th);
            return null;
        }
    }

    public final C1562sc a() {
        return new C1562sc(this.f15310c, this.f15311d, this.f15312e, this.f, this.f15313g, this.f15314h, this.i, this.f15315j, this.f15319n, this.f15308a, this.f15309b, this.f15316k, this.f15317l, this.f15318m);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.getMode();
                audioManager.isMusicActive();
                audioManager.isSpeakerphoneOn();
                audioManager.getStreamVolume(3);
                audioManager.getRingerMode();
                audioManager.getStreamVolume(2);
            } catch (Throwable th) {
                P2.o.f4767B.f4774g.i("DeviceInfo.gatherAudioInfo", th);
            }
        }
    }

    public final void d(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) Q2.r.f5053d.f5056c.a(F7.Ca)).booleanValue() || Build.VERSION.SDK_INT < 33) ? context.registerReceiver(null, intentFilter) : context.registerReceiver(null, intentFilter, 4);
        if (registerReceiver != null) {
            registerReceiver.getIntExtra("status", -1);
            registerReceiver.getIntExtra("level", -1);
            registerReceiver.getIntExtra("scale", -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (((java.lang.Boolean) Q2.r.f5053d.f5056c.a(com.google.android.gms.internal.ads.F7.k8)).booleanValue() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        telephonyManager.getNetworkOperator();
        int i = 0;
        if (AbstractC2309b.f()) {
        }
        i = telephonyManager.getNetworkType();
        this.f15309b = i;
        telephonyManager.getPhoneType();
        this.f15308a = -2;
        T2.L l5 = P2.o.f4767B.f4771c;
        if (T2.L.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.f15308a = activeNetworkInfo.getType();
                activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.f15308a = -1;
            }
            connectivityManager.isActiveNetworkMetered();
        }
    }

    public C1517rc(Context context, C1562sc c1562sc) {
        F7.a(context);
        c(context);
        e(context);
        d(context);
        String str = Build.FINGERPRINT;
        String str2 = Build.DEVICE;
        Q7.a(context);
        this.f15310c = c1562sc.f15541a;
        this.f15311d = c1562sc.f15542b;
        this.f15312e = c1562sc.f15543c;
        this.f = c1562sc.f15544d;
        this.f15313g = c1562sc.f15545e;
        this.f15314h = c1562sc.f;
        this.i = c1562sc.f15546g;
        this.f15315j = c1562sc.f15547h;
        this.f15319n = c1562sc.i;
        this.f15316k = c1562sc.f15550l;
        this.f15317l = c1562sc.f15551m;
        this.f15318m = c1562sc.f15552n;
    }
}
