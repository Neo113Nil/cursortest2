package com.google.protobuf;

import com.google.crypto.tink.shaded.protobuf.C0868d;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u0 f12286a = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f12287b = new v0();

    public static int A(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        G g3 = (G) j;
        int L7 = L(bArr, i8, c0868d);
        g3.t(H6.b.b(c0868d.f11761a));
        while (L7 < i9) {
            int L8 = L(bArr, L7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            L7 = L(bArr, L8, c0868d);
            g3.t(H6.b.b(c0868d.f11761a));
        }
        return L7;
    }

    public static int B(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        V v6 = (V) j;
        int N7 = N(bArr, i8, c0868d);
        v6.t(H6.b.d(c0868d.f11762b));
        while (N7 < i9) {
            int L7 = L(bArr, N7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            N7 = N(bArr, L7, c0868d);
            v6.t(H6.b.d(c0868d.f11762b));
        }
        return N7;
    }

    public static int C(byte[] bArr, int i7, C0868d c0868d) {
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a;
        if (i8 < 0) {
            throw M.f();
        }
        if (i8 == 0) {
            c0868d.f11763c = "";
            return L7;
        }
        c0868d.f11763c = new String(bArr, L7, i8, K.f12112a);
        return L7 + i8;
    }

    public static int D(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        int L7 = L(bArr, i8, c0868d);
        int i10 = c0868d.f11761a;
        if (i10 < 0) {
            throw M.f();
        }
        if (i10 == 0) {
            j.add("");
        } else {
            j.add(new String(bArr, L7, i10, K.f12112a));
            L7 += i10;
        }
        while (L7 < i9) {
            int L8 = L(bArr, L7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            L7 = L(bArr, L8, c0868d);
            int i11 = c0868d.f11761a;
            if (i11 < 0) {
                throw M.f();
            }
            if (i11 == 0) {
                j.add("");
            } else {
                j.add(new String(bArr, L7, i11, K.f12112a));
                L7 += i11;
            }
        }
        return L7;
    }

    public static int E(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        int L7 = L(bArr, i8, c0868d);
        int i10 = c0868d.f11761a;
        if (i10 < 0) {
            throw M.f();
        }
        if (i10 == 0) {
            j.add("");
        } else {
            int i11 = L7 + i10;
            if (N0.f12134a.U(0, bArr, L7, i11) != 0) {
                throw M.c();
            }
            j.add(new String(bArr, L7, i10, K.f12112a));
            L7 = i11;
        }
        while (L7 < i9) {
            int L8 = L(bArr, L7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            L7 = L(bArr, L8, c0868d);
            int i12 = c0868d.f11761a;
            if (i12 < 0) {
                throw M.f();
            }
            if (i12 == 0) {
                j.add("");
            } else {
                int i13 = L7 + i12;
                if (N0.f12134a.U(0, bArr, L7, i13) != 0) {
                    throw M.c();
                }
                j.add(new String(bArr, L7, i12, K.f12112a));
                L7 = i13;
            }
        }
        return L7;
    }

    public static int F(byte[] bArr, int i7, C0868d c0868d) {
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a;
        if (i8 < 0) {
            throw M.f();
        }
        if (i8 == 0) {
            c0868d.f11763c = "";
            return L7;
        }
        c0868d.f11763c = N0.f12134a.H(bArr, L7, i8);
        return L7 + i8;
    }

    public static int G(int i7, byte[] bArr, int i8, int i9, B0 b02, C0868d c0868d) {
        if ((i7 >>> 3) == 0) {
            throw M.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            int N7 = N(bArr, i8, c0868d);
            b02.d(i7, Long.valueOf(c0868d.f11762b));
            return N7;
        }
        if (i10 == 1) {
            b02.d(i7, Long.valueOf(l(i8, bArr)));
            return i8 + 8;
        }
        if (i10 == 2) {
            int L7 = L(bArr, i8, c0868d);
            int i11 = c0868d.f11761a;
            if (i11 < 0) {
                throw M.f();
            }
            if (i11 > bArr.length - L7) {
                throw M.h();
            }
            if (i11 == 0) {
                b02.d(i7, AbstractC0911k.f12212b);
            } else {
                b02.d(i7, AbstractC0911k.A(bArr, L7, i11));
            }
            return L7 + i11;
        }
        if (i10 != 3) {
            if (i10 != 5) {
                throw M.b();
            }
            b02.d(i7, Integer.valueOf(j(i8, bArr)));
            return i8 + 4;
        }
        B0 c3 = B0.c();
        int i12 = (i7 & (-8)) | 4;
        int i13 = 0;
        while (true) {
            if (i8 >= i9) {
                break;
            }
            int L8 = L(bArr, i8, c0868d);
            int i14 = c0868d.f11761a;
            if (i14 == i12) {
                i13 = i14;
                i8 = L8;
                break;
            }
            i13 = i14;
            i8 = G(i14, bArr, L8, i9, c3, c0868d);
        }
        if (i8 > i9 || i13 != i12) {
            throw M.g();
        }
        b02.d(i7, c3);
        return i8;
    }

    public static String I(ByteBuffer byteBuffer, int i7, int i8) {
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

    public static int K(int i7, byte[] bArr, int i8, C0868d c0868d) {
        int i9 = i7 & 127;
        int i10 = i8 + 1;
        byte b7 = bArr[i8];
        if (b7 >= 0) {
            c0868d.f11761a = i9 | (b7 << 7);
            return i10;
        }
        int i11 = i9 | ((b7 & Byte.MAX_VALUE) << 7);
        int i12 = i8 + 2;
        byte b8 = bArr[i10];
        if (b8 >= 0) {
            c0868d.f11761a = i11 | (b8 << 14);
            return i12;
        }
        int i13 = i11 | ((b8 & Byte.MAX_VALUE) << 14);
        int i14 = i8 + 3;
        byte b9 = bArr[i12];
        if (b9 >= 0) {
            c0868d.f11761a = i13 | (b9 << 21);
            return i14;
        }
        int i15 = i13 | ((b9 & Byte.MAX_VALUE) << 21);
        int i16 = i8 + 4;
        byte b10 = bArr[i14];
        if (b10 >= 0) {
            c0868d.f11761a = i15 | (b10 << 28);
            return i16;
        }
        int i17 = i15 | ((b10 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i18 = i16 + 1;
            if (bArr[i16] >= 0) {
                c0868d.f11761a = i17;
                return i18;
            }
            i16 = i18;
        }
    }

    public static int L(byte[] bArr, int i7, C0868d c0868d) {
        int i8 = i7 + 1;
        byte b7 = bArr[i7];
        if (b7 < 0) {
            return K(b7, bArr, i8, c0868d);
        }
        c0868d.f11761a = b7;
        return i8;
    }

    public static int M(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        G g3 = (G) j;
        int L7 = L(bArr, i8, c0868d);
        g3.t(c0868d.f11761a);
        while (L7 < i9) {
            int L8 = L(bArr, L7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            L7 = L(bArr, L8, c0868d);
            g3.t(c0868d.f11761a);
        }
        return L7;
    }

    public static int N(byte[] bArr, int i7, C0868d c0868d) {
        int i8 = i7 + 1;
        long j = bArr[i7];
        if (j >= 0) {
            c0868d.f11762b = j;
            return i8;
        }
        int i9 = i7 + 2;
        byte b7 = bArr[i8];
        long j3 = (j & 127) | ((b7 & Byte.MAX_VALUE) << 7);
        int i10 = 7;
        while (b7 < 0) {
            int i11 = i9 + 1;
            i10 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i10;
            b7 = bArr[i9];
            i9 = i11;
        }
        c0868d.f11762b = j3;
        return i9;
    }

    public static int O(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        V v6 = (V) j;
        int N7 = N(bArr, i8, c0868d);
        v6.t(c0868d.f11762b);
        while (N7 < i9) {
            int L7 = L(bArr, N7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            N7 = N(bArr, L7, c0868d);
            v6.t(c0868d.f11762b);
        }
        return N7;
    }

    public static String Q(AbstractC0911k abstractC0911k) {
        StringBuilder sb = new StringBuilder(abstractC0911k.size());
        for (int i7 = 0; i7 < abstractC0911k.size(); i7++) {
            byte t7 = abstractC0911k.t(i7);
            if (t7 == 34) {
                sb.append("\\\"");
            } else if (t7 == 39) {
                sb.append("\\'");
            } else if (t7 != 92) {
                switch (t7) {
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
                        if (t7 < 32 || t7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((t7 >>> 6) & 3) + 48));
                            sb.append((char) (((t7 >>> 3) & 7) + 48));
                            sb.append((char) ((t7 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) t7);
                            break;
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

    public static int S(Object obj, InterfaceC0925r0 interfaceC0925r0, byte[] bArr, int i7, int i8, int i9, C0868d c0868d) {
        int G2 = ((C0902f0) interfaceC0925r0).G(obj, bArr, i7, i8, i9, c0868d);
        c0868d.f11763c = obj;
        return G2;
    }

    public static int T(Object obj, InterfaceC0925r0 interfaceC0925r0, byte[] bArr, int i7, int i8, C0868d c0868d) {
        int i9 = i7 + 1;
        int i10 = bArr[i7];
        if (i10 < 0) {
            i9 = K(i10, bArr, i9, c0868d);
            i10 = c0868d.f11761a;
        }
        int i11 = i9;
        if (i10 < 0 || i10 > i8 - i11) {
            throw M.h();
        }
        int i12 = i10 + i11;
        interfaceC0925r0.i(obj, bArr, i11, i12, c0868d);
        c0868d.f11763c = obj;
        return i12;
    }

    public static int V(int i7, byte[] bArr, int i8, int i9, C0868d c0868d) {
        if ((i7 >>> 3) == 0) {
            throw M.b();
        }
        int i10 = i7 & 7;
        if (i10 == 0) {
            return N(bArr, i8, c0868d);
        }
        if (i10 == 1) {
            return i8 + 8;
        }
        if (i10 == 2) {
            return L(bArr, i8, c0868d) + c0868d.f11761a;
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
            i8 = L(bArr, i8, c0868d);
            i12 = c0868d.f11761a;
            if (i12 == i11) {
                break;
            }
            i8 = V(i12, bArr, i8, i9, c0868d);
        }
        if (i8 > i9 || i12 != i11) {
            throw M.g();
        }
        return i8;
    }

    public static void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) {
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

    public static void c(byte b7, byte b8, char[] cArr, int i7) {
        if (b7 < -62 || R(b8)) {
            throw M.c();
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    public static void d(byte b7, byte b8, byte b9, char[] cArr, int i7) {
        if (R(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || R(b9)))) {
            throw M.c();
        }
        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
    }

    public static int e(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        AbstractC0899e abstractC0899e = (AbstractC0899e) j;
        int N7 = N(bArr, i8, c0868d);
        abstractC0899e.t(c0868d.f11762b != 0);
        while (N7 < i9) {
            int L7 = L(bArr, N7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            N7 = N(bArr, L7, c0868d);
            abstractC0899e.t(c0868d.f11762b != 0);
        }
        return N7;
    }

    public static int f(byte[] bArr, int i7, C0868d c0868d) {
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a;
        if (i8 < 0) {
            throw M.f();
        }
        if (i8 > bArr.length - L7) {
            throw M.h();
        }
        if (i8 == 0) {
            c0868d.f11763c = AbstractC0911k.f12212b;
            return L7;
        }
        c0868d.f11763c = AbstractC0911k.A(bArr, L7, i8);
        return L7 + i8;
    }

    public static int g(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        int L7 = L(bArr, i8, c0868d);
        int i10 = c0868d.f11761a;
        if (i10 < 0) {
            throw M.f();
        }
        if (i10 > bArr.length - L7) {
            throw M.h();
        }
        if (i10 == 0) {
            j.add(AbstractC0911k.f12212b);
        } else {
            j.add(AbstractC0911k.A(bArr, L7, i10));
            L7 += i10;
        }
        while (L7 < i9) {
            int L8 = L(bArr, L7, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            L7 = L(bArr, L8, c0868d);
            int i11 = c0868d.f11761a;
            if (i11 < 0) {
                throw M.f();
            }
            if (i11 > bArr.length - L7) {
                throw M.h();
            }
            if (i11 == 0) {
                j.add(AbstractC0911k.f12212b);
            } else {
                j.add(AbstractC0911k.A(bArr, L7, i11));
                L7 += i11;
            }
        }
        return L7;
    }

    public static double h(int i7, byte[] bArr) {
        return Double.longBitsToDouble(l(i7, bArr));
    }

    public static int i(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        r rVar = (r) j;
        rVar.t(h(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int L7 = L(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            rVar.t(Double.longBitsToDouble(l(L7, bArr)));
            i10 = L7 + 8;
        }
        return i10;
    }

    public static int j(int i7, byte[] bArr) {
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public static int k(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        G g3 = (G) j;
        g3.t(j(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int L7 = L(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            g3.t(j(L7, bArr));
            i10 = L7 + 4;
        }
        return i10;
    }

    public static long l(int i7, byte[] bArr) {
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public static int m(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        V v6 = (V) j;
        v6.t(l(i8, bArr));
        int i10 = i8 + 8;
        while (i10 < i9) {
            int L7 = L(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            v6.t(l(L7, bArr));
            i10 = L7 + 8;
        }
        return i10;
    }

    public static float n(int i7, byte[] bArr) {
        return Float.intBitsToFloat(j(i7, bArr));
    }

    public static int o(int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        AbstractC0934y abstractC0934y = (AbstractC0934y) j;
        abstractC0934y.t(n(i8, bArr));
        int i10 = i8 + 4;
        while (i10 < i9) {
            int L7 = L(bArr, i10, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            abstractC0934y.t(Float.intBitsToFloat(j(L7, bArr)));
            i10 = L7 + 4;
        }
        return i10;
    }

    public static int p(InterfaceC0925r0 interfaceC0925r0, int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        int i10 = (i7 & (-8)) | 4;
        C d7 = interfaceC0925r0.d();
        int S6 = S(d7, interfaceC0925r0, bArr, i8, i9, i10, c0868d);
        interfaceC0925r0.b(d7);
        c0868d.f11763c = d7;
        j.add(d7);
        while (S6 < i9) {
            int L7 = L(bArr, S6, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            C d8 = interfaceC0925r0.d();
            int S7 = S(d8, interfaceC0925r0, bArr, L7, i9, i10, c0868d);
            interfaceC0925r0.b(d8);
            c0868d.f11763c = d8;
            j.add(d8);
            S6 = S7;
        }
        return S6;
    }

    public static int q(InterfaceC0925r0 interfaceC0925r0, int i7, byte[] bArr, int i8, int i9, J j, C0868d c0868d) {
        C d7 = interfaceC0925r0.d();
        int T6 = T(d7, interfaceC0925r0, bArr, i8, i9, c0868d);
        interfaceC0925r0.b(d7);
        c0868d.f11763c = d7;
        j.add(d7);
        while (T6 < i9) {
            int L7 = L(bArr, T6, c0868d);
            if (i7 != c0868d.f11761a) {
                break;
            }
            C d8 = interfaceC0925r0.d();
            int T7 = T(d8, interfaceC0925r0, bArr, L7, i9, c0868d);
            interfaceC0925r0.b(d8);
            c0868d.f11763c = d8;
            j.add(d8);
            T6 = T7;
        }
        return T6;
    }

    public static int r(byte[] bArr, int i7, J j, C0868d c0868d) {
        AbstractC0899e abstractC0899e = (AbstractC0899e) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            L7 = N(bArr, L7, c0868d);
            abstractC0899e.t(c0868d.f11762b != 0);
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int s(byte[] bArr, int i7, J j, C0868d c0868d) {
        r rVar = (r) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            rVar.t(Double.longBitsToDouble(l(L7, bArr)));
            L7 += 8;
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int t(byte[] bArr, int i7, J j, C0868d c0868d) {
        G g3 = (G) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            g3.t(j(L7, bArr));
            L7 += 4;
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int u(byte[] bArr, int i7, J j, C0868d c0868d) {
        V v6 = (V) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            v6.t(l(L7, bArr));
            L7 += 8;
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int v(byte[] bArr, int i7, J j, C0868d c0868d) {
        AbstractC0934y abstractC0934y = (AbstractC0934y) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            abstractC0934y.t(Float.intBitsToFloat(j(L7, bArr)));
            L7 += 4;
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int w(byte[] bArr, int i7, J j, C0868d c0868d) {
        G g3 = (G) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            L7 = L(bArr, L7, c0868d);
            g3.t(H6.b.b(c0868d.f11761a));
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int x(byte[] bArr, int i7, J j, C0868d c0868d) {
        V v6 = (V) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            L7 = N(bArr, L7, c0868d);
            v6.t(H6.b.d(c0868d.f11762b));
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int y(byte[] bArr, int i7, J j, C0868d c0868d) {
        G g3 = (G) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            L7 = L(bArr, L7, c0868d);
            g3.t(c0868d.f11761a);
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public static int z(byte[] bArr, int i7, J j, C0868d c0868d) {
        V v6 = (V) j;
        int L7 = L(bArr, i7, c0868d);
        int i8 = c0868d.f11761a + L7;
        while (L7 < i8) {
            L7 = N(bArr, L7, c0868d);
            v6.t(c0868d.f11762b);
        }
        if (L7 == i8) {
            return L7;
        }
        throw M.h();
    }

    public abstract String H(byte[] bArr, int i7, int i8);

    public abstract String J(ByteBuffer byteBuffer, int i7, int i8);

    public abstract int P(String str, byte[] bArr, int i7, int i8);

    public abstract int U(int i7, byte[] bArr, int i8, int i9);

    public abstract void W(byte[] bArr, int i7, int i8);
}
