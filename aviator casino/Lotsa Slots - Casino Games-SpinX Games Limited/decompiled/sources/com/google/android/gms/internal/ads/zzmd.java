package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzmd {
    public final com.google.android.gms.internal.ads.zzxk zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;

    zzmd(com.google.android.gms.internal.ads.zzxk zzxkVar, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        com.google.android.gms.internal.ads.zzgtj.zza(!z5 || z3);
        if (z4 && !z3) {
            z6 = false;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z6);
        this.zza = zzxkVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = j5;
        this.zzg = false;
        this.zzh = false;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzmd zzmdVar = (com.google.android.gms.internal.ads.zzmd) obj;
            if (this.zzb == zzmdVar.zzb && this.zzd == zzmdVar.zzd && this.zze == zzmdVar.zze && this.zzf == zzmdVar.zzf && this.zzi == zzmdVar.zzi && this.zzj == zzmdVar.zzj && this.zzk == zzmdVar.zzk && java.util.Objects.equals(this.zza, zzmdVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        long j = this.zzf;
        long j2 = this.zze;
        return (((((((((((((hashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j2)) * 31) + ((int) j)) * 29791) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
    }

    public final com.google.android.gms.internal.ads.zzmd zza(long j, long j2) {
        return (j == this.zzb && j2 == this.zzc) ? this : new com.google.android.gms.internal.ads.zzmd(this.zza, j, j2, this.zzd, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }

    public final com.google.android.gms.internal.ads.zzmd zzb(long j) {
        return j == this.zzd ? this : new com.google.android.gms.internal.ads.zzmd(this.zza, this.zzb, this.zzc, j, this.zze, this.zzf, false, false, this.zzi, this.zzj, this.zzk);
    }
}
