package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzamt implements zzacf {
    private final zzek zza;
    private final zzed zzb = new zzed();

    public /* synthetic */ zzamt(zzek zzekVar, zzamu zzamuVar) {
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final zzace zza(zzacw zzacwVar, long j) {
        int zzh;
        long j3;
        long zzf = zzacwVar.zzf();
        int min = (int) Math.min(20000L, zzacwVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzacwVar.zzh(this.zzb.zzN(), 0, min);
        int i7 = -1;
        long j7 = -9223372036854775807L;
        int i8 = -1;
        while (true) {
            zzed zzedVar = this.zzb;
            if (zzedVar.zzb() < 4) {
                return j7 != -9223372036854775807L ? zzace.zzf(j7, zzf + i7) : zzace.zza;
            }
            if (zzamv.zzh(zzedVar.zzN(), zzedVar.zzd()) != 442) {
                zzedVar.zzM(1);
            } else {
                zzedVar.zzM(4);
                long zzc = zzamw.zzc(zzedVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j7 == -9223372036854775807L) {
                            return zzace.zzd(zzb, zzf);
                        }
                        j3 = i8;
                    } else {
                        if (100000 + zzb > j) {
                            j3 = zzedVar.zzd();
                            break;
                        }
                        i8 = zzedVar.zzd();
                        j7 = zzb;
                    }
                }
                int zze = zzedVar.zze();
                if (zzedVar.zzb() >= 10) {
                    zzedVar.zzM(9);
                    int zzm = zzedVar.zzm() & 7;
                    if (zzedVar.zzb() >= zzm) {
                        zzedVar.zzM(zzm);
                        if (zzedVar.zzb() >= 4) {
                            if (zzamv.zzh(zzedVar.zzN(), zzedVar.zzd()) == 443) {
                                zzedVar.zzM(4);
                                int zzq = zzedVar.zzq();
                                if (zzedVar.zzb() < zzq) {
                                    zzedVar.zzL(zze);
                                } else {
                                    zzedVar.zzM(zzq);
                                }
                            }
                            while (true) {
                                if (zzedVar.zzb() < 4 || (zzh = zzamv.zzh(zzedVar.zzN(), zzedVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzedVar.zzM(4);
                                if (zzedVar.zzb() < 2) {
                                    zzedVar.zzL(zze);
                                    break;
                                }
                                zzedVar.zzL(Math.min(zzedVar.zze(), zzedVar.zzd() + zzedVar.zzq()));
                            }
                        } else {
                            zzedVar.zzL(zze);
                        }
                    } else {
                        zzedVar.zzL(zze);
                    }
                } else {
                    zzedVar.zzL(zze);
                }
                i7 = zzedVar.zzd();
            }
        }
        return zzace.zze(zzf + j3);
    }

    @Override // com.google.android.gms.internal.ads.zzacf
    public final void zzb() {
        byte[] bArr = zzen.zzc;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
