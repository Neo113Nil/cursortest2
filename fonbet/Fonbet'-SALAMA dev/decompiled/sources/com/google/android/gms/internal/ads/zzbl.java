package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class zzbl {
    public Object zza;
    public Object zzb;
    public int zzc;
    public long zzd;
    public long zze;
    public boolean zzf;
    public zzb zzg = zzb.zza;

    static {
        int i7 = zzen.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbl.class.equals(obj.getClass())) {
            zzbl zzblVar = (zzbl) obj;
            Object obj2 = this.zza;
            Object obj3 = zzblVar.zza;
            int i7 = zzen.zza;
            if (Objects.equals(obj2, obj3) && Objects.equals(this.zzb, zzblVar.zzb) && this.zzc == zzblVar.zzc && this.zzd == zzblVar.zzd && this.zzf == zzblVar.zzf && Objects.equals(this.zzg, zzblVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzb;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzc;
        long j = this.zzd;
        return this.zzg.hashCode() + (((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzf ? 1 : 0)) * 31);
    }

    public final int zza(int i7) {
        return this.zzg.zza(i7).zzb;
    }

    public final int zzb() {
        int i7 = this.zzg.zzb;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        this.zzg.zzb(-1);
        return -1;
    }

    public final int zze(int i7) {
        return this.zzg.zza(i7).zza(-1);
    }

    public final long zzf(int i7, int i8) {
        zza zza = this.zzg.zza(i7);
        if (zza.zzb != -1) {
            return zza.zzf[i8];
        }
        return -9223372036854775807L;
    }

    public final long zzg(int i7) {
        long j = this.zzg.zza(i7).zza;
        return 0L;
    }

    public final long zzh() {
        long j = this.zzg.zzc;
        return 0L;
    }

    public final zzbl zzi(Object obj, Object obj2, int i7, long j, long j3, zzb zzbVar, boolean z4) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = i7;
        this.zzd = j;
        this.zze = 0L;
        this.zzg = zzbVar;
        this.zzf = z4;
        return this;
    }

    public final boolean zzj(int i7) {
        zzb();
        if (i7 != -1) {
            return false;
        }
        this.zzg.zzb(-1);
        return false;
    }

    public final boolean zzk(int i7) {
        boolean z4 = this.zzg.zza(i7).zzi;
        return false;
    }
}
