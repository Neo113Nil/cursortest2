package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzil {
    public static int zza(byte[] bArr, int i7, zzik zzikVar) {
        int iZzi = zzi(bArr, i7, zzikVar);
        int i8 = zzikVar.zza;
        if (i8 < 0) {
            throw zzlc.zzf();
        }
        if (i8 > bArr.length - iZzi) {
            throw zzlc.zzi();
        }
        if (i8 == 0) {
            zzikVar.zzc = zziv.zzb;
            return iZzi;
        }
        zzikVar.zzc = zziv.zzk(bArr, iZzi, i8);
        return iZzi + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public static int zzc(zzmk zzmkVar, byte[] bArr, int i7, int i8, int i9, zzik zzikVar) {
        Object objZze = zzmkVar.zze();
        int iZzm = zzm(objZze, zzmkVar, bArr, i7, i8, i9, zzikVar);
        zzmkVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzmk zzmkVar, byte[] bArr, int i7, int i8, zzik zzikVar) {
        Object objZze = zzmkVar.zze();
        int iZzn = zzn(objZze, zzmkVar, bArr, i7, i8, zzikVar);
        zzmkVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzmk zzmkVar, int i7, byte[] bArr, int i8, int i9, zzkz zzkzVar, zzik zzikVar) {
        int iZzd = zzd(zzmkVar, bArr, i8, i9, zzikVar);
        zzkzVar.add(zzikVar.zzc);
        while (iZzd < i9) {
            int iZzi = zzi(bArr, iZzd, zzikVar);
            if (i7 != zzikVar.zza) {
                break;
            }
            iZzd = zzd(zzmkVar, bArr, iZzi, i9, zzikVar);
            zzkzVar.add(zzikVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i7, zzkz zzkzVar, zzik zzikVar) {
        zzkt zzktVar = (zzkt) zzkzVar;
        int iZzi = zzi(bArr, i7, zzikVar);
        int i8 = zzikVar.zza + iZzi;
        while (iZzi < i8) {
            iZzi = zzi(bArr, iZzi, zzikVar);
            zzktVar.zzh(zzikVar.zza);
        }
        if (iZzi == i8) {
            return iZzi;
        }
        throw zzlc.zzi();
    }

    public static int zzg(byte[] bArr, int i7, zzik zzikVar) {
        int iZzi = zzi(bArr, i7, zzikVar);
        int i8 = zzikVar.zza;
        if (i8 < 0) {
            throw zzlc.zzf();
        }
        if (i8 == 0) {
            zzikVar.zzc = "";
            return iZzi;
        }
        zzikVar.zzc = new String(bArr, iZzi, i8, zzla.zza);
        return iZzi + i8;
    }

    public static int zzh(int i7, byte[] bArr, int i8, int i9, zznc zzncVar, zzik zzikVar) {
        if ((i7 >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzl = zzl(bArr, i8, zzikVar);
            zzncVar.zzj(i7, Long.valueOf(zzikVar.zzb));
            return iZzl;
        }
        if (i10 == 1) {
            zzncVar.zzj(i7, Long.valueOf(zzp(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzi = zzi(bArr, i8, zzikVar);
            int i11 = zzikVar.zza;
            if (i11 < 0) {
                throw zzlc.zzf();
            }
            if (i11 > bArr.length - iZzi) {
                throw zzlc.zzi();
            }
            if (i11 == 0) {
                zzncVar.zzj(i7, zziv.zzb);
            } else {
                zzncVar.zzj(i7, zziv.zzk(bArr, iZzi, i11));
            }
            return iZzi + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzlc.zzc();
            }
            zzncVar.zzj(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zznc zzncVarZzf = zznc.zzf();
        int i13 = 0;
        while (i8 < i9) {
            int iZzi2 = zzi(bArr, i8, zzikVar);
            int i14 = zzikVar.zza;
            i13 = i14;
            if (i14 == i12) {
                i8 = iZzi2;
                break;
            }
            int iZzh = zzh(i13, bArr, iZzi2, i9, zzncVarZzf, zzikVar);
            i13 = i14;
            i8 = iZzh;
        }
        if (i8 > i9 || i13 != i12) {
            throw zzlc.zzg();
        }
        zzncVar.zzj(i7, zzncVarZzf);
        return i8;
    }

    public static int zzi(byte[] bArr, int i7, zzik zzikVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzj(b7, bArr, i8, zzikVar);
        }
        zzikVar.zza = b7;
        return i8;
    }

    public static int zzj(int i7, byte[] bArr, int i8, zzik zzikVar) {
        byte b7 = bArr[i8];
        int i9 = i8 + 1;
        int i10 = i7 & 127;
        if (b7 >= 0) {
            zzikVar.zza = i10 | (b7 << 7);
            return i9;
        }
        int i11 = i10 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzikVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzikVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzikVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzikVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzk(int i7, byte[] bArr, int i8, int i9, zzkz zzkzVar, zzik zzikVar) {
        zzkt zzktVar = (zzkt) zzkzVar;
        int iZzi = zzi(bArr, i8, zzikVar);
        zzktVar.zzh(zzikVar.zza);
        while (iZzi < i9) {
            int iZzi2 = zzi(bArr, iZzi, zzikVar);
            if (i7 != zzikVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzikVar);
            zzktVar.zzh(zzikVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i7, zzik zzikVar) {
        long j = bArr[i7];
        int i8 = i7 + 1;
        if (j >= 0) {
            zzikVar.zzb = j;
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
        zzikVar.zzb = j3;
        return i9;
    }

    public static int zzm(Object obj, zzmk zzmkVar, byte[] bArr, int i7, int i8, int i9, zzik zzikVar) {
        int iZzc = ((zzma) zzmkVar).zzc(obj, bArr, i7, i8, i9, zzikVar);
        zzikVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzmk zzmkVar, byte[] bArr, int i7, int i8, zzik zzikVar) {
        int iZzj = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZzj = zzj(i9, bArr, iZzj, zzikVar);
            i9 = zzikVar.zza;
        }
        int i10 = iZzj;
        if (i9 < 0 || i9 > i8 - i10) {
            throw zzlc.zzi();
        }
        int i11 = i9 + i10;
        zzmkVar.zzi(obj, bArr, i10, i11, zzikVar);
        zzikVar.zzc = obj;
        return i11;
    }

    public static int zzo(int i7, byte[] bArr, int i8, int i9, zzik zzikVar) {
        if ((i7 >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return zzl(bArr, i8, zzikVar);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return zzi(bArr, i8, zzikVar) + zzikVar.zza;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw zzlc.zzc();
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = zzi(bArr, i8, zzikVar);
            i12 = zzikVar.zza;
            if (i12 == i11) {
                break;
            }
            i8 = zzo(i12, bArr, i8, i9, zzikVar);
        }
        if (i8 > i9 || i12 != i11) {
            throw zzlc.zzg();
        }
        return i8;
    }

    public static long zzp(byte[] bArr, int i7) {
        return (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48) | ((((long) bArr[i7 + 7]) & 255) << 56);
    }
}
