package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaqp {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final com.google.android.gms.internal.ads.zzfi zza = new com.google.android.gms.internal.ads.zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet();

    zzaqp() {
    }

    public static long zze(com.google.android.gms.internal.ads.zzet zzetVar) {
        int zzg = zzetVar.zzg();
        if (zzetVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzetVar.zzm(bArr, 0, 9);
        zzetVar.zzh(zzg);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    private final int zzf(com.google.android.gms.internal.ads.zzafz zzafzVar) {
        byte[] bArr = com.google.android.gms.internal.ads.zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafzVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzfi zzb() {
        return this.zza;
    }

    public final int zzc(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar) throws java.io.IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzafzVar.zzo();
            int min = (int) java.lang.Math.min(20000L, zzo);
            long j2 = zzo - min;
            if (zzafzVar.zzn() != j2) {
                zzagyVar.zza = j2;
                return 1;
            }
            com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
            zzetVar.zza(min);
            zzafzVar.zzl();
            zzafzVar.zzi(zzetVar.zzi(), 0, min);
            int zzg = zzetVar.zzg();
            int zze = zzetVar.zze() - 4;
            while (true) {
                if (zze < zzg) {
                    break;
                }
                if (zzg(zzetVar.zzi(), zze) == 442) {
                    zzetVar.zzh(zze + 4);
                    long zze2 = zze(zzetVar);
                    if (zze2 != -9223372036854775807L) {
                        j = zze2;
                        break;
                    }
                }
                zze--;
            }
            this.zzg = j;
            this.zze = true;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zzf(zzafzVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zzf(zzafzVar);
                    return 0;
                }
                com.google.android.gms.internal.ads.zzfi zzfiVar = this.zza;
                this.zzh = zzfiVar.zzf(this.zzg) - zzfiVar.zze(j3);
                zzf(zzafzVar);
                return 0;
            }
            int min2 = (int) java.lang.Math.min(20000L, zzafzVar.zzo());
            if (zzafzVar.zzn() != 0) {
                zzagyVar.zza = 0L;
                return 1;
            }
            com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
            zzetVar2.zza(min2);
            zzafzVar.zzl();
            zzafzVar.zzi(zzetVar2.zzi(), 0, min2);
            int zzg2 = zzetVar2.zzg();
            int zze3 = zzetVar2.zze();
            while (true) {
                if (zzg2 >= zze3 - 3) {
                    break;
                }
                if (zzg(zzetVar2.zzi(), zzg2) == 442) {
                    zzetVar2.zzh(zzg2 + 4);
                    long zze4 = zze(zzetVar2);
                    if (zze4 != -9223372036854775807L) {
                        j = zze4;
                        break;
                    }
                }
                zzg2++;
            }
            this.zzf = j;
            this.zzd = true;
        }
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
