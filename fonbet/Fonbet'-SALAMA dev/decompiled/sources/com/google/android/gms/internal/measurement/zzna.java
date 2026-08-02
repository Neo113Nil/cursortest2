package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzna {
    private static final zzmx zza;

    static {
        if (zzmv.zzx() && zzmv.zzy()) {
            int i7 = zzin.zza;
        }
        zza = new zzmy();
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fb, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(CharSequence charSequence, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char charAt;
        int length = charSequence.length();
        int i11 = i8 + i7;
        int i12 = 0;
        while (i12 < length && (i10 = i12 + i7) < i11 && (charAt = charSequence.charAt(i12)) < 128) {
            bArr[i10] = (byte) charAt;
            i12++;
        }
        int i13 = i7 + i12;
        while (i12 < length) {
            char charAt2 = charSequence.charAt(i12);
            if (charAt2 < 128 && i13 < i11) {
                bArr[i13] = (byte) charAt2;
                i13++;
            } else if (charAt2 < 2048 && i13 <= i11 - 2) {
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((charAt2 >>> 6) | 960);
                i13 += 2;
                bArr[i14] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i13 > i11 - 3) {
                    if (i13 > i11 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i9 = i12 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i9)))) {
                            throw new zzmz(i12, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i13);
                    }
                    int i15 = i12 + 1;
                    if (i15 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i15);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i16 = i13 + 3;
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i12 = i15;
                        } else {
                            i12 = i15;
                        }
                    }
                    throw new zzmz(i12 - 1, length);
                }
                bArr[i13] = (byte) ((charAt2 >>> '\f') | 480);
                int i17 = i13 + 2;
                bArr[i13 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i13 += 3;
                bArr[i17] = (byte) ((charAt2 & '?') | 128);
            }
            i12++;
        }
        return i13;
    }

    public static int zzc(CharSequence charSequence) {
        int length = charSequence.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && charSequence.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = charSequence.length();
                while (i8 < length2) {
                    char charAt2 = charSequence.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i8) < 65536) {
                                throw new zzmz(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
            }
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i9 + 4294967296L));
    }

    public static String zzd(byte[] bArr, int i7, int i8) {
        int length = bArr.length;
        if ((i7 | i8 | ((length - i7) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i9 = i7 + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i7 < i9) {
            byte b7 = bArr[i7];
            if (!zzmw.zzd(b7)) {
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
            if (zzmw.zzd(b8)) {
                cArr[i11] = (char) b8;
                i11++;
                i7 = i12;
                while (i7 < i9) {
                    byte b9 = bArr[i7];
                    if (!zzmw.zzd(b9)) {
                        break;
                    }
                    i7++;
                    cArr[i11] = (char) b9;
                    i11++;
                }
            } else if (b8 < -32) {
                if (i12 >= i9) {
                    throw zzkm.zzc();
                }
                i7 += 2;
                zzmw.zzc(b8, bArr[i12], cArr, i11);
                i11++;
            } else if (b8 < -16) {
                if (i12 >= i9 - 1) {
                    throw zzkm.zzc();
                }
                int i13 = i7 + 2;
                i7 += 3;
                zzmw.zzb(b8, bArr[i12], bArr[i13], cArr, i11);
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw zzkm.zzc();
                }
                int i14 = i7 + 2;
                int i15 = i7 + 3;
                i7 += 4;
                zzmw.zza(b8, bArr[i12], bArr[i14], bArr[i15], cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    public static boolean zze(byte[] bArr) {
        return zza.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzf(byte[] bArr, int i7, int i8) {
        return zza.zzb(bArr, i7, i8);
    }
}
