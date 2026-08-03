package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdzg {
    private final java.util.concurrent.ConcurrentHashMap zza;
    private final com.google.android.gms.internal.ads.zzcfi zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final com.google.android.gms.internal.ads.zzbap zzf;
    private final com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager zzg;
    private final android.os.Bundle zzh = new android.os.Bundle();
    private final android.content.Context zzi;

    public zzdzg(android.content.Context context, com.google.android.gms.internal.ads.zzdzq zzdzqVar, com.google.android.gms.internal.ads.zzcfi zzcfiVar, com.google.android.gms.internal.ads.zzfky zzfkyVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzbap zzbapVar, com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager deviceTierManager) {
        android.app.ActivityManager.MemoryInfo zze;
        java.util.concurrent.ConcurrentHashMap zzd = zzdzqVar.zzd();
        this.zza = zzd;
        this.zzb = zzcfiVar;
        this.zzc = zzfkyVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzbapVar;
        this.zzg = deviceTierManager;
        this.zzi = context;
        zzd.put(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, str2.toUpperCase(java.util.Locale.ROOT));
        zzi();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue()) {
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            zzd("rt_f", java.lang.String.valueOf(runtime.freeMemory()));
            zzd("rt_m", java.lang.String.valueOf(runtime.maxMemory()));
            zzd("rt_t", java.lang.String.valueOf(runtime.totalMemory()));
            zzd("wv_c", java.lang.String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzl()));
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcW)).booleanValue() && (zze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", java.lang.String.valueOf(zze.availMem));
                zzd("mem_tt", java.lang.String.valueOf(zze.totalMem));
                zzd("low_m", true != zze.lowMemory ? "0" : "1");
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdd)).booleanValue()) {
            zzd(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, zzfkyVar.zzg);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcX)).booleanValue()) {
            zzd("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcY)).booleanValue()) {
            zzd("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhT)).booleanValue()) {
            int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzfkyVar) - 1;
            if (zzg == 0) {
                zzd.put("request_id", str);
                zzd.put("scar", "false");
                return;
            }
            if (zzg == 1) {
                zzd.put("request_id", str);
                zzd.put("se", "query_g");
            } else if (zzg == 2) {
                zzd.put("se", "r_adinfo");
            } else if (zzg != 3) {
                zzd.put("se", "r_both");
            } else {
                zzd.put("se", "r_adstring");
            }
            zzd.put("scar", "true");
            zzd("ragent", zzfkyVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzfkyVar.zzd)));
        }
    }

    public final void zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        com.google.android.gms.internal.ads.zzfkp zzfkpVar = zzfkqVar.zzb;
        java.util.List list = zzfkpVar.zza;
        if (!list.isEmpty()) {
            int i = ((com.google.android.gms.internal.ads.zzfkf) list.get(0)).zzb;
            zzd(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.internal.ads.zzfkf.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcP)).booleanValue()) {
            zzd("mwl", java.lang.Integer.toString(list.size()));
        }
        zzd("gqi", zzfkpVar.zzb.zzb);
    }

    public final void zzb(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", java.lang.Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", java.lang.Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final java.util.Map zzc() {
        return this.zza;
    }

    public final void zzd(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final synchronized android.os.Bundle zze() {
        return this.zzh;
    }

    public final synchronized void zzf(java.lang.String str, long j) {
        this.zzh.putLong(str, j);
    }

    public final synchronized void zzg(android.os.Bundle bundle) {
        this.zzh.putAll(bundle);
    }

    public final void zzh() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoM)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzi() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkV)).booleanValue()) {
            com.google.android.gms.internal.ads.zzbak zzb = this.zzf.zzb();
            if (zzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzb).zzc());
            } else if (zzb instanceof com.google.android.gms.internal.ads.zzcni) {
                this.zza.put("asv", ((com.google.android.gms.internal.ads.zzcni) zzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}
