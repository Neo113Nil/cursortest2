package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfnl {
    private final long zza;
    private long zzc;
    private final com.google.android.gms.internal.ads.zzfnk zzb = new com.google.android.gms.internal.ads.zzfnk();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfnl() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final void zza() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzd++;
    }

    public final void zzb() {
        this.zze++;
        this.zzb.zza = true;
    }

    public final void zzc() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final long zzd() {
        return this.zza;
    }

    public final long zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzfnk zzg() {
        com.google.android.gms.internal.ads.zzfnk zzfnkVar = this.zzb;
        com.google.android.gms.internal.ads.zzfnk clone = zzfnkVar.clone();
        zzfnkVar.zza = false;
        zzfnkVar.zzb = 0;
        return clone;
    }

    public final java.lang.String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
