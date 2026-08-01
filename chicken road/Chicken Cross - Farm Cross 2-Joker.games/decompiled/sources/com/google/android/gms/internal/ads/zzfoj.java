package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfoj {
    private final long zza;
    private long zzc;
    private final zzfoi zzb = new zzfoi();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfoj() {
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

    public final zzfoi zzg() {
        zzfoi zzfoiVar = this.zzb;
        zzfoi clone = zzfoiVar.clone();
        zzfoiVar.zza = false;
        zzfoiVar.zzb = 0;
        return clone;
    }

    public final String zzh() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }
}
