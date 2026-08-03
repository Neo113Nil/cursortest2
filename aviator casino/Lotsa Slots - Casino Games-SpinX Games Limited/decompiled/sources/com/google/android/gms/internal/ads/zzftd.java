package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzftd {
    private final com.google.android.gms.internal.ads.zzdzl zza;

    zzftd(com.google.android.gms.internal.ads.zzdzl zzdzlVar, android.content.Context context) {
        this.zza = zzdzlVar;
    }

    private final void zzv(java.lang.String str, long j, java.lang.String str2, java.lang.String str3, com.google.android.gms.ads.AdFormat adFormat, int i, int i2, int i3, java.lang.String str4) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", java.lang.Long.toString(j));
        zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(java.util.Locale.ENGLISH));
        zza.zzc("max_ads", java.lang.Integer.toString(i));
        zza.zzc("cache_size", java.lang.Integer.toString(i2));
        zza.zzc("pas", java.lang.Integer.toString(i3));
        zza.zzc("pv", "2");
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, str3);
        zza.zzc("pid", str2);
        zza.zzd();
    }

    private final void zzw(java.lang.String str, java.lang.String str2, long j, int i, int i2, java.lang.String str3, com.google.android.gms.internal.ads.zzftk zzftkVar, java.lang.String str4) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc(str2, java.lang.Long.toString(j));
        if (zzftkVar != null) {
            zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, zzftkVar.zza());
            zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, zzftkVar.zzb());
            zza.zzc("pid", zzftkVar.zzc());
        }
        zza.zzc("action", str);
        if (str3 != null) {
            zza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zza.zzc("max_ads", java.lang.Integer.toString(i));
        }
        if (i2 >= 0) {
            zza.zzc("cache_size", java.lang.Integer.toString(i2));
        }
        zza.zzc("pv", str4);
        zza.zzd();
    }

    private final void zzx(java.lang.String str, long j, java.lang.String str2, java.lang.String str3, com.google.android.gms.ads.AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", java.lang.Long.toString(j));
        zza.zzc("pid", str2);
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, str3);
        zza.zzc("max_ads", java.lang.Integer.toString(i));
        zza.zzc("cache_size", java.lang.Integer.toString(i2));
        zza.zzc("tpcnt", java.lang.Integer.toString(i4));
        zza.zzc("mpl", java.lang.Integer.toString(i5));
        if (adFormat != null) {
            zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(java.util.Locale.ENGLISH));
        }
        if (i3 > 0) {
            zza.zzc("nptr", java.lang.Integer.toString(i3));
        }
        zza.zzd();
    }

    public final void zza(int i, long j, com.google.android.gms.internal.ads.zzftk zzftkVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", java.lang.Long.toString(j));
        zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, zzftkVar.zzb());
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, zzftkVar.zza());
        zza.zzc("pid", zzftkVar.zzc());
        zza.zzc("max_ads", java.lang.Integer.toString(i));
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzb(java.util.Map map, long j, java.lang.String str) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", java.lang.Long.toString(j));
        zza.zzc("pv", "1");
        for (com.google.android.gms.ads.AdFormat adFormat : map.keySet()) {
            java.lang.String lowerCase = adFormat.name().toLowerCase(java.util.Locale.ENGLISH);
            java.lang.String.valueOf(lowerCase);
            java.lang.String valueOf = java.lang.String.valueOf(lowerCase);
            zza.zzc(valueOf.concat("_count"), java.lang.Integer.toString(((java.lang.Integer) map.get(adFormat)).intValue()));
        }
        zza.zzd();
    }

    public final void zzc(int i, int i2, long j, com.google.android.gms.internal.ads.zzftk zzftkVar) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "cache_resize");
        zza.zzc("cs_ts", java.lang.Long.toString(j));
        zza.zzc("orig_ma", java.lang.Integer.toString(i));
        zza.zzc("max_ads", java.lang.Integer.toString(i2));
        zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, zzftkVar.zzb());
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, zzftkVar.zza());
        zza.zzc("pid", zzftkVar.zzc());
        zza.zzc("pv", "1");
        zza.zzd();
    }

    public final void zzd(int i, int i2, long j, java.lang.Long l, java.lang.String str, com.google.android.gms.internal.ads.zzftk zzftkVar, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("plaac_ts", java.lang.Long.toString(j));
        zza.zzc("max_ads", java.lang.Integer.toString(i));
        zza.zzc("cache_size", java.lang.Integer.toString(i2));
        zza.zzc("action", "is_ad_available");
        if (zzftkVar != null) {
            zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, zzftkVar.zza());
            zza.zzc("pid", zzftkVar.zzc());
            zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, zzftkVar.zzb());
        }
        if (l != null) {
            zza.zzc("plaay_ts", java.lang.Long.toString(l.longValue()));
        }
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zze(long j, java.lang.String str) {
        zzw("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, com.google.android.gms.internal.ads.zzftk zzftkVar, int i, int i2, java.lang.String str) {
        zzw("poll_ad", "ppac_ts", j, i, i2, null, zzftkVar, str);
    }

    public final void zzg(long j, int i, int i2, java.lang.String str, com.google.android.gms.internal.ads.zzftk zzftkVar, java.lang.String str2) {
        zzw("poll_ad", "psvroc_ts", j, i, i2, str, zzftkVar, str2);
    }

    public final void zzh(long j, int i, int i2, java.lang.String str, com.google.android.gms.internal.ads.zzftk zzftkVar, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("ppla_ts", java.lang.Long.toString(j));
        zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, zzftkVar.zzb());
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, zzftkVar.zza());
        zza.zzc("pid", zzftkVar.zzc());
        zza.zzc("max_ads", java.lang.Integer.toString(i));
        zza.zzc("cache_size", java.lang.Integer.toString(i2));
        zza.zzc("action", "poll_ad");
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zzi(long j, java.lang.String str, com.google.android.gms.internal.ads.zzftk zzftkVar, int i, int i2, java.lang.String str2) {
        zzw("paa", "pano_ts", j, i, i2, str, zzftkVar, str2);
    }

    public final void zzj(long j, com.google.android.gms.internal.ads.zzftk zzftkVar, int i, java.lang.String str) {
        zzw("pae", "paeo_ts", j, i, 0, null, zzftkVar, str);
    }

    public final void zzk(long j, com.google.android.gms.internal.ads.zzftk zzftkVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, java.lang.String str) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "pftla");
        zza.zzc("pftlat_ts", java.lang.Long.toString(j));
        zza.zzc("pftlaec", java.lang.Integer.toString(zzeVar.zza));
        zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, zzftkVar.zzb());
        zza.zzc("max_ads", java.lang.Integer.toString(i));
        zza.zzc("cache_size", java.lang.Integer.toString(i2));
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, zzftkVar.zza());
        zza.zzc("pid", zzftkVar.zzc());
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzl(long j, com.google.android.gms.ads.AdFormat adFormat, int i) {
        zzv("pda", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzm(long j, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdFormat adFormat, int i, int i2) {
        zzv("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzn(com.google.android.gms.ads.AdFormat adFormat, long j, int i) {
        zzv("pgcs", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzo(long j, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdFormat adFormat, int i, int i2) {
        zzv("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdFormat adFormat, int i2) {
        zzv("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }

    public final void zzq(long j, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdFormat adFormat, int i, int i2, int i3, int i4) {
        zzx("acmpa", j, str, str2, adFormat, i, i2, 0, i3, i4);
    }

    public final void zzr(long j, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzx("acmpr", j, str, str2, adFormat, i, i2, i3, i4, i5);
    }

    public final void zzs(long j, int i, int i2) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "acmlr");
        zza.zzc("pat", java.lang.Long.toString(j));
        zza.zzc("mpl", java.lang.Integer.toString(i));
        zza.zzc("pas", java.lang.Integer.toString(i2));
        zza.zzd();
    }

    public final void zzt(long j, com.google.android.gms.ads.AdFormat adFormat, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "poact");
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, str2);
        zza.zzc("pid", str);
        zza.zzc("poact_ts", java.lang.Long.toString(j));
        if (adFormat != null) {
            zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(java.util.Locale.ENGLISH));
        }
        zza.zzd();
    }

    public final void zzu(long j, com.google.android.gms.ads.AdFormat adFormat, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
        zza.zzc("action", "poac");
        zza.zzc(com.google.ads.mediation.moloco.MolocoMediationAdapter.KEY_AD_UNIT_ID, str2);
        zza.zzc("pid", str);
        if (adFormat != null) {
            zza.zzc(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, adFormat.name().toLowerCase(java.util.Locale.ENGLISH));
        }
        zza.zzd();
    }
}
