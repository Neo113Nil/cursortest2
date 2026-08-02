package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzdu {
    static int zza(byte[] bArr, int i, com.google.android.gms.internal.auth.zzdt zzdtVar) throws com.google.android.gms.internal.auth.zzfb {
        int zzh = zzh(bArr, i, zzdtVar);
        int i2 = zzdtVar.zza;
        if (i2 < 0) {
            throw com.google.android.gms.internal.auth.zzfb.zzc();
        }
        if (i2 > bArr.length - zzh) {
            throw com.google.android.gms.internal.auth.zzfb.zzf();
        }
        if (i2 == 0) {
            zzdtVar.zzc = com.google.android.gms.internal.auth.zzef.zzb;
            return zzh;
        }
        zzdtVar.zzc = com.google.android.gms.internal.auth.zzef.zzk(bArr, zzh, i2);
        return zzh + i2;
    }

    static int zzb(byte[] bArr, int i) {
        byte b = bArr[i];
        return ((bArr[i + 3] & 255) << 24) | ((bArr[i + 1] & 255) << 8) | (b & 255) | ((bArr[i + 2] & 255) << 16);
    }

    static int zzc(com.google.android.gms.internal.auth.zzgi zzgiVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        java.lang.Object zzd = zzgiVar.zzd();
        int zzl = zzl(zzd, zzgiVar, bArr, i, i2, i3, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzl;
    }

    static int zzd(com.google.android.gms.internal.auth.zzgi zzgiVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        java.lang.Object zzd = zzgiVar.zzd();
        int zzm = zzm(zzd, zzgiVar, bArr, i, i2, zzdtVar);
        zzgiVar.zze(zzd);
        zzdtVar.zzc = zzd;
        return zzm;
    }

    static int zze(com.google.android.gms.internal.auth.zzgi zzgiVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.auth.zzez zzezVar, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        int zzd = zzd(zzgiVar, bArr, i2, i3, zzdtVar);
        zzezVar.add(zzdtVar.zzc);
        while (zzd < i3) {
            int zzh = zzh(bArr, zzd, zzdtVar);
            if (i != zzdtVar.zza) {
                break;
            }
            zzd = zzd(zzgiVar, bArr, zzh, i3, zzdtVar);
            zzezVar.add(zzdtVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, com.google.android.gms.internal.auth.zzez zzezVar, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        com.google.android.gms.internal.auth.zzew zzewVar = (com.google.android.gms.internal.auth.zzew) zzezVar;
        int zzh = zzh(bArr, i, zzdtVar);
        int i2 = zzdtVar.zza + zzh;
        while (zzh < i2) {
            zzh = zzh(bArr, zzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (zzh == i2) {
            return zzh;
        }
        throw com.google.android.gms.internal.auth.zzfb.zzf();
    }

    static int zzg(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.auth.zzha zzhaVar, com.google.android.gms.internal.auth.zzdt zzdtVar) throws com.google.android.gms.internal.auth.zzfb {
        if ((i >>> 3) == 0) {
            throw com.google.android.gms.internal.auth.zzfb.zza();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzk = zzk(bArr, i2, zzdtVar);
            zzhaVar.zzh(i, java.lang.Long.valueOf(zzdtVar.zzb));
            return zzk;
        }
        if (i4 == 1) {
            zzhaVar.zzh(i, java.lang.Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzh = zzh(bArr, i2, zzdtVar);
            int i5 = zzdtVar.zza;
            if (i5 < 0) {
                throw com.google.android.gms.internal.auth.zzfb.zzc();
            }
            if (i5 > bArr.length - zzh) {
                throw com.google.android.gms.internal.auth.zzfb.zzf();
            }
            if (i5 == 0) {
                zzhaVar.zzh(i, com.google.android.gms.internal.auth.zzef.zzb);
            } else {
                zzhaVar.zzh(i, com.google.android.gms.internal.auth.zzef.zzk(bArr, zzh, i5));
            }
            return zzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw com.google.android.gms.internal.auth.zzfb.zza();
            }
            zzhaVar.zzh(i, java.lang.Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        com.google.android.gms.internal.auth.zzha zzd = com.google.android.gms.internal.auth.zzha.zzd();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzh2 = zzh(bArr, i2, zzdtVar);
            int i8 = zzdtVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = zzh2;
                break;
            }
            int zzg = zzg(i7, bArr, zzh2, i3, zzd, zzdtVar);
            i7 = i8;
            i2 = zzg;
        }
        if (i2 > i3 || i7 != i6) {
            throw com.google.android.gms.internal.auth.zzfb.zzd();
        }
        zzhaVar.zzh(i, zzd);
        return i2;
    }

    static int zzh(byte[] bArr, int i, com.google.android.gms.internal.auth.zzdt zzdtVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzdtVar);
        }
        zzdtVar.zza = b;
        return i2;
    }

    static int zzi(int i, byte[] bArr, int i2, com.google.android.gms.internal.auth.zzdt zzdtVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzdtVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzdtVar.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzdtVar.zza = i7 | (b3 << com.google.common.base.Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzdtVar.zza = i9 | (b4 << com.google.common.base.Ascii.FS);
            return i10;
        }
        while (true) {
            int i11 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzdtVar.zza = i9 | ((b4 & Byte.MAX_VALUE) << 28);
                return i11;
            }
            i10 = i11;
        }
    }

    static int zzj(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.auth.zzez zzezVar, com.google.android.gms.internal.auth.zzdt zzdtVar) {
        com.google.android.gms.internal.auth.zzew zzewVar = (com.google.android.gms.internal.auth.zzew) zzezVar;
        int zzh = zzh(bArr, i2, zzdtVar);
        zzewVar.zze(zzdtVar.zza);
        while (zzh < i3) {
            int zzh2 = zzh(bArr, zzh, zzdtVar);
            if (i != zzdtVar.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        return zzh;
    }

    static int zzk(byte[] bArr, int i, com.google.android.gms.internal.auth.zzdt zzdtVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzdtVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            i3++;
        }
        zzdtVar.zzb = j2;
        return i3;
    }

    static int zzl(java.lang.Object obj, com.google.android.gms.internal.auth.zzgi zzgiVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        int zzb = ((com.google.android.gms.internal.auth.zzga) zzgiVar).zzb(obj, bArr, i, i2, i3, zzdtVar);
        zzdtVar.zzc = obj;
        return zzb;
    }

    static int zzm(java.lang.Object obj, com.google.android.gms.internal.auth.zzgi zzgiVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.auth.zzdt zzdtVar) throws java.io.IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzi(i4, bArr, i3, zzdtVar);
            i4 = zzdtVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw com.google.android.gms.internal.auth.zzfb.zzf();
        }
        int i6 = i4 + i5;
        zzgiVar.zzg(obj, bArr, i5, i6, zzdtVar);
        zzdtVar.zzc = obj;
        return i6;
    }

    static long zzn(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
