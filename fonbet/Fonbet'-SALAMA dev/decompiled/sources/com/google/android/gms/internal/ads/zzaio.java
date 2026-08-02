package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaio {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final zzz zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final zzaip[] zzl;

    public zzaio(int i7, int i8, long j, long j3, long j7, long j8, zzz zzzVar, int i9, zzaip[] zzaipVarArr, int i10, long[] jArr, long[] jArr2) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = j;
        this.zzd = j3;
        this.zze = j7;
        this.zzf = j8;
        this.zzg = zzzVar;
        this.zzh = i9;
        this.zzl = zzaipVarArr;
        this.zzk = i10;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final zzaio zza(zzz zzzVar) {
        return new zzaio(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzzVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }

    public final zzaip zzb(int i7) {
        return this.zzl[i7];
    }
}
