package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbit {
    private final java.lang.String zza = (java.lang.String) com.google.android.gms.internal.ads.zzbkk.zza.zze();
    private final java.util.Map zzb;
    private final android.content.Context zzc;
    private final java.lang.String zzd;

    public zzbit(android.content.Context context, java.lang.String str) {
        this.zzc = context;
        this.zzd = str;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "gmob_sdk");
        linkedHashMap.put("v", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put(com.ironsource.M6.F, android.os.Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", android.os.Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzt());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? "0" : "1");
        java.util.concurrent.Future zza = com.google.android.gms.ads.internal.zzt.zzp().zza(context);
        try {
            linkedHashMap.put("network_coarse", java.lang.Integer.toString(((com.google.android.gms.internal.ads.zzcbh) zza.get()).zzj));
            linkedHashMap.put("network_fine", java.lang.Integer.toString(((com.google.android.gms.internal.ads.zzcbh) zza.get()).zzk));
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmL)).booleanValue()) {
            java.util.Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzE(context) ? "1" : "0");
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkP)).booleanValue()) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdg)).booleanValue() || com.google.android.gms.internal.ads.zzgua.zzc(com.google.android.gms.ads.internal.zzt.zzh().zzu())) {
                return;
            }
            this.zzb.put(com.ironsource.M6.L, com.google.android.gms.ads.internal.zzt.zzh().zzu());
        }
    }

    final java.lang.String zza() {
        return this.zza;
    }

    final android.content.Context zzb() {
        return this.zzc;
    }

    final java.lang.String zzc() {
        return this.zzd;
    }

    final java.util.Map zzd() {
        return this.zzb;
    }
}
