package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zznl {
    static {
        if (zzni.zzx() && zzni.zzy()) {
            int i7 = zzij.zza;
        }
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i7, int i8) {
        int i9 = i8 - i7;
        byte b7 = bArr[i7 - 1];
        if (i9 == 0) {
            if (b7 <= -12) {
                return b7;
            }
            return -1;
        }
        if (i9 == 1) {
            byte b8 = bArr[i7];
            if (b7 > -12 || b8 > -65) {
                return -1;
            }
            return (b8 << 8) ^ b7;
        }
        if (i9 != 2) {
            throw new AssertionError();
        }
        byte b9 = bArr[i7];
        byte b10 = bArr[i7 + 1];
        if (b7 > -12 || b9 > -65 || b10 > -65) {
            return -1;
        }
        return (b10 << 16) ^ ((b9 << 8) ^ b7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int zzb(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        int i11;
        char charAt;
        int length = str.length();
        int i12 = 0;
        while (true) {
            i9 = i7 + i8;
            if (i12 >= length || (i11 = i12 + i7) >= i9 || (charAt = str.charAt(i12)) >= 128) {
                break;
            }
            bArr[i11] = (byte) charAt;
            i12++;
        }
        int i13 = i7 + i12;
        while (i12 < length) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < 128 && i13 < i9) {
                bArr[i13] = (byte) charAt2;
                i13++;
            } else if (charAt2 < 2048 && i13 <= i9 - 2) {
                bArr[i13] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i13 + 1] = (byte) ((charAt2 & '?') | 128);
                i13 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i13 > i9 - 3) {
                    if (i13 > i9 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i10 = i12 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i10)))) {
                            throw new zznk(i12, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i13);
                    }
                    int i14 = i12 + 1;
                    if (i14 != str.length()) {
                        char charAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i15 = i13 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i13] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i13 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i13 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i12 = i14;
                        } else {
                            i12 = i14;
                        }
                    }
                    throw new zznk(i12 - 1, length);
                }
                bArr[i13] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i13 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i13 + 2] = (byte) ((charAt2 & '?') | 128);
                i13 += 3;
            }
            i12++;
        }
        return i13;
    }

    public static int zzc(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (true) {
            if (i8 >= length) {
                break;
            }
            char charAt = str.charAt(i8);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i8++;
            } else {
                int length2 = str.length();
                while (i8 < length2) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 2048) {
                        i7 += (127 - charAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) < 65536) {
                                throw new zznk(i8, length2);
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
        int i9;
        int length = bArr.length;
        if ((((length - i7) - i8) | i7 | i8) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i10 = i7 + i8;
        char[] cArr = new char[i8];
        int i11 = 0;
        while (i7 < i10) {
            byte b7 = bArr[i7];
            if (!zznj.zzd(b7)) {
                break;
            }
            i7++;
            cArr[i11] = (char) b7;
            i11++;
        }
        int i12 = i11;
        while (i7 < i10) {
            int i13 = i7 + 1;
            byte b8 = bArr[i7];
            if (zznj.zzd(b8)) {
                cArr[i12] = (char) b8;
                i12++;
                i7 = i13;
                while (i7 < i10) {
                    byte b9 = bArr[i7];
                    if (zznj.zzd(b9)) {
                        i7++;
                        cArr[i12] = (char) b9;
                        i12++;
                    }
                }
            } else {
                if (b8 < -32) {
                    if (i13 >= i10) {
                        throw zzlc.zzd();
                    }
                    i9 = i12 + 1;
                    i7 += 2;
                    zznj.zzc(b8, bArr[i13], cArr, i12);
                } else if (b8 < -16) {
                    if (i13 >= i10 - 1) {
                        throw zzlc.zzd();
                    }
                    i9 = i12 + 1;
                    int i14 = i7 + 2;
                    i7 += 3;
                    zznj.zzb(b8, bArr[i13], bArr[i14], cArr, i12);
                } else {
                    if (i13 >= i10 - 2) {
                        throw zzlc.zzd();
                    }
                    byte b10 = bArr[i13];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    zznj.zza(b8, b10, b11, bArr[i15], cArr, i12);
                    i12 += 2;
                }
                i12 = i9;
            }
        }
        return new String(cArr, 0, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zze(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] >= 0) {
            i7++;
        }
        if (i7 >= i8) {
            return true;
        }
        while (i7 < i8) {
            int i9 = i7 + 1;
            int i10 = bArr[i7];
            if (i10 >= 0) {
                i7 = i9;
            } else if (i10 < -32) {
                if (i9 >= i8) {
                    return i10 == 0;
                }
                if (i10 < -62) {
                    return false;
                }
                i7 += 2;
                if (bArr[i9] > 65471) {
                    return false;
                }
            } else if (i10 < -16) {
                if (i9 >= i8 - 1) {
                    i10 = zza(bArr, i9, i8);
                    if (i10 == 0) {
                    }
                } else {
                    int i11 = i7 + 2;
                    char c3 = bArr[i9];
                    if (c3 > 65471) {
                        return false;
                    }
                    if (i10 == -32 && c3 < 65440) {
                        return false;
                    }
                    if (i10 == -19 && c3 >= 65440) {
                        return false;
                    }
                    i7 += 3;
                    if (bArr[i11] > 65471) {
                        return false;
                    }
                }
            } else if (i9 >= i8 - 2) {
                i10 = zza(bArr, i9, i8);
                if (i10 == 0) {
                }
            } else {
                int i12 = i7 + 2;
                int i13 = bArr[i9];
                if (i13 > -65) {
                    return false;
                }
                if ((((i13 + 112) + (i10 << 28)) >> 30) != 0) {
                    return false;
                }
                int i14 = i7 + 3;
                if (bArr[i12] > 65471) {
                    return false;
                }
                i7 += 4;
                if (bArr[i14] > 65471) {
                    return false;
                }
            }
        }
        return true;
    }
}
