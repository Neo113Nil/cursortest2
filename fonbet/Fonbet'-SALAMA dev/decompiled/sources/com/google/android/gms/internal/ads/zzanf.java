package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzanf {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzek zza = new zzek(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzed zzb = new zzed();

    public zzanf(int i7) {
    }

    private final int zze(zzacw zzacwVar) {
        byte[] bArr = zzen.zzc;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacwVar.zzj();
        return 0;
    }

    public final int zza(zzacw zzacwVar, zzadr zzadrVar, int i7) {
        if (i7 <= 0) {
            zze(zzacwVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd = zzacwVar.zzd();
            int min = (int) Math.min(112800L, zzd);
            long j3 = zzd - min;
            if (zzacwVar.zzf() == j3) {
                this.zzb.zzI(min);
                zzacwVar.zzj();
                zzacwVar.zzh(this.zzb.zzN(), 0, min);
                zzed zzedVar = this.zzb;
                int zzd2 = zzedVar.zzd();
                int zze = zzedVar.zze();
                int i8 = zze - 188;
                while (true) {
                    if (i8 < zzd2) {
                        break;
                    }
                    byte[] zzN = zzedVar.zzN();
                    int i9 = -4;
                    int i10 = 0;
                    while (true) {
                        if (i9 > 4) {
                            break;
                        }
                        int i11 = (i9 * 188) + i8;
                        if (i11 < zzd2 || i11 >= zze || zzN[i11] != 71) {
                            i10 = 0;
                        } else {
                            i10++;
                            if (i10 == 5) {
                                long zzb = zzano.zzb(zzedVar, i8, i7);
                                if (zzb != -9223372036854775807L) {
                                    j = zzb;
                                    break;
                                }
                            }
                        }
                        i9++;
                    }
                    i8--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzadrVar.zza = j3;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzacwVar);
                return 0;
            }
            if (this.zzd) {
                long j7 = this.zzf;
                if (j7 == -9223372036854775807L) {
                    zze(zzacwVar);
                    return 0;
                }
                zzek zzekVar = this.zza;
                this.zzh = zzekVar.zzc(this.zzg) - zzekVar.zzb(j7);
                zze(zzacwVar);
                return 0;
            }
            int min2 = (int) Math.min(112800L, zzacwVar.zzd());
            if (zzacwVar.zzf() == 0) {
                this.zzb.zzI(min2);
                zzacwVar.zzj();
                zzacwVar.zzh(this.zzb.zzN(), 0, min2);
                zzed zzedVar2 = this.zzb;
                int zzd3 = zzedVar2.zzd();
                int zze2 = zzedVar2.zze();
                while (true) {
                    if (zzd3 >= zze2) {
                        break;
                    }
                    if (zzedVar2.zzN()[zzd3] == 71) {
                        long zzb2 = zzano.zzb(zzedVar2, zzd3, i7);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzd3++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzadrVar.zza = 0L;
        }
        return 1;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzek zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}
