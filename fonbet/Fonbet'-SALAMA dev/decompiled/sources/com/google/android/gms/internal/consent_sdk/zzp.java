package com.google.android.gms.internal.consent_sdk;

import B3.a;
import B3.h;
import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final a zzc;
    private final h zzd;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, a aVar, h hVar, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = aVar;
        this.zzd = hVar;
    }

    public static zzcj zza(zzp zzpVar) {
        Bundle bundle;
        String string;
        Application application;
        Application application2;
        List list;
        zzaq zzaqVar;
        Application application3;
        Application application4;
        Application application5;
        List<Rect> boundingRects;
        List list2;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        Application application9;
        zzcj zzcjVar = new zzcj();
        zzpVar.zzd.getClass();
        if (TextUtils.isEmpty(null)) {
            try {
                zzn zznVar = zzpVar.zza;
                application = zznVar.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            string = bundle != null ? bundle.getString("com.google.android.gms.ads.APPLICATION_ID") : null;
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        } else {
            string = null;
        }
        zzcjVar.zza = string;
        a aVar = zzpVar.zzc;
        if (aVar.f1055a) {
            ArrayList arrayList = new ArrayList();
            int i7 = aVar.f1056b;
            if (i7 == 1) {
                arrayList.add(zzce.GEO_OVERRIDE_EEA);
            } else if (i7 == 2) {
                arrayList.add(zzce.GEO_OVERRIDE_NON_EEA);
            } else if (i7 == 3) {
                arrayList.add(zzce.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (i7 == 4) {
                arrayList.add(zzce.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzce.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        zzcjVar.zzi = list;
        zzn zznVar2 = zzpVar.zza;
        zzaqVar = zznVar2.zzb;
        zzcjVar.zze = zzaqVar.zzc();
        zzcjVar.zzd = Boolean.valueOf(zzpVar.zzd.f1065a);
        zzcjVar.zzc = Locale.getDefault().toLanguageTag();
        zzcf zzcfVar = new zzcf();
        int i8 = Build.VERSION.SDK_INT;
        zzcfVar.zzb = Integer.valueOf(i8);
        zzcfVar.zza = Build.MODEL;
        zzcfVar.zzc = 2;
        zzcjVar.zzb = zzcfVar;
        application3 = zznVar2.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar2.zza;
        application4.getResources().getConfiguration();
        zzch zzchVar = new zzch();
        zzchVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzchVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar2.zza;
        zzchVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i8 < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = zzpVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                list2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        zzcg zzcgVar = new zzcg();
                        zzcgVar.zzb = Integer.valueOf(rect.left);
                        zzcgVar.zzc = Integer.valueOf(rect.right);
                        zzcgVar.zza = Integer.valueOf(rect.top);
                        zzcgVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzcgVar);
                    }
                }
                list2 = arrayList2;
            }
        }
        zzchVar.zzd = list2;
        zzcjVar.zzf = zzchVar;
        application6 = zznVar2.zza;
        try {
            application9 = zznVar2.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza = application6.getPackageName();
        zzn zznVar3 = zzpVar.zza;
        application7 = zznVar3.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar3.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        zzcdVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzcdVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzcjVar.zzg = zzcdVar;
        zzci zzciVar = new zzci();
        zzciVar.zza = "3.2.0";
        zzcjVar.zzh = zzciVar;
        return zzcjVar;
    }
}
