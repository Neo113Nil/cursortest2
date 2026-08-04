package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzadc {
    public static int zza(zzed zzedVar, int i7) {
        switch (i7) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i7 - 2);
            case 6:
                return zzedVar.zzm() + 1;
            case 7:
                return zzedVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i7 - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzacw zzacwVar, zzadg zzadgVar) throws zzaz {
        zzacwVar.zzj();
        zzacwVar.zzg(1);
        byte[] bArr = new byte[1];
        zzacwVar.zzh(bArr, 0, 1);
        int i7 = bArr[0] & 1;
        boolean z4 = 1 == i7;
        zzacwVar.zzg(2);
        int i8 = 1 != i7 ? 6 : 7;
        zzed zzedVar = new zzed(i8);
        zzedVar.zzK(zzacz.zza(zzacwVar, zzedVar.zzN(), 0, i8));
        zzacwVar.zzj();
        zzadb zzadbVar = new zzadb();
        if (zzd(zzedVar, zzadgVar, z4, zzadbVar)) {
            return zzadbVar.zza;
        }
        throw zzaz.zza(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae A[RETURN] */
    public static boolean zzc(zzed zzedVar, zzadg zzadgVar, int i7, zzadb zzadbVar) {
        int iZza;
        int iZzd = zzedVar.zzd();
        long jZzu = zzedVar.zzu();
        long j = jZzu >>> 16;
        if (j != i7) {
            return false;
        }
        boolean z4 = (j & 1) == 1;
        long j3 = jZzu >> 12;
        long j7 = jZzu >> 8;
        long j8 = jZzu >> 4;
        long j9 = jZzu >> 1;
        long j10 = jZzu & 1;
        int i8 = (int) (j8 & 15);
        if (i8 > 7 ? !(i8 > 10 || zzadgVar.zzg != 2) : i8 == zzadgVar.zzg - 1) {
            int i9 = (int) (j9 & 7);
            if ((i9 == 0 || i9 == zzadgVar.zzi) && j10 != 1 && zzd(zzedVar, zzadgVar, z4, zzadbVar) && (iZza = zza(zzedVar, (int) (j3 & 15))) != -1 && iZza <= zzadgVar.zzb) {
                int i10 = zzadgVar.zze;
                int i11 = (int) (j7 & 15);
                if (i11 != 0) {
                    if (i11 <= 11) {
                        if (i11 == zzadgVar.zzf) {
                            if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i11 == 12) {
                        if (zzedVar.zzm() * zzbbd.zzq.zzf == i10) {
                            if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i11 <= 14) {
                        int iZzq = zzedVar.zzq();
                        if (i11 == 14) {
                            iZzq *= 10;
                        }
                        if (iZzq == i10) {
                            if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    }
                } else if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzed zzedVar, zzadg zzadgVar, boolean z4, zzadb zzadbVar) {
        try {
            long jZzx = zzedVar.zzx();
            if (!z4) {
                jZzx *= (long) zzadgVar.zzb;
            }
            zzadbVar.zza = jZzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
