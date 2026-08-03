package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgje {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgqh zzb;
    private final com.google.android.gms.internal.ads.zzgha zzc;
    private final java.lang.String zzd;

    zzgje(android.content.Context context, com.google.android.gms.internal.ads.zzgqh zzgqhVar, com.google.android.gms.internal.ads.zzgha zzghaVar, com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        this.zza = context;
        this.zzb = zzgqhVar;
        this.zzc = zzghaVar;
        this.zzd = zzgdfVar.zzd();
    }

    public final java.lang.String zza(boolean z, long j) {
        try {
            this.zzb.zza(55).zza();
            com.google.android.gms.internal.ads.zzayx zza = com.google.android.gms.internal.ads.zzayy.zza();
            zza.zzb(this.zzd);
            zza.zza("0.878096153");
            zza.zzd(this.zza.getPackageName());
            zza.zzc(java.lang.System.currentTimeMillis() / 1000);
            zza.zzf((java.lang.System.currentTimeMillis() - j) / 1000);
            try {
                zza.zze(r0.getPackageManager().getPackageInfo(r0.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                zza.zze(-1L);
            }
            com.google.android.gms.internal.ads.zzgha zzghaVar = this.zzc;
            if (!zzghaVar.zzc()) {
                zzghaVar.zza();
            }
            com.google.android.gms.internal.ads.zzaze zzf = zzghaVar.zzf(((com.google.android.gms.internal.ads.zzayy) zza.zzbu()).zzaN(), null);
            zzf.zzc(5);
            zzf.zzd(2);
            return com.google.android.gms.internal.ads.zzgea.zza(((com.google.android.gms.internal.ads.zzazf) zzf.zzbu()).zzaN(), true);
        } finally {
        }
    }
}
