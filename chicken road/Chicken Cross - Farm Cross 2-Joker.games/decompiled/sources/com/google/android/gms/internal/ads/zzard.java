package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzard {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    zzard() {
    }

    public static long zze(zzeu zzeuVar) {
        int zzg = zzeuVar.zzg();
        if (zzeuVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzeuVar.zzm(bArr, 0, 9);
        zzeuVar.zzh(zzg);
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

    private final int zzf(zzagi zzagiVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagiVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfj zzb() {
        return this.zza;
    }

    public final int zzc(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzagiVar.zzo();
            int min = (int) Math.min(20000L, zzo);
            long j2 = zzo - min;
            if (zzagiVar.zzn() != j2) {
                zzahhVar.zza = j2;
                return 1;
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zza(min);
            zzagiVar.zzl();
            zzagiVar.zzi(zzeuVar.zzi(), 0, min);
            int zzg = zzeuVar.zzg();
            int zze = zzeuVar.zze() - 4;
            while (true) {
                if (zze < zzg) {
                    break;
                }
                if (zzg(zzeuVar.zzi(), zze) == 442) {
                    zzeuVar.zzh(zze + 4);
                    long zze2 = zze(zzeuVar);
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
                zzf(zzagiVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zzf(zzagiVar);
                    return 0;
                }
                zzfj zzfjVar = this.zza;
                this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j3);
                zzf(zzagiVar);
                return 0;
            }
            int min2 = (int) Math.min(20000L, zzagiVar.zzo());
            if (zzagiVar.zzn() != 0) {
                zzahhVar.zza = 0L;
                return 1;
            }
            zzeu zzeuVar2 = this.zzb;
            zzeuVar2.zza(min2);
            zzagiVar.zzl();
            zzagiVar.zzi(zzeuVar2.zzi(), 0, min2);
            int zzg2 = zzeuVar2.zzg();
            int zze3 = zzeuVar2.zze();
            while (true) {
                if (zzg2 >= zze3 - 3) {
                    break;
                }
                if (zzg(zzeuVar2.zzi(), zzg2) == 442) {
                    zzeuVar2.zzh(zzg2 + 4);
                    long zze4 = zze(zzeuVar2);
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
