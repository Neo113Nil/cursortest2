package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzamw {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzek zza = new zzek(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzed zzb = new zzed();

    public static long zzc(zzed zzedVar) {
        int iZzd = zzedVar.zzd();
        if (zzedVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzedVar.zzH(bArr, 0, 9);
        zzedVar.zzL(iZzd);
        byte b7 = bArr[0];
        if ((b7 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b8 = bArr[2];
        if ((b8 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b9 = bArr[4];
        if ((b9 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b7;
        long j3 = b8;
        long j7 = (248 & j3) >> 3;
        long j8 = (j3 & 3) << 13;
        return j8 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j7 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b9) & 248) >> 3);
    }

    private final int zzf(zzacw zzacwVar) {
        byte[] bArr = zzen.zzc;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacwVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public final int zza(zzacw zzacwVar, zzadr zzadrVar) {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzacwVar.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j3 = jZzd - ((long) iMin);
            if (zzacwVar.zzf() != j3) {
                zzadrVar.zza = j3;
                return 1;
            }
            this.zzb.zzI(iMin);
            zzacwVar.zzj();
            zzacwVar.zzh(this.zzb.zzN(), 0, iMin);
            zzed zzedVar = this.zzb;
            int iZzd = zzedVar.zzd();
            for (int iZze = zzedVar.zze() - 4; iZze >= iZzd; iZze--) {
                if (zzg(zzedVar.zzN(), iZze) == 442) {
                    zzedVar.zzL(iZze + 4);
                    long jZzc = zzc(zzedVar);
                    if (jZzc != -9223372036854775807L) {
                        j = jZzc;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzacwVar);
                return 0;
            }
            if (this.zzd) {
                long j7 = this.zzf;
                if (j7 == -9223372036854775807L) {
                    zzf(zzacwVar);
                    return 0;
                }
                zzek zzekVar = this.zza;
                this.zzh = zzekVar.zzc(this.zzg) - zzekVar.zzb(j7);
                zzf(zzacwVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, zzacwVar.zzd());
            if (zzacwVar.zzf() != 0) {
                zzadrVar.zza = 0L;
                return 1;
            }
            this.zzb.zzI(iMin2);
            zzacwVar.zzj();
            zzacwVar.zzh(this.zzb.zzN(), 0, iMin2);
            zzed zzedVar2 = this.zzb;
            int iZze2 = zzedVar2.zze();
            for (int iZzd2 = zzedVar2.zzd(); iZzd2 < iZze2 - 3; iZzd2++) {
                if (zzg(zzedVar2.zzN(), iZzd2) == 442) {
                    zzedVar2.zzL(iZzd2 + 4);
                    long jZzc2 = zzc(zzedVar2);
                    if (jZzc2 != -9223372036854775807L) {
                        j = jZzc2;
                        break;
                    }
                }
            }
            this.zzf = j;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzek zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
