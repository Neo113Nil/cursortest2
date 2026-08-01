package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfdt implements zzfdi {
    private final zzhdi zza;
    private final Context zzb;
    private final zzeez zzc;
    private final String zzd;

    zzfdt(zzhdi zzhdiVar, Context context, zzeez zzeezVar, String str) {
        this.zza = zzhdiVar;
        this.zzb = context;
        this.zzc = zzeezVar;
        this.zzd = str;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfds
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzfdt.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 38;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(2:4|2)|5|6|(3:65|66|(22:68|69|9|10|11|(16:13|14|(1:16)(3:56|(1:58)|59)|17|(1:19)(2:44|(3:47|(3:50|(2:53|54)(1:52)|48)|55))|20|21|(2:23|(8:25|26|(2:28|(1:30)(1:41))(1:42)|31|(1:33)(1:40)|(1:35)(1:39)|36|37))|43|26|(0)(0)|31|(0)(0)|(0)(0)|36|37)|61|14|(0)(0)|17|(0)(0)|20|21|(0)|43|26|(0)(0)|31|(0)(0)|(0)(0)|36|37))|8|9|10|11|(0)|61|14|(0)(0)|17|(0)(0)|20|21|(0)|43|26|(0)(0)|31|(0)(0)|(0)(0)|36|37) */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a9 A[Catch: Exception -> 0x00d3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d3, blocks: (B:11:0x009b, B:13:0x00a9), top: B:10:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ zzfdr zzc() {
        ActivityInfo activityInfo;
        PackageInfo packageInfo;
        String sb;
        String str;
        String str2;
        String str3;
        String str4;
        boolean equals;
        boolean z;
        PackageInfo packageInfo2;
        Context context = this.zzb;
        PackageManager packageManager = context.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo zzd = zzd(packageManager, "geo:0,0?q=donuts");
        ResolveInfo zzd2 = zzd(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.client.zzay.zza();
        boolean zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy();
        boolean isLatchsky = DeviceProperties.isLatchsky(context);
        boolean isSidewinder = DeviceProperties.isSidewinder(context);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        ResolveInfo zzd3 = zzd(packageManager, "market://details?id=com.google.android.gms.ads");
        if (zzd3 != null && (activityInfo = zzd3.activityInfo) != null) {
            try {
                packageInfo = Wrappers.packageManager(context).getPackageInfo(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo != null) {
                int i2 = packageInfo.versionCode;
                String str5 = activityInfo.packageName;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 1 + String.valueOf(str5).length());
                sb2.append(i2);
                sb2.append(".");
                sb2.append(str5);
                sb = sb2.toString();
                packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
                if (packageInfo2 != null) {
                    int i3 = packageInfo2.versionCode;
                    String str6 = packageInfo2.packageName;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 1 + String.valueOf(str6).length());
                    sb3.append(i3);
                    sb3.append(".");
                    sb3.append(str6);
                    str = sb3.toString();
                    String str7 = Build.FINGERPRINT;
                    String language2 = Locale.getDefault().getLanguage();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpm)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.zzq zzk = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb);
                        String zzb = zzk.zzb();
                        str3 = zzk.zza();
                        str2 = zzb;
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpl)).booleanValue()) {
                            language2 = com.google.android.gms.ads.internal.util.zzs.zzk(this.zzb).zzb();
                        }
                        str2 = language2;
                        str3 = null;
                    }
                    Context context2 = this.zzb;
                    if (packageManager == null) {
                        str4 = str7;
                    } else {
                        str4 = str7;
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            int i4 = 0;
                            while (i4 < queryIntentActivities.size()) {
                                List<ResolveInfo> list = queryIntentActivities;
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i4).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zziom.zza(context2));
                                    break;
                                }
                                i4++;
                                queryIntentActivities = list;
                            }
                        }
                    }
                    equals = false;
                    com.google.android.gms.ads.internal.zzt.zzc();
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmX)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        if (com.google.android.gms.ads.internal.util.zzs.zzE(context2)) {
                            z = true;
                            return new zzfdr(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, Build.MODEL, availableBytes, z, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznb)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznd)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context2) : "", Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
                        }
                    }
                    z = false;
                    return new zzfdr(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, Build.MODEL, availableBytes, z, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznb)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznd)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context2) : "", Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
                }
                str = null;
                String str72 = Build.FINGERPRINT;
                String language22 = Locale.getDefault().getLanguage();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpm)).booleanValue()) {
                }
                Context context22 = this.zzb;
                if (packageManager == null) {
                }
                equals = false;
                com.google.android.gms.ads.internal.zzt.zzc();
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmX)).booleanValue()) {
                }
                z = false;
                return new zzfdr(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, Build.MODEL, availableBytes2, z, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznb)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznd)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context22) : "", Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
            }
        }
        sb = null;
        packageInfo2 = Wrappers.packageManager(this.zzb).getPackageInfo("com.android.vending", 128);
        if (packageInfo2 != null) {
        }
        str = null;
        String str722 = Build.FINGERPRINT;
        String language222 = Locale.getDefault().getLanguage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpm)).booleanValue()) {
        }
        Context context222 = this.zzb;
        if (packageManager == null) {
        }
        equals = false;
        com.google.android.gms.ads.internal.zzt.zzc();
        long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmX)).booleanValue()) {
        }
        z = false;
        return new zzfdr(zzd == null, zzd2 == null, country, zzy, isLatchsky, isSidewinder, language, arrayList, sb, str, str4, equals, Build.MODEL, availableBytes22, z, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznb)).booleanValue() ? ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zznd)).booleanValue() ? this.zzd : com.google.android.gms.ads.internal.util.client.zzf.zzf(context222) : "", Build.VERSION.SDK_INT, str2, str3, this.zzc.zza());
    }
}
