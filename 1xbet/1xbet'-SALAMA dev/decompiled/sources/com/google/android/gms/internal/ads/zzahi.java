package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzahi {
    public final zzadn zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzahi(zzadn zzadnVar, long j, long j3, long[] jArr, int i7, int i8) {
        this.zza = new zzadn(zzadnVar);
        this.zzb = j;
        this.zzc = j3;
        this.zzf = jArr;
        this.zzd = i7;
        this.zze = i8;
    }

    public static zzahi zzb(zzadn zzadnVar, zzed zzedVar) {
        long[] jArr;
        int i7;
        int i8;
        int iZzg = zzedVar.zzg();
        int iZzp = (iZzg & 1) != 0 ? zzedVar.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? zzedVar.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i9 = 0; i9 < 100; i9++) {
                jArr2[i9] = zzedVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzg & 8) != 0) {
            zzedVar.zzM(4);
        }
        if (zzedVar.zzb() >= 24) {
            zzedVar.zzM(21);
            int iZzo = zzedVar.zzo();
            i8 = iZzo & 4095;
            i7 = iZzo >> 12;
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new zzahi(zzadnVar, iZzp, jZzu, jArr, i7, i8);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzadn zzadnVar = this.zza;
        return zzen.zzt((j * ((long) zzadnVar.zzg)) - 1, zzadnVar.zzd);
    }
}
