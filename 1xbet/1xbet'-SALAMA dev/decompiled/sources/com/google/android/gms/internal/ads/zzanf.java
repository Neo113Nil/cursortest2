package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
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
            long jZzd = zzacwVar.zzd();
            int iMin = (int) Math.min(112800L, jZzd);
            long j3 = jZzd - ((long) iMin);
            if (zzacwVar.zzf() == j3) {
                this.zzb.zzI(iMin);
                zzacwVar.zzj();
                zzacwVar.zzh(this.zzb.zzN(), 0, iMin);
                zzed zzedVar = this.zzb;
                int iZzd = zzedVar.zzd();
                int iZze = zzedVar.zze();
                for (int i8 = iZze - 188; i8 >= iZzd; i8--) {
                    byte[] bArrZzN = zzedVar.zzN();
                    int i9 = 0;
                    for (int i10 = -4; i10 <= 4; i10++) {
                        int i11 = (i10 * 188) + i8;
                        if (i11 >= iZzd && i11 < iZze && bArrZzN[i11] == 71) {
                            i9++;
                            if (i9 == 5) {
                                long jZzb = zzano.zzb(zzedVar, i8, i7);
                                if (jZzb == -9223372036854775807L) {
                                    break;
                                }
                                j = jZzb;
                                break;
                            }
                        } else {
                            i9 = 0;
                        }
                    }
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
            int iMin2 = (int) Math.min(112800L, zzacwVar.zzd());
            if (zzacwVar.zzf() == 0) {
                this.zzb.zzI(iMin2);
                zzacwVar.zzj();
                zzacwVar.zzh(this.zzb.zzN(), 0, iMin2);
                zzed zzedVar2 = this.zzb;
                int iZze2 = zzedVar2.zze();
                for (int iZzd2 = zzedVar2.zzd(); iZzd2 < iZze2; iZzd2++) {
                    if (zzedVar2.zzN()[iZzd2] == 71) {
                        long jZzb2 = zzano.zzb(zzedVar2, iZzd2, i7);
                        if (jZzb2 != -9223372036854775807L) {
                            j = jZzb2;
                            break;
                        }
                    }
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
