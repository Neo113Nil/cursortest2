package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzgvn {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzgvm zzgvmVar) throws zzgxv {
        int iZzh = zzh(bArr, i7, zzgvmVar);
        int i8 = zzgvmVar.zza;
        if (i8 < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - iZzh) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            zzgvmVar.zzc = zzgvy.zzb;
            return iZzh;
        }
        zzgvmVar.zzc = zzgvy.zzv(bArr, iZzh, i8);
        return iZzh + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public static int zzc(zzgzk zzgzkVar, byte[] bArr, int i7, int i8, int i9, zzgvm zzgvmVar) throws zzgxv {
        Object objZze = zzgzkVar.zze();
        int iZzl = zzl(objZze, zzgzkVar, bArr, i7, i8, i9, zzgvmVar);
        zzgzkVar.zzf(objZze);
        zzgvmVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzgzk zzgzkVar, byte[] bArr, int i7, int i8, zzgvm zzgvmVar) throws zzgxv {
        Object objZze = zzgzkVar.zze();
        int iZzm = zzm(objZze, zzgzkVar, bArr, i7, i8, zzgvmVar);
        zzgzkVar.zzf(objZze);
        zzgvmVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzgzk zzgzkVar, int i7, byte[] bArr, int i8, int i9, zzgxs zzgxsVar, zzgvm zzgvmVar) throws zzgxv {
        int iZzd = zzd(zzgzkVar, bArr, i8, i9, zzgvmVar);
        zzgxsVar.add(zzgvmVar.zzc);
        while (iZzd < i9) {
            int iZzh = zzh(bArr, iZzd, zzgvmVar);
            if (i7 != zzgvmVar.zza) {
                break;
            }
            iZzd = zzd(zzgzkVar, bArr, iZzh, i9, zzgvmVar);
            zzgxsVar.add(zzgvmVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i7, zzgxs zzgxsVar, zzgvm zzgvmVar) throws zzgxv {
        zzgxh zzgxhVar = (zzgxh) zzgxsVar;
        int iZzh = zzh(bArr, i7, zzgvmVar);
        int i8 = zzgvmVar.zza + iZzh;
        while (iZzh < i8) {
            iZzh = zzh(bArr, iZzh, zzgvmVar);
            zzgxhVar.zzi(zzgvmVar.zza);
        }
        if (iZzh == i8) {
            return iZzh;
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i7, byte[] bArr, int i8, int i9, zzgzx zzgzxVar, zzgvm zzgvmVar) throws zzgxv {
        if ((i7 >>> 3) == 0) {
            throw new zzgxv("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzk = zzk(bArr, i8, zzgvmVar);
            zzgzxVar.zzj(i7, Long.valueOf(zzgvmVar.zzb));
            return iZzk;
        }
        if (i10 == 1) {
            zzgzxVar.zzj(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzh = zzh(bArr, i8, zzgvmVar);
            int i11 = zzgvmVar.zza;
            if (i11 < 0) {
                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - iZzh) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzgzxVar.zzj(i7, zzgvy.zzb);
            } else {
                zzgzxVar.zzj(i7, zzgvy.zzv(bArr, iZzh, i11));
            }
            return iZzh + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzgxv("Protocol message contained an invalid tag (zero).");
            }
            zzgzxVar.zzj(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzgzx zzgzxVarZzf = zzgzx.zzf();
        int i13 = zzgvmVar.zze + 1;
        zzgvmVar.zze = i13;
        zzo(i13);
        int i14 = 0;
        while (i8 < i9) {
            int iZzh2 = zzh(bArr, i8, zzgvmVar);
            i14 = zzgvmVar.zza;
            if (i14 == i12) {
                i8 = iZzh2;
                break;
            }
            i8 = zzg(i14, bArr, iZzh2, i9, zzgzxVarZzf, zzgvmVar);
        }
        zzgvmVar.zze--;
        if (i8 > i9 || i14 != i12) {
            throw new zzgxv("Failed to parse the message.");
        }
        zzgzxVar.zzj(i7, zzgzxVarZzf);
        return i8;
    }

    public static int zzh(byte[] bArr, int i7, zzgvm zzgvmVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzi(b7, bArr, i8, zzgvmVar);
        }
        zzgvmVar.zza = b7;
        return i8;
    }

    public static int zzi(int i7, byte[] bArr, int i8, zzgvm zzgvmVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzgvmVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzgvmVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzgvmVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzgvmVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzgvmVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzj(int i7, byte[] bArr, int i8, int i9, zzgxs zzgxsVar, zzgvm zzgvmVar) {
        zzgxh zzgxhVar = (zzgxh) zzgxsVar;
        int iZzh = zzh(bArr, i8, zzgvmVar);
        zzgxhVar.zzi(zzgvmVar.zza);
        while (iZzh < i9) {
            int iZzh2 = zzh(bArr, iZzh, zzgvmVar);
            if (i7 != zzgvmVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgvmVar);
            zzgxhVar.zzi(zzgvmVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i7, zzgvm zzgvmVar) {
        long j = bArr[i7];
        int i8 = i7 + 1;
        if (j >= 0) {
            zzgvmVar.zzb = j;
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
        zzgvmVar.zzb = j3;
        return i9;
    }

    public static int zzl(Object obj, zzgzk zzgzkVar, byte[] bArr, int i7, int i8, int i9, zzgvm zzgvmVar) throws zzgxv {
        zzgyu zzgyuVar = (zzgyu) zzgzkVar;
        int i10 = zzgvmVar.zze + 1;
        zzgvmVar.zze = i10;
        zzo(i10);
        int iZzc = zzgyuVar.zzc(obj, bArr, i7, i8, i9, zzgvmVar);
        zzgvmVar.zze--;
        zzgvmVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzgzk zzgzkVar, byte[] bArr, int i7, int i8, zzgvm zzgvmVar) throws zzgxv {
        int iZzi = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZzi = zzi(i9, bArr, iZzi, zzgvmVar);
            i9 = zzgvmVar.zza;
        }
        int i10 = iZzi;
        if (i9 < 0 || i9 > i8 - i10) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i11 = zzgvmVar.zze + 1;
        zzgvmVar.zze = i11;
        zzo(i11);
        int i12 = i9 + i10;
        zzgzkVar.zzi(obj, bArr, i10, i12, zzgvmVar);
        zzgvmVar.zze--;
        zzgvmVar.zzc = obj;
        return i12;
    }

    public static long zzn(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }

    private static void zzo(int i7) throws zzgxv {
        if (i7 >= zzb) {
            throw new zzgxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
