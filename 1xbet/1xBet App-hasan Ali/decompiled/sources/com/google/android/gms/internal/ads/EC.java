package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class EC {

    /* renamed from: a, reason: collision with root package name */
    public static final Fz f8472a;

    static {
        if (CC.f7975e && CC.f7974d) {
            int i = AbstractC1553sB.f15428a;
        }
        f8472a = new Fz(20);
    }

    public static int a(byte[] bArr, int i, int i5) {
        int i6 = i5 - i;
        byte b3 = bArr[i - 1];
        if (i6 == 0) {
            if (b3 > -12) {
                return -1;
            }
            return b3;
        }
        if (i6 == 1) {
            byte b5 = bArr[i];
            if (b3 > -12 || b5 > -65) {
                return -1;
            }
            return (b5 << 8) ^ b3;
        }
        if (i6 != 2) {
            throw new AssertionError();
        }
        byte b6 = bArr[i];
        byte b7 = bArr[i + 1];
        if (b3 > -12 || b6 > -65 || b7 > -65) {
            return -1;
        }
        return (b7 << 16) ^ ((b6 << 8) ^ b3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(String str, byte[] bArr, int i, int i5) {
        int i6;
        int i7;
        int i8;
        char charAt;
        int length = str.length();
        int i9 = 0;
        while (true) {
            i6 = i + i5;
            if (i9 >= length || (i8 = i9 + i) >= i6 || (charAt = str.charAt(i9)) >= 128) {
                break;
            }
            bArr[i8] = (byte) charAt;
            i9++;
        }
        int i10 = i + i9;
        while (i9 < length) {
            char charAt2 = str.charAt(i9);
            if (charAt2 < 128 && i10 < i6) {
                bArr[i10] = (byte) charAt2;
                i10++;
            } else if (charAt2 < 2048 && i10 <= i6 - 2) {
                bArr[i10] = (byte) ((charAt2 >>> 6) | 960);
                bArr[i10 + 1] = (byte) ((charAt2 & '?') | 128);
                i10 += 2;
            } else {
                if ((charAt2 >= 55296 && charAt2 <= 57343) || i10 > i6 - 3) {
                    if (i10 > i6 - 4) {
                        if (charAt2 >= 55296 && charAt2 <= 57343 && ((i7 = i9 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i7)))) {
                            throw new DC(i9, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i10);
                    }
                    int i11 = i9 + 1;
                    if (i11 != str.length()) {
                        char charAt3 = str.charAt(i11);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int i12 = i10 + 3;
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i10 += 4;
                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                            i9 = i11;
                        } else {
                            i9 = i11;
                        }
                    }
                    throw new DC(i9 - 1, length);
                }
                bArr[i10] = (byte) ((charAt2 >>> '\f') | 480);
                bArr[i10 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                bArr[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                i10 += 3;
            }
            i9++;
        }
        return i10;
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) < 65536) {
                                throw new DC(i5, length2);
                            }
                            i5++;
                        }
                    }
                    i5++;
                }
                i6 += i;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i6 + 4294967296L));
    }

    public static boolean d(byte[] bArr, int i, int i5) {
        int i6;
        f8472a.getClass();
        while (i < i5 && bArr[i] >= 0) {
            i++;
        }
        if (i < i5) {
            while (i < i5) {
                int i7 = i + 1;
                i6 = bArr[i];
                if (i6 < 0) {
                    if (i6 >= -32) {
                        if (i6 >= -16) {
                            if (i7 < i5 - 2) {
                                int i8 = i + 2;
                                int i9 = bArr[i7];
                                if (i9 <= -65) {
                                    if ((((i9 + 112) + (i6 << 28)) >> 30) == 0) {
                                        int i10 = i + 3;
                                        if (bArr[i8] <= 65471) {
                                            i += 4;
                                            if (bArr[i10] > 65471) {
                                            }
                                        }
                                    }
                                }
                                i6 = -1;
                                break;
                            }
                            i6 = a(bArr, i7, i5);
                            break;
                        }
                        if (i7 < i5 - 1) {
                            int i11 = i + 2;
                            char c5 = bArr[i7];
                            if (c5 <= 65471 && ((i6 != -32 || c5 >= 65440) && (i6 != -19 || c5 < 65440))) {
                                i += 3;
                                if (bArr[i11] > 65471) {
                                }
                            }
                            i6 = -1;
                            break;
                        }
                        i6 = a(bArr, i7, i5);
                        break;
                    }
                    if (i7 >= i5) {
                        break;
                    }
                    if (i6 >= -62) {
                        i += 2;
                        if (bArr[i7] > 65471) {
                        }
                    }
                    i6 = -1;
                    break;
                }
                i = i7;
            }
        }
        i6 = 0;
        return i6 == 0;
    }
}
