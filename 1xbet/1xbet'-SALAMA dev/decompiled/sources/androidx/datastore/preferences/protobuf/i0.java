package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends p097n3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9208g;

    public /* synthetic */ i0(int i7) {
        this.f9208g = i7;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    @Override // p097n3.a
    public final String p(byte[] bArr, int i7, int i8) throws C0679y {
        int i9;
        byte b7;
        int i10;
        byte b8;
        byte b9;
        byte b10;
        switch (this.f9208g) {
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
                                    throw C0679y.a();
                                }
                                i7 += 2;
                                byte b12 = bArr[i9];
                                int i13 = i12 + 1;
                                if (b7 >= -62 || p003a.a.Z(b12)) {
                                    throw C0679y.a();
                                }
                                cArr[i12] = (char) ((b12 & 63) | ((b7 & 31) << 6));
                                i12 = i13;
                            } else {
                                if (b7 >= -16) {
                                    if (i9 < i11 - 2) {
                                        throw C0679y.a();
                                    }
                                    b10 = bArr[i9];
                                    int i14 = i7 + 3;
                                    byte b13 = bArr[i7 + 2];
                                    i7 += 4;
                                    byte b14 = bArr[i14];
                                    int i15 = i12 + 1;
                                    if (!p003a.a.Z(b10)) {
                                        if ((((b10 + 112) + (b7 << 28)) >> 30) != 0 && !p003a.a.Z(b13) && !p003a.a.Z(b14)) {
                                            int i16 = ((b10 & 63) << 12) | ((b7 & 7) << 18) | ((b13 & 63) << 6) | (b14 & 63);
                                            cArr[i12] = (char) ((i16 >>> 10) + 55232);
                                            cArr[i15] = (char) ((i16 & 1023) + 56320);
                                            i12 += 2;
                                        }
                                    }
                                    throw C0679y.a();
                                }
                                if (i9 < i11 - 1) {
                                    throw C0679y.a();
                                }
                                int i17 = i7 + 2;
                                b9 = bArr[i9];
                                i7 += 3;
                                byte b15 = bArr[i17];
                                int i18 = i12 + 1;
                                if (!p003a.a.Z(b9) || ((b7 == -32 && b9 < -96) || ((b7 == -19 && b9 >= -96) || p003a.a.Z(b15)))) {
                                    throw C0679y.a();
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
                                throw C0679y.a();
                            }
                            i7 += 2;
                            byte b16 = bArr[i9];
                            int i19 = i12 + 1;
                            if (b7 >= -62) {
                            }
                            throw C0679y.a();
                        }
                        if (b7 >= -16) {
                            if (i9 < i11 - 1) {
                                throw C0679y.a();
                            }
                            int i110 = i7 + 2;
                            b9 = bArr[i9];
                            i7 += 3;
                            byte b17 = bArr[i110];
                            int i111 = i12 + 1;
                            if (p003a.a.Z(b9)) {
                            }
                            throw C0679y.a();
                        }
                        if (i9 < i11 - 2) {
                            throw C0679y.a();
                        }
                        b10 = bArr[i9];
                        int i112 = i7 + 3;
                        byte b18 = bArr[i7 + 2];
                        i7 += 4;
                        byte b19 = bArr[i112];
                        int i113 = i12 + 1;
                        if (!p003a.a.Z(b10)) {
                            if ((((b10 + 112) + (b7 << 28)) >> 30) != 0) {
                            }
                        }
                        throw C0679y.a();
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
                Charset charset = AbstractC0677w.f9255a;
                String str = new String(bArr, i7, i8, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i7, i8 + i7))) {
                    throw C0679y.a();
                }
                return str;
        }
    }

    @Override // p097n3.a
    public final int s(String str, byte[] bArr, int i7, int i8) {
        int i9;
        int i10;
        char cCharAt;
        long j;
        String str2;
        String str3;
        int i11;
        char cCharAt2;
        switch (this.f9208g) {
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
                                    throw new j0(i13, length);
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
                            throw new j0(i13 - 1, length);
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
                        h0.j(bArr, j3, (byte) cCharAt2);
                        i19++;
                        j3 = 1 + j3;
                    }
                }
                if (i19 != length2) {
                    while (i19 < length2) {
                        char cCharAt5 = str.charAt(i19);
                        if (cCharAt5 < 128 && j3 < j7) {
                            h0.j(bArr, j3, (byte) cCharAt5);
                            str3 = str5;
                            j3 += j;
                            str2 = str4;
                        } else if (cCharAt5 >= 2048 || j3 > j7 - 2) {
                            str2 = str4;
                            str3 = str5;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j3 > j7 - 3) {
                                if (j3 > j7 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i11 = i19 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i11)))) {
                                        throw new j0(i19, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException(str3 + cCharAt5 + str2 + j3);
                                }
                                int i20 = i19 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        h0.j(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                        h0.j(bArr, j3 + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j8 = 3 + j3;
                                        h0.j(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j3 += 4;
                                        h0.j(bArr, j8, (byte) ((codePoint2 & 63) | 128));
                                        i19 = i20;
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                throw new j0(i19 - 1, length2);
                            }
                            h0.j(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j9 = j3 + 2;
                            h0.j(bArr, j3 + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j3 += 3;
                            h0.j(bArr, j9, (byte) ((cCharAt5 & '?') | 128));
                        } else {
                            str2 = str4;
                            str3 = str5;
                            long j10 = j3 + j;
                            h0.j(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                            j3 += 2;
                            h0.j(bArr, j10, (byte) ((cCharAt5 & '?') | 128));
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
