package com.google.android.gms.ads.nonagon.util.logging.csi;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class CsiParamDefaults {
    private final android.content.Context zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final android.content.pm.PackageInfo zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager zzf;

    public CsiParamDefaults(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.pm.PackageInfo packageInfo, java.lang.String str, com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager deviceTierManager) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
        this.zzd = packageInfo;
        this.zze = str;
        this.zzf = deviceTierManager;
    }

    public void set(java.util.Map<java.lang.String, java.lang.String> map) {
        android.content.pm.PackageInfo packageInfo;
        map.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "gmob_sdk");
        map.put("v", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        map.put(com.ironsource.M6.F, android.os.Build.VERSION.RELEASE);
        map.put("api_v", android.os.Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        map.put("device", com.google.android.gms.ads.internal.util.zzs.zzt());
        map.put("app", this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.Context context = this.zza;
        map.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? "0" : "1");
        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zza;
        java.util.List zzf = com.google.android.gms.ads.internal.client.zzba.zzb().zzf();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhP)).booleanValue()) {
            zzf.addAll(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzh());
        }
        map.put("e", android.text.TextUtils.join(",", zzf));
        map.put("sdkVersion", this.zzc);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmL)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzE(context) ? "1" : "0");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkP)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdg)).booleanValue()) {
                map.put(com.ironsource.M6.L, com.google.android.gms.internal.ads.zzgua.zza(com.google.android.gms.ads.internal.zzt.zzh().zzu()));
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmT)).booleanValue()) {
            map.put("uev", com.google.android.gms.internal.ads.zzgua.zza(this.zze));
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcZ)).booleanValue()) {
            map.put("mem_tier", this.zzf.getAdvertisedMemoryTier().name());
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzda)).booleanValue()) {
            map.put("proc_tier", this.zzf.getAvailableProcessorTier().name());
        }
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdb)).booleanValue() || (packageInfo = this.zzd) == null) {
            return;
        }
        map.put("vc", java.lang.String.valueOf(packageInfo.versionCode));
        map.put("vn", java.lang.String.valueOf(packageInfo.versionName));
    }
}
