package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzicp {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.ads.zzico zzicoVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzicoVar);
        }
        zzicoVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, com.google.android.gms.internal.ads.zzico zzicoVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzicoVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzicoVar.zza = i5 | (b2 << com.google.common.base.Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzicoVar.zza = i7 | (b3 << com.google.common.base.Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzicoVar.zza = i9 | (b4 << com.google.common.base.Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzicoVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, com.google.android.gms.internal.ads.zzico zzicoVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzicoVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzicoVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long zze(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static int zzf(byte[] bArr, int i, com.google.android.gms.internal.ads.zzico zzicoVar) throws com.google.android.gms.internal.ads.zziet {
        int zza2 = zza(bArr, i, zzicoVar);
        int i2 = zzicoVar.zza;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zzicoVar.zzc = "";
            return zza2;
        }
        zzicoVar.zzc = com.google.android.gms.internal.ads.zzihf.zze(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzg(byte[] bArr, int i, com.google.android.gms.internal.ads.zzico zzicoVar) throws com.google.android.gms.internal.ads.zziet {
        int zza2 = zza(bArr, i, zzicoVar);
        int i2 = zzicoVar.zza;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzicoVar.zzc = com.google.android.gms.internal.ads.zzida.zza;
            return zza2;
        }
        zzicoVar.zzc = com.google.android.gms.internal.ads.zzida.zzt(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzh(com.google.android.gms.internal.ads.zzigh zzighVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        java.lang.Object zza2 = zzighVar.zza();
        int zzj = zzj(zza2, zzighVar, bArr, i, i2, zzicoVar);
        zzighVar.zzk(zza2);
        zzicoVar.zzc = zza2;
        return zzj;
    }

    static int zzi(com.google.android.gms.internal.ads.zzigh zzighVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        java.lang.Object zza2 = zzighVar.zza();
        int zzk = zzk(zza2, zzighVar, bArr, i, i2, i3, zzicoVar);
        zzighVar.zzk(zza2);
        zzicoVar.zzc = zza2;
        return zzk;
    }

    static int zzj(java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzicoVar);
            i4 = zzicoVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzicoVar.zze + 1;
        zzicoVar.zze = i6;
        zzq(i6);
        int i7 = i4 + i5;
        zzighVar.zzj(obj, bArr, i5, i7, zzicoVar);
        zzicoVar.zze--;
        zzicoVar.zzc = obj;
        return i7;
    }

    static int zzk(java.lang.Object obj, com.google.android.gms.internal.ads.zzigh zzighVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzifs zzifsVar = (com.google.android.gms.internal.ads.zzifs) zzighVar;
        int i4 = zzicoVar.zze + 1;
        zzicoVar.zze = i4;
        zzq(i4);
        int zzi = zzifsVar.zzi(obj, bArr, i, i2, i3, zzicoVar);
        zzicoVar.zze--;
        zzicoVar.zzc = obj;
        return zzi;
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.ads.zzieq zzieqVar, com.google.android.gms.internal.ads.zzico zzicoVar) {
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) zzieqVar;
        int zza2 = zza(bArr, i2, zzicoVar);
        zziefVar.zzi(zzicoVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zzicoVar);
            if (i != zzicoVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzicoVar);
            zziefVar.zzi(zzicoVar.zza);
        }
        return zza2;
    }

    static int zzm(byte[] bArr, int i, com.google.android.gms.internal.ads.zzieq zzieqVar, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzief zziefVar = (com.google.android.gms.internal.ads.zzief) zzieqVar;
        int zza2 = zza(bArr, i, zzicoVar);
        int i2 = zzicoVar.zza + zza2;
        while (zza2 < i2) {
            zza2 = zza(bArr, zza2, zzicoVar);
            zziefVar.zzi(zzicoVar.zza);
        }
        if (zza2 == i2) {
            return zza2;
        }
        throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(com.google.android.gms.internal.ads.zzigh zzighVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.ads.zzieq zzieqVar, com.google.android.gms.internal.ads.zzico zzicoVar) throws java.io.IOException {
        int zzh = zzh(zzighVar, bArr, i2, i3, zzicoVar);
        zzieqVar.add(zzicoVar.zzc);
        while (zzh < i3) {
            int zza2 = zza(bArr, zzh, zzicoVar);
            if (i != zzicoVar.zza) {
                break;
            }
            zzh = zzh(zzighVar, bArr, zza2, i3, zzicoVar);
            zzieqVar.add(zzicoVar.zzc);
        }
        return zzh;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.ads.zzigu zziguVar, com.google.android.gms.internal.ads.zzico zzicoVar) throws com.google.android.gms.internal.ads.zziet {
        if ((i >>> 3) == 0) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zzicoVar);
            zziguVar.zzk(i, java.lang.Long.valueOf(zzicoVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zziguVar.zzk(i, java.lang.Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zzicoVar);
            int i5 = zzicoVar.zza;
            if (i5 < 0) {
                throw new com.google.android.gms.internal.ads.zziet("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zza2) {
                throw new com.google.android.gms.internal.ads.zziet("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zziguVar.zzk(i, com.google.android.gms.internal.ads.zzida.zza);
            } else {
                zziguVar.zzk(i, com.google.android.gms.internal.ads.zzida.zzt(bArr, zza2, i5));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new com.google.android.gms.internal.ads.zziet("Protocol message contained an invalid tag (zero).");
            }
            zziguVar.zzk(i, java.lang.Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        com.google.android.gms.internal.ads.zzigu zzb2 = com.google.android.gms.internal.ads.zzigu.zzb();
        int i7 = zzicoVar.zze + 1;
        zzicoVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zzicoVar);
            i8 = zzicoVar.zza;
            if (i8 == i6) {
                i2 = zza3;
                break;
            }
            i2 = zzo(i8, bArr, zza3, i3, zzb2, zzicoVar);
        }
        zzicoVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new com.google.android.gms.internal.ads.zziet("Failed to parse the message.");
        }
        zziguVar.zzk(i, zzb2);
        return i2;
    }

    static int zzp(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.ads.zzico zzicoVar) throws com.google.android.gms.internal.ads.zziet {
        if ((i >>> 3) == 0) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zzicoVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzicoVar) + zzicoVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new com.google.android.gms.internal.ads.zziet("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzicoVar);
            i6 = zzicoVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zzicoVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new com.google.android.gms.internal.ads.zziet("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws com.google.android.gms.internal.ads.zziet {
        if (i >= zzb) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
