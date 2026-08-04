package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class L0 extends w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
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

    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0069 A[LOOP:2: B:25:0x005e->B:29:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0072 A[SYNTHETIC] */
    @Override // com.google.protobuf.w0
    public final String H(byte[] bArr, int i7, int i8) throws M {
        int i9;
        int i10;
        byte b7;
        int i11;
        byte b8;
        switch (this.f12123c) {
            case 0:
                if ((i7 | i8 | ((bArr.length - i7) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                int i12 = i7 + i8;
                char[] cArr = new char[i8];
                int i13 = 0;
                while (i7 < i12) {
                    byte b9 = bArr[i7];
                    if (!w0.b(b9)) {
                        i9 = i13;
                        while (i7 < i12) {
                            i10 = i7 + 1;
                            b7 = bArr[i7];
                            if (w0.b(b7)) {
                                i11 = i9 + 1;
                                cArr[i9] = (char) b7;
                                while (i10 < i12) {
                                    b8 = bArr[i10];
                                    if (w0.b(b8)) {
                                        i10++;
                                        cArr[i11] = (char) b8;
                                        i11++;
                                    } else {
                                        i9 = i11;
                                        i7 = i10;
                                    }
                                }
                                i9 = i11;
                                i7 = i10;
                            } else if (b7 < -32) {
                                if (i10 < i12) {
                                    throw M.c();
                                }
                                i7 += 2;
                                w0.c(b7, bArr[i10], cArr, i9);
                                i9++;
                            } else if (b7 < -16) {
                                if (i10 < i12 - 1) {
                                    throw M.c();
                                }
                                int i14 = i7 + 2;
                                i7 += 3;
                                w0.d(b7, bArr[i10], bArr[i14], cArr, i9);
                                i9++;
                            } else {
                                if (i10 < i12 - 2) {
                                    throw M.c();
                                }
                                byte b10 = bArr[i10];
                                int i15 = i7 + 3;
                                byte b11 = bArr[i7 + 2];
                                i7 += 4;
                                w0.a(b7, b10, b11, bArr[i15], cArr, i9);
                                i9 += 2;
                            }
                        }
                        return new String(cArr, 0, i9);
                    }
                    i7++;
                    cArr[i13] = (char) b9;
                    i13++;
                }
                i9 = i13;
                while (i7 < i12) {
                    i10 = i7 + 1;
                    b7 = bArr[i7];
                    if (w0.b(b7)) {
                        i11 = i9 + 1;
                        cArr[i9] = (char) b7;
                        while (i10 < i12) {
                            b8 = bArr[i10];
                            if (w0.b(b8)) {
                                i9 = i11;
                                i7 = i10;
                            } else {
                                i10++;
                                cArr[i11] = (char) b8;
                                i11++;
                            }
                        }
                        i9 = i11;
                        i7 = i10;
                    } else if (b7 < -32) {
                        if (i10 < i12) {
                            throw M.c();
                        }
                        i7 += 2;
                        w0.c(b7, bArr[i10], cArr, i9);
                        i9++;
                    } else if (b7 < -16) {
                        if (i10 < i12 - 1) {
                            throw M.c();
                        }
                        int i16 = i7 + 2;
                        i7 += 3;
                        w0.d(b7, bArr[i10], bArr[i16], cArr, i9);
                        i9++;
                    } else {
                        if (i10 < i12 - 2) {
                            throw M.c();
                        }
                        byte b12 = bArr[i10];
                        int i17 = i7 + 3;
                        byte b13 = bArr[i7 + 2];
                        i7 += 4;
                        w0.a(b7, b12, b13, bArr[i17], cArr, i9);
                        i9 += 2;
                    }
                }
                return new String(cArr, 0, i9);
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
    public final String J(ByteBuffer byteBuffer, int i7, int i8) throws M {
        long j;
        switch (this.f12123c) {
            case 0:
                return w0.I(byteBuffer, i7, i8);
            default:
                if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
                }
                long j3 = K0.f12117c.j(K0.f12121g, byteBuffer) + ((long) i7);
                long j7 = ((long) i8) + j3;
                char[] cArr = new char[i8];
                int i9 = 0;
                while (true) {
                    j = 1;
                    if (j3 < j7) {
                        byte bE = K0.f12117c.e(j3);
                        if (w0.b(bE)) {
                            j3++;
                            cArr[i9] = (char) bE;
                            i9++;
                        }
                    }
                }
                int i10 = i9;
                while (j3 < j7) {
                    long j8 = j3 + j;
                    J0 j9 = K0.f12117c;
                    byte bE2 = j9.e(j3);
                    if (w0.b(bE2)) {
                        int i11 = i10 + 1;
                        cArr[i10] = (char) bE2;
                        while (j8 < j7) {
                            byte bE3 = K0.f12117c.e(j8);
                            if (w0.b(bE3)) {
                                j8 += j;
                                cArr[i11] = (char) bE3;
                                i11++;
                            } else {
                                i10 = i11;
                                j3 = j8;
                            }
                        }
                        i10 = i11;
                        j3 = j8;
                    } else {
                        if (!(bE2 < -32)) {
                            if (bE2 < -16) {
                                if (j8 >= j7 - j) {
                                    throw M.c();
                                }
                                long j10 = j3 + 2;
                                j3 += 3;
                                w0.d(bE2, j9.e(j8), j9.e(j10), cArr, i10);
                                i10++;
                            } else {
                                if (j8 >= j7 - 2) {
                                    throw M.c();
                                }
                                byte bE4 = j9.e(j8);
                                long j11 = j3 + 3;
                                byte bE5 = j9.e(j3 + 2);
                                j3 += 4;
                                w0.a(bE2, bE4, bE5, j9.e(j11), cArr, i10);
                                i10 += 2;
                            }
                        } else {
                            if (j8 >= j7) {
                                throw M.c();
                            }
                            j3 += 2;
                            w0.c(bE2, j9.e(j8), cArr, i10);
                            i10++;
                        }
                    }
                    j = 1;
                }
                return new String(cArr, 0, i10);
        }
    }

    @Override // com.google.protobuf.w0
    public final int P(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char cCharAt;
        long j;
        String str2;
        String str3;
        int i11;
        char cCharAt2;
        switch (this.f12123c) {
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
                                    throw new M0(i13, length);
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
                            throw new M0(i13 - 1, length);
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
                        K0.l(bArr, j3, (byte) cCharAt2);
                        i19++;
                        j3 = 1 + j3;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char cCharAt5 = str.charAt(i19);
                        if (cCharAt5 < 128 && j3 < j7) {
                            K0.l(bArr, j3, (byte) cCharAt5);
                            str3 = str5;
                            j3 += j;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j3 > j7 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j3 > j7 - 3) {
                                if (j3 > j7 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i11)))) {
                                        throw new M0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j3);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
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
                            K0.l(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j9 = j3 + 2;
                            K0.l(bArr, j3 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            K0.l(bArr, j9, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j10 = j3 + j;
                            K0.l(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                            j3 += 2;
                            K0.l(bArr, j10, (byte) ((cCharAt5 & '?') | 128));
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

    /* JADX WARN: Code duplicated, block: B:111:0x0172  */
    /* JADX WARN: Code duplicated, block: B:113:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0185  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c  */
    /* JADX WARN: Code duplicated, block: B:214:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x012f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x014b  */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0202, code lost:
    
        if (r23[r0] > (-65)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (com.google.protobuf.K0.g(r23, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0245, code lost:
    
        if (r23[r0] > (-65)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (com.google.protobuf.K0.g(r23, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b5, code lost:
    
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
        int i13;
        long j;
        byte bG;
        long j3;
        byte bG2;
        long j7;
        byte bG3;
        long j8;
        int i14 = i8;
        switch (this.f12123c) {
            case 0:
                int iA = 0;
                if (i7 != 0) {
                    if (i14 >= i9) {
                        return i7;
                    }
                    byte b9 = (byte) i7;
                    if (b9 < -32) {
                        if (b9 >= -62) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i14 = i15;
                            }
                        }
                        return -1;
                    }
                    if (b9 < -16) {
                        byte b10 = (byte) (~(i7 >> 8));
                        if (b10 == 0) {
                            i11 = i14 + 1;
                            b8 = bArr[i14];
                            if (i11 >= i9) {
                                return N0.d(b9, b8);
                            }
                        } else {
                            b8 = b10;
                            i11 = i14;
                        }
                        if (b8 <= -65 && ((b9 != -32 || b8 >= -96) && (b9 != -19 || b8 < -96))) {
                            i14 = i11 + 1;
                            break;
                        }
                        return -1;
                    }
                    byte b11 = (byte) (~(i7 >> 8));
                    if (b11 == 0) {
                        i10 = i14 + 1;
                        b11 = bArr[i14];
                        if (i10 >= i9) {
                            return N0.d(b9, b11);
                        }
                        b7 = 0;
                    } else {
                        b7 = (byte) (i7 >> 16);
                        i10 = i14;
                    }
                    if (b7 == 0) {
                        int i16 = i10 + 1;
                        byte b12 = bArr[i10];
                        if (i16 >= i9) {
                            return N0.e(b9, b11, b12);
                        }
                        b7 = b12;
                        i10 = i16;
                    }
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b9 << 28)) >> 30) == 0 && b7 <= -65) {
                            i14 = i10 + 1;
                        }
                        break;
                    }
                    return -1;
                }
                while (i14 < i9 && bArr[i14] >= 0) {
                    i14++;
                }
                if (i14 < i9) {
                    while (i14 < i9) {
                        int i17 = i14 + 1;
                        byte b13 = bArr[i14];
                        if (b13 >= 0) {
                            i14 = i17;
                        } else if (b13 < -32) {
                            if (i17 >= i9) {
                                iA = b13;
                            } else {
                                if (b13 >= -62) {
                                    i14 += 2;
                                    if (bArr[i17] > -65) {
                                    }
                                }
                                iA = -1;
                            }
                        } else if (b13 < -16) {
                            if (i17 >= i9 - 1) {
                                iA = N0.a(bArr, i17, i9);
                            } else {
                                int i18 = i14 + 2;
                                byte b14 = bArr[i17];
                                if (b14 <= -65 && ((b13 != -32 || b14 >= -96) && (b13 != -19 || b14 < -96))) {
                                    i14 += 3;
                                    if (bArr[i18] > -65) {
                                    }
                                }
                                iA = -1;
                            }
                        } else if (i17 >= i9 - 2) {
                            iA = N0.a(bArr, i17, i9);
                        } else {
                            int i19 = i14 + 2;
                            byte b15 = bArr[i17];
                            if (b15 <= -65) {
                                if ((((b15 + 112) + (b13 << 28)) >> 30) == 0) {
                                    int i20 = i14 + 3;
                                    if (bArr[i19] <= -65) {
                                        i14 += 4;
                                        if (bArr[i20] > -65) {
                                        }
                                    }
                                }
                            }
                            iA = -1;
                        }
                    }
                }
                return iA;
            default:
                if ((i14 | i9 | (bArr.length - i9)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i8), Integer.valueOf(i9)));
                }
                long j9 = i14;
                long j10 = i9;
                if (i7 != 0) {
                    if (j9 >= j10) {
                        return i7;
                    }
                    byte b16 = (byte) i7;
                    if (b16 >= -32) {
                        if (b16 >= -16) {
                            byte bG4 = (byte) (~(i7 >> 8));
                            if (bG4 == 0) {
                                long j11 = j9 + 1;
                                bG4 = K0.g(bArr, j9);
                                if (j11 >= j10) {
                                    return N0.d(b16, bG4);
                                }
                                j9 = j11;
                                bG3 = 0;
                            } else {
                                bG3 = (byte) (i7 >> 16);
                            }
                            if (bG3 == 0) {
                                long j12 = j9 + 1;
                                bG3 = K0.g(bArr, j9);
                                if (j12 >= j10) {
                                    return N0.e(b16, bG4, bG3);
                                }
                                j9 = j12;
                            }
                            if (bG4 <= -65) {
                                if ((((bG4 + 112) + (b16 << 28)) >> 30) == 0 && bG3 <= -65) {
                                    j8 = j9 + 1;
                                }
                            }
                        } else {
                            byte bG5 = (byte) (~(i7 >> 8));
                            if (bG5 == 0) {
                                long j13 = j9 + 1;
                                bG5 = K0.g(bArr, j9);
                                if (j13 >= j10) {
                                    return N0.d(b16, bG5);
                                }
                                j9 = j13;
                            }
                            if (bG5 <= -65 && ((b16 != -32 || bG5 >= -96) && (b16 != -19 || bG5 < -96))) {
                                j8 = j9 + 1;
                            }
                        }
                    } else if (b16 >= -62) {
                        j8 = j9 + 1;
                    }
                    break;
                } else {
                    int i21 = (int) (j10 - j9);
                    if (i21 < 16) {
                        i12 = 0;
                    } else {
                        int i22 = 8 - (((int) j9) & 7);
                        long j14 = j9;
                        i12 = 0;
                        while (true) {
                            if (i12 < i22) {
                                long j15 = j14 + 1;
                                if (K0.g(bArr, j14) >= 0) {
                                    i12++;
                                    j14 = j15;
                                }
                            } else {
                                while (true) {
                                    int i23 = i12 + 8;
                                    if (i23 <= i21) {
                                        if ((K0.f12117c.j(K0.f12120f + j14, bArr) & (-9187201950435737472L)) == 0) {
                                            j14 += 8;
                                            i12 = i23;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i12 < i21) {
                                        long j16 = j14 + 1;
                                        if (K0.g(bArr, j14) >= 0) {
                                            i12++;
                                            j14 = j16;
                                        }
                                    } else {
                                        i12 = i21;
                                    }
                                }
                            }
                        }
                    }
                    int i24 = i21 - i12;
                    long j17 = j9 + ((long) i12);
                    while (true) {
                        byte bG6 = 0;
                        while (i24 > 0) {
                            long j18 = j17 + 1;
                            bG6 = K0.g(bArr, j17);
                            if (bG6 >= 0) {
                                i24--;
                                j17 = j18;
                            } else {
                                j17 = j18;
                                if (i24 == 0) {
                                    return 0;
                                }
                                i13 = i24 - 1;
                                if (bG6 < -32) {
                                    if (i13 == 0) {
                                        return bG6;
                                    }
                                    i24 -= 2;
                                    if (bG6 >= -62) {
                                        j = j17 + 1;
                                        if (K0.g(bArr, j17) > -65) {
                                            j17 = j;
                                        }
                                    }
                                } else if (bG6 < -16) {
                                    if (i13 < 2) {
                                        return X(j17, bArr, bG6, i13);
                                    }
                                    i24 -= 3;
                                    long j19 = j17 + 1;
                                    bG = K0.g(bArr, j17);
                                    if (bG > -65 && ((bG6 != -32 || bG >= -96) && (bG6 != -19 || bG < -96))) {
                                        j17 += 2;
                                        if (K0.g(bArr, j19) > -65) {
                                        }
                                    }
                                } else {
                                    if (i13 < 3) {
                                        return X(j17, bArr, bG6, i13);
                                    }
                                    i24 -= 4;
                                    j3 = j17 + 1;
                                    bG2 = K0.g(bArr, j17);
                                    if (bG2 <= -65) {
                                        if ((((bG2 + 112) + (bG6 << 28)) >> 30) == 0) {
                                            j7 = 2 + j17;
                                            if (K0.g(bArr, j3) <= -65) {
                                                j17 += 3;
                                                if (K0.g(bArr, j7) > -65) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i24 == 0) {
                            return 0;
                        }
                        i13 = i24 - 1;
                        if (bG6 < -32) {
                            if (i13 == 0) {
                                return bG6;
                            }
                            i24 -= 2;
                            if (bG6 >= -62) {
                                j = j17 + 1;
                                if (K0.g(bArr, j17) > -65) {
                                    j17 = j;
                                }
                            }
                        } else if (bG6 < -16) {
                            if (i13 < 2) {
                                return X(j17, bArr, bG6, i13);
                            }
                            i24 -= 3;
                            long j110 = j17 + 1;
                            bG = K0.g(bArr, j17);
                            if (bG > -65) {
                            }
                        } else {
                            if (i13 < 3) {
                                return X(j17, bArr, bG6, i13);
                            }
                            i24 -= 4;
                            j3 = j17 + 1;
                            bG2 = K0.g(bArr, j17);
                            if (bG2 <= -65) {
                                if ((((bG2 + 112) + (bG6 << 28)) >> 30) == 0) {
                                    j7 = 2 + j17;
                                    if (K0.g(bArr, j3) <= -65) {
                                        j17 += 3;
                                        if (K0.g(bArr, j7) > -65) {
                                        }
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
