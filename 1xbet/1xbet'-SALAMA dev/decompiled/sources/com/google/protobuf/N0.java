package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f12134a;

    static {
        f12134a = (K0.f12119e && K0.f12118d && !AbstractC0851c.a()) ? new L0(1) : new L0(0);
    }

    public static int a(byte[] bArr, int i7, int i8) {
        byte b7 = bArr[i7 - 1];
        int i9 = i8 - i7;
        if (i9 == 0) {
            if (b7 > -12) {
                b7 = -1;
            }
            return b7;
        }
        if (i9 == 1) {
            return d(b7, bArr[i7]);
        }
        if (i9 == 2) {
            return e(b7, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    public static String b(ByteBuffer byteBuffer, int i7, int i8) {
        w0 w0Var = f12134a;
        w0Var.getClass();
        if (byteBuffer.hasArray()) {
            return w0Var.H(byteBuffer.array(), byteBuffer.arrayOffset() + i7, i8);
        }
        return byteBuffer.isDirect() ? w0Var.J(byteBuffer, i7, i8) : w0.I(byteBuffer, i7, i8);
    }

    public static int c(String str) {
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < length && str.charAt(i8) < 128) {
            i8++;
        }
        int i9 = length;
        while (i8 < length) {
            char cCharAt = str.charAt(i8);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i8 < length2) {
                    char cCharAt2 = str.charAt(i8);
                    if (cCharAt2 < 2048) {
                        i7 += (127 - cCharAt2) >>> 31;
                    } else {
                        i7 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i8) < 65536) {
                                throw new M0(i8, length2);
                            }
                            i8++;
                        }
                    }
                    i8++;
                }
                i9 += i7;
                break;
            }
            i9 += (127 - cCharAt) >>> 31;
            i8++;
        }
        if (i9 >= length) {
            return i9;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i9) + 4294967296L));
    }

    public static int d(int i7, int i8) {
        if (i7 > -12 || i8 > -65) {
            return -1;
        }
        return i7 ^ (i8 << 8);
    }

    public static int e(int i7, int i8, int i9) {
        if (i7 > -12 || i8 > -65 || i9 > -65) {
            return -1;
        }
        return (i7 ^ (i8 << 8)) ^ (i9 << 16);
    }

    public static boolean f(byte[] bArr, int i7, int i8) {
        return f12134a.U(0, bArr, i7, i8) == 0;
    }
}
