package com.google.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0824d;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f12286a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v0 f12287b = new v0();

    public static int A(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        G g3 = (G) j;
        int iL = L(bArr, i8, c0824d);
        g3.t(H6.b.b(c0824d.f11761a));
        while (iL < i9) {
            int iL2 = L(bArr, iL, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iL = L(bArr, iL2, c0824d);
            g3.t(H6.b.b(c0824d.f11761a));
        }
        return iL;
    }

    public static int B(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        V v6 = (V) j;
        int iN = N(bArr, i8, c0824d);
        v6.t(H6.b.d(c0824d.f11762b));
        while (iN < i9) {
            int iL = L(bArr, iN, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iN = N(bArr, iL, c0824d);
            v6.t(H6.b.d(c0824d.f11762b));
        }
        return iN;
    }

    public static int C(byte[] bArr, int i7, C0824d c0824d) throws M {
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a;
        if (i8 < 0) {
            throw M.f();
        }
        if (i8 == 0) {
            c0824d.f11763c = "";
            return iL;
        }
        c0824d.f11763c = new String(bArr, iL, i8, K.f12112a);
        return iL + i8;
    }

    public static int D(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) throws M {
        int iL = L(bArr, i8, c0824d);
        int i10 = c0824d.f11761a;
        if (i10 < 0) {
            throw M.f();
        }
        if (i10 == 0) {
            j.add("");
        } else {
            j.add(new String(bArr, iL, i10, K.f12112a));
            iL += i10;
        }
        while (iL < i9) {
            int iL2 = L(bArr, iL, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iL = L(bArr, iL2, c0824d);
            int i11 = c0824d.f11761a;
            if (i11 < 0) {
                throw M.f();
            }
            if (i11 == 0) {
                j.add("");
            } else {
                j.add(new String(bArr, iL, i11, K.f12112a));
                iL += i11;
            }
        }
        return iL;
    }

    public static int E(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) throws M {
        int iL = L(bArr, i8, c0824d);
        int i10 = c0824d.f11761a;
        if (i10 < 0) {
            throw M.f();
        }
        if (i10 == 0) {
            j.add("");
        } else {
            int i11 = iL + i10;
            if (N0.f12134a.U(0, bArr, iL, i11) != 0) {
                throw M.c();
            }
            j.add(new String(bArr, iL, i10, K.f12112a));
            iL = i11;
        }
        while (iL < i9) {
            int iL2 = L(bArr, iL, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iL = L(bArr, iL2, c0824d);
            int i12 = c0824d.f11761a;
            if (i12 < 0) {
                throw M.f();
            }
            if (i12 == 0) {
                j.add("");
            } else {
                int i13 = iL + i12;
                if (N0.f12134a.U(0, bArr, iL, i13) != 0) {
                    throw M.c();
                }
                j.add(new String(bArr, iL, i12, K.f12112a));
                iL = i13;
            }
        }
        return iL;
    }

    public static int F(byte[] bArr, int i7, C0824d c0824d) throws M {
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a;
        if (i8 < 0) {
            throw M.f();
        }
        if (i8 == 0) {
            c0824d.f11763c = "";
            return iL;
        }
        c0824d.f11763c = N0.f12134a.H(bArr, iL, i8);
        return iL + i8;
    }

    public static int G(int i7, byte[] bArr, int i8, int i9, B0 b7, C0824d c0824d) throws M {
        if ((i7 >>> 3) == 0) {
            throw M.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int iN = N(bArr, i8, c0824d);
            b7.d(i7, Long.valueOf(c0824d.f11762b));
            return iN;
        }
        if (i10 == 1) {
            b7.d(i7, Long.valueOf(l(i8, bArr)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int iL = L(bArr, i8, c0824d);
            int i11 = c0824d.f11761a;
            if (i11 < 0) {
                throw M.f();
            }
            if (i11 > bArr.length - iL) {
                throw M.h();
            }
            if (i11 == 0) {
                b7.d(i7, AbstractC0867k.f12212b);
            } else {
                b7.d(i7, AbstractC0867k.A(bArr, iL, i11));
            }
            return iL + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw M.b();
            }
            b7.d(i7, Integer.valueOf(j(i8, bArr)));
            return i8 + 4;
        }
        B0 b0C = B0.c();
        int i12 = (i7 & (-8)) | 4;
        int i13 = 0;
        while (i8 < i9) {
            int iL2 = L(bArr, i8, c0824d);
            int i14 = c0824d.f11761a;
            if (i14 == i12) {
                i13 = i14;
                i8 = iL2;
                break;
            }
            i13 = i14;
            i8 = G(i14, bArr, iL2, i9, b0C, c0824d);
        }
        if (i8 > i9 || i13 != i12) {
            throw M.g();
        }
        b7.d(i7, b0C);
        return i8;
    }

    public static String I(ByteBuffer byteBuffer, int i7, int i8) throws M {
        if ((i7 | i8 | ((byteBuffer.limit() - i7) - i8)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i8)));
        }
        int i9 = i7 + i8;
        char[] cArr = new char[i8];
        int i10 = 0;
        while (i7 < i9) {
            byte b7 = byteBuffer.get(i7);
            if (!b(b7)) {
                break;
            }
            i7++;
            cArr[i10] = (char) b7;
            i10++;
        }
        int i11 = i10;
        while (i7 < i9) {
            int i12 = i7 + 1;
            byte b8 = byteBuffer.get(i7);
            if (b(b8)) {
                int i13 = i11 + 1;
                cArr[i11] = (char) b8;
                while (i12 < i9) {
                    byte b9 = byteBuffer.get(i12);
                    if (!b(b9)) {
                        break;
                    }
                    i12++;
                    cArr[i13] = (char) b9;
                    i13++;
                }
                i11 = i13;
                i7 = i12;
            } else if (b8 < -32) {
                if (i12 >= i9) {
                    throw M.c();
                }
                i7 += 2;
                c(b8, byteBuffer.get(i12), cArr, i11);
                i11++;
            } else if (b8 < -16) {
                if (i12 >= i9 - 1) {
                    throw M.c();
                }
                int i14 = i7 + 2;
                i7 += 3;
                d(b8, byteBuffer.get(i12), byteBuffer.get(i14), cArr, i11);
                i11++;
            } else {
                if (i12 >= i9 - 2) {
                    throw M.c();
                }
                byte b10 = byteBuffer.get(i12);
                int i15 = i7 + 3;
                byte b11 = byteBuffer.get(i7 + 2);
                i7 += 4;
                a(b8, b10, b11, byteBuffer.get(i15), cArr, i11);
                i11 += 2;
            }
        }
        return new String(cArr, 0, i11);
    }

    public static int K(int i7, byte[] bArr, int i8, C0824d c0824d) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            c0824d.f11761a = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & 127) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            c0824d.f11761a = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & 127) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            c0824d.f11761a = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & 127) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            c0824d.f11761a = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & 127) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                c0824d.f11761a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int L(byte[] bArr, int i7, C0824d c0824d) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return K(b7, bArr, i8, c0824d);
        }
        c0824d.f11761a = b7;
        return i8;
    }

    public static int M(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        G g3 = (G) j;
        int iL = L(bArr, i8, c0824d);
        g3.t(c0824d.f11761a);
        while (iL < i9) {
            int iL2 = L(bArr, iL, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iL = L(bArr, iL2, c0824d);
            g3.t(c0824d.f11761a);
        }
        return iL;
    }

    public static int N(byte[] bArr, int i7, C0824d c0824d) {
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            c0824d.f11762b = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j3 = (j & 127) | (((long) (b7 & 127)) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            byte b8 = bArr[i9];
            i10 += 7;
            j3 |= ((long) (b8 & 127)) << i10;
            b7 = b8;
            i9 = i11;
        }
        c0824d.f11762b = j3;
        return i9;
    }

    public static int O(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        V v6 = (V) j;
        int iN = N(bArr, i8, c0824d);
        v6.t(c0824d.f11762b);
        while (iN < i9) {
            int iL = L(bArr, iN, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iN = N(bArr, iL, c0824d);
            v6.t(c0824d.f11762b);
        }
        return iN;
    }

    public static String Q(AbstractC0867k abstractC0867k) {
        StringBuilder sb = new StringBuilder(abstractC0867k.size());
        for (int i7 = 0; i7 < abstractC0867k.size(); i7++) {
            byte bT = abstractC0867k.t(i7);
            if (bT == 34) {
                sb.append("\\\"");
            } else if (bT == 39) {
                sb.append("\\'");
            } else if (bT != 92) {
                switch (bT) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bT < 32 || bT > 126) {
                            sb.append('\\');
                            sb.append((char) (((bT >>> 6) & 3) + 48));
                            sb.append((char) (((bT >>> 3) & 7) + 48));
                            sb.append((char) ((bT & 7) + 48));
                        } else {
                            sb.append((char) bT);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean R(byte b7) {
        return b7 > -65;
    }

    public static int S(Object obj, InterfaceC0881r0 interfaceC0881r0, byte[] bArr, int i7, int i8, int i9, C0824d c0824d) {
        int iG = ((C0858f0) interfaceC0881r0).G(obj, bArr, i7, i8, i9, c0824d);
        c0824d.f11763c = obj;
        return iG;
    }

    public static int T(Object obj, InterfaceC0881r0 interfaceC0881r0, byte[] bArr, int i7, int i8, C0824d c0824d) throws M {
        int iK = i7 + 1;
        int i9 = bArr[i7];
        if (i9 < 0) {
            iK = K(i9, bArr, iK, c0824d);
            i9 = c0824d.f11761a;
        }
        int i10 = iK;
        if (i9 < 0 || i9 > i8 - i10) {
            throw M.h();
        }
        int i11 = i9 + i10;
        interfaceC0881r0.i(obj, bArr, i10, i11, c0824d);
        c0824d.f11763c = obj;
        return i11;
    }

    public static int V(int i7, byte[] bArr, int i8, int i9, C0824d c0824d) throws M {
        if ((i7 >>> 3) == 0) {
            throw M.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return N(bArr, i8, c0824d);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return L(bArr, i8, c0824d) + c0824d.f11761a;
        }
        if (i10 != 3) {
            if (i10 == 5) {
                return i8 + 4;
            }
            throw M.b();
        }
        int i11 = (i7 & (-8)) | 4;
        int i12 = 0;
        while (i8 < i9) {
            i8 = L(bArr, i8, c0824d);
            i12 = c0824d.f11761a;
            if (i12 == i11) {
                break;
            }
            i8 = V(i12, bArr, i8, i9, c0824d);
        }
        if (i8 > i9 || i12 != i11) {
            throw M.g();
        }
        return i8;
    }

    public static void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws M {
        if (!R(b8)) {
            if ((((b8 + 112) + (b7 << 28)) >> 30) == 0 && !R(b9) && !R(b10)) {
                int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i7] = (char) ((i8 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
                return;
            }
        }
        throw M.c();
    }

    public static boolean b(byte b7) {
        return b7 >= 0;
    }

    public static void c(byte b7, byte b8, char[] cArr, int i7) throws M {
        if (b7 < -62 || R(b8)) {
            throw M.c();
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    public static void d(byte b7, byte b8, byte b9, char[] cArr, int i7) throws M {
        if (R(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || R(b9)))) {
            throw M.c();
        }
        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
    }

    public static int e(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        AbstractC0855e abstractC0855e = (AbstractC0855e) j;
        int iN = N(bArr, i8, c0824d);
        abstractC0855e.t(c0824d.f11762b != 0);
        while (iN < i9) {
            int iL = L(bArr, iN, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iN = N(bArr, iL, c0824d);
            abstractC0855e.t(c0824d.f11762b != 0);
        }
        return iN;
    }

    public static int f(byte[] bArr, int i7, C0824d c0824d) throws M {
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a;
        if (i8 < 0) {
            throw M.f();
        }
        if (i8 > bArr.length - iL) {
            throw M.h();
        }
        if (i8 == 0) {
            c0824d.f11763c = AbstractC0867k.f12212b;
            return iL;
        }
        c0824d.f11763c = AbstractC0867k.A(bArr, iL, i8);
        return iL + i8;
    }

    public static int g(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) throws M {
        int iL = L(bArr, i8, c0824d);
        int i10 = c0824d.f11761a;
        if (i10 < 0) {
            throw M.f();
        }
        if (i10 > bArr.length - iL) {
            throw M.h();
        }
        if (i10 == 0) {
            j.add(AbstractC0867k.f12212b);
        } else {
            j.add(AbstractC0867k.A(bArr, iL, i10));
            iL += i10;
        }
        while (iL < i9) {
            int iL2 = L(bArr, iL, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            iL = L(bArr, iL2, c0824d);
            int i11 = c0824d.f11761a;
            if (i11 < 0) {
                throw M.f();
            }
            if (i11 > bArr.length - iL) {
                throw M.h();
            }
            if (i11 == 0) {
                j.add(AbstractC0867k.f12212b);
            } else {
                j.add(AbstractC0867k.A(bArr, iL, i11));
                iL += i11;
            }
        }
        return iL;
    }

    public static double h(int i7, byte[] bArr) {
        return Double.longBitsToDouble(l(i7, bArr));
    }

    public static int i(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        r rVar = (r) j;
        rVar.t(h(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int iL = L(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            rVar.t(Double.longBitsToDouble(l(iL, bArr)));
            i10 = iL + 8;
        }
        return i10;
    }

    public static int j(int i7, byte[] bArr) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int k(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        G g3 = (G) j;
        g3.t(j(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int iL = L(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            g3.t(j(iL, bArr));
            i10 = iL + 4;
        }
        return i10;
    }

    public static long l(int i7, byte[] bArr) {
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public static int m(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        V v6 = (V) j;
        v6.t(l(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int iL = L(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            v6.t(l(iL, bArr));
            i10 = iL + 8;
        }
        return i10;
    }

    public static float n(int i7, byte[] bArr) {
        return Float.intBitsToFloat(j(i7, bArr));
    }

    public static int o(int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        AbstractC0890y abstractC0890y = (AbstractC0890y) j;
        abstractC0890y.t(n(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int iL = L(bArr, i10, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            abstractC0890y.t(Float.intBitsToFloat(j(iL, bArr)));
            i10 = iL + 4;
        }
        return i10;
    }

    public static int p(InterfaceC0881r0 interfaceC0881r0, int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) {
        int i10 = (i7 & (-8)) | 4;
        C cD = interfaceC0881r0.d();
        int iS = S(cD, interfaceC0881r0, bArr, i8, i9, i10, c0824d);
        interfaceC0881r0.b(cD);
        c0824d.f11763c = cD;
        j.add(cD);
        while (iS < i9) {
            int iL = L(bArr, iS, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            C cD2 = interfaceC0881r0.d();
            int iS2 = S(cD2, interfaceC0881r0, bArr, iL, i9, i10, c0824d);
            interfaceC0881r0.b(cD2);
            c0824d.f11763c = cD2;
            j.add(cD2);
            iS = iS2;
        }
        return iS;
    }

    public static int q(InterfaceC0881r0 interfaceC0881r0, int i7, byte[] bArr, int i8, int i9, J j, C0824d c0824d) throws M {
        C cD = interfaceC0881r0.d();
        int iT = T(cD, interfaceC0881r0, bArr, i8, i9, c0824d);
        interfaceC0881r0.b(cD);
        c0824d.f11763c = cD;
        j.add(cD);
        while (iT < i9) {
            int iL = L(bArr, iT, c0824d);
            if (i7 != c0824d.f11761a) {
                break;
            }
            C cD2 = interfaceC0881r0.d();
            int iT2 = T(cD2, interfaceC0881r0, bArr, iL, i9, c0824d);
            interfaceC0881r0.b(cD2);
            c0824d.f11763c = cD2;
            j.add(cD2);
            iT = iT2;
        }
        return iT;
    }

    public static int r(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        AbstractC0855e abstractC0855e = (AbstractC0855e) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            iL = N(bArr, iL, c0824d);
            abstractC0855e.t(c0824d.f11762b != 0);
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int s(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        r rVar = (r) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            rVar.t(Double.longBitsToDouble(l(iL, bArr)));
            iL += 8;
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int t(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        G g3 = (G) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            g3.t(j(iL, bArr));
            iL += 4;
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int u(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        V v6 = (V) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            v6.t(l(iL, bArr));
            iL += 8;
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int v(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        AbstractC0890y abstractC0890y = (AbstractC0890y) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            abstractC0890y.t(Float.intBitsToFloat(j(iL, bArr)));
            iL += 4;
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int w(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        G g3 = (G) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            iL = L(bArr, iL, c0824d);
            g3.t(H6.b.b(c0824d.f11761a));
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int x(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        V v6 = (V) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            iL = N(bArr, iL, c0824d);
            v6.t(H6.b.d(c0824d.f11762b));
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int y(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        G g3 = (G) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            iL = L(bArr, iL, c0824d);
            g3.t(c0824d.f11761a);
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public static int z(byte[] bArr, int i7, J j, C0824d c0824d) throws M {
        V v6 = (V) j;
        int iL = L(bArr, i7, c0824d);
        int i8 = c0824d.f11761a + iL;
        while (iL < i8) {
            iL = N(bArr, iL, c0824d);
            v6.t(c0824d.f11762b);
        }
        if (iL == i8) {
            return iL;
        }
        throw M.h();
    }

    public abstract String H(byte[] bArr, int i7, int i8);

    public abstract String J(ByteBuffer byteBuffer, int i7, int i8);

    public abstract int P(String str, byte[] bArr, int i7, int i8);

    public abstract int U(int i7, byte[] bArr, int i8, int i9);

    public abstract void W(byte[] bArr, int i7, int i8);
}
