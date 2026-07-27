package j5;

import b2.AbstractC0279e;
import g4.AbstractC0464i;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public r f10494a;

    /* renamed from: b, reason: collision with root package name */
    public long f10495b;

    public final String A(long j2, Charset charset) {
        kotlin.jvm.internal.i.e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f10495b < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        r rVar = this.f10494a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f10522b;
        if (i2 + j2 > rVar.f10523c) {
            return new String(g(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(rVar.f10521a, i2, i3, charset);
        int i6 = rVar.f10522b + i3;
        rVar.f10522b = i6;
        this.f10495b -= j2;
        if (i6 == rVar.f10523c) {
            this.f10494a = rVar.a();
            s.a(rVar);
        }
        return str;
    }

    @Override // j5.u
    public final void B(f source, long j2) {
        r b6;
        kotlin.jvm.internal.i.e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        b.d(source.f10495b, 0L, j2);
        while (j2 > 0) {
            r rVar = source.f10494a;
            kotlin.jvm.internal.i.b(rVar);
            int i2 = rVar.f10523c;
            r rVar2 = source.f10494a;
            kotlin.jvm.internal.i.b(rVar2);
            long j6 = i2 - rVar2.f10522b;
            int i3 = 0;
            if (j2 < j6) {
                r rVar3 = this.f10494a;
                r rVar4 = rVar3 != null ? rVar3.f10527g : null;
                if (rVar4 != null && rVar4.f10525e) {
                    if ((rVar4.f10523c + j2) - (rVar4.f10524d ? 0 : rVar4.f10522b) <= 8192) {
                        r rVar5 = source.f10494a;
                        kotlin.jvm.internal.i.b(rVar5);
                        rVar5.d(rVar4, (int) j2);
                        source.f10495b -= j2;
                        this.f10495b += j2;
                        return;
                    }
                }
                r rVar6 = source.f10494a;
                kotlin.jvm.internal.i.b(rVar6);
                int i6 = (int) j2;
                if (i6 <= 0 || i6 > rVar6.f10523c - rVar6.f10522b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i6 >= 1024) {
                    b6 = rVar6.c();
                } else {
                    b6 = s.b();
                    int i7 = rVar6.f10522b;
                    AbstractC0464i.O(0, i7, i7 + i6, rVar6.f10521a, b6.f10521a);
                }
                b6.f10523c = b6.f10522b + i6;
                rVar6.f10522b += i6;
                r rVar7 = rVar6.f10527g;
                kotlin.jvm.internal.i.b(rVar7);
                rVar7.b(b6);
                source.f10494a = b6;
            }
            r rVar8 = source.f10494a;
            kotlin.jvm.internal.i.b(rVar8);
            long j7 = rVar8.f10523c - rVar8.f10522b;
            source.f10494a = rVar8.a();
            r rVar9 = this.f10494a;
            if (rVar9 == null) {
                this.f10494a = rVar8;
                rVar8.f10527g = rVar8;
                rVar8.f10526f = rVar8;
            } else {
                r rVar10 = rVar9.f10527g;
                kotlin.jvm.internal.i.b(rVar10);
                rVar10.b(rVar8);
                r rVar11 = rVar8.f10527g;
                if (rVar11 == rVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                kotlin.jvm.internal.i.b(rVar11);
                if (rVar11.f10525e) {
                    int i8 = rVar8.f10523c - rVar8.f10522b;
                    r rVar12 = rVar8.f10527g;
                    kotlin.jvm.internal.i.b(rVar12);
                    int i9 = 8192 - rVar12.f10523c;
                    r rVar13 = rVar8.f10527g;
                    kotlin.jvm.internal.i.b(rVar13);
                    if (!rVar13.f10524d) {
                        r rVar14 = rVar8.f10527g;
                        kotlin.jvm.internal.i.b(rVar14);
                        i3 = rVar14.f10522b;
                    }
                    if (i8 <= i9 + i3) {
                        r rVar15 = rVar8.f10527g;
                        kotlin.jvm.internal.i.b(rVar15);
                        rVar8.d(rVar15, i8);
                        rVar8.a();
                        s.a(rVar8);
                    }
                }
            }
            source.f10495b -= j7;
            this.f10495b += j7;
            j2 -= j7;
        }
    }

    public final String C() {
        return A(this.f10495b, B4.a.f287a);
    }

    public final void D(long j2) {
        while (j2 > 0) {
            r rVar = this.f10494a;
            if (rVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, rVar.f10523c - rVar.f10522b);
            long j6 = min;
            this.f10495b -= j6;
            j2 -= j6;
            int i2 = rVar.f10522b + min;
            rVar.f10522b = i2;
            if (i2 == rVar.f10523c) {
                this.f10494a = rVar.a();
                s.a(rVar);
            }
        }
    }

    public final i E(int i2) {
        if (i2 == 0) {
            return i.f10496d;
        }
        b.d(this.f10495b, 0L, i2);
        r rVar = this.f10494a;
        int i3 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i2) {
            kotlin.jvm.internal.i.b(rVar);
            int i8 = rVar.f10523c;
            int i9 = rVar.f10522b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            rVar = rVar.f10526f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        r rVar2 = this.f10494a;
        int i10 = 0;
        while (i3 < i2) {
            kotlin.jvm.internal.i.b(rVar2);
            bArr[i10] = rVar2.f10521a;
            i3 += rVar2.f10523c - rVar2.f10522b;
            iArr[i10] = Math.min(i3, i2);
            iArr[i10 + i7] = rVar2.f10522b;
            rVar2.f10524d = true;
            i10++;
            rVar2 = rVar2.f10526f;
        }
        return new t(bArr, iArr);
    }

    public final r F(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        r rVar = this.f10494a;
        if (rVar == null) {
            r b6 = s.b();
            this.f10494a = b6;
            b6.f10527g = b6;
            b6.f10526f = b6;
            return b6;
        }
        r rVar2 = rVar.f10527g;
        kotlin.jvm.internal.i.b(rVar2);
        if (rVar2.f10523c + i2 <= 8192 && rVar2.f10525e) {
            return rVar2;
        }
        r b7 = s.b();
        rVar2.b(b7);
        return b7;
    }

    public final void G(i byteString) {
        kotlin.jvm.internal.i.e(byteString, "byteString");
        byteString.l(this, byteString.a());
    }

    public final void H(byte[] source, int i2, int i3) {
        kotlin.jvm.internal.i.e(source, "source");
        long j2 = i3;
        b.d(source.length, i2, j2);
        int i6 = i3 + i2;
        while (i2 < i6) {
            r F2 = F(1);
            int min = Math.min(i6 - i2, 8192 - F2.f10523c);
            int i7 = i2 + min;
            AbstractC0464i.O(F2.f10523c, i2, i7, source, F2.f10521a);
            F2.f10523c += min;
            i2 = i7;
        }
        this.f10495b += j2;
    }

    public final long I(w source) {
        kotlin.jvm.internal.i.e(source, "source");
        long j2 = 0;
        while (true) {
            long s2 = source.s(this, 8192L);
            if (s2 == -1) {
                return j2;
            }
            j2 += s2;
        }
    }

    public final void J(int i2) {
        r F2 = F(1);
        int i3 = F2.f10523c;
        F2.f10523c = i3 + 1;
        F2.f10521a[i3] = (byte) i2;
        this.f10495b++;
    }

    public final void K(long j2) {
        boolean z;
        byte[] bArr;
        if (j2 == 0) {
            J(48);
            return;
        }
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                O("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr2 = k5.a.f10723a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j2)) * 10) >>> 5;
        int i2 = numberOfLeadingZeros + (j2 > k5.a.f10724b[numberOfLeadingZeros] ? 1 : 0);
        if (z) {
            i2++;
        }
        r F2 = F(i2);
        int i3 = F2.f10523c + i2;
        while (true) {
            bArr = F2.f10521a;
            if (j2 == 0) {
                break;
            }
            long j6 = 10;
            i3--;
            bArr[i3] = k5.a.f10723a[(int) (j2 % j6)];
            j2 /= j6;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        F2.f10523c += i2;
        this.f10495b += i2;
    }

    public final void L(long j2) {
        if (j2 == 0) {
            J(48);
            return;
        }
        long j6 = (j2 >>> 1) | j2;
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
        int i2 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + 3) / 4);
        r F2 = F(i2);
        int i3 = F2.f10523c;
        for (int i6 = (i3 + i2) - 1; i6 >= i3; i6--) {
            F2.f10521a[i6] = k5.a.f10723a[(int) (15 & j2)];
            j2 >>>= 4;
        }
        F2.f10523c += i2;
        this.f10495b += i2;
    }

    public final void M(int i2) {
        r F2 = F(4);
        int i3 = F2.f10523c;
        byte b6 = (byte) ((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = F2.f10521a;
        bArr[i3] = b6;
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i3 + 3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        F2.f10523c = i3 + 4;
        this.f10495b += 4;
    }

    public final void N(long j2) {
        long j6 = ((j2 & 255) << 56) | (((-72057594037927936L) & j2) >>> 56) | ((71776119061217280L & j2) >>> 40) | ((280375465082880L & j2) >>> 24) | ((1095216660480L & j2) >>> 8) | ((4278190080L & j2) << 8) | ((16711680 & j2) << 24) | ((65280 & j2) << 40);
        r F2 = F(8);
        int i2 = F2.f10523c;
        byte[] bArr = F2.f10521a;
        bArr[i2] = (byte) ((j6 >>> 56) & 255);
        bArr[i2 + 1] = (byte) ((j6 >>> 48) & 255);
        bArr[i2 + 2] = (byte) ((j6 >>> 40) & 255);
        bArr[i2 + 3] = (byte) ((j6 >>> 32) & 255);
        bArr[i2 + 4] = (byte) ((j6 >>> 24) & 255);
        bArr[i2 + 5] = (byte) ((j6 >>> 16) & 255);
        bArr[i2 + 6] = (byte) ((j6 >>> 8) & 255);
        bArr[i2 + 7] = (byte) (j6 & 255);
        F2.f10523c = i2 + 8;
        this.f10495b += 8;
    }

    public final void O(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        P(string, 0, string.length());
    }

    public final void P(String string, int i2, int i3) {
        char charAt;
        kotlin.jvm.internal.i.e(string, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "beginIndex < 0: ").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(B0.o.h("endIndex < beginIndex: ", i3, i2, " < ").toString());
        }
        if (i3 > string.length()) {
            StringBuilder i6 = AbstractC0279e.i(i3, "endIndex > string.length: ", " > ");
            i6.append(string.length());
            throw new IllegalArgumentException(i6.toString().toString());
        }
        while (i2 < i3) {
            char charAt2 = string.charAt(i2);
            if (charAt2 < 128) {
                r F2 = F(1);
                int i7 = F2.f10523c - i2;
                int min = Math.min(i3, 8192 - i7);
                int i8 = i2 + 1;
                byte[] bArr = F2.f10521a;
                bArr[i2 + i7] = (byte) charAt2;
                while (true) {
                    i2 = i8;
                    if (i2 >= min || (charAt = string.charAt(i2)) >= 128) {
                        break;
                    }
                    i8 = i2 + 1;
                    bArr[i2 + i7] = (byte) charAt;
                }
                int i9 = F2.f10523c;
                int i10 = (i7 + i2) - i9;
                F2.f10523c = i9 + i10;
                this.f10495b += i10;
            } else {
                if (charAt2 < 2048) {
                    r F5 = F(2);
                    int i11 = F5.f10523c;
                    byte[] bArr2 = F5.f10521a;
                    bArr2[i11] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i11 + 1] = (byte) ((charAt2 & '?') | 128);
                    F5.f10523c = i11 + 2;
                    this.f10495b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    r F6 = F(3);
                    int i12 = F6.f10523c;
                    byte[] bArr3 = F6.f10521a;
                    bArr3[i12] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i12 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i12 + 2] = (byte) ((charAt2 & '?') | 128);
                    F6.f10523c = i12 + 3;
                    this.f10495b += 3;
                } else {
                    int i13 = i2 + 1;
                    char charAt3 = i13 < i3 ? string.charAt(i13) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        J(63);
                        i2 = i13;
                    } else {
                        int i14 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        r F7 = F(4);
                        int i15 = F7.f10523c;
                        byte[] bArr4 = F7.f10521a;
                        bArr4[i15] = (byte) ((i14 >> 18) | 240);
                        bArr4[i15 + 1] = (byte) (((i14 >> 12) & 63) | 128);
                        bArr4[i15 + 2] = (byte) (((i14 >> 6) & 63) | 128);
                        bArr4[i15 + 3] = (byte) ((i14 & 63) | 128);
                        F7.f10523c = i15 + 4;
                        this.f10495b += 4;
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
    }

    public final void Q(int i2) {
        if (i2 < 128) {
            J(i2);
            return;
        }
        if (i2 < 2048) {
            r F2 = F(2);
            int i3 = F2.f10523c;
            byte[] bArr = F2.f10521a;
            bArr[i3] = (byte) ((i2 >> 6) | 192);
            bArr[i3 + 1] = (byte) ((i2 & 63) | 128);
            F2.f10523c = i3 + 2;
            this.f10495b += 2;
            return;
        }
        if (55296 <= i2 && i2 < 57344) {
            J(63);
            return;
        }
        if (i2 < 65536) {
            r F5 = F(3);
            int i6 = F5.f10523c;
            byte[] bArr2 = F5.f10521a;
            bArr2[i6] = (byte) ((i2 >> 12) | 224);
            bArr2[i6 + 1] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[i6 + 2] = (byte) ((i2 & 63) | 128);
            F5.f10523c = i6 + 3;
            this.f10495b += 3;
            return;
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(b.g(i2)));
        }
        r F6 = F(4);
        int i7 = F6.f10523c;
        byte[] bArr3 = F6.f10521a;
        bArr3[i7] = (byte) ((i2 >> 18) | 240);
        bArr3[i7 + 1] = (byte) (((i2 >> 12) & 63) | 128);
        bArr3[i7 + 2] = (byte) (((i2 >> 6) & 63) | 128);
        bArr3[i7 + 3] = (byte) ((i2 & 63) | 128);
        F6.f10523c = i7 + 4;
        this.f10495b += 4;
    }

    public final boolean a() {
        return this.f10495b == 0;
    }

    public final byte b(long j2) {
        b.d(this.f10495b, j2, 1L);
        r rVar = this.f10494a;
        if (rVar == null) {
            kotlin.jvm.internal.i.b(null);
            throw null;
        }
        long j6 = this.f10495b;
        if (j6 - j2 < j2) {
            while (j6 > j2) {
                rVar = rVar.f10527g;
                kotlin.jvm.internal.i.b(rVar);
                j6 -= rVar.f10523c - rVar.f10522b;
            }
            return rVar.f10521a[(int) ((rVar.f10522b + j2) - j6)];
        }
        long j7 = 0;
        while (true) {
            int i2 = rVar.f10523c;
            int i3 = rVar.f10522b;
            long j8 = (i2 - i3) + j7;
            if (j8 > j2) {
                return rVar.f10521a[(int) ((i3 + j2) - j7)];
            }
            rVar = rVar.f10526f;
            kotlin.jvm.internal.i.b(rVar);
            j7 = j8;
        }
    }

    public final byte c() {
        if (this.f10495b == 0) {
            throw new EOFException();
        }
        r rVar = this.f10494a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f10522b;
        int i3 = rVar.f10523c;
        int i6 = i2 + 1;
        byte b6 = rVar.f10521a[i2];
        this.f10495b--;
        if (i6 == i3) {
            this.f10494a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f10522b = i6;
        }
        return b6;
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f10495b != 0) {
            r rVar = this.f10494a;
            kotlin.jvm.internal.i.b(rVar);
            r c2 = rVar.c();
            fVar.f10494a = c2;
            c2.f10527g = c2;
            c2.f10526f = c2;
            for (r rVar2 = rVar.f10526f; rVar2 != rVar; rVar2 = rVar2.f10526f) {
                r rVar3 = c2.f10527g;
                kotlin.jvm.internal.i.b(rVar3);
                kotlin.jvm.internal.i.b(rVar2);
                rVar3.b(rVar2.c());
            }
            fVar.f10495b = this.f10495b;
        }
        return fVar;
    }

    @Override // j5.w
    public final y d() {
        return y.f10533d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j2 = this.f10495b;
                f fVar = (f) obj;
                if (j2 == fVar.f10495b) {
                    if (j2 != 0) {
                        r rVar = this.f10494a;
                        kotlin.jvm.internal.i.b(rVar);
                        r rVar2 = fVar.f10494a;
                        kotlin.jvm.internal.i.b(rVar2);
                        int i2 = rVar.f10522b;
                        int i3 = rVar2.f10522b;
                        long j6 = 0;
                        while (j6 < this.f10495b) {
                            long min = Math.min(rVar.f10523c - i2, rVar2.f10523c - i3);
                            long j7 = 0;
                            while (j7 < min) {
                                int i6 = i2 + 1;
                                byte b6 = rVar.f10521a[i2];
                                int i7 = i3 + 1;
                                if (b6 == rVar2.f10521a[i3]) {
                                    j7++;
                                    i3 = i7;
                                    i2 = i6;
                                }
                            }
                            if (i2 == rVar.f10523c) {
                                r rVar3 = rVar.f10526f;
                                kotlin.jvm.internal.i.b(rVar3);
                                i2 = rVar3.f10522b;
                                rVar = rVar3;
                            }
                            if (i3 == rVar2.f10523c) {
                                rVar2 = rVar2.f10526f;
                                kotlin.jvm.internal.i.b(rVar2);
                                i3 = rVar2.f10522b;
                            }
                            j6 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final byte[] g(long j2) {
        int min;
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f10495b < j2) {
            throw new EOFException();
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i6 = i2 - i3;
            b.d(i2, i3, i6);
            r rVar = this.f10494a;
            if (rVar == null) {
                min = -1;
            } else {
                min = Math.min(i6, rVar.f10523c - rVar.f10522b);
                int i7 = rVar.f10522b;
                AbstractC0464i.O(i3, i7, i7 + min, rVar.f10521a, bArr);
                int i8 = rVar.f10522b + min;
                rVar.f10522b = i8;
                this.f10495b -= min;
                if (i8 == rVar.f10523c) {
                    this.f10494a = rVar.a();
                    s.a(rVar);
                }
            }
            if (min == -1) {
                throw new EOFException();
            }
            i3 += min;
        }
        return bArr;
    }

    public final int hashCode() {
        r rVar = this.f10494a;
        if (rVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = rVar.f10523c;
            for (int i6 = rVar.f10522b; i6 < i3; i6++) {
                i2 = (i2 * 31) + rVar.f10521a[i6];
            }
            rVar = rVar.f10526f;
            kotlin.jvm.internal.i.b(rVar);
        } while (rVar != this.f10494a);
        return i2;
    }

    @Override // j5.g
    public final /* bridge */ /* synthetic */ g i(long j2) {
        N(j2);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // j5.h
    public final byte[] l() {
        return g(this.f10495b);
    }

    @Override // j5.g
    public final g m(int i2) {
        M(b.e(i2));
        return this;
    }

    @Override // j5.g
    public final /* bridge */ /* synthetic */ g n(int i2) {
        J(i2);
        return this;
    }

    public final i o(long j2) {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f10495b < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new i(g(j2));
        }
        i E5 = E((int) j2);
        D(j2);
        return E5;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[EDGE_INSN: B:40:0x00a4->B:37:0x00a4 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long p() {
        int i2;
        if (this.f10495b == 0) {
            throw new EOFException();
        }
        int i3 = 0;
        boolean z = false;
        long j2 = 0;
        do {
            r rVar = this.f10494a;
            kotlin.jvm.internal.i.b(rVar);
            int i6 = rVar.f10522b;
            int i7 = rVar.f10523c;
            while (i6 < i7) {
                byte b6 = rVar.f10521a[i6];
                if (b6 >= 48 && b6 <= 57) {
                    i2 = b6 - 48;
                } else if (b6 >= 97 && b6 <= 102) {
                    i2 = b6 - 87;
                } else if (b6 >= 65 && b6 <= 70) {
                    i2 = b6 - 55;
                } else {
                    if (i3 == 0) {
                        char[] cArr = k5.b.f10725a;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b6 >> 4) & 15], cArr[b6 & 15]})));
                    }
                    z = true;
                    if (i6 != i7) {
                        this.f10494a = rVar.a();
                        s.a(rVar);
                    } else {
                        rVar.f10522b = i6;
                    }
                    if (!z) {
                        break;
                    }
                }
                if ((j2 & (-1152921504606846976L)) != 0) {
                    f fVar = new f();
                    fVar.L(j2);
                    fVar.J(b6);
                    throw new NumberFormatException("Number too large: ".concat(fVar.C()));
                }
                j2 = (j2 << 4) | i2;
                i6++;
                i3++;
            }
            if (i6 != i7) {
            }
            if (!z) {
            }
        } while (this.f10494a != null);
        this.f10495b -= i3;
        return j2;
    }

    public final int q() {
        if (this.f10495b < 4) {
            throw new EOFException();
        }
        r rVar = this.f10494a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f10522b;
        int i3 = rVar.f10523c;
        if (i3 - i2 < 4) {
            return ((c() & 255) << 24) | ((c() & 255) << 16) | ((c() & 255) << 8) | (c() & 255);
        }
        byte[] bArr = rVar.f10521a;
        int i6 = i2 + 3;
        int i7 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i8 = i2 + 4;
        int i9 = i7 | (bArr[i6] & 255);
        this.f10495b -= 4;
        if (i8 == i3) {
            this.f10494a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f10522b = i8;
        }
        return i9;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.i.e(sink, "sink");
        r rVar = this.f10494a;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), rVar.f10523c - rVar.f10522b);
        sink.put(rVar.f10521a, rVar.f10522b, min);
        int i2 = rVar.f10522b + min;
        rVar.f10522b = i2;
        this.f10495b -= min;
        if (i2 == rVar.f10523c) {
            this.f10494a = rVar.a();
            s.a(rVar);
        }
        return min;
    }

    @Override // j5.w
    public final long s(f sink, long j2) {
        kotlin.jvm.internal.i.e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j6 = this.f10495b;
        if (j6 == 0) {
            return -1L;
        }
        if (j2 > j6) {
            j2 = j6;
        }
        sink.B(this, j2);
        return j2;
    }

    public final String toString() {
        long j2 = this.f10495b;
        if (j2 <= 2147483647L) {
            return E((int) j2).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f10495b).toString());
    }

    @Override // j5.g
    public final /* bridge */ /* synthetic */ g u(i iVar) {
        G(iVar);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.i.e(source, "source");
        int remaining = source.remaining();
        int i2 = remaining;
        while (i2 > 0) {
            r F2 = F(1);
            int min = Math.min(i2, 8192 - F2.f10523c);
            source.get(F2.f10521a, F2.f10523c, min);
            i2 -= min;
            F2.f10523c += min;
        }
        this.f10495b += remaining;
        return remaining;
    }

    @Override // j5.g
    public final /* bridge */ /* synthetic */ g x(String str) {
        O(str);
        return this;
    }

    public final short y() {
        if (this.f10495b < 2) {
            throw new EOFException();
        }
        r rVar = this.f10494a;
        kotlin.jvm.internal.i.b(rVar);
        int i2 = rVar.f10522b;
        int i3 = rVar.f10523c;
        if (i3 - i2 < 2) {
            return (short) (((c() & 255) << 8) | (c() & 255));
        }
        int i6 = i2 + 1;
        byte[] bArr = rVar.f10521a;
        int i7 = (bArr[i2] & 255) << 8;
        int i8 = i2 + 2;
        int i9 = (bArr[i6] & 255) | i7;
        this.f10495b -= 2;
        if (i8 == i3) {
            this.f10494a = rVar.a();
            s.a(rVar);
        } else {
            rVar.f10522b = i8;
        }
        return (short) i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, j5.u
    public final void close() {
    }

    @Override // j5.u, java.io.Flushable
    public final void flush() {
    }
}
