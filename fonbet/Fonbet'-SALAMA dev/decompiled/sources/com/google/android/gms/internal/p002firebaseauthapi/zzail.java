package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* loaded from: classes.dex */
final class zzail {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i7) {
        return Double.longBitsToDouble(zzd(bArr, i7));
    }

    public static float zzb(byte[] bArr, int i7) {
        return Float.intBitsToFloat(zzc(bArr, i7));
    }

    public static int zzc(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i7, zzaik zzaikVar) {
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            zzaikVar.zzb = j;
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
        zzaikVar.zzb = j3;
        return i9;
    }

    public static int zza(byte[] bArr, int i7, zzaik zzaikVar) {
        int zzc = zzc(bArr, i7, zzaikVar);
        int i8 = zzaikVar.zza;
        if (i8 < 0) {
            throw zzakf.zzf();
        }
        if (i8 > bArr.length - zzc) {
            throw zzakf.zzj();
        }
        if (i8 == 0) {
            zzaikVar.zzc = zzaip.zza;
            return zzc;
        }
        zzaikVar.zzc = zzaip.zza(bArr, zzc, i8);
        return zzc + i8;
    }

    public static int zzb(zzalv<?> zzalvVar, int i7, byte[] bArr, int i8, int i9, zzakc<?> zzakcVar, zzaik zzaikVar) {
        int zza2 = zza(zzalvVar, bArr, i8, i9, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (zza2 < i9) {
            int zzc = zzc(bArr, zza2, zzaikVar);
            if (i7 != zzaikVar.zza) {
                break;
            }
            zza2 = zza(zzalvVar, bArr, zzc, i9, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return zza2;
    }

    public static int zzc(byte[] bArr, int i7, zzaik zzaikVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zza(b7, bArr, i8, zzaikVar);
        }
        zzaikVar.zza = b7;
        return i8;
    }

    public static long zzd(byte[] bArr, int i7) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i7, zzaik zzaikVar) {
        int zzc = zzc(bArr, i7, zzaikVar);
        int i8 = zzaikVar.zza;
        if (i8 < 0) {
            throw zzakf.zzf();
        }
        if (i8 == 0) {
            zzaikVar.zzc = "";
            return zzc;
        }
        zzaikVar.zzc = zzamt.zzb(bArr, zzc, i8);
        return zzc + i8;
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, Object obj, zzalc zzalcVar, zzamo<zzamn, zzamn> zzamoVar, zzaik zzaikVar) {
        if (zzaikVar.zzd.zza(zzalcVar, i7 >>> 3) == null) {
            return zza(i7, bArr, i8, i9, zzalg.zzc(obj), zzaikVar);
        }
        zzajy.zzb zzbVar = (zzajy.zzb) obj;
        zzbVar.zza();
        zzajr<zzajy.zze> zzajrVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    private static int zza(zzalv zzalvVar, byte[] bArr, int i7, int i8, int i9, zzaik zzaikVar) {
        Object zza2 = zzalvVar.zza();
        int zza3 = zza(zza2, zzalvVar, bArr, i7, i8, i9, zzaikVar);
        zzalvVar.zzd(zza2);
        zzaikVar.zzc = zza2;
        return zza3;
    }

    public static int zza(zzalv zzalvVar, int i7, byte[] bArr, int i8, int i9, zzakc<?> zzakcVar, zzaik zzaikVar) {
        int i10 = (i7 & (-8)) | 4;
        int zza2 = zza(zzalvVar, bArr, i8, i9, i10, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (zza2 < i9) {
            int zzc = zzc(bArr, zza2, zzaikVar);
            if (i7 != zzaikVar.zza) {
                break;
            }
            zza2 = zza(zzalvVar, bArr, zzc, i9, i10, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return zza2;
    }

    public static int zza(zzalv zzalvVar, byte[] bArr, int i7, int i8, zzaik zzaikVar) {
        Object zza2 = zzalvVar.zza();
        int zza3 = zza(zza2, zzalvVar, bArr, i7, i8, zzaikVar);
        zzalvVar.zzd(zza2);
        zzaikVar.zzc = zza2;
        return zza3;
    }

    public static int zza(byte[] bArr, int i7, zzakc<?> zzakcVar, zzaik zzaikVar) {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int zzc = zzc(bArr, i7, zzaikVar);
        int i8 = zzaikVar.zza + zzc;
        while (zzc < i8) {
            zzc = zzc(bArr, zzc, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        if (zzc == i8) {
            return zzc;
        }
        throw zzakf.zzj();
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, zzamn zzamnVar, zzaik zzaikVar) {
        if ((i7 >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int zzd = zzd(bArr, i8, zzaikVar);
            zzamnVar.zza(i7, Long.valueOf(zzaikVar.zzb));
            return zzd;
        }
        if (i10 == 1) {
            zzamnVar.zza(i7, Long.valueOf(zzd(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int zzc = zzc(bArr, i8, zzaikVar);
            int i11 = zzaikVar.zza;
            if (i11 >= 0) {
                if (i11 > bArr.length - zzc) {
                    throw zzakf.zzj();
                }
                if (i11 == 0) {
                    zzamnVar.zza(i7, zzaip.zza);
                } else {
                    zzamnVar.zza(i7, zzaip.zza(bArr, zzc, i11));
                }
                return zzc + i11;
            }
            throw zzakf.zzf();
        }
        if (i10 != 3) {
            if (i10 == 5) {
                zzamnVar.zza(i7, Integer.valueOf(zzc(bArr, i8)));
                return i8 + 4;
            }
            throw zzakf.zzc();
        }
        zzamn zzd2 = zzamn.zzd();
        int i12 = (i7 & (-8)) | 4;
        int i13 = zzaikVar.zze + 1;
        zzaikVar.zze = i13;
        zza(i13);
        int i14 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int zzc2 = zzc(bArr, i8, zzaikVar);
            int i15 = zzaikVar.zza;
            i14 = i15;
            if (i15 == i12) {
                i8 = zzc2;
                break;
            }
            int zza2 = zza(i14, bArr, zzc2, i9, zzd2, zzaikVar);
            i14 = i15;
            i8 = zza2;
        }
        zzaikVar.zze--;
        if (i8 <= i9 && i14 == i12) {
            zzamnVar.zza(i7, zzd2);
            return i8;
        }
        throw zzakf.zzg();
    }

    public static int zza(int i7, byte[] bArr, int i8, zzaik zzaikVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            zzaikVar.zza = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            zzaikVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzaikVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzaikVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzaikVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, zzakc<?> zzakcVar, zzaik zzaikVar) {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int zzc = zzc(bArr, i8, zzaikVar);
        zzajzVar.zzc(zzaikVar.zza);
        while (zzc < i9) {
            int zzc2 = zzc(bArr, zzc, zzaikVar);
            if (i7 != zzaikVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        return zzc;
    }

    public static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i7, int i8, int i9, zzaik zzaikVar) {
        zzalg zzalgVar = (zzalg) zzalvVar;
        int i10 = zzaikVar.zze + 1;
        zzaikVar.zze = i10;
        zza(i10);
        int zza2 = zzalgVar.zza((zzalg) obj, bArr, i7, i8, i9, zzaikVar);
        zzaikVar.zze--;
        zzaikVar.zzc = obj;
        return zza2;
    }

    public static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i7, int i8, zzaik zzaikVar) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = zza(i10, bArr, i9, zzaikVar);
            i10 = zzaikVar.zza;
        }
        int i11 = i9;
        if (i10 >= 0 && i10 <= i8 - i11) {
            int i12 = zzaikVar.zze + 1;
            zzaikVar.zze = i12;
            zza(i12);
            int i13 = i10 + i11;
            zzalvVar.zza(obj, bArr, i11, i13, zzaikVar);
            zzaikVar.zze--;
            zzaikVar.zzc = obj;
            return i13;
        }
        throw zzakf.zzj();
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, zzaik zzaikVar) {
        if ((i7 >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return zzd(bArr, i8, zzaikVar);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return zzc(bArr, i8, zzaikVar) + zzaikVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw zzakf.zzc();
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = zzc(bArr, i8, zzaikVar);
            i12 = zzaikVar.zza;
            if (i12 == i11) {
                break;
            }
            i8 = zza(i12, bArr, i8, i9, zzaikVar);
        }
        if (i8 > i9 || i12 != i11) {
            throw zzakf.zzg();
        }
        return i8;
    }

    private static void zza(int i7) {
        if (i7 >= zza) {
            throw zzakf.zzh();
        }
    }
}
