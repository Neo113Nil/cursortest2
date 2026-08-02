package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p0 extends Q0.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f11815m;

    public /* synthetic */ p0(int i7) {
        this.f11815m = i7;
    }

    public static int p0(long j, byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            Q0.a aVar = r0.f11823a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i8 == 1) {
            return r0.c(i7, o0.g(bArr, j));
        }
        if (i8 == 2) {
            return r0.d(i7, o0.g(bArr, j), o0.g(bArr, j + 1));
        }
        throw new AssertionError();
    }

    @Override // Q0.a
    public final int J(byte[] bArr, int i7, int i8) {
        int i9;
        int i10 = i7;
        switch (this.f11815m) {
            case 0:
                break;
            default:
                if ((i10 | i8 | (bArr.length - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                long j = i10;
                int i11 = (int) (i8 - j);
                long j3 = 1;
                if (i11 < 16) {
                    i9 = 0;
                } else {
                    int i12 = 8 - (((int) j) & 7);
                    long j7 = j;
                    i9 = 0;
                    while (true) {
                        if (i9 < i12) {
                            long j8 = j7 + 1;
                            if (o0.g(bArr, j7) >= 0) {
                                i9++;
                                j7 = j8;
                            }
                        } else {
                            while (true) {
                                int i13 = i9 + 8;
                                if (i13 <= i11) {
                                    if ((o0.f11810c.h(o0.f11813f + j7, bArr) & (-9187201950435737472L)) == 0) {
                                        j7 += 8;
                                        i9 = i13;
                                    }
                                }
                            }
                            while (true) {
                                if (i9 < i11) {
                                    long j9 = j7 + 1;
                                    if (o0.g(bArr, j7) >= 0) {
                                        i9++;
                                        j7 = j9;
                                    }
                                } else {
                                    i9 = i11;
                                }
                            }
                        }
                    }
                }
                int i14 = i11 - i9;
                long j10 = j + i9;
                while (true) {
                    byte b7 = 0;
                    while (true) {
                        if (i14 > 0) {
                            long j11 = j10 + j3;
                            b7 = o0.g(bArr, j10);
                            if (b7 >= 0) {
                                i14--;
                                j10 = j11;
                            } else {
                                j10 = j11;
                            }
                        }
                    }
                    if (i14 == 0) {
                        return 0;
                    }
                    int i15 = i14 - 1;
                    if (b7 < -32) {
                        if (i15 == 0) {
                            return b7;
                        }
                        i14 -= 2;
                        if (b7 >= -62) {
                            long j12 = j10 + j3;
                            if (o0.g(bArr, j10) <= -65) {
                                j10 = j12;
                                j3 = 1;
                            }
                        }
                    } else if (b7 < -16) {
                        if (i15 < 2) {
                            return p0(j10, bArr, b7, i15);
                        }
                        i14 -= 3;
                        long j13 = j10 + j3;
                        byte g3 = o0.g(bArr, j10);
                        if (g3 <= -65 && ((b7 != -32 || g3 >= -96) && (b7 != -19 || g3 < -96))) {
                            j10 += 2;
                            if (o0.g(bArr, j13) <= -65) {
                                j3 = 1;
                            }
                        }
                    } else {
                        if (i15 < 3) {
                            return p0(j10, bArr, b7, i15);
                        }
                        i14 -= 4;
                        long j14 = j10 + j3;
                        byte g7 = o0.g(bArr, j10);
                        if (g7 <= -65) {
                            if ((((g7 + 112) + (b7 << 28)) >> 30) == 0) {
                                long j15 = j10 + 2;
                                if (o0.g(bArr, j14) <= -65) {
                                    j10 += 3;
                                    if (o0.g(bArr, j15) <= -65) {
                                        j3 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
        while (i10 < i8 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i8) {
            return 0;
        }
        while (i10 < i8) {
            int i16 = i10 + 1;
            byte b8 = bArr[i10];
            if (b8 < 0) {
                if (b8 < -32) {
                    if (i16 >= i8) {
                        return b8;
                    }
                    if (b8 >= -62) {
                        i10 += 2;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (b8 < -16) {
                    if (i16 >= i8 - 1) {
                        return r0.a(bArr, i16, i8);
                    }
                    int i17 = i10 + 2;
                    byte b9 = bArr[i16];
                    if (b9 <= -65 && ((b8 != -32 || b9 >= -96) && (b8 != -19 || b9 < -96))) {
                        i10 += 3;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return -1;
                }
                if (i16 >= i8 - 2) {
                    return r0.a(bArr, i16, i8);
                }
                int i18 = i10 + 2;
                byte b10 = bArr[i16];
                if (b10 <= -65) {
                    if ((((b10 + 112) + (b8 << 28)) >> 30) == 0) {
                        int i19 = i10 + 3;
                        if (bArr[i18] <= -65) {
                            i10 += 4;
                            if (bArr[i19] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i10 = i16;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // Q0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String t(byte[] bArr, int i7, int i8) {
        switch (this.f11815m) {
            case 0:
                if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                int i9 = i7 + i8;
                char[] cArr = new char[i8];
                int i10 = 0;
                while (i7 < i9) {
                    byte b7 = bArr[i7];
                    if (b7 < 0) {
                        while (i7 < i9) {
                            int i11 = i7 + 1;
                            byte b8 = bArr[i7];
                            if (b8 >= 0) {
                                int i12 = i10 + 1;
                                cArr[i10] = (char) b8;
                                while (i11 < i9) {
                                    byte b9 = bArr[i11];
                                    if (b9 >= 0) {
                                        i11++;
                                        cArr[i12] = (char) b9;
                                        i12++;
                                    } else {
                                        i10 = i12;
                                        i7 = i11;
                                    }
                                }
                                i10 = i12;
                                i7 = i11;
                            } else if (b8 < -32) {
                                if (i11 >= i9) {
                                    throw C.b();
                                }
                                i7 += 2;
                                byte b10 = bArr[i11];
                                int i13 = i10 + 1;
                                if (b8 < -62 || P6.b.w(b10)) {
                                    throw C.b();
                                }
                                cArr[i10] = (char) ((b10 & 63) | ((b8 & 31) << 6));
                                i10 = i13;
                            } else {
                                if (b8 >= -16) {
                                    if (i11 >= i9 - 2) {
                                        throw C.b();
                                    }
                                    byte b11 = bArr[i11];
                                    int i14 = i7 + 3;
                                    byte b12 = bArr[i7 + 2];
                                    i7 += 4;
                                    byte b13 = bArr[i14];
                                    int i15 = i10 + 1;
                                    if (!P6.b.w(b11)) {
                                        if ((((b11 + 112) + (b8 << 28)) >> 30) == 0 && !P6.b.w(b12) && !P6.b.w(b13)) {
                                            int i16 = ((b11 & 63) << 12) | ((b8 & 7) << 18) | ((b12 & 63) << 6) | (b13 & 63);
                                            cArr[i10] = (char) ((i16 >>> 10) + 55232);
                                            cArr[i15] = (char) ((i16 & 1023) + 56320);
                                            i10 += 2;
                                        }
                                    }
                                    throw C.b();
                                }
                                if (i11 >= i9 - 1) {
                                    throw C.b();
                                }
                                int i17 = i7 + 2;
                                byte b14 = bArr[i11];
                                i7 += 3;
                                byte b15 = bArr[i17];
                                int i18 = i10 + 1;
                                if (P6.b.w(b14) || ((b8 == -32 && b14 < -96) || ((b8 == -19 && b14 >= -96) || P6.b.w(b15)))) {
                                    throw C.b();
                                }
                                cArr[i10] = (char) (((b14 & 63) << 6) | ((b8 & 15) << 12) | (b15 & 63));
                                i10 = i18;
                            }
                        }
                        return new String(cArr, 0, i10);
                    }
                    i7++;
                    cArr[i10] = (char) b7;
                    i10++;
                }
                while (i7 < i9) {
                }
                return new String(cArr, 0, i10);
            default:
                Charset charset = A.f11702a;
                String str = new String(bArr, i7, i8, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                    throw C.b();
                }
                return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // Q0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int x(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char charAt;
        long j;
        String str2;
        String str3;
        int i11;
        char charAt2;
        switch (this.f11815m) {
            case 0:
                int length = str.length();
                int i12 = i8 + i7;
                int i13 = 0;
                while (i13 < length && (i10 = i13 + i7) < i12 && (charAt = str.charAt(i13)) < 128) {
                    bArr[i10] = (byte) charAt;
                    i13++;
                }
                int i14 = i7 + i13;
                while (i13 < length) {
                    char charAt3 = str.charAt(i13);
                    if (charAt3 < 128 && i14 < i12) {
                        bArr[i14] = (byte) charAt3;
                        i14++;
                    } else if (charAt3 < 2048 && i14 <= i12 - 2) {
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) ((charAt3 >>> 6) | 960);
                        i14 += 2;
                        bArr[i15] = (byte) ((charAt3 & '?') | 128);
                    } else {
                        if ((charAt3 >= 55296 && 57343 >= charAt3) || i14 > i12 - 3) {
                            if (i14 > i12 - 4) {
                                if (55296 <= charAt3 && charAt3 <= 57343 && ((i9 = i13 + 1) == str.length() || !Character.isSurrogatePair(charAt3, str.charAt(i9)))) {
                                    throw new q0(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt3 + " at index " + i14);
                            }
                            int i16 = i13 + 1;
                            if (i16 != str.length()) {
                                char charAt4 = str.charAt(i16);
                                if (Character.isSurrogatePair(charAt3, charAt4)) {
                                    int codePoint = Character.toCodePoint(charAt3, charAt4);
                                    bArr[i14] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i17 = i14 + 3;
                                    bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i14 += 4;
                                    bArr[i17] = (byte) ((codePoint & 63) | 128);
                                    i13 = i16;
                                } else {
                                    i13 = i16;
                                }
                            }
                            throw new q0(i13 - 1, length);
                        }
                        bArr[i14] = (byte) ((charAt3 >>> '\f') | 480);
                        int i18 = i14 + 2;
                        bArr[i14 + 1] = (byte) (((charAt3 >>> 6) & 63) | 128);
                        i14 += 3;
                        bArr[i18] = (byte) ((charAt3 & '?') | 128);
                    }
                    i13++;
                }
                return i14;
            default:
                long j3 = i7;
                long j7 = i8 + j3;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i8 || bArr.length - i8 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i8));
                }
                int i19 = 0;
                while (true) {
                    j = 1;
                    if (i19 < length2 && (charAt2 = str.charAt(i19)) < 128) {
                        o0.o(bArr, j3, (byte) charAt2);
                        i19++;
                        j3 = 1 + j3;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char charAt5 = str.charAt(i19);
                        if (charAt5 < 128 && j3 < j7) {
                            o0.o(bArr, j3, (byte) charAt5);
                            str3 = str5;
                            j3 += j;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j3 > j7 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j3 > j7 - 3) {
                                if (j3 > j7 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i11)))) {
                                        throw new q0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j3);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char charAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        o0.o(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                        o0.o(bArr, j3 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j8 = 3 + j3;
                                        o0.o(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j3 += 4;
                                        o0.o(bArr, j8, (byte) ((codePoint2 & 63) | 128));
                                        i19 = i20;
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                throw new q0(i19 - 1, length2);
                            }
                            o0.o(bArr, j3, (byte) ((charAt5 >>> '\f') | 480));
                            long j9 = j3 + 2;
                            o0.o(bArr, j3 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            o0.o(bArr, j9, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j10 = j3 + j;
                            o0.o(bArr, j3, (byte) ((charAt5 >>> 6) | 960));
                            j3 += 2;
                            o0.o(bArr, j10, (byte) ((charAt5 & '?') | 128));
                        }
                        i19++;
                        str4 = str2;
                        str5 = str3;
                        j = 1;
                    }
                }
                return (int) j3;
        }
    }
}
