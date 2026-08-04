package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzkp {
    public final zzuq zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;

    public zzkp(zzuq zzuqVar, long j, long j3, long j7, long j8, boolean z4, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11 = true;
        zzcv.zzd(!z10 || z8);
        if (z9 && !z8) {
            z11 = false;
        }
        zzcv.zzd(z11);
        this.zza = zzuqVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j7;
        this.zze = j8;
        this.zzf = false;
        this.zzg = false;
        this.zzh = z8;
        this.zzi = z9;
        this.zzj = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkp.class == obj.getClass()) {
            zzkp zzkpVar = (zzkp) obj;
            if (this.zzb == zzkpVar.zzb && this.zzc == zzkpVar.zzc && this.zzd == zzkpVar.zzd && this.zze == zzkpVar.zze && this.zzh == zzkpVar.zzh && this.zzi == zzkpVar.zzi && this.zzj == zzkpVar.zzj) {
                zzuq zzuqVar = this.zza;
                zzuq zzuqVar2 = zzkpVar.zza;
                int i7 = zzen.zza;
                if (Objects.equals(zzuqVar, zzuqVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j = this.zze;
        long j3 = this.zzd;
        return (((((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) j3)) * 31) + ((int) j)) * 29791) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0);
    }

    public final zzkp zza(long j) {
        return j == this.zzc ? this : new zzkp(this.zza, this.zzb, j, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }

    public final zzkp zzb(long j) {
        return j == this.zzb ? this : new zzkp(this.zza, j, this.zzc, this.zzd, this.zze, false, false, this.zzh, this.zzi, this.zzj);
    }
}
