package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzdt {
    public static int zza(byte[] bArr, int i7, zzds zzdsVar) {
        int iZzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza;
        if (i8 < 0) {
            throw zzfa.zzc();
        }
        if (i8 > bArr.length - iZzj) {
            throw zzfa.zzf();
        }
        if (i8 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return iZzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, iZzj, i8);
        return iZzj + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i7, int i8, int i9, zzds zzdsVar) {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object objZzd = zzfzVar.zzd();
        int iZzb = zzfzVar.zzb(objZzd, bArr, i7, i8, i9, zzdsVar);
        zzfzVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return iZzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i7, int i8, zzds zzdsVar) {
        int iZzk = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZzk = zzk(i9, bArr, iZzk, zzdsVar);
            i9 = zzdsVar.zza;
        }
        int i10 = iZzk;
        if (i9 < 0 || i9 > i8 - i10) {
            throw zzfa.zzf();
        }
        Object objZzd = zzghVar.zzd();
        int i11 = i9 + i10;
        zzghVar.zzg(objZzd, bArr, i10, i11, zzdsVar);
        zzghVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return i11;
    }

    public static int zze(zzgh zzghVar, int i7, byte[] bArr, int i8, int i9, zzey zzeyVar, zzds zzdsVar) {
        int iZzd = zzd(zzghVar, bArr, i8, i9, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (iZzd < i9) {
            int iZzj = zzj(bArr, iZzd, zzdsVar);
            if (i7 != zzdsVar.zza) {
                break;
            }
            iZzd = zzd(zzghVar, bArr, iZzj, i9, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i7, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza + iZzj;
        while (iZzj < i8) {
            iZzj = zzj(bArr, iZzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (iZzj == i8) {
            return iZzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i7, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza;
        if (i8 < 0) {
            throw zzfa.zzc();
        }
        if (i8 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = new String(bArr, iZzj, i8, zzez.zzb);
        return iZzj + i8;
    }

    public static int zzh(byte[] bArr, int i7, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza;
        if (i8 < 0) {
            throw zzfa.zzc();
        }
        if (i8 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i8);
        return iZzj + i8;
    }

    public static int zzi(int i7, byte[] bArr, int i8, int i9, zzgz zzgzVar, zzds zzdsVar) {
        if ((i7 >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzm = zzm(bArr, i8, zzdsVar);
            zzgzVar.zzf(i7, Long.valueOf(zzdsVar.zzb));
            return iZzm;
        }
        if (i10 == 1) {
            zzgzVar.zzf(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzj = zzj(bArr, i8, zzdsVar);
            int i11 = zzdsVar.zza;
            if (i11 < 0) {
                throw zzfa.zzc();
            }
            if (i11 > bArr.length - iZzj) {
                throw zzfa.zzf();
            }
            if (i11 == 0) {
                zzgzVar.zzf(i7, zzee.zzb);
            } else {
                zzgzVar.zzf(i7, zzee.zzk(bArr, iZzj, i11));
            }
            return iZzj + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzgz zzgzVarZzc = zzgz.zzc();
        int i13 = 0;
        while (i8 < i9) {
            int iZzj2 = zzj(bArr, i8, zzdsVar);
            int i14 = zzdsVar.zza;
            if (i14 == i12) {
                i13 = i14;
                i8 = iZzj2;
                break;
            }
            i13 = i14;
            i8 = zzi(i14, bArr, iZzj2, i9, zzgzVarZzc, zzdsVar);
        }
        if (i8 > i9 || i13 != i12) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i7, zzgzVarZzc);
        return i8;
    }

    public static int zzj(byte[] bArr, int i7, zzds zzdsVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzk(b7, bArr, i8, zzdsVar);
        }
        zzdsVar.zza = b7;
        return i8;
    }

    public static int zzk(int i7, byte[] bArr, int i8, zzds zzdsVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            zzdsVar.zza = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            zzdsVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzdsVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzdsVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzdsVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzl(int i7, byte[] bArr, int i8, int i9, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i8, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (iZzj < i9) {
            int iZzj2 = zzj(bArr, iZzj, zzdsVar);
            if (i7 != zzdsVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i7, zzds zzdsVar) {
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            zzdsVar.zzb = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j3 = (j & 127) | (((long) (b7 & 127)) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            i10 += 7;
            j3 |= ((long) (b8 & 127)) << i10;
            b7 = b8;
            i9 = i11;
        }
        zzdsVar.zzb = j3;
        return i9;
    }

    public static long zzn(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }
}
