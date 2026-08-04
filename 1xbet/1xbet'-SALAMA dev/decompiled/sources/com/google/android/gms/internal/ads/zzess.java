package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import I2.P;
import J2.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p090m3.c;

/* JADX INFO: loaded from: classes.dex */
final class zzess implements zzesh {
    private final zzgbn zza;
    private final Context zzb;

    public zzess(zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
        this.zzb = context;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0138  */
    /* JADX WARN: Code duplicated, block: B:40:0x0142  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:51:0x0174  */
    /* JADX WARN: Code duplicated, block: B:52:0x0176  */
    /* JADX WARN: Code duplicated, block: B:54:0x017a  */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    /* JADX WARN: Code duplicated, block: B:57:0x017f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0181  */
    /* JADX WARN: Code duplicated, block: B:8:0x0063  */
    public static zzesq zzc(zzess zzessVar) {
        ActivityInfo activityInfo;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        o oVar;
        zzbbp zzbbpVar;
        C0254t c0254t;
        boolean z4;
        String string;
        boolean z7;
        boolean z8;
        Bundle bundle;
        PackageManager packageManager = zzessVar.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoZzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoZzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        P p5 = o.f1952C.f1957c;
        d dVar = C0252s.f2717f.f2718a;
        boolean zN = d.n();
        Context context = zzessVar.zzb;
        boolean zK = c.k(context);
        boolean zQ = c.q(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i7 = 0; i7 < localeList.size(); i7++) {
            arrayList.add(localeList.get(i7).getLanguage());
        }
        Context context2 = zzessVar.zzb;
        ResolveInfo resolveInfoZzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoZzd3 == null || (activityInfo = resolveInfoZzd3.activityInfo) == null) {
            str = null;
        } else {
            try {
                PackageInfo packageInfoT = p097n3.c.a(context2).t(0, activityInfo.packageName);
                if (packageInfoT != null) {
                    str = packageInfoT.versionCode + "." + activityInfo.packageName;
                } else {
                    str = null;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        try {
            PackageInfo packageInfoT2 = p097n3.c.a(zzessVar.zzb).t(128, "com.android.vending");
            str2 = packageInfoT2 != null ? packageInfoT2.versionCode + "." + packageInfoT2.packageName : null;
        } catch (Exception unused2) {
        }
        Context context3 = zzessVar.zzb;
        String str4 = Build.FINGERPRINT;
        if (packageManager != null) {
            str3 = str2;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i8 = 0;
                while (true) {
                    if (i8 < listQueryIntentActivities.size()) {
                        List<ResolveInfo> list = listQueryIntentActivities;
                        if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i8).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(zzhew.zza(context3));
                            break;
                        }
                        i8++;
                        listQueryIntentActivities = list;
                    }
                }
            }
            oVar = o.f1952C;
            P p7 = oVar.f1957c;
            long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
            zzbbpVar = zzbby.zzlq;
            c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                P p8 = oVar.f1957c;
                if (P.c(zzessVar.zzb)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlu)).booleanValue()) {
                Context context4 = zzessVar.zzb;
                try {
                    bundle = p097n3.c.a(context4).q(128, context4.getPackageName()).metaData;
                    if (bundle == null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                        string = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                    } else {
                        string = null;
                    }
                } catch (PackageManager.NameNotFoundException unused3) {
                }
            } else {
                string = "";
            }
            if (resolveInfoZzd2 != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (resolveInfoZzd != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new zzesq(z8, z7, country, zN, zK, zQ, language, arrayList, str, str3, str4, zEquals, Build.MODEL, availableBytes, z4, string, Build.VERSION.SDK_INT);
        }
        str3 = str2;
        zEquals = false;
        oVar = o.f1952C;
        P p9 = oVar.f1957c;
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        zzbbpVar = zzbby.zzlq;
        c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            P p10 = oVar.f1957c;
            if (P.c(zzessVar.zzb)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlu)).booleanValue()) {
            Context context5 = zzessVar.zzb;
            bundle = p097n3.c.a(context5).q(128, context5.getPackageName()).metaData;
            if (bundle == null) {
                string = null;
            } else {
                string = null;
            }
        } else {
            string = "";
        }
        if (resolveInfoZzd2 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (resolveInfoZzd != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        return new zzesq(z8, z7, country, zN, zK, zQ, language, arrayList, str, str3, str4, zEquals, Build.MODEL, availableBytes2, z4, string, Build.VERSION.SDK_INT);
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzess.zzc(this.zza);
            }
        });
    }
}
