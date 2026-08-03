package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaqz {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final com.google.android.gms.internal.ads.zzfi zza = new com.google.android.gms.internal.ads.zzfi(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet();

    zzaqz(int i) {
    }

    private final int zze(com.google.android.gms.internal.ads.zzafz zzafzVar) {
        byte[] bArr = com.google.android.gms.internal.ads.zzfl.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzafzVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(com.google.android.gms.internal.ads.zzafz zzafzVar, com.google.android.gms.internal.ads.zzagy zzagyVar, int i) throws java.io.IOException {
        if (i <= 0) {
            zze(zzafzVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzafzVar.zzo();
            int min = (int) java.lang.Math.min(112800L, zzo);
            long j2 = zzo - min;
            if (zzafzVar.zzn() == j2) {
                com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
                zzetVar.zza(min);
                zzafzVar.zzl();
                zzafzVar.zzi(zzetVar.zzi(), 0, min);
                int zzg = zzetVar.zzg();
                int zze = zzetVar.zze();
                int i2 = zze - 188;
                while (true) {
                    if (i2 < zzg) {
                        break;
                    }
                    byte[] zzi = zzetVar.zzi();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < zzg || i5 >= zze || zzi[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb = com.google.android.gms.internal.ads.zzarj.zzb(zzetVar, i2, i);
                                if (zzb != -9223372036854775807L) {
                                    j = zzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzagyVar.zza = j2;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzafzVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzafzVar);
                    return 0;
                }
                com.google.android.gms.internal.ads.zzfi zzfiVar = this.zza;
                this.zzh = zzfiVar.zzf(this.zzg) - zzfiVar.zze(j3);
                zze(zzafzVar);
                return 0;
            }
            int min2 = (int) java.lang.Math.min(112800L, zzafzVar.zzo());
            if (zzafzVar.zzn() == 0) {
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzb;
                zzetVar2.zza(min2);
                zzafzVar.zzl();
                zzafzVar.zzi(zzetVar2.zzi(), 0, min2);
                int zzg2 = zzetVar2.zzg();
                int zze2 = zzetVar2.zze();
                while (true) {
                    if (zzg2 >= zze2) {
                        break;
                    }
                    if (zzetVar2.zzi()[zzg2] == 71) {
                        long zzb2 = com.google.android.gms.internal.ads.zzarj.zzb(zzetVar2, zzg2, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzg2++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzagyVar.zza = 0L;
        }
        return 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final com.google.android.gms.internal.ads.zzfi zzd() {
        return this.zza;
    }
}
