package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzkw {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzkv zzkvVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zzkvVar);
        }
        zzkvVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, com.google.android.gms.internal.measurement.zzkv zzkvVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzkvVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzkvVar.zza = i5 | (b2 << com.google.common.base.Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzkvVar.zza = i7 | (b3 << com.google.common.base.Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzkvVar.zza = i9 | (b4 << com.google.common.base.Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzkvVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzkv zzkvVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzkvVar.zzb = j;
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
        zzkvVar.zzb = j2;
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

    static int zzf(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws com.google.android.gms.internal.measurement.zzmq {
        int i2;
        int zza2 = zza(bArr, i, zzkvVar);
        int i3 = zzkvVar.zza;
        if (i3 < 0) {
            throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i3 == 0) {
            zzkvVar.zzc = "";
            return zza2;
        }
        int i4 = com.google.android.gms.internal.measurement.zzor.zza;
        int length = bArr.length;
        if ((((length - zza2) - i3) | zza2 | i3) < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(java.lang.String.format("buffer length=%d, index=%d, size=%d", java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(zza2), java.lang.Integer.valueOf(i3)));
        }
        int i5 = zza2 + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (zza2 < i5) {
            byte b = bArr[zza2];
            if (!com.google.android.gms.internal.measurement.zzop.zza(b)) {
                break;
            }
            zza2++;
            cArr[i6] = (char) b;
            i6++;
        }
        while (zza2 < i5) {
            int i7 = zza2 + 1;
            byte b2 = bArr[zza2];
            if (com.google.android.gms.internal.measurement.zzop.zza(b2)) {
                cArr[i6] = (char) b2;
                i6++;
                zza2 = i7;
                while (zza2 < i5) {
                    byte b3 = bArr[zza2];
                    if (com.google.android.gms.internal.measurement.zzop.zza(b3)) {
                        zza2++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                }
            } else {
                if (b2 < -32) {
                    if (i7 >= i5) {
                        throw new com.google.android.gms.internal.measurement.zzmq("Protocol message had invalid UTF-8.");
                    }
                    i2 = i6 + 1;
                    zza2 += 2;
                    com.google.android.gms.internal.measurement.zzop.zzb(b2, bArr[i7], cArr, i6);
                } else if (b2 < -16) {
                    if (i7 >= i5 - 1) {
                        throw new com.google.android.gms.internal.measurement.zzmq("Protocol message had invalid UTF-8.");
                    }
                    i2 = i6 + 1;
                    int i8 = zza2 + 2;
                    zza2 += 3;
                    com.google.android.gms.internal.measurement.zzop.zzc(b2, bArr[i7], bArr[i8], cArr, i6);
                } else {
                    if (i7 >= i5 - 2) {
                        throw new com.google.android.gms.internal.measurement.zzmq("Protocol message had invalid UTF-8.");
                    }
                    byte b4 = bArr[i7];
                    int i9 = zza2 + 3;
                    byte b5 = bArr[zza2 + 2];
                    zza2 += 4;
                    com.google.android.gms.internal.measurement.zzop.zzd(b2, b4, b5, bArr[i9], cArr, i6);
                    i6 += 2;
                }
                i6 = i2;
            }
        }
        zzkvVar.zzc = new java.lang.String(cArr, 0, i6);
        return i5;
    }

    static int zzg(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws com.google.android.gms.internal.measurement.zzmq {
        int zza2 = zza(bArr, i, zzkvVar);
        int i2 = zzkvVar.zza;
        if (i2 < 0) {
            throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - zza2) {
            throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzkvVar.zzc = com.google.android.gms.internal.measurement.zzlg.zzb;
            return zza2;
        }
        zzkvVar.zzc = com.google.android.gms.internal.measurement.zzlg.zzh(bArr, zza2, i2);
        return zza2 + i2;
    }

    static int zzh(com.google.android.gms.internal.measurement.zznw zznwVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        java.lang.Object zza2 = zznwVar.zza();
        int zzj = zzj(zza2, zznwVar, bArr, i, i2, zzkvVar);
        zznwVar.zzj(zza2);
        zzkvVar.zzc = zza2;
        return zzj;
    }

    static int zzi(com.google.android.gms.internal.measurement.zznw zznwVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        java.lang.Object zza2 = zznwVar.zza();
        int zzk = zzk(zza2, zznwVar, bArr, i, i2, i3, zzkvVar);
        zznwVar.zzj(zza2);
        zzkvVar.zzc = zza2;
        return zzk;
    }

    static int zzj(java.lang.Object obj, com.google.android.gms.internal.measurement.zznw zznwVar, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzb(i4, bArr, i3, zzkvVar);
            i4 = zzkvVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = zzkvVar.zze + 1;
        zzkvVar.zze = i6;
        zzq(i6);
        int i7 = i4 + i5;
        zznwVar.zzi(obj, bArr, i5, i7, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return i7;
    }

    static int zzk(java.lang.Object obj, com.google.android.gms.internal.measurement.zznw zznwVar, byte[] bArr, int i, int i2, int i3, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzno zznoVar = (com.google.android.gms.internal.measurement.zzno) zznwVar;
        int i4 = zzkvVar.zze + 1;
        zzkvVar.zze = i4;
        zzq(i4);
        int zzh = zznoVar.zzh(obj, bArr, i, i2, i3, zzkvVar);
        zzkvVar.zze--;
        zzkvVar.zzc = obj;
        return zzh;
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.measurement.zzmn zzmnVar, com.google.android.gms.internal.measurement.zzkv zzkvVar) {
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) zzmnVar;
        int zza2 = zza(bArr, i2, zzkvVar);
        zzmfVar.zzh(zzkvVar.zza);
        while (zza2 < i3) {
            int zza3 = zza(bArr, zza2, zzkvVar);
            if (i != zzkvVar.zza) {
                break;
            }
            zza2 = zza(bArr, zza3, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        return zza2;
    }

    static int zzm(byte[] bArr, int i, com.google.android.gms.internal.measurement.zzmn zzmnVar, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzmf zzmfVar = (com.google.android.gms.internal.measurement.zzmf) zzmnVar;
        int zza2 = zza(bArr, i, zzkvVar);
        int i2 = zzkvVar.zza + zza2;
        while (zza2 < i2) {
            zza2 = zza(bArr, zza2, zzkvVar);
            zzmfVar.zzh(zzkvVar.zza);
        }
        if (zza2 == i2) {
            return zza2;
        }
        throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(com.google.android.gms.internal.measurement.zznw zznwVar, int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.measurement.zzmn zzmnVar, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        int zzh = zzh(zznwVar, bArr, i2, i3, zzkvVar);
        zzmnVar.add(zzkvVar.zzc);
        while (zzh < i3) {
            int zza2 = zza(bArr, zzh, zzkvVar);
            if (i != zzkvVar.zza) {
                break;
            }
            zzh = zzh(zznwVar, bArr, zza2, i3, zzkvVar);
            zzmnVar.add(zzkvVar.zzc);
        }
        return zzh;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.measurement.zzoi zzoiVar, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws com.google.android.gms.internal.measurement.zzmq {
        if ((i >>> 3) == 0) {
            throw new com.google.android.gms.internal.measurement.zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzc = zzc(bArr, i2, zzkvVar);
            zzoiVar.zzk(i, java.lang.Long.valueOf(zzkvVar.zzb));
            return zzc;
        }
        if (i4 == 1) {
            zzoiVar.zzk(i, java.lang.Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zza2 = zza(bArr, i2, zzkvVar);
            int i5 = zzkvVar.zza;
            if (i5 < 0) {
                throw new com.google.android.gms.internal.measurement.zzmq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - zza2) {
                throw new com.google.android.gms.internal.measurement.zzmq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzoiVar.zzk(i, com.google.android.gms.internal.measurement.zzlg.zzb);
            } else {
                zzoiVar.zzk(i, com.google.android.gms.internal.measurement.zzlg.zzh(bArr, zza2, i5));
            }
            return zza2 + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new com.google.android.gms.internal.measurement.zzmq("Protocol message contained an invalid tag (zero).");
            }
            zzoiVar.zzk(i, java.lang.Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        com.google.android.gms.internal.measurement.zzoi zzb2 = com.google.android.gms.internal.measurement.zzoi.zzb();
        int i7 = zzkvVar.zze + 1;
        zzkvVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zza3 = zza(bArr, i2, zzkvVar);
            i8 = zzkvVar.zza;
            if (i8 == i6) {
                i2 = zza3;
                break;
            }
            i2 = zzo(i8, bArr, zza3, i3, zzb2, zzkvVar);
        }
        zzkvVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new com.google.android.gms.internal.measurement.zzmq("Failed to parse the message.");
        }
        zzoiVar.zzk(i, zzb2);
        return i2;
    }

    static int zzp(int i, byte[] bArr, int i2, int i3, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws com.google.android.gms.internal.measurement.zzmq {
        if ((i >>> 3) == 0) {
            throw new com.google.android.gms.internal.measurement.zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zzkvVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zzkvVar) + zzkvVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new com.google.android.gms.internal.measurement.zzmq("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zzkvVar);
            i6 = zzkvVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzp(i6, bArr, i2, i3, zzkvVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw new com.google.android.gms.internal.measurement.zzmq("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws com.google.android.gms.internal.measurement.zzmq {
        if (i >= zzb) {
            throw new com.google.android.gms.internal.measurement.zzmq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
