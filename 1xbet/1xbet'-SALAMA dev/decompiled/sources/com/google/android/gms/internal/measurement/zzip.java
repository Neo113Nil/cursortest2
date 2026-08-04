package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzip {
    public static int zza(byte[] bArr, int i7, zzio zzioVar) {
        int iZzj = zzj(bArr, i7, zzioVar);
        int i8 = zzioVar.zza;
        if (i8 < 0) {
            throw zzkm.zzd();
        }
        if (i8 > bArr.length - iZzj) {
            throw zzkm.zzf();
        }
        if (i8 == 0) {
            zzioVar.zzc = zzjb.zzb;
            return iZzj;
        }
        zzioVar.zzc = zzjb.zzl(bArr, iZzj, i8);
        return iZzj + i8;
    }

    public static int zzb(byte[] bArr, int i7) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int zzc(zzlu zzluVar, byte[] bArr, int i7, int i8, int i9, zzio zzioVar) {
        zzlm zzlmVar = (zzlm) zzluVar;
        Object objZze = zzlmVar.zze();
        int iZzc = zzlmVar.zzc(objZze, bArr, i7, i8, i9, zzioVar);
        zzlmVar.zzf(objZze);
        zzioVar.zzc = objZze;
        return iZzc;
    }

    public static int zzd(zzlu zzluVar, byte[] bArr, int i7, int i8, zzio zzioVar) {
        int iZzk = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iZzk = zzk(i9, bArr, iZzk, zzioVar);
            i9 = zzioVar.zza;
        }
        int i10 = iZzk;
        if (i9 < 0 || i9 > i8 - i10) {
            throw zzkm.zzf();
        }
        Object objZze = zzluVar.zze();
        int i11 = i9 + i10;
        zzluVar.zzh(objZze, bArr, i10, i11, zzioVar);
        zzluVar.zzf(objZze);
        zzioVar.zzc = objZze;
        return i11;
    }

    public static int zze(zzlu zzluVar, int i7, byte[] bArr, int i8, int i9, zzkj zzkjVar, zzio zzioVar) {
        int iZzd = zzd(zzluVar, bArr, i8, i9, zzioVar);
        zzkjVar.add(zzioVar.zzc);
        while (iZzd < i9) {
            int iZzj = zzj(bArr, iZzd, zzioVar);
            if (i7 != zzioVar.zza) {
                break;
            }
            iZzd = zzd(zzluVar, bArr, iZzj, i9, zzioVar);
            zzkjVar.add(zzioVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i7, zzkj zzkjVar, zzio zzioVar) {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int iZzj = zzj(bArr, i7, zzioVar);
        int i8 = zzioVar.zza + iZzj;
        while (iZzj < i8) {
            iZzj = zzj(bArr, iZzj, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        if (iZzj == i8) {
            return iZzj;
        }
        throw zzkm.zzf();
    }

    public static int zzg(byte[] bArr, int i7, zzio zzioVar) throws zzkm {
        int iZzj = zzj(bArr, i7, zzioVar);
        int i8 = zzioVar.zza;
        if (i8 < 0) {
            throw zzkm.zzd();
        }
        if (i8 == 0) {
            zzioVar.zzc = "";
            return iZzj;
        }
        zzioVar.zzc = new String(bArr, iZzj, i8, zzkk.zzb);
        return iZzj + i8;
    }

    public static int zzh(byte[] bArr, int i7, zzio zzioVar) throws zzkm {
        int iZzj = zzj(bArr, i7, zzioVar);
        int i8 = zzioVar.zza;
        if (i8 < 0) {
            throw zzkm.zzd();
        }
        if (i8 == 0) {
            zzioVar.zzc = "";
            return iZzj;
        }
        zzioVar.zzc = zzna.zzd(bArr, iZzj, i8);
        return iZzj + i8;
    }

    public static int zzi(int i7, byte[] bArr, int i8, int i9, zzmm zzmmVar, zzio zzioVar) {
        if ((i7 >>> 3) == 0) {
            throw zzkm.zzb();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iZzm = zzm(bArr, i8, zzioVar);
            zzmmVar.zzh(i7, Long.valueOf(zzioVar.zzb));
            return iZzm;
        }
        if (i10 == 1) {
            zzmmVar.zzh(i7, Long.valueOf(zzn(bArr, i8)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iZzj = zzj(bArr, i8, zzioVar);
            int i11 = zzioVar.zza;
            if (i11 < 0) {
                throw zzkm.zzd();
            }
            if (i11 > bArr.length - iZzj) {
                throw zzkm.zzf();
            }
            if (i11 == 0) {
                zzmmVar.zzh(i7, zzjb.zzb);
            } else {
                zzmmVar.zzh(i7, zzjb.zzl(bArr, iZzj, i11));
            }
            return iZzj + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw zzkm.zzb();
            }
            zzmmVar.zzh(i7, Integer.valueOf(zzb(bArr, i8)));
            return i8 + 4;
        }
        int i12 = (i7 & (-8)) | 4;
        zzmm zzmmVarZze = zzmm.zze();
        int i13 = 0;
        while (i8 < i9) {
            int iZzj2 = zzj(bArr, i8, zzioVar);
            int i14 = zzioVar.zza;
            if (i14 == i12) {
                i13 = i14;
                i8 = iZzj2;
                break;
            }
            i13 = i14;
            i8 = zzi(i14, bArr, iZzj2, i9, zzmmVarZze, zzioVar);
        }
        if (i8 > i9 || i13 != i12) {
            throw zzkm.zze();
        }
        zzmmVar.zzh(i7, zzmmVarZze);
        return i8;
    }

    public static int zzj(byte[] bArr, int i7, zzio zzioVar) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return zzk(b7, bArr, i8, zzioVar);
        }
        zzioVar.zza = b7;
        return i8;
    }

    public static int zzk(int i7, byte[] bArr, int i8, zzio zzioVar) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            zzioVar.zza = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            zzioVar.zza = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            zzioVar.zza = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            zzioVar.zza = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                zzioVar.zza = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int zzl(int i7, byte[] bArr, int i8, int i9, zzkj zzkjVar, zzio zzioVar) {
        zzkd zzkdVar = (zzkd) zzkjVar;
        int iZzj = zzj(bArr, i8, zzioVar);
        zzkdVar.zzh(zzioVar.zza);
        while (iZzj < i9) {
            int iZzj2 = zzj(bArr, iZzj, zzioVar);
            if (i7 != zzioVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzioVar);
            zzkdVar.zzh(zzioVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i7, zzio zzioVar) {
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            zzioVar.zzb = j;
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
        zzioVar.zzb = j3;
        return i9;
    }

    public static long zzn(byte[] bArr, int i7) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }
}
