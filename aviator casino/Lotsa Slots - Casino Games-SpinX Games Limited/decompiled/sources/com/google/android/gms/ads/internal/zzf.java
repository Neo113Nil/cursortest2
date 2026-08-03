package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzf {
    private android.content.Context zza;
    private long zzb = 0;

    static final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzd(java.lang.Long l, com.google.android.gms.internal.ads.zzdzl zzdzlVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar, com.google.android.gms.internal.ads.zzfqj zzfqjVar, org.json.JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            com.google.android.gms.ads.internal.zzt.zzh().zzo().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdzlVar, "cld_s", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        java.lang.String optString = jSONObject.optString("errorReason", "");
        if (!android.text.TextUtils.isEmpty(optString)) {
            zzfpwVar.zzk(optString);
        }
        zzfpwVar.zzd(optBoolean);
        zzfqjVar.zzb(zzfpwVar.zzm());
        return com.google.android.gms.internal.ads.zzhbw.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(com.google.android.gms.internal.ads.zzdzl zzdzlVar, java.lang.String str, long j) {
        if (zzdzlVar != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzof)).booleanValue()) {
                com.google.android.gms.internal.ads.zzdzk zza = zzdzlVar.zza();
                zza.zzc("action", "lat_init");
                zza.zzc(str, java.lang.Long.toString(j));
                zza.zzd();
            }
        }
    }

    public final void zza(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, java.lang.Runnable runnable, com.google.android.gms.internal.ads.zzfqj zzfqjVar, com.google.android.gms.internal.ads.zzdzl zzdzlVar, java.lang.Long l, boolean z) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfqjVar, zzdzlVar, l, z);
    }

    public final void zzb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.lang.String str, com.google.android.gms.internal.ads.zzcey zzceyVar, com.google.android.gms.internal.ads.zzfqj zzfqjVar, boolean z) {
        zzc(context, versionInfoParcel, false, zzceyVar, zzceyVar != null ? zzceyVar.zze() : null, str, null, zzfqjVar, null, null, z);
    }

    final void zzc(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, boolean z, com.google.android.gms.internal.ads.zzcey zzceyVar, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable, final com.google.android.gms.internal.ads.zzfqj zzfqjVar, final com.google.android.gms.internal.ads.zzdzl zzdzlVar, final java.lang.Long l, boolean z2) {
        android.content.pm.PackageInfo packageInfo;
        if (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzb < 5000) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzceyVar != null && !android.text.TextUtils.isEmpty(zzceyVar.zzd())) {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - zzceyVar.zzb() <= ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfb)).longValue() && zzceyVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final com.google.android.gms.internal.ads.zzfpw zzn = com.google.android.gms.internal.ads.zzfpw.CC.zzn(context, 4);
        zzn.zza();
        com.google.android.gms.internal.ads.zzbui zzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(this.zza, versionInfoParcel, zzfqjVar);
        com.google.android.gms.internal.ads.zzbuc zzbucVar = com.google.android.gms.internal.ads.zzbuf.zza;
        com.google.android.gms.internal.ads.zzbty zza = zzb.zza("google.afma.config.fetchAppSettings", zzbucVar, zzbucVar);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!android.text.TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!android.text.TextUtils.isEmpty(str2)) {
                jSONObject.put(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zza;
            jSONObject.put("experiment_ids", android.text.TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zzb().zze()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkU)).booleanValue()) {
                jSONObject.put("inspector_enabled", z2);
            }
            try {
                android.content.pm.ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            com.google.common.util.concurrent.ListenableFuture zzb2 = zza.zzb(jSONObject);
            com.google.android.gms.internal.ads.zzhbe zzhbeVar = new com.google.android.gms.internal.ads.zzhbe(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzhbe
                public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.ads.internal.zzf.zzd(l, zzdzlVar, zzn, zzfqjVar, (org.json.JSONObject) obj);
                }
            };
            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zzh;
            com.google.common.util.concurrent.ListenableFuture zzj = com.google.android.gms.internal.ads.zzhbw.zzj(zzb2, zzhbeVar, zzhcgVar);
            if (runnable != null) {
                zzb2.addListener(runnable, zzhcgVar);
            }
            if (l != null) {
                zzb2.addListener(new java.lang.Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.internal.zzf.zzf(zzdzlVar, "cld_r", com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - l.longValue());
                    }
                }, zzhcgVar);
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziG)).booleanValue()) {
                com.google.android.gms.internal.ads.zzcfu.zzb(zzj, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                com.google.android.gms.internal.ads.zzcfu.zza(zzj, "ConfigLoader.maybeFetchNewAppSettings", zzhcgVar);
            }
        } catch (java.lang.Exception e) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", e);
            zzn.zzj(e);
            zzn.zzd(false);
            zzfqjVar.zzb(zzn.zzm());
        }
    }
}
