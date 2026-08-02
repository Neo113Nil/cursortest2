package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
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
        int zzg = zzedVar.zzg();
        int zzp = (zzg & 1) != 0 ? zzedVar.zzp() : -1;
        long zzu = (zzg & 2) != 0 ? zzedVar.zzu() : -1L;
        if ((zzg & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i9 = 0; i9 < 100; i9++) {
                jArr2[i9] = zzedVar.zzm();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((zzg & 8) != 0) {
            zzedVar.zzM(4);
        }
        if (zzedVar.zzb() >= 24) {
            zzedVar.zzM(21);
            int zzo = zzedVar.zzo();
            i8 = zzo & 4095;
            i7 = zzo >> 12;
        } else {
            i7 = -1;
            i8 = -1;
        }
        return new zzahi(zzadnVar, zzp, zzu, jArr, i7, i8);
    }

    public final long zza() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        return zzen.zzt((j * r4.zzg) - 1, this.zza.zzd);
    }
}
