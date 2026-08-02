package L4;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import n.AbstractC2107A;
import o4.AbstractC2223a;

/* renamed from: L4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226i implements InterfaceC0228k, InterfaceC0227j, Cloneable, ByteChannel, AutoCloseable {

    /* renamed from: k, reason: collision with root package name */
    public D f3090k;

    /* renamed from: l, reason: collision with root package name */
    public long f3091l;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[EDGE_INSN: B:40:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long A() {
        int i;
        if (this.f3091l == 0) {
            throw new EOFException();
        }
        int i5 = 0;
        boolean z3 = false;
        long j5 = 0;
        do {
            D d5 = this.f3090k;
            kotlin.jvm.internal.l.c(d5);
            int i6 = d5.f3054b;
            int i7 = d5.f3055c;
            while (i6 < i7) {
                byte b3 = d5.f3053a[i6];
                if (b3 >= 48 && b3 <= 57) {
                    i = b3 - 48;
                } else if (b3 >= 97 && b3 <= 102) {
                    i = b3 - 87;
                } else if (b3 >= 65 && b3 <= 70) {
                    i = b3 - 55;
                } else {
                    if (i5 == 0) {
                        char[] cArr = M4.b.f3620a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b3 >> 4) & 15], cArr[b3 & 15]})));
                    }
                    z3 = true;
                    if (i6 != i7) {
                        this.f3090k = d5.a();
                        E.a(d5);
                    } else {
                        d5.f3054b = i6;
                    }
                    if (!z3) {
                        break;
                    }
                }
                if ((j5 & (-1152921504606846976L)) != 0) {
                    C0226i c0226i = new C0226i();
                    c0226i.R(j5);
                    c0226i.P(b3);
                    throw new NumberFormatException("Number too large: ".concat(c0226i.I()));
                }
                j5 = (j5 << 4) | i;
                i6++;
                i5++;
            }
            if (i6 != i7) {
            }
            if (!z3) {
            }
        } while (this.f3090k != null);
        this.f3091l -= i5;
        return j5;
    }

    @Override // L4.InterfaceC0228k
    public final int B(y yVar) {
        kotlin.jvm.internal.l.f("options", yVar);
        int b3 = M4.a.b(this, yVar, false);
        if (b3 == -1) {
            return -1;
        }
        J(yVar.f3124k[b3].c());
        return b3;
    }

    @Override // L4.InterfaceC0228k
    public final InputStream C() {
        return new C0224g(this, 0);
    }

    @Override // L4.G
    public final void D(C0226i c0226i, long j5) {
        D b3;
        kotlin.jvm.internal.l.f("source", c0226i);
        if (c0226i == this) {
            throw new IllegalArgumentException("source == this");
        }
        G4.l.o(c0226i.f3091l, 0L, j5);
        while (j5 > 0) {
            D d5 = c0226i.f3090k;
            kotlin.jvm.internal.l.c(d5);
            int i = d5.f3055c;
            D d6 = c0226i.f3090k;
            kotlin.jvm.internal.l.c(d6);
            long j6 = i - d6.f3054b;
            int i5 = 0;
            if (j5 < j6) {
                D d7 = this.f3090k;
                D d8 = d7 != null ? d7.f3058g : null;
                if (d8 != null && d8.f3057e) {
                    if ((d8.f3055c + j5) - (d8.f3056d ? 0 : d8.f3054b) <= 8192) {
                        D d9 = c0226i.f3090k;
                        kotlin.jvm.internal.l.c(d9);
                        d9.d(d8, (int) j5);
                        c0226i.f3091l -= j5;
                        this.f3091l += j5;
                        return;
                    }
                }
                D d10 = c0226i.f3090k;
                kotlin.jvm.internal.l.c(d10);
                int i6 = (int) j5;
                if (i6 <= 0 || i6 > d10.f3055c - d10.f3054b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    b3 = d10.c();
                } else {
                    b3 = E.b();
                    int i7 = d10.f3054b;
                    X3.l.w0(i7, i7 + i6, 2, d10.f3053a, b3.f3053a);
                }
                b3.f3055c = b3.f3054b + i6;
                d10.f3054b += i6;
                D d11 = d10.f3058g;
                kotlin.jvm.internal.l.c(d11);
                d11.b(b3);
                c0226i.f3090k = b3;
            }
            D d12 = c0226i.f3090k;
            kotlin.jvm.internal.l.c(d12);
            long j7 = d12.f3055c - d12.f3054b;
            c0226i.f3090k = d12.a();
            D d13 = this.f3090k;
            if (d13 == null) {
                this.f3090k = d12;
                d12.f3058g = d12;
                d12.f = d12;
            } else {
                D d14 = d13.f3058g;
                kotlin.jvm.internal.l.c(d14);
                d14.b(d12);
                D d15 = d12.f3058g;
                if (d15 == d12) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.l.c(d15);
                if (d15.f3057e) {
                    int i8 = d12.f3055c - d12.f3054b;
                    D d16 = d12.f3058g;
                    kotlin.jvm.internal.l.c(d16);
                    int i9 = 8192 - d16.f3055c;
                    D d17 = d12.f3058g;
                    kotlin.jvm.internal.l.c(d17);
                    if (!d17.f3056d) {
                        D d18 = d12.f3058g;
                        kotlin.jvm.internal.l.c(d18);
                        i5 = d18.f3054b;
                    }
                    if (i8 <= i9 + i5) {
                        D d19 = d12.f3058g;
                        kotlin.jvm.internal.l.c(d19);
                        d12.d(d19, i8);
                        d12.a();
                        E.a(d12);
                    }
                }
            }
            c0226i.f3091l -= j7;
            this.f3091l += j7;
            j5 -= j7;
        }
    }

    public final int E() {
        if (this.f3091l < 4) {
            throw new EOFException();
        }
        D d5 = this.f3090k;
        kotlin.jvm.internal.l.c(d5);
        int i = d5.f3054b;
        int i5 = d5.f3055c;
        if (i5 - i < 4) {
            return ((s() & 255) << 24) | ((s() & 255) << 16) | ((s() & 255) << 8) | (s() & 255);
        }
        byte[] bArr = d5.f3053a;
        int i6 = i + 3;
        int i7 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i8 = i + 4;
        int i9 = i7 | (bArr[i6] & 255);
        this.f3091l -= 4;
        if (i8 != i5) {
            d5.f3054b = i8;
            return i9;
        }
        this.f3090k = d5.a();
        E.a(d5);
        return i9;
    }

    public final short F() {
        if (this.f3091l < 2) {
            throw new EOFException();
        }
        D d5 = this.f3090k;
        kotlin.jvm.internal.l.c(d5);
        int i = d5.f3054b;
        int i5 = d5.f3055c;
        if (i5 - i < 2) {
            return (short) (((s() & 255) << 8) | (s() & 255));
        }
        int i6 = i + 1;
        byte[] bArr = d5.f3053a;
        int i7 = (bArr[i] & 255) << 8;
        int i8 = i + 2;
        int i9 = (bArr[i6] & 255) | i7;
        this.f3091l -= 2;
        if (i8 == i5) {
            this.f3090k = d5.a();
            E.a(d5);
        } else {
            d5.f3054b = i8;
        }
        return (short) i9;
    }

    public final short G() {
        short F5 = F();
        return (short) (((F5 & 255) << 8) | ((65280 & F5) >>> 8));
    }

    public final String H(long j5, Charset charset) {
        kotlin.jvm.internal.l.f("charset", charset);
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount: ", j5).toString());
        }
        if (this.f3091l < j5) {
            throw new EOFException();
        }
        if (j5 == 0) {
            return "";
        }
        D d5 = this.f3090k;
        kotlin.jvm.internal.l.c(d5);
        int i = d5.f3054b;
        if (i + j5 > d5.f3055c) {
            return new String(t(j5), charset);
        }
        int i5 = (int) j5;
        String str = new String(d5.f3053a, i, i5, charset);
        int i6 = d5.f3054b + i5;
        d5.f3054b = i6;
        this.f3091l -= j5;
        if (i6 == d5.f3055c) {
            this.f3090k = d5.a();
            E.a(d5);
        }
        return str;
    }

    public final String I() {
        return H(this.f3091l, AbstractC2223a.f18653a);
    }

    public final void J(long j5) {
        while (j5 > 0) {
            D d5 = this.f3090k;
            if (d5 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j5, d5.f3055c - d5.f3054b);
            long j6 = min;
            this.f3091l -= j6;
            j5 -= j6;
            int i = d5.f3054b + min;
            d5.f3054b = i;
            if (i == d5.f3055c) {
                this.f3090k = d5.a();
                E.a(d5);
            }
        }
    }

    public final C0229l K(int i) {
        if (i == 0) {
            return C0229l.f3092n;
        }
        G4.l.o(this.f3091l, 0L, i);
        D d5 = this.f3090k;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            kotlin.jvm.internal.l.c(d5);
            int i8 = d5.f3055c;
            int i9 = d5.f3054b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            d5 = d5.f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        D d6 = this.f3090k;
        int i10 = 0;
        while (i5 < i) {
            kotlin.jvm.internal.l.c(d6);
            bArr[i10] = d6.f3053a;
            i5 += d6.f3055c - d6.f3054b;
            iArr[i10] = Math.min(i5, i);
            iArr[i10 + i7] = d6.f3054b;
            d6.f3056d = true;
            i10++;
            d6 = d6.f;
        }
        return new F(bArr, iArr);
    }

    public final D L(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        D d5 = this.f3090k;
        if (d5 == null) {
            D b3 = E.b();
            this.f3090k = b3;
            b3.f3058g = b3;
            b3.f = b3;
            return b3;
        }
        D d6 = d5.f3058g;
        kotlin.jvm.internal.l.c(d6);
        if (d6.f3055c + i <= 8192 && d6.f3057e) {
            return d6;
        }
        D b5 = E.b();
        d6.b(b5);
        return b5;
    }

    public final void M(C0229l c0229l) {
        kotlin.jvm.internal.l.f("byteString", c0229l);
        c0229l.q(this, c0229l.c());
    }

    public final void N(byte[] bArr, int i, int i5) {
        kotlin.jvm.internal.l.f("source", bArr);
        long j5 = i5;
        G4.l.o(bArr.length, i, j5);
        int i6 = i5 + i;
        while (i < i6) {
            D L5 = L(1);
            int min = Math.min(i6 - i, 8192 - L5.f3055c);
            int i7 = i + min;
            X3.l.r0(L5.f3055c, i, i7, bArr, L5.f3053a);
            L5.f3055c += min;
            i = i7;
        }
        this.f3091l += j5;
    }

    public final void O(I i) {
        kotlin.jvm.internal.l.f("source", i);
        while (i.e(this, 8192L) != -1) {
        }
    }

    public final void P(int i) {
        D L5 = L(1);
        int i5 = L5.f3055c;
        L5.f3055c = i5 + 1;
        L5.f3053a[i5] = (byte) i;
        this.f3091l++;
    }

    public final void Q(long j5) {
        boolean z3;
        byte[] bArr;
        if (j5 == 0) {
            P(48);
            return;
        }
        int i = 1;
        if (j5 < 0) {
            j5 = -j5;
            if (j5 < 0) {
                U("-9223372036854775808");
                return;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        if (j5 >= 100000000) {
            i = j5 < 1000000000000L ? j5 < 10000000000L ? j5 < 1000000000 ? 9 : 10 : j5 < 100000000000L ? 11 : 12 : j5 < 1000000000000000L ? j5 < 10000000000000L ? 13 : j5 < 100000000000000L ? 14 : 15 : j5 < 100000000000000000L ? j5 < 10000000000000000L ? 16 : 17 : j5 < 1000000000000000000L ? 18 : 19;
        } else if (j5 >= 10000) {
            i = j5 < 1000000 ? j5 < 100000 ? 5 : 6 : j5 < 10000000 ? 7 : 8;
        } else if (j5 >= 100) {
            i = j5 < 1000 ? 3 : 4;
        } else if (j5 >= 10) {
            i = 2;
        }
        if (z3) {
            i++;
        }
        D L5 = L(i);
        int i5 = L5.f3055c + i;
        while (true) {
            bArr = L5.f3053a;
            if (j5 == 0) {
                break;
            }
            long j6 = 10;
            i5--;
            bArr[i5] = M4.a.f3619a[(int) (j5 % j6)];
            j5 /= j6;
        }
        if (z3) {
            bArr[i5 - 1] = 45;
        }
        L5.f3055c += i;
        this.f3091l += i;
    }

    public final void R(long j5) {
        if (j5 == 0) {
            P(48);
            return;
        }
        long j6 = (j5 >>> 1) | j5;
        long j7 = j6 | (j6 >>> 2);
        long j8 = j7 | (j7 >>> 4);
        long j9 = j8 | (j8 >>> 8);
        long j10 = j9 | (j9 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
        long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
        long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + 3) / 4);
        D L5 = L(i);
        int i5 = L5.f3055c;
        for (int i6 = (i5 + i) - 1; i6 >= i5; i6--) {
            L5.f3053a[i6] = M4.a.f3619a[(int) (15 & j5)];
            j5 >>>= 4;
        }
        L5.f3055c += i;
        this.f3091l += i;
    }

    public final void S(int i) {
        D L5 = L(4);
        int i5 = L5.f3055c;
        byte[] bArr = L5.f3053a;
        bArr[i5] = (byte) ((i >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i & 255);
        L5.f3055c = i5 + 4;
        this.f3091l += 4;
    }

    public final void T(int i, int i5, String str) {
        char charAt;
        kotlin.jvm.internal.l.f("string", str);
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2107A.q("beginIndex < 0: ", i).toString());
        }
        if (i5 < i) {
            throw new IllegalArgumentException(L1.a.k(i5, i, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i5 > str.length()) {
            StringBuilder v4 = AbstractC2107A.v(i5, "endIndex > string.length: ", " > ");
            v4.append(str.length());
            throw new IllegalArgumentException(v4.toString().toString());
        }
        while (i < i5) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                D L5 = L(1);
                int i6 = L5.f3055c - i;
                int min = Math.min(i5, 8192 - i6);
                int i7 = i + 1;
                byte[] bArr = L5.f3053a;
                bArr[i + i6] = (byte) charAt2;
                while (true) {
                    i = i7;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i7 = i + 1;
                    bArr[i + i6] = (byte) charAt;
                }
                int i8 = L5.f3055c;
                int i9 = (i6 + i) - i8;
                L5.f3055c = i8 + i9;
                this.f3091l += i9;
            } else {
                if (charAt2 < 2048) {
                    D L6 = L(2);
                    int i10 = L6.f3055c;
                    byte[] bArr2 = L6.f3053a;
                    bArr2[i10] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((charAt2 & '?') | 128);
                    L6.f3055c = i10 + 2;
                    this.f3091l += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    D L7 = L(3);
                    int i11 = L7.f3055c;
                    byte[] bArr3 = L7.f3053a;
                    bArr3[i11] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                    L7.f3055c = i11 + 3;
                    this.f3091l += 3;
                } else {
                    int i12 = i + 1;
                    char charAt3 = i12 < i5 ? str.charAt(i12) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        P(63);
                        i = i12;
                    } else {
                        int i13 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        D L8 = L(4);
                        int i14 = L8.f3055c;
                        byte[] bArr4 = L8.f3053a;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        L8.f3055c = i14 + 4;
                        this.f3091l += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    public final void U(String str) {
        kotlin.jvm.internal.l.f("string", str);
        T(0, str.length(), str);
    }

    public final void V(int i) {
        if (i < 128) {
            P(i);
            return;
        }
        if (i < 2048) {
            D L5 = L(2);
            int i5 = L5.f3055c;
            byte[] bArr = L5.f3053a;
            bArr[i5] = (byte) ((i >> 6) | 192);
            bArr[i5 + 1] = (byte) ((i & 63) | 128);
            L5.f3055c = i5 + 2;
            this.f3091l += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            P(63);
            return;
        }
        if (i < 65536) {
            D L6 = L(3);
            int i6 = L6.f3055c;
            byte[] bArr2 = L6.f3053a;
            bArr2[i6] = (byte) ((i >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i & 63) | 128);
            L6.f3055c = i6 + 3;
            this.f3091l += 3;
            return;
        }
        if (i > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(G4.l.O(i)));
        }
        D L7 = L(4);
        int i7 = L7.f3055c;
        byte[] bArr3 = L7.f3053a;
        bArr3[i7] = (byte) ((i >> 18) | 240);
        bArr3[i7 + 1] = (byte) (((i >> 12) & 63) | 128);
        bArr3[i7 + 2] = (byte) (((i >> 6) & 63) | 128);
        bArr3[i7 + 3] = (byte) ((i & 63) | 128);
        L7.f3055c = i7 + 4;
        this.f3091l += 4;
    }

    public final void b() {
        J(this.f3091l);
    }

    @Override // L4.I
    public final K c() {
        return K.f3065d;
    }

    public final Object clone() {
        C0226i c0226i = new C0226i();
        if (this.f3091l == 0) {
            return c0226i;
        }
        D d5 = this.f3090k;
        kotlin.jvm.internal.l.c(d5);
        D c5 = d5.c();
        c0226i.f3090k = c5;
        c5.f3058g = c5;
        c5.f = c5;
        for (D d6 = d5.f; d6 != d5; d6 = d6.f) {
            D d7 = c5.f3058g;
            kotlin.jvm.internal.l.c(d7);
            kotlin.jvm.internal.l.c(d6);
            d7.b(d6.c());
        }
        c0226i.f3091l = this.f3091l;
        return c0226i;
    }

    @Override // L4.I
    public final long e(C0226i c0226i, long j5) {
        kotlin.jvm.internal.l.f("sink", c0226i);
        if (j5 < 0) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount < 0: ", j5).toString());
        }
        long j6 = this.f3091l;
        if (j6 == 0) {
            return -1L;
        }
        if (j5 > j6) {
            j5 = j6;
        }
        c0226i.D(this, j5);
        return j5;
    }

    public final boolean equals(Object obj) {
        boolean z3 = true;
        if (this == obj) {
            return true;
        }
        boolean z5 = false;
        if (!(obj instanceof C0226i)) {
            return false;
        }
        long j5 = this.f3091l;
        C0226i c0226i = (C0226i) obj;
        if (j5 != c0226i.f3091l) {
            return false;
        }
        if (j5 == 0) {
            return true;
        }
        D d5 = this.f3090k;
        kotlin.jvm.internal.l.c(d5);
        D d6 = c0226i.f3090k;
        kotlin.jvm.internal.l.c(d6);
        int i = d5.f3054b;
        int i5 = d6.f3054b;
        long j6 = 0;
        while (j6 < this.f3091l) {
            long min = Math.min(d5.f3055c - i, d6.f3055c - i5);
            long j7 = 0;
            while (j7 < min) {
                int i6 = i + 1;
                boolean z6 = z3;
                byte b3 = d5.f3053a[i];
                int i7 = i5 + 1;
                boolean z7 = z5;
                if (b3 != d6.f3053a[i5]) {
                    return z7;
                }
                j7++;
                i5 = i7;
                i = i6;
                z3 = z6;
                z5 = z7;
            }
            boolean z8 = z3;
            boolean z9 = z5;
            if (i == d5.f3055c) {
                D d7 = d5.f;
                kotlin.jvm.internal.l.c(d7);
                i = d7.f3054b;
                d5 = d7;
            }
            if (i5 == d6.f3055c) {
                d6 = d6.f;
                kotlin.jvm.internal.l.c(d6);
                i5 = d6.f3054b;
            }
            j6 += min;
            z3 = z8;
            z5 = z9;
        }
        return z3;
    }

    @Override // L4.InterfaceC0227j
    public final /* bridge */ /* synthetic */ InterfaceC0227j g(C0229l c0229l) {
        M(c0229l);
        return this;
    }

    public final int hashCode() {
        D d5 = this.f3090k;
        if (d5 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i5 = d5.f3055c;
            for (int i6 = d5.f3054b; i6 < i5; i6++) {
                i = (i * 31) + d5.f3053a[i6];
            }
            d5 = d5.f;
            kotlin.jvm.internal.l.c(d5);
        } while (d5 != this.f3090k);
        return i;
    }

    public final long i() {
        long j5 = this.f3091l;
        if (j5 == 0) {
            return 0L;
        }
        D d5 = this.f3090k;
        kotlin.jvm.internal.l.c(d5);
        D d6 = d5.f3058g;
        kotlin.jvm.internal.l.c(d6);
        return (d6.f3055c >= 8192 || !d6.f3057e) ? j5 : j5 - (r3 - d6.f3054b);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // L4.InterfaceC0228k
    public final boolean j(long j5) {
        return this.f3091l >= j5;
    }

    public final void k(C0226i c0226i, long j5, long j6) {
        kotlin.jvm.internal.l.f("out", c0226i);
        long j7 = j5;
        G4.l.o(this.f3091l, j7, j6);
        if (j6 == 0) {
            return;
        }
        c0226i.f3091l += j6;
        D d5 = this.f3090k;
        while (true) {
            kotlin.jvm.internal.l.c(d5);
            long j8 = d5.f3055c - d5.f3054b;
            if (j7 < j8) {
                break;
            }
            j7 -= j8;
            d5 = d5.f;
        }
        D d6 = d5;
        long j9 = j6;
        while (j9 > 0) {
            kotlin.jvm.internal.l.c(d6);
            D c5 = d6.c();
            int i = c5.f3054b + ((int) j7);
            c5.f3054b = i;
            c5.f3055c = Math.min(i + ((int) j9), c5.f3055c);
            D d7 = c0226i.f3090k;
            if (d7 == null) {
                c5.f3058g = c5;
                c5.f = c5;
                c0226i.f3090k = c5;
            } else {
                D d8 = d7.f3058g;
                kotlin.jvm.internal.l.c(d8);
                d8.b(c5);
            }
            j9 -= c5.f3055c - c5.f3054b;
            d6 = d6.f;
            j7 = 0;
        }
    }

    public final boolean l() {
        return this.f3091l == 0;
    }

    public final byte m(long j5) {
        G4.l.o(this.f3091l, j5, 1L);
        D d5 = this.f3090k;
        if (d5 == null) {
            kotlin.jvm.internal.l.c(null);
            throw null;
        }
        long j6 = this.f3091l;
        if (j6 - j5 < j5) {
            while (j6 > j5) {
                d5 = d5.f3058g;
                kotlin.jvm.internal.l.c(d5);
                j6 -= d5.f3055c - d5.f3054b;
            }
            return d5.f3053a[(int) ((d5.f3054b + j5) - j6)];
        }
        long j7 = 0;
        while (true) {
            int i = d5.f3055c;
            int i5 = d5.f3054b;
            long j8 = (i - i5) + j7;
            if (j8 > j5) {
                return d5.f3053a[(int) ((i5 + j5) - j7)];
            }
            d5 = d5.f;
            kotlin.jvm.internal.l.c(d5);
            j7 = j8;
        }
    }

    public final long n(C0229l c0229l) {
        int i;
        int i5;
        kotlin.jvm.internal.l.f("targetBytes", c0229l);
        D d5 = this.f3090k;
        if (d5 == null) {
            return -1L;
        }
        long j5 = this.f3091l;
        long j6 = 0;
        byte[] bArr = c0229l.f3093k;
        if (j5 < 0) {
            while (j5 > 0) {
                d5 = d5.f3058g;
                kotlin.jvm.internal.l.c(d5);
                j5 -= d5.f3055c - d5.f3054b;
            }
            if (bArr.length == 2) {
                byte b3 = bArr[0];
                byte b5 = bArr[1];
                while (j5 < this.f3091l) {
                    i = (int) ((d5.f3054b + j6) - j5);
                    int i6 = d5.f3055c;
                    while (i < i6) {
                        byte b6 = d5.f3053a[i];
                        if (b6 != b3 && b6 != b5) {
                            i++;
                        }
                        i5 = d5.f3054b;
                    }
                    j6 = (d5.f3055c - d5.f3054b) + j5;
                    d5 = d5.f;
                    kotlin.jvm.internal.l.c(d5);
                    j5 = j6;
                }
                return -1L;
            }
            while (j5 < this.f3091l) {
                i = (int) ((d5.f3054b + j6) - j5);
                int i7 = d5.f3055c;
                while (i < i7) {
                    byte b7 = d5.f3053a[i];
                    for (byte b8 : bArr) {
                        if (b7 == b8) {
                            i5 = d5.f3054b;
                        }
                    }
                    i++;
                }
                j6 = (d5.f3055c - d5.f3054b) + j5;
                d5 = d5.f;
                kotlin.jvm.internal.l.c(d5);
                j5 = j6;
            }
            return -1L;
        }
        j5 = 0;
        while (true) {
            long j7 = (d5.f3055c - d5.f3054b) + j5;
            if (j7 > 0) {
                break;
            }
            d5 = d5.f;
            kotlin.jvm.internal.l.c(d5);
            j5 = j7;
        }
        if (bArr.length == 2) {
            byte b9 = bArr[0];
            byte b10 = bArr[1];
            while (j5 < this.f3091l) {
                i = (int) ((d5.f3054b + j6) - j5);
                int i8 = d5.f3055c;
                while (i < i8) {
                    byte b11 = d5.f3053a[i];
                    if (b11 != b9 && b11 != b10) {
                        i++;
                    }
                    i5 = d5.f3054b;
                }
                j6 = (d5.f3055c - d5.f3054b) + j5;
                d5 = d5.f;
                kotlin.jvm.internal.l.c(d5);
                j5 = j6;
            }
            return -1L;
        }
        while (j5 < this.f3091l) {
            i = (int) ((d5.f3054b + j6) - j5);
            int i9 = d5.f3055c;
            while (i < i9) {
                byte b12 = d5.f3053a[i];
                for (byte b13 : bArr) {
                    if (b12 == b13) {
                        i5 = d5.f3054b;
                    }
                }
                i++;
            }
            j6 = (d5.f3055c - d5.f3054b) + j5;
            d5 = d5.f;
            kotlin.jvm.internal.l.c(d5);
            j5 = j6;
        }
        return -1L;
        return (i - i5) + j5;
    }

    @Override // L4.InterfaceC0227j
    public final /* bridge */ /* synthetic */ InterfaceC0227j o(int i) {
        P(i);
        return this;
    }

    public final boolean p(C0229l c0229l) {
        kotlin.jvm.internal.l.f("bytes", c0229l);
        byte[] bArr = c0229l.f3093k;
        int length = bArr.length;
        if (length >= 0 && this.f3091l >= length && bArr.length >= length) {
            for (int i = 0; i < length; i++) {
                if (m(i) == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // L4.InterfaceC0227j
    public final InterfaceC0227j q(byte[] bArr) {
        kotlin.jvm.internal.l.f("source", bArr);
        N(bArr, 0, bArr.length);
        return this;
    }

    public final int r(byte[] bArr, int i, int i5) {
        G4.l.o(bArr.length, i, i5);
        D d5 = this.f3090k;
        if (d5 == null) {
            return -1;
        }
        int min = Math.min(i5, d5.f3055c - d5.f3054b);
        int i6 = d5.f3054b;
        X3.l.r0(i, i6, i6 + min, d5.f3053a, bArr);
        int i7 = d5.f3054b + min;
        d5.f3054b = i7;
        this.f3091l -= min;
        if (i7 == d5.f3055c) {
            this.f3090k = d5.a();
            E.a(d5);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("sink", byteBuffer);
        D d5 = this.f3090k;
        if (d5 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), d5.f3055c - d5.f3054b);
        byteBuffer.put(d5.f3053a, d5.f3054b, min);
        int i = d5.f3054b + min;
        d5.f3054b = i;
        this.f3091l -= min;
        if (i == d5.f3055c) {
            this.f3090k = d5.a();
            E.a(d5);
        }
        return min;
    }

    public final byte s() {
        if (this.f3091l == 0) {
            throw new EOFException();
        }
        D d5 = this.f3090k;
        kotlin.jvm.internal.l.c(d5);
        int i = d5.f3054b;
        int i5 = d5.f3055c;
        int i6 = i + 1;
        byte b3 = d5.f3053a[i];
        this.f3091l--;
        if (i6 != i5) {
            d5.f3054b = i6;
            return b3;
        }
        this.f3090k = d5.a();
        E.a(d5);
        return b3;
    }

    public final byte[] t(long j5) {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount: ", j5).toString());
        }
        if (this.f3091l < j5) {
            throw new EOFException();
        }
        int i = (int) j5;
        byte[] bArr = new byte[i];
        int i5 = 0;
        while (i5 < i) {
            int r5 = r(bArr, i5, i - i5);
            if (r5 == -1) {
                throw new EOFException();
            }
            i5 += r5;
        }
        return bArr;
    }

    public final String toString() {
        long j5 = this.f3091l;
        if (j5 <= 2147483647L) {
            return K((int) j5).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f3091l).toString());
    }

    @Override // L4.InterfaceC0228k
    public final long u(InterfaceC0227j interfaceC0227j) {
        long j5 = this.f3091l;
        if (j5 > 0) {
            interfaceC0227j.D(this, j5);
        }
        return j5;
    }

    public final C0229l v(long j5) {
        if (j5 < 0 || j5 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC2107A.r("byteCount: ", j5).toString());
        }
        if (this.f3091l < j5) {
            throw new EOFException();
        }
        if (j5 < 4096) {
            return new C0229l(t(j5));
        }
        C0229l K = K((int) j5);
        J(j5);
        return K;
    }

    @Override // L4.InterfaceC0227j
    public final /* bridge */ /* synthetic */ InterfaceC0227j w(int i, byte[] bArr) {
        N(bArr, 0, i);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("source", byteBuffer);
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            D L5 = L(1);
            int min = Math.min(i, 8192 - L5.f3055c);
            byteBuffer.get(L5.f3053a, L5.f3055c, min);
            i -= min;
            L5.f3055c += min;
        }
        this.f3091l += remaining;
        return remaining;
    }

    @Override // L4.InterfaceC0227j
    public final /* bridge */ /* synthetic */ InterfaceC0227j x(String str) {
        U(str);
        return this;
    }

    @Override // L4.InterfaceC0227j
    public final /* bridge */ /* synthetic */ InterfaceC0227j y(long j5) {
        Q(j5);
        return this;
    }

    @Override // L4.InterfaceC0228k
    public final C0226i a() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, L4.G
    public final void close() {
    }

    @Override // L4.G, java.io.Flushable
    public final void flush() {
    }
}
