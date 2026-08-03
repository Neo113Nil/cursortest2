package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzami {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final com.google.android.gms.internal.ads.zzv zzg;
    public final int zzh;
    public final long[] zzi;
    public final long[] zzj;
    public final int zzk;
    private final com.google.android.gms.internal.ads.zzamj[] zzl;

    public zzami(int i, int i2, long j, long j2, long j3, long j4, com.google.android.gms.internal.ads.zzv zzvVar, int i3, com.google.android.gms.internal.ads.zzamj[] zzamjVarArr, int i4, long[] jArr, long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = zzvVar;
        this.zzh = i3;
        this.zzl = zzamjVarArr;
        this.zzk = i4;
        this.zzi = jArr;
        this.zzj = jArr2;
    }

    public final com.google.android.gms.internal.ads.zzamj zza(int i) {
        return this.zzl[i];
    }

    public final com.google.android.gms.internal.ads.zzami zzb(com.google.android.gms.internal.ads.zzv zzvVar) {
        return new com.google.android.gms.internal.ads.zzami(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, zzvVar, this.zzh, this.zzl, this.zzk, this.zzi, this.zzj);
    }
}
