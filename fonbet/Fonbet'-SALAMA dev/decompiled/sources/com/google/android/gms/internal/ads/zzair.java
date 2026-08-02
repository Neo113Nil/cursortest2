package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzair {
    public final zzaio zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzair(zzaio zzaioVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        zzcv.zzd(length == length2);
        int length3 = jArr.length;
        zzcv.zzd(length3 == length2);
        int length4 = iArr2.length;
        zzcv.zzd(length4 == length2);
        this.zza = zzaioVar;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i7;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i8 = length4 - 1;
            iArr2[i8] = iArr2[i8] | 536870912;
        }
    }

    public final int zza(long j) {
        for (int zzd = zzen.zzd(this.zzf, j, true, false); zzd >= 0; zzd--) {
            if ((this.zzg[zzd] & 1) != 0) {
                return zzd;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int zza = zzen.zza(this.zzf, j, true, false); zza < this.zzf.length; zza++) {
            if ((this.zzg[zza] & 1) != 0) {
                return zza;
            }
        }
        return -1;
    }
}
