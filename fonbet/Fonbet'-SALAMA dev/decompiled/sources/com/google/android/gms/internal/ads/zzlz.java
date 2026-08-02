package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzlz {
    public final long zza;
    public final zzbn zzb;
    public final int zzc;
    public final zzuq zzd;
    public final long zze;
    public final zzbn zzf;
    public final int zzg;
    public final zzuq zzh;
    public final long zzi;
    public final long zzj;

    public zzlz(long j, zzbn zzbnVar, int i7, zzuq zzuqVar, long j3, zzbn zzbnVar2, int i8, zzuq zzuqVar2, long j7, long j8) {
        this.zza = j;
        this.zzb = zzbnVar;
        this.zzc = i7;
        this.zzd = zzuqVar;
        this.zze = j3;
        this.zzf = zzbnVar2;
        this.zzg = i8;
        this.zzh = zzuqVar2;
        this.zzi = j7;
        this.zzj = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlz.class == obj.getClass()) {
            zzlz zzlzVar = (zzlz) obj;
            if (this.zza == zzlzVar.zza && this.zzc == zzlzVar.zzc && this.zze == zzlzVar.zze && this.zzg == zzlzVar.zzg && this.zzi == zzlzVar.zzi && this.zzj == zzlzVar.zzj && zzfte.zza(this.zzb, zzlzVar.zzb) && zzfte.zza(this.zzd, zzlzVar.zzd) && zzfte.zza(this.zzf, zzlzVar.zzf) && zzfte.zza(this.zzh, zzlzVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
