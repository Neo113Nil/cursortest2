package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzamu extends zzamv {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        return r10 + r0;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char charAt;
        int length = str.length();
        int i11 = i8 + i7;
        int i12 = 0;
        while (i12 < length && (i10 = i12 + i7) < i11 && (charAt = str.charAt(i12)) < 128) {
            bArr[i10] = (byte) charAt;
            i12++;
        }
        int i13 = i7 + i12;
        while (i12 < length) {
            char charAt2 = str.charAt(i12);
            if (charAt2 < 128 && i13 < i11) {
                bArr[i13] = (byte) charAt2;
                i13++;
            } else if (charAt2 < 2048 && i13 <= i11 - 2) {
                int i14 = i13 + 1;
                bArr[i13] = (byte) ((charAt2 >>> 6) | 960);
                i13 += 2;
                bArr[i14] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i13 > i11 - 3) {
                    if (i13 > i11 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i9 = i12 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i9)))) {
                            throw new zzamx(i12, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i13);
                    }
                    int i15 = i12 + 1;
                    if (i15 != str.length()) {
                        char charAt3 = str.charAt(i15);
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
                    throw new zzamx(i12 - 1, length);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final int zza(int i7, byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i10 >= i9) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i8 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i10 >= i9 - 1) {
                        return zzamt.zza(bArr, i10, i9);
                    }
                    int i11 = i8 + 2;
                    byte b8 = bArr[i10];
                    if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                        i8 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                }
                if (i10 >= i9 - 2) {
                    return zzamt.zza(bArr, i10, i9);
                }
                int i12 = i8 + 2;
                byte b9 = bArr[i10];
                if (b9 <= -65) {
                    if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                        int i13 = i8 + 3;
                        if (bArr[i12] <= -65) {
                            i8 += 4;
                            if (bArr[i13] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i8 = i10;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamv
    public final String zza(byte[] bArr, int i7, int i8) {
        if ((i7 | i8 | ((bArr.length - i7) - i8)) >= 0) {
            int i9 = i7 + i8;
            char[] cArr = new char[i8];
            int i10 = 0;
            while (i7 < i9) {
                byte b7 = bArr[i7];
                if (b7 < 0) {
                    break;
                }
                i7++;
                zzams.zza(b7, cArr, i10);
                i10++;
            }
            int i11 = i10;
            while (i7 < i9) {
                int i12 = i7 + 1;
                byte b8 = bArr[i7];
                if (b8 >= 0) {
                    int i13 = i11 + 1;
                    zzams.zza(b8, cArr, i11);
                    while (i12 < i9) {
                        byte b9 = bArr[i12];
                        if (b9 < 0) {
                            break;
                        }
                        i12++;
                        zzams.zza(b9, cArr, i13);
                        i13++;
                    }
                    i11 = i13;
                    i7 = i12;
                } else if (b8 < -32) {
                    if (i12 < i9) {
                        i7 += 2;
                        zzams.zza(b8, bArr[i12], cArr, i11);
                        i11++;
                    } else {
                        throw zzakf.zzd();
                    }
                } else if (b8 < -16) {
                    if (i12 < i9 - 1) {
                        int i14 = i7 + 2;
                        i7 += 3;
                        zzams.zza(b8, bArr[i12], bArr[i14], cArr, i11);
                        i11++;
                    } else {
                        throw zzakf.zzd();
                    }
                } else if (i12 < i9 - 2) {
                    byte b10 = bArr[i12];
                    int i15 = i7 + 3;
                    byte b11 = bArr[i7 + 2];
                    i7 += 4;
                    zzams.zza(b8, b10, b11, bArr[i15], cArr, i11);
                    i11 += 2;
                } else {
                    throw zzakf.zzd();
                }
            }
            return new String(cArr, 0, i11);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
    }
}
