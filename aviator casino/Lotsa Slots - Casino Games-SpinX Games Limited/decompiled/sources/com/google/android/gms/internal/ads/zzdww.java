package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdww {
    private final com.google.android.gms.internal.ads.zzdzl zza;

    zzdww(com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        this.zza = zzdzlVar;
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzgat zzgatVar) {
        if (zzgatVar.zzj()) {
            com.google.android.gms.internal.ads.zzdzk zza = this.zza.zza();
            zza.zzc("action", "aq_ad_closed");
            zza.zzc("gqi", zzgatVar.zza());
            zza.zzc("aq_ad_duration", java.lang.String.valueOf(zzgatVar.zzb()));
            zza.zzc("aq_ad_bounce_cnt", java.lang.String.valueOf(zzgatVar.zzc()));
            zza.zzc("aq_time_away", java.lang.String.valueOf(zzgatVar.zzg()));
            boolean equals = zza.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
            java.lang.Boolean.valueOf(equals).getClass();
            return equals;
        }
        com.google.android.gms.internal.ads.zzdzk zza2 = this.zza.zza();
        zza2.zzc("action", "aq_ad_kill");
        zza2.zzc("gqi", zzgatVar.zza());
        zza2.zzc("aq_ad_duration", java.lang.String.valueOf(zzgatVar.zzb()));
        zza2.zzc("aq_ad_bounce_cnt", java.lang.String.valueOf(zzgatVar.zzc()));
        zza2.zzc("aq_time_away", java.lang.String.valueOf(zzgatVar.zzg()));
        zza2.zzc("aq_is_os_kill", java.lang.String.valueOf(zzgatVar.zze()));
        boolean equals2 = zza2.zze().equals(com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        java.lang.Boolean.valueOf(equals2).getClass();
        return equals2;
    }
}
