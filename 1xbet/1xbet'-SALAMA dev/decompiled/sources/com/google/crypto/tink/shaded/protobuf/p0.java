package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends Q0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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

    /* JADX WARN: Code duplicated, block: B:129:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f0  */
    @Override // Q0.a
    public final int J(byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        long j;
        byte bG;
        long j3;
        byte bG2;
        long j7;
        int i11 = i7;
        switch (this.f11815m) {
            case 0:
                break;
            default:
                if ((i11 | i8 | (bArr.length - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                long j8 = i11;
                int i12 = (int) (((long) i8) - j8);
                long j9 = 1;
                if (i12 < 16) {
                    i9 = 0;
                } else {
                    int i13 = 8 - (((int) j8) & 7);
                    long j10 = j8;
                    i9 = 0;
                    while (true) {
                        if (i9 < i13) {
                            long j11 = j10 + 1;
                            if (o0.g(bArr, j10) >= 0) {
                                i9++;
                                j10 = j11;
                            }
                        } else {
                            while (true) {
                                int i14 = i9 + 8;
                                if (i14 <= i12) {
                                    if ((o0.f11810c.h(o0.f11813f + j10, bArr) & (-9187201950435737472L)) == 0) {
                                        j10 += 8;
                                        i9 = i14;
                                    }
                                }
                            }
                            while (true) {
                                if (i9 < i12) {
                                    long j12 = j10 + 1;
                                    if (o0.g(bArr, j10) >= 0) {
                                        i9++;
                                        j10 = j12;
                                    }
                                } else {
                                    i9 = i12;
                                }
                            }
                        }
                    }
                }
                int i15 = i12 - i9;
                long j13 = j8 + ((long) i9);
                while (true) {
                    byte bG3 = 0;
                    while (i15 > 0) {
                        long j14 = j13 + j9;
                        bG3 = o0.g(bArr, j13);
                        if (bG3 < 0) {
                            j13 = j14;
                            if (i15 == 0) {
                                return 0;
                            }
                            i10 = i15 - 1;
                            if (bG3 < -32) {
                                if (i10 == 0) {
                                    return bG3;
                                }
                                i15 -= 2;
                                if (bG3 >= -62) {
                                    j7 = j13 + j9;
                                    if (o0.g(bArr, j13) > -65) {
                                        j13 = j7;
                                        j9 = 1;
                                    }
                                }
                                return -1;
                            }
                            if (bG3 < -16) {
                                if (i10 < 2) {
                                    return p0(j13, bArr, bG3, i10);
                                }
                                i15 -= 3;
                                long j15 = j13 + j9;
                                bG2 = o0.g(bArr, j13);
                                if (bG2 > -65 && ((bG3 != -32 || bG2 >= -96) && (bG3 != -19 || bG2 < -96))) {
                                    j13 += 2;
                                    if (o0.g(bArr, j15) <= -65) {
                                        j9 = 1;
                                    }
                                }
                                return -1;
                            }
                            if (i10 < 3) {
                                return p0(j13, bArr, bG3, i10);
                            }
                            i15 -= 4;
                            j = j13 + j9;
                            bG = o0.g(bArr, j13);
                            if (bG <= -65) {
                                if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                                    j3 = j13 + 2;
                                    if (o0.g(bArr, j) <= -65) {
                                        j13 += 3;
                                        if (o0.g(bArr, j3) > -65) {
                                            j9 = 1;
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i15--;
                        j13 = j14;
                    }
                    if (i15 == 0) {
                        return 0;
                    }
                    i10 = i15 - 1;
                    if (bG3 < -32) {
                        if (i10 == 0) {
                            return bG3;
                        }
                        i15 -= 2;
                        if (bG3 >= -62) {
                            j7 = j13 + j9;
                            if (o0.g(bArr, j13) > -65) {
                                j13 = j7;
                                j9 = 1;
                            }
                        }
                        return -1;
                    }
                    if (bG3 < -16) {
                        if (i10 < 2) {
                            return p0(j13, bArr, bG3, i10);
                        }
                        i15 -= 3;
                        long j16 = j13 + j9;
                        bG2 = o0.g(bArr, j13);
                        if (bG2 > -65) {
                        }
                        return -1;
                    }
                    if (i10 < 3) {
                        return p0(j13, bArr, bG3, i10);
                    }
                    i15 -= 4;
                    j = j13 + j9;
                    bG = o0.g(bArr, j13);
                    if (bG <= -65) {
                        if ((((bG + 112) + (bG3 << 28)) >> 30) == 0) {
                            j3 = j13 + 2;
                            if (o0.g(bArr, j) <= -65) {
                                j13 += 3;
                                if (o0.g(bArr, j3) > -65) {
                                    j9 = 1;
                                }
                            }
                        }
                    }
                    return -1;
                }
        }
        while (i11 < i8 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i8) {
            return 0;
        }
        while (i11 < i8) {
            int i16 = i11 + 1;
            byte b7 = bArr[i11];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i16 >= i8) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i11 += 2;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i16 >= i8 - 1) {
                        return r0.a(bArr, i16, i8);
                    }
                    int i17 = i11 + 2;
                    byte b8 = bArr[i16];
                    if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                        i11 += 3;
                        if (bArr[i17] > -65) {
                        }
                    }
                    return -1;
                }
                if (i16 >= i8 - 2) {
                    return r0.a(bArr, i16, i8);
                }
                int i18 = i11 + 2;
                byte b9 = bArr[i16];
                if (b9 <= -65) {
                    if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                        int i19 = i11 + 3;
                        if (bArr[i18] <= -65) {
                            i11 += 4;
                            if (bArr[i19] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i11 = i16;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012c A[SYNTHETIC] */
    @Override // Q0.a
    public final String t(byte[] bArr, int i7, int i8) throws C {
        int i9;
        byte b7;
        int i10;
        byte b8;
        byte b9;
        byte b10;
        switch (this.f11815m) {
            case 0:
                if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                int i11 = i7 + i8;
                char[] cArr = new char[i8];
                int i12 = 0;
                while (i7 < i11) {
                    byte b11 = bArr[i7];
                    if (b11 < 0) {
                        while (i7 < i11) {
                            i9 = i7 + 1;
                            b7 = bArr[i7];
                            if (b7 < 0) {
                                i10 = i12 + 1;
                                cArr[i12] = (char) b7;
                                while (i9 < i11) {
                                    b8 = bArr[i9];
                                    if (b8 >= 0) {
                                        i9++;
                                        cArr[i10] = (char) b8;
                                        i10++;
                                    } else {
                                        i12 = i10;
                                        i7 = i9;
                                    }
                                }
                                i12 = i10;
                                i7 = i9;
                            } else if (b7 < -32) {
                                if (i9 < i11) {
                                    throw C.b();
                                }
                                i7 += 2;
                                byte b12 = bArr[i9];
                                int i13 = i12 + 1;
                                if (b7 >= -62 || P6.b.w(b12)) {
                                    throw C.b();
                                }
                                cArr[i12] = (char) ((b12 & 63) | ((b7 & 31) << 6));
                                i12 = i13;
                            } else {
                                if (b7 >= -16) {
                                    if (i9 < i11 - 2) {
                                        throw C.b();
                                    }
                                    b10 = bArr[i9];
                                    int i14 = i7 + 3;
                                    byte b13 = bArr[i7 + 2];
                                    i7 += 4;
                                    byte b14 = bArr[i14];
                                    int i15 = i12 + 1;
                                    if (!P6.b.w(b10)) {
                                        if ((((b10 + 112) + (b7 << 28)) >> 30) != 0 && !P6.b.w(b13) && !P6.b.w(b14)) {
                                            int i16 = ((b10 & 63) << 12) | ((b7 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                            cArr[i12] = (char) ((i16 >>> 10) + 55232);
                                            cArr[i15] = (char) ((i16 & 1023) + 56320);
                                            i12 += 2;
                                        }
                                    }
                                    throw C.b();
                                }
                                if (i9 < i11 - 1) {
                                    throw C.b();
                                }
                                int i17 = i7 + 2;
                                b9 = bArr[i9];
                                i7 += 3;
                                byte b15 = bArr[i17];
                                int i18 = i12 + 1;
                                if (!P6.b.w(b9) || ((b7 == -32 && b9 < -96) || ((b7 == -19 && b9 >= -96) || P6.b.w(b15)))) {
                                    throw C.b();
                                }
                                cArr[i12] = (char) (((b9 & 63) << 6) | ((b7 & 15) << 12) | (b15 & 63));
                                i12 = i18;
                            }
                        }
                        return new String(cArr, 0, i12);
                    }
                    i7++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
                while (i7 < i11) {
                    i9 = i7 + 1;
                    b7 = bArr[i7];
                    if (b7 < 0) {
                        if (b7 < -32) {
                            if (i9 < i11) {
                                throw C.b();
                            }
                            i7 += 2;
                            byte b16 = bArr[i9];
                            int i19 = i12 + 1;
                            if (b7 >= -62) {
                            }
                            throw C.b();
                        }
                        if (b7 >= -16) {
                            if (i9 < i11 - 1) {
                                throw C.b();
                            }
                            int i110 = i7 + 2;
                            b9 = bArr[i9];
                            i7 += 3;
                            byte b17 = bArr[i110];
                            int i111 = i12 + 1;
                            if (P6.b.w(b9)) {
                            }
                            throw C.b();
                        }
                        if (i9 < i11 - 2) {
                            throw C.b();
                        }
                        b10 = bArr[i9];
                        int i112 = i7 + 3;
                        byte b18 = bArr[i7 + 2];
                        i7 += 4;
                        byte b19 = bArr[i112];
                        int i113 = i12 + 1;
                        if (!P6.b.w(b10)) {
                            if ((((b10 + 112) + (b7 << 28)) >> 30) != 0) {
                            }
                        }
                        throw C.b();
                    }
                    i10 = i12 + 1;
                    cArr[i12] = (char) b7;
                    while (i9 < i11) {
                        b8 = bArr[i9];
                        if (b8 >= 0) {
                            i9++;
                            cArr[i10] = (char) b8;
                            i10++;
                        } else {
                            i12 = i10;
                            i7 = i9;
                        }
                    }
                    i12 = i10;
                    i7 = i9;
                }
                return new String(cArr, 0, i12);
            default:
                Charset charset = A.f11702a;
                String str = new String(bArr, i7, i8, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                    throw C.b();
                }
                return str;
        }
    }

    @Override // Q0.a
    public final int x(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char cCharAt;
        long j;
        String str2;
        String str3;
        int i11;
        char cCharAt2;
        switch (this.f11815m) {
            case 0:
                int length = str.length();
                int i12 = i8 + i7;
                int i13 = 0;
                while (i13 < length && (i10 = i13 + i7) < i12 && (cCharAt = str.charAt(i13)) < 128) {
                    bArr[i10] = (byte) cCharAt;
                    i13++;
                }
                if (i13 == length) {
                    return i7 + length;
                }
                int i14 = i7 + i13;
                while (i13 < length) {
                    char cCharAt3 = str.charAt(i13);
                    if (cCharAt3 < 128 && i14 < i12) {
                        bArr[i14] = (byte) cCharAt3;
                        i14++;
                    } else if (cCharAt3 < 2048 && i14 <= i12 - 2) {
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) ((cCharAt3 >>> 6) | 960);
                        i14 += 2;
                        bArr[i15] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i14 > i12 - 3) {
                            if (i14 > i12 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i9 = i13 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i9)))) {
                                    throw new q0(i13, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i14);
                            }
                            int i16 = i13 + 1;
                            if (i16 != str.length()) {
                                char cCharAt4 = str.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
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
                        bArr[i14] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i18 = i14 + 2;
                        bArr[i14 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i14 += 3;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i13++;
                }
                return i14;
            default:
                long j3 = i7;
                long j7 = ((long) i8) + j3;
                int length2 = str.length();
                String str4 = " at index ";
                String str5 = "Failed writing ";
                if (length2 > i8 || bArr.length - i8 < i7) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i7 + i8));
                }
                int i19 = 0;
                while (true) {
                    j = 1;
                    if (i19 < length2 && (cCharAt2 = str.charAt(i19)) < 128) {
                        o0.o(bArr, j3, (byte) cCharAt2);
                        i19++;
                        j3 = 1 + j3;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char cCharAt5 = str.charAt(i19);
                        if (cCharAt5 < 128 && j3 < j7) {
                            o0.o(bArr, j3, (byte) cCharAt5);
                            str3 = str5;
                            j3 += j;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j3 > j7 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j3 > j7 - 3) {
                                if (j3 > j7 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i11)))) {
                                        throw new q0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j3);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
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
                            o0.o(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j9 = j3 + 2;
                            o0.o(bArr, j3 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            o0.o(bArr, j9, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j10 = j3 + j;
                            o0.o(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                            j3 += 2;
                            o0.o(bArr, j10, (byte) ((cCharAt5 & '?') | 128));
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
