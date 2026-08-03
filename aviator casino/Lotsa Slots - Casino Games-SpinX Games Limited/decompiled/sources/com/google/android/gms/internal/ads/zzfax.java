package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfax implements com.google.android.gms.internal.ads.zzfck {
    private final android.content.pm.ApplicationInfo zza;
    private final android.content.pm.PackageInfo zzb;
    private final android.content.Context zzc;

    zzfax(android.content.pm.ApplicationInfo applicationInfo, android.content.pm.PackageInfo packageInfo, android.content.Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.content.pm.PackageManager.NameNotFoundException e;
        java.lang.String str4;
        android.content.pm.InstallSourceInfo installSourceInfo;
        java.lang.String str5 = this.zza.packageName;
        android.content.pm.PackageInfo packageInfo = this.zzb;
        java.lang.Integer valueOf = packageInfo == null ? null : java.lang.Integer.valueOf(packageInfo.versionCode);
        java.lang.String str6 = packageInfo == null ? null : packageInfo.versionName;
        try {
            android.content.Context context = this.zzc;
            com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
            str = java.lang.String.valueOf(com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(str5));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            str = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzol)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str5);
                } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                    str2 = null;
                    e = e2;
                    str4 = null;
                }
                if (installSourceInfo != null) {
                    str2 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (android.text.TextUtils.isEmpty(str2)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str2 = null;
                        }
                        str4 = installSourceInfo.getInitiatingPackageName();
                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str4 = null;
                    }
                    try {
                    } catch (android.content.pm.PackageManager.NameNotFoundException e4) {
                        e = e4;
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PackageInfoSignalSource.getInstallSourceInfo");
                        str3 = str4;
                        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfay(str5, valueOf, str6, str, str2, str3));
                    }
                    if (android.text.TextUtils.isEmpty(str4)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        str3 = null;
                        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfay(str5, valueOf, str6, str, str2, str3));
                    }
                    str3 = str4;
                    return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfay(str5, valueOf, str6, str, str2, str3));
                }
            }
        }
        str2 = null;
        str3 = null;
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfay(str5, valueOf, str6, str, str2, str3));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 29;
    }
}
