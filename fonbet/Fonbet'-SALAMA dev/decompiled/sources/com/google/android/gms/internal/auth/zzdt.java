package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzdt {
    public static int zza(byte[] bArr, int i7, zzds zzdsVar) {
        int zzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza;
        if (i8 < 0) {
            throw zzfa.zzc();
        }
        if (i8 > bArr.length - zzj) {
            throw zzfa.zzf();
        }
        if (i8 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return zzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, zzj, i8);
        return zzj + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i7, int i8, int i9, zzds zzdsVar) {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object zzd = zzfzVar.zzd();
        int zzb = zzfzVar.zzb(zzd, bArr, i7, i8, i9, zzdsVar);
        zzfzVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return zzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i7, int i8, zzds zzdsVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zzk(i10, bArr, i9, zzdsVar);
            i10 = zzdsVar.zza;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw zzfa.zzf();
        }
        Object zzd = zzghVar.zzd();
        int i12 = i10 + i11;
        zzghVar.zzg(zzd, bArr, i11, i12, zzdsVar);
        zzghVar.zze(zzd);
        zzdsVar.zzc = zzd;
        return i12;
    }

    public static int zze(zzgh zzghVar, int i7, byte[] bArr, int i8, int i9, zzey zzeyVar, zzds zzdsVar) {
        int zzd = zzd(zzghVar, bArr, i8, i9, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (zzd < i9) {
            int zzj = zzj(bArr, zzd, zzdsVar);
            if (i7 != zzdsVar.zza) {
                break;
            }
            zzd = zzd(zzghVar, bArr, zzj, i9, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int zzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza + zzj;
        while (zzj < i8) {
            zzj = zzj(bArr, zzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (zzj == i8) {
            return zzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i7, zzds zzdsVar) {
        int zzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza;
        if (i8 < 0) {
            throw zzfa.zzc();
        }
        if (i8 == 0) {
            zzdsVar.zzc = "";
            return zzj;
        }
        zzdsVar.zzc = new String(bArr, zzj, i8, zzez.zzb);
        return zzj + i8;
    }

    public static int zzh(byte[] bArr, int i7, zzds zzdsVar) {
        int zzj = zzj(bArr, i7, zzdsVar);
        int i8 = zzdsVar.zza;
        if (i8 < 0) {
            throw zzfa.zzc();
        }
        if (i8 == 0) {
            zzdsVar.zzc = "";
            return zzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, zzj, i8);
        return zzj + i8;
    }

    public static int zzi(int i7, byte[] bArr, int i8, int i9, zzgz zzgzVar, zzds zzdsVar) {
        if ((i7 >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int zzm = zzm(bArr, i8, zzdsVar);
            zzgzVar.zzf(i7, Long.valueOf(zzdsVar.zzb));
            return zzm;
        }
        if (i10 == 1) {
            zzgzVar.zzf(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int zzj = zzj(bArr, i8, zzdsVar);
            int i11 = zzdsVar.zza;
            if (i11 < 0) {
                throw zzfa.zzc();
            }
            if (i11 > bArr.length - zzj) {
                throw zzfa.zzf();
            }
            if (i11 == 0) {
                zzgzVar.zzf(i7, zzee.zzb);
            } else {
                zzgzVar.zzf(i7, zzee.zzk(bArr, zzj, i11));
            }
            return zzj + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzgz zzc = zzgz.zzc();
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int zzj2 = zzj(bArr, i8, zzdsVar);
            int i14 = zzdsVar.zza;
            if (i14 == i12) {
                i13 = i14;
                i8 = zzj2;
                break;
            }
            i13 = i14;
            i8 = zzi(i14, bArr, zzj2, i9, zzc, zzdsVar);
        }
        if (i8 > i9 || i13 != i12) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i7, zzc);
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
        int i11 = i9 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            zzdsVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzdsVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzdsVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
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
        int zzj = zzj(bArr, i8, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (zzj < i9) {
            int zzj2 = zzj(bArr, zzj, zzdsVar);
            if (i7 != zzdsVar.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return zzj;
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
        long j3 = (j & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        zzdsVar.zzb = j3;
        return i9;
    }

    public static long zzn(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }
}
