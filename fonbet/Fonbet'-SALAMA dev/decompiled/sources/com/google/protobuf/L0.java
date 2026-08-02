package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class L0 extends w0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12123c;

    public /* synthetic */ L0(int i7) {
        this.f12123c = i7;
    }

    public static int X(long j, byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            w0 w0Var = N0.f12134a;
            if (i7 > -12) {
                return -1;
            }
            return i7;
        }
        if (i8 == 1) {
            return N0.d(i7, K0.g(bArr, j));
        }
        if (i8 == 2) {
            return N0.e(i7, K0.g(bArr, j), K0.g(bArr, j + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // com.google.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H(byte[] bArr, int i7, int i8) {
        switch (this.f12123c) {
            case 0:
                if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                int i9 = i7 + i8;
                char[] cArr = new char[i8];
                int i10 = 0;
                while (i7 < i9) {
                    byte b7 = bArr[i7];
                    if (!w0.b(b7)) {
                        int i11 = i10;
                        while (i7 < i9) {
                            int i12 = i7 + 1;
                            byte b8 = bArr[i7];
                            if (w0.b(b8)) {
                                int i13 = i11 + 1;
                                cArr[i11] = (char) b8;
                                while (i12 < i9) {
                                    byte b9 = bArr[i12];
                                    if (w0.b(b9)) {
                                        i12++;
                                        cArr[i13] = (char) b9;
                                        i13++;
                                    } else {
                                        i11 = i13;
                                        i7 = i12;
                                    }
                                }
                                i11 = i13;
                                i7 = i12;
                            } else if (b8 < -32) {
                                if (i12 >= i9) {
                                    throw M.c();
                                }
                                i7 += 2;
                                w0.c(b8, bArr[i12], cArr, i11);
                                i11++;
                            } else if (b8 < -16) {
                                if (i12 >= i9 - 1) {
                                    throw M.c();
                                }
                                int i14 = i7 + 2;
                                i7 += 3;
                                w0.d(b8, bArr[i12], bArr[i14], cArr, i11);
                                i11++;
                            } else {
                                if (i12 >= i9 - 2) {
                                    throw M.c();
                                }
                                byte b10 = bArr[i12];
                                int i15 = i7 + 3;
                                byte b11 = bArr[i7 + 2];
                                i7 += 4;
                                w0.a(b8, b10, b11, bArr[i15], cArr, i11);
                                i11 += 2;
                            }
                        }
                        return new String(cArr, 0, i11);
                    }
                    i7++;
                    cArr[i10] = (char) b7;
                    i10++;
                }
                int i112 = i10;
                while (i7 < i9) {
                }
                return new String(cArr, 0, i112);
            default:
                Charset charset = K.f12112a;
                String str = new String(bArr, i7, i8, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                    throw M.c();
                }
                return str;
        }
    }

    @Override // com.google.protobuf.w0
    public final String J(ByteBuffer byteBuffer, int i7, int i8) {
        long j;
        switch (this.f12123c) {
            case 0:
                return w0.I(byteBuffer, i7, i8);
            default:
                if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                long j3 = K0.f12117c.j(K0.f12121g, byteBuffer) + i7;
                long j7 = i8 + j3;
                char[] cArr = new char[i8];
                int i9 = 0;
                while (true) {
                    j = 1;
                    if (j3 < j7) {
                        byte e7 = K0.f12117c.e(j3);
                        if (w0.b(e7)) {
                            j3++;
                            cArr[i9] = (char) e7;
                            i9++;
                        }
                    }
                }
                int i10 = i9;
                while (j3 < j7) {
                    long j8 = j3 + j;
                    J0 j02 = K0.f12117c;
                    byte e8 = j02.e(j3);
                    if (w0.b(e8)) {
                        int i11 = i10 + 1;
                        cArr[i10] = (char) e8;
                        while (j8 < j7) {
                            byte e9 = K0.f12117c.e(j8);
                            if (w0.b(e9)) {
                                j8 += j;
                                cArr[i11] = (char) e9;
                                i11++;
                            } else {
                                i10 = i11;
                                j3 = j8;
                            }
                        }
                        i10 = i11;
                        j3 = j8;
                    } else {
                        if (!(e8 < -32)) {
                            if (e8 < -16) {
                                if (j8 >= j7 - j) {
                                    throw M.c();
                                }
                                long j9 = j3 + 2;
                                j3 += 3;
                                w0.d(e8, j02.e(j8), j02.e(j9), cArr, i10);
                                i10++;
                            } else {
                                if (j8 >= j7 - 2) {
                                    throw M.c();
                                }
                                byte e10 = j02.e(j8);
                                long j10 = j3 + 3;
                                byte e11 = j02.e(j3 + 2);
                                j3 += 4;
                                w0.a(e8, e10, e11, j02.e(j10), cArr, i10);
                                i10 += 2;
                            }
                        } else {
                            if (j8 >= j7) {
                                throw M.c();
                            }
                            j3 += 2;
                            w0.c(e8, j02.e(j8), cArr, i10);
                            i10++;
                        }
                    }
                    j = 1;
                }
                return new String(cArr, 0, i10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        return r26 + r3;
     */
    @Override // com.google.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int P(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char charAt;
        long j;
        String str2;
        String str3;
        int i11;
        char charAt2;
        switch (this.f12123c) {
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
                                    throw new M0(i13, length);
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
                            throw new M0(i13 - 1, length);
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
                        K0.l(bArr, j3, (byte) charAt2);
                        i19++;
                        j3 = 1 + j3;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char charAt5 = str.charAt(i19);
                        if (charAt5 < 128 && j3 < j7) {
                            K0.l(bArr, j3, (byte) charAt5);
                            str3 = str5;
                            j3 += j;
                            str2 = str4;
                        } else if (charAt5 >= 2048 || j3 > j7 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((charAt5 >= 55296 && 57343 >= charAt5) || j3 > j7 - 3) {
                                if (j3 > j7 - 4) {
                                    if (55296 <= charAt5 && charAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(charAt5, str.charAt(i11)))) {
                                        throw new M0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + charAt5 + str2 + j3);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char charAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(charAt5, charAt6)) {
                                        int codePoint2 = Character.toCodePoint(charAt5, charAt6);
                                        K0.l(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                        K0.l(bArr, j3 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j8 = 3 + j3;
                                        K0.l(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j3 += 4;
                                        K0.l(bArr, j8, (byte) ((codePoint2 & 63) | 128));
                                        i19 = i20;
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                throw new M0(i19 - 1, length2);
                            }
                            K0.l(bArr, j3, (byte) ((charAt5 >>> '\f') | 480));
                            long j9 = j3 + 2;
                            K0.l(bArr, j3 + 1, (byte) (((charAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            K0.l(bArr, j9, (byte) ((charAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j10 = j3 + j;
                            K0.l(bArr, j3, (byte) ((charAt5 >>> 6) | 960));
                            j3 += 2;
                            K0.l(bArr, j10, (byte) ((charAt5 & '?') | 128));
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (com.google.protobuf.K0.g(r23, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0202, code lost:
    
        if (r23[r0] > (-65)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0245, code lost:
    
        if (r23[r0] > (-65)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (com.google.protobuf.K0.g(r23, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        if (com.google.protobuf.K0.g(r23, r5) > (-65)) goto L18;
     */
    @Override // com.google.protobuf.w0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int U(int i7, byte[] bArr, int i8, int i9) {
        byte b7;
        int i10;
        byte b8;
        int i11;
        int i12;
        byte b9;
        long j;
        int i13 = i8;
        switch (this.f12123c) {
            case 0:
                int i14 = 0;
                if (i7 != 0) {
                    if (i13 >= i9) {
                        return i7;
                    }
                    byte b10 = (byte) i7;
                    if (b10 < -32) {
                        if (b10 >= -62) {
                            int i15 = i13 + 1;
                            if (bArr[i13] <= -65) {
                                i13 = i15;
                            }
                        }
                        return -1;
                    }
                    if (b10 < -16) {
                        byte b11 = (byte) (~(i7 >> 8));
                        if (b11 == 0) {
                            i11 = i13 + 1;
                            b8 = bArr[i13];
                            if (i11 >= i9) {
                                return N0.d(b10, b8);
                            }
                        } else {
                            b8 = b11;
                            i11 = i13;
                        }
                        if (b8 <= -65 && ((b10 != -32 || b8 >= -96) && (b10 != -19 || b8 < -96))) {
                            i13 = i11 + 1;
                            break;
                        }
                        return -1;
                    }
                    byte b12 = (byte) (~(i7 >> 8));
                    if (b12 == 0) {
                        i10 = i13 + 1;
                        b12 = bArr[i13];
                        if (i10 >= i9) {
                            return N0.d(b10, b12);
                        }
                        b7 = 0;
                    } else {
                        b7 = (byte) (i7 >> 16);
                        i10 = i13;
                    }
                    if (b7 == 0) {
                        int i16 = i10 + 1;
                        byte b13 = bArr[i10];
                        if (i16 >= i9) {
                            return N0.e(b10, b12, b13);
                        }
                        b7 = b13;
                        i10 = i16;
                    }
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0 && b7 <= -65) {
                            i13 = i10 + 1;
                            break;
                        }
                    }
                    return -1;
                }
                while (i13 < i9 && bArr[i13] >= 0) {
                    i13++;
                }
                if (i13 < i9) {
                    while (true) {
                        if (i13 < i9) {
                            int i17 = i13 + 1;
                            byte b14 = bArr[i13];
                            if (b14 >= 0) {
                                i13 = i17;
                            } else if (b14 < -32) {
                                if (i17 >= i9) {
                                    i14 = b14;
                                } else if (b14 >= -62) {
                                    i13 += 2;
                                    if (bArr[i17] > -65) {
                                    }
                                }
                            } else if (b14 < -16) {
                                if (i17 >= i9 - 1) {
                                    i14 = N0.a(bArr, i17, i9);
                                } else {
                                    int i18 = i13 + 2;
                                    byte b15 = bArr[i17];
                                    if (b15 <= -65 && ((b14 != -32 || b15 >= -96) && (b14 != -19 || b15 < -96))) {
                                        i13 += 3;
                                        if (bArr[i18] > -65) {
                                        }
                                    }
                                }
                            } else if (i17 >= i9 - 2) {
                                i14 = N0.a(bArr, i17, i9);
                            } else {
                                int i19 = i13 + 2;
                                byte b16 = bArr[i17];
                                if (b16 <= -65) {
                                    if ((((b16 + 112) + (b14 << 28)) >> 30) == 0) {
                                        int i20 = i13 + 3;
                                        if (bArr[i19] <= -65) {
                                            i13 += 4;
                                            if (bArr[i20] > -65) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i14 = -1;
                }
                return i14;
            default:
                if ((i13 | i9 | (bArr.length - i9)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
                }
                long j3 = i13;
                long j7 = i9;
                if (i7 != 0) {
                    if (j3 >= j7) {
                        return i7;
                    }
                    byte b17 = (byte) i7;
                    if (b17 < -32) {
                        if (b17 >= -62) {
                            j = j3 + 1;
                            break;
                        }
                        return -1;
                    }
                    if (b17 < -16) {
                        byte b18 = (byte) (~(i7 >> 8));
                        if (b18 == 0) {
                            long j8 = j3 + 1;
                            b18 = K0.g(bArr, j3);
                            if (j8 >= j7) {
                                return N0.d(b17, b18);
                            }
                            j3 = j8;
                        }
                        if (b18 <= -65 && ((b17 != -32 || b18 >= -96) && (b17 != -19 || b18 < -96))) {
                            j = j3 + 1;
                            break;
                        }
                        return -1;
                    }
                    byte b19 = (byte) (~(i7 >> 8));
                    if (b19 == 0) {
                        long j9 = j3 + 1;
                        b19 = K0.g(bArr, j3);
                        if (j9 >= j7) {
                            return N0.d(b17, b19);
                        }
                        j3 = j9;
                        b9 = 0;
                    } else {
                        b9 = (byte) (i7 >> 16);
                    }
                    if (b9 == 0) {
                        long j10 = j3 + 1;
                        b9 = K0.g(bArr, j3);
                        if (j10 >= j7) {
                            return N0.e(b17, b19, b9);
                        }
                        j3 = j10;
                    }
                    if (b19 <= -65) {
                        if ((((b19 + 112) + (b17 << 28)) >> 30) == 0 && b9 <= -65) {
                            j = j3 + 1;
                            break;
                        }
                    }
                    return -1;
                }
                int i21 = (int) (j7 - j3);
                if (i21 < 16) {
                    i12 = 0;
                } else {
                    int i22 = 8 - (((int) j3) & 7);
                    long j11 = j3;
                    i12 = 0;
                    while (true) {
                        if (i12 < i22) {
                            long j12 = j11 + 1;
                            if (K0.g(bArr, j11) >= 0) {
                                i12++;
                                j11 = j12;
                            }
                        } else {
                            while (true) {
                                int i23 = i12 + 8;
                                if (i23 <= i21) {
                                    if ((K0.f12117c.j(K0.f12120f + j11, bArr) & (-9187201950435737472L)) == 0) {
                                        j11 += 8;
                                        i12 = i23;
                                    }
                                }
                            }
                            while (true) {
                                if (i12 < i21) {
                                    long j13 = j11 + 1;
                                    if (K0.g(bArr, j11) >= 0) {
                                        i12++;
                                        j11 = j13;
                                    }
                                } else {
                                    i12 = i21;
                                }
                            }
                        }
                    }
                }
                int i24 = i21 - i12;
                long j14 = j3 + i12;
                while (true) {
                    byte b20 = 0;
                    while (true) {
                        if (i24 > 0) {
                            long j15 = j14 + 1;
                            b20 = K0.g(bArr, j14);
                            if (b20 >= 0) {
                                i24--;
                                j14 = j15;
                            } else {
                                j14 = j15;
                            }
                        }
                    }
                    if (i24 == 0) {
                        return 0;
                    }
                    int i25 = i24 - 1;
                    if (b20 < -32) {
                        if (i25 == 0) {
                            return b20;
                        }
                        i24 -= 2;
                        if (b20 >= -62) {
                            long j16 = j14 + 1;
                            if (K0.g(bArr, j14) <= -65) {
                                j14 = j16;
                            }
                        }
                    } else if (b20 < -16) {
                        if (i25 < 2) {
                            return X(j14, bArr, b20, i25);
                        }
                        i24 -= 3;
                        long j17 = j14 + 1;
                        byte g3 = K0.g(bArr, j14);
                        if (g3 <= -65 && ((b20 != -32 || g3 >= -96) && (b20 != -19 || g3 < -96))) {
                            j14 += 2;
                            if (K0.g(bArr, j17) > -65) {
                            }
                        }
                    } else {
                        if (i25 < 3) {
                            return X(j14, bArr, b20, i25);
                        }
                        i24 -= 4;
                        long j18 = j14 + 1;
                        byte g7 = K0.g(bArr, j14);
                        if (g7 <= -65) {
                            if ((((g7 + 112) + (b20 << 28)) >> 30) == 0) {
                                long j19 = 2 + j14;
                                if (K0.g(bArr, j18) <= -65) {
                                    j14 += 3;
                                    if (K0.g(bArr, j19) > -65) {
                                    }
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }
}
