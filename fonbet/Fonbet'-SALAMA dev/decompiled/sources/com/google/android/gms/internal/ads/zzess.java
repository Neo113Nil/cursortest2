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
import m3.c;

/* loaded from: classes.dex */
final class zzess implements zzesh {
    private final zzgbn zza;
    private final Context zzb;

    public zzess(zzgbn zzgbnVar, Context context) {
        this.zza = zzgbnVar;
        this.zzb = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(2:4|2)|5|6|(3:63|64|(19:66|67|9|10|11|(13:13|14|(1:16)(2:46|(3:49|(3:52|(2:55|56)(1:54)|50)|57))|17|18|(2:20|(7:22|23|(5:25|26|27|(1:31)|42)(1:44)|(1:33)(1:40)|(1:35)(1:39)|36|37))|45|23|(0)(0)|(0)(0)|(0)(0)|36|37)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37))|8|9|10|11|(0)|59|14|(0)(0)|17|18|(0)|45|23|(0)(0)|(0)(0)|(0)(0)|36|37) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009d A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #2 {Exception -> 0x00b4, blocks: (B:11:0x0091, B:13:0x009d), top: B:10:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzesq zzc(zzess zzessVar) {
        ActivityInfo activityInfo;
        PackageInfo t7;
        String str;
        String str2;
        String str3;
        boolean equals;
        zzbbp zzbbpVar;
        C0254t c0254t;
        boolean z4;
        String str4;
        PackageInfo t8;
        PackageManager packageManager = zzessVar.zzb.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        P p5 = o.f1952C.f1957c;
        d dVar = C0252s.f2717f.f2718a;
        boolean n2 = d.n();
        Context context = zzessVar.zzb;
        boolean k7 = c.k(context);
        boolean q7 = c.q(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i7 = 0; i7 < localeList.size(); i7++) {
            arrayList.add(localeList.get(i7).getLanguage());
        }
        Context context2 = zzessVar.zzb;
        ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd3 != null && (activityInfo = zzd3.activityInfo) != null) {
            try {
                t7 = n3.c.a(context2).t(0, activityInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (t7 != null) {
                str = t7.versionCode + "." + activityInfo.packageName;
                t8 = n3.c.a(zzessVar.zzb).t(128, "com.android.vending");
                if (t8 != null) {
                    str2 = t8.versionCode + "." + t8.packageName;
                    Context context3 = zzessVar.zzb;
                    String str5 = Build.FINGERPRINT;
                    if (packageManager == null) {
                        str3 = str2;
                    } else {
                        str3 = str2;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            int i8 = 0;
                            while (i8 < queryIntentActivities.size()) {
                                List<ResolveInfo> list = queryIntentActivities;
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i8).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zzhew.zza(context3));
                                    break;
                                }
                                i8++;
                                queryIntentActivities = list;
                            }
                        }
                    }
                    equals = false;
                    o oVar = o.f1952C;
                    P p7 = oVar.f1957c;
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    zzbbpVar = zzbby.zzlq;
                    c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        P p8 = oVar.f1957c;
                        if (P.c(zzessVar.zzb)) {
                            z4 = true;
                            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlu)).booleanValue()) {
                                str4 = "";
                            } else {
                                Context context4 = zzessVar.zzb;
                                try {
                                    Bundle bundle = n3.c.a(context4).q(128, context4.getPackageName()).metaData;
                                    if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                                        str4 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                                    }
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                                str4 = null;
                            }
                            return new zzesq(zzd == null, zzd2 == null, country, n2, k7, q7, language, arrayList, str, str3, str5, equals, Build.MODEL, availableBytes, z4, str4, Build.VERSION.SDK_INT);
                        }
                    }
                    z4 = false;
                    if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlu)).booleanValue()) {
                    }
                    if (zzd2 == null) {
                    }
                    return new zzesq(zzd == null, zzd2 == null, country, n2, k7, q7, language, arrayList, str, str3, str5, equals, Build.MODEL, availableBytes, z4, str4, Build.VERSION.SDK_INT);
                }
                str2 = null;
                Context context32 = zzessVar.zzb;
                String str52 = Build.FINGERPRINT;
                if (packageManager == null) {
                }
                equals = false;
                o oVar2 = o.f1952C;
                P p72 = oVar2.f1957c;
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                zzbbpVar = zzbby.zzlq;
                c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                }
                z4 = false;
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlu)).booleanValue()) {
                }
                if (zzd2 == null) {
                }
                return new zzesq(zzd == null, zzd2 == null, country, n2, k7, q7, language, arrayList, str, str3, str52, equals, Build.MODEL, availableBytes2, z4, str4, Build.VERSION.SDK_INT);
            }
        }
        str = null;
        t8 = n3.c.a(zzessVar.zzb).t(128, "com.android.vending");
        if (t8 != null) {
        }
        str2 = null;
        Context context322 = zzessVar.zzb;
        String str522 = Build.FINGERPRINT;
        if (packageManager == null) {
        }
        equals = false;
        o oVar22 = o.f1952C;
        P p722 = oVar22.f1957c;
        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        zzbbpVar = zzbby.zzlq;
        c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
        }
        z4 = false;
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzlu)).booleanValue()) {
        }
        if (zzd2 == null) {
        }
        return new zzesq(zzd == null, zzd2 == null, country, n2, k7, q7, language, arrayList, str, str3, str522, equals, Build.MODEL, availableBytes22, z4, str4, Build.VERSION.SDK_INT);
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
                return zzess.zzc(zzess.this);
            }
        });
    }
}
