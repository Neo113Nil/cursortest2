package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzuq {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzuq(Object obj, int i7, int i8, long j, int i9) {
        this.zza = obj;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = j;
        this.zze = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuq)) {
            return false;
        }
        zzuq zzuqVar = (zzuq) obj;
        return this.zza.equals(zzuqVar.zza) && this.zzb == zzuqVar.zzb && this.zzc == zzuqVar.zzc && this.zzd == zzuqVar.zzd && this.zze == zzuqVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzuq zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzuq(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzuq(Object obj, int i7, int i8, long j) {
        this(obj, i7, i8, j, -1);
    }

    public zzuq(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzuq(Object obj, long j, int i7) {
        this(obj, -1, -1, j, i7);
    }
}
