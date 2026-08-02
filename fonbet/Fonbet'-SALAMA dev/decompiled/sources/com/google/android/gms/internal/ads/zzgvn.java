package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgvn {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i7, zzgvm zzgvmVar) {
        int zzh = zzh(bArr, i7, zzgvmVar);
        int i8 = zzgvmVar.zza;
        if (i8 < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i8 > bArr.length - zzh) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i8 == 0) {
            zzgvmVar.zzc = zzgvy.zzb;
            return zzh;
        }
        zzgvmVar.zzc = zzgvy.zzv(bArr, zzh, i8);
        return zzh + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public static int zzc(zzgzk zzgzkVar, byte[] bArr, int i7, int i8, int i9, zzgvm zzgvmVar) {
        Object zze = zzgzkVar.zze();
        int zzl = zzl(zze, zzgzkVar, bArr, i7, i8, i9, zzgvmVar);
        zzgzkVar.zzf(zze);
        zzgvmVar.zzc = zze;
        return zzl;
    }

    public static int zzd(zzgzk zzgzkVar, byte[] bArr, int i7, int i8, zzgvm zzgvmVar) {
        Object zze = zzgzkVar.zze();
        int zzm = zzm(zze, zzgzkVar, bArr, i7, i8, zzgvmVar);
        zzgzkVar.zzf(zze);
        zzgvmVar.zzc = zze;
        return zzm;
    }

    public static int zze(zzgzk zzgzkVar, int i7, byte[] bArr, int i8, int i9, zzgxs zzgxsVar, zzgvm zzgvmVar) {
        int zzd = zzd(zzgzkVar, bArr, i8, i9, zzgvmVar);
        zzgxsVar.add(zzgvmVar.zzc);
        while (zzd < i9) {
            int zzh = zzh(bArr, zzd, zzgvmVar);
            if (i7 != zzgvmVar.zza) {
                break;
            }
            zzd = zzd(zzgzkVar, bArr, zzh, i9, zzgvmVar);
            zzgxsVar.add(zzgvmVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i7, zzgxs zzgxsVar, zzgvm zzgvmVar) {
        zzgxh zzgxhVar = (zzgxh) zzgxsVar;
        int zzh = zzh(bArr, i7, zzgvmVar);
        int i8 = zzgvmVar.zza + zzh;
        while (zzh < i8) {
            zzh = zzh(bArr, zzh, zzgvmVar);
            zzgxhVar.zzi(zzgvmVar.zza);
        }
        if (zzh == i8) {
            return zzh;
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i7, byte[] bArr, int i8, int i9, zzgzx zzgzxVar, zzgvm zzgvmVar) {
        if ((i7 >>> 3) == 0) {
            throw new zzgxv("Protocol message contained an invalid tag (zero).");
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int zzk = zzk(bArr, i8, zzgvmVar);
            zzgzxVar.zzj(i7, Long.valueOf(zzgvmVar.zzb));
            return zzk;
        }
        if (i10 == 1) {
            zzgzxVar.zzj(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int zzh = zzh(bArr, i8, zzgvmVar);
            int i11 = zzgvmVar.zza;
            if (i11 < 0) {
                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i11 > bArr.length - zzh) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i11 == 0) {
                zzgzxVar.zzj(i7, zzgvy.zzb);
            } else {
                zzgzxVar.zzj(i7, zzgvy.zzv(bArr, zzh, i11));
            }
            return zzh + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw new zzgxv("Protocol message contained an invalid tag (zero).");
            }
            zzgzxVar.zzj(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzgzx zzf = zzgzx.zzf();
        int i13 = zzgvmVar.zze + 1;
        zzgvmVar.zze = i13;
        zzo(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int zzh2 = zzh(bArr, i8, zzgvmVar);
            i14 = zzgvmVar.zza;
            if (i14 == i12) {
                i8 = zzh2;
                break;
            }
            i8 = zzg(i14, bArr, zzh2, i9, zzf, zzgvmVar);
        }
        zzgvmVar.zze--;
        if (i8 > i9 || i14 != i12) {
            throw new zzgxv("Failed to parse the message.");
        }
        zzgzxVar.zzj(i7, zzf);
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
        int i11 = i10 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzgvmVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzgvmVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzgvmVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
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
        int zzh = zzh(bArr, i8, zzgvmVar);
        zzgxhVar.zzi(zzgvmVar.zza);
        while (zzh < i9) {
            int zzh2 = zzh(bArr, zzh, zzgvmVar);
            if (i7 != zzgvmVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzgvmVar);
            zzgxhVar.zzi(zzgvmVar.zza);
        }
        return zzh;
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
        long j3 = (j & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        zzgvmVar.zzb = j3;
        return i9;
    }

    public static int zzl(Object obj, zzgzk zzgzkVar, byte[] bArr, int i7, int i8, int i9, zzgvm zzgvmVar) {
        zzgyu zzgyuVar = (zzgyu) zzgzkVar;
        int i10 = zzgvmVar.zze + 1;
        zzgvmVar.zze = i10;
        zzo(i10);
        int zzc = zzgyuVar.zzc(obj, bArr, i7, i8, i9, zzgvmVar);
        zzgvmVar.zze--;
        zzgvmVar.zzc = obj;
        return zzc;
    }

    public static int zzm(Object obj, zzgzk zzgzkVar, byte[] bArr, int i7, int i8, zzgvm zzgvmVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zzi(i10, bArr, i9, zzgvmVar);
            i10 = zzgvmVar.zza;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = zzgvmVar.zze + 1;
        zzgvmVar.zze = i12;
        zzo(i12);
        int i13 = i10 + i11;
        zzgzkVar.zzi(obj, bArr, i11, i13, zzgvmVar);
        zzgvmVar.zze--;
        zzgvmVar.zzc = obj;
        return i13;
    }

    public static long zzn(byte[] bArr, int i7) {
        return (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48) | ((bArr[i7 + 7] & 255) << 56);
    }

    private static void zzo(int i7) {
        if (i7 >= zzb) {
            throw new zzgxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
