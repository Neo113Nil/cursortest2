package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
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
        zzaikVar.zzb = j3;
        return i9;
    }

    public static int zza(byte[] bArr, int i7, zzaik zzaikVar) {
        int iZzc = zzc(bArr, i7, zzaikVar);
        int i8 = zzaikVar.zza;
        if (i8 < 0) {
            throw zzakf.zzf();
        }
        if (i8 > bArr.length - iZzc) {
            throw zzakf.zzj();
        }
        if (i8 == 0) {
            zzaikVar.zzc = zzaip.zza;
            return iZzc;
        }
        zzaikVar.zzc = zzaip.zza(bArr, iZzc, i8);
        return iZzc + i8;
    }

    public static int zzb(zzalv<?> zzalvVar, int i7, byte[] bArr, int i8, int i9, zzakc<?> zzakcVar, zzaik zzaikVar) {
        int iZza = zza(zzalvVar, bArr, i8, i9, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (iZza < i9) {
            int iZzc = zzc(bArr, iZza, zzaikVar);
            if (i7 != zzaikVar.zza) {
                break;
            }
            iZza = zza(zzalvVar, bArr, iZzc, i9, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return iZza;
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
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i7, zzaik zzaikVar) {
        int iZzc = zzc(bArr, i7, zzaikVar);
        int i8 = zzaikVar.zza;
        if (i8 < 0) {
            throw zzakf.zzf();
        }
        if (i8 == 0) {
            zzaikVar.zzc = "";
            return iZzc;
        }
        zzaikVar.zzc = zzamt.zzb(bArr, iZzc, i8);
        return iZzc + i8;
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
        Object objZza = zzalvVar.zza();
        int iZza = zza(objZza, zzalvVar, bArr, i7, i8, i9, zzaikVar);
        zzalvVar.zzd(objZza);
        zzaikVar.zzc = objZza;
        return iZza;
    }

    public static int zza(zzalv zzalvVar, int i7, byte[] bArr, int i8, int i9, zzakc<?> zzakcVar, zzaik zzaikVar) {
        int i10 = (i7 & (-8)) | 4;
        int iZza = zza(zzalvVar, bArr, i8, i9, i10, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (iZza < i9) {
            int iZzc = zzc(bArr, iZza, zzaikVar);
            if (i7 != zzaikVar.zza) {
                break;
            }
            iZza = zza(zzalvVar, bArr, iZzc, i9, i10, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return iZza;
    }

    public static int zza(zzalv zzalvVar, byte[] bArr, int i7, int i8, zzaik zzaikVar) {
        Object objZza = zzalvVar.zza();
        int iZza = zza(objZza, zzalvVar, bArr, i7, i8, zzaikVar);
        zzalvVar.zzd(objZza);
        zzaikVar.zzc = objZza;
        return iZza;
    }

    public static int zza(byte[] bArr, int i7, zzakc<?> zzakcVar, zzaik zzaikVar) {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int iZzc = zzc(bArr, i7, zzaikVar);
        int i8 = zzaikVar.zza + iZzc;
        while (iZzc < i8) {
            iZzc = zzc(bArr, iZzc, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        if (iZzc == i8) {
            return iZzc;
        }
        throw zzakf.zzj();
    }

    public static int zza(int i7, byte[] bArr, int i8, int i9, zzamn zzamnVar, zzaik zzaikVar) {
        if ((i7 >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzd = zzd(bArr, i8, zzaikVar);
            zzamnVar.zza(i7, Long.valueOf(zzaikVar.zzb));
            return iZzd;
        }
        if (i10 == 1) {
            zzamnVar.zza(i7, Long.valueOf(zzd(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzc = zzc(bArr, i8, zzaikVar);
            int i11 = zzaikVar.zza;
            if (i11 >= 0) {
                if (i11 > bArr.length - iZzc) {
                    throw zzakf.zzj();
                }
                if (i11 == 0) {
                    zzamnVar.zza(i7, zzaip.zza);
                } else {
                    zzamnVar.zza(i7, zzaip.zza(bArr, iZzc, i11));
                }
                return iZzc + i11;
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
        zzamn zzamnVarZzd = zzamn.zzd();
        int i12 = (i7 & (-8)) | 4;
        int i13 = zzaikVar.zze + 1;
        zzaikVar.zze = i13;
        zza(i13);
        int i14 = 0;
        while (i8 < i9) {
            int iZzc2 = zzc(bArr, i8, zzaikVar);
            int i15 = zzaikVar.zza;
            i14 = i15;
            if (i15 == i12) {
                i8 = iZzc2;
                break;
            }
            int iZza = zza(i14, bArr, iZzc2, i9, zzamnVarZzd, zzaikVar);
            i14 = i15;
            i8 = iZza;
        }
        zzaikVar.zze--;
        if (i8 <= i9 && i14 == i12) {
            zzamnVar.zza(i7, zzamnVarZzd);
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
        int i11 = i9 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            zzaikVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzaikVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzaikVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
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
        int iZzc = zzc(bArr, i8, zzaikVar);
        zzajzVar.zzc(zzaikVar.zza);
        while (iZzc < i9) {
            int iZzc2 = zzc(bArr, iZzc, zzaikVar);
            if (i7 != zzaikVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        return iZzc;
    }

    public static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i7, int i8, int i9, zzaik zzaikVar) {
        zzalg zzalgVar = (zzalg) zzalvVar;
        int i10 = zzaikVar.zze + 1;
        zzaikVar.zze = i10;
        zza(i10);
        int iZza = zzalgVar.zza(obj, bArr, i7, i8, i9, zzaikVar);
        zzaikVar.zze--;
        zzaikVar.zzc = obj;
        return iZza;
    }

    public static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i7, int i8, zzaik zzaikVar) {
        int iZza = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZza = zza(i9, bArr, iZza, zzaikVar);
            i9 = zzaikVar.zza;
        }
        int i10 = iZza;
        if (i9 >= 0 && i9 <= i8 - i10) {
            int i11 = zzaikVar.zze + 1;
            zzaikVar.zze = i11;
            zza(i11);
            int i12 = i9 + i10;
            zzalvVar.zza(obj, bArr, i10, i12, zzaikVar);
            zzaikVar.zze--;
            zzaikVar.zzc = obj;
            return i12;
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

    private static void zza(int i7) throws zzakf {
        if (i7 >= zza) {
            throw zzakf.zzh();
        }
    }
}
