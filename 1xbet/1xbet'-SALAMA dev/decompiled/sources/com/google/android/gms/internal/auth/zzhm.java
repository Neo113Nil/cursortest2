package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzhm {
    private static final zzhk zza;

    static {
        if (zzhi.zzu() && zzhi.zzv()) {
            int i7 = zzdr.zza;
        }
        zza = new zzhl();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 != 0) {
            if (i9 == 1) {
                byte b8 = bArr[i7];
                if (b7 <= -12 && b8 <= -65) {
                    return b7 ^ (b8 << 8);
                }
            } else {
                if (i9 != 2) {
                    throw new AssertionError();
                }
                byte b9 = bArr[i7];
                byte b10 = bArr[i7 + 1];
                if (b7 <= -12 && b9 <= -65 && b10 <= -65) {
                    return ((b9 << 8) ^ b7) ^ (b10 << 16);
                }
            }
        } else if (b7 <= -12) {
            return b7;
        }
        return -1;
    }

    public static String zzb(byte[] bArr, int i7, int i8) throws zzfa {
        int length = bArr.length;
        if ((i7 | i8 | ((length - i7) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i9 = i7 + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i7 < i9) {
            byte b7 = bArr[i7];
            if (!zzhj.zzd(b7)) {
                break;
            }
            i7++;
            cArr[i10] = (char) b7;
            i10++;
        }
        int i11 = i10;
        while (i7 < i9) {
            int i12 = i7 + 1;
            byte b8 = bArr[i7];
            if (zzhj.zzd(b8)) {
                cArr[i11] = (char) b8;
                i11++;
                i7 = i12;
                while (i7 < i9) {
                    byte b9 = bArr[i7];
                    if (!zzhj.zzd(b9)) {
                        break;
                    }
                    i7++;
                    cArr[i11] = (char) b9;
                    i11++;
                }
            } else if (b8 < -32) {
                if (i12 >= i9) {
                    throw zzfa.zzb();
                }
                i7 += 2;
                zzhj.zzc(b8, bArr[i12], cArr, i11);
                i11++;
            } else if (b8 < -16) {
                if (i12 >= i9 - 1) {
                    throw zzfa.zzb();
                }
                int i13 = i7 + 2;
                i7 += 3;
                zzhj.zzb(b8, bArr[i12], bArr[i13], cArr, i11);
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw zzfa.zzb();
                }
                int i14 = i7 + 2;
                int i15 = i7 + 3;
                i7 += 4;
                zzhj.zza(b8, bArr[i12], bArr[i14], bArr[i15], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    public static boolean zzc(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzd(byte[] bArr, int i7, int i8) {
        return zza.zzb(bArr, i7, i8);
    }
}
